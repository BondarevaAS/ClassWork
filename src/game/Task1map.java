package game;

public class Task1map {
    char[][] map;
    int x = 9;
    int y = 0;

    public void addPlayer(int indexX, int indexY) {
        map[indexX][indexY] = 'P';
    }

    public void moveToTheRight() {
        if (map[x][y + 1] == 'S' || y + 1 > 9) System.out.println("Сюда ходить нельзя");
        else {
            map[x][y + 1] = 'P';
            map[x][y] = '_';
            y++;
        }

    }

    public void goToTop() {
        if (map[x - 1][y] == 'S' || y + 1 > 9) {
            System.out.println("Сюда ходить нельзя");
        } else {
            map[x - 1][y] = 'P';
            map[x][y] = '_';
            x--;
        }
    }

    public void goToDown() {
        if (map[x + 1][y] == 'S' || y + 1 > 9) {
            System.out.println("Сюда ходить нельзя");
        } else {
            map[x + 1][y] = 'P';
            map[x][y] = '_';
            x++;
        }
    }

    public void goToLeft() {
        if (map[x][y - 1] == 'S' || y + 1 > 9) {
            System.out.println("Сюда ходить нельзя");
        } else {
            map[x][y - 1] = 'P';
            map[x][y] = '_';
            y--;

        }
    }
}

