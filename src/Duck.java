
public abstract class Duck {
	QuackBehavior quackBehavoir;
	FlyBehavior flyBehavior;

	public void perFormQuack() {
		quackBehavoir.quack();
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void swim() {
		System.out.println("Swim Swim");
	}
	
	
	abstract public void display();
	
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavoir = qb;
	}

}
