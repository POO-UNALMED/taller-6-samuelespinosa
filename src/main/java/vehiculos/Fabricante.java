package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	private String  nombre;
	private Pais pais;
	private static ArrayList<Fabricante> fabricantes= new ArrayList<>();
	ArrayList<Vehiculo> vehiculos= new ArrayList<>();
	public Fabricante(String nombre,Pais pais){
		this.nombre=nombre;
		this.pais=pais;
		Fabricante.fabricantes.add(this);
		this.pais.fabricantes.add(this);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public static Fabricante fabricaMayorVentas() {
		Fabricante ganadora=null;
		if(!fabricantes.isEmpty()){
			ganadora=fabricantes.get(0);
		}
		for(Fabricante f:fabricantes) {
			if(f.vehiculos.size()>ganadora.vehiculos.size()) {
				ganadora=f;
			}
		}
		return ganadora;
	}
}
