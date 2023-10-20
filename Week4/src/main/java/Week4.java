public class Week4 {

    /**
     * Returns the maximum of the two specified integers.
     *
     * @param a - The first integer.
     * @param b - The second integer.
     * @return the greater one.
     */
    public static int max2Int(int a, int b) {
        return Math.max(a, b);
    }

    /**
     * Returns the minimum element in the specified integer array.
     *
     * @param array - An integer array to inspect.
     * @return the minimum element in the array.
     */
    public static int minArray(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int min = array[0];

        for (int i = 1; i < array.length; ++i) {
            min = Math.min(min, array[i]);
        }

        return min;
    }

    /**
     * Calculates the Body Mass Index (BMI) of a person
     * with given weight and height, then returns the
     * corresponding BMI classification.
     *
     * @param weight - The weight of the person, in kilograms.
     * @param height - The height of the person, in meters.
     * @return the computed BMI classification. Possible values:
     *      - Thiếu cân
     *      - Bình thường
     *      - Thừa cân
     *      - Béo phì
     */
    public static String calculateBMI(double weight, double height) {
        double bmi = weight / (height * height);

        bmi = Math.round(bmi * 10.0) / 10.0;

        if (bmi < 18.5) {
            return "Thiếu cân";
        } else if (bmi >= 18.5 && bmi <= 22.9) {
            return "Bình thường";
        } else if (bmi >= 23 && bmi <= 24.9) {
            return "Thừa cân";
        } else {
            return "Béo phì";
        }
    }
}