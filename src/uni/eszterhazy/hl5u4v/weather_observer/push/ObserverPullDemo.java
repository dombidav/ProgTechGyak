package uni.eszterhazy.hl5u4v.weather_observer.push;

public class ObserverPullDemo {
    static public void main(){
        WeatherStation station = new WeatherStation();
        WeatherClient client1 = new WeatherClient();
        WeatherClient client2 = new WeatherClient();

        client1.Subscribe(station);
        client2.Subscribe(station);

        station.doMetrics();
    }
}
