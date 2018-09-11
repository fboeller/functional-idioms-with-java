static String doAwesomeThing(String str)
    throws IOException { /* ... */ }

Arrays.asList("abc","d","ef")
    .stream()
    .map(str -> {
            try {
                return doAwesomeThing(str);
            } catch (IOException ex) {
                // throw new RuntimeException(ex); ?
                // Ignore ?
            }
        }
    );
