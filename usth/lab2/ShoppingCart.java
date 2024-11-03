import java.util.ArrayList;
import java.util.List;

public class ShoppingCart{
    private List<String> cartContents;

    public ShoppingCart(){
        this.cartContents = new ArrayList<>();
    }

    public List<String> getCartContents(){
        return new ArrayList<>(cartContents);
    }

    public void setCartContents(List<String> newCartContents){
        this.cartContents = new ArrayList<>(newCartContents);
    }
    public void addToCart(String cartContent){
        cartContents.add(cartContent);
        System.out.println(cartContent + "added to cart. ");
    }
    public void removeToCard(String cartContent){
        if(cartContents.contains(cartContent)){
            cartContents.remove(cartContent);
            System.out.println(cartContent +"removed from Cart");
        }
        else{
            System.out.println("do not element");
        }
    }
    public void checkout(){
        if(cartContents.isEmpty()){
            System.out.println("Your cart is empty");
        }
        else{
            System.out.println("Checking out the following items");
            for(String item:cartContents){
            System.out.println("- " + item);
            }
            cartContents.clear();
        }
    }



}