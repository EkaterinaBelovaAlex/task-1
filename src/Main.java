public class Main {
    public static void main(String[] args) {
        int ticketPrice = 5156; // стоимость билета
        int bonus = 20; // количество рублей для одной бонусной мили
        int freeMiles = ticketPrice / bonus; // расчет количества бонусных миль

        System.out.println("На ваш счет начислено:");
        System.out.println((freeMiles) + " миля(ль)");
    }
}