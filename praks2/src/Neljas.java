
public class Neljas {
	static int kontroll(int a, int b){
		return a+b;
	}
	static double kontroll(double c){
		double ymar = Math.round(c);
		return ymar*ymar;
	}
	static void kontroll(String d, int e){
		while(e>0){
			System.out.println(d);
			e-=1;
		}
			
		}
	

	public static void main(String[] args) {
		System.out.println(kontroll(2,3));
		System.out.println(kontroll(3.5));
		kontroll("kukka",3);
		
		
		


		


	}

}
