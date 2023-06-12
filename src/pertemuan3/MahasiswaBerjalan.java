package pertemuan3;

public class MahasiswaBerjalan {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa();
        
        mahasiswa1.nama = "Fadli";
        mahasiswa1.kelas = "D";
        mahasiswa1.jurusan = "TI";
        
        System.out.println("> Constructor <");
        System.out.println("Nama : " + mahasiswa1.nama);
        System.out.println("Kelas :  " + mahasiswa1.kelas);
        System.out.println("Jurusan : " + mahasiswa1.jurusan);

        //Mutator
        System.out.println("> Mutator <");
        mahasiswa1.show();
        
        System.out.println("> Mutator 1 <");
        mahasiswa1.gantiNama("Muhammad");
        mahasiswa1.show();
        
        //Accessor
        System.out.println("> Accessor <");
        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getKelas());
        System.out.println(mahasiswa1.getJurusan());

    }
}
