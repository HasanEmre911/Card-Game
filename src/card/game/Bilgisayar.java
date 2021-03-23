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
public class Bilgisayar extends Oyuncu {

    static int oyuncuID;
    static String oyuncuAdi;
    static int Skor = 0;

    public Bilgisayar() {
    }

    public Bilgisayar(int oyuncuID, String oyuncuAdi, int Skor) {
        super(oyuncuID, oyuncuAdi, Skor);
    }

    @Override
    public int getOyuncuID() {
        return oyuncuID;
    }

    @Override
    public void setOyuncuID(int oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    @Override
    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

    @Override
    public int getSkor() {
        return Skor;
    }

    @Override
    public void setSkor(int Skor) {
        this.Skor = Skor;
    }

}
