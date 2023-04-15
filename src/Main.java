import java.util.Scanner;

//Realizar un programa que pida una frase y el programa deberá mostrar la frase con un
//        espacio entre cada letra. La frase se mostrará así: H o l a.
public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        String fraseIngresada = scann.nextLine();

        for (int i = 0 ;i < fraseIngresada.length(); i++){

            System.out.print(fraseIngresada.charAt(i) + " ");

        }
    }
}