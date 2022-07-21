package ClassWork21072022;

public class Task2 {
    public static void main(String[] args) {
        int mas1[]=new  int[12];
        int max=0, index=0;
        for ( int i=0;i<12;i++){
            mas1[i]=(int)Math.floor(Math.random()*31)-15;
            System.out.print(mas1[i] + " ");

        }
        for (int i = 0; i < mas1.length; i++) {
            if(mas1[i]>max) {
                max=mas1[i];
                index=i;

            }
        }
        System.out.println("самое большое число "+max+" и индекс его последнего вхождения "+index);
    }
}
