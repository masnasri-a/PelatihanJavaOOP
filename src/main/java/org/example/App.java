package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        IsiKulkas semangka = new Wortel();
        Kulkas kulkasNasri = new Kulkas(semangka);
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int aksi;
        boolean loops = true;
        while (loops) {
            try {
                System.out.println("=== KULKAS MANTAP ===");
                System.out.println("[1] BUKA KULKAS");
                System.out.println("[2] TUTUP KULKAS");
                System.out.println("[3] TAMBAH BARANG");
                System.out.println("[4] KURANGI BARANG");
                System.out.println("[0] Keluar");
                System.out.println("--------------------------");
                System.out.print("Pilih aksi> ");
                aksi = Integer.parseInt(input.readLine());
                switch (aksi) {
                    case 1: {
                        kulkasNasri.bukaPintuKulkas();
                        break;
                    }
                    case 2: {
                        kulkasNasri.tutupPintuKulkas();
                        break;
                    }
                    case 3: {
                        kulkasNasri.tambahIsiKulkas();
                        break;
                    }
                    case 4: {
                        kulkasNasri.kurangIsiKulkas();
                        break;
                    }
                    case 0: {
                        loops = false;
                        break;
                    }
                    default: {
                        System.out.println("Kamu memilih aksi yang salah!");
                    }
                }

            } catch (Exception e) {
                System.out.println("Inputan hanya berupa angka\nMasukkan Dengan Benar\n\n");
            }
        }
    }
}

