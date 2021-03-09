package contacts.common;

public interface UserInterface {
    String read(String prompt);
    void printf(String format, Object... args);
}
