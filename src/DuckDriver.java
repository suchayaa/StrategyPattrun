
public class DuckDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck mduck = new MallardDuck();
		mduck.performFly();
		mduck.perFormQuack();
		mduck.swim();
		mduck.display();
		mduck.setFlyBehavior(new FlyNoWay());
		mduck.performFly();
		mduck.setFlyBehavior(new FlyWithRocket());
		mduck.performFly();
		
		Duck myDuck= new MyDuck();
		myDuck.performFly();
		myDuck.perFormQuack();
		myDuck.swim();
		myDuck.display();
		
	}

}
