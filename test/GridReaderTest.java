import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class GridReaderTest {
    @Test
    void readMaze() {
        GridReader reader = new GridReader();
        Maze maze = reader.MazeRead("Maze.csv");
        assertNotNull(maze);
        assertNotNull(maze.getStart());
        assertTrue(maze.getStart().isStart());
        assertEquals(1, maze.getStart().getRow());
        assertEquals(0, maze.getStart().getCol());
        assertNotNull(maze.getEnd());
        assertTrue(maze.getEnd().isEnd());
        assertEquals(5, maze.getEnd().getRow());
        assertEquals(7, maze.getEnd().getCol());
        assertEquals(22, maze.getSize());
    }
    @Test
    void readSample() {
        GridReader reader = new GridReader();
        Maze maze = reader.MazeRead("Maze.csv");
        assertNotNull(maze);
        assertNotNull(maze.getStart());
        assertTrue(maze.getStart().isStart());
        assertEquals(0, maze.getStart().getRow());
        assertEquals(3, maze.getStart().getCol());
        assertNotNull(maze.getEnd());
        assertTrue(maze.getEnd().isEnd());
        assertEquals(7, maze.getEnd().getRow());
        assertEquals(6, maze.getEnd().getCol());
        assertEquals(29, maze.getSize());
    }
}