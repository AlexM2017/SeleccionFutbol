package interfaces;

public class Masajista extends Persona implements Actividades {
	
	public boolean cremas;
		
	public boolean isCremas() {
		return cremas;
	}

	public void setCremas(boolean cremas) {
		this.cremas = cremas;
	}

	@Override
	public void dialogar() {
		// TODO Auto-generated method stub
		System.out.println("Indica Tratamiento");
		
	}

	@Override
	public void concentrarse() {
		// TODO Auto-generated method stub
		System.out.println("Se Focaliza en el mejor trataento para cada jugador ");
		
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
		
	}

	@Override
	public void viajar() {
		// TODO Auto-generated method stub
		System.out.println("Viaja con todo el Equipo");
	}

	@Override
	public void darMasaje() {
		// TODO Auto-generated method stub
		System.out.println("Da Masaje a los Jugadores");
		
	}


}
