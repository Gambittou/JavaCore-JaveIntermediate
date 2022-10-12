package Liskov;

public class Animal {public void learnToFly(Bird bird){ }
	public void learnToFly(FlyingBird flyBird){
        flyBird.fly();
    }
}