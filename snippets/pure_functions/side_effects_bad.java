static void createUser(String name, EventCollector collector) {
    User user = new User();
    /* Some complex setup */
    user.setId(randomUUID());
    user.setName(name);
    userDAO.save(user);
    collector.addAll(/* Some events */);
}

@Test
public void testUserCreation() {
    // Mock UserDAO here
    EventCollector eventCollector = new EventCollector();
    createUser("Heinz", eventCollector);
    // Retrieve User here
    assertEquals("Heinz", user.getName());
}
