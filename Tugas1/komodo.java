/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

/**
 *
 * @author HP
 */
public class komodo extends reptil {

    private String kemampuan;

    /**
     * @return the kemampuan
     */
    protected String getKemampuan() {
        return kemampuan;
    }

    /**
     * @param kemampuan the kemampuan to set
     */
    protected void setKemampuan(String kemampuan) {
        this.kemampuan = kemampuan;
    }
    public static void main(String[] args) {

        komodo komo = new komodo();
        komo.setJenisMakanan("daging");
        komo.setBerkembangBiak("bertelur");
        komo.setJumlahMata(2);
        komo.setCaraBerjalan("melata");
        komo.setJumlahKaki(4);
        komo.setKemampuan("gigitan mematikan");

        System.out.println("KOMODO");
        System.out.println("komodo adalah hewan yang termasuk pemakan " + komo.getJenisMakanan());
        System.out.println("memiliki jumlah kaki " + komo.getJumlahKaki());
        System.out.print("memiliki jumlah mata " + komo.getJumlahMata());
        System.out.println(", semua hewan reptil yang termasuk komodo mempunyai cara berjalan sendiri yaitu " + komo.getCaraBerjalan());
        System.out.println("komodo sendiri memiliki kemampuan " + komo.getKemampuan());
    }
}
