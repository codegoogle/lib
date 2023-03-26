package com.p7700g.p99005;

import java.security.MessageDigest;

/* loaded from: classes3.dex */
public final class bf3 {
    public String a;

    public bf3(String str) {
        this.a = str;
    }

    private String a(String str) {
        try {
            return com.ironsource.sdk.utils.c.a(str);
        } catch (Exception e) {
            e.printStackTrace();
            return c(str);
        }
    }

    private String c(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() < 2) {
                    hexString = "0" + hexString;
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public final boolean b(String str, String str2, String str3) {
        try {
            return str3.equalsIgnoreCase(a(str + str2 + this.a));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}