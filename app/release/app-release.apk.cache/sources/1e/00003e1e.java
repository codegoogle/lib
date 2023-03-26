package com.p7700g.p99005;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.AsyncTask;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: TrustedWebActivityServiceConnectionPool.java */
/* loaded from: classes.dex */
public final class d7 {
    private static final String a = "TWAConnectionPool";
    private final Context b;
    private final Map<Uri, m6> c = new HashMap();

    /* compiled from: TrustedWebActivityServiceConnectionPool.java */
    /* loaded from: classes.dex */
    public static class a extends AsyncTask<Void, Void, Exception> {
        private final Context a;
        private final Intent b;
        private final m6 c;

        public a(Context context, Intent intent, m6 m6Var) {
            this.a = context.getApplicationContext();
            this.b = intent;
            this.c = m6Var;
        }

        @Override // android.os.AsyncTask
        @z1
        /* renamed from: a */
        public Exception doInBackground(Void... voidArr) {
            try {
                if (this.a.bindService(this.b, this.c, dy.p)) {
                    return null;
                }
                this.a.unbindService(this.c);
                return new IllegalStateException("Could not bind to the service");
            } catch (SecurityException e) {
                return e;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b */
        public void onPostExecute(Exception exc) {
            if (exc != null) {
                this.c.a(exc);
            }
        }
    }

    private d7(@x1 Context context) {
        this.b = context.getApplicationContext();
    }

    @x1
    public static d7 b(@x1 Context context) {
        return new d7(context);
    }

    @z1
    private Intent c(Context context, Uri uri, Set<s6> set, boolean z) {
        if (set == null || set.size() == 0) {
            return null;
        }
        Intent intent = new Intent();
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        String str = null;
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, 65536)) {
            String str2 = resolveInfo.activityInfo.packageName;
            Iterator<s6> it = set.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().c(str2, context.getPackageManager())) {
                        str = str2;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (str == null) {
            if (z) {
                String str3 = "No TWA candidates for " + uri + " have been registered.";
            }
            return null;
        }
        Intent intent2 = new Intent();
        intent2.setPackage(str);
        intent2.setAction(b7.s);
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent2, 131072);
        if (resolveService == null) {
            return null;
        }
        if (z) {
            StringBuilder G = wo1.G("Found ");
            G.append(resolveService.serviceInfo.name);
            G.append(" to handle request for ");
            G.append(uri);
            G.toString();
        }
        Intent intent3 = new Intent();
        intent3.setComponent(new ComponentName(str, resolveService.serviceInfo.name));
        return intent3;
    }

    private /* synthetic */ void d(Uri uri) {
        this.c.remove(uri);
    }

    @x1
    @u1
    public gn2<c7> a(@x1 final Uri uri, @x1 Set<s6> set, @x1 Executor executor) {
        m6 m6Var = this.c.get(uri);
        if (m6Var != null) {
            return m6Var.b();
        }
        Intent c = c(this.b, uri, set, true);
        if (c == null) {
            return n6.a(new IllegalArgumentException("No service exists for scope"));
        }
        m6 m6Var2 = new m6(new Runnable() { // from class: com.p7700g.p99005.l6
            @Override // java.lang.Runnable
            public final void run() {
                d7.this.e(uri);
            }
        });
        this.c.put(uri, m6Var2);
        new a(this.b, c, m6Var2).executeOnExecutor(executor, new Void[0]);
        return m6Var2.b();
    }

    public /* synthetic */ void e(Uri uri) {
        this.c.remove(uri);
    }

    @u1
    public boolean f(@x1 Uri uri, @x1 Set<s6> set) {
        return (this.c.get(uri) == null && c(this.b, uri, set, false) == null) ? false : true;
    }

    public void g() {
        for (m6 m6Var : this.c.values()) {
            this.b.unbindService(m6Var);
        }
        this.c.clear();
    }
}