public class akumulasiAbsen extends Siswa{

    char nilaiKehadiran;

    char nilaiKehadiran(int absen){
        if (absen >= 90){
            nilaiKehadiran = 'A';
        } else if (absen >= 80){
            nilaiKehadiran = 'B';
        } else if (absen >= 70){
            nilaiKehadiran = 'C';
        } else if (absen >= 60){
            nilaiKehadiran = 'D';
        } else if (absen >= 50){
            nilaiKehadiran = 'E';
        } else {
            nilaiKehadiran = 'F';
        }
        return nilaiKehadiran;
    }
}
