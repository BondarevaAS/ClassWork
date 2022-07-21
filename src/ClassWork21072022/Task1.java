package ClassWork21072022;
import java.util.Scanner;
public class Task1  {
    public static void main (String [] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println ("введите слово одной строкой");
        String input =  sc.nextLine();
        int count = 0;
        if (input.length () != 0) {
            count++;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ') {
                    count++;
                    System.out.println("вы ввели" +count+"слов");
                }
            }
        }


    }
}



