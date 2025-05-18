class Solution {
    public List<List<Integer>> generate(int nr) {
        List<List<Integer>> tri =new ArrayList<>();
        if(nr==0)
        {
            return null;
        }
        tri.add(new ArrayList<>());
        tri.get(0).add(1);
        for(int i=1;i<nr;i++)
        {
            List<Integer> pr=tri.get(i-1);
            List<Integer> cr=new ArrayList<>();
            cr.add(1);
            for(int j=1;j<pr.size();j++)
            {
                cr.add(pr.get(j-1)+pr.get(j));
            }
            cr.add(1);
            tri.add(cr);
        }
        return tri;
    }
}
