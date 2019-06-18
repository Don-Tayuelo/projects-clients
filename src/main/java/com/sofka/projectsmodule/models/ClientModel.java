package com.sofka.projectsmodule.models;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;

public class ClientModel {
	@Id
	private int idClient;
	private String nameClient;
	private String productOwner;
	private ArrayList<ProjectModel> listProjects;

	public ClientModel(int idClient, String nameClient, String productOwner, ArrayList<ProjectModel> listProjects) {
		this.idClient = idClient;
		this.nameClient = nameClient;
		this.productOwner = productOwner;
		this.listProjects = listProjects;
	}

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public String getNameClient() {
		return nameClient;
	}

	public void setNameClient(String nameClient) {
		this.nameClient = nameClient;
	}

	public String getProductOwner() {
		return productOwner;
	}

	public void setProductOwner(String productOwner) {
		this.productOwner = productOwner;
	}

	public ArrayList<ProjectModel> getListProjects() {
		return listProjects;
	}

	public void setListProjects(ArrayList<ProjectModel> listProjects) {
		this.listProjects = listProjects;
	}
}