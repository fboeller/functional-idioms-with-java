interface User { String getMiddleName(); }

public static User findUser(int id) { /* ... */ }

public static String getUserMiddleName(int id) {
	return findUser(id).getMiddleName();
}
