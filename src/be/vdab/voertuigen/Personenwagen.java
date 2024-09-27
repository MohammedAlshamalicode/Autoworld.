package be.vdab.voertuigen;

import be.vdab.voertuigen.div.Nummerplaat;
import be.vdab.voertuigen.div.Type;

public class Personenwagen extends Voertuig {
    private int zitplaatsen;
    //constructor
    public Personenwagen(Nummerplaat nummerplaat, String merk, int aankoopprijs, int zitplaatsen) {
        super(nummerplaat, merk, aankoopprijs);
        if (zitplaatsen <= 0) {
            throw new IllegalArgumentException("Zitplaatsen must be greater than 0");
        }
        this.zitplaatsen = zitplaatsen;
    }
    //getZitplaatsen
    public int getZitplaatsen() {
        return zitplaatsen;
    }
    //setZitplaatsen
    public void setZitplaatsen(int zitplaatsen) {
        if (zitplaatsen <= 0) {
            throw new IllegalArgumentException("Zitplaatsen must be greater than 0");
        }
        this.zitplaatsen = zitplaatsen;
    }

    @Override
    public String toString() {
        return String.format(" %S %s ,       Zitplaatsen: %d",Type.PERSONNENWAGEN, super.toString(), zitplaatsen);
    }



//    @Override
//    public String toString() {
//        return super.toString() + "Personenwagen : " +
//                "zitplaatsen=" + zitplaatsen +
//                "} "  ;
//    }
}
