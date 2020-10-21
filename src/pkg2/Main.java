package pkg2;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Grafik Fungsi Kuadrat");
        System.out.println("Dalam Persamaan");
        System.out.println("ax^2 + bx + c = 0");
        
        float a, b, c;
        
        System.out.print("a = ");
        a = input.nextFloat();  //input a
        System.out.print("b = ");
        b = input.nextFloat();  //input b
        System.out.print("c = ");
        c = input.nextFloat();  //input c
        
        // Titik potong sumbu x
        
        double u1, u2, d, D, D1, D2, sD, x1, x2;
        
        D1 = 4 * a * c;
        D2 = b * b;
        D = D2 - D1;
        
        String x1final, x2final;
        
        if(D > 0){  //jika D real
            
            sD = Math.sqrt(D);  //akar D
            
            u1 = sD - b;
            u2 = 0 - b - sD;
            
            d = 2 * a;
            
            x1 = u1 / d;
            x2 = u2 / d;
            
            x1final = (Double.toString(x1));
            x2final = (Double.toString(x2));
            
        } else{
            
            double nD = 0 - D;
            sD = Math.sqrt(nD);
            d = 2 * a;
            
            double x1real, x1imaginer, x2real, x2imaginer;
            
            x1real = -b;
            x1imaginer = sD / d;
            x2real = -b / d;
            x2imaginer = -sD / d;
            
            x1final = (Double.toString(x1real) + " + " + Double.toString(x1imaginer) + " i");
            x2final = (Double.toString(x2real) + " + " + Double.toString(x2imaginer) + " i");
            
        }
        // Titik potong sumbu y
        
        float y = c;
        
        // Koordinat nilai maksimum (x)
        
        double xp, yp, d2, nD;
        
        xp = -b / d;
        d2 = 2 * d;
        nD = 0 - D;
        yp = nD / d2;
        
        
        
        System.out.print("Grafik tersebut memotong sumbu x di ("+x1final+",0)"+" dan di ("+x2final+",0), ");
        System.out.print("Memotong sumbu y di (0,"+y+"), ");
        System.out.println("Dan memiliki nilai optimum di ("+xp+","+yp+")");
        System.out.println("Atau: ");
        System.out.println("x1 = "+x1final);
        System.out.println("x2 = "+x2final);
        System.out.println("(xp,yp) = "+"("+xp+","+yp+")");
        System.out.println("y = "+y);
    }
  
}
