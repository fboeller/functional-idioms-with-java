static void createUser(String name, EventCollector collector) {
    User user = new User();
    /* Some complex setup */
    user.setId(randomUUID());
    user.setName(name);
    collector.addAll(/* Some events */);
}

@Test
public void testUserCreation() {
    EventCollector eventCollector = new EventCollector();
    createUser("Heinz", eventCollector);
    assertEquals("Heinz", user.getName());
}
