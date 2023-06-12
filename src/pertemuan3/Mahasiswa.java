package pertemuan3;

public class Mahasiswa {
    String nama,jurusan,kelas;
    
    //Constructor
    void setNama (String nama){
        this.nama = nama; 
    }
    void setKelas (String kelas){
        this.kelas = kelas; 
    }
    void setJurusan (String jurusan){
        this.jurusan = jurusan;
    }
    
    //Mutator
    void show (){
        System.out.println("Nama : " + this.nama);
        System.out.println("Kelas : " + this.kelas);
        System.out.println("Jurusan : " + this.jurusan);
    }
    void gantiNama (String nama){
        this.nama = nama;
    }
    
    //Accessor
    String getNama(){
        return this.nama;
    }
    String getKelas(){
        return this.kelas;
    }
    String getJurusan(){
        return this.jurusan;
    }
}
