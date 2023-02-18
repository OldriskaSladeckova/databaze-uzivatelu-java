/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.zaverecnyprojekt;

/**
 *
 * @author Olis
 */
public class Uzivatel {
    public String jmeno;
    public String prijmeni;
    public int vek;
    public int telCislo;
 
    
    public Uzivatel(String jmeno , String prijmeni, int vek, int telCislo){
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telCislo = telCislo;
    }
     public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }
    
    public String getPrijmeni(){
        return prijmeni;
    }
    
    public void setPrijmeni(String prijmeni){
        this.prijmeni = prijmeni;
    }

    
    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }
    
    public int getTelCislo(){
        return telCislo;
    }
    
    public void setTelCislo(int telCislo){
        this.telCislo = telCislo;
    }

    
    @Override
    public String toString(){
       return "jemeno: " + jmeno + " " + "prijmeni: " + prijmeni + " " + "vek: " + vek + " " + "telCislo: " + telCislo;
    }
}
