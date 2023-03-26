package com.p7700g.p99005;

import android.annotation.SuppressLint;
import com.google.gson.Gson;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/* compiled from: GsonParser.java */
/* loaded from: classes.dex */
public class qt0 implements st0 {
    @SuppressLint({"SimpleDateFormat"})
    public static List<SimpleDateFormat> a = new ArrayList(Arrays.asList(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ"), new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ"), new SimpleDateFormat("yyyy-MM-dd' 'HH:mm:ss"), new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'"), new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss")));
    private final Gson b = new pv2().m(Date.class, kt0.a).m(Date.class, lt0.a).e();

    public static /* synthetic */ uv2 b(Date date, Type type, bw2 bw2Var) {
        return new aw2(Long.valueOf(date == null ? 0L : date.getTime()));
    }

    public static /* synthetic */ Date c(uv2 uv2Var, Type type, sv2 sv2Var) throws yv2 {
        if (uv2Var.D()) {
            aw2 aw2Var = (aw2) uv2Var;
            if (aw2Var.I()) {
                return new Date(aw2Var.t());
            }
            if (aw2Var.J()) {
                for (SimpleDateFormat simpleDateFormat : a) {
                    try {
                        return simpleDateFormat.parse(aw2Var.y());
                    } catch (ParseException unused) {
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override // com.p7700g.p99005.st0
    public <T> T a(String str, Class<T> cls) throws Exception {
        return (T) this.b.n(str, cls);
    }
}