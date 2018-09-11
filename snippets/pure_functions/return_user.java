static User createUser(String name, EventCollector collector) {
    User user = new User();
    /* Some complex setup */
    user.setId(randomUUID());
    user.setName(name);
    collector.addAll(/* Some events */);
    return user;
}

@Test
public void testUserCreation() {
    EventCollector eventCollector = new EventCollector();
    User user = createUser("Heinz", eventCollector);
    assertEquals("Heinz", user.getName());
}
