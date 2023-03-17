import java.util.ArrayList;

/**
 * Peternakan
 */
public class Peternakan {
    private String binatang = "Binatang";
    private int jml = 0;
    private int hasil = 0;
    private int vaksin = 0;
    private String satuan = "Butir";
    private String namaHasil = "Telur";
    private static int jmlTernak;
    private static ArrayList<Peternakan> ternak = new ArrayList<Peternakan>();

    Peternakan(String binatang, int jml, String namaHasil, String satuan, int hasil) {
        ternak.add(this);
        jmlTernak++;
        this.binatang = binatang;
        this.jml = jml;
        this.hasil = hasil;
        this.namaHasil = namaHasil;
        this.satuan = satuan;
    }

    Peternakan() {
        ternak.add(this);
        jmlTernak++;
    }

    public void setBinatang(String binatang) {
        this.binatang = binatang;

    }

    public void setJumlah(int jml) {
        this.jml = jml;
    }

    public void setHasil(String namaHasil, String satuan, int hasil) {
        this.hasil = hasil;
        this.namaHasil = namaHasil;
        this.satuan = satuan; 
    }

    public void setVaksin(double booster) {
        vaksin = (int) (hasil * booster);
    }

    public int getVaksin() {
        return vaksin;
    }

    public static void display() {

        for (int i = 0; i < jmlTernak; i++) {
            System.out.printf("Jenis\t\t\t: %s\n", ternak.get(i).binatang);
            System.out.printf("Jumlah\t\t\t: %d ekor\n", ternak.get(i).jml);
            System.out.printf("%s/Ekor\t\t: %d %s\n", ternak.get(i).namaHasil, ternak.get(i).hasil, ternak.get(i).satuan);
            System.out.printf("%s/Ekor\t\t: %d %s (Setelah Booster)\n", ternak.get(i).namaHasil, ternak.get(i).getVaksin(),
            ternak.get(i).satuan);
            System.out.printf("Total %s/Hari \t: %d %s\n", ternak.get(i).namaHasil, ternak.get(i).jml * ternak.get(i).hasil,
            ternak.get(i).satuan);
            System.out.printf("Total %s/Hari \t: %d %s (Setelah Booster)\n", ternak.get(i).namaHasil,
            ternak.get(i).jml * ternak.get(i).getVaksin(), ternak.get(i).satuan);
            
            System.out.println("=".repeat(40));
        }

    }
}