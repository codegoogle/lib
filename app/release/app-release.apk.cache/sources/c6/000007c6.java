package com.anythink.expressad.foundation.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.anythink.core.common.b.g;
import com.anythink.expressad.foundation.c.c;
import com.anythink.expressad.foundation.g.c.d;
import com.anythink.expressad.foundation.h.j;
import com.anythink.expressad.foundation.h.l;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.q;
import java.io.File;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class b {
    private static final String h = "SDKController";
    private static b i;
    private Context j;
    private String n;
    private int o;
    private String k = "";
    private String l = "";
    private boolean m = false;
    public final int a = 1;
    public final int b = 2;
    public final int c = 3;
    public final int d = 4;
    public final int e = 5;
    public final int f = 6;
    public Handler g = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.foundation.b.b.2
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            try {
                int i2 = message.what;
                if (i2 == 2) {
                    if (message.obj instanceof List) {
                    }
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        if (TextUtils.isEmpty((String) message.obj)) {
                        }
                    } else if (i2 != 6) {
                    } else {
                        Object obj = message.obj;
                    }
                } else {
                    File file = (File) message.obj;
                    if (file != null) {
                        String a = l.a(file);
                        if (TextUtils.isEmpty(a)) {
                            return;
                        }
                        a.split("====");
                    }
                }
            } catch (Exception e) {
                n.d(b.h, e.getMessage());
            }
        }
    };

    /* renamed from: com.anythink.expressad.foundation.b.b$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass3 implements Runnable {
        public AnonymousClass3() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            String[] list;
            try {
                c.a(b.this.j);
                String b = d.b(com.anythink.expressad.foundation.g.c.a.ANYTHINK_CRASH_INFO);
                File file = new File(b);
                if (file.exists() && file.isDirectory() && file.list().length > 0) {
                    for (String str : file.list()) {
                        File file2 = new File(b + "/" + str);
                        Message obtain = Message.obtain();
                        obtain.obj = file2;
                        obtain.what = 3;
                        b.this.g.sendMessage(obtain);
                    }
                }
            } catch (Exception e) {
                n.d(b.h, e.getMessage());
            }
        }
    }

    private b() {
    }

    private static String c() {
        return com.anythink.expressad.out.b.a;
    }

    private void d() {
        a.b().a(this.k);
        a.b().b(this.l);
        a.b();
        a.b().c();
        a(this.j.getApplicationContext());
        new Thread(new AnonymousClass3()).start();
        q.a(this.j);
        this.m = true;
    }

    private void e() {
        new Thread(new AnonymousClass3()).start();
    }

    private void f() {
        a.b().a(this.k);
        a.b().b(this.l);
        a.b();
        a.b().c();
    }

    public final void b() {
        Handler handler = this.g;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            if (i == null) {
                i = new b();
            }
            bVar = i;
        }
        return bVar;
    }

    public final void a(Map map, final Context context) {
        if (context != null) {
            this.j = context.getApplicationContext();
            a.b().a(this.j);
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.anythink.expressad.foundation.b.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    j.i(context);
                }
            }, 300L);
            if (map != null) {
                if (map.containsKey(com.anythink.expressad.a.d)) {
                    this.k = (String) map.get(com.anythink.expressad.a.d);
                }
                if (map.containsKey(com.anythink.expressad.a.e)) {
                    this.l = (String) map.get(com.anythink.expressad.a.e);
                }
                a.b().a(this.k);
                a.b().b(this.l);
                a.b();
                a.b().c();
                a(this.j.getApplicationContext());
                new Thread(new AnonymousClass3()).start();
                q.a(this.j);
                this.m = true;
            }
        }
    }

    private static void a(Context context) {
        String str;
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(g.x, 0);
            String str2 = "";
            if (sharedPreferences != null) {
                String string = sharedPreferences.getString(g.o.l, "");
                str = sharedPreferences.getString(g.o.m, "");
                str2 = string;
            } else {
                str = "";
            }
            if (TextUtils.isEmpty(com.anythink.expressad.foundation.g.a.co) && TextUtils.isEmpty(com.anythink.expressad.foundation.g.a.cp)) {
                com.anythink.expressad.foundation.g.a.co = str2;
                com.anythink.expressad.foundation.g.a.cp = str;
            }
        } catch (Throwable th) {
            n.b(h, th.getMessage(), th);
        }
    }
}