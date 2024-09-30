import java.util.Scanner;

public class pedagangBuah {

    public static void main (String []args){
    int jumlahBuah;
    double hari;
    int jumlahHari;
    double totalBuah=0;
    double rataRataBuah;
    double totalSemuaJumlahBuah=0;


    Scanner s = new Scanner(System.in);
    System.out.println("Masukkan jumlah hari: ");
    jumlahHari = s.nextInt();
    for(hari=1; hari<=jumlahHari;hari++){
            System.out.println("masukkan jumlah buah ke-"+ hari +",");
            jumlahBuah = s.nextInt();
            totalSemuaJumlahBuah += jumlahBuah;
        }
        System.out.println("");
        rataRataBuah = totalSemuaJumlahBuah/totalBuah;
        System.out.println("jumlah buah"+hari+"buah"+rataRataBuah);

    }
}