package interfaces;

public class Entrenador extends Persona implements Actividades {

	public int grado;
		
	public int getGrado() {
		return grado;
	}

	public void setGrado(int grado) {
		this.grado = grado;
	}

	@Override
	public void dialogar() {
		// TODO Auto-generated method stub
		System.out.println("Ofrece un Discurso ");
		
	}

	@Override
	public void concentrarse() {
		// TODO Auto-generated method stub
		System.out.println("Se centra en sacar lo mejor del Equipo");
		
	}

	@Override
	public void jugar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void entrenar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dirigir() {
		// TODO Auto-generated method stub
		System.out.println("Dirige al Equipo");
		
	}

	@Override
	public void viajar() {
		// TODO Auto-generated method stub
		System.out.println("Viaja con todo el Equipo");
	}

	@Override
	public void darMasaje() {
		// TODO Auto-generated method stub
		
	}
	
}
