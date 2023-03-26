package com.p7700g.p99005;

import android.util.Pair;
import com.p7700g.p99005.i2;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

/* compiled from: NetworkFetcher.java */
@i2({i2.a.LIBRARY})
/* loaded from: classes.dex */
public class ym0 {
    @x1
    private final xm0 a;
    @x1
    private final wm0 b;

    public ym0(@x1 xm0 xm0Var, @x1 wm0 wm0Var) {
        this.a = xm0Var;
        this.b = wm0Var;
    }

    @s2
    @z1
    private ei0 a(@x1 String str, @z1 String str2) {
        Pair<tm0, InputStream> b;
        ni0<ei0> j;
        if (str2 == null || (b = this.a.b(str)) == null) {
            return null;
        }
        tm0 tm0Var = (tm0) b.first;
        InputStream inputStream = (InputStream) b.second;
        if (tm0Var == tm0.ZIP) {
            j = fi0.A(new ZipInputStream(inputStream), str);
        } else {
            j = fi0.j(inputStream, str);
        }
        if (j.b() != null) {
            return j.b();
        }
        return null;
    }

    @x1
    @s2
    private ni0<ei0> b(@x1 String str, @z1 String str2) {
        yo0.a("Fetching " + str);
        Closeable closeable = null;
        try {
            try {
                um0 a = this.b.a(str);
                if (a.s1()) {
                    ni0<ei0> d = d(str, a.Z0(), a.J0(), str2);
                    StringBuilder sb = new StringBuilder();
                    sb.append("Completed fetch from network. Success: ");
                    sb.append(d.b() != null);
                    yo0.a(sb.toString());
                    try {
                        a.close();
                    } catch (IOException e) {
                        yo0.f("LottieFetchResult close failed ", e);
                    }
                    return d;
                }
                ni0<ei0> ni0Var = new ni0<>(new IllegalArgumentException(a.O0()));
                try {
                    a.close();
                } catch (IOException e2) {
                    yo0.f("LottieFetchResult close failed ", e2);
                }
                return ni0Var;
            } catch (Exception e3) {
                ni0<ei0> ni0Var2 = new ni0<>(e3);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException e4) {
                        yo0.f("LottieFetchResult close failed ", e4);
                    }
                }
                return ni0Var2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException e5) {
                    yo0.f("LottieFetchResult close failed ", e5);
                }
            }
            throw th;
        }
    }

    @x1
    private ni0<ei0> d(@x1 String str, @x1 InputStream inputStream, @z1 String str2, @z1 String str3) throws IOException {
        tm0 tm0Var;
        ni0<ei0> f;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (!str2.contains("application/zip") && !str2.contains("application/x-zip") && !str2.contains("application/x-zip-compressed") && !str.split("\\?")[0].endsWith(".lottie")) {
            yo0.a("Received json response.");
            tm0Var = tm0.JSON;
            f = e(str, inputStream, str3);
        } else {
            yo0.a("Handling zip response.");
            tm0Var = tm0.ZIP;
            f = f(str, inputStream, str3);
        }
        if (str3 != null && f.b() != null) {
            this.a.f(str, tm0Var);
        }
        return f;
    }

    @x1
    private ni0<ei0> e(@x1 String str, @x1 InputStream inputStream, @z1 String str2) throws IOException {
        if (str2 == null) {
            return fi0.j(inputStream, null);
        }
        return fi0.j(new FileInputStream(this.a.g(str, inputStream, tm0.JSON).getAbsolutePath()), str);
    }

    @x1
    private ni0<ei0> f(@x1 String str, @x1 InputStream inputStream, @z1 String str2) throws IOException {
        if (str2 == null) {
            return fi0.A(new ZipInputStream(inputStream), null);
        }
        return fi0.A(new ZipInputStream(new FileInputStream(this.a.g(str, inputStream, tm0.ZIP))), str);
    }

    @x1
    @s2
    public ni0<ei0> c(@x1 String str, @z1 String str2) {
        ei0 a = a(str, str2);
        if (a != null) {
            return new ni0<>(a);
        }
        yo0.a("Animation for " + str + " not found in cache. Fetching from network.");
        return b(str, str2);
    }
}