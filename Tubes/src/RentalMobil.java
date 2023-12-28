public class RentalMobil extends rentall {

    public void jalankanProgramRental() {
        char yaa = 'y', yee = 'y';

        String kata1 = "~~~~~~~~~~ Terima kasih telah";
        String kata2 = " Rental Mobil dikami ~~~~~~~~~~";

        String data1 = " RENTAL MO";
        String data2 = "BIL JAYA ";

        while (yaa == 'y') {
            int code, tipe, sport, suv, sedan, city, jumlahHari;

            System.out.println("====================> RENTAL MOBIL JAYA <====================\n");
            System.out.println("-------------------------------------------------------------");
            System.out.println("| NO |                        MENU                          |");
            System.out.println("-------------------------------------------------------------");
            System.out.println("| 01 |                     Sewa Mobil                       |");
            System.out.println("-------------------------------------------------------------");
            System.out.println("| 02 |                       Keluar                         |");
            System.out.println("-------------------------------------------------------------\n");
            System.out.print("\n Masukkan Nomor : ");
            code = scanner.nextInt();

            switch (code) {
                case 1:
                    System.out.print("\033[2J\033[2H");
                    data1 += data2;
                    System.out.println("====================>" + data1 + "<====================\n");
                    System.out.println("|======|=======================|============================|");
                    System.out.println("| KODE |       TIPE MOBIL      |           Harga            |");
                    System.out.println("|======|=======================|============================|");
                    System.out.println("|  01  |      Mobil Sedan      |       300.000/Hari         |");
                    System.out.println("|======|=======================|============================|");
                    System.out.println("|  02  |       Mobil SUV       |       450.000/Hari         |");
                    System.out.println("|======|=======================|============================|");
                    System.out.println("|  03  |        City Car       |       275.000/Hari         |");
                    System.out.println("|======|=======================|============================|");
                    System.out.println("|  04  |       Mobil Sport     |       800.000/Hari         |");
                    System.out.println("|======|=======================|============================|\n");

                    System.out.println("-------------------------------------------------------------");
                    System.out.print("Silihkan Pilih Kode(1-4): ");
                    tipe = scanner.nextInt();
                    System.out.println();
                    System.out.println();
                    System.out.print("Masukkan jumlah hari sewa: ");
                    jumlahHari = scanner.nextInt();
                    System.out.println();

                    if (tipe == 1) {
                        System.out.println("===================================");
                        System.out.println("| No |     Tipe Mobil Sedan       |");
                        System.out.println("===================================");
                        for (int i = 0; i < 4; i++) {
                            System.out.println("|" + (i + 1) + "   |         " + mobil1[i] + "             |");
                            System.out.println("===================================");
                        }
                        System.out.print("Silahkan Tipe Mobil(1-4): ");
                        sedan = scanner.nextInt();
                        System.out.println();
                        biodata();
                        System.out.println("Tipe Mobil       : " + mobil1[sedan - 1]);
                        int totalBiaya = jumlahHari * Integer.parseInt(hrg1.replaceAll("[\\D]", ""));
                        System.out.println("Total bayar      : Rp. " + totalBiaya);
                    } else if (tipe == 2) {
                        System.out.println("===================================");
                        System.out.println("| No |      Tipe Mobil SUV        |");
                        System.out.println("===================================");
                        for (int j = 0; j < 4; j++) {
                            System.out.println("|" + (j + 1) + "   |         " + mobil2[j] + "           |");
                            System.out.println("===================================");
                        }
                        System.out.print("Silahkan Tipe Mobil(1-4): ");
                        suv = scanner.nextInt();
                        System.out.println();
                        biodata();
                        System.out.println("Tipe Mobil       : " + mobil2[suv - 1]);
                        int totalBiaya = jumlahHari * Integer.parseInt(hrg2.replaceAll("[\\D]", ""));
                        System.out.println("Total bayar      : Rp. " + totalBiaya);
                    } else if (tipe == 3) {
                        System.out.println("===================================");
                        System.out.println("| No |       Tipe City Car        |");
                        System.out.println("===================================");
                        for (int k = 0; k < 4; k++) {
                            System.out.println("|" + (k + 1) + "   |       " + mobil3[k] + "              |");
                            System.out.println("===================================");
                        }
                        System.out.print("Silahkan Tipe Mobil(1-4): ");
                        city = scanner.nextInt();
                        System.out.println();
                        biodata();
                        System.out.println("Tipe Mobil       : " + mobil3[city - 1]);
                        int totalBiaya = jumlahHari * Integer.parseInt(hrg3.replaceAll("[\\D]", ""));
                        System.out.println("Total bayar      : Rp. " + totalBiaya);
                    } else if (tipe == 4) {
                        System.out.println("===================================");
                        System.out.println("| No |     Tipe Mobil Sport       |");
                        System.out.println("===================================");
                        for (int l = 0; l < 4; l++) {
                            System.out.println("|" + (l + 1) + "   |    " + mobil4[l] + "      |");
                            System.out.println("===================================");
                        }
                        System.out.print("Silahkan Tipe Mobil(1-4): ");
                        sport = scanner.nextInt();
                        System.out.println();
                        biodata();
                        System.out.println("Tipe Mobil       : " + mobil4[sport - 1]);
                        int totalBiaya = jumlahHari * Integer.parseInt(hrg4.replaceAll("[\\D]", ""));
                        System.out.println("Total bayar      : Rp. " + totalBiaya);
                    } else {
                        System.out.println("nomor yang dimasukkan salah\n\n");
                    }
                    break;

                default:
                    while (yee == 'y') {
                        System.out.println();
                        System.out.print("Apakah Ingin Rental Mobil Lagi? (y/n) :\n\n\t>>> ");
                        yaa = scanner.next().charAt(0);
                        if (yaa == 'y' || yaa == 'Y') {
                            break;
                        } else if (yaa == 'n' || yaa == 'N') {
                            break;
                        } else {
                            yee = 'y';
                        }
                    }
            }
        }

        kata1 += kata2;
        System.out.println(kata1);
    }
}
