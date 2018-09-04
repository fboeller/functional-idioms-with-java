public static User find(int id) {
    if (!database.isReachable()) {
        throw new DatabaseNotReachableException();
    }
    User user = database.findUser();
}
