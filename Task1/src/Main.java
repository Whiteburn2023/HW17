import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Wine wine = new Wine("Три топора", "Вина Кубани",
                "РФ", LocalDate.of(2001, 1, 1),
                "Супер редкое вино с изящным вкусом портвейна");

        wine.winePeriod(LocalDate.of(2010, 1, 1));
        System.out.println(wine.getWineName());
        //todo создайте класс Wine. Протестируйте его работу в этом методе.


    }
}