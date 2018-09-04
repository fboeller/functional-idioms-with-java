public static void readFile() {
    FileReader fr = new FileReader("test.json");
    try {
        fr.read();
    } catch (IOException ex) {
        // TODO Handle this
    }
}

public static 
