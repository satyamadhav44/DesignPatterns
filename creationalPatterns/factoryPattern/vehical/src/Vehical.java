public class Vehical {

    public Automobile getMobility(String auto){

        switch(auto){

            case "Bus" : return new Bus();
            case "Ship" : return new Ship();
            case "AirPlane" : return new AirPlane();
            default: {
                System.out.println(" invalid selection ");
                return null;
            }

        }
    }

}
