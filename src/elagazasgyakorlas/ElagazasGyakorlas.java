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
        boolean kupon = true;
        System.out.println(atm(userInput));
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
        } else {
            if (diak) {
                return "20% kedvezmény, felnőtt 2200Ft";
            }
            return "felnőtt 2200Ft";
        }
    }
    
    public static String etterem(int input, boolean discount) {
        String menu = "";
        
        // Lehetne switch is!
        // switch (input) {
        // case (szam):/ { vlmi }
        // default: vlmi
        //}
        if (input == 1) {
            menu = "Hamburger menü, 2200ft";
        } else if (input == 2) {
            menu = "Pizza menü, 2500Ft";
        } else if (input == 3) {
            menu = "Saláta menü";
        } else {
            return "nem helyes szám";
        }
        if (discount) {
            menu += " +10% kedvezmény";
        }
        return menu;
    }
    
    public static String parkolas(int hours) {
        if (hours > 5) { 
            return "5 óránál magasabb értéket nem lehet beírni!";
        }
        switch (hours) {
            case (1):
                return "500Ft";
                //break;
            case (2): 
                return "900Ft";
            case (3):
                return "1300Ft";
            default:
                return "1500Ft";
        }
    }
    
    public static int atm(int amount) {
        int bank = 5000;
        if (amount < 0) {
            System.out.println("helytelen érték");
            return bank;
        } else if (amount > bank) {
            System.out.println("nincs elég fedezet");
            return bank;
        } else if (amount % 1000 != 0) {
            System.out.println("Helytelen érték");
            return bank;
        } else {
            return bank - amount;
        }
    }
    public static String haromszog(int a, int b, int c) {
        if ((a + b) > c && (a + c > b && (b + c) > a)) {
            if (a == b && a == c && b == c) {
                return "egyenlő oldalú";
            } else if (a == b || b == c) {
                return "egyenlő szárú";
            } else {
                return "általános háromszog";
            }
        }
        return "nem";
    }
}
