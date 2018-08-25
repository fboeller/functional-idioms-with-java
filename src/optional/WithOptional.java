import java.util.Optional;

public class WithOptional {

    class Car {
	private final Optional<String> name;

	public Car(String name) {
	    this.name = Optional.ofNullable(name);
	}

	public Optional<String> getName() {
	    return this.name;
	}
    }

    class User {
	private final int id; 
	private final Optional<Car> car;
	
	public User(int id, Car car) {
	    this.id = id;
	    this.car = Optional.ofNullable(car);
	}

	public Optional<Car> getCar() {
	    return this.car;
	}
	
    }

    // No!
    public static Optional<String> getUserCarName_WTF(User user) {
	Optional<User> maybeUser = Optional.ofNullable(user);
	if (maybeUser.isPresent()) {
	    Optional<Car> maybeCar = maybeUser.get().getCar();
	    if (maybeCar.isPresent()) {
		return maybeCar.get().getName();
	    }
	}
	return Optional.empty();
    }

    // Yes!
    public static Optional<String> getUserCarName_Optional(User user) {
	return Optional.ofNullable(user)
	    .flatMap(User::getCar)
	    .flatMap(Car::getName);
    }

}
