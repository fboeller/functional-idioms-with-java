static Map<User, Double>
    findFriendsAverageAgeOfUsersWithNameHeinz(List<User> users) {
    Map<User, Double> results = new HashMap<>();
    users.forEach(user -> {
        if (user.getName().equals("Heinz")) {
            double sumAge = 0;
            user.getFriends().forEach(friend -> {
                sumAge += friend.getAge();
            });
            double averageAge = sumAge / user.getFriends().size();
            results.put(user, averageAge);
        }
    });
    return results;
}
