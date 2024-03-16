package zooAnimales;
import java.util.ArrayList;
import gestion.Zona;

public class Pez extends Animal{
	
	private static ArrayList<Pez> listado = new ArrayList<>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
	}

	public Pez(){}
	
	public static int getNumber() {
		return listado.size();
	}
	
	public String movimiento() {
		return "nadar";
	}
	
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		salmones++;
		return new Pez(nombre,edad,"oceano",genero,"rojo",6);
	}
	
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		bacalaos++;
		return new Pez(nombre,edad,"oceano",genero,"gris",6);
	}
	
	public static int cantidadPeces() {
		return listado.size();
	}

	public static ArrayList<Pez> getListado() {
		return listado;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public int getCantidadAletas() {
		return cantidadAletas;
	}

	public static void setListado(ArrayList<Pez> listado) {
		Pez.listado = listado;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	
	
}
