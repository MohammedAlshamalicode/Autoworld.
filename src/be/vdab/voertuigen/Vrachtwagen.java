package be.vdab.voertuigen;

import be.vdab.util.Volume;
import be.vdab.util.Laadbaar;
import be.vdab.voertuigen.div.Nummerplaat;
import be.vdab.voertuigen.div.Type;

public class Vrachtwagen extends Voertuig implements Laadbaar {
    private Volume laadvolume;
    private int maximaalToegelatenMassa;
    private int aantalAssen;

    public Vrachtwagen(Nummerplaat nummerplaat, String merk, int aankoopprijs, Volume laadvolume, int maximaalToegelatenMassa, int aantalAssen) {
        super(nummerplaat, merk, aankoopprijs);
        if (maximaalToegelatenMassa <= 0 || aantalAssen <= 0) {
            throw new IllegalArgumentException("Massa and assen must be positive");
        }
        this.laadvolume = laadvolume;
        this.maximaalToegelatenMassa = maximaalToegelatenMassa;
        this.aantalAssen = aantalAssen;
    }

    @Override
    public Volume getLaadvolume() {
        return laadvolume;
    }

    @Override
    public void setLaadvolume(Volume laadvolume) {
        this.laadvolume = laadvolume;
    }

    @Override
    public String toString() {
        return String.format(" %s    %s,      Laadvolume: (%.2f m³), Maximaal toegelaten massa: %d, Aantal assen: %d", Type.VRACHTWAGEN,super.toString(), laadvolume.getVolume(), maximaalToegelatenMassa, aantalAssen);
    }


//    @Override
//    public String toString() {
//        return "Vrachtwagen{" +
//                "laadvolume=" + laadvolume +
//                ", maximaalToegelatenMassa=" + maximaalToegelatenMassa +
//                ", aantalAssen=" + aantalAssen +
//                "} " + super.toString();
//    }
}
