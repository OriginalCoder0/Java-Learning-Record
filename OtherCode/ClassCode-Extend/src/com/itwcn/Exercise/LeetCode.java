package com.itwcn.Exercise;

import java.util.Scanner;

/**
 * @program: Solution
 * @description:
 * @author: OriginalCoder
 * @createtime:2020/10/29 10:00
 **/

public class LeetCode {
    class Solution {
        public String longestPalindrome(String s) {
            int n = s.length();
            boolean [][] dp = new boolean[n][n];
            String ans = "";
            for (int i = 1; i < n; i++) {
                for (int j = 0; j + 1< n; ++j) {
                    int k = j + 1;
                    if(i == 0) {
                        dp[i][j] = true;
                    } else if(i == 1) {
                        dp[i][j] = (s.charAt(j) == s.charAt(k));
                    } else {
                        dp[i][j] = (s.charAt(j) == s.charAt(k) && dp[j+1][k-1]);
                    }
                    if (dp[i][j] && i + 1 > ans.length()) {
                        ans = s.substring(i, j + i + 1);
                    }
                }
            }
            return ans;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Solution solution = new Solution(str);
    }

}
