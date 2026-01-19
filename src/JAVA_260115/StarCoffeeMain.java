package JAVA_260115;

public class StarCoffeeMain {
    public static void main(String[] args) {

        StarCoffeeMenu order1
                = new StarCoffeeMenu("디카페인라떼");
        order1.showMenu();

        StarCoffeeMenu order2
                = new StarCoffeeMenu("카페라떼", "venti");
        order2.showMenu();

        StarCoffeeMenu order3
                = new StarCoffeeMenu("아이스아메리카노","Grande",false);
        order3.showMenu();

    }
}
