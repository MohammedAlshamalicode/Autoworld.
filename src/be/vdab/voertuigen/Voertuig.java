package be.vdab.voertuigen;

import be.vdab.voertuigen.div.Nummerplaat;
import java.io.Serializable;
import java.util.Objects;

public class Voertuig implements Comparable<Voertuig>, Serializable {
    private final Nummerplaat nummerplaat;
    private String merk;
    private int aankoopprijs;

    //constructor
    public Voertuig(Nummerplaat nummerplaat, String merk, int aankoopprijs) {
        if (merk == null) {
            throw new IllegalArgumentException("Merk cannot be null");
        }
        if (aankoopprijs < 0) {
            throw new IllegalArgumentException("Aankoopprijs cannot be negative");
        }
        this.nummerplaat = nummerplaat;
        this.merk = merk;
        this.aankoopprijs = aankoopprijs;
    }
    //getNummerplaat
    public Nummerplaat getNummerplaat() {
        return nummerplaat;
    }
    //getMerk
    public String getMerk() {
        return merk;
    }
    //setMerk
    public void setMerk(String merk) {
        this.merk = merk;
    }
    //getAankoopprijs
    public int getAankoopprijs() {
        return aankoopprijs;
    }
    //setAankoopprijs
    public void setAankoopprijs(int aankoopprijs) {
        this.aankoopprijs = aankoopprijs;
    }

    @Override
    public String toString() {
        return String.format(" Nummerplaat : %s,  Merk: %s,  Aankoopprijs: %d", nummerplaat, merk, aankoopprijs);
    }


//    @Override
//    public String toString() {
//        return "Voertuig{" +
//                "nummerplaat=" + nummerplaat +
//                ", merk='" + merk + '\'' +
//                ", aankoopprijs=" + aankoopprijs +
//                '}';
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voertuig voertuig = (Voertuig) o;
        return Objects.equals(nummerplaat, voertuig.nummerplaat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nummerplaat);
    }

    @Override
    public int compareTo(Voertuig other) {
        return this.nummerplaat.compareTo(other.nummerplaat);
    }
}
