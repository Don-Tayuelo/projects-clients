package com.sofka.projectsmodule.models;

import java.io.Serializable;
import java.util.ArrayList;



import org.springframework.data.annotation.Id;

public class ClientModel implements Serializable{

	
	private static final long serialVersionUID = 1L;

	@Id
	private String idClient;
	
	private String clientName;
	private String productOwner;
	private ArrayList<Object> listProjects;
	

    public ClientModel() {
    	
    }


	public ClientModel(String id, String clientName, String productOwner, ArrayList<Object> listProjects) {
		this.idClient = id;
		this.clientName = clientName;
		this.productOwner = productOwner;
		this.listProjects = listProjects;
	}

	public String getIdClient() {
		return idClient;
	}

	public void setIdClient(String idClient) {
		this.idClient = idClient;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getProductOwner() {
		return productOwner;
	}

	public void setProductOwner(String productOwner) {
		this.productOwner = productOwner;
	}

	public ArrayList<Object> getListProjects() {
		return listProjects;
	}

	public void setListProjects(ArrayList<Object> listProjects) {
		this.listProjects = listProjects;
	}
}