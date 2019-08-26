
public class MallardDuck extends Duck {
	public MallardDuck() {
		quackBehavoir = new Quack();
		flyBehavior = new FlyWithWing();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a real Mallard duck");
	}

}
