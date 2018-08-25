public class UserCarWithoutInheritance {

    class Car {
	public void drive() {
	    // Some logic
	}
    }

    class User extends Car {

	private final Car car;

	public User(Car car) {
	    this.car = car;
	}

	public void work() {
	    // Some logic
	}
	
	public void getToWork() {
	    car.drive();
	    work();
	}
    }

}
