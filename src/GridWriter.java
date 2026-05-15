public class GridWriter extends MazeWriter {

    public void writeMaze(Maze maze) {

        if (maze == null) {
            System.out.println("Maze is null.");
            return;
        }

        Space[] spaces = maze.getSpaces();

        if (spaces.length == 0) {
            System.out.println("Maze is empty.");
            return;
        }

        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < spaces.length; i++) {

            if (spaces[i].getRow() > maxRow) {
                maxRow = spaces[i].getRow();
            }

            if (spaces[i].getCol() > maxCol) {
                maxCol = spaces[i].getCol();
            }
        }

        String[][] grid = new String[maxRow + 1][maxCol + 1];

        for (int r = 0; r <= maxRow; r++) {
            for (int c = 0; c <= maxCol; c++) {
                grid[r][c] = "X";
            }
        }

        for (int i = 0; i < spaces.length; i++) {

            Space s = spaces[i];

            int r = s.getRow();
            int c = s.getCol();

            if (s.isStart()) {
                grid[r][c] = "S";
            }
            else if (s.isEnd()) {
                grid[r][c] = "E";
            }
            else if (s.isOnPath()) {
                grid[r][c] = "*";
            }
            else {
                grid[r][c] = "O";
            }
        }

        for (int r = 0; r <= maxRow; r++) {

            for (int c = 0; c <= maxCol; c++) {

                System.out.print(grid[r][c]);

                if (c < maxCol) {
                    System.out.print(",");
                }
            }

            System.out.println();
        }
    }
}