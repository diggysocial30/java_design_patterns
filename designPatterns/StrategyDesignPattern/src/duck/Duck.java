package duck;

public abstract class Duck {
	protected FlyBehaviour flyBehaviour;
	protected QuackBehaviour quackBehaviour;

	public Duck() {

	}

	/**
	 * @return the flyBehaviour
	 */
	public FlyBehaviour getFlyBehaviour() {
		return flyBehaviour;
	}

	/**
	 * @param flyBehaviour
	 *            the flyBehaviour to set
	 */
	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}

	/**
	 * @return the quackBehaviour
	 */
	public QuackBehaviour getQuackBehaviour() {
		return quackBehaviour;
	}

	/**
	 * @param quackBehaviour
	 *            the quackBehaviour to set
	 */
	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}

	public abstract void display();

	public void fly() {
		flyBehaviour.fly();
	}

	public void quack() {
		quackBehaviour.quack();
	}

	public void swim() {
		System.out.println("All ducks swim !!!");
	}
}
