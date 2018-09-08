public static Map<User, Integer> findFriendsAverageAgeOfUsersWithNameHeinz(List<User> users) {
    Map<User, Integer> results = new HashMap<>();
    users.forEach(user -> {
            if (user.getName().equals("Heinz")) {
                int sumAge = 0;
                user.getFriends().forEach(friend -> {
                        sumAge += friend.getAge();
                    });
                int averageAge = sumAge / user.getFriends().size();
                results.put(user, averageAge);
            }
        });
    return results;
}
