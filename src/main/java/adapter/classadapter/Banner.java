package adapter.classadapter;

/**
 * Adatee(개조되는 쪽)
 * 제공되고 있는 것
 */
public class Banner {
	private String string;

	public Banner(String string) {
		this.string = string;
	}

	public void showWithParen() {
		System.out.println("(" + string + ")");
	}

	public void showWithAster() {
		System.out.println("*" + string + "*");
	}
}
