package contacts.util;

public class PhoneNumberValidatorTest {

    public static void test(String number, boolean expected) {
        boolean actual = PhoneNumberValidator.isValid(number);
        boolean isPassed = actual == expected;
        System.out.printf("The Test %s is %s\n", number, isPassed ? "Passed" : "Failed");
        if (!isPassed) {
            System.out.printf("expected is %s but actual is %s\n", expected, actual);
        }
    }


    public static void main(String[] args) {
        test("+0 (123) 456-789-ABcd", true);
        test("+0(123)456-789-999", false);
        test("(123) 234 345-456", true);
    }
}
