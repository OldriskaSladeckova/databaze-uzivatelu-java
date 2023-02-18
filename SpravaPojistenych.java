/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.zaverecnyprojekt;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Olis
 */
public class SpravaPojistenych {
  
    public Databaze databaze;
    private final Scanner sc = new Scanner(System.in, "utf-8");

    public SpravaPojistenych() {
        databaze = new Databaze();
    }

    public void pridejPojisteneho() {
        System.out.println("pridejPojisteneho - pridavam");
        System.out.println("Zadejte jméno");
        String jmeno = sc.nextLine();
        System.out.println("Zadejte pří­jmení­: ");
        String prijmeni = sc.nextLine();
        System.out.println("Zadejte věk");
        int vek = Integer.parseInt(sc.nextLine());
        System.out.println("Zadejte telefonní­ číslo­");
        int telCislo = Integer.parseInt(sc.nextLine());

        databaze.pridejPojisteneho(jmeno, prijmeni, vek, telCislo);

    }

    public void vypisJednotliveZaznamy() {
        System.out.println("Zadejte vyhledavane jméno: ");
        String jmeno = sc.nextLine();
        System.out.println("Zadejte vyhledavane pří­jmení­: ");
        String prijmeni = sc.nextLine();

        ArrayList<Uzivatel> databazeJednohoUzivatele = databaze.najdiJednohoUzivatele(jmeno, prijmeni);
        System.out.println(databazeJednohoUzivatele.toString());
    }

    public void vypisVsechnyZaznamy() {
        ArrayList<Uzivatel> databazeUzivatelu = databaze.najdiVsechnyUzivatele();

        System.out.println("vypisVsechnyZaznamy pro vsechny uzivatele: ­" + databazeUzivatelu.toString());
    }
}
