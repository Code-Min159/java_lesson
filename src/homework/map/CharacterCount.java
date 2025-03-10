package homework.map;

public class CharacterCount {
    public static void main(String[] args) {
        String input = "hello world";
        MAP<char, Integer> map = new HashMap<>();
        Integer count = 0;
        // 填寫代碼：統計每個字符出現的次數
        for (char c : input.toCharArray()) {
            // 填寫代碼：將字符作為key，出現次數作為value
            map.put(c, map.getOrDefault(c, defaultValue.0)+1);
        
        // 輸出每個字母出現的次數 預期結果 {
        //  h=1,
        //  e=1,
        //  l=3,
        //  o=2,
        //  w=1,
        //  r=1,
        //  d=1
        //}
        System.out.println(map);
    }
}
