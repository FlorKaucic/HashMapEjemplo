package ejemplo;

import java.util.HashMap;
import java.util.Map.Entry;

public class Puntaje {
	HashMap<String, Integer> puntos = new HashMap<String, Integer>();
	
	public void agregar(String key, Integer value){
		puntos.put(key, (puntos.containsKey(key))?puntos.get(key)+value:value);
	}
	
	public void remover(String key){
		puntos.remove(key);
	}
	
	public boolean esta(String key){
		return puntos.containsKey(key);
	}
	
	public void mostrar(){
		System.out.println("\nJugadores y puntajes:");
		if(puntos.isEmpty())
			System.out.println("No hay ningun jugador actualmente.");
		for(Entry<String, Integer> e : puntos.entrySet())
			System.out.println("Jugador: "+e.getKey()+"\tPuntaje: "+e.getValue());
	}
	
}
