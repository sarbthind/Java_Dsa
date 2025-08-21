class sort012{
    public static void sort(int[] arr){
        int s=0,mid=0,high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[s];
                arr[s]=temp;
                s++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
    }
    public static void main(String[] args){
        int[] arr={0,1,1,0,2,1,0,2,1,0};
        sort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}