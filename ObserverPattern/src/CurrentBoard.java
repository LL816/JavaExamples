/**
 * Created by Cheryl on 2016/7/20.
 */
public class CurrentBoard implements Observer,DisplayBehavior {
    float temperature;
    float precipitation;
    float wind_speed;
    Subject weatherData;

    public CurrentBoard(WeatherData weatherData){
        this.weatherData=weatherData;
        weatherData.addObserver(this);
    }
    public void update(float temperature, float precipitation, float wind_speed){
        this.temperature=temperature;
        this.precipitation=precipitation;
        this.wind_speed=wind_speed;
        display();
    }
    public void display(){
        System.out.println("Current weather status: ");
        System.out.println("temperature: "+temperature);
        System.out.println("precipitation: "+precipitation);
        System.out.println("wind speed: "+wind_speed);
    }
}
