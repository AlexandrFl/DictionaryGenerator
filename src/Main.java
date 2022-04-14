import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        String string = "Le marché de Noël de Strasbourg est très connu et attire beaucoup de touristes. Les origines de cette foire remontent au moyen âge.";
        Consumer<String> consumer = x -> System.out.println("Начальная строка\n\"" + x + "\"\n");
        consumer.accept(string);
        dictionary.split(string);
    }
}
