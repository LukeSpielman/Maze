public class Maze {

    // array to store all spaces in the maze
    private Space[] spaces;

    // total number of spaces
    private int size;

    // starting space of the maze
    private Space start;

    // ending space of the maze
    private Space end;

    // constructor initializes the maze with spaces and size
    public Maze(Space[] spaces, int size) {
        this.spaces = spaces; // assign input spaces to class field
        this.size = size;     // assign input size to class field

        // loop through spaces to find start and end
        for (int i = 0; i < size; i++) {

            // check if current space is the start
            if (spaces[i].isStart()) {
                start = spaces[i]; // set start space
            }

            // check if current space is the end
            if (spaces[i].isEnd()) {
                end = spaces[i]; // set end space
            }
        }
    }

    // method to find a space by its ID
    public Space findSpace(String id) {

        // loop through all spaces
        for (int i = 0; i < size; i++) {

            // check if the current space ID matches the given ID
            if (spaces[i].getSpaceId().equals(id)) {
                return spaces[i]; // return the matching space
            }
        }return null;}

    // returns the start space
    public Space getStart() {
        return start;
    }

    // returns the end space
    public Space getEnd() {
        return end;
    }

    // returns all spaces
    public Space[] getSpaces() {
        return spaces;
    }

    // returns the number of spaces
    public int getSize() {
        return size;
    }
}

