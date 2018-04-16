package weather.subject;

import java.util.ArrayList;
import java.util.List;

import weather.observer.Observer;

public class WeatherData implements Subject {

	private List observers;
	private float temp;
	private float humidity;
	private float pressure;
	
	public WeatherData(){
		observers= new ArrayList();
	}
	public void registerObserver(Observer o) {
		observers.add(o);

	}

	public void removeObserver(Observer o) {
		int i=observers.indexOf(o);
		if(i>=0){
			observers.remove(i);
		}

	}

	public void notifyObserver() {
		for (int i =0; i < observers.size();i ++){
			Observer observer=(Observer) observers.get(i);
			observer.update(temp,humidity, pressure);
		}

	}
	
	public void measurementsChanged(){
		notifyObserver();
	}

	public void setMeasurements(float pTemperature, float pHumidity, float pPressure){
		this.temp=pTemperature;
		this.humidity=pHumidity;
		this.pressure=pPressure;
		
		measurementsChanged();
	}
}
