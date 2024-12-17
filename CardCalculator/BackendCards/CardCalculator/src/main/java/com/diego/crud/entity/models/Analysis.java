package com.diego.crud.entity.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "analisis")
public class Analysis {
	
	public Analysis(int iD_Analisis, int iD_Carta, String juego, String accion) {
		super();
		ID_Analisis = iD_Analisis;
		ID_Carta = iD_Carta;
		Juego = juego;
		Accion = accion;
	}

	@Id
    
	@JsonProperty("id_Analisis")
    @Column(name = "ID_Analisis")
    private int ID_Analisis;
	
    @JsonProperty("id_Carta")
    @Column(name = "ID_Carta")
    private int ID_Carta;

    @JsonProperty("juego")
    @Column(name = "Juego")
    private String Juego;

    @JsonProperty("accion")
    @Column(name = "Accion") 
    private String Accion;

    public Analysis() {}

	public int getID_Analisis() {
		return ID_Analisis;
	}

	public void setID_Analisis(int iD_Analisis) {
		ID_Analisis = iD_Analisis;
	}

	public int getID_Carta() {
		return ID_Carta;
	}

	public void setID_Carta(int iD_Carta) {
		ID_Carta = iD_Carta;
	}

	public String getJuego() {
		return Juego;
	}

	public void setJuego(String juego) {
		Juego = juego;
	}

	public String getAccion() {
		return Accion;
	}

	public void setAccion(String accion) {
		Accion = accion;
	}

	@Override
	public String toString() {
		return "Analysis [ID_Analisis=" + ID_Analisis + ", ID_Carta=" + ID_Carta + ", Juego=" + Juego + ", Accion="
				+ Accion + "]";
	}
	
}
