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
        System.out.println(viszgaeredmneyek(userInput));
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
                return "gratulállok! 100%";
            }
        eredmeny = "jeles";
        }
        return eredmeny;
    }
}
