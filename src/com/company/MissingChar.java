package com.company;

/**
 * Created by ridita on 6/19/17.
 */
public class MissingChar {
    public String missingChar(String str, int n) {

        if (n == 0) {
            return str.substring(1);
        } else if (n >= 1) {
            return str.substring(0, n) + str.substring(n + 1);
        }

        return "";

    }

}
