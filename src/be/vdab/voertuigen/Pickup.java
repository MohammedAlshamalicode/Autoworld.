package be.vdab.voertuigen;

import be.vdab.util.Volume;
import be.vdab.util.Laadbaar;
import be.vdab.voertuigen.div.Nummerplaat;
import be.vdab.voertuigen.div.Type;

public class Pickup extends Personenwagen implements Laadbaar {
    private Volume laadvolume;

    public Pickup(Nummerplaat nummerplaat, String merk, int aankoopprijs, int zitplaatsen, Volume laadvolume) {
        super(nummerplaat, merk, aankoopprijs, zitplaatsen);
        this.laadvolume = laadvolume;
    }

    @Override
    public Volume getLaadvolume() {
        return laadvolume;
    }

    @Override
    public void setLaadvolume(Volume laadvolume) {
        this.laadvolume = laadvolume;
    }

    Volume volume;
    @Override
    public String toString() {
        return String.format("%s , Laadvolume: (%.2f m³) (%s)", super.toString(), laadvolume.getVolume() , Type.PICKUP);
        // return String.format("Volume: %d x %d x %d %s (%.2f m³)", breedte, hoogte, diepte, maat.name().toLowerCase(), getVolume());
    }


//    @Override
//    public String toString() {
//        return "Pickup{" +
//                "laadvolume=" + laadvolume +
//                "} " + super.toString();
//    }
}
