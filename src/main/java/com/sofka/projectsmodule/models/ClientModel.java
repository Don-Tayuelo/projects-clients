package com.sofka.projectsmodule.models;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;

public class ClientModel {
	@Id
	private int idClient;
	private String nameClient;
	private String productOwner;
	private ArrayList<ProjectModel> projects;

	
	public ClientModel(int idClient, String nameClient, String productOwner, ArrayList<ProjectModel> projects) {
		this.idClient = idClient;
		this.nameClient = nameClient;
		this.productOwner = productOwner;
		this.projects = projects;
	}

	public int getidClient() {
		return idClient;
	}

	public void setidClient(int idClient) {
		this.idClient = idClient;
	}

	public String getNameClient() {
		return nameClient;
	}

	public void setName(String name) {
		this.nameClient = name;
	}

	public String getProductOwner() {
		return productOwner;
	}

	public void setProductOwner(String productOwner) {
		this.productOwner = productOwner;
	}

	public ArrayList<ProjectModel> getProjects() {
		return projects;
	}

	public void setProjects(ArrayList<ProjectModel> projects) {
		this.projects = projects;
	}
}