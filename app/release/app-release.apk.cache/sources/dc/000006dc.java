package com.anythink.core.common;

import android.content.Context;
import android.os.CountDownTimer;
import com.anythink.core.common.e.p;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class n<T extends com.anythink.core.common.e.p> {
    public CountDownTimer b;
    public Context d;
    public ArrayList<T> a = new ArrayList<>();
    public String c = com.anythink.core.common.b.m.a().n();

    public n(Context context) {
        this.d = context.getApplicationContext();
    }

    public abstract void a(List<T> list);

    public final synchronized void b(T t) {
        this.a.add(t);
        a(true);
    }

    public final synchronized void a(T t) {
        final com.anythink.core.c.a b = com.anythink.core.c.b.a(this.d).b(this.c);
        boolean z = false;
        if (this.a.isEmpty()) {
            if (b.U() > 0) {
                com.anythink.core.common.b.m.a().a(new Runnable() { // from class: com.anythink.core.common.n.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        n.this.b = new CountDownTimer(b.U(), b.U()) { // from class: com.anythink.core.common.n.1.1
                            @Override // android.os.CountDownTimer
                            public final void onFinish() {
                                n.this.a(true);
                            }

                            @Override // android.os.CountDownTimer
                            public final void onTick(long j) {
                            }
                        };
                        n.this.b.start();
                    }
                });
            } else {
                z = true;
            }
        }
        this.a.add(t);
        a(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(boolean z) {
        if (z) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.a);
            if (arrayList.size() > 0) {
                a(arrayList);
            }
            this.a.clear();
        } else {
            com.anythink.core.c.a b = com.anythink.core.c.b.a(this.d).b(this.c);
            ArrayList arrayList2 = new ArrayList();
            if (this.a.size() >= b.S()) {
                for (int S = b.S() - 1; S >= 0; S--) {
                    arrayList2.add(this.a.get(S));
                    this.a.remove(S);
                }
                if (arrayList2.size() > 0) {
                    a(arrayList2);
                }
            }
        }
        com.anythink.core.common.b.m.a().a(new Runnable() { // from class: com.anythink.core.common.n.2
            @Override // java.lang.Runnable
            public final void run() {
                CountDownTimer countDownTimer;
                if (!n.this.a.isEmpty() || (countDownTimer = n.this.b) == null) {
                    return;
                }
                countDownTimer.cancel();
            }
        });
    }
}