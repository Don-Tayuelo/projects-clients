package com.sofka.projectsmodule.models;

import java.io.Serializable;

import java.util.List;

import org.springframework.data.annotation.Id;

public class ClientModel implements Serializable{

	
	private static final long serialVersionUID = 1L;

	@Id
	private String idClient;
	private String clientName;
	private String productOwner;
	private List<ProjectModel> listProjects;
	
	public ClientModel() {
		
	}
    

	public ClientModel(String id, String clientName, String productOwner ,List<ProjectModel> listProjects) {
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

	public List<ProjectModel> getListProjects() {
		return listProjects;
	}

	public void setListProjects(List<ProjectModel> listProjects) {
		this.listProjects = listProjects;
	}
}