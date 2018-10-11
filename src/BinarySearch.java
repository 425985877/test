public class BinarySearch {
    public static void main(String [] args) {
        int a[] = {1, 2, 3, 4, 5, 6};
        int b[]={32,3,1,43,23,54,21};
        BinarySearch binarySearch = new BinarySearch();
        //System.out.println(binarySearch.binarySearch(a, 3, 0, a.length - 1));
       // System.out.println(binarySearch.binarySearchBycycle(a, 3));
        binarySearch.quickSort(b,0,b.length-1);
        System.out.println(b);
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }

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
    public void quickSort(int [] a,int start,int end){
        if(start>=end){
            return;
        }
        int left=start;
        int right=end;
        int mid=start;
        while (left<right){
            while (a[mid]<a[right]){
                right--;
            }
            swap(a,mid,right);
            mid=right;
            while (a[mid]>a[left]){
                left++;
            }
            swap(a,mid,left);
            mid=left;
        }
        quickSort(a,start,mid-1);
        quickSort(a,mid+1,end);

    }
    public void swap(int [] array,int a,int b){
        int temp=array[b];
        array[b]=array[a];
        array[a]=temp;
    }

}
