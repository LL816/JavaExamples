import java.util.ArrayList;

/**
 * Created by Cheryl on 2016/7/20.
 */
public class WeatherData implements Subject {
    ArrayList<Observer> observerList;
    float temperature;
    float precipitation;
    float wind_speed;

    public WeatherData(){
        observerList = new ArrayList();
    }
    public void addObserver(Observer potentialObserver){
        observerList.add(potentialObserver);
    }
    public void removeObserver(Observer potentialObserver){
        if (observerList.indexOf(potentialObserver)>-1){
            observerList.remove(potentialObserver);
        }
    }
    public void notifyObserver(){
        if(!observerList.isEmpty()){
            for(int ob=0;ob<observerList.size();ob++){
                observerList.get(ob).update(temperature, precipitation, wind_speed);
            }
        }
    }
    public void weatherChange(){
        notifyObserver();
    }
    public void setWeather(float temperature, float precipitation, float wind_speed){
        this.temperature = temperature;
        this.precipitation = precipitation;
        this.wind_speed = wind_speed;
        weatherChange();
    }

}
