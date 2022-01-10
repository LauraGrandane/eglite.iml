package com.companyLaura;

import java.sql.SQLOutput;
import java.time.Clock;

public class Main {

    public static void main(String[] args) {

        // 10 ZVAIGZNES VIENĀ RINDĀ

        for (int m = 0; m < 10; m++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println();

        //4 RINDAS AR 10 ZVAIGZNĒM KATRĀ RINDĀ

        int a = 0;

        do {
            System.out.println("**********");
            a++;
        }
        while (a < 4);
        System.out.println();

        //EGLES KREISĀ PUSE

        int k = 0;
        k++;

        switch (k) {
            case 1:
                System.out.println("*");
            case 2:
                System.out.println("**");
            case 3:
                System.out.println("***");
            case 4:
                System.out.println("****");
            case 5:
                System.out.println("*****");
            break;
        }
        System.out.println();

        // EGLES LABĀ PUSE

        int g = 0;
        g++;

        switch (g) {
            case 1:
                System.out.println("    *");
            case 2:
                System.out.println("   **");
            case 3:
                System.out.println("  ***");
            case 4:
                System.out.println(" ****");
            case 5:
                System.out.println("*****");
                break;
        }
        System.out.println();

        // AK EGLĪTE, AK EGLĪTE

        int e = 0;
        e++;

        switch (e) {
            case 1:
                System.out.println("    *");
            case 2:
                System.out.println("   ***");
            case 3:
                System.out.println("  *****");
            case 4:
                System.out.println(" *******");
            case 5:
                System.out.println("*********");
                break;
        }


    }
}
