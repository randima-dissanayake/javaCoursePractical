import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Thilini",65);
        map.put("Hansika",95);
        map.put("Primali",100);
        map.put("kalani",40);
        map.put("kasuni",30);

        List<String> student = map.entrySet().stream()
                .filter(s->s.getValue()>60)
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(student);

    }
}
