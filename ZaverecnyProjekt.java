/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package cz.itnetwork.zaverecnyprojekt;

import java.util.Scanner;

/**
 *
 * @author Olis
 */
public class ZaverecnyProjekt {

    public static void main(String[] args) {
     
// nepouzivat Windows-1250, ale utf-8
        
        Scanner sc = new Scanner(System.in, "utf-8");
        SpravaPojistenych spravaPojistenych = new SpravaPojistenych();

        String volba = "";
        // hlavní cyklus
        while (!volba.equals("4")) {
            System.out.println("====================");
            System.out.println("Databáze pojištěných");
            System.out.println("====================");

            System.out.println("Seznam pojistenych");
            System.out.println("Vyberte akci");
            System.out.println("1.Pridat noveho pojisteneho");
            System.out.println("2.Vyhledat pojisteneho");
            System.out.println("3.Vypsat vsechny pojistene");
            System.out.println("4.konec");

            System.out.println("Zadejte požadovanou číslici: ");
            volba = sc.nextLine();
            System.out.println();

            // reakce na volbu
            switch (volba) {

                case "1":
                    spravaPojistenych.pridejPojisteneho();
                    break;
                case "2":
                    spravaPojistenych.vypisJednotliveZaznamy();
                    break;
                case "3":
                    spravaPojistenych.vypisVsechnyZaznamy();
                    break;
                case "4":
                    System.out.println("Libovolnou klávesou ukončíte program...");
                    break;
                default:
                    System.out.println("Neplatná volba, stiskněte libovolnou klávesu a opakujte volbu.");
                    break;
            }
        }
    }
}
