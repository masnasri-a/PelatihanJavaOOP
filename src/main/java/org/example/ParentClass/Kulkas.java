package org.example.ParentClass;

import org.example.Interfaces.IsiKulkas;

public class Kulkas {

    private IsiKulkas isiKulkas;

    public Kulkas(IsiKulkas isiKulkas){
        this.isiKulkas = isiKulkas;
    }

    public void bukaPintuKulkas(){
        this.isiKulkas.bukaKulkas();
    }
    public void tutupPintuKulkas(){
        this.isiKulkas.tutupKulkas();
    }
    public void tambahIsiKulkas(){
        this.isiKulkas.tambahItem();
    }
    public void kurangIsiKulkas(){
        this.isiKulkas.kurangItem();
    }
}
