interface User { Optional<String> getMiddleName(); }

public static Optional<User> findUser(int id) {
    return id == 42
        ? Optional.of(/* ... */)
        : Optional.empty();
}

public static Optional<String> getUserMiddleName(int id) {
    Optional<User> maybeUser = findUser(id);
    if (!maybeUser.isPresent()) {
        return Optional.empty();
    }
    return maybeUser.get().getMiddleName();
}
