public class Bubble_Sort {
    public static void main(String[] args){
        int i, j, temp;
        int[] array = { 1,4,7,2,8,9,10,5,6,3 };

        for(i = 0; i < 10; i++){
            for(j = 0; j < 9 - i; j++){
                if(array[j] > array[j+1]){
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(i = 0; i < 10; i++){
            System.out.println(array[i]);
        }
    }
}
