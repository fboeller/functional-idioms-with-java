static User createUser(String name, UUID uuid) {
    User user = new User();
    /* Some complex setup */
    user.setId(uuid);
    user.setName(name);
    return user;
}

@Test
public void testUserCreation() {
    User user = createUser("Heinz", randomUUID());
    assertEquals("Heinz", user.getName());
}
