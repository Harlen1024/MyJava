package com.swing.tool.urltool;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

//url编码类
public class UrlCode {

    public static String urlEncode(String url) throws UnsupportedEncodingException {
        if (url == null) {
            return null;
        }

        final String reserved_char = ";/?:@=&";
        String ret = "";
        for (int i = 0; i < url.length(); i++) {
            String cs = String.valueOf(url.charAt(i));
            if (reserved_char.contains(cs)) {
                ret += cs;
            } else {
                ret += URLEncoder.encode(cs, "utf-8");
            }
        }
        return ret.replace("+", "%20");
    }

    public static void main(String[] args) throws UnsupportedEncodingException {

        System.out.println(urlEncode("5"));

    }

}
