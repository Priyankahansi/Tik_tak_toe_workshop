package Com.bridgelabz;

public class Tietaktoe {
    void board() {
        char[] arr = new char[10];
        for (int i = 1; i < 9; i++) {
            arr[i] = ' ';
        }
    }

    public static void main(String[] args) {
        Tietaktoe obj1 = new Tietaktoe();
        obj1.board();
    }
}
