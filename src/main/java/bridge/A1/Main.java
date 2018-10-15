package bridge.A1;

import bridge.A1.function.CountDisplay;
import bridge.A1.function.Display;
import bridge.A1.function.RandomDisplay;
import bridge.A1.implement.StringDisplayImpl;

public class Main {
	public static void main(String[] args) {
		Display d1 = new Display(new StringDisplayImpl("Hello, Korea."));
		Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));

		CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));
		RandomDisplay d4 = new RandomDisplay(new StringDisplayImpl("Random"));

		d1.display();
		d2.display();
		d3.display();
		d3.multiDisplay(5);
		d4.randomDisplay(10);
	}
}
