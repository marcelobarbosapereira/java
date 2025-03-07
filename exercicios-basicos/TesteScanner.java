import java.util.Scanner;
public class TesteScanner {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("digite algo: ");
        String l = s.nextLine();
        s.close();
        System.out.println(l);
    }
}
