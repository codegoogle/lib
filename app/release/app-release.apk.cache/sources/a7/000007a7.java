package com.anythink.expressad.atsignalcommon.windvane;

import android.net.Uri;
import android.text.TextUtils;
import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class n {
    private static final String[] a = {"wv_hybrid:", "mraid:", "ssp:", "mvb_hybrid:"};
    private static final Pattern b = Pattern.compile("hybrid://(.+?):(.+?)/(.+?)(\\?(.*?))?");
    private static final Pattern c = Pattern.compile("mraid://(.+?):(.+?)/(.+?)(\\?(.*?))?");
    private static final Pattern d = Pattern.compile("ssp://(.+?):(.+?)/(.+?)(\\?(.*?))?");
    private static final Pattern e = Pattern.compile("mv://(.+?):(.+?)/(.+?)(\\?(.*?))?");
    private static Map<String, String> f = new HashMap();

    static {
        h[] values = h.values();
        for (int i = 0; i < 9; i++) {
            h hVar = values[i];
            f.put(hVar.a(), hVar.b());
        }
    }

    public static boolean a(String str) {
        for (String str2 : a) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static Pattern b(String str) {
        if ("wv_hybrid:".equals(str)) {
            return e;
        }
        if ("mraid:".equals(str)) {
            return c;
        }
        if ("ssp:".equals(str)) {
            return d;
        }
        if ("mvb_hybrid:".equals(str)) {
            return e;
        }
        return null;
    }

    public static String c(String str) {
        char[] cArr = {'\'', '\\'};
        StringBuffer stringBuffer = new StringBuffer(1000);
        stringBuffer.setLength(0);
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            boolean z = true;
            if (charAt > 255) {
                stringBuffer.append("\\u");
                String upperCase = Integer.toHexString(charAt >>> '\b').toUpperCase();
                if (upperCase.length() == 1) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(upperCase);
                String upperCase2 = Integer.toHexString(charAt & 255).toUpperCase();
                if (upperCase2.length() == 1) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(upperCase2);
            } else {
                int i2 = 0;
                while (true) {
                    if (i2 >= 2) {
                        z = false;
                        break;
                    } else if (cArr[i2] == charAt) {
                        stringBuffer.append("\\".concat(String.valueOf(charAt)));
                        break;
                    } else {
                        i2++;
                    }
                }
                if (!z) {
                    stringBuffer.append(charAt);
                }
            }
        }
        return new String(stringBuffer);
    }

    public static boolean d(String str) {
        return e(str).startsWith("image");
    }

    public static String e(String str) {
        String str2 = f.get(f(str));
        return str2 == null ? "" : str2;
    }

    private static String f(String str) {
        String path;
        int lastIndexOf;
        return (TextUtils.isEmpty(str) || (path = Uri.parse(str).getPath()) == null || (lastIndexOf = path.lastIndexOf(CryptoConstants.ALIAS_SEPARATOR)) == -1) ? "" : path.substring(lastIndexOf + 1);
    }
}