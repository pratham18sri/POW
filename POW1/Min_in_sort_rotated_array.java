import java.util.*;
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        } 
        int l=0,h=n-1;
        while(l<h){
            int m=(l+h)/2;
            if(a[m]>a[h]) l=m+1;
            else h=m;
        }
        System.out.println(a[l]);
}

