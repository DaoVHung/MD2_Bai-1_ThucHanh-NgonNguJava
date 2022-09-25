import java.util.Scanner;

public class ThucHanh4 {
    public static void main(String[] args) {
        System.out.println(" Linear Equation Resolver ");
        System.out.println(" Given a equation 'A * X + B = C , Please enter constans: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter a: ");
        double a = scanner.nextDouble();
        System.out.println(" enter b : ");
        double b = scanner.nextDouble();
        System.out.println(" enter c : ");
        double c = scanner.nextDouble();
        if(a!=0){
            double x = ( c - b )/a ;
            System.out.println(" equation pass with x = " + x);
        }else{
            if(b==c){
                System.out.println(" the solution í all x !");
            } else {
                System.out.println(" No solution");
            }
        }
    }
}
