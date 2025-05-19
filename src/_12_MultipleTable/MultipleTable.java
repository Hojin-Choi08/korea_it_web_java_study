package _12_MultipleTable;

public class MultipleTable {
    public static void main(String[] args) {
        //1-9단
        //1 X 3 = 3
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "X" + j + "=" + i*j);
            }
            System.out.println();
        }
    }
}
