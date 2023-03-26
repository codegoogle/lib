package com.p7700g.p99005;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.p7700g.p99005.rs2;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
/* loaded from: classes3.dex */
public class cu2 {
    @x1
    private final Bundle a;

    public cu2(@x1 Bundle bundle) {
        Objects.requireNonNull(bundle, "data");
        this.a = new Bundle(bundle);
    }

    private static String B(String str) {
        return str.startsWith(rs2.c.b) ? str.substring(6) : str;
    }

    private static int d(String str) {
        int parseColor = Color.parseColor(str);
        if (parseColor != -16777216) {
            return parseColor;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    private static boolean t(String str) {
        return str.startsWith(rs2.a.a) || str.equals("from");
    }

    public static boolean v(@x1 Bundle bundle) {
        return "1".equals(bundle.getString(rs2.c.d)) || "1".equals(bundle.getString(x(rs2.c.d)));
    }

    private static boolean w(String str) {
        return str.startsWith(rs2.d.o) || str.startsWith(rs2.c.b) || str.startsWith(rs2.c.c);
    }

    private static String x(String str) {
        return !str.startsWith(rs2.c.b) ? str : str.replace(rs2.c.b, rs2.c.c);
    }

    private String y(String str) {
        if (!this.a.containsKey(str) && str.startsWith(rs2.c.b)) {
            String x = x(str);
            if (this.a.containsKey(x)) {
                return x;
            }
        }
        return str;
    }

    @x1
    public Bundle A() {
        Bundle bundle = new Bundle(this.a);
        for (String str : this.a.keySet()) {
            if (w(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public boolean a(@x1 String str) {
        String p = p(str);
        return "1".equals(p) || Boolean.parseBoolean(p);
    }

    @x1
    public Integer b(@x1 String str) {
        String p = p(str);
        if (TextUtils.isEmpty(p)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(p));
        } catch (NumberFormatException unused) {
            String.valueOf(B(str)).length();
            String.valueOf(p).length();
            return null;
        }
    }

    @z1
    public JSONArray c(@x1 String str) {
        String p = p(str);
        if (TextUtils.isEmpty(p)) {
            return null;
        }
        try {
            return new JSONArray(p);
        } catch (JSONException unused) {
            String.valueOf(B(str)).length();
            String.valueOf(p).length();
            return null;
        }
    }

    @z1
    public int[] e() {
        JSONArray c = c(rs2.c.w);
        if (c == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (c.length() == 3) {
                iArr[0] = d(c.optString(0));
                iArr[1] = c.optInt(1);
                iArr[2] = c.optInt(2);
                return iArr;
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (IllegalArgumentException e) {
            String valueOf = String.valueOf(c);
            String message = e.getMessage();
            valueOf.length();
            String.valueOf(message).length();
            return null;
        } catch (JSONException unused) {
            String.valueOf(c).length();
            return null;
        }
    }

    @z1
    public Uri f() {
        String p = p(rs2.c.C);
        if (TextUtils.isEmpty(p)) {
            p = p(rs2.c.B);
        }
        if (TextUtils.isEmpty(p)) {
            return null;
        }
        return Uri.parse(p);
    }

    @z1
    public Object[] g(@x1 String str) {
        JSONArray c = c(String.valueOf(str).concat(rs2.c.G));
        if (c == null) {
            return null;
        }
        int length = c.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = c.optString(i);
        }
        return strArr;
    }

    @z1
    public String h(@x1 String str) {
        return p(String.valueOf(str).concat(rs2.c.F));
    }

    @z1
    public String i(@x1 Resources resources, @x1 String str, @x1 String str2) {
        String h = h(str2);
        if (TextUtils.isEmpty(h)) {
            return null;
        }
        int identifier = resources.getIdentifier(h, "string", str);
        if (identifier == 0) {
            String.valueOf(B(String.valueOf(str2).concat(rs2.c.F))).length();
            String.valueOf(str2).length();
            return null;
        }
        Object[] g = g(str2);
        if (g == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, g);
        } catch (MissingFormatArgumentException unused) {
            String B = B(str2);
            String arrays = Arrays.toString(g);
            String.valueOf(B).length();
            String.valueOf(arrays).length();
            return null;
        }
    }

    @x1
    public Long j(@x1 String str) {
        String p = p(str);
        if (TextUtils.isEmpty(p)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(p));
        } catch (NumberFormatException unused) {
            String.valueOf(B(str)).length();
            String.valueOf(p).length();
            return null;
        }
    }

    @x1
    public String k() {
        return p(rs2.c.D);
    }

    @z1
    public Integer l() {
        Integer b = b(rs2.c.t);
        if (b == null) {
            return null;
        }
        if (b.intValue() < 0) {
            String.valueOf(b).length();
            return null;
        }
        return b;
    }

    @z1
    public Integer m() {
        Integer b = b(rs2.c.p);
        if (b == null) {
            return null;
        }
        if (b.intValue() < -2 || b.intValue() > 2) {
            String.valueOf(b).length();
            return null;
        }
        return b;
    }

    @x1
    public String n(@x1 Resources resources, @x1 String str, @x1 String str2) {
        String p = p(str2);
        return !TextUtils.isEmpty(p) ? p : i(resources, str, str2);
    }

    @z1
    public String o() {
        String p = p(rs2.c.y);
        return TextUtils.isEmpty(p) ? p(rs2.c.z) : p;
    }

    @x1
    public String p(@x1 String str) {
        return this.a.getString(y(str));
    }

    @z1
    public long[] q() {
        JSONArray c = c(rs2.c.v);
        if (c == null) {
            return null;
        }
        try {
            if (c.length() > 1) {
                int length = c.length();
                long[] jArr = new long[length];
                for (int i = 0; i < length; i++) {
                    jArr[i] = c.optLong(i);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            String.valueOf(c).length();
            return null;
        }
    }

    public Integer r() {
        Integer b = b(rs2.c.u);
        if (b == null) {
            return null;
        }
        if (b.intValue() < -1 || b.intValue() > 1) {
            String.valueOf(b).length();
            return null;
        }
        return b;
    }

    public boolean s() {
        return !TextUtils.isEmpty(p(rs2.c.j));
    }

    public boolean u() {
        return a(rs2.c.d);
    }

    @x1
    public Bundle z() {
        Bundle bundle = new Bundle(this.a);
        for (String str : this.a.keySet()) {
            if (!t(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}