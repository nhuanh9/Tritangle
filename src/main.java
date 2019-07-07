import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ dài màu và 3 cạnh của tam giác");
        String color = scanner.nextLine();
        double a= scanner.nextDouble();
        double b= scanner.nextDouble();
        double c= scanner.nextDouble();
        Tritangle tritangle = new Tritangle(a,b,c,color);
        System.out.println(tritangle.toString());
    }
}
