package com.anythink.core.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.p7700g.p99005.pg1;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class o {
    public static final String b = "Y29tLnhpYW9taS5tYXJrZXQuRE1fUEFHRV9PUEVORUQ=";
    public static final String c = "Y29tLnhpYW9taS5tYXJrZXQuRE1fUEFHRV9DTE9TRUQ=";
    public static final String d = "Y29tLnhpYW9taS5tYXJrZXQuRElSRUNUX01BSUxfU1RBVFVT";
    public static final String e = "Y29udGVudDovL2NvbS54aWFvbWkubWFya2V0LnByb3ZpZGVyLkRpcmVjdE1haWxQcm92aWRlcg==";
    private static final String f = "code";
    private static final String g = "packageName";
    private static volatile String j;
    private static o n;
    public BroadcastReceiver a;
    private CopyOnWriteArrayList<com.anythink.core.common.e.i> h = new CopyOnWriteArrayList<>();
    private final AtomicBoolean i = new AtomicBoolean(false);
    private volatile Boolean k;
    private com.anythink.core.common.e.i l;
    private Context m;

    /* renamed from: com.anythink.core.common.o$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 extends BroadcastReceiver {
        public AnonymousClass2() {
        }

        private com.anythink.core.common.e.i a(String str) {
            if (o.this.l != null && TextUtils.equals(o.this.l.w(), str)) {
                return o.this.l;
            }
            if (o.this.h == null || o.this.h.size() <= 0) {
                return null;
            }
            Iterator it = o.this.h.iterator();
            while (it.hasNext()) {
                com.anythink.core.common.e.i iVar = (com.anythink.core.common.e.i) it.next();
                if (iVar != null && TextUtils.equals(iVar.w(), str)) {
                    return iVar;
                }
            }
            return null;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Bundle extras;
            com.anythink.core.common.e.i iVar;
            String action = intent.getAction();
            if (TextUtils.isEmpty(action) || action.equals(com.anythink.core.common.j.c.b(o.b)) || action.equals(com.anythink.core.common.j.c.b(o.c)) || !action.equals(com.anythink.core.common.j.c.b(o.d)) || (extras = intent.getExtras()) == null) {
                return;
            }
            int i = extras.getInt("code", -1);
            String string = extras.getString(o.g, "");
            if (i == -1 || TextUtils.isEmpty(string)) {
                return;
            }
            if (o.this.l != null && TextUtils.equals(o.this.l.w(), string)) {
                iVar = o.this.l;
            } else {
                if (o.this.h != null && o.this.h.size() > 0) {
                    Iterator it = o.this.h.iterator();
                    while (it.hasNext()) {
                        com.anythink.core.common.e.i iVar2 = (com.anythink.core.common.e.i) it.next();
                        if (iVar2 != null && TextUtils.equals(iVar2.w(), string)) {
                            iVar = iVar2;
                            break;
                        }
                    }
                }
                iVar = null;
            }
            if (iVar == null) {
                return;
            }
            if (i == 4) {
                o.this.b(iVar);
            }
            com.anythink.core.common.i.c.a(iVar.f(), iVar.k(), "", i, "", 0L, 0L);
        }
    }

    private o() {
    }

    private com.anythink.core.common.e.i e() {
        return this.l;
    }

    private void f() {
        if (this.k == null || !this.k.booleanValue() || this.m == null) {
            return;
        }
        try {
            this.a = new AnonymousClass2();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(com.anythink.core.common.j.c.b(b));
            intentFilter.addAction(com.anythink.core.common.j.c.b(c));
            intentFilter.addAction(com.anythink.core.common.j.c.b(d));
            this.m.registerReceiver(this.a, intentFilter);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Boolean g() {
        Cursor cursor;
        Context e2 = com.anythink.core.common.b.m.a().e();
        Boolean bool = null;
        if (e2 != null && e2.getContentResolver() != null) {
            try {
                cursor = e2.getContentResolver().query(Uri.parse(com.anythink.core.common.j.c.b(e)), null, null, null, null);
            } catch (Throwable unused) {
                cursor = null;
            }
            if (cursor != null) {
                while (cursor.moveToNext()) {
                    try {
                        String string = cursor.getString(cursor.getColumnIndex("support"));
                        if (!TextUtils.isEmpty(string) && !string.equalsIgnoreCase(pg1.d) && (string.equalsIgnoreCase("false") || string.equalsIgnoreCase("true"))) {
                            bool = Boolean.valueOf(Boolean.parseBoolean(string));
                        }
                    } catch (Throwable unused2) {
                    }
                    try {
                        j = cursor.getString(cursor.getColumnIndex("detailStyle"));
                    } catch (Exception unused3) {
                    }
                }
                try {
                    cursor.close();
                } catch (Throwable unused4) {
                }
            }
        }
        return bool;
    }

    public final void b(com.anythink.core.common.e.i iVar) {
        if (this.k == null || iVar == null || !this.k.booleanValue()) {
            return;
        }
        this.l = null;
        try {
            this.h.remove(iVar);
        } catch (Exception unused) {
        }
    }

    public final int c() {
        if (this.k != null) {
            return this.k.booleanValue() ? 1 : 0;
        }
        return -1;
    }

    public static synchronized o a() {
        o oVar;
        synchronized (o.class) {
            if (n == null) {
                n = new o();
            }
            oVar = n;
        }
        return oVar;
    }

    private void b(Context context) {
        BroadcastReceiver broadcastReceiver = this.a;
        if (broadcastReceiver == null || context == null) {
            return;
        }
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (Throwable unused) {
        }
        this.l = null;
        this.h.clear();
        this.h = null;
        this.a = null;
        this.m = null;
    }

    public final void a(com.anythink.core.common.e.i iVar) {
        if (this.k == null || iVar == null || !this.k.booleanValue()) {
            return;
        }
        this.l = iVar;
        this.h.add(iVar);
    }

    public final void a(Context context) {
        this.m = context;
        com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.o.1
            @Override // java.lang.Runnable
            public final void run() {
                if (o.this.i.compareAndSet(false, true)) {
                    try {
                        o.this.k = o.g();
                        o.b(o.this);
                    } catch (Throwable unused) {
                    }
                }
            }
        });
    }

    public static String b() {
        try {
            return j == null ? "" : String.format("[%s]", j);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static /* synthetic */ void b(o oVar) {
        if (oVar.k == null || !oVar.k.booleanValue() || oVar.m == null) {
            return;
        }
        try {
            oVar.a = new AnonymousClass2();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(com.anythink.core.common.j.c.b(b));
            intentFilter.addAction(com.anythink.core.common.j.c.b(c));
            intentFilter.addAction(com.anythink.core.common.j.c.b(d));
            oVar.m.registerReceiver(oVar.a, intentFilter);
        } catch (Throwable unused) {
        }
    }
}