static User createUser(String name) {
    User user = new User();
    /* Some complex setup */
    user.setId(randomUUID());
    user.setName(name);
    return user;
}

@Test
public void testUserCreation() {
    User user = createUser("Heinz");
    assertEquals("Heinz", user.getName());
}
