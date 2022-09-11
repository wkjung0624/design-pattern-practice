package ch02.impl;

import ch02.Observer;
import ch02.Subject;
import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

	private final List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData(){
		this.observers = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers){
			observer.update();
		}
	}

	public void measurementsChanged() {
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	public float getTemperature(){
		return this.temperature;
	}
	public float getPressure(){
		return this.pressure;
	}
	public float getHumidity() {
		return this.humidity;
	}
}
