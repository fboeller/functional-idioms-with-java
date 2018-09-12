interface User { Optional<String> getMiddleName(); }

public static Optional<User> findUser(int id) { /* ... */ }

public static String getUserMiddleName(int id) {
	User user = findUser(id);
	if (user == null) {
	    return null;
	}
	return user.getMiddleName();
}
