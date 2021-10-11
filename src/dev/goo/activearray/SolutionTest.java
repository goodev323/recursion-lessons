package dev.goo.activearray;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void addEveryOtherElement() {
        assertEquals(79, Solution.addEveryOtherElement(new int[]{34, 46, 45,
                57}));
        assertEquals(936, Solution.addEveryOtherElement(new int[]{60, 45, 66, 75, 56, 32, 654, 45, 100}));
        assertEquals(5, Solution.addEveryOtherElement(new int[]{5, 10}));
        assertEquals(0, Solution.addEveryOtherElement(new int[]{}));
    }

    @Test
    void charInBagOfWordsCount() {
        assertEquals(2, Solution.charInBagOfWordsCount(new String[]{"hello",
                "world"}, 'o'));
        assertEquals(0, Solution.charInBagOfWordsCount(new String[]{"hello",
                "world"}, 'p'));
        assertEquals(0, Solution.charInBagOfWordsCount(new String[]{"The", "tech", "giant", "is in the", "city center"}, 'o'));
        assertEquals(5, Solution.charInBagOfWordsCount(new String[]{"The",
                "tech", "giant", "is in the", "city center"}, 'e'));
    }


    @Test
    void isMarcusLarger() {
        assertEquals(true, Solution.isMarcusLarger("Fantastic", "Bridge"));
        assertEquals(false, Solution.isMarcusLarger("Bridge", "Fantastic"));
        assertEquals(false, Solution.isMarcusLarger("hello", "HelLo"));
        assertEquals(true, Solution.isMarcusLarger("Appearances may deceive", "I think so too"));
        assertEquals(false, Solution.isMarcusLarger("pool", "pooling"));
        assertEquals(true, Solution.isMarcusLarger("magni", "est"));
    }

    @Test
    void winnerBlackjack() {
        assertEquals(true, Solution.winnerBlackjack(new String[]{"♣4", "♥7",
                "♥7"}, new String[]{"♠Q", "♣J"}));
        assertEquals(false, Solution.winnerBlackjack(new String[]{"♥10", "♥6",
                "♣K"}, new String[]{"♠Q", "♦2", "♥K"}));
        assertEquals(true, Solution.winnerBlackjack(new String[]{"♠3", "♠J", "♣5"}, new String[]{"♣A", "♥Q", "♣5"}));
        assertEquals(true, Solution.winnerBlackjack(new String[]{"♥2", "♣A", "♣8", "♥7", "♥3"}, new String[]{"♥6", "♥K", "♣5", "♥K"}));
        assertEquals(false, Solution.winnerBlackjack(new String[]{"♥2", "♣A", "♣8", "♥7", "♥3"}, new String[]{"♥2", "♣A", "♣8", "♥7", "♥3"}));
        assertEquals(true, Solution.winnerBlackjack(new String[]{"♣4", "♥7",
                "♥7"}, new String[]{"♠Q", "♣J"}));
    }

    @Test
    void validEmailList() {
        assertArrayEquals(new String[]{"ccc@aaa.com", "cc.c@aaa.com"}, Solution.validEmailList(new String[]{"ccc@aaa.com", "c@cc@aaa.com", "cc c@aaa.com", "cc.c@aaa.com"}));
        assertArrayEquals(new String[]{}, Solution.validEmailList(new String[]{"c@cc@aaa.com", "cc c@aaa.com", "cc.c@aaacom"}));
        assertArrayEquals(new String[]{"ccc@aaa.com", "cvsd@a.com", "tele@bb.aa", "cc.c@aaa.com"}, Solution.validEmailList(new String[]{"ccc@aaa.com", "cvsd@a.com", "tele@bb.aa", "cc.c@aaa.com"}));
        assertArrayEquals(new String[]{"tele@bb.aa", "cc.c@aaa.com", "ccc@aaa.com"}, Solution.validEmailList(new String[]{"c@cc@aaa.com", "tele@bb.aa", "cc.c@aaa.com", "ccc@aaa.com"}));
    }


    @Test
    void generateAlphabet() {
        assertArrayEquals(new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'}, Solution.generateAlphabet('a', 'z'));
        assertArrayEquals(new char[]{'b'}, Solution.generateAlphabet('b', 'b'));
        assertArrayEquals(new char[]{'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'}, Solution.generateAlphabet('C', 'Z'));
        assertArrayEquals(new char[]{'m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
                'w', 'x', 'y', 'z'}, Solution.generateAlphabet('M', 'z'));
        assertArrayEquals(new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'}, Solution.generateAlphabet('z', 'a'));
    }

    @Test
    void maxAscilString() {
        assertEquals(0, Solution.maxAscilString(new String[]{"Fantastic", "Bridge", "Superior", "Fantastic", "Operator"}));
        assertEquals(2, Solution.maxAscilString(new String[]{"HeLlo", "HelLo", "bridge"}));
        assertEquals(3, Solution.maxAscilString(new String[]{"eatDjrPNbj", "IehUUSEMVe", "hpcbBvlTOc", "egvnPZgyCh"}));
        assertEquals(0, Solution.maxAscilString(new String[]{"egvnPZgyCh", "bridge", "Fantastic"}));
    }

    @Test
    void rotateByTimes() {
        assertArrayEquals(new int[]{4, 5, 1, 2, 3}, Solution.rotateByTimes(new int[]{1, 2, 3, 4, 5}, 2));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5},
                Solution.rotateByTimes(new int[]{1, 2, 3, 4, 5}, 5));
        assertArrayEquals(new int[]{3, 4, 5, 10, 12},
                Solution.rotateByTimes(new int[]{10, 12, 3, 4, 5}, 3));
        assertArrayEquals(new int[]{5002, 3, 4, 23, 104, 435}, Solution.rotateByTimes(new int[]{4, 23, 104, 435, 5002, 3}, 26));
        assertArrayEquals(new int[]{4, 23, 104, 435, 5002, 3},
                Solution.rotateByTimes(new int[]{4, 23, 104, 435, 5002, 3}, 0));
        assertArrayEquals(new int[]{3, 4, 23, 104, 435, 5002},
                Solution.rotateByTimes(new int[]{4, 23, 104, 435, 5002, 3}, 1));
        assertArrayEquals(new int[]{5002, 3, 4, 23, 104, 435}, Solution.rotateByTimes(new int[]{4, 23, 104, 435, 5002, 3}, 2));
        assertArrayEquals(new int[]{3, 2}, Solution.rotateByTimes(new int[]{2
                , 3}, 1));
    }

    @Test
    void websitePagination() {
        assertArrayEquals(new String[]{"url1", "url2", "url3", "url4"}, Solution.websitePagination(new String[]{"url1", "url2", "url3", "url4", "url5", "url6"}, 4, 1));
        assertArrayEquals(new String[]{"url4", "url5", "url6"}, Solution.websitePagination(new String[]{"url1", "url2", "url3", "url4", "url5", "url6", "url7", "url8", "url9"}, 3, 2));
        assertArrayEquals(new String[]{"url9"}, Solution.websitePagination(new String[]{"url1", "url2", "url3", "url4", "url5", "url6", "url7", "url8", "url9"}, 4, 3));
    }

    @Test
    void fireEmployees() {
        assertArrayEquals(new String[]{"Steve", "David", "Mike", "Julian"}, Solution.fireEmployees(new String[]{"Steve", "David", "Mike", "Donald", "Lake", "Julian"}, new String[]{"Donald", "Lake"}));
        assertArrayEquals(new String[]{}, Solution.fireEmployees(new String[]{"Donald", "Lake"}, new String[]{"Donald", "Lake"}));
        assertArrayEquals(new String[]{"Steve", "David", "Mike", "Donald", "Lake", "Julian"}, Solution.fireEmployees(new String[]{"Steve", "David", "Mike", "Donald", "Lake", "Julian"}, new String[]{}));
        assertArrayEquals(new String[]{"Steve", "David", "Donald", "Lake", "Julian"}, Solution.fireEmployees(new String[]{"Mike", "Steve", "David", "Mike", "Donald", "Lake", "Julian"}, new String[]{"Mike"}));
    }

    @Test
    void primesUpToNCount() {
        assertEquals(0, Solution.primesUpToNCount(2));
        assertEquals(1, Solution.primesUpToNCount(3));
        assertEquals(2, Solution.primesUpToNCount(5));
        assertEquals(5, Solution.primesUpToNCount(13));
        assertEquals(7, Solution.primesUpToNCount(18));
        assertEquals(23, Solution.primesUpToNCount(89));
        assertEquals(24, Solution.primesUpToNCount(97));
        assertEquals(25, Solution.primesUpToNCount(100));
        assertEquals(72, Solution.primesUpToNCount(367));
        assertEquals(121, Solution.primesUpToNCount(673));
        assertEquals(168, Solution.primesUpToNCount(1000));
        assertEquals(478, Solution.primesUpToNCount(3406));
        assertEquals(2266, Solution.primesUpToNCount(20034));
    }

    @Test
    void shuffledPositions() {
        assertArrayEquals(new int[]{2, 1, 0},
                Solution.shuffledPositions(new int[]{2, 32, 45}, new int[]{45, 32, 2}));
        assertArrayEquals(new int[]{1, 3, 0, 2},
                Solution.shuffledPositions(new int[]{10, 11, 12, 13}, new int[]{12, 10, 13, 11}));
        assertArrayEquals(new int[]{0, 1, 2, 3},
                Solution.shuffledPositions(new int[]{10, 11, 12, 13}, new int[]{10, 11, 12, 13}));
        assertArrayEquals(new int[]{4, 5, 0, 3, 1, 6, 2},
                Solution.shuffledPositions(new int[]{1350, 181, 1714, 375, 1331, 943, 735}, new int[]{1714, 1331, 735, 375, 1350, 181, 943}));
    }

    @Test
    void shuffleSuccessRate() {
        assertEquals(66, Solution.shuffleSuccessRate(new int[]{2, 32, 45}, new int[]{45, 32, 2}));
        assertEquals(100, Solution.shuffleSuccessRate(new int[]{2, 32, 45}, new int[]{45, 2, 32}));
        assertEquals(0, Solution.shuffleSuccessRate(new int[]{2, 32, 45}, new int[]{2, 32, 45}));
        assertEquals(50, Solution.shuffleSuccessRate(new int[]{2, 32, 45, 67}, new int[]{2, 32, 67, 45}));
        assertEquals(80, Solution.shuffleSuccessRate(new int[]{2, 32, 45, 67, 89}, new int[]{2, 89, 67, 45, 32}));
        assertEquals(95, Solution.shuffleSuccessRate(new int[]{119, 726, 398, 187, 943, 486, 728, 305, 968, 754, 650, 536, 969, 305, 111, 225, 708, 806, 40, 969}, new int[]{708, 969, 111, 398, 754, 726, 536, 943, 486, 305, 969, 40, 650, 806, 187, 225, 968, 119, 728, 305}));
    }

    @Test
    void missingItems() {
        assertArrayEquals(new int[]{2, 4, 6, 7, 8}, Solution.missingItems(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, new int[]{1, 3, 5}));
        assertArrayEquals(new int[]{3, 4, 5}, Solution.missingItems(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2}));
        assertArrayEquals(new int[]{1, 1}, Solution.missingItems(new int[]{1, 1}, new int[]{2, 2}));
        assertArrayEquals(new int[]{9, 8, 7, 6, 5}, Solution.missingItems(new int[]{9, 8, 7, 6, 5}, new int[]{1, 2}));
        assertArrayEquals(new int[]{1, 2}, Solution.missingItems(new int[]{1, 2}, new int[]{9, 8, 7, 6, 5}));
        assertArrayEquals(new int[]{3, 4, 5}, Solution.missingItems(new int[]{3, 4, 5, 1, 2}, new int[]{1, 2}));
        assertArrayEquals(new int[]{8, 3, 45, 67, 23, 9, 3}, Solution.missingItems(new int[]{8, 3, 45, 67, 23, 9, 3}, new int[]{5, 7}));
        assertArrayEquals(new int[]{8, 3, 67, 23, 9, 3}, Solution.missingItems(new int[]{8, 3, 45, 67, 23, 9, 3}, new int[]{5, 45}));
        assertArrayEquals(new int[]{8, 45, 67, 23, 9}, Solution.missingItems(new int[]{8, 3, 45, 67, 23, 9, 3}, new int[]{3}));
        assertArrayEquals(new int[]{8, 3, 45, 67, 23, 9, 3}, Solution.missingItems(new int[]{8, 3, 45, 67, 23, 9, 3}, new int[]{}));
    }

    @Test
    void intersectionOfArraysRepeats() {
        assertArrayEquals(new int[]{1, 2, 3}, Solution.intersectionOfArraysRepeats(new int[]{3, 2, 1}, new int[]{3, 2, 1}));
        assertArrayEquals(new int[]{1, 1}, Solution.intersectionOfArraysRepeats(new int[]{1, 1, 1}, new int[]{1, 2, 3, 2, 1}));
        assertArrayEquals(new int[]{2, 3, 10, 10}, Solution.intersectionOfArraysRepeats(new int[]{3, 2, 2, 2, 1, 10, 10}, new int[]{3, 2, 10, 10, 10}));
        assertArrayEquals(new int[]{8, 19}, Solution.intersectionOfArraysRepeats(new int[]{2, 19, 11, 2, 6, 8}, new int[]{10, 23, 5, 8, 19}));
        assertArrayEquals(new int[]{}, Solution.intersectionOfArraysRepeats(new int[]{4, 22, 100, 88, 6, 8}, new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{-2, -1, -1}, Solution.intersectionOfArraysRepeats(new int[]{-1, -2, -1, -1}, new int[]{-1, -1, -2, -2}));
        assertArrayEquals(new int[]{1, 2, 2}, Solution.intersectionOfArraysRepeats(new int[]{1, 2, 2, 1}, new int[]{2, 2, 2, 1}));
        assertArrayEquals(new int[]{4, 9}, Solution.intersectionOfArraysRepeats(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}));
    }

    @Test
    void findXTimes() {
        assertEquals(false, Solution.findXTimes("bacddc"));
        assertEquals(false, Solution.findXTimes("babcddc"));
        assertEquals(true, Solution.findXTimes("babacddc"));
        assertEquals(true, Solution.findXTimes("aaabbbcccddd"));
        assertEquals(false, Solution.findXTimes("aaabbccdd"));
        assertEquals(true, Solution.findXTimes("zadbchvwxbwhdxvcza"));
        assertEquals(false, Solution.findXTimes("zadbchvwxbwhdxvczb"));
        assertEquals(true, Solution.findXTimes("zab"));
        assertEquals(true, Solution.findXTimes("z"));
    }

    @Test
    void hasSameType() {
        assertEquals(false, Solution.hasSameType("aabb","yyza"));
        assertEquals(true, Solution.hasSameType("aappl","bbtte"));
        assertEquals(false, Solution.hasSameType("aappl","bbttb"));
        assertEquals(false, Solution.hasSameType("aabb","abab"));
        assertEquals(false, Solution.hasSameType("aappl","bktte"));
        assertEquals(false, Solution.hasSameType("aaapppl","bbbttke"));
        assertEquals(false, Solution.hasSameType("abcd","tso"));
        assertEquals(true, Solution.hasSameType("abcd","jklm"));
        assertEquals(true, Solution.hasSameType("aaabbccdddaa","jjjddkkpppjj"));
        assertEquals(false, Solution.hasSameType("aaabbccdddaa","jjjddkkpppjd"));
    }

    @Test
    void findPairs() {
        assertArrayEquals(new int[]{7,16}, Solution.findPairs(new int[]{10,12,13,14,15,16,16,7,7,8}));
        assertArrayEquals(new int[]{1}, Solution.findPairs(new int[]{1,1}));
        assertArrayEquals(new int[]{}, Solution.findPairs(new int[]{1,2}));
        assertArrayEquals(new int[]{6,7}, Solution.findPairs(new int[]{1,2,3,4,5,6,6,7,7,8}));
        assertArrayEquals(new int[]{1,3,4,6}, Solution.findPairs(new int[]{1,3,6,3,1,4,6,4}));
        assertArrayEquals(new int[]{-1,3,4,6}, Solution.findPairs(new int[]{3,3,-1,-1,1,6,6,4,4}));
        assertArrayEquals(new int[]{600}, Solution.findPairs(new int[]{30,30,30,30,1,600,600,40,40,40}));
    }

    @Test
    void firstNonRepeating() {
        assertEquals(4, Solution.firstNonRepeating("aabbcdddeffg"));
        assertEquals(8, Solution.firstNonRepeating("abcdabcdf"));
        assertEquals(6, Solution.firstNonRepeating("abcddaebcdf"));
        assertEquals(-1, Solution.firstNonRepeating("aabbbccdd"));
        assertEquals(2, Solution.firstNonRepeating("ddecdfgf"));
        assertEquals(0, Solution.firstNonRepeating("abcdeeff"));
        assertEquals(5, Solution.firstNonRepeating("zzcbdefghafhgbbcd"));
    }
}
