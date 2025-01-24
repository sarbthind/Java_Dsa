class missingelement{
    public int firstmissingelement(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int ele=arr[i];
            if (ele>0&&ele<n) {
                int pos=ele-1;
                if (arr[pos]!=ele) {
                    // swap(arr[i],arr[pos]);
                    int temp=arr[i];
                    arr[i]=ele;
                    ele=temp;

                    i--;
                }      
                  }
        }
        for(int i=0;i<n;i++){
            if(arr[i]==i+1){
                return i+1;
            }
        }
        return n+1;
    }
}