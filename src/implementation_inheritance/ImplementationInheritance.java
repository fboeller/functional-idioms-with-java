public class ImplementationInheritance {

    class Car {
	public void drive() {
	    // Some logic
	}
    }

    class User extends Car {

	public void work() {
	    // Some logic
	}
	
	public void getToWork() {
	    drive();
	    work();
	}
    }

}

