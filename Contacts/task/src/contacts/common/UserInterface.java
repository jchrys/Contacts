package contacts.common;

public interface UserInterface {
    String read(String prompt, Object... args);
    void printf(String format, Object... args);
}
