public class Cart implements HotelService{

    public void requestCart(String numberOfCarts) {
        System.out.println("Requested "+numberOfCarts+" luggage carts.");
    }

    @Override
    public void serve(String request) {
        requestCart(request);
    }
    
}