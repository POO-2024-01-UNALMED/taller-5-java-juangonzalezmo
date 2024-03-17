package zooAnimales;
import java.util.ArrayList;
import gestion.Zona;

public class Mamifero extends Animal {
	
	private static ArrayList<Mamifero> listado = new ArrayList<>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
		listado.add(this);
	}

	public Mamifero(){listado.add(this);}
	
	public static int getNumber() {
		return listado.size();
	}
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		caballos++;
		return new Mamifero(nombre,edad, "pradera", genero, true, 4);
		
	}
	
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		leones++;
		return new Mamifero(nombre,edad, "selva", genero, true, 4);
		
	}
	
	public static int cantidadMamiferos() {
		return listado.size();
	}

	public static ArrayList<Mamifero> getListado() {
		return listado;
	}

	public boolean isPelaje() {
		return pelaje;
	}

	public int getPatas() {
		return patas;
	}

	public static void setListado(ArrayList<Mamifero> listado) {
		Mamifero.listado = listado;
	}

	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	
}
