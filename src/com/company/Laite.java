package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Laite {

    private String nimi;
    private int tuotekoodi;
    private String kuvaus;
    private String valmistusmaa;
    private int leveys;
    private int korkeus;
    private int syvyys;
    int tilavuus = leveys*korkeus*syvyys;
    String pakkauksenkoko = "Pakkauksen koko " + leveys + " cm x " + korkeus + "cm x " + syvyys;

    public Laite(int tuotekoodi, String nimi) {

        this.tuotekoodi = tuotekoodi;
        this.nimi = nimi;

    }

    public void Valmistusmaa() {

        this.valmistusmaa = valmistusmaa;
    }

    public void Kuvaus() {

        this.kuvaus = kuvaus;
    }

    public void PakkauksenKoko(int leveys, int korkeus, int syvyys) {
        this.leveys = leveys;
        this.korkeus = korkeus;
        this.syvyys = syvyys;

      //  System.out.println("Pakkauksen koko " + leveys + " cm x " + korkeus + "cm x " + syvyys);
    }


    @Override
    public String toString() {
        return "Tuotekoodi: " + tuotekoodi + "\n" + "Nimi: " + nimi + "\nValmistusmaa: " + valmistusmaa + "\n" +
                "Pakkauksen koko: " + leveys + " cm x " + korkeus + "cm x " + syvyys + "\nPakkauksen tilavuus: " + tilavuus;

    }
}
