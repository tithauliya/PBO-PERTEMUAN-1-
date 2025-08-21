/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author HP
 */
public class Kaktus extends Tumbuhan {
    private boolean daunBerduri;

    /**
     * @return the daunberduri
     */
    protected boolean getDaunberduri() {
        return daunBerduri;
    }

    /**
     * @param daunberduri the daunberduri to set
     */
    protected void setDaunberduri(boolean daunberduri) {
        this.daunBerduri = daunberduri;
    }

    public static void main(String[] args) {
        Kaktus tustus = new Kaktus();
        tustus.setBerkembangBiak("generatif & vegetatif");
        tustus.setBernapas("stomata");
        tustus.setHabitat("gurun");
        tustus.setWarnabatang("hijau");
        
        tustus.setDaunberduri(true);
        
        System.out.println("perkembangan biak kaktus : " + tustus.getBerkembangBiak() );
        System.out.println("kaktus bernapas menggunakan : " + tustus.getBernapas());
        System.out.println("habitat kaktus berada di : " + tustus.getHabitat());
        System.out.println("warna batang kaktus adalah : " + tustus.getWarnabatang());
        System.out.println("apakah kaktus mempunyai daun yang berduri ? " + (tustus.getDaunberduri()? "Ya" : "Tidak" ));

    }

}
