public class VitualDemo {  // 
    public static void main (String [] args) { 
        Gaji s = new Gaji ("Wahyu", "Kubar", 3,5000.00);               //polymorphism karena class terhubung melalui inheritance
        Pegawai e = new Gaji ("Ini nama", "Samarinda", 2, 2500.00);    // polymorphism upcasting 
        System.out.println ("Memanggil mailCheck Berdasarkan Referensi Gaji--");
        s.mailCheck();
            } 
}
