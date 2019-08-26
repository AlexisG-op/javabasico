package com.senati.ddw041;

public class celular {
	//Atributos de la clase
	int id;
	String modelo;
	float precio;
	//Constructor se emplea al momento de crear el objeto
	//Este constructor recibe automáticamente los parámetros de inicio
	public celular(int id, String modelo, float precio) {
		super();
		this.id = id;
		this.modelo = modelo;
		this.precio = precio;
	}
	//Constructor que no recibe parámetros
	public celular() {
		super();
	}
	//Getters & Setters
	//----------------------------------------------------
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	//----------------------------------------------------
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	//----------------------------------------------------
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	//String
	@Override
	public String toString() {
		return "Celular [id=" + id + ", modelo=" + modelo + ", precio=" + precio + "]";
	}
	
}
