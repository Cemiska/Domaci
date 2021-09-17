package domaci;

//Vozac je covek koji poseduje i zvanje (zanimanje -> sofer).

public class Vozac extends Covek{

	private String zvanje;

	public Vozac(String imePrezime, String zvanje) {
		super(imePrezime);
		this.zvanje = zvanje;
	}

	public String getZvanje() {
		return zvanje;
	}

}
