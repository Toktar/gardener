/**
 * Created by Kida on 29.04.2016.
 */
public class Gardener implements TemperatureListener {
    Thermometer termometer;
    Sprinkler sprinkler;
    GardenBed gardenBed;

    /*private static Gardener ourInstance = new Gardener();

    public static Gardener getInstance() {
        return ourInstance;
    }
*/
    public void temperatureChangeEvent(TemperatureChangeEvent e){
        System.out.println(e.getTemperature());
    }
    public Gardener() {
        termometer = new Thermometer();
        sprinkler = new Sprinkler();
        gardenBed = new FlowerBed();
        termometer.addTemperatureListener(this);
    }
    public void start() {
        termometer.start();

    }
}
