class Solution {
    public List<List<Integer>> generate(int num) {
       List<List<Integer>> result= new ArrayList<>();
		if(num==0)
			return result;
		List<Integer> first= new ArrayList<>();
		first.add(1);
		result.add(first);
		int count=1;
		result=help(result,first,num,count);
		return result;
		
	}
	public static List<List<Integer>> help(List<List<Integer>> result, List<Integer> first,int num, int count)
	{
		if(count==num)
			return result;
		List<Integer> P_row= new ArrayList<>();
		P_row.add(1);
		for(int i=1;i<first.size();i++)
		{
			P_row.add(first.get(i-1)+first.get(i));
		}
		P_row.add(1);
		result.add(P_row);
		count++;
		help(result,P_row,num,count);
		return result;
		
	}

}