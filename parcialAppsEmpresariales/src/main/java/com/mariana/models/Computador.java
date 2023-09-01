package com.mariana.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Computador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String marca;
	private String modelo;
	private String ram;
	private String procesador;
	private String sistemaOperativo;
	private int duracionBateria;
	private double precio;
	private int mesesGarantia;
	
	

	public Computador(Long id, String marca, String modelo, String ram, String procesador, String sistemaOperativo,
			int duracionBateria, double precio, int mesesGarantia) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.ram = ram;
		this.procesador = procesador;
		this.sistemaOperativo = sistemaOperativo;
		this.duracionBateria = duracionBateria;
		this.precio = precio;
		this.mesesGarantia = mesesGarantia;
	}



	public Computador() {
		super();
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public String getRam() {
		return ram;
	}



	public void setRam(String ram) {
		this.ram = ram;
	}



	public String getProcesador() {
		return procesador;
	}



	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}



	public String getSistemaOperativo() {
		return sistemaOperativo;
	}



	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}



	public int getDuracionBateria() {
		return duracionBateria;
	}



	public void setDuracionBateria(int duracionBateria) {
		this.duracionBateria = duracionBateria;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public int getMesesGarantia() {
		return mesesGarantia;
	}



	public void setMesesGarantia(int mesesGarantia) {
		this.mesesGarantia = mesesGarantia;
	}

	
	
	
	
}
