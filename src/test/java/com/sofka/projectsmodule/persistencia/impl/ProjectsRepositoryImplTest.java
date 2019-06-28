package com.sofka.projectsmodule.persistencia.impl;

import com.sofka.projectsmodule.models.ProjectModel;
import com.sofka.projectsmodule.models.Sofkiano;
import com.sofka.projectsmodule.persistencia.ProjectModelRepository;
import com.sofka.projectsmodule.persistencia.servicios.ProjectsService;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;


@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class ProjectsRepositoryImplTest {

    @Mock
    private ProjectModelRepository projectsRepository;

    @Mock
    private ProjectsService projectsService;

    @Mock
    private Sofkiano sofkiano;

    @Mock
    private ArrayList<Sofkiano> sofkianosList;

    @Before
    public void setup (){
        projectsService = new ProjectsRepositoryImpl(projectsRepository);
        sofkiano = new Sofkiano();
        sofkianosList = new ArrayList<>();
    }

    @Test
    public void testGetAllProjects(){
        List<ProjectModel> projectsList = new ArrayList<>();
        ProjectModel project = new ProjectModel();
        projectsList.add(project);

        when(projectsRepository.findAll()).thenReturn(projectsList);

        Assertions.assertThat(projectsService.getAllProjects()).isEqualTo(projectsList);
    }

    @Test
    public void addProjectTest() {
        ProjectModel projectModel = new ProjectModel("Sura", "Sura", 3, 200, "Sura"
                ,"Medellin", sofkianosList);

        when(projectsRepository.save(projectModel)).thenReturn(projectModel);

        assertEquals(projectModel, projectsService.addProject(projectModel));
    }

    @Test
    public void putProjectTest() {
        sofkianosList.add(sofkiano);

        ProjectModel projectModel = new ProjectModel("1", "Sura", "Sura", 3, 200, "Sura"
                , "Medellin", sofkianosList);

        ProjectModel projectModel2 = new ProjectModel("1", "Nueva EPS", "Sura", 3, 200, "Sura"
                , "Medellin", sofkianosList);

        when(projectsRepository.existsById(projectModel.getIdProject())).thenReturn(true);

        assertEquals(true,projectsService.putProject(projectModel.getIdProject(),projectModel));
        assertNotEquals(false,projectsService.putProject(projectModel.getIdProject(),projectModel2));
    }

    @Test
    public void deleteSingleProjectTest() {
        String _id = "1";

        when(projectsRepository.existsById(_id)).thenReturn(true);


        assertEquals(true, projectsService.deleteSingleProject(_id));
        assertNotEquals(false, projectsService.deleteSingleProject(_id));
    }

    @Test
    public void deleteAllProjectsTest() {
        projectsRepository.deleteAll();
        verify(projectsRepository, times(1)).deleteAll();
    }
}
