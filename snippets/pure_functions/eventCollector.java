public static Pair<User, List<Event>> createUser(String name) {
    User user = new User();
    /* Some complex setup */
    user.setId(randomUUID());
    user.setName(name);
    return Pair.of(user, /* Some events */);
}

public static void main(String... args) {
    EventCollector eventCollector = new EventCollector();
    Pair<User, List<Event>> pair = createUser("Heinz");
    eventCollector.addAll(pair.right());
    userDAO.save(pair.left());
}
