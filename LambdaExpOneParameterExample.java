@FunctionalInterface
interface Sayablee{
    public String say(String name);
}


public class LambdaExpOneParameterExample {
    public static void main(String[] args) {

        Sayablee s1 = (name) -> {
            return "Hello, " + name;
        };
        System.out.println(s1.say("Sarthak"));
    }
}
