import java.util.ArrayList;
import java.util.List;

//la raccolta di tutti gli esami

public class Libretto {

	private List<Voto> voti;
	 
	
	public Libretto() {
		
		this.voti = new ArrayList<Voto> ();
		
	}
	
	public void add(Voto v) //passa un parametro 
	{
		voti.add(v);	
	}
	
	
}
