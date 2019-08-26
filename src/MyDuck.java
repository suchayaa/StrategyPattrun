
public class MyDuck extends Duck {

	public MyDuck() {
		quackBehavoir = new MuteQuack();
		flyBehavior = new FlyNoWay();
	}
	
	
	public void display() {
		System.out.print("My Duck is happy");

	}
	
	

}
