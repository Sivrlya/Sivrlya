import java.util.Scanner;

public class kategoriNilai {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan Nama: ");
        String nama = input.nextLine();
        System.out.println("Masukkan Nilai "+nama);
        int nilai = input.nextInt();

        String predikat = null;
        String kategori = null;

        if (nilai > 96 && nilai <= 100){
            predikat = "A";
            kategori = "sangat baik";
        }else if(nilai >90 && nilai <= 95){
            predikat ="A-";
            kategori ="sangat baik";
        }else if(nilai > 86 && nilai <= 90 ){
            predikat ="B+";
            kategori ="Baik";
        }else if(nilai > 81 && nilai <= 85){
            predikat ="B";
            kategori ="Baik";
        }else if(nilai > 75 && nilai <= 80){
            predikat ="B-";
            kategori ="Baik";
        }else if(nilai > 70 && nilai <= 74){
            predikat ="C+";
            kategori ="Cukup";
        }else if(nilai > 65 && nilai <= 69){
            predikat ="C";
            kategori ="Cukup";
        }else if(nilai > 60 && nilai <= 64){
            predikat ="C-";
            kategori ="Cukup";
        }else if(nilai > 55 && nilai <= 59){
            predikat ="D+";
            kategori ="Kurang";
        }else if(nilai > 0 && nilai <= 54){
            predikat ="D";
            kategori ="Kurang";
        }


        System.out.println("Nama: "+nama);
        System.out.println("Nilai: "+nilai);
        System.out.println(predikat + kategori);

    }

    
}
