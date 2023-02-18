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
public class Databaze {

    public ArrayList<Uzivatel> databazeUzivatelu;
    public Scanner sc = new Scanner(System.in);
    public Uzivatel uzivatel;

    public Databaze() {
        databazeUzivatelu = new ArrayList<>();
    }

    public void pridejPojisteneho(String jmeno, String prijmeni, int vek, int telCislo) {

        System.out.println("jmeno: " + jmeno);
        System.out.println("prijmeni: " + prijmeni);
        System.out.println("vek: " + vek);
        System.out.println("telCislo: " + telCislo);
        databazeUzivatelu.add(new Uzivatel(jmeno, prijmeni, vek, telCislo));

    }

    public ArrayList<Uzivatel> najdiJednohoUzivatele(String jmeno, String prijmeni) {
        ArrayList<Uzivatel> nalezene = new ArrayList<>();

        for (Uzivatel user : databazeUzivatelu) {
            {
                if (user.getJmeno().equalsIgnoreCase(jmeno) || user.getJmeno().equalsIgnoreCase(jmeno)) {
                    System.out.println("nalezen uzivatel dle shody:");
                   nalezene.add(user);       
                }
            }
        }
        System.err.println("nenalezen zadny uzivatel dle shody");
        return nalezene;
    }

    public ArrayList<Uzivatel> najdiVsechnyUzivatele() {
        return databazeUzivatelu;
    }

}
