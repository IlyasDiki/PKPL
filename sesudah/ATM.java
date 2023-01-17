package com.company;
import java.util.*;
public class ATM {
    public Integer totalTf=0;
    private double saldoAtm=5000000;
    private String pinAtm;
    public long uangTunai;

    public ATM() {
        pinAtm = "220601";
    }

    public String getPin()
    {
        return pinAtm;
    }

    public double getSaldoatm(double saldoAtm){
        this.saldoAtm = saldoAtm;
        return this.saldoAtm;
    }

    public void lihatSaldoatm() {
        System.out.println("===============================================");
        System.out.println("Saldoatm anda Rp " + saldoAtm);
        System.out.println("===============================================");
    }

    public void tarikUangDariAtm() {
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

    public void transferUangDariAtm() {
        System.out.print("Masukkan nomor rekening yang dituju : ");
        Scanner in = new Scanner(System.in);
        int noRek=in.nextInt();
        if(noRek==2000018371){
            System.out.print("Masukkan jumlah uang tunai yang akan ditransfer : Rp ");
            uangTunai = in.nextInt();
            System.out.println("Anda Berhasil mentransfer uang tunai sebesar Rp " + uangTunai+ " Ke Nomor Rekening : "+noRek);
            saldoAtm = saldoAtm - uangTunai;
            this.getSaldoatm(saldoAtm);
            totalTf+=1;
            if(totalTf%5==0){
                saldoAtm+=uangTunai*0.02;
            }
            System.out.println("Saldoatm Anda Sekarang Rp. "+getSaldoatm(saldoAtm));
        }else if(noRek==2000018291){
            System.out.print("Masukkan jumlah uang tunai yang akan ditransfer : Rp ");
            uangTunai = in.nextInt();
            System.out.println("Anda telah mentransfer uangTunai sebesar Rp " + uangTunai + " Ke Nomor Rekening : "+noRek);
            saldoAtm = saldoAtm - uangTunai;

            this.getSaldoatm(saldoAtm);
            totalTf+=1;
            if(totalTf%5==0){
                saldoAtm+=uangTunai*0.02;
            }
        }else if(noRek==2000018289){
            System.out.print("Masukkan jumlah uangTunai yang akan ditransfer : Rp ");
            uangTunai = in.nextInt();
            System.out.println("Anda telah mentransfer uangTunai sebesar Rp " + uangTunai + " Ke Nomor Rekening : "+noRek);
            saldoAtm = saldoAtm - uangTunai;
            this.getSaldoatm(saldoAtm);
            totalTf+=1;
            if(totalTf%5==0){
                saldoAtm+=uangTunai*0.02;
            }
            System.out.println("Saldoatm Anda Sekarang Rp. "+getSaldoatm(saldoAtm));
        }else if(noRek==2000018285){
            System.out.print("Masukkan jumlah uangTunai yang akan ditransfer : Rp ");
            uangTunai = in.nextInt();
            System.out.println("Anda telah mentransfer uangTunai sebesar Rp " + uangTunai + " Ke Nomor Rekening : "+noRek);
            saldoAtm = saldoAtm - uangTunai;
            this.getSaldoatm(saldoAtm);
            totalTf+=1;
            if(totalTf%5==0){
                saldoAtm+=uangTunai*0.02;
            }
            System.out.println("Saldo atm Anda Sekarang Rp. "+getSaldoatm(saldoAtm));
        }else if(noRek==2000018282){
            System.out.print("Masukkan jumlah uangTunai yang akan ditransfer : Rp ");
            uangTunai = in.nextInt();
            System.out.println("Anda telah mentransfer uangTunai sebesar Rp " + uangTunai + " Ke Nomor Rekening : "+noRek);
            saldoAtm = saldoAtm - uangTunai;
            this.getSaldoatm(saldoAtm);
            totalTf+=1;
            if(totalTf%5==0){
                saldoAtm+=uangTunai*0.02;
            }
            System.out.println("Saldoatm Anda Sekarang Rp. "+getSaldoatm(saldoAtm));
        }else{
            System.out.println("Nomor Tidak Terdaftar");
        }
    }

    public void setNominal(byte pil) {
        if (pil == 1) {
            saldoAtm = saldoAtm - 50000;
            System.out.println("Saldoatm anda tersisa : Rp " + saldoAtm);
        } else if (pil == 2) {
            saldoAtm = saldoAtm - 100000;
            System.out.println("Saldoatm anda tersisa : Rp " + saldoAtm);
        } else if (pil == 3) {
            saldoAtm = saldoAtm - 200000;
            System.out.println("Saldoatm anda tersisa : Rp " + saldoAtm);
        } else if (pil == 4) {
            saldoAtm = saldoAtm - 500000;
            System.out.println("Saldoatm anda tersisa : Rp " + saldoAtm);
        } else if (pil == 5) {
            saldoAtm = saldoAtm - 1000000;
            System.out.println("Saldoatm anda tersisa : Rp " + saldoAtm);
        } else if (pil == 6) {
            saldoAtm = saldoAtm - 2000000;
            System.out.println("Saldoatm anda tersisa : Rp " + saldoAtm);
        } else {
            System.out.println("ERROR!");
        }
    }
}

