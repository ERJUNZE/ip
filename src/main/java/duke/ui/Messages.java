package duke.ui;

public enum Messages {
    LINE  ("_".repeat(60)),
    START ("Hello! I'm Duke" + System.lineSeparator() + "What can I do for you?"),
    EXIT  ("Bye. Hope to see you again soon!"),
    ADD   ("Got it. I've added this task:"),
    LIST  ("Here are the tasks in your list:"),
    MARK  ("Nice! I've marked this task as done:"),
    UNMARK("OK, I've marked this task as not done yet:");

    public final String MESSAGE;

    Messages(String message) {
        MESSAGE = message;
    }
}