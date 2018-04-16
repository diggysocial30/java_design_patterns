package weather.display;

import weather.observer.Observer;
import weather.subject.Subject;

public class CurrentConditionDisplay implements DisplayElement, Observer {

	private float humidity;
	private float temperature;
	private float pressure;
	private Subject weatherData;

	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();

	}

	public void display() {
		System.out.println("Current weather conditions are humidity : " + this.humidity + " Pressure :: "
				+ this.pressure + " Temp :: " + this.temperature);

	}

}
