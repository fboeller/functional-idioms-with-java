import java.util.Optional;

public class Misc {

    // No!
    public static Optional<String> toLowercase_opt(Optional<String> str) {
	// Something
	return str;
    }

    // Instead this with Optional.map(str -> toLowercase(str))
    public static String toLowercase_nonopt(String str) {
	// Something
	return str;
    }
    
    // Yes!
    public static Optional<String> toLowercase_flatmap(String str) {
	// Something
	return Optional.ofNullable(str);
    }

}
