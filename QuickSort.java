public class QuickSort
{
    private int counter;
    private int array_bound;
    private int[] array;
    private int partition(int arr[], int low, int high)
    {
        int left = low + 1;
        int right = high;
        int temp;
        int pivot = arr[low];

        while(left <= right)
        {
            while(arr[left] <= pivot && left <= right)
                left++;
            while(arr[right] > pivot && left <= right)
                right--;
            if(left < right)
            {
                if(left>=counter || right>=counter)
                    continue;
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        arr[low] = arr[right];
        arr[right] = pivot;
        return right;
    }

    QuickSort()
    {
        counter = 0;
        array_bound = 100000;
        array = new int[array_bound];
    }
    public void setArray(int value)
    {
        if(counter>100000)
            return;
        array[counter] = value;
        counter+=1;
    }
    public void sort(int low ,int high)
    {
        if (low < high)
        {
            int pivot = partition(array, low, high);
            sort(low, pivot - 1);
            sort(pivot + 1, high);
        }
    }
    public int[] result()
    {
        return array;
    }
    public int getCounter()
    {
        return counter;
    }
}
