public class HouseKeeping implements HotelService {

    public void cleanRoom(String roomNumber) {
        System.out.println("Requested room cleaning at Room "+roomNumber+".");
    }

    @Override
    public void serve(String request) {
        cleanRoom(request);
    }
}