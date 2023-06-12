package pertemuan4;

public class Novel extends Buku {
    
    public int getHarga() {
        System.out.println("subclass");
        return super.getHarga();
    }
    
}
