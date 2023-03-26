package com.p7700g.p99005;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.AssetManager;
import android.os.Build;
import android.text.TextUtils;
import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: OpenVpnBinary.java */
/* loaded from: classes3.dex */
public class xy3 {
    @x1
    public static final String a = "libovpnexec.so";
    private static final kj1 b = kj1.b("OpenVpnBinary");
    private static final String c = "android.conf";
    private static final String d = "nopie_openvpn";
    private static final String e = "pie_openvpn";

    /* compiled from: OpenVpnBinary.java */
    /* loaded from: classes3.dex */
    public static class a {
        @x1
        private final List<String> a;
        @x1
        private final Map<String, String> b;
        @x1
        private final String c;

        public a(@x1 List<String> list, @x1 Map<String, String> map, @x1 String str) {
            this.a = list;
            this.b = map;
            this.c = str;
        }

        @x1
        public List<String> a() {
            return this.a;
        }

        @x1
        public Map<String, String> b() {
            return this.b;
        }

        @x1
        public String c() {
            return this.c;
        }
    }

    @x1
    private static List<String> a(@x1 File file, @z1 String str, @x1 String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add("--config");
        arrayList.add(file.getAbsolutePath() + File.separator + c);
        if (!TextUtils.isEmpty(str)) {
            arrayList.add("--auth-user-pass");
            arrayList.add(str);
        }
        return arrayList;
    }

    @x1
    private static String c() {
        return e;
    }

    @x1
    private static String d() {
        return c().concat(String.valueOf((long) qy3.d));
    }

    @x1
    private static List<String> e(@x1 Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        ArrayList arrayList = new ArrayList();
        try {
            com.facebook.soloader.w.f(context, 4);
            String[] split = com.facebook.soloader.w.o().split(":");
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(applicationInfo.nativeLibraryDir);
            for (String str : split) {
                if (!"/vendor/lib".equals(str) && !"/system/lib".equals(str)) {
                    arrayList2.add(str);
                }
            }
            if (arrayList2.size() != 0) {
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(applicationInfo.nativeLibraryDir);
            }
        } catch (IOException e2) {
            b.f(e2);
        }
        return arrayList;
    }

    private void f(@x1 Context context, @x1 th3 th3Var) {
        try {
            FileWriter fileWriter = new FileWriter(context.getCacheDir().getAbsolutePath() + File.separator + c);
            fileWriter.write(th3Var.c());
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e2) {
            b.f(e2);
        }
    }

    @z1
    private static String g(@x1 Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return h(context);
        }
        return i(context);
    }

    @z1
    private static String h(@x1 Context context) {
        for (String str : e(context)) {
            File file = new File(str, a);
            if (file.exists()) {
                return file.getAbsolutePath();
            }
        }
        return null;
    }

    @z1
    private static String i(@x1 Context context) {
        InputStream open;
        File file = new File(context.getCacheDir(), d());
        if (file.exists() && file.canExecute()) {
            return file.getAbsolutePath();
        }
        try {
            try {
                AssetManager assets = context.getAssets();
                open = assets.open(c() + CryptoConstants.ALIAS_SEPARATOR + Build.CPU_ABI);
            } catch (IOException unused) {
                kj1 kj1Var = b;
                kj1Var.e("Failed getting assets for archicture " + Build.CPU_ABI, new Object[0]);
                AssetManager assets2 = context.getAssets();
                open = assets2.open(c() + CryptoConstants.ALIAS_SEPARATOR + Build.CPU_ABI2);
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[4096];
            for (int read = open.read(bArr); read > 0; read = open.read(bArr)) {
                fileOutputStream.write(bArr, 0, read);
            }
            fileOutputStream.close();
            if (!file.setExecutable(true)) {
                b.e("Failed to make OpenVPN executable", new Object[0]);
                return null;
            }
            return file.getAbsolutePath();
        } catch (IOException e2) {
            b.f(e2);
            return null;
        }
    }

    @z1
    public a b(@x1 Context context, @x1 th3 th3Var) {
        String g = g(context);
        if (g == null) {
            return null;
        }
        List<String> a2 = a(context.getCacheDir(), th3Var.b(), g);
        f(context, th3Var);
        return new a(a2, new HashMap(), TextUtils.join(":", e(context)));
    }
}