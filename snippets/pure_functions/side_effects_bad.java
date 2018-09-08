public static void createUser(String name, EventCollector eventCollector) {
    User user = new User();
    /* Some complex setup */
    user.setId(randomUUID());
    user.setName(name);
    userDAO.save(user);
    eventCollector.addAll(/* Some events */);
}

public static void main(String... args) {
    EventCollector eventCollector = new EventCollector();
    createUser("Heinz", eventCollector);
}
