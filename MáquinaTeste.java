package oo.heranca2;

public class MáquinaTeste {
	
	public static void main(String[] args) {
		
		Acer acer = new Acer(4.0, 10);
		
		acer.overClock();
		acer.memoria();
		System.out.println(acer);
		System.out.println("PRECISA DE UPGRADE? >>> " + acer.upgrade());
		
		System.out.println("------------------------------------------------------");
		
		Dell dell = new Dell(3.0, 8);
		
		dell.overClock();
		dell.memoria();

		System.out.println(dell);
		System.out.println("PRECISA DE UPGRADE? >>> " + dell.upgrade());
		
		System.out.println("------------------------------------------------------");
		
		Positivo positivo = new Positivo(2.0, 2);
		
		positivo.overClock();
		positivo.memoria();
		
		System.out.println(positivo);
		System.out.println("PRECISA DE UPGRADE? >>> " + positivo.upgrade());
		
	}
	
}
