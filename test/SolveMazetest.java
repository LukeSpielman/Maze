import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SolveMazetest {
    @Test
    public void testSolveMaze() {

        GridReader reader = new GridReader();

        Maze maze = reader.MazeRead("maze.csv");

        boolean solved = maze.solveMaze();

        assertTrue(solved);
    }
}
