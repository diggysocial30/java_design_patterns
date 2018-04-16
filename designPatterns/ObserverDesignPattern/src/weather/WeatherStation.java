package weather;

import weather.display.CurrentConditionDisplay;
import weather.subject.WeatherData;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData=new WeatherData();
		CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
		
		weatherData.setMeasurements(10, 20, 30);
		weatherData.setMeasurements(30, 40, 50);
		weatherData.setMeasurements(50, 60, 70);

	}

}
