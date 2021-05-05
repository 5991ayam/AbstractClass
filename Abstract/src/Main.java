
public class Main {

	public static void main(String[] args) {
	/*	
	WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
	womanGameCalculator.hesapla();
	womanGameCalculator.gameOver();	
	*/
	
	GameCalculator gameCalculatorWv= new WomanGameCalculator();
	GameCalculator gameCalculatorMan= new ManGameCalculator();
	GameCalculator gameCalculatorKids= new KidsGameCalculator();
	GameCalculator gameCalculatorOlder= new OlderGameCalculator();

	gameCalculatorOlder.hesapla();
	gameCalculatorWv.hesapla();
	gameCalculatorMan.hesapla();
	gameCalculatorWv.hesapla();
	gameCalculatorKids.hesapla();
	
	

	}

}
