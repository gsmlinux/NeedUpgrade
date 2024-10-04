package oo.heranca2;

public class Acer extends Notebook implements Upgrade {

	Acer(double processador, int memoriaRam) {
		super(processador, memoriaRam);
		setPadrao(3);
	}
	
	@Override
	public boolean upgrade() {
		if (processador >= 3.0 && memoriaRam >= 8) {
			return false;
		} else if (processador < 3.0 && memoriaRam < 8) {
			return true;
		} else {
			return true;
		}
	}
}
