/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card.game;

/**
 *
 * @author hasan
 */
public class Sporcu {

    String sporcuTakim = "";
    String sporcuIsim = "";

    public void sporcuPuaniGoster() {
        System.out.println("İsim: " + this.getSporcuIsim());
        System.out.println("Takımı: " + this.getSporcuTakim());

    }

    public Sporcu() {
    }

    public Sporcu(String sporcuTakim, String sporcuIsim) {
        this.sporcuIsim = sporcuIsim;
        this.sporcuTakim = sporcuTakim;
    }

    public String getSporcuIsim() {
        return sporcuIsim;
    }

    public void setSporcuIsim(String sporcuIsim) {
        this.sporcuIsim = sporcuIsim;
    }

    public String getSporcuTakim() {
        return sporcuTakim;
    }

    public void setSporcuTakim(String sporcuTakim) {
        this.sporcuTakim = sporcuTakim;
    }

}
