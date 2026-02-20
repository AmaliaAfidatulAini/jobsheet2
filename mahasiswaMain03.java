public class mahasiswaMain03 {
    public static void main(String[] args) {

        mahasiswa03 mhs1 = new mahasiswa03();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2247374765";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2J");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        mahasiswa03 mhs2 = new mahasiswa03("Annisa Nabila", "236726432465", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        mahasiswa03 mhs3 = new mahasiswa03("Amalia", "254107060015", 3.80, "SIB 1B");
        mhs3.tampilkanInformasi();
    }
}
