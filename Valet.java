public class Valet implements HotelService{

    public void pickUpVehicle(String plateNumber) {
        System.out.println("Picking up Vehicle plate number "+plateNumber+".");
    }

    @Override
    public void serve(String request) {
        pickUpVehicle(request);
    }
}