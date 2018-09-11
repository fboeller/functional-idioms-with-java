/** Does something. If str == null, 
    does something even more awesome. */
static void doSomething(String str) { /* ... */ }

Optional<String> maybeString;
doSomething(maybeString.orElse(null));

/** Finds something. Returns null, if nothing is found */
static String findSomething() { /* ... */ }

Optional<String> maybeString =
    Optional.ofNullable(findSomething());
