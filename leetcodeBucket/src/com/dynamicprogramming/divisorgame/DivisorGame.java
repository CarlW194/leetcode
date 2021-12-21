package com.dynamicprogramming.divisorgame;
/**
 *
 * author: carl.white
 *
 * Problem Description
 * Alice and Bob take turns playing a game, with Alice starting first.
 *
 * Initially, there is a number n on the chalkboard. On each player's turn, that player makes a move consisting of:
 *
 * Choosing any x with 0 < x < n and n % x == 0.
 * Replacing the number n on the chalkboard with n - x.
 * Also, if a player cannot make a move, they lose the game.
 *
 * Return true if and only if Alice wins the game, assuming both players play optimally.
 *
 * Example 1:
 * Input: n = 2
 * Output: true
 * Explanation: Alice chooses 1, and Bob has no more moves.
 *
 * Example 2:
 * Input: n = 3
 * Output: false
 * Explanation: Alice chooses 1, Bob chooses 1, and Alice has no more moves.
 *
 * Constraints:
 * 1 <= n <= 1000
 *
 */

public class DivisorGame {

    public boolean divisorGame(int n) {
        int alice = 0;
        int bob = 0;
        boolean result = false;
        while(n >= 1){
            if(alice == 0){
                alice = optimalPattern(n);
                n-=alice; // n-x(highest solution)
            }
            if(alice != 0){ // bob's turn
                bob = optimalPattern(n);
                n-=bob; // n-x(highest solution)
                if(n == 0){
                    result = true;
                }
                alice = 0; // reset
            }
        }
        return result;
    }

    private int optimalPattern(int n){
        int highest = 0;
        if(n%2==0){ // if even we just need to subtract 1
            highest = 1;
        } else{ // highest n%x==0
            highest = highestMod(n); // lowest number would be 1 anyway
        }
        return highest;
    }


    private int highestMod(int n){
        int highest = 0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                highest=i;
            }
        }
        if(highest == 0){
            highest = 1;
        }
        return highest;
    }
}