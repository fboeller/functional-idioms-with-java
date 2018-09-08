public static User createUser(String name, EventCollector eventCollector) {
    User user = new User();
    /* Some complex setup */
    user.setId(randomUUID());
    user.setName(name);
    eventCollector.addAll(/* Some events */);
    return user;
}

public static void main(String... args) {
    EventCollector eventCollector = new EventCollector();
    User user = createUser("Heinz", eventCollector);
    userDAO.save(user);
}
