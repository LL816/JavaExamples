/**
 * Created by Cheryl on 2016/7/20.
 */
public class WeatherReport {
    public static void main(String[] args){
        WeatherData weatherData=new WeatherData();
        CurrentBoard currentBoard=new CurrentBoard(weatherData);
        SummeryBoard summeryBoard=new SummeryBoard(weatherData);
        weatherData.setWeather(1,2,3);
        weatherData.setWeather(2,1,4);
    }
}
