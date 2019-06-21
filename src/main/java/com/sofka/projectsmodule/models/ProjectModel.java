package com.sofka.projectsmodule.models;

import java.io.Serializable;
import java.util.ArrayList;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "projects")
public class ProjectModel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String idProject;

	@NotBlank(message = "El campo - projectName - no puede ser vacío.")
	@Indexed(unique = true)
	@Size(min = 3, max = 40)
	private String projectName;

	@NotBlank(message = "El campo - projectDescription - no puede ser vacío.")
	private String projectDescription;

	private double projectHours;

	private double projectPrice;

	@NotBlank(message = "El campo - clientName - no puede ser vacío.")
	private String clientName;

	@NotBlank(message = "El campo - customerCity - no puede ser vacío.")
	private String customerCity;

	@NotBlank(message = "El campo - idClient - no puede ser vacío.")
	private String idClient;

	@NotNull(message = "Debes asignar Sofkianos al proyecto")
	private ArrayList<Sofkiano> teamList;

	public ProjectModel() {
	}

	public ProjectModel(String idClient, String nameProject, String projectDescription, double projectHours,
			double projectPrice, String clientName, String customerCity, ArrayList<Sofkiano> teamList) {
		this.idClient = idClient;
		this.projectName = nameProject;
		this.projectDescription = projectDescription;
		this.projectHours = projectHours;
		this.projectPrice = projectPrice;
		this.clientName = clientName;
		this.customerCity = customerCity;
		this.teamList = teamList;

		System.out.println("Probando constructor" + projectHours);
	}

	public String getIdProject() {
		return idProject;
	}

	public void setIdProject(String idProject) {
		this.idProject = idProject;
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

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getIdClient() {
		return idClient;
	}

	public void setIdClient(String idClient) {
		this.idClient = idClient;
	}

	public ArrayList<Sofkiano> getListTeams() {
		return teamList;
	}

	public void setListTeams(ArrayList<Sofkiano> teamList) {
		this.teamList = teamList;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
}