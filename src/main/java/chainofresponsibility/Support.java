package chainofresponsibility;

/**
 * Handler(처리자)의 역할
 */
public abstract class Support {
	private String name;
	private Support next;

	public Support(String name) {
		this.name = name;
	}

	public Support setNext(Support next) {
		this.next = next;
		return next;
	}

	// 템플릿 메소드
	public final void supprt(Trouble trouble) {
		if (resolve(trouble)) {
			done(trouble);
		} else if (next != null) {
			next.supprt(trouble);
		} else {
			fail(trouble);
		}
	}

	public String toString() {
		return "[" + name + "]";
	}

	protected abstract boolean resolve(Trouble trouble);

	protected void done(Trouble trouble) {
		System.out.println(trouble + " is resolved by " + this + ".");
	}

	protected void fail(Trouble trouble) {
		System.out.println(trouble + " cannot be resolved.");
	}
}
