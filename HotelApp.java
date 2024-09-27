public class HotelApp {
    public static void main(String[] args) {
        HotelService hotelServiceValet = new Valet();
        HotelService hotelServiceHouseKeeping = new HouseKeeping();
        HotelService hotelServiceCart = new Cart();

        FrontDesk facade = new FrontDesk(hotelServiceValet , hotelServiceHouseKeeping, hotelServiceCart);

        facade.cleanRoom("123");
        facade.pickUpVehicle("ABC123");
        facade.requestCart("5");
    }
    
}