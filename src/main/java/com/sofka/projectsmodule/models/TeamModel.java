package com.sofka.projectsmodule.models;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;

public class TeamModel {
	@Id
	private String idTeam;
	private ArrayList<Sofkiano> listSofkiano;
	
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