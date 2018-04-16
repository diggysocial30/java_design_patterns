package duck;

import duck.Fly.FlyNoWay;
import duck.quack.Squeak;

public class ModelDuck extends Duck {

	public ModelDuck(){
		flyBehaviour=new FlyNoWay();
		quackBehaviour=new Squeak();
	}
	
	public void display() {
		System.out.println("Hey ,, I am model !!!!");

	}

}
