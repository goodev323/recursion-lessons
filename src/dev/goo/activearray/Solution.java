package dev.goo.activearray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static int addEveryOtherElement(int[] intArr) {
        int total = 0;
        for (int i = 0; i < intArr.length; i++) {
            if (i % 2 == 0) total += intArr[i];
        }
        return total;
    }

    public static int charInBagOfWordsCount(String[] bagOfWords, char keyCharacter) {
        int total = 0;
        for (int i = 0; i < bagOfWords.length; i++) {
            if (bagOfWords[i].indexOf(keyCharacter) == -1) {
                continue;
            }
            for (int j = 0; j < bagOfWords[i].length(); j++) {
                if (bagOfWords[i].charAt(j) == keyCharacter) total++;
            }
        }
        return total;
    }

    public static boolean isMarcusLarger(String stringOperand1, String stringOperand2) {
        int marcusTotal = 0, oldManTotal = 0;
        String marcusStr = stringOperand1.toLowerCase();
        String oldManStr = stringOperand2.toLowerCase();
        for (int i = 0; i < oldManStr.length(); i++) {
            oldManTotal += (int) oldManStr.charAt(i);
        }
        for (int i = 0; i < marcusStr.length(); i++) {
            marcusTotal += (int) marcusStr.charAt(i);
        }
        return marcusTotal > oldManTotal;
    }

    public static boolean winnerBlackjack(String[] playerCards, String[] houseCards) {
        int playerCardsTotal = calcTrumpNumberTotal(playerCards);
        int houseCardsTotal
                = calcTrumpNumberTotal(houseCards);
        if (playerCardsTotal > 21 || (houseCardsTotal <= 21 && houseCardsTotal >= playerCardsTotal)) {
            return false;
        }
        return true;
    }

    public static int calcTrumpNumberTotal(String[] trumpCards) {
        int total = 0;
        for (int i = 0; i < trumpCards.length; i++) {
            String trumpNumberStr = trumpCards[i].substring(1);
            if (trumpNumberStr.equals("J")) total += 11;
            else if (trumpNumberStr.equals("Q")) total += 12;
            else if (trumpNumberStr.equals("K")) total += 13;
            else if (trumpNumberStr.equals("A")) total += 1;
            else total += Integer.parseInt(trumpNumberStr);
        }
        return total;
    }

    public static String[] validEmailList(String[] emailList) {
        List<String> validEmailList = new ArrayList<>();
        for (int i = 0; i < emailList.length; i++) {
            String targetEmail = emailList[i];
            if (targetEmail.indexOf(" ") != -1) continue;
            int firstAtMarkIndex = targetEmail.indexOf("@");
            if (firstAtMarkIndex == -1 ||
                    targetEmail.indexOf("@", firstAtMarkIndex + 1) != -1)
                continue;
            if (targetEmail.indexOf(".", firstAtMarkIndex + 1) == -1) continue;
            validEmailList.add(targetEmail);
        }
        return validEmailList.toArray(new String[validEmailList.size()]);
    }

    public static char[] generateAlphabet(char firstAlphabet, char secondAlphabet) {
        String stations = "";
        firstAlphabet = Character.toLowerCase(firstAlphabet);
        secondAlphabet = Character.toLowerCase(secondAlphabet);
        for (int i = (char) Math.min(firstAlphabet, secondAlphabet); i <= (char) Math.max(firstAlphabet, secondAlphabet); i++) {
            stations += (char) i;
        }
        return stations.toCharArray();
    }

    public static int maxAscilString(String[] stringList) {
        int maxIndex = -1, maxLength = -1;
        for (int i = 0; i < stringList.length; i++) {
            int total = 0;
            for (int j = 0; j < stringList[i].length(); j++) {
                total += stringList[i].charAt(j);
            }
            if (maxLength < total) {
                maxIndex = i;
                maxLength = total;
            }
        }
        return maxIndex;
    }

    public static int[] rotateByTimes(int[] ids, int n) {
        n = n % ids.length;
        int[] rotatedIds = new int[ids.length];
        for (int i = 0; i < ids.length; i++) {
            rotatedIds[(i + n) % ids.length] = ids[i];
        }
        return rotatedIds;
    }

    public static String[] websitePagination(String[] urls, int pageSize, int page) {
        int firstPageIndex = pageSize * (page - 1);
        int lastPageIndex = Math.min(page * pageSize, urls.length);
        String[] result = new String[lastPageIndex - firstPageIndex];
        for (int i = 0; i < result.length; i++) {
            result[i] = urls[firstPageIndex + i];
        }
        return result;
    }

    public static boolean isPangram(String string) {
        boolean[] cache = new boolean[26];
        String lowerCaseStr = string.toLowerCase();
        for (int i = 0; i < string.length(); i++) {
            int c = lowerCaseStr.charAt(i);
            if (c < 97 || 122 < c) continue;
            cache[c - 97] = true;
        }
        for (int i = 0; i < cache.length; i++) {
            if (!cache[i]) return false;
        }
        return true;
    }

    public static String[] fireEmployees(String[] employees, String[] unemployed) {
        List<String> employeesList = new ArrayList<>();
        for (int i = 0; i < employees.length; i++) {
            boolean contains = false;
            for (int j = 0; j < unemployed.length; j++) {
                if (employees[i].equals(unemployed[j])) {
                    contains = true;
                }
            }
            if (contains) continue;
            employeesList.add(employees[i]);
        }
        return employeesList.toArray(new String[employeesList.size()]);
    }

    public static int primesUpToNCount(int n) {
        boolean[] cache = new boolean[n];
        Arrays.fill(cache, true);
        for (int current = 2; current < Math.ceil(Math.sqrt(n)); current++) {
            if (!cache[current]) continue;
            int i = 2;
            int ip = i * current;
            while (ip < n) {
                cache[ip] = false;
                i += 1;
                ip = i * current;
            }
        }
        int total = 0;
        for (int i = 2; i < n; i++) {
            if (cache[i]) {
                total++;
            }
        }
        return total;
    }

    public static int[] shuffledPositions(int[] arr, int[] shuffledArr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < shuffledArr.length; j++) {
                if (arr[i] == shuffledArr[j]) {
                    result[i] = j;
                    break;
                }
            }
        }
        return result;
    }

    public static int shuffleSuccessRate(int[] arr, int[] shuffledArr) {
        int countShuffled = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != shuffledArr[i]) {
                countShuffled++;
            }
        }
        return (countShuffled * 100) / arr.length;
    }

    public static int[] missingItems(int[] listA, int[] listB) {
        List<Integer> missingList = new ArrayList<>();
        for (int itemA : listA) {
            boolean includes = false;
            for (int itemB : listB) {
                if (itemA == itemB) {
                    includes = true;
                    break;
                }
            }
            if (!includes) {
                missingList.add(itemA);
            }
        }
        int[] result = new int[missingList.size()];
        for (int i = 0; i < missingList.size(); i++) {
            result[i] = missingList.get(i);
        }
        return result;
    }

    public static int[] intersectionOfArraysRepeats(int[] intList1, int[] intList2) {
        Map<Integer, Integer> countMap1 = new HashMap<>();
        for (Integer num : intList1) {
            countMap1.merge(num, 1, (v1, v2) -> {
                return v1 + 1;
            });
        }
        for (int num : intList1) {
            if (countMap1.get(num) == null) countMap1.put(num, 1);
            else countMap1.put(num, countMap1.get(num) + 1);
        }
        Map<Integer, Integer> countMap2 = new HashMap<>();
        for (int num : intList2) {
            if (countMap2.get(num) == null) countMap2.put(num, 1);
            else countMap2.put(num, countMap2.get(num) + 1);
        }
        List<Integer> resultList = new ArrayList<>();
        for (int num : countMap1.keySet()) {
            if (countMap2.get(num) == null) continue;
            for (int i = 0; i < Math.min(countMap1.get(num), countMap2.get(num)); i++) {
                resultList.add(num);
            }
        }
        int[] result = resultList.stream().sorted().mapToInt(i -> i).toArray();
        return result;
    }

    public static boolean findXTimes(String teams) {
        Map<Character, Integer> timesMap = new HashMap<>();
        for (char c : teams.toCharArray()) {
            timesMap.merge(c, 1, (oldValue, value) -> {
                return oldValue + 1;
            });
        }
        int targetTime = timesMap.get(teams.charAt(0));
        for(Integer time: timesMap.values()) {
            if(time != targetTime) return false;
        }
        return true;
    }
    public static boolean hasSameType(String user1,String user2){
        if(user1.length() != user2.length()) return false;
        int[] user1Type = calcCharOrder(user1);
        int[] user2Type = calcCharOrder(user2);
        for(int i = 0; i < user1.length(); i++) {
            if(user1Type[i] != user2Type[i]) return false;
        }
        return true;
    }

    private static int[] calcCharOrder(String str) {
        Map<Character, Integer> charOrderMap = new HashMap<>();
        int currentOrder = 1;
        for(char c: str.toCharArray()){
            if(!charOrderMap.containsKey(c)) {
                charOrderMap.put(c, currentOrder);
                currentOrder++;
            }
        }
        int[] charOrderArray = new int[str.length()];
        for(int i = 0; i < str.length(); i++) {
            charOrderArray[i] = charOrderMap.get(str.charAt(i));
        }
        return charOrderArray;
    }

    public static int[] findPairs(int[] numbers){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: numbers) {
            map.merge(i, 1, (oldValue, value) -> { return oldValue + 1; });
        }
        List<Integer> list = new ArrayList<>();
        for(Integer i: map.keySet()) {
            if(map.get(i) == 2) list.add(i);
        }
        return list.stream().sorted().mapToInt(i -> i).toArray();
    }

    public static int firstNonRepeating(String s){
        Map<Character, Integer> answerCountMap = new HashMap<>();
        for(char c: s.toCharArray()) {
            answerCountMap.merge(c, 1, (oldValue, value) -> value + 1);
        }
        for(int i = 0; i < s.length(); i++) {
            if(answerCountMap.get(s.charAt(i)) == 1) return i;
        }
        return -1;
    }
}
