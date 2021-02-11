/* Levuze Irem GUNER - 160201006 - SEC2 -*/

import java.util.Scanner;

public class Problem1b {
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        System.out.println("Enter amount in Kurus");
        int kurus=scn.nextInt();

        if (kurus/25>0){
            System.out.println(kurus/25 + " 25 kurus you have");
            kurus-=kurus/25*25;
        }

        if (kurus/10>0){
            System.out.println(kurus/10 + " 10 kurus you have");
            kurus-=kurus/10*10;
        }

        if(kurus/5>0){
            System.out.println(kurus/5 + " 5  kurus you have");
            kurus-=kurus/5*5;
        }

        if(kurus/1>0){
            System.out.println(kurus/1 + " 1 kurus you have");
        }

    }
}
