class Solution {
    public int findPeakElement(int[] arr) {
         int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                //you are in decresing order
                //this may be answer but look at left
                // this is why end !=mid-1;
                end = mid;
            } else {
                //you are in asc part of array
                start = mid + 1;//because we know that arr[mid]<arr[mid+1]
            }
        }//in the end , start==end and pointing to the largest number because of above the 2 checks
        //start and end are always trying to find max element in the above 2 checks
        //hence when they are pointing to just one elemrnt ,that is max one beacause that check says
        //

           return start;//or return end as both are equal...
    }
}
    