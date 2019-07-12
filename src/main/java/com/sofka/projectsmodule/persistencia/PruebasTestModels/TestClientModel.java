/*package com.sofka.projectsmodule.persistencia.PruebasTestModels;

import com.sofka.projectsmodule.controllers.ClientsController;
import com.sofka.projectsmodule.models.ClientModel;
import com.sofka.projectsmodule.models.ProjectModel;
import com.sofka.projectsmodule.persistencia.servicios.ClientsService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class TestClientModel {

    @InjectMocks
    private ClientsController controller;

    @Mock
    private ClientsService service;

    @Mock
    private ProjectModel project;

    @Mock
    private ArrayList<ProjectModel> projectList;


    @Before
    public void setUp() {
        service = Mockito.mock(ClientsService.class);
        project = new ProjectModel();
        projectList = new ArrayList<>();
    }

    @Test
    public void GetController(){

        List<ClientModel> Listclient = new ArrayList<>();
        ClientModel client = new ClientModel("3025","Sura","Otto",projectList);
        Listclient.add(client);

        Mockito.when(service.getClients()).thenReturn(Listclient);
        ResponseEntity<ClientModel> response = (ResponseEntity<ClientModel>) controller.getClients();

        Assert.assertEquals(response.getStatusCode(), HttpStatus.OK);
        Assert.assertEquals(Listclient, response.getBody());


    }

    @Test
    public void getController (){

        ClientModel client = new ClientModel("3025","Sura","Otto",projectList);

        ClientModel client2 = new ClientModel("3025","Sura","Otto",projectList);


    }

}
*/