package ch02.impl;

import ch02.DisplayElement;
import ch02.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private final WeatherData weatherData;

	public CurrentConditionsDisplay(WeatherData weatherData){
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

	@Override
	public void display() {
		System.out.println("현재 상태: 온도 " + temperature + "F, 습도 " + humidity + "%");
	}
}
