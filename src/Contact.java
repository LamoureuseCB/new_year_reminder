
public abstract class Contact {
    private String name;

    public Contact(String name) {
        this.name = name;
    }

    public abstract void sendMessage();

    public abstract void print();

    public String getName() {
        return name;
    }
}