import java.util.Scanner;

public class ThucHanh6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println(" Nhap nam ban muon kiem tra :");
        year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(" %d La phai nam nhuan " + year);
                } else {
                    System.out.println(" %d Ko phai nam nhuan" + year);
                }
            } else {
                System.out.println("%d La nam nhuan" + year);
            }
        } else {
            System.out.println("%d Ko phai la nam nhuan");
        }
    }
}
