public class kthlargestelementusingquickselect {
    public static int quickselect(int arr[],int left,int right,int targetindex){
        if(left==right) return arr[left];
        int pivotindex=partition(arr,left,right);
        if(pivotindex==targetindex) return arr[pivotindex];
        else if(pivotindex<targetindex) return quickselect(arr,pivotindex+1,right,targetindex);
        else return quickselect(arr,left,pivotindex-1,targetindex);
    }
    public static int partition(int[] arr,int left,int right){
        int pivot=arr[right];
        int i=left;
        for(int j=left;j<right;j++){
            if(arr[j]<=pivot){
                swap(arr,i,j);
                i++;
            }
        }
        swap(arr,i,right);
        return i;

    }
    public static void swap(int[] arr,int left,int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,6};
        int k=3;
        int targetindex=arr.length-k;
        int ans=quickselect(arr,0,arr.length-1,targetindex);
        System.out.println(ans);
    }
}
