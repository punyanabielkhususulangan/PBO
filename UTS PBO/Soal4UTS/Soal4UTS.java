package Soal4UTS;

import java.util.Scanner;

public class Soal4UTS {
    Scanner nt = new Scanner(System.in);
    String awal1, awal2;
    int jari2, diameter;
    double luas, phi;

    public void luasLingkaran1() {
        this.phi = Math.PI;
        System.out.print("Jari - jari: ");
        this.jari2 = nt.nextInt();
        this.luas = this.phi * this.jari2 * this.jari2;
        System.out.println("Luas lingkaran anda: " + this.luas);
    }

    public void luasLingkaran2() {
        this.phi = Math.PI;
        System.out.print("Diameter: ");
        this.diameter = nt.nextInt();
        this.luas = 0.25 * this.phi * this.diameter * this.diameter;
        System.out.println("Luas lingkaran anda: " + this.luas);
    }

    public void kelilingLingkaran() {
        this.phi = Math.PI;
        System.out.print("Jari - Jari: ");
        this.jari2 = nt.nextInt();
        this.luas = 2 * this.phi * this.jari2;
        System.out.println("Keliling lingkaran anda: " + this.luas);
    }

    public void ulang() {
        awal1();
        awal2();
    }


    public void awal1() {
        Scanner nt = new Scanner(System.in);
        System.out.println("");
        System.out.print("Pilih program olah anda: lingkaran1(jari-jari)/lingkaran2(diameter)/keliling(keliling lingkaran) ");
        awal1 = nt.nextLine().toLowerCase();

        if (awal1.equals("lingkaran1")) {
            luasLingkaran1();
        } else if (awal1.equals("lingkaran2")) {
            luasLingkaran2();
        } else if (awal1.equals("keliling")) {
            kelilingLingkaran();
        } else {
            System.out.println("Pilihan anda salah");
        }
    }

    public void awal2() {
        Scanner nt = new Scanner(System.in);
        System.out.println("");
        System.out.print("Apakah anda ingin mengulang? (y/n): ");
        awal2 = nt.nextLine().toLowerCase();

        if (awal2.equals("y")) {
            ulang();
        } else if (awal2.equals("n")) {
            System.out.println("");
            System.out.println("Terima kasih telah menggunakan program ini!");
        } else {
            System.out.println("Ulangi jawaban anda");
            awal2();
        }
    }
}

class mencariLuas {
    public static void main(String[] args) {
        Soal4UTS luas = new Soal4UTS();
        luas.ulang();
    }
}

