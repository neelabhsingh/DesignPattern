package observers_pattern.weather_station;

import observers_pattern.weather_station.Observer;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
