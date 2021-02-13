package uni.eszterhazy.hl5u4v.weather_observer.push;

public class WeatherClient {
    private WeatherData data;

    public void Subscribe(WeatherStation station) {
        station.Add(this);
    }

    public void Update(WeatherData data) {
        this.data = data;
        System.out.println("Client Called");
    }
}
