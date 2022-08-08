package ClassWork21072022;

import java.util.Scanner;

public class ClassTask1 {
    public static void main(String[] args) {
        System.out.print("Input string");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.print("Input one symdol");
        String s2 = sc.nextLine();
        char[] array = s1.toCharArray();
        char cim = s2.charAt(0);
        ClassTask1 t = new ClassTask1();
        int rez = t.countSymbols(array, cim);

        System.out.println("Количество вхождений" + rez);
    }

    public int countSymbols(char[] arr, char symbol) {
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == symbol) {
                num++;
            }
        }
        return num;
    }
}


