package ch02;

public interface Subject {
	void registerObserver(Observer o);		// 옵저버 등록
	void removeObserver(Observer o);		// 옵저버 제거
	void notifyObservers();					// Subject 상태가 변경되었을때 모든 옵저버에게 변경 내용을 알리려 호출하는 메소드.
}
