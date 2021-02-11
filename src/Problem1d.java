/* Levuze Irem GUNER - 160201006 - SEC2 -*/

import java.util.Scanner;

public class Problem1d {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter your annual income before tax in TL (0 to quit)");
        double income=scn.nextDouble();

        while (income==0) {
            System.out.println("see you next time!");
            break;
        }


        if (income>=12 || income<=12600 ){

            System.out.println("your tax yearly is " + (income*15)/100 + " per month " + ((income*15)/100)/12);
        }
        else if (income>=12601 || income<=30000 ){

            System.out.println("your tax yearly is " + (income*20)/100 + " per month " + ((income*20)/100)/12);
        }
        else if (income>=30001 || income<=110000 ){

            System.out.println("your tax yearly is " + (income*27)/100 + " per month " + ((income*27)/100)/12);
        }

        else{

            System.out.println("your tax yearly is " + (income*35)/100 + " per month " + ((income*35)/100)/12);
        }

    }
}
