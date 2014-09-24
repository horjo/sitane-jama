
import java.io.ObjectInputStream.GetField;
import java.math.*;
import java.util.Scanner;

public class Main {
	
	static int meetod(int a, int b){
		return a+b;
	}
	
	static double meetod(double a){
		return Math.round(Math.pow(2, a));
	}
	
	static void meetod(String a, int b){
		for(int i=0; i<=b; i++){
			System.out.println(a);
		}
	}
	
	static int[] matkajad(int a, int b, int c){
		int[] kaalud = new int[a];
        for(int i=0;i<kaalud.length;i++){
        	kaalud[i] = (int)Math.round(Math.random()*b+c);
        }
		return kaalud;
	}
	
	static float harmooniline_keskmine(int[] massiiv){
		float summa = 0;
		for(int i=0; i<massiiv.length; i++){
			 summa += 1/massiiv[i];
		}
		return massiiv.length/summa;
	}
	
	static void kehamassiindeks(String kg, double pikkus){
		double kaal = Double.parseDouble(kg);
		double indeks = kaal/(pikkus*pikkus);
		if(indeks < 19){
			System.out.println("Söö rohkem");
		}
		if(19<indeks && indeks <=25){
			System.out.println("Sinu kaal on paras");
		}
		if(indeks>30){
			System.out.println("Kasva pikemaks");
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Tere maailm");
		
		int a = 2147483647;
		int b = 1;
		int c = 2;
		int d = 3;
		int e = 4;
		
		System.out.println("Arvude " + b + " ja " + c + " summa on " + (b + c));
		System.out.println("Arvude " + c + " ja " + d + " vahe on " + (c - d));
		System.out.println("Arvude " + d + " ja " + e + " korrutus on " + (d + e));
		System.out.println("Arvude " + e + " ja " + d + " jääk on " + (e%d));
		System.out.println("Arvude " + a + " ja " + b + " summa on " + (a + b));
		
		//kui sulud ära jätta
		System.out.println("Arvude " + b + " ja " + c + " summa on " + b + c);
		
		System.out.println(1-0.9);
		
		double reaalJuhuarv = Math.random()*5+15;
		long longJuhuarv = Math.round(Math.random()*5+15);
		System.out.println(reaalJuhuarv);
		System.out.println(longJuhuarv);
		
		//suvaline arv vahemikus mitte väiksem kui 5 aga väiksem kui 20
		int taisJuhuarv = (int)Math.round(Math.random()*5+15);
		System.out.println(taisJuhuarv);
		
		int valeJuhuarv = (int)Math.random()*5+15;
		System.out.println(valeJuhuarv);
		
		int arv = Math.getExponent(4.0);
		System.out.println(arv);
		
		double arv2 = Math.log(100.0);
		System.out.println(arv2);
		
		double arv3 = Math.max(2, 8);
		System.out.println(arv3);
		
		double arv4 = Math.pow(2.0, 4.0);
		System.out.println(arv4);
		
		System.out.println("E = " + Math.E);
		
		double pii = Math.PI;
		double r = 5.0;
        System.out.println("Ringi ümbermõõt: " + (2*pii*r));
        
        System.out.println(meetod(2,4));
        System.out.println(meetod(2.0));
        meetod("Tekst", 5);
        System.out.println("");
        
        //A5
        int[] kaalud = new int[10];
        for(int i=0;i<kaalud.length;i++){
        	kaalud[i] = (int)Math.round(Math.random()*51 + 60);
        	System.out.println(kaalud[i]);
        }
        
        int matkarv = 20;
        int[] kaal = matkajad(matkarv,51,60);
        for(int i=0; i<matkarv; i++){
        	System.out.println(kaal[i]);
        }
        
        /*
        for(int i : kaal){
        	System.out.println(kaal[i]);
        }
        */
        
        System.out.println("Suuremad arvud kui 80");
        int[] kaalud2 = new int[10];
        for(int i=0;i<kaalud2.length;i++){
        	kaalud2[i] = (int)Math.round(Math.random()*51 + 60);
        	if(kaalud2[i]>80){
        		System.out.println(kaalud2[i]);
        	}
        }
        
        System.out.println("Harmooniline keskmine");
        System.out.println(harmooniline_keskmine(kaal));
        
        //A6
        int[] jarj1 = {1, 3, 6};
        int[] jarj2;
        jarj2 = jarj1;
        System.out.println(jarj1[1]);
        System.out.println(jarj2[1]);
        jarj2[1]=4;
        System.out.println(jarj2[1]);
        System.out.println(jarj1[1]);
        
        //A7
        Scanner scan = new Scanner(System.in);
        System.out.println("Sisesta oma eesnimi: ");
        String nimi = scan.nextLine();
        System.out.println("Sisesta oma kaal: ");
        int kg = scan.nextInt();
        System.out.println("Sisesta oma pikkus meetrites: ");
        int pikkus = scan.nextInt();
        //System.out.println(kehamassiindeks(kg, pikkus));
       
        
	}

}