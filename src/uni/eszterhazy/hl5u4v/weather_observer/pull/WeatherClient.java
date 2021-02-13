package uni.eszterhazy.hl5u4v.weather_observer.pull;

public class WeatherClient {
    private WeatherData data;
    private WeatherStation station;
    private boolean needRefresh;

    public void Subscribe(WeatherStation station) {
        station.Add(this);
        this.station = station;
    }

    public void Update() {
        if(needRefresh){
            data = station.getData(); //PULL
            System.out.println("Client Called");
        }
    }
}
