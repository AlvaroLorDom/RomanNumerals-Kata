import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(org.junit.runners.Parameterized.class)
public class NumberBreaker_ {

    private final NumberBreaker nb;
    private final int[][] values;

    public NumberBreaker_(int number, int[][] values) {
        this.values = values;
        nb = new NumberBreaker(number);
    }

    @Test
    public void execute() {
        assertThat(nb.breakdown()).isEqualTo(values);
    }

    @Parameterized.Parameters
    public static Object[][] cases(){
        return new Object[][]{
                {0,null},
                {2,new int[][]{{2,0}}},
                {10,new int[][]{{1,1}}},
                {200,new int[][]{{2,2}}},
                {302,new int[][]{{3,2},{2,0}}},
                {844,new int[][]{{8,2},{4,1},{4,0}}},
                {2501,new int[][]{{2,3},{5,2},{1,0}}},
                {2520,new int[][]{{2,3},{5,2},{2,1}}},
                {2873,new int[][]{{2,3},{8,2},{7,1},{3,0}}}
        };
    }
}