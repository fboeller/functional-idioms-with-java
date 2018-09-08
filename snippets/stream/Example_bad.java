public static Map<User, Integer> findFriendsAverageAgeOfUsersWithNameHeinz(List<User> users) {
    Map<User, Integer> results = new HashMap<>();
    for (User user: users) {
        if (user.getName().equals("Heinz")) {
            int sumAge = 0;
            for (User friend: user.getFriends()) {
                sumAge += friend.getAge();
            }
            int averageAge = sumAge / user.getFriends().size();
            results.put(user, averageAge);
        }
    }
    return results;
}
