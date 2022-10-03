package ch05;

class Singleton {
	private static Singleton uniqueInstance;
	private Singleton(){}

	public static Singleton getInstance(){
		if(uniqueInstance == null){
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
}

public class ClassicSingletonPattern {
	public static void main(String[] args) {
		Singleton inst1 = Singleton.getInstance();
		Singleton inst2 = Singleton.getInstance();

		System.out.println(System.identityHashCode(inst1));
		System.out.println(System.identityHashCode(inst2));
	}
}
