package uni.eszterhazy.hl5u4v.weather_observer.pull;

import java.util.ArrayList;

public class WeatherStation {
    private WeatherData data = new WeatherData();
    private ArrayList<WeatherClient> clients = new ArrayList<>();

    public void Add(WeatherClient weatherClient) {
        clients.add(weatherClient);
    }

    public WeatherData getData() {
        return this.data;
    }

    public void doMetrics(){
        //...
        this.notifyAllClient();
    }

    private void notifyAllClient() {
        for (WeatherClient client: clients ){
            client.Update();
        }
    }
}
