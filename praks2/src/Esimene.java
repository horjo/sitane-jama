
public class Esimene {


	
	public static void main(String[] args) {
		int a = 2147483647;
		int b = 1;
		int c = 2;
		int d = 10;
		int e = 11;
		System.out.println(1-0.9);
		System.out.println("Arvude " + a + " ja " + b + " summa on " + (a + b));
		
		double juhuarv = Math.random();
		//System.out.println(juhuarv);
		double reaalJuhuarv = Math.random()*5+15;
		//System.out.println(reaalJuhuarv);
		long longJuhuarv = Math.round(Math.random()*5+15);
		//System.out.println(longJuhuarv);
		int taisJuhuarv = (int)Math.round(Math.random()*5+15);
		//System.out.println(taisJuhuarv);
		int valeJuhuarv = (int)Math.random()*5+15;
		//System.out.println(valeJuhuarv);
		
		double x = 5.5;
		double y = 45;
		double suurem = Math.max(x, y);
		//System.out.println(suurem);
		double jama = Math.rint(x);
		System.out.println(jama);
	}

}
