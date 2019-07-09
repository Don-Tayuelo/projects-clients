package com.sofka.projectsmodule.persistencia.servicios;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import com.sofka.projectsmodule.persistencia.impl.ClientsServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import org.springframework.boot.test.context.SpringBootTest;


import com.sofka.projectsmodule.models.ClientModel;
import com.sofka.projectsmodule.models.ProjectModel;
import com.sofka.projectsmodule.persistencia.ClientModelRepository;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class ServicioTest {

    @Mock
    private ProjectModel project;

    @Mock
    private ArrayList<ProjectModel> projectList;

    @Mock
    private ClientsServiceImpl ClientImpService;

    @Mock
    private ClientModelRepository ClientRepository;

    @Before
    public void setUp() {
        ClientImpService = new ClientsServiceImpl(ClientRepository);
        project = new ProjectModel();
        projectList = new ArrayList<>();

    }

    @Test
    public void amountClients() {

        ArrayList<ClientModel> clienteList = new ArrayList<>();
        ClientModel cli = new ClientModel("5520","Coordinadora","Otto", projectList);
        clienteList.add(cli);

        when(ClientRepository.findAll())
                .thenReturn(clienteList);

        assertEquals(1, ClientImpService.getClients().size());
    }

    @Test
    public void saveClients() {

        ClientModel client = new ClientModel("3025","Sura","Otto",projectList);

        when(ClientRepository.save(client))
                .thenReturn(client);

        assertEquals(client, ClientImpService.addClient(client));
    }

    @Test
    public void deleteClientById() {

        String Id ="5d166";

        ClientImpService.deleteClient(Id);
        verify(ClientRepository,times(1)).deleteById(Id);

    }

    @Test
    public void testEliminarTodosProducto() {
        ClientRepository.deleteAll();
        verify(ClientRepository,times(1)).deleteAll();
    }
}
