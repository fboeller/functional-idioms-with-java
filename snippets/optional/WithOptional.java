interface User { Optional<String> getMiddleName(); }

public static Optional<User> findUser(int id) { /* ... */ }

public static Optional<String> getUserMiddleName(int id) {
    return findUser(id)
        .flatMap(user -> user.getMiddleName());
}
