package Practice;

public class Maze {
    private static int n = 8;
    private static int[][] maze = {
            {0, 0, 0, 0, 0, 0, 0, 1},
            {0, 1, 1, 0, 1, 1, 0, 1},
            {0, 0, 0, 1, 0, 0, 0, 1},
            {0, 1, 0, 0, 1, 1, 0, 0},
            {0, 1, 1, 1, 0, 0, 1, 1},
            {0, 1, 0, 0, 0, 1, 0, 1},
            {0, 0, 0, 1, 0, 0, 0, 1},
            {0, 1, 1, 1, 0, 1, 0, 0}};
    private static final int pathwayColor = 0;
    private static final int wallColor = 1;
    private static final int blockedColor = 2;
    private static final int pathColor = 3;
    private static final int exit = 4;

    public static boolean findMazePath(int x, int y) {
        if (x < 0 || y < 0 || x >= n || y >= n) {//이건 당연한거
            return false;
        } else if (maze[x][y] != pathwayColor) { //초기값이 통로가 아니면 false
            return false;
        } else if (x == 7 && y == 4) {             //배열의 오른쪽 모서리가 0이면 출구고 true(출구조건을 확정함)
            maze[x][y] = exit;
            return true;
        } else {
            maze[x][y] = pathColor;             //위가 다 아니면 x,y는 지나가도 되는 길(초기는 0,0이거나)
            //(타일 값이 0인 초기 좌표)
            if (findMazePath(x - 1, y) || findMazePath(x, y + 1)
                    || findMazePath(x, y - 1) || findMazePath(x + 1, y)) {
                return true;
            }
            maze[x][y] = blockedColor;          //여기 걸리면 다시 시작(false가 되면 다시 실행해야됨.)
            return false;
        }
    }

    public static void main(String[] args) {

        for(int i=0; i<n; i++){
            System.out.println();
            for (int j = 0; j<n; j++){
                System.out.print(maze[i][j]+"  ");
            }
        }

        System.out.println();

        findMazePath(0, 0);

        System.out.println();

        for(int i=0; i<n; i++){
            System.out.println();
            for (int j = 0; j<n; j++){
                System.out.print(maze[i][j]+"  ");
            }
        }
    }
}
