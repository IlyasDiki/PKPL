package com.company;
import java.util.*;
public class ATM {
    public Integer totaltf=0;
    private double saldo=5000000;
    private String pin;
    public long uang;

    public ATM() {
        pin = "220601";
    }

    public String getPin()
    {
        return pin;
    }

    public double getSaldo(double saldo){
        this.saldo = saldo;
        return this.saldo;
    }

    public void lihatSaldo() {
        System.out.println("===============================================");
        System.out.println("Saldo anda Rp " + saldo);
        System.out.println("===============================================");
    }

    public void tarikUang() {
        Scanner in = new Scanner(System.in);
        System.out.println("===============================================");
        System.out.println("1. Rp  50.000     4. Rp  500.000");
        System.out.println("2. Rp 100.000     5. Rp 1.000.000");
        System.out.println("3. Rp 200.000     6. Rp 2.000.000");
        System.out.println("===============================================");
        System.out.print("Masukkan pilihan: ");
        byte pil = in.nextByte();
        this.setNominal(pil);
    }

    public void transferUang() {
        System.out.print("Masukkan nomor rekening yang dituju : ");
        Scanner in = new Scanner(System.in);
        int norek=in.nextInt();
        if(norek==2000018371){
            System.out.print("Masukkan jumlah uang yang akan ditransfer : Rp ");
            uang = in.nextInt();
            System.out.println("Anda Berhasil mentransfer uang sebesar Rp " + uang+ " Ke Nomor Rekening : "+norek);
            saldo = saldo - uang;
            this.getSaldo(saldo);
            totaltf+=1;
            if(totaltf%5==0){
                saldo+=uang*0.02;
            }
            System.out.println("Saldo Anda Sekarang Rp. "+getSaldo(saldo));
        }else if(norek==2000018291){
            System.out.print("Masukkan jumlah uang yang akan ditransfer : Rp ");
            uang = in.nextInt();
            System.out.println("Anda telah mentransfer uang sebesar Rp " + uang + " Ke Nomor Rekening : "+norek);
            saldo = saldo - uang;

            this.getSaldo(saldo);
            totaltf+=1;
            if(totaltf%5==0){
                saldo+=uang*0.02;
            }
        }else if(norek==2000018289){
            System.out.print("Masukkan jumlah uang yang akan ditransfer : Rp ");
            uang = in.nextInt();
            System.out.println("Anda telah mentransfer uang sebesar Rp " + uang + " Ke Nomor Rekening : "+norek);
            saldo = saldo - uang;
            this.getSaldo(saldo);
            totaltf+=1;
            if(totaltf%5==0){
                saldo+=uang*0.02;
            }
            System.out.println("Saldo Anda Sekarang Rp. "+getSaldo(saldo));
        }else if(norek==2000018285){
            System.out.print("Masukkan jumlah uang yang akan ditransfer : Rp ");
            uang = in.nextInt();
            System.out.println("Anda telah mentransfer uang sebesar Rp " + uang + " Ke Nomor Rekening : "+norek);
            saldo = saldo - uang;
            this.getSaldo(saldo);
            totaltf+=1;
            if(totaltf%5==0){
                saldo+=uang*0.02;
            }
            System.out.println("Saldo Anda Sekarang Rp. "+getSaldo(saldo));
        }else if(norek==2000018282){
            System.out.print("Masukkan jumlah uang yang akan ditransfer : Rp ");
            uang = in.nextInt();
            System.out.println("Anda telah mentransfer uang sebesar Rp " + uang + " Ke Nomor Rekening : "+norek);
            saldo = saldo - uang;
            this.getSaldo(saldo);
            totaltf+=1;
            if(totaltf%5==0){
                saldo+=uang*0.02;
            }
            System.out.println("Saldo Anda Sekarang Rp. "+getSaldo(saldo));
        }else{
            System.out.println("Nomor Tidak Terdaftar");
        }
    }

    public void setNominal(byte pil) {
        if (pil == 1) {
            saldo = saldo - 50000;
            System.out.println("Saldo anda tersisa : Rp " + saldo);
        } else if (pil == 2) {
            saldo = saldo - 100000;
            System.out.println("Saldo anda tersisa : Rp " + saldo);
        } else if (pil == 3) {
            saldo = saldo - 200000;
            System.out.println("Saldo anda tersisa : Rp " + saldo);
        } else if (pil == 4) {
            saldo = saldo - 500000;
            System.out.println("Saldo anda tersisa : Rp " + saldo);
        } else if (pil == 5) {
            saldo = saldo - 1000000;
            System.out.println("Saldo anda tersisa : Rp " + saldo);
        } else if (pil == 6) {
            saldo = saldo - 2000000;
            System.out.println("Saldo anda tersisa : Rp " + saldo);
        } else {
            System.out.println("ERROR!");
        }
    }
}

