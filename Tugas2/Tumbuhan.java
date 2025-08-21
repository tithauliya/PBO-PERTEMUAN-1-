/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author HP
 */
public class Tumbuhan extends MakhlukHidup {
  private String habitat ; 
  private String warnabatang ;
  
  protected String habitat () {
        return getHabitat();
    }
    
    protected void habitat (String habitat) {
        this.setHabitat(habitat);
    }
    
    protected String warnaBatang () {
        return getWarnabatang();
    }
    
    protected void warnaBatang (String habitat) {
        this.setWarnabatang(habitat);
    }

    /**
     * @return the habitat
     */
    protected String getHabitat() {
        return habitat;
    }

    /**
     * @param habitat the habitat to set
     */
    protected void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    /**
     * @return the warnabatang
     */
    protected String getWarnabatang() {
        return warnabatang;
    }

    /**
     * @param warnabatang the warnabatang to set
     */
    protected void setWarnabatang(String warnabatang) {
        this.warnabatang = warnabatang;
    }
}
