package storage;


import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 * Persists sensor data. Observable, its observers are notified when data is added it to.
 */
public class DataRepository extends Observable { // TODO make this an Observable

    private ArrayList<SensorData> data;
    private ArrayList<Observer> observers;

    public DataRepository() {
        this.data = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public void addData(SensorData dataRecord){
        data.add(dataRecord);
        notifyObservers(dataRecord);
    }

    @Override
    public synchronized void addObserver(Observer o) {
        this.observers.add(o);
    }

    private void notifyObservers(SensorData dataRecord) {
        for(Observer o : this.observers) {
            o.update(this, dataRecord);
        }
    }

    public ArrayList<SensorData> getData() {
        return this.data;
    }

    // TODO implement a method to get the stored data (needed by the strategies)
}


