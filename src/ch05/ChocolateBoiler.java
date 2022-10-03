package ch05;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	private static volatile ChocolateBoiler uniqueInstance;

	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}

	public static ChocolateBoiler getInstance() {
		if (uniqueInstance == null){		// 인스턴스가 있는지 확인 후 없으면 동기화(15번 라인)된 블록으로 진입
			synchronized (Singleton.class) {		// 이렇게 사용하면 처음에만 동기화함
				if(uniqueInstance == null) {
					uniqueInstance = new ChocolateBoiler();		// 블록에서도 다시 한번 변수가 null 인지 체크한 다음 인스턴스 생성함.
				}
			}
		}
		return uniqueInstance;
	}

	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			// 보일러에 우유와 초콜릿을 혼합한 재료를 넣음
		}
	}

	public void drain(){
		if (!isEmpty() && isBoiled()){
			// 끓인 재료를 다음 단계로 넘김
			empty = true;
		}
	}

	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			// 재료를 끓임
			boiled = true;
		}
	}

	public boolean isEmpty(){
		return empty;
	}

	public boolean isBoiled(){
		return boiled;
	}
}
