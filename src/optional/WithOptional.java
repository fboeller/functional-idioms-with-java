import java.util.Optional;

public class WithOptional {

    interface User {
	public Optional<String> getMiddleName();
    }

    public static Optional<User> findUser(int id) {
	// Some actual search
	return Optional.empty();
    }

    // No!
    public static Optional<String> getUserMiddleName_WTF(int id) {
	Optional<User> maybeUser = findUser(id);
	if (!maybeUser.isPresent()) {
	    return Optional.empty();
	}
	return maybeUser.get().getMiddleName();
    }

    // Yes!
    public static Optional<String> getUserMiddleName_Optional(int id) {
	return findUser(id)
	    .flatMap(User::getMiddleName);
    }

}
