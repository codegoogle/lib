package com.p7700g.p99005;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TaskStackBuilder.java */
/* loaded from: classes.dex */
public final class zg implements Iterable<Intent> {
    private static final String s = "TaskStackBuilder";
    private final ArrayList<Intent> t = new ArrayList<>();
    private final Context u;

    /* compiled from: TaskStackBuilder.java */
    @e2(16)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static PendingIntent a(Context context, int i, Intent[] intentArr, int i2, Bundle bundle) {
            return PendingIntent.getActivities(context, i, intentArr, i2, bundle);
        }
    }

    /* compiled from: TaskStackBuilder.java */
    /* loaded from: classes.dex */
    public interface b {
        @z1
        Intent o();
    }

    private zg(Context context) {
        this.u = context;
    }

    @x1
    public static zg f(@x1 Context context) {
        return new zg(context);
    }

    @Deprecated
    public static zg h(Context context) {
        return f(context);
    }

    @x1
    public zg a(@x1 Intent intent) {
        this.t.add(intent);
        return this;
    }

    @x1
    public zg b(@x1 Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.u.getPackageManager());
        }
        if (component != null) {
            d(component);
        }
        a(intent);
        return this;
    }

    @x1
    public zg c(@x1 Activity activity) {
        Intent o = activity instanceof b ? ((b) activity).o() : null;
        if (o == null) {
            o = gg.a(activity);
        }
        if (o != null) {
            ComponentName component = o.getComponent();
            if (component == null) {
                component = o.resolveActivity(this.u.getPackageManager());
            }
            d(component);
            a(o);
        }
        return this;
    }

    @x1
    public zg d(@x1 ComponentName componentName) {
        int size = this.t.size();
        try {
            Intent b2 = gg.b(this.u, componentName);
            while (b2 != null) {
                this.t.add(size, b2);
                b2 = gg.b(this.u, b2.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @x1
    public zg e(@x1 Class<?> cls) {
        return d(new ComponentName(this.u, cls));
    }

    @z1
    public Intent g(int i) {
        return this.t.get(i);
    }

    @Deprecated
    public Intent i(int i) {
        return g(i);
    }

    @Override // java.lang.Iterable
    @x1
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.t.iterator();
    }

    public int m() {
        return this.t.size();
    }

    @x1
    public Intent[] n() {
        int size = this.t.size();
        Intent[] intentArr = new Intent[size];
        if (size == 0) {
            return intentArr;
        }
        intentArr[0] = new Intent(this.t.get(0)).addFlags(268484608);
        for (int i = 1; i < size; i++) {
            intentArr[i] = new Intent(this.t.get(i));
        }
        return intentArr;
    }

    @z1
    public PendingIntent o(int i, int i2) {
        return p(i, i2, null);
    }

    @z1
    public PendingIntent p(int i, int i2, @z1 Bundle bundle) {
        if (!this.t.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.t.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            return a.a(this.u, i, intentArr, i2, bundle);
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
    }

    public void t() {
        u(null);
    }

    public void u(@z1 Bundle bundle) {
        if (!this.t.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.t.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (gh.s(this.u, intentArr, bundle)) {
                return;
            }
            Intent intent = new Intent(intentArr[intentArr.length - 1]);
            intent.addFlags(268435456);
            this.u.startActivity(intent);
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}