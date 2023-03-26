package com.p7700g.p99005;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Parcelable;
import com.p7700g.p99005.h31;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: EventBus.java */
/* loaded from: classes.dex */
public class h31 {
    @x1
    public static final String a = "extra:object";
    private final List<c21> b = new ArrayList();
    @x1
    private final Context c;

    /* compiled from: EventBus.java */
    /* loaded from: classes.dex */
    public interface b {
        void cancel();
    }

    /* compiled from: EventBus.java */
    /* loaded from: classes.dex */
    public class c extends BroadcastReceiver {
        private c() {
        }

        private /* synthetic */ Object a(Intent intent) throws Exception {
            synchronized (h31.this.b) {
                Parcelable parcelableExtra = intent.getParcelableExtra(h31.a);
                for (c21 c21Var : h31.this.b) {
                    c21Var.a(parcelableExtra);
                }
            }
            return null;
        }

        public /* synthetic */ Object b(Intent intent) {
            a(intent);
            return null;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, final Intent intent) {
            dq0.g(new Callable() { // from class: com.p7700g.p99005.mx0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    h31.c.this.b(intent);
                    return null;
                }
            });
        }
    }

    public h31(@x1 Context context) {
        this.c = context;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(b(context));
        context.registerReceiver(new c(), intentFilter);
    }

    private String b(@x1 Context context) {
        return String.format("%s.events.actions", context.getPackageName());
    }

    public void e(@x1 Parcelable parcelable) {
        Intent intent = new Intent(b(this.c));
        intent.putExtra(a, parcelable);
        this.c.sendBroadcast(intent);
    }

    @x1
    public b f(@x1 final c21 c21Var) {
        synchronized (this.b) {
            this.b.add(c21Var);
        }
        return new b() { // from class: com.p7700g.p99005.nx0
            @Override // com.p7700g.p99005.h31.b
            public final void cancel() {
                h31.this.d(c21Var);
            }
        };
    }

    /* renamed from: g */
    public void d(@x1 c21 c21Var) {
        synchronized (this.b) {
            this.b.remove(c21Var);
        }
    }
}