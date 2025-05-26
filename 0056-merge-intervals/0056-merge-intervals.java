class Pair {
    int first;
    int second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 1)
            return intervals;
        List<Pair> list = new ArrayList<>();
        Comparator<int[]> comp= (int[] a,int[] b)-> Integer.compare(a[0],b[0]);
        Arrays.sort(intervals,comp);
        Pair p1 = new Pair(intervals[0][0], intervals[0][1]);
        for (int i = 1; i < intervals.length; i++) {
            if (p1.second >= intervals[i][0]) {
                p1 = new Pair(p1.first, Math.max(p1.second, intervals[i][1]));
            } else {
                list.add(p1);
                p1 = new Pair(intervals[i][0], intervals[i][1]);
            }

        }
        list.add(p1);
        int result[][] = new int[list.size()][2];
        for (int i = 0; i < result.length; i++) {
            result[i][0] = list.get(i).first;
            result[i][1] = list.get(i).second;
        }
        return result;
    }
}