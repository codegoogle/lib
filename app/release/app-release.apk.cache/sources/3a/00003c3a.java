package com.p7700g.p99005;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.p7700g.p99005.c;
import com.p7700g.p99005.i2;

/* compiled from: CustomTabsServiceConnection.java */
/* loaded from: classes.dex */
public abstract class c6 implements ServiceConnection {
    @z1
    private Context mApplicationContext;

    /* compiled from: CustomTabsServiceConnection.java */
    /* loaded from: classes.dex */
    public class a extends z5 {
        public a(c cVar, ComponentName componentName, Context context) {
            super(cVar, componentName, context);
        }
    }

    @i2({i2.a.LIBRARY})
    @z1
    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(@x1 ComponentName componentName, @x1 z5 z5Var);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@x1 ComponentName componentName, @x1 IBinder iBinder) {
        if (this.mApplicationContext != null) {
            onCustomTabsServiceConnected(componentName, new a(c.b.N1(iBinder), componentName, this.mApplicationContext));
            return;
        }
        throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
    }

    @i2({i2.a.LIBRARY})
    public void setApplicationContext(@x1 Context context) {
        this.mApplicationContext = context;
    }
}