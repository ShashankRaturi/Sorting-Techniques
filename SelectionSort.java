/*In selection sort we first lock the position where we want to swap and then look for the suitable element
* Example : If we want to sort in ascending order then we will first fix the position like the starting one where the smallest element is
* the array should come and then look for that smallest element */

public class SelectionSort {
    public static void swap(int arr[] , int i  , int  j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void sort (int arr[]){
        int i , j , k;

        for(i = 0; i < arr.length; ++i){
            for (j = k = i ; j < arr.length; ++j){

                if(arr[j] < arr[k]){
                    k = j;
                }
            }
            swap(arr , i , k);
        }

        for(i = 0; i < arr.length; ++i){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args){
        int[] arr1 = { 4 , 6 , 8 ,  9 , 2 , 7 , 5};
        SelectionSort s = new SelectionSort();
        s.sort(arr1);

    }
}
