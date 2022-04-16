public class Main {
    public static void main(String[] args) {

        Person item1 = new Client();
        Person item2 = new Employee();
        String[][] array;



        item1.info();
        item2.info();
        item1.cost_item(item1.store, "coat");
        item2.cost_item(item2.store, "coat");
        item1.season_print("SUMMER");
        item2.season_print("SUMMER");


    }
        public static void print_array(String[][] array){
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {

                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
    }
}

