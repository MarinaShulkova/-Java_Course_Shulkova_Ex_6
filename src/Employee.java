public class Employee extends Person {

    public Employee() {

    }

    @Override
    public void info() {
        System.out.println("\nInfo for Employee (item, quantity, cost):");
        for (int i = 0; i < store.length; i++) {
            for (int j = 0; j < store[i].length; j++) {
                System.out.print(store[i][j] + " ");
            }
            System.out.println();
        }

    }

    @Override
    public void cost_item(String[][] store, String item) {
        System.out.println();
        for (int i = 0; i < store.length; i++) {
            if (store[i][0].equals(item))
                System.out.print("Cost of " + store[i][0] + " = " + store[i][2] + " -10%\n");
        }
    }

    @Override

    public void season_print(String season_name) {
        switch (season_name) {
            case "SUMMER":
                System.out.println("The SUMMER is now." + " The season's color is " + Seasons.SUMMER.getColor() + ". Your vacancy in July");
                break;
            case "AUTUMN":
                System.out.println("The AUTUMN is now." + " The season's color is " + Seasons.AUTUMN.getColor() + ". Your vacancy in September");
                break;
            case "WINTER":
                System.out.println("The WINTER is now." + " The season's color is " + Seasons.WINTER.getColor() + ". The Christmas is coming");
                break;
            case "SPRING":
                System.out.println("The SPRING is now." + " The season's color is " + Seasons.SPRING.getColor() + ". Be pation, the summer almost here");
                break;
        }
    }
}
