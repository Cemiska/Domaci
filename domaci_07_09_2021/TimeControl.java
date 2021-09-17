package zadatak3;

/*Kreirati klasu TimeControl koja nasledjuje klasu Control i konstruktore, 
 * ima atribut koji kaze na koju stranu pomera trenutno vreme videa (tipa boolean), 
 * implementira metodu izvrsi akciju tako sto pomeri trenutno vreme videa za 15s unapred ili unazad u zavisnosti od atributa. 
 * Veoma je bitno da se ne izadje van granica videa.
 */

public class TimeControl extends Control{

	private boolean unapred;
	
	
	@Override
	public void izvrsiAkciju(VideoPlayer vp) {
		
		if(unapred=true) {
			if(vp.getTrenutnoVreme() < vp.getDuzinaVidea() - 15) {
				vp.setTrenutnoVreme(vp.getTrenutnoVreme() + 15);
			} else {
				vp.setTrenutnoVreme(vp.getDuzinaVidea());
			} 
		} else {
			if (vp.getTrenutnoVreme() > 15) {
				vp.setTrenutnoVreme(vp.getTrenutnoVreme() - 15);
			} else {
				vp.setTrenutnoVreme(0);
			}
		}
	}


	public TimeControl(boolean unapred) {
		super();
		this.unapred = unapred;
	}

	public boolean getUnapred() {
		
		
		return unapred;
	}

	public void setUnapred(boolean unapred) {
		this.unapred = unapred;
	}

	
}
