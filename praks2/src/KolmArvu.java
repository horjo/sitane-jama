
public class KolmArvu {

    static double korrutaKolmArvu(double a, double b, double c){
        return a*b*c;
    }
 
    static void valjasta(double a, double b, double c){
        System.out.println("Antud arvud: " + a + ", " + b + ", " + c);
    }
 
    public static void main(String[] args) {
        double x = 1.5;
        double y = 2.25;
        double z = 3;
        valjasta(x, y, z);
        System.out.println("Nende korrutis: " + korrutaKolmArvu(x, y, z));
    }
}
