package ch02;

import ch02.impl.CurrentConditionsDisplay;
import ch02.impl.ForecastDisplay;
import ch02.impl.StatisticsDisplay;
import ch02.impl.WeatherData;

public class ObserverPattern {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		// StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		// ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(20, 3, 32.4f);
		weatherData.setMeasurements(50, 55, 31.4f);
	}
}
