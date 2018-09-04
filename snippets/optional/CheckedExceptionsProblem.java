public static String doAwesomeThing(String str) throws IOException { /* ... */ }

List.of("abc","d","ef")
    .stream()
    .map(str -> {
            try {
                return doAwesomeThing(str);
            } catch (IOException ex) {
                // Puuh...
            }
        }
    );
}
