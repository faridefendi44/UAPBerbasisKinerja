package Tugas4;

public class DataMerchant {
    static Merchant merc [] = new Merchant[0];


    public static Merchant[] tambahMerchant(Merchant merchant) {
        Merchant tampung[] = new Merchant[DataMerchant.merc.length+1];
        for (int i = 0; i < DataMerchant.merc.length; i++) {
            tampung[i] = DataMerchant.merc[i];
        }
        tampung[DataMerchant.merc.length] = merchant;
        return tampung;
    }
    public static void display(){
        for (Merchant mch : merc){
            System.out.println("=== Tampilan Data Merchant UBFOOF ===");
            System.out.println("Nama Merchant : "+mch.getNamaMerchant());
            System.out.println("Nama Produk   : "+mch.getNamaProduk());
            System.out.println("Harga         : Rp "+(int)mch.getHargaMakanan());
        }
    }

    public static Merchant cariMerchant(String nama) {
        for (Merchant mch1 : merc){
            if (nama.equalsIgnoreCase(mch1.getNamaMerchant())) {
                System.out.println("--- Informasi Merchant Yang Anda Cari ---");
                System.out.println("Nama Merchant : " + mch1.getNamaMerchant());
                System.out.println("Nama Produk   : " + mch1.getNamaProduk());
                System.out.println("Harga         : Rp " + (int) mch1.getHargaMakanan());;
            }
        }
        return null;
    }
    public static void updateMerchant(){
        for (Merchant mch3 : merc){
            System.out.println("=== Tampilan Data Merchant UBFOOF ===");
            System.out.println("Nama Merchant : "+mch3.getNamaMerchant());
            System.out.println("Nama Produk   : "+mch3.getNamaProduk());
            System.out.println("Harga         : Rp "+(int)mch3.getHargaMakanan());
        }
    }
}
