/* Levuze Irem GUNER - 160201006 - SEC2 -*/

import java.util.Scanner;

public class Problem1a {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("please enter your score");
        double score=scn.nextDouble();

        if (score >= 60.0 && score<70) { System.out.println("Grade D");
        } else if (score >= 70.0 && score<80) { System.out.println("Grade C");
        } else if (score >= 80.0 && score<90) { System.out.println("Grade B");
        } else if (score >= 90.0) { System.out.println("Grade A");
        } else {
            System.out.println("Grade F");
        }
    }
}
