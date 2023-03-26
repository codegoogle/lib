package com.p7700g.p99005;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
/* loaded from: classes3.dex */
public final class lu2 {
    private final SharedPreferences a;
    private final Executor e;
    @k1("internalQueue")
    private final ArrayDeque<String> d = new ArrayDeque<>();
    @k1("internalQueue")
    private boolean f = false;
    private final String b = "topic_operation_queue";
    private final String c = ",";

    private lu2(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.a = sharedPreferences;
        this.e = executor;
    }

    @k1("internalQueue")
    private boolean c(boolean z) {
        if (!z || this.f) {
            return z;
        }
        j();
        return true;
    }

    @s2
    public static lu2 d(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        lu2 lu2Var = new lu2(sharedPreferences, "topic_operation_queue", ",", executor);
        lu2Var.e();
        return lu2Var;
    }

    @s2
    private void e() {
        String[] split;
        synchronized (this.d) {
            this.d.clear();
            String string = this.a.getString(this.b, "");
            if (!TextUtils.isEmpty(string) && string.contains(this.c)) {
                for (String str : string.split(this.c, -1)) {
                    if (!TextUtils.isEmpty(str)) {
                        this.d.add(str);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @s2
    /* renamed from: i */
    public void b() {
        synchronized (this.d) {
            this.a.edit().putString(this.b, h()).commit();
        }
    }

    private void j() {
        this.e.execute(new Runnable(this) { // from class: com.p7700g.p99005.ku2
            private final lu2 s;

            {
                this.s = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.s.b();
            }
        });
    }

    public boolean a(@x1 String str) {
        boolean add;
        if (TextUtils.isEmpty(str) || str.contains(this.c)) {
            return false;
        }
        synchronized (this.d) {
            add = this.d.add(str);
            c(add);
        }
        return add;
    }

    @z1
    public String f() {
        String peek;
        synchronized (this.d) {
            peek = this.d.peek();
        }
        return peek;
    }

    public boolean g(@z1 Object obj) {
        boolean remove;
        synchronized (this.d) {
            remove = this.d.remove(obj);
            c(remove);
        }
        return remove;
    }

    @x1
    @k1("internalQueue")
    public String h() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.d.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(this.c);
        }
        return sb.toString();
    }
}