public class array2dhomework1 {
         /*
    Using 2D array create a grocery list.
Inside you should have an array of veggies, fruits, dairy and sweets.
 Retrieve all values from that array using 2 different loops.
     */
         public static void main(String[] args) {
             String[][] groceries = {
                     {"Cucumber", "Carrot", " Tomato", "Okra"},
                     {"Apple", "Mango", "Strawberry", "Grapes"},
                     {"Milk", "Cheese", "Yogurt", "Butter"},
                     {"Butterfingers", "Goobers", "Milk duds", "Candy Corn"},
             };
             for (int i = 0; i <groceries.length ; i++) {
                 for (int j = 0; j <groceries[i].length ; j++) {
                     System.out.print(groceries[i][j]+" ");
                 }
                 System.out.println();

                 }
             for (String[]row:groceries){
                 for (String col:row){
                     System.out.print(col+"  ");
                 }
                 System.out.println();
             }

             }
         }


