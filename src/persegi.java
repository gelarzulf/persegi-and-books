/**
 * persegi
 */
public class persegi {

    private double sisi;
    private double Luas;
    private double Keliling;

    public persegi (double sisi) {
        this.sisi = sisi;
        System.out.println("Sisi Persegi Adalah " + sisi);

    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
        System.out.println("Sisi Persegi Adalah " + sisi);
    }

    public double getLuas() {
        Luas = sisi * sisi;
        return Luas;
    }

    public double getKeliling() {
        Keliling = sisi * 4;
        return Keliling;
    }
}