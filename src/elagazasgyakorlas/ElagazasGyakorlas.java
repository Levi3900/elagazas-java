/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package elagazasgyakorlas;
import java.util.Scanner;
/**
 *
 * @author KovácsLevente(Szf_9e
 */
public class ElagazasGyakorlas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        boolean diakigazolvany = true;
        System.out.println(mozi(userInput, diakigazolvany));
    }
    public static String viszgaeredmneyek(int szam) {
        String eredmeny = "";
        if (szam < 40) {
            eredmeny = "elégtelen";
        } else if (szam <= 50) {
            eredmeny = "elégséges";
        } else if (szam <= 66) {
            eredmeny = "közepes";
        } else if (szam <= 84) {
            eredmeny = "jó";
        } else {
            if (szam == 100) {
                eredmeny = "gratulállok 100%!!";
                return eredmeny;
            }
        eredmeny = "jeles";
        }
        return eredmeny;
    }
    
    public static String homerseklet(int num) {
        if (num <= 0) {
            if (num == 0) {
                return "pontosan 0 fok van!";
            }
            return "fagy";
        } else if (num <= 7) {
            return "hideg";
        } else if (num <= 15) {
            return "kellemes";
        } else if (num <= 25) {
            return "meleg";
        } else {
            return "forró";
        }
    }
    
    public static String mozi(int age, boolean diak) {
        if (age <= 5) {
            return "ingyenes";
        } else if (age <= 13) {
            return "gyerek jegy, 1200Ft";
        } else if (age <= 17 && diak) {
            return "diák, 1600Ft";
        } else if (age > 18) {
            if (diak) {
                return "20% kedvezmény, felnőtt 2200Ft";
            }
            return "felnőtt 2200Ft";
        }
    }
}
