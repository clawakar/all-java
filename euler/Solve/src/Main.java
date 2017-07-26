import java.util.*;
public class Main {
    public static void main(String [] args) {
        try {
            Scanner scan = new Scanner(System.in);
            int nRows = 0;
            int nCols = 0;
            int[][] arr = new int[100][100];
            int index = 0;
            boolean isFirstRow = true;
            List<Integer> list = new ArrayList<>();
            while (scan.hasNextLine()) {
                String string = scan.nextLine();
                if (isFirstRow) {
                    nRows = Integer.parseInt(string.split(" ")[0]);
                    nCols = Integer.parseInt(string.split(" ")[1]);
                } else {
                    String[] strings = string.split(" ");

                    int[] array = Arrays.asList(strings).stream().mapToInt(Integer::parseInt).toArray();
                    arr[index] = array;
                    index++;
                }
                //System.out.println(string);
            }
            solve(arr, nRows, nCols);

        } catch (Exception e) {

        }
    }

    static List<Node> list = new ArrayList<>();

    public static void solve(int[][] arr, int nCols, int nRows) {
        for(int i =0; i < nRows ; i++){
            for(int j=0; j< nRows; j++){
                Node node = new Node(i, j, arr[i][j],null,null,null,null);
                list.add(node);
            }
        }

    }
    Node firstNode = null;
    public static void constructMatrix(){

    };

}

class Node {
    private int rowNo;
    private int colNo;
    private int val;
    private Node north;
    private Node south;
    private Node east;
    private Node west;

    public Node(int rowNo, int colNo, int val, Node north, Node south, Node east, Node west) {
        this.rowNo = rowNo;
        this.colNo = colNo;
        this.val = val;
        this.north = north;
        this.south = south;
        this.east = east;
        this.west = west;
    }

    public Node getNorth() {
        return north;
    }

    public void setNorth(Node north) {
        this.north = north;
    }

    public Node getSouth() {
        return south;
    }

    public void setSouth(Node south) {
        this.south = south;
    }

    public Node getEast() {
        return east;
    }

    public void setEast(Node east) {
        this.east = east;
    }

    public Node getWest() {
        return west;
    }

    public void setWest(Node west) {
        this.west = west;
    }

    public int getColNo() {
        return colNo;
    }

    public void setColNo(int colNo) {
        this.colNo = colNo;
    }

    public int getRowNo() {

        return rowNo;
    }

    public void setRowNo(int rowNo) {
        this.rowNo = rowNo;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}