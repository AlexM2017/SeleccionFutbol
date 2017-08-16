package interfaces;

public class Aplicacion {

	public static void main(String[] args) {
		
		Futbolista jugador = new Futbolista();
		
		Entrenador entrenador = new Entrenador();
		
		Masajista masajista = new Masajista();
		
		System.out.println("Grandes de Salta");
		
		System.out.println(" ");

		masajista.setNombre("Grecia");
		masajista.setApellido("Castro");
		
		System.out.println("Masajista " + " -> " + masajista.getNombre() + " " + masajista.getApellido());
										 
		entrenador.setNombre("Jesus");
		entrenador.setApellido("Seijas");
		
		System.out.println("Entrenador " + " -> " + entrenador.getNombre() + " " + entrenador.getApellido());
				
		jugador.setNombre("Diego");
		jugador.setApellido("Ortiz");
		jugador.setNumero(33);
		
		System.out.println("Jugador " + " -> " + jugador.getNombre() + " " + jugador.getApellido());
		
		System.out.println(" ");
		
		System.out.println(entrenador.getNombre() + entrenador.getApellido() + " -> " );entrenador.dialogar();;
		
		System.out.println(jugador.getNombre() + jugador.getApellido() + " -> " );jugador.dialogar();
		
		System.out.println(masajista.getNombre() + masajista.getApellido() + " -> " );masajista.dialogar();
		
	
				

	}

}
