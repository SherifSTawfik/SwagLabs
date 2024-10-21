package util;

import java.util.Random;
import java.util.Random;

public class Utility {


    public class RandomNameGenerator {

        private static String[] Names = {
                "John", "Jane", "Michael", "Sarah", "David", "Emily",
                "James", "Jessica", "Robert", "Linda", "William", "Patricia",
                "Daniel", "Barbara", "Matthew", "Elizabeth"
        };

        public static String generateRandomName() {
            Random random = new Random();
            return Names[random.nextInt(Names.length)];
        }
    }


    public class RandomNumberGenerator {

        public static String generateRandomNumberString(int min, int max) {
            Random random = new Random();
            int randomNumber = random.nextInt(max - min + 1) + min; // Generates a number in the range [min, max]
            return String.valueOf(randomNumber); // Converts the number to a String
        }


    }
}
