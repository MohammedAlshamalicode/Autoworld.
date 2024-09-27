package be.vdab.schoolgerief;

import be.vdab.util.Volume;
import be.vdab.util.Laadbaar;

public class Boekentas implements Laadbaar {
    private String kleur;
    private Volume laadvolume;

    public Boekentas(String kleur, Volume laadvolume) {
        if (kleur == null || laadvolume == null) {
            throw new IllegalArgumentException("Kleur and Laadvolume cannot be null");
        }
        this.kleur = kleur;
        this.laadvolume = laadvolume;
    }

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
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
        return String.format("Boekentas: Kleur: %s, Laadvolume: %s", kleur, laadvolume);
    }

}
