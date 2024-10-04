package oo.heranca2;

public class Dell extends Notebook implements Upgrade{

	Dell(double processador, int memoriaRam) {
		super(processador, memoriaRam);
		setPadrao(2);
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
