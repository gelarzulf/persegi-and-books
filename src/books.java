public class books {
    String author;
    String title;
    int price;
    int totalPrice;
    int publisher_number;

    public books (String author, String title, int price, int publisher_number) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.publisher_number = publisher_number;
    }

    public double buyBooks(int numberOfBooksBuy) {
        this.totalPrice = numberOfBooksBuy * price;
        System.out.println(" Membeli Buku " + title + " Sebanyak " + numberOfBooksBuy);
        return totalPrice;
    }

}
