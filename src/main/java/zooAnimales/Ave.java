package zooAnimales;

import gestion.Zona;

public class Ave extends Animal{
	
	private Ave listado[];
	public int halcones;
	public int aguilas;
	private String colorPlumas;
	public Ave(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona[] zona, Ave[] listado,
			int halcones, int aguilas, String colorPlumas) {
		super(totalAnimales, nombre, edad, habitat, genero, zona);
		this.listado = listado;
		this.halcones = halcones;
		this.aguilas = aguilas;
		this.colorPlumas = colorPlumas;
	}
	
	public Ave(){}
}
