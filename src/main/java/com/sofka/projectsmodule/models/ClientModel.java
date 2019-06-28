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
<<<<<<< HEAD
	private List<ProjectModel> listProjects;
	
	public ClientModel() {
		
	}
    

	public ClientModel(String id, String clientName, String productOwner ,List<ProjectModel> listProjects) {
		this.idClient = id;
		this.clientName = clientName;
		this.productOwner = productOwner;
	    this.listProjects = listProjects;
=======
	private String customerCity;
	

	private ArrayList<Object> listProjects;
	
	public ClientModel() {}

	public ClientModel(String id, String clientName, String productOwner, String customerCity, ArrayList<Object> listProjects) {
		this.idClient = id;
		this.clientName = clientName;
		this.productOwner = productOwner;
		this.customerCity = customerCity;
		this.listProjects = listProjects;
>>>>>>> master
	}

	public String getIdClient() {
		return idClient;
	}

	public void setIdClient(String idClient) {
		this.idClient = idClient;
	}

	public String getCustomerName() {
		return clientName;
	}

	public void setCustomerName(String customerName) {
		this.clientName = customerName;
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
	
	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
}