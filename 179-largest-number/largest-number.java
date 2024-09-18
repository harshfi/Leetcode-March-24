class Solution {
    public static String largestNumber(int[] nums) {
    	String[] s = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            s[i] = String.valueOf(nums[i]); // Convert each int to String
        }

        // Sort the strings based on concatenated value
        Arrays.sort(s, (a, b) -> (b + a).compareTo(a + b));
        if(s[0].compareTo("0")==0)return "0";
       StringBuilder sb = new StringBuilder();
       for (int i = 0;i<nums.length;i++) {
    	//    System.out.println(s[i]+" ");
    	   sb.append(s[i]);

	}
        
        return sb.toString();
    }

}