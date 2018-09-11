public static Map<User, Double>
    findFriendsAverageAgeOfUsersWithNameHeinz(List<User> users) {
    return users
        .stream()
        .filter(user -> user.getName().equals("Heinz"))
        .collect(toMap(
            user -> user,
            user -> user
                      .getFriends()
                      .stream()
                      .map(friend -> friend.getAge())
                      .collect(averagingInt(age -> age))
        ));
}
