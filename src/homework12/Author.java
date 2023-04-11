package homework12;

public class Author {
    private final String fName;
    private final String lName;

    public Author(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public String getfName() {
        return this.fName;
    }

    public String getlName() {
        return this.lName;
    }
}
