static Map<User, Double>
    findFriendsAverageAgeOfUsersWithNameHeinz(List<User> users) {
    Map<User, Double> results = new HashMap<>();
    for (User user: users) {
        if (user.getName().equals("Heinz")) {
            double sumAge = 0;
            for (User friend: user.getFriends()) {
                sumAge += friend.getAge();
            }
            double averageAge = sumAge / user.getFriends().size();
            results.put(user, averageAge);
        }
    }
    return results;
}
