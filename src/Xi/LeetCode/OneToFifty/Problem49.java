package Xi.LeetCode.OneToFifty;

import java.util.*;

/**
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"],<br>
  Output:<br>
  [<br>
    ["ate","eat","tea"],<br>
    ["nat","tan"],<br>
    ["bat"]<br>
  ]
 */
public class Problem49 {

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            int[] composition = new int[26];
            Arrays.fill(composition, 0);

            for (char c : str.toCharArray()) composition[c - 'a']++;

            StringBuffer sb = new StringBuffer();

            for (int i : composition) sb.append(i);

            String key = sb.toString();
            if (map.containsKey(key)) {
                map.get(key).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(key, list);
                result.add(list);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List list = groupAnagrams(strs);
        for (Object o : list) {
            System.out.println(o.toString());
        }
    }

}
