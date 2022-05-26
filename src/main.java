import java.util.Scanner;

public class main {

    public static void main(String [] args){
        String predikat, nama, kelas;
        char indeks;

        Scanner sc = new Scanner(System.in);
        akumulasiAbsen ab = new akumulasiAbsen();
        nilaiPengetahuan np = new nilaiPengetahuan();
        nilaiKeterampilan nk = new nilaiKeterampilan();

        System.out.println("----------------------------");
        System.out.println("  AKUMULASI NILAI SEMESTER  ");
        System.out.println("----------------------------");
        System.out.print("Nama Siswa : ");
        nama = sc.nextLine();
        System.out.print("Kelas : ");
        kelas = sc.nextLine();
        System.out.println("----------------------------");
        System.out.print("Jumlah Absen Siswa: ");
        char absenSw = ab.nilaiKehadiran(sc.nextInt());
        System.out.print("Jumlah Jawaban Benar: ");
        int nilaiPg = np.nilaiP(sc.nextInt());
        System.out.print("Jumlah Tugas: ");
        int nilaiPk = nk.nilaiTugas(sc.nextInt());

        int nilaiAkhir = (nilaiPk+nilaiPg)/2;

        if (nilaiAkhir >=90){
            predikat = "SANGAT BAIK";
            indeks = 'A';
        } else if (nilaiAkhir >= 80){
            predikat = "BAIK";
            indeks = 'B';
        } else if (nilaiAkhir >= 70){
            predikat = "CUKUP";
            indeks = 'C';
        } else if (nilaiAkhir >= 60){
            predikat = "KURANG";
            indeks = 'D';
        } else if (nilaiAkhir >= 50){
            predikat = "SANGAT KURANG";
            indeks = 'E';
        } else {
            predikat = "KOSONG";
            indeks = 'F';
        }
        System.out.println("----------------------------");
        System.out.println("Pengetahuan: "+nilaiPg);
        System.out.println("Keterampilan: "+nilaiPk);
        System.out.println("Nilai Akhir: "+nilaiAkhir);
        System.out.println("Indeks: "+predikat);
        System.out.println("Predikat: "+indeks);
        System.out.println("----------------------------");

        if (indeks == 'A' || indeks == 'B' || indeks == 'C'){
            System.out.println("Siswa atas nama "+nama+" dari Kelas "+kelas+" dengan nilai akhir "+nilaiAkhir+" ("+indeks+")\n dinyatakan NAIK KELAS");
        }
        else {
            System.out.println("Siswa atas nama "+nama+" dari Kelas "+kelas+" dengan nilai akhir "+nilaiAkhir+" ("+indeks+")\n dinyatakan TIDAK NAIK KELAS");
        }
    }
}
