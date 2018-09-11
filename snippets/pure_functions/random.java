static User createUser(String name, Supplier<UUID> randomUUID) {
    User user = new User();
    /* Some complex setup */
    user.setId(randomUUID());
    user.setName(name);
    return user;
}

public static void main(String... args) {
    EventCollector eventCollector = new EventCollector();
    User user = createUser("Heinz", UUID::randomUUID);
    eventCollector.addAll(/* Some events */);
    userDAO.save(user);
}
