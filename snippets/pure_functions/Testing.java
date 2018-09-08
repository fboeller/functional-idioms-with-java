@Test
public void testUserCreation() {
    User user = createUser("Heinz", randomUUID());
    assertEquals("Heinz", user.getName());
}
