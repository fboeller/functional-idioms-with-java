import java.util.Optional;

public class NonOptional {

    interface User {
	/**
	 * Returns the middle name of the user.
	 * Returns null, if the user does not have a middle name.
	 */
	public String getMiddleName();
    }

    /**
     * Searches for the user with the given id.
     * Returns null, if no user with the given id exists.
     */
    public static User findUser(int id) {
	// Some actual search
	return null;
    }

    public static String getUserMiddleName_NoNullChecks(int id) {
	return findUser(id).getMiddleName();
    }

    public static String getUserMiddleName_NullChecks(int id) {
	User user = findUser(id);
	if (user == null) {
	    return null;
	}
	return user.getMiddleName();
    }

}
