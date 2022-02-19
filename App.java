import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int numero;
        numero = input.nextInt();

        for(int i = 1; i <= numero; i++) {

            String result = new String(new char[i]).replace("\0", "*");
            System.out.println(String.format("%"+numero+"s", result));
        }
    }
}

