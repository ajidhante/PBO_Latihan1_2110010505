package pertemuan4;

public class BukuBeraksi {
    public static void main(String[] args) {
        //membuat objek
        Buku Buku1 = new Buku();
        Buku Buku2 = new Buku("Buku Polymorphism","Fadli",30000);
        
        Buku1.setJudul("Cara Menggunakan Encapsulation");
        Buku1.setPenerbit("Fadli");
        Buku1.setHarga(25000);
        
        System.out.println("Judul Buku : "+Buku1.getJudul());
        System.out.println("Penerbit : "+Buku1.getPenerbit());
        System.out.println("Harga Buku : "+Buku1.getHarga());
        
    }
}
