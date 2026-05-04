import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Mazetest {

    @Test
    public void testStartAndEnd() {

        int numCols = 2;

        Space s0 = new Space("S", 0, 0, numCols);
        Space s1 = new Space("O", 0, 1, numCols);
        Space s2 = new Space("O", 1, 0, numCols);
        Space s3 = new Space("E", 1, 1, numCols);

        Space[] spaces = {s0, s1, s2, s3};

        Maze maze = new Maze(spaces, spaces.length);
        assertSame(s0, maze.getStart());
        assertSame(s3, maze.getEnd());
    }
}