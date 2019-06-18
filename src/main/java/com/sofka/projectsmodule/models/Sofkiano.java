package com.sofka.projectsmodule.models;

import org.springframework.data.annotation.Id;

public class Sofkiano {
	@Id
	private String idSofkiano;
	private String nameSofkiano;
	private String chargeSofkiano;
	private String[] arraySkills;
	
	public Sofkiano(String idSofkiano , String nameSofkiano , String chargeSofkiano , String[] arraySkills) {
		this.idSofkiano = idSofkiano;
		this.nameSofkiano = nameSofkiano;
		this.chargeSofkiano = chargeSofkiano;
		this.arraySkills = arraySkills;
	}

	public String getIdSofkiano() {
		return idSofkiano;
	}
	
	public void setIdSofkiano(String idSofkiano) {
		this.idSofkiano = idSofkiano;
	}
	
	public String getNameSofkiano() {
		return nameSofkiano;
	}
	
	public void setNameSofkiano(String nameSofkiano) {
		this.nameSofkiano = nameSofkiano;
	}
	
	public String getChargeSofkiano() {
		return chargeSofkiano;
	}
	
	public void setChargeSofkiano(String chargeSofkiano) {
		this.chargeSofkiano = chargeSofkiano;
	}

	public String[] getArraySkills() {
		return arraySkills;
	}
	
	public void setArraySkills(String[] arraySkills) {
		this.arraySkills = arraySkills;
	}
}