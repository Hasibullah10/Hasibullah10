import java.util.Arrays;

public class array2dhomework4 {
    /*
    Create 2D array of countries: north america countries,
    south america countries, europe countries, asian countries, african countries.
    Then print all values from that array using 2 different loops and calculate how many total countries been stored.
     */
    public static void main(String[] args) {
        String[][] countries = {
                {"USA", "Canada", "Mexico", "Cuba",},
                {"Brazil", "Argentina", "Colombia", "Peru"},
                {"Turkey", "Germany", "France", "Finland",},
                {"Afghanistan", "India", "China", "Japan",},
                {"South Africa", "Zimbabwe", "Ethiopia", "Nigeria"},
        };
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j] + "  ");


            }
            System.out.println();
        }

            for (int i = 0; i <countries.length ; i++) {
                System.out.println(Arrays.toString(countries[i]));


            }
        System.out.println();
    }
}


















