public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a maze file.");
            return;
        }

        GridReader reader = new GridReader();
        Maze maze = reader.MazeRead(args[0]);

        if (maze == null) {
            return;
        }

        boolean solved = maze.solveMaze();

        if (!solved) {
            System.out.println("No solution exists.");
            return;
        }

        GridWriter writer = new GridWriter();
        writer.writeMaze(maze);
    }
}