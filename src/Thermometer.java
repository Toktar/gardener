import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutionException;


public class Thermometer {
    private ArrayList<TemperatureListener> listeners = new ArrayList<TemperatureListener>();

    public void addTemperatureListener(TemperatureListener listener){
        listeners.add(listener);
    }
    public TemperatureListener[] getTemperatureListeners(){
        return listeners.toArray(new TemperatureListener[listeners.size()]);
    }
    public void removeComDataEnableEventListener(TemperatureListener listener){
        listeners.remove(listener);
    }
    protected void changeTemperature(double temperature){
        TemperatureChangeEvent event = new TemperatureChangeEvent(this, temperature);
        for (TemperatureListener listener : listeners){
            listener.temperatureChangeEvent(event);
        }
    }


    public void start() {
        Timer timer = new Timer();
        TimerTask temperatureGenerator = new TimerTask() {
            @Override
            public void run() {
                temperatureGenerator();
            }
        };
      long delay = 2000;
        timer.schedule(temperatureGenerator, 1000, 5000);

    }

    public void temperatureGenerator() {
        /*Random random = new Random();
        if(random.nextInt(10)==1) {
            changeTemperature(30);
        }*/
        changeTemperature(30);
    }

}
