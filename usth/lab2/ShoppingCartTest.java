public class ShoppingCartTest {
    public static void main(String[] args){
        ShoppingCart cart = new ShoppingCart();

        cart.addToCart("Banana");
        cart.addToCart("Apple");
        cart.addToCart("Orange");

        cart.removeToCard("Banana");
        cart.removeToCard("Orange");

        cart.checkout();
        cart.checkout();
    }
}
