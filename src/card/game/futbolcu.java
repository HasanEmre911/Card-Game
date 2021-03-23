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
public class futbolcu extends Sporcu {

    static int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static futbolcu get(int randomYer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void remove(int randomYer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int penaltı;
    int serbestAtis;
    int kaleciKarsiKarsiya;
    
   static boolean kartKullanildiMi(String sporcuIsim){
           return  true;
           
    }

    public futbolcu(int penaltı, int serbestAtis, int kaleciKarsiKarsiya, String sporcuTakim, String sporcuIsim) {
        super(sporcuTakim, sporcuIsim);
        this.penaltı = penaltı;
        this.serbestAtis = serbestAtis;
        this.kaleciKarsiKarsiya = kaleciKarsiKarsiya;
    }

    public futbolcu() {
        super();
    }

    @Override
    public void sporcuPuaniGoster() {
        super.sporcuPuaniGoster();
        System.out.println("Penaltı: " + this.penaltı);
        System.out.println("Serbest Atış: " + this.serbestAtis);
        System.out.println("Kaleciyle Karşı Karşıya: " + this.kaleciKarsiKarsiya);

    }

    public int getPenaltı() {
        return penaltı;
    }

    public void setPenaltı(int penaltı) {
        this.penaltı = penaltı;
    }

    public int getSerbestAtis() {
        return serbestAtis;
    }

    public void setSerbestAtis(int serbestAtis) {
        this.serbestAtis = serbestAtis;
    }

    public int getKaleciKarsiKarsiya() {
        return kaleciKarsiKarsiya;
    }

    public void setKaleciKarsiKarsiya(int kaleciKarsiKarsiya) {
        this.kaleciKarsiKarsiya = kaleciKarsiKarsiya;
    }

}
