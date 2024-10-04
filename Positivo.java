package oo.heranca2;

public class Positivo extends Notebook implements Upgrade {
	
	Positivo(double processador, int memoriaRam) {
		super(processador, memoriaRam);
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
