public class nilaiKeterampilan {

    int nilaiTugas;

    int nilaiTugas(int tugas){
        if (tugas == 5){
            nilaiTugas = 100;
        } else if (tugas == 4){
            nilaiTugas = 80;
        } else if (tugas == 3){
            nilaiTugas = 60;
        } else if (tugas == 2){
            nilaiTugas = 40;
        } else if (tugas == 1){
            nilaiTugas = 20;
        } else {
            nilaiTugas = 0;
        }
        return nilaiTugas;
    }

}
