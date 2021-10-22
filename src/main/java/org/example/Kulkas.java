package org.example;

public class Kulkas {

    private IsiKulkas isiKulkas;

    public Kulkas(IsiKulkas isiKulkas){
        this.isiKulkas = isiKulkas;
    }

    void bukaPintuKulkas(){
        this.isiKulkas.bukaKulkas();
    }
    void tutupPintuKulkas(){
        this.isiKulkas.tutupKulkas();
    }
    void tambahIsiKulkas(){
        this.isiKulkas.tambahItem();
    }
    void kurangIsiKulkas(){
        this.isiKulkas.kurangItem();
    }
}
