package com.anythink.expressad.foundation.g.f.h;

import android.text.TextUtils;
import com.anythink.expressad.foundation.h.n;
import com.microsoft.appcenter.AppCenter;
import com.p7700g.p99005.h95;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class c {
    public static String a = "a";
    public static String b = "d";
    public static String c = "e";
    private static final String d = "c";
    private Map<String, String> e = new LinkedHashMap();
    private Map<String, com.anythink.expressad.foundation.g.f.c.b> f = new LinkedHashMap();

    public c() {
    }

    private JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : this.e.entrySet()) {
                jSONObject.put(URLEncoder.encode(entry.getKey(), "UTF-8"), URLEncoder.encode(entry.getValue(), "UTF-8"));
            }
            for (Map.Entry<String, com.anythink.expressad.foundation.g.f.c.b> entry2 : this.f.entrySet()) {
                jSONObject.put(URLEncoder.encode(entry2.getKey(), "UTF-8"), URLEncoder.encode("FILE_NAME_" + entry2.getValue().a().getName(), "UTF-8"));
            }
        } catch (UnsupportedEncodingException unused) {
        } catch (JSONException e) {
            n.d(d, e.getMessage());
        }
        return jSONObject;
    }

    public final void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || str2 == null) {
            return;
        }
        this.e.put(str, str2);
    }

    public final Map<String, String> b() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(28);
        try {
            for (Map.Entry<String, String> entry : this.e.entrySet()) {
                if (sb.length() > 0) {
                    sb.append(h95.d);
                }
                sb.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                sb.append('=');
                sb.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
            }
            for (Map.Entry<String, com.anythink.expressad.foundation.g.f.c.b> entry2 : this.f.entrySet()) {
                if (sb.length() > 0) {
                    sb.append(h95.d);
                }
                sb.append(URLEncoder.encode(entry2.getKey(), "UTF-8"));
                sb.append('=');
                sb.append(URLEncoder.encode("FILE_NAME_" + entry2.getValue().a().getName(), "UTF-8"));
            }
        } catch (UnsupportedEncodingException e) {
            n.d(d, e.getMessage());
        }
        return sb.toString();
    }

    private void b(String str, File file) {
        if (file != null && file.exists()) {
            String name = TextUtils.isEmpty(null) ? file.getName() : null;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f.put(str, new com.anythink.expressad.foundation.g.f.c.b(name, file, name));
            return;
        }
        throw new FileNotFoundException();
    }

    private void a(String str, File file, String str2) {
        if (file != null && file.exists()) {
            if (TextUtils.isEmpty(null)) {
                str2 = file.getName();
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f.put(str, new com.anythink.expressad.foundation.g.f.c.b(str2, file, str2));
            return;
        }
        throw new FileNotFoundException();
    }

    private c(String str, String str2) {
        this.e.put(str, str2);
    }

    private c(Map<String, String> map) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                a(entry.getKey(), entry.getValue());
            }
        }
    }

    private void a(Map<String, ?> map) {
        if (map != null) {
            for (Map.Entry<String, ?> entry : map.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof String) {
                    a(entry.getKey(), (String) entry.getValue());
                } else if (value instanceof File) {
                    String key = entry.getKey();
                    File file = (File) entry.getValue();
                    if (file != null && file.exists()) {
                        String name = TextUtils.isEmpty(null) ? file.getName() : null;
                        if (!TextUtils.isEmpty(key)) {
                            this.f.put(key, new com.anythink.expressad.foundation.g.f.c.b(name, file, name));
                        }
                    } else {
                        throw new FileNotFoundException();
                    }
                } else {
                    continue;
                }
            }
        }
    }

    private c(String... strArr) {
        int length = strArr.length;
        if (length % 2 != 0) {
            throw new IllegalArgumentException("Supplied arguments must be even");
        }
        for (int i = 0; i < length; i += 2) {
            a(strArr[i], strArr[i + 1]);
        }
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : this.e.entrySet()) {
                if (sb.length() > 0) {
                    sb.append(h95.d);
                }
                sb.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                sb.append(AppCenter.KEY_VALUE_DELIMITER);
                sb.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    private void a(String str) {
        this.e.remove(str);
        this.f.remove(str);
    }

    private void a(String str, File file) {
        if (file != null && file.exists()) {
            String name = TextUtils.isEmpty(null) ? file.getName() : null;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f.put(str, new com.anythink.expressad.foundation.g.f.c.b(name, file, name));
            return;
        }
        throw new FileNotFoundException();
    }
}