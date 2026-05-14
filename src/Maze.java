public class Maze {
    private Space[] spaces;
    private int size;
    private Space start;
    private Space end;

    public Maze(Space[] spaces, int size) {
        this.spaces = spaces;
        this.size = size;

        for (int i = 0; i < size; i++) {
            if (spaces[i].isStart()) {
                start = spaces[i];
            }
            if (spaces[i].isEnd()) {
                end = spaces[i];
            }
        }
    }

    public boolean solveMaze() {
        return solve(start);
    }

    private boolean solve(Space current) {
        if (current == null) {
            return false;
        }
        if (current.isVisited()) {
            return false;
        }
        current.setVisited(true);
        current.setOnPath(true);
        if (current.isEnd()) {
            return true;
        }
        Space[] neighbors = current.getAdjacent();
        for (int i = 0; i < neighbors.length; i++) {
            if (solve(neighbors[i])) {
                return true;
            }
        }
        current.setOnPath(false);
        return false;

    }

    public Space findSpace(String id) {
        for (int i = 0; i < size; i++) {
            if (spaces[i].getSpaceId().equals(id)) {
                return spaces[i];
            }
        }return null;}

    public Space getStart() {
        return start;
    }
    public Space getEnd() {
        return end;
    }
    public Space[] getSpaces() {
        return spaces;
    }
    public int getSize() {
        return size;
    }
}

