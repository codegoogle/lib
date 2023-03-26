package com.p7700g.p99005;

import android.content.Context;
import android.os.AsyncTask;
import com.p7700g.p99005.xp5;
import java.util.HashMap;

/* compiled from: VASTParser.java */
/* loaded from: classes3.dex */
public class kp5 extends AsyncTask<String, Object, pp5> {
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private Context h;
    private b i = null;
    private int j = 0;
    private static final String a = kp5.class.getName();
    private static final HashMap<Integer, pp5> g = new HashMap<>();

    /* compiled from: VASTParser.java */
    /* loaded from: classes3.dex */
    public class a implements xp5.b {
        public final /* synthetic */ pp5 a;

        public a(final pp5 val$result) {
            this.a = val$result;
        }

        @Override // com.p7700g.p99005.xp5.b
        public void a() {
            kp5.this.i.b(this.a);
        }

        @Override // com.p7700g.p99005.xp5.b
        public void b(Throwable t) {
            kp5.this.i.a(kp5.this.j);
        }
    }

    /* compiled from: VASTParser.java */
    /* loaded from: classes3.dex */
    public interface b {
        void a(int error);

        void b(pp5 model);
    }

    public kp5(Context context) {
        this.h = null;
        this.h = context;
    }

    public static pp5 d(String xml) {
        return g.get(Integer.valueOf(xml.hashCode()));
    }

    public static Boolean e(String xml) {
        return Boolean.valueOf(g.containsKey(Integer.valueOf(xml.hashCode())));
    }

    @Override // android.os.AsyncTask
    /* renamed from: c */
    public pp5 doInBackground(String... params) {
        pp5 pp5Var;
        bq5.g(a, "doInBackground");
        this.j = 0;
        String str = params.length > 0 ? params[0] : null;
        if (str != null) {
            HashMap<Integer, pp5> hashMap = g;
            if (!hashMap.containsKey(Integer.valueOf(str.hashCode())) || (pp5Var = hashMap.get(Integer.valueOf(str.hashCode()))) == null) {
                up5 up5Var = new up5(new yp5(this.h));
                if (up5Var.d(params[0]) == 0) {
                    pp5 b2 = up5Var.b();
                    hashMap.put(Integer.valueOf(str.hashCode()), b2);
                    return b2;
                }
                return null;
            }
            return pp5Var;
        }
        return null;
    }

    @Override // android.os.AsyncTask
    /* renamed from: f */
    public void onPostExecute(pp5 result) {
        bq5.g(a, "onPostExecute");
        b bVar = this.i;
        if (bVar != null) {
            if (result == null) {
                bVar.a(this.j);
            } else if (xp5.b(this.h, result.o())) {
                this.i.b(result);
            } else {
                xp5.c(this.h, result.o(), new a(result));
            }
        }
    }

    public kp5 g(b listener) {
        bq5.g(a, "setListener");
        this.i = listener;
        return this;
    }
}