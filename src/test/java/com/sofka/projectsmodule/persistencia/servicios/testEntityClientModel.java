package com.sofka.projectsmodule.persistencia.servicios;


import com.sofka.projectsmodule.models.ClientModel;
import com.sofka.projectsmodule.models.ProjectModel;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class testEntityClientModel {

    private List<ProjectModel> projectList = new ArrayList<>();
    private ProjectModel projectModel = new ProjectModel("ds","metro","dd",22.2,22.2,"dd","dd",null);
    private ClientModel clientModel = new ClientModel("5520","Coordinadora","Otto", projectList);

    @Test
    public void testGetIdClient (){
        Assertions.assertThat(clientModel.getIdClient()).isEqualTo("5520");
    }

    @Test
    public void testSetIdClient(){
        clientModel.setIdClient("7070");
        Assertions.assertThat(clientModel.getIdClient()).isEqualTo("7070");

    }

    @Test
    public void testGetClientName (){
        Assertions.assertThat(clientModel.getClientName()).isEqualTo("Coordinadora");
    }

    @Test
    public void testSetClientName (){
        clientModel.setClientName("Sura");
        Assertions.assertThat(clientModel.getClientName()).isEqualTo("Sura");
    }

    @Test
    public void testGetProductOwner (){
        Assertions.assertThat(clientModel.getProductOwner()).isEqualTo("Otto");
    }

    @Test
    public void testSetProductOwner (){
        clientModel.setProductOwner("Andrea");
        Assertions.assertThat(clientModel.getProductOwner()).isEqualTo("Andrea");
    }

    @Test
    public void testGetProjectList (){
        projectList.add(projectModel);
        Assertions.assertThat(clientModel.getListProjects()).isEqualTo(projectList);
    }

    @Test
    public void testSetProjectList (){
        projectList.add(projectModel);
        clientModel.setListProjects(projectList);
        Assertions.assertThat(clientModel.getListProjects()).isEqualTo(projectList);
    }





}
