@FunctionalInterface
interface Sayable01{
    String say(String message);
}

public class LambdaExpMultipleStatementExample {
    public static void main(String[] args) {
        Sayable01 person = (message) -> {
            String str1 = "I would like to say , ";
            String str2 = str1 + message;
            return str2;
        };

        System.out.println(person.say("I enjoy coding"));
    }
}
