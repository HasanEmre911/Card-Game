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

public class basketbolcu extends Sporcu {

    int ikilik;
    int ucluk;
    int serbestAtis;
    
     
   static boolean kartKullanildiMi(String sporcuIsim){
           return  true;
   }

    public basketbolcu(int ikilik, int ucluk, int serbestAtis, String sporcuTakim, String sporcuIsim) {
        super(sporcuTakim, sporcuIsim);
        this.ikilik = ikilik;
        this.ucluk = ucluk;
        this.serbestAtis = serbestAtis;
    }

    public basketbolcu() {
    }

    public String getSporcuTakim() {
        return sporcuTakim;
    }

    public void setSporcuTakim(String sporcuTakim) {
        this.sporcuTakim = sporcuTakim;
    }

    public String getSporcuIsim() {
        return sporcuIsim;
    }

    public void setSporcuIsim(String sporcuIsim) {
        this.sporcuIsim = sporcuIsim;
    }


    @Override
    public void sporcuPuaniGoster() {
        super.sporcuPuaniGoster();
        System.out.println("Üçlük: " + this.ucluk);
        System.out.println("İkilik: " + this.ikilik);
        System.out.println("Serbest Atış: " + this.serbestAtis);

    }

    public int getIkilik() {
        return ikilik;
    }

    public void setIkilik(int ikilik) {
        this.ikilik = ikilik;
    }

    public int getUcluk() {
        return ucluk;
    }

    public void setUcluk(int ucluk) {
        this.ucluk = ucluk;
    }

    public int getSerbestAtis() {
        return serbestAtis;
    }

    public void setSerbestAtis(int serbestAtis) {
        this.serbestAtis = serbestAtis;
    }
}
