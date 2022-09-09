public class nomer1 {
    public static void main(String[] args) {
    int nim[] = {2,1,4,1,7,6,2,0,4,3};
    int idx = 0;
    int i = 0;
    do{
        int j = i;
        do{
            System.out.print(" ");
            j++;
        }while(j<nim.length);
        int k=0;
        do{
            System.out.print(nim[idx]+" ");
            idx++;
            k++;
        }while(k<=i);
        System.out.println();
        i++;
    }while(i<4);
    }
}