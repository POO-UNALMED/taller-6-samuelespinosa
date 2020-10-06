package vehiculos;

public class Camion extends Vehiculo{
	private int ejes;
	static int Cmion;
	public Camion(String placa, String nombre, int precio, int peso,Fabricante fabricante,int ejes) {
		super(placa,2,80, nombre, precio, peso,"4x2", fabricante);
		this.ejes=ejes;
		Cmion++;
	}

	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	
	
	
}
