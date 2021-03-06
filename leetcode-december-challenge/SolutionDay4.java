class Solution {
    public int kthFactor(int n, int k) {
        
        ArrayList<Integer> res = new ArrayList();
        
        for(int i = 1 ; i <= n; i++) 
            if((n % i) == 0) res.add(i);

        return res.size() < k ? -1 : res.get(k - 1); 

        /** 
         * Alternate method
         * 
         * public int kthFactor(int n, int k) {
         *  int countIter = 0;
         *  for(int i = 1; i <= n; i++) {
         *      if((n % i) == 0) {
         *          countIter++;
         *          if(countIter == k) return i;
         *       }
         *  }
         *  return -1;
         * }
         */
    }
}