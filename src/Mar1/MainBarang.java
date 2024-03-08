package Mar1;

public class MainBarang {

    public static void main(String[] args) {
        
        Barang oreo = new Barang();
        oreo.setHarga(8000);
        oreo.setNamaBarang("Oreo");
        oreo.setExp("20 Juni 2025");

        Barang goodday = new Barang();
        goodday.setHarga(6000);
        goodday.setNamaBarang("Good Day");
        goodday.setExp("19 May 2025");

        display(oreo);
        display(goodday);





    }

    

    static void display (Barang produk){
        System.out.println("Nama produk = " + produk.getNamaBarang());
        System.out.println("Harga : " + produk.getHarga());
        System.out.println("Tanggal Exp : " + produk.getExp());
    }
    
}
