/* creata la classe 
 * inserisco getter e setter
 *
 *aggiungo con tasto destro l'override di tostring
 *
 *
 *
 *
 */		


import java.time.LocalDate;

public class Voto {
	
	private int voto;
	private String corso ;
	private LocalDate data;

	public Voto(int voto, String corso, LocalDate data) {
		// TODO Auto-generated constructor stub
		super();
		this.voto=voto;
		this.corso=corso;
		this.data=data;		
	}
	
	public int getVoto()
	{
		return voto;
	}
	public void setVoto(int voto)
	{
		this.voto=voto;
	}
		
	public void setCorso(String corso)
	{
		this.corso=corso;
	}
	public String getCorso()
	{
		return corso;
	}
	
	public void setData(LocalDate data)
	{
		this.data=data;
	}
	public LocalDate getData()
	{
		return data;
	}

	@Override
	public String toString() {
		return String.format("Voto [voto=%s, corso=%s, data=%s]", voto, corso,	data);
	}
	
	

}
