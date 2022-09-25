import java.util.Scanner;

public class ThucHanh7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println(" Nhap so can nang cua ban ( kg )");
        weight = scanner.nextDouble();
        System.out.println(" Nhap chieu cao cua ban ( m ) ");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.printf("-20s%s", "bmi", "Inter...\n");
        if (bmi < 18)
            System.out.printf("%-20s%s", bmi, "Hoi gay");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "binh thuong");
        else if ( bmi < 30)
            System.out.printf("%-20.2f%s", bmi, "hoi beo");
        else
            System.out.printf("%-20.2f%s", bmi, "beo qua");
    }
}
