package com.company;
import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        int pilihan;
        String passAtm;
        Scanner in = new Scanner(System.in);
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        ATM user = new ATM();
        for(int i=0; i<3; i++) {
            System.out.println("===============================================");
            System.out.println("**** ATM ****");
            System.out.println("===============================================");
            System.out.print("Masukkan pin : ");
            passAtm = br.readLine();
            System.out.println("===============================================");
            if(passAtm.equals(user.getPin())) {
                System.out.println("Selamat Datang");
                System.out.println("Pilih Menu");
            do {
                System.out.println("===============================================");
                System.out.println("1. Info Saldo");
                System.out.println("2. Tarik Tunai");
                System.out.println("3. Transfer");
                System.out.println("4. Keluar");
                System.out.print("Pilih menu : ");
                pilihan = in.nextInt();
                switch (pilihan) {
                    case 1: {
                        user.lihatSaldo();
                        System.out.println();
                        break;
                    }
                    case 2: {
                        user.tarikUang();
                        System.out.println();
                        break;
                    }
                    case 3: {
                        user.transferUang();
                        break;
                    }
                    default:{
                        break;
                    }
                }
            }while (pilihan != 4);
            }else{
                System.out.println("Password salah silahkan diulangi");
            }
        }
        System.out.println("Anda Telah Salah 3X ATM Anda Terblokir");
    }
}