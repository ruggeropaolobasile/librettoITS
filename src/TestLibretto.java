import java.time.LocalDate;

//uso questa classe di test per vedere effettivamente cosa 
/* separiamo la classe di test dalla classe di business per accorgermi meglio
/* di quali sono le funzionalita che il programma espone
 * posso avere piu programmi di test per testare le varie funzionalita
 *
 * uso del debug
 */

public class TestLibretto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Libretto libr = new Libretto();
		
		libr.add( new Voto(30,"Analisi I", LocalDate.of(2017, 1, 15) ));
		libr.add( new Voto(21,"Analisi II", LocalDate.of(2018, 1, 25) ));
		libr.add( new Voto(25,"Fisica I", LocalDate.of(2017, 6, 10) ));
		libr.add( new Voto(28,"Fisica II", LocalDate.of(2017, 9, 15) ));
		libr.add( new Voto(18,"Geometria", LocalDate.of(2018, 9, 3) ));
		libr.add( new Voto(20,"Economia", LocalDate.of(2017, 9, 1) ));
		libr.add( new Voto(25,"Ricerca Operativa", LocalDate.of(2018, 6, 5) ));
		libr.add( new Voto(24,"Complementi di Economia", LocalDate.of(2018, 1, 15) ));
		libr.add( new Voto(25,"Logistica", LocalDate.of(2019, 1, 15) ));
/*debug*/  libr.add( new Voto(27,"Programmazione a Oggetti I", LocalDate.of(2017, 1, 15) ));
		
		
	}

}
