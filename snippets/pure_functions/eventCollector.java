static Pair<User, List<Event>> createUser(String name) {
    User user = new User();
    /* Some complex setup */
    user.setId(randomUUID());
    user.setName(name);
    return Pair.of(user, /* Some events */);
}

@Test
public void testUserCreation() {
    Pair<User, List<Event>> pair = createUser("Heinz");
    assertEquals("Heinz", user.getName());
}
