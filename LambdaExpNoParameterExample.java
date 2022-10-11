@FunctionalInterface
interface Sayable{
    public String say();
}


public class LambdaExpNoParameterExample {
    public static void main(String[] args) {
        Sayable s = () -> {
            return "I have Nothing to Say";
        };
        System.out.println(s.say());
    }
}
