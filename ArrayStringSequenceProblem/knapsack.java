public class knapsack {
    public static int maxvalue(int i,int[] weight,int[] value,int w){
        if(w<0) return 0;
        if(i>=weight.length) return 0;
        int nottake=maxvalue(i+1,weight,value,w);
        int take=0;
        if(weight[i]<=w){
            take=value[i]+maxvalue(i+1, weight, value, w-weight[i]);
        } 
        return Math.max(take,nottake);

    }
    public static void main(String[] args) {
        int[] weight={4,5,1};
        int[] value={1,2,3};
        int W=4;
        System.out.print(maxvalue(0,weight,value,4));
    }
}
