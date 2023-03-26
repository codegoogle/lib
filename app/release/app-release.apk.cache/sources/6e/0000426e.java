package com.p7700g.p99005;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.microsoft.appcenter.crashes.utils.ErrorLogHelper;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.json.JSONObject;

/* compiled from: LottieCompositionFactory.java */
/* loaded from: classes.dex */
public class fi0 {
    private static final Map<String, oi0<ei0>> a = new HashMap();
    private static final byte[] b = {80, 75, 3, 4};

    private fi0() {
    }

    @s2
    public static ni0<ei0> A(ZipInputStream zipInputStream, @z1 String str) {
        try {
            return B(zipInputStream, str);
        } finally {
            cp0.c(zipInputStream);
        }
    }

    @s2
    private static ni0<ei0> B(ZipInputStream zipInputStream, @z1 String str) {
        String[] split;
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            ei0 ei0Var = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(ErrorLogHelper.ERROR_LOG_FILE_EXTENSION)) {
                    ei0Var = n(po0.r(jw5.d(jw5.s(zipInputStream))), null, false).b();
                } else {
                    if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                        zipInputStream.closeEntry();
                    }
                    hashMap.put(name.split("/")[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (ei0Var == null) {
                return new ni0<>(new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                ii0 c = c(ei0Var, (String) entry.getKey());
                if (c != null) {
                    c.h(cp0.m((Bitmap) entry.getValue(), c.f(), c.d()));
                }
            }
            for (Map.Entry<String, ii0> entry2 : ei0Var.j().entrySet()) {
                if (entry2.getValue().a() == null) {
                    StringBuilder G = wo1.G("There is no image for ");
                    G.append(entry2.getValue().c());
                    return new ni0<>(new IllegalStateException(G.toString()));
                }
            }
            if (str != null) {
                vk0.c().d(str, ei0Var);
            }
            return new ni0<>(ei0Var);
        } catch (IOException e) {
            return new ni0<>(e);
        }
    }

    private static boolean C(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    private static Boolean D(uv5 uv5Var) {
        try {
            uv5 p = uv5Var.p();
            for (byte b2 : b) {
                if (p.readByte() != b2) {
                    return Boolean.FALSE;
                }
            }
            p.close();
            return Boolean.TRUE;
        } catch (Exception e) {
            yo0.c("Failed to check zip file header", e);
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused) {
            return Boolean.FALSE;
        }
    }

    public static /* synthetic */ void E(String str, AtomicBoolean atomicBoolean, Throwable th) {
        a.remove(str);
        atomicBoolean.set(true);
    }

    public static /* synthetic */ ni0 F(ei0 ei0Var) throws Exception {
        return new ni0(ei0Var);
    }

    public static /* synthetic */ void G(String str, AtomicBoolean atomicBoolean, ei0 ei0Var) {
        a.remove(str);
        atomicBoolean.set(true);
    }

    public static /* synthetic */ ni0 M(WeakReference weakReference, Context context, int i, String str) throws Exception {
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return u(context, i, str);
    }

    public static /* synthetic */ ni0 N(Context context, String str, String str2) throws Exception {
        ni0<ei0> c = ci0.d(context).c(str, str2);
        if (str2 != null && c.b() != null) {
            vk0.c().d(str2, c.b());
        }
        return c;
    }

    private static String P(Context context, @d2 int i) {
        StringBuilder G = wo1.G("rawRes");
        G.append(C(context) ? "_night_" : "_day_");
        G.append(i);
        return G.toString();
    }

    public static void Q(int i) {
        vk0.c().e(i);
    }

    private static oi0<ei0> a(@z1 final String str, Callable<ni0<ei0>> callable) {
        final ei0 b2 = str == null ? null : vk0.c().b(str);
        if (b2 != null) {
            return new oi0<>(new Callable() { // from class: com.p7700g.p99005.ch0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return fi0.F(ei0.this);
                }
            });
        }
        if (str != null) {
            Map<String, oi0<ei0>> map = a;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        oi0<ei0> oi0Var = new oi0<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            oi0Var.c(new ji0() { // from class: com.p7700g.p99005.bh0
                @Override // com.p7700g.p99005.ji0
                public final void onResult(Object obj) {
                    fi0.G(str, atomicBoolean, (ei0) obj);
                }
            });
            oi0Var.b(new ji0() { // from class: com.p7700g.p99005.wg0
                @Override // com.p7700g.p99005.ji0
                public final void onResult(Object obj) {
                    fi0.E(str, atomicBoolean, (Throwable) obj);
                }
            });
            if (!atomicBoolean.get()) {
                a.put(str, oi0Var);
            }
        }
        return oi0Var;
    }

    public static void b(Context context) {
        a.clear();
        vk0.c().a();
        ci0.c(context).a();
    }

    @z1
    private static ii0 c(ei0 ei0Var, String str) {
        for (ii0 ii0Var : ei0Var.j().values()) {
            if (ii0Var.c().equals(str)) {
                return ii0Var;
            }
        }
        return null;
    }

    public static oi0<ei0> d(Context context, String str) {
        return e(context, str, "asset_" + str);
    }

    public static oi0<ei0> e(Context context, final String str, @z1 final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return a(str2, new Callable() { // from class: com.p7700g.p99005.yg0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return fi0.g(applicationContext, str, str2);
            }
        });
    }

    @s2
    public static ni0<ei0> f(Context context, String str) {
        return g(context, str, "asset_" + str);
    }

    @s2
    public static ni0<ei0> g(Context context, String str, @z1 String str2) {
        try {
            if (!str.endsWith(j20.w) && !str.endsWith(".lottie")) {
                return j(context.getAssets().open(str), str2);
            }
            return A(new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new ni0<>(e);
        }
    }

    @Deprecated
    public static oi0<ei0> h(final JSONObject jSONObject, @z1 final String str) {
        return a(str, new Callable() { // from class: com.p7700g.p99005.ah0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return fi0.q(jSONObject, str);
            }
        });
    }

    public static oi0<ei0> i(final InputStream inputStream, @z1 final String str) {
        return a(str, new Callable() { // from class: com.p7700g.p99005.dh0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return fi0.j(inputStream, str);
            }
        });
    }

    @s2
    public static ni0<ei0> j(InputStream inputStream, @z1 String str) {
        return k(inputStream, str, true);
    }

    @s2
    private static ni0<ei0> k(InputStream inputStream, @z1 String str, boolean z) {
        try {
            return m(po0.r(jw5.d(jw5.s(inputStream))), str);
        } finally {
            if (z) {
                cp0.c(inputStream);
            }
        }
    }

    public static oi0<ei0> l(final po0 po0Var, @z1 final String str) {
        return a(str, new Callable() { // from class: com.p7700g.p99005.gh0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return fi0.m(po0.this, str);
            }
        });
    }

    @s2
    public static ni0<ei0> m(po0 po0Var, @z1 String str) {
        return n(po0Var, str, true);
    }

    private static ni0<ei0> n(po0 po0Var, @z1 String str, boolean z) {
        try {
            try {
                ei0 a2 = vn0.a(po0Var);
                if (str != null) {
                    vk0.c().d(str, a2);
                }
                ni0<ei0> ni0Var = new ni0<>(a2);
                if (z) {
                    cp0.c(po0Var);
                }
                return ni0Var;
            } catch (Exception e) {
                ni0<ei0> ni0Var2 = new ni0<>(e);
                if (z) {
                    cp0.c(po0Var);
                }
                return ni0Var2;
            }
        } catch (Throwable th) {
            if (z) {
                cp0.c(po0Var);
            }
            throw th;
        }
    }

    public static oi0<ei0> o(final String str, @z1 final String str2) {
        return a(str2, new Callable() { // from class: com.p7700g.p99005.xg0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return fi0.p(str, str2);
            }
        });
    }

    @s2
    public static ni0<ei0> p(String str, @z1 String str2) {
        return m(po0.r(jw5.d(jw5.s(new ByteArrayInputStream(str.getBytes())))), str2);
    }

    @s2
    @Deprecated
    public static ni0<ei0> q(JSONObject jSONObject, @z1 String str) {
        return p(jSONObject.toString(), str);
    }

    public static oi0<ei0> r(Context context, @d2 int i) {
        return s(context, i, P(context, i));
    }

    public static oi0<ei0> s(Context context, @d2 final int i, @z1 final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return a(str, new Callable() { // from class: com.p7700g.p99005.zg0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return fi0.M(weakReference, applicationContext, i, str);
            }
        });
    }

    @s2
    public static ni0<ei0> t(Context context, @d2 int i) {
        return u(context, i, P(context, i));
    }

    @s2
    public static ni0<ei0> u(Context context, @d2 int i, @z1 String str) {
        try {
            uv5 d = jw5.d(jw5.s(context.getResources().openRawResource(i)));
            if (D(d).booleanValue()) {
                return A(new ZipInputStream(d.W1()), str);
            }
            return j(d.W1(), str);
        } catch (Resources.NotFoundException e) {
            return new ni0<>(e);
        }
    }

    public static oi0<ei0> v(Context context, String str) {
        return w(context, str, "url_" + str);
    }

    public static oi0<ei0> w(final Context context, final String str, @z1 final String str2) {
        return a(str2, new Callable() { // from class: com.p7700g.p99005.eh0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return fi0.N(context, str, str2);
            }
        });
    }

    @s2
    public static ni0<ei0> x(Context context, String str) {
        return y(context, str, str);
    }

    @s2
    public static ni0<ei0> y(Context context, String str, @z1 String str2) {
        ni0<ei0> c = ci0.d(context).c(str, str2);
        if (str2 != null && c.b() != null) {
            vk0.c().d(str2, c.b());
        }
        return c;
    }

    public static oi0<ei0> z(final ZipInputStream zipInputStream, @z1 final String str) {
        return a(str, new Callable() { // from class: com.p7700g.p99005.fh0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return fi0.A(zipInputStream, str);
            }
        });
    }
}