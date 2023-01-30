package task;

public class Deadline extends Task {
    public static final String DELIMITER = "/by ";
    protected String by;

    public Deadline(String description, String by) {
        super(description);
        this.by = by;
    }

    @Override
    public String toString() {
        return " [D]" + super.toString() + "(by: " + by + ")";
    }
}