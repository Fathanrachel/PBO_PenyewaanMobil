import java.util.Scanner;

public abstract class rentall implements Rental {
    protected Scanner scanner = new Scanner(System.in);

    protected String nama;
    protected String nikktp;
    protected String notelp;
    protected String alamat;

    protected String[] mobil1 = {"Baleno", "Accord", " Civic", "Corola"};
    protected String[] mobil2 = {"Pajero  ", "Fortuner", " Almaz  ", "  CR-V  "};
    protected  String[] mobil3 = {"Brio   ", "karimun", "March  ", "Ignis  "};
    protected String[] mobil4 = {"Ferrari\t\t\t", "BMW M2 Competition", "SLK\t\t\t\t", "Buggatti\t\t\t"};


    protected String hrg1 = "Rp. 300.000";
    protected String hrg2 = "Rp. 450.000";
    protected String hrg3 = "Rp. 275.000";
    protected String hrg4 = "Rp. 800.000";
    protected String hrg5 = "/Hari";

    public void biodata(){
        scanner.nextLine();
        System.out.print("Masukkan Nama     : ");
        nama = scanner.nextLine();
        System.out.print("Masukkan NIK KTP  : ");
        nikktp = scanner.nextLine();
        System.out.print("Masukkan No Telp  : ");
        notelp = scanner.nextLine();
        System.out.print("Masukkan Alamat   : ");
        alamat = scanner.nextLine();


        System.out.println("\n=== BIODATA PEMESAN ===");
        System.out.println("Nama             : " + nama);
        System.out.println("NIK KTP          : " + nikktp);
        System.out.println("NO Telp          : " + notelp);
        System.out.println("Alamat           : " + alamat);

    }

}
