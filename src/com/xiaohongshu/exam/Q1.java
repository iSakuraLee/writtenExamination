package com.xiaohongshu.exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {
    static String[] splitMsg(String text) {
        int MAX_SIZE = 20;  //
        char[] tempArray = new char[MAX_SIZE];  // 消息的最大长度
        int lastParagraphEnd = 0;
        int lastSentenceEnd = 0;
        int pos = 0;  // 当前位置
        int lastTextPos = 0;

        ArrayList<String> ret = new ArrayList<>();

        char[] textChars = text.toCharArray();  // 输入的文本字符数组
        char[] splited;
        for (int textpos = 0; textpos < textChars.length; ) {  // 遍历整个文本字符数组
            char c = textChars[textpos];
            textpos++;
            tempArray[pos] = c;

            if (c == '\n') {  // 换行的情况
                lastParagraphEnd = pos;  // 换行符的位置
            } else if ('.' == c || '!' == c) {  // 句子的结束位置
                lastSentenceEnd = pos;
            }
            pos++;
            if (pos == MAX_SIZE) {
                int splitPos = lastParagraphEnd > 0 ? lastParagraphEnd : lastSentenceEnd;
                splited = new char[splitPos + 1];
                System.arraycopy(tempArray, 0, splited, 0, splitPos + 1);

                ret.add(new String(splited));
                lastParagraphEnd = 0;
                lastSentenceEnd = 0;
                pos = 0;
                textpos = lastTextPos + splitPos + 1;
                lastTextPos = textpos;
            }
        }
        if (pos > 0) {
            splited = new char[pos - 1];

            System.arraycopy(tempArray, 0, splited, 0, pos - 1);
            ret.add(new String(splited));
        }
        return ret.toArray(new String[]{});
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] res;
        StringBuffer sb = new StringBuffer();
        while (in.hasNextLine()) {
            String line = in.nextLine();
            if (line.length() == 0) {
                break;
            }
            sb.append(line).append("\n");
        }

        res = splitMsg(sb.toString());
        for (int res_i = 0; res_i < res.length; res_i++) {
            System.out.println(String.format("msg%d:%s", res_i + 1, res[res_i]));
        }

    }
}
