import java.util.Scanner;

    public class hipotenus {

        public static void main(String[]args) {
        // değişken tanımları
        /* int a, b;
        double c;

        Scanner input = new Scanner(System.in);

        System.out.println("1. dik kenar uzunluğu giriniz ");
        a = input.nextInt();
            System.out.println("2. dik kenar uzunluğu giriniz");
            b = input.nextInt();

            c = Math.sqrt((a*a) + (b*b));

            System.out.println("Hipotenüs " + c );*/

        int a, b, c;
        double u,alan;

            Scanner input = new Scanner(System.in);

            System.out.println("üçgenin 1. kenar uzunluğu");
            a = input.nextInt();
            System.out.println("Üçggenin 2. kenar uzunluğu");
            b = input.nextInt();
            System.out.println("üçgenin 3. kenar uzunluğu");
            c = input.nextInt();

            // üçhen çevresi = 2u

            u = (a+b+c) / 2;

                    alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

            System.out.println("Üçgenin alanı " + alan);
        }
}
