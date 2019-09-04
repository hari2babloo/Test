
//Declaring Variables


    int arr[] = new int[] { 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2 };
    int n = arr.length;


    


//function Call


    getOddOccurrence(arr, n);

    





    private int getOddOccurrence(int[] arr, int arr_size) {


        int i;
        int res = 0;
        for (i = 0; i < arr_size; i++) {
            res = res ^ arr[i];
        }

        Log.e("Result", String.valueOf(res));

        return res;


    }
