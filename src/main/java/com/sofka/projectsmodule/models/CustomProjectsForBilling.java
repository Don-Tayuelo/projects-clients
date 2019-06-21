package com.sofka.projectsmodule.models;

import java.io.Serializable;


public class CustomProjectsForBilling implements Serializable {

	private static final long serialVersionUID = 1L;

	private String idProject;
	private String idClient;
	private String clientName;
	private String customerCity;
	private String projectName;
	private String projectDescription;
	private double projectHours;
	private double projectPrice;
	
	public CustomProjectsForBilling() {}

	public CustomProjectsForBilling(String idProject, String idClient, String clientName, String projectName,
			String customerCity, String projectDescription, double projectHours, double projectPrice) {
		this.idProject = idProject;
		this.idClient = idClient;
		this.clientName = clientName;
		this.customerCity = customerCity;
		this.projectName = projectName;
		this.projectDescription = projectDescription;
		this.projectHours = projectHours;
		this.projectPrice = projectPrice;
	}
	
	public CustomProjectsForBilling(ProjectModel projectModel) {
		this.idProject = projectModel.getIdProject();
		this.projectName = projectModel.getProjectName();
		this.projectDescription = projectModel.getProjectDescription();
		this.idClient = projectModel.getIdClient();
		this.clientName = projectModel.getClientName();
		this.customerCity = projectModel.getCustomerCity();
		this.projectHours = projectModel.getProjectHours();
		this.projectPrice = projectModel.getProjectPrice();
	}

	public String getIdProject() {
		return idProject;
	}

	public void setIdProject(String idProject) {
		this.idProject = idProject;
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

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	public double getProjectHours() {
		return projectHours;
	}

	public void setProjectHours(double projectHours) {
		this.projectHours = projectHours;
	}

	public double getProjectPrice() {
		return projectPrice;
	}

	public void setProjectPrice(double projectPrice) {
		this.projectPrice = projectPrice;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
}
