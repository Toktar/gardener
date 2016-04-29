/**
 * Created by Kida on 29.04.2016.
 */
public class FlowerBed implements GardenBed {
    protected double timeToCome;
    protected double timeToWater;

    @Override
    public double getTimeToWater() {
        return timeToWater;
    }

    @Override
    public double getTimeToCome() {
        return timeToCome;
    }


    public FlowerBed() {
        this.timeToCome = 5;
        this.timeToWater = 10;
    }


}
