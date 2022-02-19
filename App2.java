import java.util.Scanner;

public class App2 {
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        String senha = input.nextLine();

        if(senha.length() >= 6) {
            System.out.println(0);

        } else {
            System.out.println(6-senha.length());

        }        
    }
}
