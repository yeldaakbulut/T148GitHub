package p02;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {

        int a=128;
        int b=17;

        System.out.println(a+b);

        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi= scanner.nextInt();

        if (sayi %2==0){
            System.out.println("Girdiginiz sayi bir cift sayidir");
        }else {
            System.out.println("Girdiginiz sayi tektir");
        }


    }

}
