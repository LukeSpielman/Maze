public class Space {

    private String type;
    private String spaceId;
    private int row;
    private int col;
    private Space[] adjacent;
    private int adjacentCount;
    private boolean onPath;
    private boolean visited;

    public Space(String t, int r, int c, int numCols) {
        type = t;
        row = r;
        col = c;
        spaceId = Integer.toString(r * numCols + c);
        adjacent = new Space[4];
        adjacentCount = 0;
        onPath = false;
        visited = false;
    }

    public boolean isAdjacentTo(Space other) {
        if (other == null || other.isBlocked()) return false;
        int rowDiff = Math.abs(row - other.row);
        int colDiff = Math.abs(col - other.col);
        return (col == other.col && rowDiff == 1)
                || (row == other.row && colDiff == 1);
    }

    public void addAdjacent(Space s) {
        if (adjacentCount < 4) {
            adjacent[adjacentCount] = s;
            adjacentCount++;
        }
    }

    public Space[] getAdjacent() {
        Space[] result = new Space[adjacentCount];
        for (int i = 0; i < adjacentCount; i++) {
            result[i] = adjacent[i];
        }
        return result;
    }

    public String getType()    { return type; }
    public String getSpaceId() { return spaceId; }
    public int getRow()        { return row; }
    public int getCol()        { return col; }
    public boolean isBlocked() { return type.equals("X"); }
     public boolean isStart()   { return type.equals("S"); }
    public boolean isEnd()     { return type.equals("E"); }
    public boolean isOnPath()           { return onPath; }
    public void setOnPath(boolean value)    { onPath = value; }
    public boolean isVisited()          { return visited; }
    public void setVisited(boolean value)   { visited = value; }

}