package oo.heranca2;

public class Notebook {

	protected double processador;
	protected int memoriaRam;
	private double padrao = 1;

	Notebook(double processador, int memoriaRam) {
		this.processador = processador;
		this.memoriaRam = memoriaRam;
	}

	public void overClock() {
		if (processador >= 3.0) {
			processador += getPadrao();
		} else if (processador < 2.5) {
			processador -= getPadrao();
		}
	}

	public void memoria() {
		if (memoriaRam <= 2.0) {
			System.out.println("Joga fora kkkk!");
		} else if (memoriaRam > 2.0 && memoriaRam < 4.0) {
			System.out.println("Ainda tem salvação!");
		} else if (memoriaRam >= 4.0 && memoriaRam <= 8.0) {
			System.out.println("Cabe um upgrade legal!");
		} else {
			System.out.println("Nem precisa de upgrade!!");
		}
	}

	public double getPadrao() {
		return padrao;
	}

	public void setPadrao(double padrao) {
		this.padrao = padrao;
	}

	public String toString() {
		return "A velocidade do seu processador é de: " + processador + "GHz " + "e possui " + memoriaRam + "GB de memória";
	}
}
