class Solution { 
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<stones.length; i++)
        {
            p.add(stones[i]);
        }
        System.out.print(p);
        while(p.size()>1)
        {
            int x=p.poll();
            int y=p.poll();
            if(x!=y)
            {
                p.add(x-y);
                System.out.println(p);
            }
        }
        if(p.size()==1)
        {
            return p.peek();
        }
        return 0;
    }
    
}