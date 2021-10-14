public class TwoIntegerSwap {
    public int[] TwoIntegerSwap(int a, int b) {
        int num1 = a;
        int num2 = b;
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

        return new int[] {num1, num2};
    }
    public static void main(String[] args) {
        TwoIntegerSwap swap = new TwoIntegerSwap();
        int[] newArr = swap.TwoIntegerSwap(9,  1);
        for (int num : newArr) {
            System.out.println(num);
        }
    }
}

