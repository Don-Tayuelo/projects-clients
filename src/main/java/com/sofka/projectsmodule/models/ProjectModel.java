package com.sofka.projectsmodule.models;

import java.io.Serializable;
import java.util.ArrayList;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "projects")
public class ProjectModel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String idProject;
	
	@Indexed(unique = true)
	private String projectName;
	
	private String projectDescription;
	private double projectHours;
	private double projectPrice;
	private String clientName;
	private String idClient;
	private ArrayList<Sofkiano> teamList;
	
	public ProjectModel() {}
	
	public ProjectModel(String idClient , String nameProject , String projectDescription , double projectHours 
			, double projectPrice , String clientName , ArrayList<Sofkiano> teamList) {
		this.idClient = idClient;
		this.projectName = nameProject;
		this.projectDescription = projectDescription;
		this.projectHours = projectHours;
		this.projectPrice = projectPrice;
		this.clientName = clientName;
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

	public ArrayList<Sofkiano> getListTeams() {
		return teamList;
	}

	public void setListTeams(ArrayList<Sofkiano> listTeams) {
		this.teamList = listTeams;
	}
}