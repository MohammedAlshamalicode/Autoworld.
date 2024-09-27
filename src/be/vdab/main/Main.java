package be.vdab.main;

import be.vdab.schoolgerief.Boekentas;
import be.vdab.util.Laadbaar;
import be.vdab.voertuigen.Maat;
import be.vdab.util.Volume;
import be.vdab.voertuigen.*;
import be.vdab.voertuigen.div.Div;

import java.io.*;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Div div = Div.INSTANCE;

        //Creëer een sortedset van voertuigen
        SortedSet<Voertuig> voertuigen = new TreeSet<>();
        voertuigen.add(new Personenwagen(div.getNummerplaat(), "BMW", 0, 4));
        voertuigen.add(new Personenwagen(div.getNummerplaat(), "Honda", 22000, 5));
        voertuigen.add(new Pickup(div.getNummerplaat(), "Ford", 25000, 4, new Volume(2, 2, 2, Maat.METER)));
        voertuigen.add(new Pickup(div.getNummerplaat(), "Chevrolet", 24000, 4, new Volume(3, 2, 2, Maat.METER)));
        voertuigen.add(new Vrachtwagen(div.getNummerplaat(), "Mercedes", 50000, new Volume(5, 5, 5, Maat.METER), 10000, 4));
        voertuigen.add(new Vrachtwagen(div.getNummerplaat(), "Volvo", 55000, new Volume(6, 6, 6, Maat.METER), 12000, 5));

        // Toon voertuigen op het scherm
        System.out.println("Lijst met gemaakte voertuigen:");
        System.out.println("*********************************");
        for (Voertuig voertuig : voertuigen) {
            System.out.println(voertuig);
        }

        // Bewaar de voertuigen in een bestand wagenpark.dat.
        try (FileOutputStream fileOut = new FileOutputStream("wagenpark.dat");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

            out.writeObject(voertuigen);
            System.out.println("*********************************");
            System.out.println("!!!!!   De voertuigen worden opgeslagen in het bestand (wagenpark.dat)  !!!!!");

        } catch (IOException i) {
            i.printStackTrace();
        }

        // Lees het bestand en geef de voertuigen weer op het scherm
        try (FileInputStream fileIn = new FileInputStream("wagenpark.dat");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {

            SortedSet<Voertuig> opgeslagenVoertuigen = (SortedSet<Voertuig>) in.readObject();
            System.out.println("\n Lijst met voertuigen gelezen uit bestand (wagenpark.dat) :");
            System.out.println("*********************************");

            for (Voertuig voertuig : opgeslagenVoertuigen) {
                System.out.println(voertuig);
            }
            System.out.println("*********************************");

        } catch (IOException | ClassNotFoundException i) {
            i.printStackTrace();
        }

        Boekentas boekentas1 = new Boekentas("Rood",new Volume(1,1,1,Maat.METER));
        Boekentas boekentas2 = new Boekentas("Blauw",new Volume(1,2,1,Maat.METER));
        String[] laadbaarsObjecten = new String[]{
                String.valueOf(new Personenwagen(div.getNummerplaat(),"Toyota",2000 , 4)),
                String.valueOf(new Pickup(div.getNummerplaat(),"Nissan",3000 , 4,new Volume(2,3,2,Maat.METER))),
                String.valueOf(boekentas1),
                String.valueOf(boekentas2)
        };
        for (String x : laadbaarsObjecten){
            System.out.println(x);
        }

    }
    }

