public class main {
    public static void main (String[] args) {
        persegi kotak = new persegi(14);
        System.out.println("Luas Persegi: " + kotak.getLuas());
        System.out.println("Keliling Persegi: " + kotak.getKeliling());


        books booksA = new books("Ahmad", "Komedi", 3000, 3);
        books booksB = new books("Raju", "Network Engeneering", 2800, 3);

        double totalPrice = booksA.buyBooks(4) + booksB.buyBooks(5);
        System.out.println("\n" + "Total Harga Yang Harus Dibayar Rp." + totalPrice);
    }
}
