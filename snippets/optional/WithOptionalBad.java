interface User { Optional<String> getMiddleName(); }

public static Optional<User> findUser(int id) {
    if (id == 42) {
        return Optional.of(/* ... */);
    } else {
        return Optional.empty();
    }
}

public static Optional<String> getUserMiddleName(int id) {
    Optional<User> maybeUser = findUser(id);
    if (!maybeUser.isPresent()) {
        return Optional.empty();
    }
    return maybeUser.get().getMiddleName();
}
