/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3;

/**
 *
 * @author HP
 */
public class Gubernur extends Provinsi {

    private String namaGubernur;
    private int masaJabatan;

    /**
     * @return the namaGubernur
     */
    protected String getNamaGubernur() {
        return namaGubernur;
    }

    /**
     * @param namaGubernur the namaGubernur to set
     */
    protected void setNamaGubernur(String namaGubernur) {
        this.namaGubernur = namaGubernur;
    }

    /**
     * @return the masaJabatan
     */
    protected int getMasaJabatan() {
        return masaJabatan;
    }

    /**
     * @param masaJabatan the masaJabatan to set
     */
    protected void setMasaJabatan(int masaJabatan) {
        this.masaJabatan = masaJabatan;
    }

    public static void main(String[] args) {
        Gubernur jatim = new Gubernur();

        jatim.setNama("Pemerintah Provinsi Jawa Timur");
        jatim.setWilayah("Jawa Timur");
        jatim.setJumlahkabupaten(38);
        jatim.setNamaGubernur("Khofifah Indar Parawansa");
        jatim.setMasaJabatan(5);

        System.out.println("Nama: " + jatim.getNama());
        System.out.println("Wilayah: " + jatim.getWilayah());
        System.out.println("Jumlah Kabupaten: " + jatim.getJumlahkabupaten());
        System.out.println("Gubernur: " + jatim.getNamaGubernur());
        System.out.println("Masa Jabatan: " + jatim.getMasaJabatan() + " tahun");

    }
}
