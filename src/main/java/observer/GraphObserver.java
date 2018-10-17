package observer;

/**
 * ConcreateObserver(구체적인 관리자)의 역할
 * 간이 그래프 표현
 */
public class GraphObserver implements Observer {
	public void update(NumberGenerator generator) {
		System.out.print("GraphObserver:");
		int count = generator.getNumber();

		for (int i = 0; i < count; i++) {
			System.out.print("*");
		}
		System.out.println("");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}
	}
}
