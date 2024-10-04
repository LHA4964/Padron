package dominio;
import java.util.ArrayList;

public class OficinaPadron{
	private ArrayList<Habitante> habitantesPadron = new
		ArrayList<>();
		public void annadir(Habitante habitante){
		habitantesPadron.add(habitante);
	}
	public ArrayList getHabitantesPadron(){
		return habitantesPadron;
	}
	public int calcularNumeroHabitantes(){
		int suma = 0;
		for(Habitante habitante : habitantesPadron){
		suma++;
		}
		return suma;
	}
}