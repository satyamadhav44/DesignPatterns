public class MainClass {
    public static void main(String[] args) throws Exception {
        
        System.out.println(" demonstration of factory design pattern ");
        Vehical v1= new Vehical();
    
        v1.getMobility("Bus").modeOfTransport();
        v1.getMobility("Ship").modeOfTransport();
        v1.getMobility("AirPlane").modeOfTransport();

    }
}
