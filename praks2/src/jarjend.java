
public class jarjend {

	public static void main(String[] args) {
		int[] a = new int[5];
		a[0] = 10;
		a[1] = 9;
		a[2] = 12;
		a[3] = 11;
		a[4] = 8;

		for (int i = 0; i < a.length; i++) {
		    //System.out.println(a[i]);
		}
		for (int elem : a){
		     //System.out.println(elem);
		}
		
		double [] b = new double[10];

		b[0] = Math.random()*60+50;
		b[1] = Math.random()*60+50;
		b[2] = Math.random()*60+50;
		b[3] = Math.random()*60+50;
		b[4] = Math.random()*60+50;
		b[5] = Math.random()*60+50;
		b[6] = Math.random()*60+50;
		b[7] = Math.random()*60+50;
		b[8] = Math.random()*60+50;
		b[9] = Math.random()*60+50;
		
		for (double kaal : b){
			System.out.println(kaal);
		}
	}
}
