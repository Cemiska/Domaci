package zadatak3;

import java.util.ArrayList;

/* U glavnom programu kreirati video player i izvrsiti neke akcije nad njim
 U glavnom programu kreirati listu akcija i izvrsiti ih nad istim playerom
*/

public class GlavniProgram {

	public static void main(String[] args) {
		
		VideoPlayer vp1 = new VideoPlayer(250, 36, 99, 720);
		vp1.stampanje();

		TimeControl t1 = new TimeControl(true);
		t1.izvrsiAkciju(vp1);
		vp1.stampanje();
		
		AudioControl a1 = new AudioControl(false);
		a1.izvrsiAkciju(vp1);
		System.out.println("");
		vp1.stampanje();
		
		QualityOptimizerControl q1 = new QualityOptimizerControl(20);
		q1.izvrsiAkciju(vp1);
		System.out.println("");
		vp1.stampanje();
		
	/*	ArrayList akcija = new ArrayList();
		akcija.add(t1);
		akcija.add(a1);
		akcija.add(q1);
		
		for(int i = 0; i< akcija.size(); i++) {
		akcija.get(i);
	}
		System.out.println("");
		vp1.stampanje(); 
	*/
}
}
