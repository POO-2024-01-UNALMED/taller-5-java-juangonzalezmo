package gestion;
import java.util.ArrayList;
public class Zoologico {
	
	private String nombre;
	private String ubicacion;
	private static ArrayList<Zona> zonas = new ArrayList<>();
	
	
	public Zoologico(String nombre, String ubicacion) {
	
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		
	}

	public Zoologico(){}
	
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
	}
	
	public int cantidadTotalAnimales() {
		int i=0;
		for(Zona elemento: zonas ) {
			i= i + elemento.getLengthAnimales();
		}
		return i;
	}

	public String getNombre() {
		return nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public ArrayList<Zona> getZona() {
		return zonas;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public static void setZonas(ArrayList<Zona> zonas) {
		Zoologico.zonas = zonas;
	}
	
	
}
