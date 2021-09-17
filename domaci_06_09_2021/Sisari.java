package domaci;

// Sisari su kicmenjaci koje se razlikuju po boji dlake, nacinu ishrane (biljojedi, mesojedi, svastojedi), i covekovoj podeli na divlje i domace.

public class Sisari extends Kicmenjaci {

	private String bojaDlake;
	private String nacinIshrane;
	private String covekovaPodela;
	
	public Sisari(String vrsta, String naziv, String ishrana, String bojaDlake, String nacinIshrane,
			String covekovaPodela) {
		super(vrsta, naziv, ishrana);
		this.bojaDlake = bojaDlake;
		this.nacinIshrane = nacinIshrane;
		this.covekovaPodela = covekovaPodela;
	}

	public String getBojaDlake() {
		return bojaDlake;
	}

	public void setBojaDlake(String bojaDlake) {
		this.bojaDlake = bojaDlake;
	}

	public String getCovekovaPodela() {
		return covekovaPodela;
	}

	public void setCovekovaPodela(String covekovaPodela) {
		this.covekovaPodela = covekovaPodela;
	}

	public String getNacinIshrane() {
		return nacinIshrane;
	}

	@Override
	public String toString() {
		
		return super.toString() + "\nBoja dlake: " + this.bojaDlake + ", prema nacinu ishrane je: " + this.nacinIshrane 
								+ ", a po covekovoj podeli je " + this.covekovaPodela + " zivotinja.";
	}
	
	
	
	
	
	
}
