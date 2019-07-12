package com.sofka.projectsmodule.persistencia.servicios;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.List;

import com.sofka.projectsmodule.persistencia.impl.ClientsServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import org.springframework.boot.test.context.SpringBootTest;


import com.sofka.projectsmodule.models.ClientModel;
import com.sofka.projectsmodule.models.ProjectModel;
import com.sofka.projectsmodule.persistencia.ClientModelRepository;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class testImpleService {


    @Mock
    private ArrayList<ProjectModel> projectList;

    @InjectMocks
    private ClientsServiceImpl ClientImpService;

    @Mock
    private ClientModelRepository ClientRepository;

    private  final ClientModel clientModel = new ClientModel("5520","Coordinadora","Otto", projectList);

    private final List<ClientModel> clientList = new ArrayList<>();

    @Before
    public void setUp() {
        projectList = new ArrayList<>();

    }

    @Test
    public void amountClients() {

        clientList.add(clientModel);

        when(ClientRepository.findAll())
                .thenReturn(clientList);

        Assertions.assertThat(ClientImpService.getClients().size()).isEqualTo(1);
    }

    @Test
    public void GetAllClients(){

        clientList.add(clientModel);
        when(ClientRepository.findAll()).thenReturn(clientList);
        Assertions.assertThat(ClientImpService.getClients()).isEqualTo(clientList);
    }

    @Test
    public void saveClients() {

        when(ClientRepository.save(clientModel))
                .thenReturn(clientModel);

        assertEquals(clientModel, ClientImpService.addClient(clientModel));
    }

    @Test
    public void deleteClientById() {

        String Id = clientModel.getIdClient();
        ClientImpService.deleteClient(Id);
        verify(ClientRepository,times(1)).deleteById(Id);
    }

    @Test
    public void testDeleteClients() {

        ClientImpService.deleteClients();
        verify(ClientRepository,times(1)).deleteAll();
    }

    @Test
    public void getfinById() {

        clientModel.setIdClient("22");
        Assertions.assertThat(ClientRepository.findById("22").equals(clientModel));
    }

    @Test
    public void searchClientFindById() {

        when(ClientRepository.findById(clientModel.getIdClient())).thenReturn(java.util.Optional.of(clientModel));
        assertEquals((java.util.Optional.of(clientModel)),ClientImpService.findById(clientModel.getIdClient()));

    }

    @Test
    public void searchClientFindByName() {

        clientList.add(clientModel);
        when(ClientRepository.findByClientName(clientModel.getClientName())).thenReturn((clientList));
        assertEquals(clientList,ClientImpService.findByClientName(clientModel.getClientName()));

    }

    @Test
    public void findByNmae() {

        clientList.add(clientModel);
        when(ClientRepository.findByClientName(clientModel.getClientName())).thenReturn((clientList));
        assertEquals(clientList,ClientImpService.findByClientName(clientModel.getClientName()));

    }

    @Test
    public void putClients() {

        when(ClientRepository.save(clientModel))
                .thenReturn(clientModel);

        assertEquals(clientModel, ClientImpService.edit(clientModel));
    }





}
