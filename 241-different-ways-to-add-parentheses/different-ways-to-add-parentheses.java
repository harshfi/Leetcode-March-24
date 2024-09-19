class Solution {
   public static List<Integer> diffWaysToCompute(String expression) {
        List<Integer> result = new ArrayList<>();
        
        // Loop through each character in the expression
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            
            // If it's an operator, split and compute recursively
            if (c == '+' || c == '-' || c == '*') {
                // Compute left and right parts recursively
                List<Integer> leftResults = diffWaysToCompute(expression.substring(0, i));
                List<Integer> rightResults = diffWaysToCompute(expression.substring(i + 1));
                System.out.println(leftResults+" "+rightResults);
                // Combine the results from both parts
                for (int left : leftResults) {
                    for (int right : rightResults) {
                        if (c == '+') {
                            result.add(left + right);
                        } else if (c == '-') {
                            result.add(left - right);
                        } else if (c == '*') {
                            result.add(left * right);
                        }
                    }
                }
            }
        }
        
        // If the expression is just a number, add it to the result list
        if (result.isEmpty()) {
            result.add(Integer.parseInt(expression));
        }
        
        return result;
    }
}