import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class GridReader extends MazeReader {
    public Maze MazeRead(String fileName) {
        try {
            File inputFile = new File(fileName);
            Scanner countScanner = new Scanner(inputFile);
            int rowCount = 0;

            while (countScanner.hasNextLine()) {
                countScanner.nextLine();
                rowCount++;
            }

            Scanner scanner = new Scanner(inputFile);

            String[] lines = new String[rowCount];

            int index = 0;

            while (scanner.hasNextLine()) {
                lines[index] = scanner.nextLine();
                index++;
            }
            int cols = lines[0].split(",").length;

            Space[] spaces = new Space[rowCount * cols];
            int spaceCount = 0;

            for (int r = 0; r < rowCount; r++) {

                String[] parts = lines[r].split(",");

                for (int c = 0; c < cols; c++) {

                    String type = parts[c];

                    if (!type.equals("X")) {

                        Space s = new Space(type, r, c, cols);

                        spaces[spaceCount] = s;
                        spaceCount++;
                    }
                }
            }

            for (int i = 0; i < spaceCount; i++) {

                Space current = spaces[i];

                for (int j = 0; j < spaceCount; j++) {

                    Space other = spaces[j];

                    if (current.isAdjacentTo(other)) {
                        current.addAdjacent(other);
                    }
                }
            }

            Maze maze = new Maze(spaces, spaceCount);

            return maze;

        } catch (FileNotFoundException e) {

            System.out.println("File not found.");
            return null;
        }
    }
}
