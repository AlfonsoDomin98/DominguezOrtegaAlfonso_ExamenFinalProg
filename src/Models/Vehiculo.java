package Models;

public class Vehiculo {
	private String Matricula;
	private ListaVehiculos <Vehiculo> Lista;

	public Vehiculo(String matricula) {
		super();
		Matricula = matricula;
		this.Lista = Lista;
	}
	
	public String getMatricula() {
		return Matricula;
	}

	public void setMatricula(String matricula) {
		Matricula = matricula;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Vehiculo) {
			Vehiculo aux = (Vehiculo) obj;
			return this.getMatricula().equals(aux.getMatricula());
		}
		return false;
	}
}
