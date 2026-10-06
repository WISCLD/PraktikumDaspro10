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
        int statusPendanaanPKM = 0;

        // Input data spesifik sesuai jenis kegiatan
        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || 
            jenisKegiatan.equalsIgnoreCase("BAKORMA") || 
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            System.out.print("Peringkat juara : ");
            peringkatJuara = scanner.nextInt();
        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
            statusPendanaanPKM = scanner.nextInt();
        }

        // Validasi kelengkapan dokumen dan penentuan status dana
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
                    System.out.println("Status : Dokumen lengkap, tetapi bukan juara 1, 2, atau 3. Dana penghargaan tidak diberikan.");
                }
                
            } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
                
                if (statusPendanaanPKM == 1) {
                    System.out.println("Status : Dokumen lengkap dan lolos pendanaan PKM. Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status : Dokumen lengkap, tetapi tidak lolos pendanaan PKM. Dana penghargaan tidak diberikan.");
                }
                
            } else {
                System.out.println("Status : Dokumen lengkap, namun jenis kegiatan Lainnya tidak memperoleh dana penghargaan.");
            }
        }

        scanner.close();
    }
}