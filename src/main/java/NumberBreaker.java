import java.util.stream.Stream;

import static java.util.stream.IntStream.iterate;

class NumberBreaker {
    private final int number;

    int[][] breakdown() {
        if (number <= 0 || number >= 4000) return null;
        return streamCreator()
                .map(this::tupleOf)
                .filter(NumberBreaker::isNotZero).toArray(int[][]::new);
    }

    private static boolean isNotZero(int[] tuple) {
        return tuple[0] != 0;
    }

    private int[] tupleOf(Integer i) {
        return new int[]{Integer.parseInt(number().substring(i, i + 1)), number().length() - i - 1};
    }

    private String number() {
        return String.valueOf(number);
    }

    private Stream<Integer> streamCreator() {
        return iterate(0, l -> l + 1)
                .limit(number().length())
                .boxed();
    }

    NumberBreaker(int number) {
        this.number = number;
    }

      /*
        public static int[][] decompose(int number) {
            int[][] res = new int[decimals(number)][2];
            for (int i = res.length , j = 0; i > 0; i--, j++) {
                if (number % 10 == 0) {
                    i++;
                } else {
                    res[i-1][0] = number%10;
                    res[i-1][1] = j;
                }
                number /= 10;
            }
            return res;
        }

    private static int decimals(int number) {
        int i = (number == 0) ? 0 : 1;
        while (number / 10 > 0) {
            if(number % 10 != 0) i++;
            number /= 10;
        }
        return i;
    }

    */
}
