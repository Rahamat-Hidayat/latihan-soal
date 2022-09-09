public class nomer2 {
    public static void main(String args[]) {
        int[] array = { 2, 1, 4, 1, 7, 6, 2, 0, 4, 3 };
        int sum = 0;
        
        for (int num : array) {
            sum = sum + num;
        }
        System.out.println("Jumlah Dari Semua Elemen Array Adalah:" + sum);
    }
}