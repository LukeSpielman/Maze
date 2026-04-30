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

