public class Client extends Person {


    public Client() {

    }

    @Override
    public void info() {
        System.out.println("\nInfo for Clients (item, cost):");
        for (int i = 0; i < store.length; i++) {
            for (int j = 0; j < store[i].length; j++) {
                if (j == 0 || j == 2)
                    System.out.print(store[i][j] + ", ");
            }
            System.out.println();
        }
    }

    @Override
    public void cost_item(String[][] store, String item) {
        System.out.println();
        for (int i = 0; i < store.length; i++) {
            if (store[i][0].equals(item))
                System.out.print("Cost of " + store[i][0] + " = " + store[i][2] + " +20%");
        }
    }

    @Override

    public void season_print(String season_name) {
        switch (season_name) {
            case "SUMMER":
                System.out.println("The SUMMER is now." + " The season's color is " + Seasons.SUMMER.getColor());
                break;
            case "AUTUMN":
                System.out.println("The AUTUMN is now." + " The season's color is " + Seasons.AUTUMN.getColor());
                break;
            case "WINTER":
                System.out.println("The WINTER is now." + " The season's color is " + Seasons.WINTER.getColor());
                break;
            case "SPRING":
                System.out.println("The SPRING is now." + " The season's color is " + Seasons.SPRING.getColor());
                break;
        }
    }
}


