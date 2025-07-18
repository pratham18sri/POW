import java.util.*;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++) nums[i]=sc.nextInt();
        int k=sc.nextInt();
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0,count=0;
        for(int num:nums){
            sum+=num;
            if(map.containsKey(sum-k)) count+=map.get(sum-k);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        System.out.println(count);
    }
