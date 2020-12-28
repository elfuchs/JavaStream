package streams1;


import java.util.Arrays;
import java.util.List;

public class JavaApplication1 {

  public static void main(String[] args) {
    List<String> maListe = Arrays.asList("a1", "a2", "b2", "b1", "c1");
    maListe.stream()
           .filter(s -> s.startsWith("b"))
           .map(String::toUpperCase)
           .sorted()
           .forEach(System.out::println);
  }
}
