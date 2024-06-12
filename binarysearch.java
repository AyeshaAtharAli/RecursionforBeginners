public class binarysearch {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8,9};
        int target = 9;
        System.out.println(search(arr, target, arr.length-1, 0));
        
    }

    static int search(int[] arr,int target,int e, int s){
        if(s>e){
            return -1;
        }
        int mid = s+(e-s)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]>target){
            return search(arr, target, mid-1, s);
        }
        return search(arr, target, e, mid+1);
    }
}
