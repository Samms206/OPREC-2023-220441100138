package asprak;

import java.util.Scanner;

/**
 *
 * @author USER
 */

interface SetterGetter{
    double getharga();
    void setharga(double harga);
    String getmenu();
    void setmenu(String menu);
}
public abstract class AyamGeprek implements SetterGetter{
    double harga;
    String menu;
    
    AyamGeprek(String menu, double harga){
        this.menu = menu;
        this.harga = harga;
    }
    
    @Override
    public double getharga(){
        return harga;
    }
    @Override
    public void setharga(double harga){
        this.harga = harga;
    }
    @Override
    public String getmenu(){
        return menu;
    }
    @Override
    public void setmenu(String menu){
        this.menu = menu;
    }
    //method abstrak
    abstract double diskon(double x);
}
class Biasa extends AyamGeprek{
    Biasa(){
        super("Biasa", 5000);
    }
    @Override
    public double diskon(double x){
        double hasil = 0;
        if (x > 30000 && x < 70000) {
            hasil = x * (3/100);
        }else if(x > 70000){
            hasil = x * (7/100);
        }else{
            hasil = 0;
        }
        
        return x + hasil;
    }
}

class Double extends AyamGeprek{
    Double(){
        super("Double", 5000);
    }
    @Override
    public double diskon(double x){
        double hasil = 0;
        if (x > 30000 && x < 70000) {
            hasil = x * (3/100);
        }else if(x > 70000){
            hasil = x * (7/100);
        }else{
            hasil = 0;
        }
        
        return x + hasil;
    }
}
class Spesial extends AyamGeprek{
    Spesial(){
        super("Double", 5000);
    }
    @Override
    public double diskon(double x){
        if (x < 30000) {
            x = 0;
        }
        else if (x > 30000 && x < 70000) {
            x = x * (3/100);
        }else if(x > 70000){
            x = x * (7/100);
        }else{
            x = 0;
        }
        
        return x;
    }
}
class Hasil{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====Selamat Datang=======");
        while (true) {            
            System.out.println("MENU");
            System.out.println("1. Ayam Geprek Biasa  | Rp 5.000");
            System.out.println("2. Ayam Geprek Double | Rp 7.000");
            System.out.println("3. Ayam Geprek Spesial| Rp 9.000");
            System.out.print("Pilih Menu (angka): ");
            String pilih = sc.next();
            if (pilih.equals("1")) {
                //biasa
                AyamGeprek biasa = new Biasa();
                System.out.println("Anda Memesan Ayam Geprek Biasa");
                System.out.print("Pesan Berapa (angka)? ");
                double jumlah = sc.nextInt();
                double total = jumlah * biasa.getharga();
                System.out.println("Total Pesanan Anda : Rp" + total);
                double diskon;
                if (total >= 30000 && total < 70000) {
                    diskon = total * (3/100);
                    System.out.println("Diskon : " + diskon);
                }else if (total >= 70000){
                    diskon = total * (7/100);
                    System.out.println("Diskon : " + diskon);
                }else{
                    diskon = 0;
                    System.out.println("Diskon : " + diskon);
                }
                double result = total - diskon;
                System.out.println("Harus Dibayar : " + result);
                
                System.out.print("Masukan Nominal Uang : ");
                double bayar = sc.nextInt();
                if (bayar < total) {
                    System.out.println("uang anda kurang");
                }else{
                    System.out.println("Pesanan Berhasil di pesan");
                    double kembalian = bayar - total;
                    System.out.println("kembalian anda : Rp"+kembalian);
                }
            }else if(pilih.equals("2")){
                //double
                AyamGeprek cdouble = new Double();
                System.out.println("Anda Memesan Ayam Geprek Biasa");
                System.out.print("Pesan Berapa (angka)? ");
                double jumlah = sc.nextInt();
                double total = jumlah * cdouble.getharga();
                System.out.println("Total Pesanan Anda : Rp" + total);
                double diskon;
                if (total >= 30000 && total < 70000) {
                    diskon = total * (3/100);
                    System.out.println("Diskon : " + diskon);
                }else if (total >= 70000){
                    diskon = total * (7/100);
                    System.out.println("Diskon : " + diskon);
                }else{
                    diskon = 0;
                    System.out.println("Diskon : " + diskon);
                }
                double result = total - diskon;
                System.out.println("Harus Dibayar : " + result);
                
                System.out.print("Masukan Nominal Uang : ");
                double bayar = sc.nextInt();
                if (bayar < total) {
                    System.out.println("uang anda kurang");
                }else{
                    System.out.println("Pesanan Berhasil di pesan");
                    double kembalian = bayar - total;
                    System.out.println("kembalian anda : Rp"+kembalian);
                }
            }else if(pilih.equals("3")){
                //spesial
                AyamGeprek spesial = new Spesial();
                System.out.println("Anda Memesan Ayam Geprek Biasa");
                System.out.print("Pesan Berapa (angka)? ");
                double jumlah = sc.nextInt();
                double total = jumlah * spesial.getharga();
                System.out.println("Total Pesanan Anda : Rp" + total);
                double diskon;
                if (total >= 30000 && total < 70000) {
                    diskon = total * (3/100);
                    System.out.println("Diskon : " + diskon);
                }else if (total >= 70000){
                    diskon = total * (7/100);
                    System.out.println("Diskon : " + diskon);
                }else{
                    diskon = 0;
                    System.out.println("Diskon : " + diskon);
                }
                double result = total - diskon;
                System.out.println("Harus Dibayar : " + result);
                
                System.out.print("Masukan Nominal Uang : ");
                double bayar = sc.nextInt();
                if (bayar < total) {
                    System.out.println("uang anda kurang");
                }else{
                    System.out.println("Pesanan Berhasil di pesan");
                    double kembalian = bayar - total;
                    System.out.println("kembalian anda : Rp"+kembalian);
                }
            }else{
                System.out.println("menu yang anda pilih tidak ada!!!");
            }
            System.out.println("ingin memesan lagi(y/n)? ");
            String lanjut = sc.next();
            if (lanjut.equals("n")) {
                break;
            }
        }
    }
}