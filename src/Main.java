public class Main {
    public static void main(String[] args) {
        Shirt shirt1 = new Shirt("Nike", 29.99);
        Shirt shirt2 = new Shirt("Adidas", 24.99);
        System.out.println("Brand: " + shirt1.getBrand() + ", Price:" + shirt1.getPrice() + "e");
        System.out.println("Brand: " + shirt2.getBrand() + ", Price:" + shirt2.getPrice() + "e");
    }
}