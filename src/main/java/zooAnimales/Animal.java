package zooAnimales;
import gestion.*;

public class Animal {
	
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona; 
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		totalAnimales++;
	}
	
	public Animal(){totalAnimales++;}
	
	public static String totalPorTipo() {
		return "Mamiferos: " + Mamifero.getListado().size()+
				"\nAves: " + Ave.getListado().size()+
				"\nReptiles: " + Reptil.getListado().size()+
				"\nPeces: " + Pez.getListado().size()+
				"\nAnfibios: " + Anfibio.getListado().size();
				
	}
	public String toString() {
		String statement=null;
		if(zona==null) {
			statement= "Mi nombre es "+ nombre+", tengo una edad de "+ edad+", habito en "+ habitat+ " y mi genero es "+genero;
		}
		else {
			statement= "Mi nombre es "+ nombre+", tengo una edad de "+ edad+", habito en "+ habitat+ " y mi genero es "+genero+", la zona en la que me ubico es "+zona.getNombre()+" en el "+zona.getZoo().getNombre();
		}
		
		return statement;
	}
	
	public String movimiento() {
		return "desplazarse";
	}

	public static int getTotalAnimales() {
		return totalAnimales;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public String getHabitat() {
		return habitat;
	}

	public String getGenero() {
		return genero;
	}

	public Zona getZona() {
		return zona;
	}

	public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}

	

	
	
	
}
