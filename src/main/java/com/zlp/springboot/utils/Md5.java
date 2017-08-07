package com.zlp.springboot.utils;

import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by lenovo on 2017/8/7.
 */
public class Md5 {
    public static String EncoderByMd5(String str) {
        //确定计算方法
        MessageDigest md5 = null;
        //加密后的字符串
        String newstr = null;
        try {
            BASE64Encoder base64en = new BASE64Encoder();
            md5 = MessageDigest.getInstance("MD5");
            newstr = base64en.encode(md5.digest(str.getBytes("utf-8")));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return newstr;
    }

    public static void main(String[] args) {
        System.out.println(EncoderByMd5("admin"));
    }
}
