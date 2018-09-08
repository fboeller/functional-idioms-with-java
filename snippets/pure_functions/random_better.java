public static User createUser(String name, UUID uuid) {
    User user = new User();
    /* Some complex setup */
    user.setId(uuid);
    user.setName(name);
    return user;
}

public static void main(String... args) {
    User user = createUser("Heinz", randomUUID());
    eventCollector.addAll(/* Some events */);
    userDAO.save(user);
}
