package org.example;

public class Yakult implements IsiKulkas{

    private int isiItemKulkas;
    private boolean kondisiKulkas;

    public Yakult(){
        this.isiItemKulkas = 5;
    }


    @Override
    public void bukaKulkas() {
        kondisiKulkas = true;
        System.out.println("Kulkas dibuka");
        System.out.println("\n\n");
    }

    @Override
    public void tutupKulkas() {
        if (kondisiKulkas){
            System.out.println("Kulkas ditutup");
        }else {
            System.out.println("Kulkas Masuk Tertutup");
        }
        kondisiKulkas = false;
        System.out.println("\n\n");

    }

    @Override
    public void tambahItem() {
        if (kondisiKulkas){
            if(this.isiItemKulkas == MAX_PER_ITEM){
                System.out.println("KULKAS SUDAH PENUH ");
                System.out.println("\n\n");

            }else {
                this.isiItemKulkas+=1;
                System.out.println("Yakult ditambah jadi "+this.isiItemKulkas);
                System.out.println("\n\n");

            }
        }else {
            System.out.println("Buka Pintu Kulkas Dulu");        System.out.println("\n\n");

        }
    }

    @Override
    public void kurangItem() {
        if (kondisiKulkas){
            if(this.isiItemKulkas == MIN_PER_ITEM){
                System.out.println("KULKAS SUDAH KOSONG ");
                System.out.println("\n\n");
            }else {
                this.isiItemKulkas-=1;
                System.out.println("Yakult dikurang jadi "+this.isiItemKulkas);
                System.out.println("\n\n");
            }
        }else {
            System.out.println("Buka Pintu Kulkas Dulu");
            System.out.println("\n\n");
        }
    }

    public int getIsiItemKulkas(){
        return this.isiItemKulkas;
    }
}
