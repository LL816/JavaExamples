/**
 * Created by Cheryl on 2016/7/20.
 */
public class SummeryBoard implements Observer {
    float max_temperature;
    float max_precipitation;
    float max_wind_speed;
    Subject weatherData;

    public SummeryBoard(WeatherData weatherData){
        this.weatherData=weatherData;
        weatherData.addObserver(this);
    }
    public void update(float temperature, float precipitation, float wind_speed){
        if (this.max_temperature<temperature){
            this.max_temperature=temperature;
        }
        if (this.max_precipitation<precipitation){
            this.max_precipitation=precipitation;
        }
        if (this.max_wind_speed<wind_speed) {
            this.max_wind_speed = wind_speed;
        }
        display();
    }
    public void display(){
        System.out.println("Max weather status: ");
        System.out.println("Max temperature: "+max_temperature);
        System.out.println("Max precipitation: "+max_precipitation);
        System.out.println("Max wind speed: "+max_wind_speed);
    }
}
