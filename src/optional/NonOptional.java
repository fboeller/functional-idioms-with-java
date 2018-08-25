import java.util.Optional;

public class NonOptional {

    class Car {
	private final String name;

	public Car(String name) {
	    this.name = name;
	}

	public String getName() {
	    return this.name;
	}
    }

    class User {
	private final int id; 
	private final Car car;
	
	public User(int id, Car car) {
	    this.id = id;
	    this.car = car;
	}

	public Car getCar() {
	    return this.car;
	}
	
    }

    public static String getUserCarName_NoNullChecks(User user) {
	return user.getCar().getName();
    }

    public static String getUserCarName_NullChecks(User user) {
	if (user != null) {
	    Car car = user.getCar();
	    if (car != null) {
		return car.getName();
	    }
	}
	return null;
    }

}
