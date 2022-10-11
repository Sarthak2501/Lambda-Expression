import java.util.ArrayList;
import java.util.List;

public class LambdaExpForEachExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Sarthak\t");
        list.add("Saurav\t");
        list.add("Santanu\t");
        list.add("Shiwang\t");
        list.add("Sohan\t");


        list.forEach(
                (n) -> System.out.print(n)
        );

    }
}
