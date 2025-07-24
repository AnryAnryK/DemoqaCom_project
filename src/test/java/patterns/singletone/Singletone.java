package patterns.singletone;

public class Singletone {

	private  Singletone(){

	}

	private static Singletone instance;

	public static Singletone getSingletone() {
		if (instance == null) {
			instance = new Singletone();
		}
		return instance;
	}
}
