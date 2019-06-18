package com.sofka.projectsmodule.models;

import org.springframework.data.annotation.Id;

public class Sofkiano {
	
	@Id
	private String idSofkiano;
	
	private String sofkianoName;
	private String sofkianoCharge;
	private String[] arraySkills;
	
	public Sofkiano(String idSofkiano , String sofkianoName , String sofkianoCharge , String[] arraySkills) {
		this.idSofkiano = idSofkiano;
		this.sofkianoName = sofkianoName;
		this.sofkianoCharge = sofkianoCharge;
		this.arraySkills = arraySkills;
	}

	public String getIdSofkiano() {
		return idSofkiano;
	}
	
	public void setIdSofkiano(String idSofkiano) {
		this.idSofkiano = idSofkiano;
	}

	public String getSofkianoName() {
		return sofkianoName;
	}

	public void setSofkianoName(String sofkianoName) {
		this.sofkianoName = sofkianoName;
	}

	public String getSofkianoCharge() {
		return sofkianoCharge;
	}

	public void setSofkianoCharge(String sofkianoCharge) {
		this.sofkianoCharge = sofkianoCharge;
	}

	public String[] getArraySkills() {
		return arraySkills;
	}

	public void setArraySkills(String[] arraySkills) {
		this.arraySkills = arraySkills;
	}
}