import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    System.out.print("Informe o lado do quadrado : ");
    Scanner sc = new Scanner(System.in);

    int lado = sc.nextInt();
    int area = (lado * lado) * 2;

    sc.close();

    System.out.println("Resultado é igual : " + area);
    }
}
