package com.p7700g.p99005;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AssetsExtractor.java */
/* loaded from: classes2.dex */
public class m81 {
    public static final String a = "checksum.json";

    public static void a(@x1 Context context, @x1 String str, @x1 String str2) throws IOException {
        b(context, str, str2, d(str2));
    }

    private static void b(@x1 Context context, @x1 String str, @x1 String str2, @x1 Map<String, String> map) throws IOException {
        String[] list;
        HashMap hashMap = new HashMap(map);
        try {
            list = context.getAssets().list(str);
        } catch (IOException unused) {
            String str3 = map.get(str);
            InputStream open = context.getAssets().open(str);
            try {
                String a2 = l81.a(open);
                if (str3 == null || !str3.equals(a2)) {
                    c(context, str, str2);
                    map.put(str, a2);
                }
            } finally {
                open.close();
            }
        }
        if (list.length != 0) {
            File file = new File(str2, str);
            if (!file.exists() && !file.mkdirs()) {
                throw new IOException("Unable to create folder:\"" + file.getAbsolutePath() + "\"");
            }
            for (String str4 : list) {
                if (str.isEmpty()) {
                    b(context, str4, str2, map);
                } else {
                    b(context, str + "/" + str4, str2, map);
                }
            }
            if (hashMap.equals(map)) {
                return;
            }
            f(map, str2);
            return;
        }
        throw new IOException();
    }

    private static void c(@x1 Context context, @x1 String str, @x1 String str2) throws IOException {
        FileOutputStream fileOutputStream;
        Throwable th;
        InputStream inputStream;
        File file = new File(str2, str);
        try {
            inputStream = context.getAssets().open(str);
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[1024];
                    for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                        fileOutputStream.write(bArr, 0, read);
                    }
                    inputStream.close();
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th = th2;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (Throwable th4) {
            fileOutputStream = null;
            th = th4;
            inputStream = null;
        }
    }

    @x1
    private static Map<String, String> d(@x1 String str) {
        File file = new File(str, a);
        if (file.exists()) {
            try {
                return e(new JSONObject(n81.m(file)));
            } catch (Exception unused) {
                return new HashMap();
            }
        }
        return new HashMap();
    }

    @x1
    private static Map<String, String> e(@x1 JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.getString(next));
        }
        return hashMap;
    }

    private static void f(@x1 Map<String, String> map, @x1 String str) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (JSONException unused) {
            }
        }
        try {
            n81.p(new File(str, a), jSONObject.toString());
        } catch (IOException unused2) {
        }
    }
}