class Product {
    private final String namaProduk;
    private final int hargaProduk;
    private final int quantity;

    Product(String namaProduk, int hargaProduk, int quantity) {
        this.namaProduk = namaProduk;
        this.hargaProduk = hargaProduk;
        this.quantity = quantity;
    }
}

public class Main {
    public static void main(String[] args) {
        // Berikut adalah list produk yang dibeli oleh Els.id Purwokerto
        // sebagai stock barang mereka
        Product[] input = new Product[] {
                new Product("Case Iphone 11/Pro", 99000, 30),
                new Product("Redmi Watch Lite 2", 800000, 18),
                new Product("Apple Watch Series 7", 5115000, 40),
                new Product("Lenovo Ideapad 3", 6320000, 23),
                new Product("Rexus Mouse Wireless", 89000, 40),
                new Product("NOIR 1 Pro Grey 65%", 999000, 14),
                
        };
        // Buatlah sebuah program yang menampilkan
        // nama produk, harga, dan quantity dari masing - masing produk (hint: menggunakan for each atau for loop)
        // Jika barang tersebut harganya lebih dari sama dengan 1 juta,
        // maka tampilkan "Barang Mahal"
        // Jika barang tersebut harganya lebih dari sama dengan 500 ribu
        // dan kurang dari 1 juta, tampilkan "Barang Kurang Mahal"
        // Jika barang tersebut harganya kurang dari 500 ribu,
        // tampilkan "Barang tidak Mahal"
        // Tampilkan juga total harga yang harus dibayar oleh Els.id Purwokerto
    }
}