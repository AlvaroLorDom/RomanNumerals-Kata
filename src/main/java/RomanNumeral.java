import java.util.Arrays;

public class RomanNumeral {

    private static final int MIN = 0;
    private static final int MAX = 4000;

    public static String toRomanMap(int number){
        if (number <= MIN || number >= MAX) throw new IllegalParameterException();
        return String.join("",getStringFromStream(getBreakdown(number)));
    }

    private static int[][] getBreakdown(int number) {
        return new NumberBreaker(number).breakdown();
    }

    private static String[] getStringFromStream(int[][] brokenNumber){
        return Arrays.stream(brokenNumber)
                .map(RomanMapper::getNumber)
                .toArray(String[]::new);
    }

    /*
    private String toRoman(int number){
        if (number <= MIN || number >= MAX) throw new IllegalParameterException();
        int[][] brokenNumber = new NumberBreaker(number).breakdown();
        String[] strings = Arrays.stream(brokenNumber)
                .map(i -> VALUES[i[0]][i[1]])
                .toArray(String[]::new);
        String s = String.join("",strings);
        return s;
    }

    iterate(0, l -> l + 1)
                    .limit(number().length())
                    .boxed()
                    .map(new int[]{Integer.parseInt(number().substring(i, i + 1)), number().length() - i - 1})
                    .filter(t -> t[0] != 0).toArray(int[][]::new);

        private String toRoman(int number) {
            if (number <= MIN || number >= MAX) throw new IllegalParameterException();
            if (number >= 10) return times(thousands(number), THOUSANDS) +
                    times(hundreds(number), HUNDREDS) + times(tens(number), TENS) + times(ones(number), ONES);
            return times(number, ONES);
        }

        private int thousands(int number) {
            return number / 1000;
        }

        private int ones(int number) {
            return number % 10;
        }

        private int tens(int number) {
            return number % 100 / 10;
        }

        private int hundreds(int number) {
            return number % 1000 / 100;
        }

        private String times(int offset, String[] constants) {
            if (offset == 0) return "";
            return constants[offset - 1];
        }
    */
}
