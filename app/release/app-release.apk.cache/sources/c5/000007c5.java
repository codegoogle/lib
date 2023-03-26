package com.anythink.expressad.foundation.b;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {
    public static final String a = "a";
    private static a b;
    private Context c;
    private String d;
    private String e;
    private JSONObject g;
    private int h;
    private boolean j;
    private WeakReference<Context> k;
    private WeakReference<Activity> l;
    private String m;
    private int f = 0;
    private boolean i = false;

    private a() {
    }

    public static synchronized a b() {
        a aVar;
        synchronized (a.class) {
            if (b == null) {
                b = new a();
            }
            aVar = b;
        }
        return aVar;
    }

    private int j() {
        return this.h;
    }

    private boolean k() {
        return this.j;
    }

    private static void l() {
    }

    private JSONObject m() {
        return this.g;
    }

    public final void a(int i) {
        this.h = i;
    }

    public final void c() {
        if (this.i) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            this.g = jSONObject;
            jSONObject.put("webgl", 0);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final Context d() {
        return this.c;
    }

    public final String e() {
        return !TextUtils.isEmpty(this.d) ? this.d : "";
    }

    public final String f() {
        return !TextUtils.isEmpty(this.e) ? this.e : "";
    }

    public final WeakReference<Activity> g() {
        return this.l;
    }

    public final Context h() {
        WeakReference<Context> weakReference = this.k;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public final int i() {
        return this.f;
    }

    private void a(boolean z) {
        this.j = z;
    }

    public final String a() {
        try {
            Context context = this.c;
            if (context != null) {
                return context.getPackageName();
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final void b(String str) {
        this.e = str;
    }

    public final void b(Context context) {
        this.k = new WeakReference<>(context);
    }

    private void b(int i) {
        this.f = i;
    }

    public final void a(Context context) {
        this.c = context;
    }

    public final void a(String str) {
        this.d = str;
    }

    private void a(WeakReference<Activity> weakReference) {
        this.l = weakReference;
    }

    private void a(JSONObject jSONObject) {
        this.g = jSONObject;
    }
}