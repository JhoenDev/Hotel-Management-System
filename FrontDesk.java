public class FrontDesk {
    private HotelService hotelServiceValet;
    private HotelService hotelServiceHouseKeeping;
    private HotelService hotelServiceCart;

    public FrontDesk(HotelService hotelServiceValet, HotelService hotelServiceHouseKeeping, HotelService hotelServiceCart) {
        this.hotelServiceValet = hotelServiceValet;
        this.hotelServiceHouseKeeping = hotelServiceHouseKeeping;
        this.hotelServiceCart = hotelServiceCart;
    }

    public void pickUpVehicle(String plateNumber){
        hotelServiceValet.serve(plateNumber);
    }

    public void cleanRoom(String roomNumber){
        hotelServiceHouseKeeping.serve(roomNumber);
    }

    public void requestCart(String numberOfCarts){
        hotelServiceCart.serve(numberOfCarts);
    }
}