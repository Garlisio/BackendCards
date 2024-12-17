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
@Table(name = "cartas")
public class Card {
	
    public Card(int id_carta, int id_turno, String juego, String numero, String palo, boolean jugador) {
		super();
		ID_Carta = id_carta;
		ID_Turno = id_turno;
		Juego = juego;
		Numero = numero;
		Palo = palo;
		Jugador = jugador;
	}

	@Id
    
    @JsonProperty("id_Carta")
    @Column(name = "ID_Carta")
    private int ID_Carta;

	@JsonProperty("id_Turno")
    @Column(name = "ID_Turno")
    private int ID_Turno;

    @JsonProperty("juego")
    @Column(name = "Juego")
    private String Juego;

    @JsonProperty("numero")
    @Column(name = "Numero") 
    private String Numero;

    @JsonProperty("palo")
    @Column(name = "Palo")
    private String Palo;

    @JsonProperty("jugador")
    @Column(name = "Jugador")
    private boolean Jugador;

    public Card() {}

	public int getID_Carta() {
		return ID_Carta;
	}

	public void setID_Carta(int id_carta) {
		ID_Carta = id_carta;
	}

	public int getID_Turno() {
		return ID_Turno;
	}

	public void setID_Turno(int id_turno) {
		ID_Turno = id_turno;
	}

	public String getJuego() {
		return Juego;
	}

	public void setJuego(String juego) {
		Juego = juego;
	}

	public String getNumero() {
		return Numero;
	}

	public void setNumero(String numero) {
		Numero = numero;
	}

	public String getPalo() {
		return Palo;
	}

	public void setPalo(String palo) {
		Palo = palo;
	}

	public boolean isJugador() {
		return Jugador;
	}

	public void setJugador(boolean jugador) {
		Jugador = jugador;
	}

	@Override
	public String toString() {
		return "Card [ID_Carta=" + ID_Carta + ", ID_Turno=" + ID_Turno + ", Juego=" + Juego + ", Numero=" + Numero
				+ ", Palo=" + Palo + ", Jugador=" + Jugador + "]";
	}
	
}
