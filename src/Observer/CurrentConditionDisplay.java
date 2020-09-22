package Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humility;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humility, float pressure) {
        this.temperature = temperature;
        this.humility = humility;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + " F degree and "
        + humility + "% humility");
    }
}
