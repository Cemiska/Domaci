package zadatak3;
/* Kreirati klasu AudioControl koja nasledjuje klasu Control i getere, setere i konstruktore. 
 * Ima atribut koji kaze da li se smanjuje ili pojacava zvuk (tipa boolean). 
 * Implementirati metodu izvrsi akciju tako sto pojaca ili smanjuje zvuk za 1. U opsegu od 0 do 100.
 */

public class AudioControl extends Control {

	private boolean zvuk;
	
	
	public AudioControl(boolean zvuk) {
		super();
		this.zvuk = zvuk;
	}

	public boolean getZvuk() {
		return zvuk;
	}

	public void setZvuk(boolean zvuk) {
		this.zvuk = zvuk;
	}

	@Override
	public void izvrsiAkciju(VideoPlayer vp) {
		
		if (zvuk = true) {
		if(vp.getJacinaZvuka() < 100)  {
			vp.setJacinaZvuka(vp.getJacinaZvuka() + 1);
		} else {
			vp.setJacinaZvuka(100);
		} 
	} else {
		if (vp.getJacinaZvuka() >= 0 && vp.getJacinaZvuka() <= 100) {
			vp.setJacinaZvuka(vp.getJacinaZvuka() - 1);
		} else {
			vp.setJacinaZvuka(0);
		}
	}
		
	}

	
}
