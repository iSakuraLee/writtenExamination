import java.util.*;

public class Main {
    List<String> tmp = new ArrayList<>();

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5, 6, 6};
        String[] str = {"word","good","best","word"};
        String s = "wordgoodgoodgoodbestword";

        List<Integer> list = new Main().findSubstring(s, str);
        System.out.println(list);

        HashMap<Integer, Integer> map = new HashMap<>();
    }

    public List<Integer> findSubstring(String s, String[] words) {
        fullSort(words);
        ArrayList<Integer> res = new ArrayList<>();
        for (String str : tmp) {
            int index = s.indexOf(str);
            if (index != -1) {
                res.add(index);
            }
        }
        return res;
    }

    public void fullSort(String[] words){
        if (!tmp.isEmpty()) {
            tmp.removeAll(tmp);
        }
        fullSortCore(words, 0, words.length);
    }

    private void fullSortCore(String[] words, int start, int end) {
        if (end < 0) {
            return;
        }
        if (start == end) {
            String s = stringParse(words);
            if (!tmp.contains(s)) {
                tmp.add(s);
            }
        } else {
            for (int i = start; i < end; i++) {
                swap(words, i, start);
                fullSortCore(words, start + 1, end);
                swap(words, start, i);
            }
        }
    }

    private void swap(String[] words, int a, int b) {
        String temp = words[a];
        words[a] = words[b];
        words[b] = temp;
    }

    private String stringParse(String[] words) {
        StringBuilder sb = new StringBuilder();
        for (String s : words) {
            sb.append(s);
        }
        return sb.toString();
    }

}

