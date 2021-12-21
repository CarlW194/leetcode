import java.util.*;

import com.linkedlist.ListNode;
import com.linkedlist.mergeksortedlists.MergeKSortedLists;
import com.linkedlist.mergetwosortedlists.MergeTwoSortedLists;
import com.linkedlist.palindrome.Palindrome;
import com.linkedlist.removeelem.RemoveLinkedListElem;
import com.linkedlist.removenthnode.RemoveNthNode;
import com.linkedlist.reverse.ReverseLinkedList;
import com.linkedlist.reverselist.ReverseImmutableList;
import com.linkedlist.swapnodes.SwapLinkedListNodes;

import com.recursion.fibonnacci.FibonnaciNumber;
import com.recursion.genparenthesis.GenerateParenthesis;
import com.recursion.powerfour.PowerOfFour;
import com.recursion.powerthree.PowerOfThree;
import com.recursion.powertwo.PowerOfTwo;

import com.hashmaps.lettercombophonenum.LetterComboPhoneNumber;

import com.dynamicprogramming.countingbits.CountingBits;
import com.dynamicprogramming.divisorgame.DivisorGame;
import com.dynamicprogramming.longestcommonprefix.LongestCommonPrefix;
import com.dynamicprogramming.longestpalindromesubstring.LongestPalindromeSubstring;
import com.dynamicprogramming.mostwaterincontainer.MostWaterInContainer;
import com.dynamicprogramming.nthtribnum.NthTribNumber;
import com.dynamicprogramming.pascalstriangle.PascalsTriangle;
import com.dynamicprogramming.regexmatching.RegexMatching;
import com.dynamicprogramming.removeelem.RemoveElement;
import com.dynamicprogramming.romantoint.RomanToInteger;
import com.dynamicprogramming.stringtointatoi.StringToIntegerATOI;
import com.dynamicprogramming.threesum.ThreeSum;
import com.dynamicprogramming.threesumclosest.ThreeSumClosest;
import com.dynamicprogramming.validparenthesis.ValidParenthesis;

import com.builder.LinkedListBuilder;

/**
 *
 * author: carl.white
 *
 * Main class to run all assertions for the Leetcode challenges I have undertaken
 *
 * This will be an ever growing list.
 *
 */
public class Main {

    public static void main(String[] args){
        recursionSolutions();
        linkedListSolutions();
        hashMapSolutions();
        dynamicProgrammingSolutions();

    }

    private static void dynamicProgrammingSolutions(){
        CountingBits countingBits = new CountingBits();
        int[] bits1 = countingBits.countBits(2);
        int[] bits2 = countingBits.countBits(5);

        int[] expectedResults1 = {0,1,1};
        int[] expectedResults2 = {0,1,1,2,1,2};

        assert Arrays.equals(bits1, expectedResults1);
        assert Arrays.equals(bits2, expectedResults2);

        DivisorGame divisorGame = new DivisorGame();
        boolean divisorGameResult1 = divisorGame.divisorGame(2);
        boolean divisorGameResult2 = divisorGame.divisorGame(3);

        assert divisorGameResult1;
        assert !divisorGameResult2;

        String[] strArr1 = {"flower","flow","flight"};
        String[] strArr2 = {"dog","racecar","car"};
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

        String longestPrefix1 = longestCommonPrefix.longestCommonPrefix(strArr1);
        String longestPrefix2 = longestCommonPrefix.longestCommonPrefix(strArr2);

        String expectedlongestPrefix1 = "fl";
        String expectedlongestPrefix2 = "";

        assert longestPrefix1.equals(expectedlongestPrefix1);
        assert longestPrefix2.equals(expectedlongestPrefix2);

        LongestPalindromeSubstring longestPalindromeSubstring = new LongestPalindromeSubstring();
        String longestSubString1 = longestPalindromeSubstring.longestPalindrome("babad");
        String longestSubString2 = longestPalindromeSubstring.longestPalindrome("cbbd");

        String expectedResult1 = "bab";
        String expectedResult2 = "cbbd";

        assert longestSubString1.equals(expectedResult1);
        assert longestSubString2.equals(expectedResult2);

        int[] height1 = {1,8,6,2,5,4,8,3,7};
        int[] height2 = {1,1};
        MostWaterInContainer mostWaterInContainer = new MostWaterInContainer();
        int mostWaterResult1 = mostWaterInContainer.maxArea(height1);
        int mostWaterResult2 = mostWaterInContainer.maxArea(height2);

        int expectedmostWaterResult1 = 49;
        int expectedmostWaterResult2 = 1;

        assert mostWaterResult1 == expectedmostWaterResult1;
        assert mostWaterResult2 == expectedmostWaterResult2;

        NthTribNumber nthTribNumber = new NthTribNumber();
        int nthTribNum1 = nthTribNumber.tribonacci(4);
        int nthTribNum2 = nthTribNumber.tribonacci(25);

        int expectedResultNthNumber1 = 4;
        int expectedResultNthNumber2 = 1389537;

        assert nthTribNum1 == expectedResultNthNumber1;
        assert nthTribNum2 == expectedResultNthNumber2;

        PascalsTriangle pascalsTriangle = new PascalsTriangle();
        List<List<Integer>> pascalsResult1 = pascalsTriangle.generate(5);
        List<List<Integer>> expectedPascalsTriangle = new ArrayList<>(List.of(List.of(1), List.of(1,1), List.of(1,2,1), List.of(1,3,3,1), List.of(1,4,6,4,1)));

        assert pascalsResult1.equals(expectedPascalsTriangle);

        RegexMatching regexMatching = new RegexMatching();
        boolean regexMatch1 = regexMatching.isMatch("aa", "a");
        boolean regexMatch2 = regexMatching.isMatch("aa", "a*");
        boolean regexMatch3 = regexMatching.isMatch("ab", ".*");

        assert !regexMatch1;
        assert regexMatch2;
        assert regexMatch3;

        int[] removeArray = {3,2,2,3};
        RemoveElement removeElement = new RemoveElement();
        int removedArrayResult = removeElement.removeElement(removeArray, 3);
        int expectedResult = 2;

        assert removedArrayResult == expectedResult;

        RomanToInteger romanToInteger = new RomanToInteger();
        int result1 = romanToInteger.romanToInt("III");
        int result2 = romanToInteger.romanToInt("LVIII");
        int result3 = romanToInteger.romanToInt("MCMXCIV");
        int expectedRomanToInteger1 = 3;
        int expectedRomanToInteger2 = 58;
        int expectedRomanToInteger3 = 1994;

        assert result1 == expectedRomanToInteger1;
        assert result2 == expectedRomanToInteger2;
        assert result3 == expectedRomanToInteger3;

        StringToIntegerATOI stringToIntegerATOI = new StringToIntegerATOI();
        int stringToIntResult = stringToIntegerATOI.myAtoi("42");
        int expectedStringToIntResult = 42;

        assert stringToIntResult == expectedStringToIntResult;


        int[] threeSumArr = {-1,0,1,2,-1,-4};
        ThreeSum threeSum = new ThreeSum();
        List<List<Integer>> threeSumResult = threeSum.threeSum(threeSumArr);
        List<List<Integer>> expectedThreeSumResult = new ArrayList<>(List.of(List.of(-1,-1,2), List.of(-1,0,1)));

        assert threeSumResult.equals(expectedThreeSumResult);

        int[] threeSumClosestArr = {-1,2,1,-4};
        ThreeSumClosest threeSumClosest = new ThreeSumClosest();
        int threeSumClosestResult = threeSumClosest.threeSumClosest(threeSumClosestArr, 1);
        int expectedThreeSumClosestResult = 2;

        assert threeSumClosestResult == expectedThreeSumClosestResult;

        ValidParenthesis validParenthesis = new ValidParenthesis();
        boolean isValidParenthesis1 = validParenthesis.isValid("()");
        boolean isValidParenthesis2 = validParenthesis.isValid("()[]{}");
        boolean isValidParenthesis3 = validParenthesis.isValid("(]");

        assert isValidParenthesis1;
        assert isValidParenthesis2;
        assert !isValidParenthesis3;

    }

    private static void hashMapSolutions(){
        LetterComboPhoneNumber letterComboPhoneNumber = new LetterComboPhoneNumber();
        List<String> comboList1 = letterComboPhoneNumber.letterCombinations("23");
        List<String> comboList2 = letterComboPhoneNumber.letterCombinations("");
        List<String> comboList3 = letterComboPhoneNumber.letterCombinations("2");

        List<String> expectedCombo1 = new ArrayList<>(List.of("ad","ae","af","bd","be","bf","cd","ce","cf"));
        List<String> expectedCombo2 = new ArrayList<>(List.of(""));
        List<String> expectedCombo3 = new ArrayList<>(List.of("a","b","c"));

        assert comboList1.equals(expectedCombo1);
        assert comboList2.equals(expectedCombo2);
        assert comboList3.equals(expectedCombo3);
    }

    private static void linkedListSolutions(){
        LinkedListBuilder llb = new LinkedListBuilder();
        ListNode[] ln = llb.buildArrayLinkedList();

        MergeKSortedLists mergeKSortedLists = new MergeKSortedLists();
        ListNode outputMergedK = mergeKSortedLists.mergeKLists(ln);
        int[] expectedOutput = {1,1,2,3,4,4,5};
        int counter = 0;
        while(outputMergedK.next != null) {
            assert expectedOutput[counter] == outputMergedK.val;
            outputMergedK = outputMergedK.next;
            counter++;
        }

        int[] arr1 = {1,2,4};
        int[] arr2 = {1,3,4};
        List<ListNode> listLinkedLists = llb.buildTwoLinkedList(arr1, arr2);
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        ListNode outputMergedTwoLinkedLists = mergeTwoSortedLists.mergeTwoLists(listLinkedLists.get(0), listLinkedLists.get(1));
        int[] expectedOutputTwoMergedLL = {1,1,2,3,4,4};
        int counter2 = 0;
        while(outputMergedTwoLinkedLists.next != null){
            assert expectedOutputTwoMergedLL[counter2] == outputMergedTwoLinkedLists.val;
            outputMergedTwoLinkedLists = outputMergedTwoLinkedLists.next;
        }

        int[] palindromeArray = {1,2,2,1};
        ListNode palindrome = llb.buildLinkedList(palindromeArray);
        Palindrome pal = new Palindrome();
        boolean outputPalindrome = pal.isPalindrome(palindrome);
        assert outputPalindrome;


        int[] linkedListArray = {1,2,2,1};
        ListNode linkedListToRemove = llb.buildLinkedList(linkedListArray);
        RemoveLinkedListElem removeLinkedListElem = new RemoveLinkedListElem();
        ListNode removedValueFromLinkedList = removeLinkedListElem.removeElements(linkedListToRemove, 6);

        while(removedValueFromLinkedList.next != null){
            assert removedValueFromLinkedList.val != 6;
            removedValueFromLinkedList = removedValueFromLinkedList.next;
        }

        int[] newLinkedListArray = {1,2,3,4,5};
        ListNode newLinkedList = llb.buildLinkedList(newLinkedListArray);
        RemoveNthNode removeNthNode = new RemoveNthNode();
        ListNode removedList = removeNthNode.removeNthFromEnd(newLinkedList, 2);

        while(removedList.next != null){
            assert removedList.val != 6;
            removedList = removedList.next;
        }

        int[] linkedListToReverseArr = {1,2,3,4,5};
        ListNode linkedListToReverse = llb.buildLinkedList(linkedListToReverseArr);
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ListNode reversed = reverseLinkedList.reverseList(linkedListToReverse);
        int[] expectedReverseList = {5,4,3,2,1};
        int counter3 = 0;
        while(reversed.next != null){
            assert reversed.val == expectedReverseList[counter3];
            reversed = reversed.next;
        }

        int[] linkedListToSwapNodesArr = {1,2,3,4};
        ListNode linkedListToSwapNodes = llb.buildLinkedList(linkedListToSwapNodesArr);
        SwapLinkedListNodes swapLinkedListNodes = new SwapLinkedListNodes();
        ListNode swappedLinkedList = swapLinkedListNodes.swapPairs(linkedListToSwapNodes);
        int[] expectedOutputSwappedNodes = {2,1,4,3};
        int counter4 = 0;

        while(swappedLinkedList.next != null){
            assert swappedLinkedList.val == expectedOutputSwappedNodes[counter4];
            swappedLinkedList = swappedLinkedList.next;
        }
    }

    private static void recursionSolutions(){
        FibonnaciNumber fnum = new FibonnaciNumber();
        int fibonnaciNumber1 = fnum.fib(2);
        int fibonnaciNumber2 = fnum.fib(3);
        int fibonnaciNumber3 = fnum.fib(4);
        assert fibonnaciNumber1 == 1;
        assert fibonnaciNumber2 == 2;
        assert fibonnaciNumber3 == 3;

        GenerateParenthesis generateParenthesis = new GenerateParenthesis();
        List<String> outputParenthesis = generateParenthesis.generateParenthesis(3);
        List<String> expectedOutput = new ArrayList<>(List.of("((()))","(()())","(())()","()(())","()()()"));
        assert outputParenthesis.equals(expectedOutput);

        PowerOfFour pof = new PowerOfFour();
        boolean isPowerOfFour1 = pof.isPowerOfFour(16);
        boolean isPowerOfFour2 = pof.isPowerOfFour(2);
        boolean isPowerOfFour3 = pof.isPowerOfFour(1);
        assert isPowerOfFour1;
        assert !isPowerOfFour2;
        assert isPowerOfFour3;

        PowerOfThree pot = new PowerOfThree();
        boolean isPowerOfThree1 = pot.isPowerOfThree(27);
        boolean isPowerOfThree2 = pot.isPowerOfThree(0);
        boolean isPowerOfThree3 = pot.isPowerOfThree(9);
        boolean isPowerOfThree4 = pot.isPowerOfThree(45);
        assert isPowerOfThree1;
        assert !isPowerOfThree2;
        assert isPowerOfThree3;
        assert !isPowerOfThree4;

        PowerOfTwo powerOfTwo = new PowerOfTwo();
        boolean isPowerOfTwo1 = powerOfTwo.isPowerOfTwo(1);
        boolean isPowerOfTwo2 = powerOfTwo.isPowerOfTwo(16);
        boolean isPowerOfTwo3 = powerOfTwo.isPowerOfTwo(3);
        assert isPowerOfTwo1;
        assert isPowerOfTwo2;
        assert !isPowerOfTwo3;
    }
}
