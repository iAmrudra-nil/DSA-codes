import java.util.Arrays;

public class knapSack {
    public static void main(String[] args) {
        int n=4;
        int w=10;
        int wt[]={1,3,4,6};
        int val[]={20,30,10,50};
        int mat[][]=new int[n+1][w+1];
        for(int i=0;i<w+1;i++)
            mat[0][i]=0;
        for(int i=0;i<n+1;i++)
            mat[i][0]=0;
        for(int item=1;item<=n;item++){
            for(int cap=1;cap<=w;cap++){
                int prev=mat[item-1][cap];
                int cur=0;
                int weight=wt[item-1];
                if(weight<=cap){
                    cur=val[item-1];
                    int remcap=cap-weight;
                    cur+=mat[item-1][remcap];
                }
                mat[item][cap]=Math.max(cur,prev);
            }
        }
        System.out.println(mat[n][w]);
        System.out.println(Arrays.deepToString(mat));
    }
}
