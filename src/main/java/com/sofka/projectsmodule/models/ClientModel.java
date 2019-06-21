package com.sofka.projectsmodule.models;

import java.io.Serializable;
import java.util.ArrayList;

import org.springframework.data.annotation.Id;

public class ClientModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String idClient;
	
	private String customerName;
	private String productOwner;
	private String customerCity;

	private ArrayList<Object> listProjects;
	
	public ClientModel() {
		
	}

	public ClientModel(String id, String clientName, String productOwner, String customerCity, ArrayList<Object> listProjects) {
		this.idClient = id;
		this.customerName = clientName;
		this.productOwner = productOwner;
		this.customerCity = customerCity;
		this.listProjects = listProjects;
	}

	public String getIdClient() {
		return idClient;
	}

	public void setIdClient(String idClient) {
		this.idClient = idClient;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
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
	
	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
}