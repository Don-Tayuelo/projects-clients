package com.sofka.projectsmodule.models;

import java.io.Serializable;
import java.util.ArrayList;
<<<<<<< HEAD


=======
import java.util.List;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
>>>>>>> master
import org.springframework.data.annotation.Id;

<<<<<<< HEAD
=======

@Document(collection = "projects")
public class ProjectModel implements Serializable {
>>>>>>> master

public class ProjectModel implements Serializable{

	
	
	private static final long serialVersionUID = 1L;

	@Id
	private String idProject;
<<<<<<< HEAD
	
	private String projectName;
=======

	@NotBlank(message = "El campo - projectName - no puede ser vac�o.")
	@Indexed(unique = true)
	@Size(min = 3, max = 40)
	private String projectName;

	@NotBlank(message = "El campo - projectDescription - no puede ser vac�o.")
>>>>>>> master
	private String projectDescription;

	private double projectHours;

	private double projectPrice;

	@NotBlank(message = "El campo - clientName - no puede ser vac�o.")
	private String clientName;

	@NotBlank(message = "El campo - customerCity - no puede ser vac�o.")
	private String customerCity;

	@NotBlank(message = "El campo - idClient - no puede ser vac�o.")
	private String idClient;

	@NotNull(message = "Debes asignar Sofkianos al proyecto")
	private List<Sofkiano> teamList;

	public ProjectModel() {
	}

	public ProjectModel(String idClient, String nameProject, String projectDescription, double projectHours,
			double projectPrice, String clientName, String customerCity, List<Sofkiano> teamList) {
		this.idClient = idClient;
		this.projectName = nameProject;
		this.projectDescription = projectDescription;
		this.projectHours = projectHours;
		this.projectPrice = projectPrice;
		this.clientName = clientName;
		this.customerCity = customerCity;
		this.teamList = teamList;
	}

	public ProjectModel(String nameProject, String projectDescription, double projectHours,
						double projectPrice, String clientName, String customerCity, List<Sofkiano> teamList) {
		this.projectName = nameProject;
		this.projectDescription = projectDescription;
		this.projectHours = projectHours;
		this.projectPrice = projectPrice;
		this.clientName = clientName;
		this.customerCity = customerCity;
		this.teamList = teamList;
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

	public List<Sofkiano> getListTeams() {
		return teamList;
	}

<<<<<<< HEAD
   public void setListTeams(ArrayList<Sofkiano> listTeams) {
		this.teamList = listTeams;
=======
	public void setListTeams(List<Sofkiano> teamList) {
		this.teamList = teamList;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
>>>>>>> master
	}
}