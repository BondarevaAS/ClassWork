package ClassWork21072022;

import java.util.Scanner;

public class ClassWork2 {
    private String stOfNumbers(){
        String st = "";
        for (int i = 1; i < 1000; i++){
            if (st.length() >= 1000) {
                break;
            }
            else {
                st= st+i;
            }
        }
        return st;
    }
    public static void main(String[] args) {
        ClassWork2 t = new ClassWork2();
        String s = t.stOfNumbers();
        System.out.println(s);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите индекс");
        int ind= sc.nextInt();
        System.out.print(s.charAt(ind));
    }
}
