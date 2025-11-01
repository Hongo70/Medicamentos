package com.ejemplo.apiejem.model;

public class Medicamento {
	
	private String clave;
	private String nombre;
	private double precio;
	private int existencia;

	public Medicamento(String clave, String nombre, double precio, int existencia) {
		this.clave = clave;
		this.nombre = nombre;
		this.precio = precio;
		this.existencia = existencia;
	}
	
	public String getClave() {return clave;}
	public void setClave(String clave) {this.clave = clave;}

	public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

	public double getPrecio() {return precio;}
	public void setPrecio(double precio) {this.precio = precio;}

	public int getExistencia() {return existencia;}
	public void setExistencia(int existencia) {this.existencia = existencia;}
}
