package chuyendoifeetvameter;

public class ChuyenDoiFeetVaMeter {

    public static double feetToMeter(double feet){
        return 0.305*feet;
    }
    
    public static double meterToFeet(double meter){
        return 3.279*meter;
    }
    
    public static void main(String[] args) {
        System.out.printf("%-20s%s" , "Feet" , "Meter");
        System.out.printf("\t|\t");
        System.out.printf("%-20s%s","Meter","Feet");
        System.out.println("");
        System.out.println("-----------------------------------------------------------------");
        for (double i = 0; i < 10; i++) {
            System.out.printf("%-20s%s",(double)i+1,feetToMeter(i+1));
            System.out.printf("\t|\t");
            System.out.printf("%-20s%s",(double)i*5+20,meterToFeet(i*5+20));
            System.out.println("");
        }
    }
    
}
