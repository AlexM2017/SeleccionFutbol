package interfaces;

public class Futbolista extends Persona implements Actividades {
	
	public String posicion;
	
	public int numero;
	
	public boolean estado;
	
	
	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	@Override
	public void dialogar() {
		// TODO Auto-generated method stub
		System.out.println("Expone sus Motivos ");
		
	}

	@Override
	public void concentrarse() {
		// TODO Auto-generated method stub
		System.out.println("Debe Concentrarse");
		
	}

	@Override
	public void jugar() {
		// TODO Auto-generated method stub
		System.out.println("Juega los Partidos");
		
	}

	@Override
	public void entrenar() {
		// TODO Auto-generated method stub
		System.out.println("Entrana toda la Jornada");
		
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
		
	}

	
	
}
