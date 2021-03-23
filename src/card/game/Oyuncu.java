/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card.game;

import java.util.ArrayList;

/**
 *
 * @author hasan
 */
public class Oyuncu  {

    static int oyuncuID;
    static String oyuncuAdi;
    static int Skor = 0;

   public static int kartListesi( ArrayList<futbolcu> kf, ArrayList<basketbolcu> kb, ArrayList<futbolcu> bf, ArrayList<basketbolcu> bb )
   {
   
       
       return 0;
   }
   
    public Oyuncu(int oyuncuID, String oyuncuAdi, int Skor) {
        this.oyuncuID = oyuncuID;
        this.oyuncuAdi = oyuncuAdi;
        this.Skor = Skor;
    }

    public Oyuncu() {
    }

    public int getOyuncuID() {
        return oyuncuID;
    }

    public void setOyuncuID(int oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

    public int getSkor() {
        return Skor;
    }

    public void setSkor(int Skor) {
        this.Skor = Skor;
    }

}
