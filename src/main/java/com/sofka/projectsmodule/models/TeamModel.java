package com.sofka.projectsmodule.models;

import java.io.Serializable;
import java.util.ArrayList;

import org.springframework.data.annotation.Id;

public class TeamModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String idTeam;
	private ArrayList<Sofkiano> listSofkiano;	
	public TeamModel() {}
	
	public TeamModel(String idTeam , ArrayList<Sofkiano> listSofkiano) {
		this.idTeam = idTeam;
		this.listSofkiano = listSofkiano;
	}

	public String getIdTeam() {
		return idTeam;
	}
	public void setIdTeam(String idTeam) {
		this.idTeam = idTeam;
	}

	public ArrayList<Sofkiano> getListSofkiano() {
		return listSofkiano;
	}
	public void setListSofkiano(ArrayList<Sofkiano> listSofkiano) {
		this.listSofkiano = listSofkiano;
	}
}