interface User { Optional<String> getMiddleName(); }

public static Optional<User> findUser(int id) {
    if (id == 42) {
        return Optional.of(/* ... */);
    } else {
        return Optional.empty();
    }
}

public static Optional<String> getUserMiddleName(int id) {
    return findUser(id)
        .flatMap(user -> user.getMiddleName());
}
