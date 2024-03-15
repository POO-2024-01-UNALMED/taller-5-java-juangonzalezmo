package zooAnimales;
import gestion.*;
public class Animal {
	
	private int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona[] zona ;
	public Animal(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona[] zona) {
		super();
		this.totalAnimales = totalAnimales;
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;
	}
	
	public Animal(){}
}
