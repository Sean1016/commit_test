public class Select_Sort{
    public static void main(String[] args){
        int i, j, min, index = 0, temp;
        int[] array = { 10, 1, 5, 8, 7, 6, 4, 3, 2, 9 };
        for(i = 0; i < 10; i++){
            min = 9999;
            for(j = i; j < 10; j++){
                if(min > array[j]){
                    min = array[j]; //1
                    index = j;  //1
                }
            }
            temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
        System.out.println(array);
    }
}