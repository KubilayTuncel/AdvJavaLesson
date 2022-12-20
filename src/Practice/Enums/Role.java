package Practice.Enums;

public enum Role {
    Role_ADMIN ("admin"),
    Role_Teacher ("teacher"),
    Role_Student("student");

    private final String name;

    Role (String name) {
        this.name = name;
    }

    public String getName () {
        return this.name;
    }

}
