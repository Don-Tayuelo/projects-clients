package com.sofka.projectsmodule.models;

import java.util.ArrayList;
import org.springframework.data.annotation.Id;
import com.sofka.projectsmodule.repository.ClientsRepository;

public class ProjectModel {
	
	@Id
	private String idClient;
	private String nameProject;
	private String description;
	private double hours;
	private double price;
	private ClientsRepository client;
	private ArrayList<TeamModel> teams;
	
	public ProjectModel(String idClient , String nameProject , String description , double hours , double price , ClientsRepository client , ArrayList<TeamModel> teams) {
		this.idClient = idClient;
		this.nameProject = nameProject;
		this.description = description;
		this.hours = hours;
		this.price = price;
		this.client = client;
		this.teams = teams;
	}
	
	public String getIdClient() {
		return idClient;
	}
	public void setidClient(String idClient) {
		this.idClient = idClient;
	}
	
	public String getNameProject() {
		return nameProject;
	}
	public void setNameProject(String nameProject) {
		this.nameProject = nameProject;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public ArrayList<TeamModel> getTeams() {
		return teams;
	}
	public void setTeams(ArrayList<TeamModel> teams) {
		this.teams = teams;
	}
	
	public String getNameClient() {
		return client.findById(idClient).get().getNameClient();
	}
}