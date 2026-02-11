import java.util.ArrayList;
import java.util.List;

public class Galgo extends Thread implements Corredor{
	
	private String nombre;
	private long tiempoCarrera;
	
	private static List<String> clasificacion = new ArrayList<>();
	
	public Galgo(String nombre, long tiempoCarrera) {
		this.nombre = nombre;
		this.tiempoCarrera = tiempoCarrera;
		
		
		
	}
	@Override
	public String getNombre(){
		return nombre;
	}
	@Override
	public void correr(){
		try {
			Thread.sleep(tiempoCarrera);
		} catch (InterruptedException e) {
			System.out.println(nombre + "fue interrumpido");
		}
	}
	
	@Override
	public void run() {
		correr();
		synchronized(Galgo.class) {
			clasificacion.add(nombre);
			int puesto = clasificacion.size();
			System.out.println(nombre + " ha llegado en posición " + puesto);
		}
	}
	
	public static List<String> getClasificacion(){
		return clasificacion;
	}
	
	
	
	
	
	

	
	

}
