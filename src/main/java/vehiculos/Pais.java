package vehiculos;

import java.util.ArrayList;

public class Pais {
	private String nombre;
	ArrayList<Fabricante> fabricantes= new ArrayList<>();
	private static ArrayList<Pais> paises= new ArrayList<>();
	public Pais(String nombre) {
		this.nombre=nombre;
		paises.add(this);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int VehiculosVendidos(){
		int retorno=0;
		for(Fabricante f:fabricantes) {
			retorno+=f.vehiculos.size();
		}
		return retorno;
	}
	public static Pais paisMasVendedor() {
		Pais ganador=null;
		if(!paises.isEmpty()) {
			ganador=paises.get(0);
			for(Pais p:paises) {
				if(p.VehiculosVendidos()>ganador.VehiculosVendidos()) {
					ganador=p;
				}
			}
		}
		return ganador;
	}

}
