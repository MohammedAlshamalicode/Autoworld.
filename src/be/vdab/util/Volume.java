package be.vdab.util;

import be.vdab.voertuigen.Maat;

import java.io.Serializable;
import java.util.Objects;

public class Volume implements Comparable<Volume>, Serializable {
    private final int breedte;
    private final int hoogte;
    private final int diepte;
    private final Maat maat;

    public Volume(int breedte, int hoogte, int diepte, Maat maat) {
        if (breedte <= 0 || hoogte <= 0 || diepte <= 0) {
            throw new VolumeException("Volume dimensions must be positive");
        }
        this.breedte = breedte;
        this.hoogte = hoogte;
        this.diepte = diepte;
        this.maat = maat;
    }

    public double getVolume() {
        return breedte * hoogte * diepte * Math.pow(maat.getWaardeInMeter(), 3);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Volume volume = (Volume) o;
        return (breedte == volume.breedte &&
                hoogte == volume.hoogte &&
                diepte == volume.diepte &&
                maat == volume.maat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breedte, hoogte, diepte, maat);
    }

    @Override
    public int compareTo(Volume other) {
        return Double.compare(this.getVolume(), other.getVolume());
    }

    @Override
    public String toString() {
        return String.format(" %d x %d x %d %s (%.2f m³)", breedte, hoogte, diepte, maat.name().toLowerCase(), getVolume());
    }

}
