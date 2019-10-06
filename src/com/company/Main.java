package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Laite vatkain = new Laite(352402, "Suristin X15");
        vatkain.Kuvaus("Markkinoiden hiljaisin tehokkaasti pärisevä vatkain");
        vatkain.Valmistusmaa("SUOMI");
        vatkain.PakkauksenKoko(12, 12, 38); // leveys, korkeus, syvyys
        System.out.println(vatkain);

    }

    private static class Laite {
        private String nimi;
        private int tuotekoodi;
        private String kuvaus;
        private String valmistusmaa;
        private int leveys;
        private int korkeus;
        private int syvyys;
        double tilavuus = (leveys * korkeus * syvyys);
        String pakkauksenkoko = "Pakkauksen koko " + leveys + " cm x " + korkeus + "cm x " + syvyys + "cm";

        public Laite(int tuotekoodi, String nimi) {

            this.tuotekoodi = tuotekoodi;
            this.nimi = nimi;

        }

        public void Valmistusmaa(String valmistusmaa) {

            this.valmistusmaa = valmistusmaa;
        }

        public void Kuvaus(String kuvaus) {

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
                    "Pakkauksen koko: " + leveys + " cm x " + korkeus + "cm x " + syvyys + "cm\nPakkauksen tilavuus: " + tilavuus + "m3";

        }
    }


}

