package gestion;
import zooAnimales.*;
public class Zona {
	
	private String nombre;
	private Zoologico[] zoo = new Zoologico[1];
	private Animal [] animales;
	
	public Zona(String nombre, Zoologico[] zoo, Animal[] animales) {

		this.nombre = nombre;
		this.zoo = zoo;
		this.animales = animales;
	}
	
	public Zona(){}
	
	
}