import java.util.Scanner;

public class StudiKasus210 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama mahasiswa : ");
        String nama = scanner.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenisKegiatan = scanner.nextLine().trim();

        System.out.print("Jumlah dokumen : ");
        int jumlahDokumen = scanner.nextInt();

        int peringkatJuara = 0;

        // Input khusus cabang lomba
        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || 
            jenisKegiatan.equalsIgnoreCase("BAKORMA") || 
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            System.out.print("Peringkat juara : ");
            peringkatJuara = scanner.nextInt();
        }

        // Validasi dokumen & logika cabang lomba
        if (jumlahDokumen < 4) {
            int kurang = 4 - jumlahDokumen;
            System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
        } else {
            if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || 
                jenisKegiatan.equalsIgnoreCase("BAKORMA") || 
                jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
                
                if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                    System.out.println("Status : Dokumen lengkap dan memenuhi syarat juara. Dana penghargaan diberikan.");
                } else {
                    System.println("Status : Dokumen lengkap, tetapi bukan juara 1, 2, atau 3. Dana penghargaan tidak diberikan.");
                }
            }
        }

        scanner.close();
    }
}