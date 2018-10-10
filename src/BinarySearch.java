public class BinarySearch {
    public static void main(String [] args) {
        int a[] = {1, 2, 3, 4, 5, 6};
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.binarySearch(a, 3, 0, a.length - 1));
        System.out.println(binarySearch.binarySearchBycycle(a, 3));
    }
    public int binarySearch(int [] a,int b,int start,int end){
        int mid=(start+end)/2;
        if(b==a[mid]){
            return mid;
        }else if(b<a[mid]){
            return binarySearch( a, b, start, mid-1);
        }else{
            return binarySearch(a,b,mid+1,end);
        }
    }
    public int binarySearchBycycle(int [] a,int b){
        int start = 0;
        int end =a.length;
        int mid = (start+end)/2;
        while (b!=a[mid]){
            if(b<a[mid]){
                end=mid-1;
            }else {
                start=mid+1;
            }
            mid=(start+end)/2;
        }
        return mid;

    }

}
