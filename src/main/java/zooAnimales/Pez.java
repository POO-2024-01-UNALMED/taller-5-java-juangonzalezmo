package zooAnimales;

import gestion.Zona;

public class Pez extends Animal{
	
	private Pez[] listado;
	public int salmones;
	public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	public Pez(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona[] zona, Pez[] listado,
			int salmones, int bacalaos, String colorEscamas, int cantidadAletas) {
		super(totalAnimales, nombre, edad, habitat, genero, zona);
		this.listado = listado;
		this.salmones = salmones;
		this.bacalaos = bacalaos;
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
	}
	
	public Pez(){}
}
