package com.epam.stream27.taskone;

class MethodForReplace {

    String replaceSymbol(String str, int k, char symbol) {
        StringBuilder sb = new StringBuilder();
        for (String word : str.split(" ")) {
            if (word.length() >= k) {
//                    sb.append(word.substring(0, k - 1)).append(symbol).append(word.substring(k, word.length()));
                sb.append(word, 0, k - 1).append(symbol).append(word.substring(k));
            } else {
                sb.append(word);
            }
            sb.append(" ");
        }
        return sb.toString();
    }
}
