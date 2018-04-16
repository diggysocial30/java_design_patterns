package main;

import duck.Duck;
import duck.MallardDuck;
import duck.ModelDuck;
import duck.Fly.FlyNoWay;

public class DuckSimulationApp {

	public static void main(String[] args) {
		// Mallard duck
		Duck mallard= new MallardDuck();
		mallard.display();
		mallard.fly();
		mallard.quack();
		
		// Mallard duck
		Duck modal= new ModelDuck();
		modal.display();
		modal.setFlyBehaviour(new FlyNoWay());
		modal.fly();
		modal.quack();

	}

}
