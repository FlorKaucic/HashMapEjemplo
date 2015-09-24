package ejemplo;


public class Ejemplo {

	public static void main(String[] args) {
		// Hacer un hashmap de algo, agregar, eliminar, mostrar algo, y ver si existe.
		Puntaje puntaje = new Puntaje();
		
		puntaje.agregar("Juan", 5);
		System.out.println("Esta Juan? "+puntaje.esta("Juan"));
		puntaje.agregar("Juan", 4);
		System.out.println("Esta Diego? "+puntaje.esta("Diego"));
		puntaje.agregar("Diego", 7);
		puntaje.agregar("Juan", 5);
		puntaje.mostrar();
		puntaje.remover("Juan");
		puntaje.mostrar();
		puntaje.remover("Diego");
		puntaje.mostrar();
	}

}
