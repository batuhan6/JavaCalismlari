public class Main {
    public static void main(String[] args) {

        Product product = new Product();

        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus");
        product.setPrice(500);
        product.setStockAmount(3);

        ProductManager productManager = new ProductManager();

        productManager.Add(product);

        System.out.println(product.getName());

        System.out.println(product.getKod());
    }
}