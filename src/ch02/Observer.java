package ch02;

public interface Observer {
	void update(float temp, float humidity, float pressure); // WeatherData 의 정보 변경 시 옵저버에게 전달되는 값
}
