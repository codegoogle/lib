package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.p7700g.p99005.wo1;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class P {
    public N d;
    private final List<String> e;
    private final int f;
    public ConcurrentHashMap<String, CopyOnWriteArrayList<N>> a = new ConcurrentHashMap<>();
    public String b = "";
    private String c = "";
    private final Timer g = new Timer();
    public ConcurrentHashMap<String, AdInfo> h = new ConcurrentHashMap<>();

    /* loaded from: classes3.dex */
    public class a extends TimerTask {
        private /* synthetic */ String s;

        public a(String str) {
            this.s = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            try {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("removing waterfall with id " + this.s + " from memory");
                P.this.a.remove(this.s);
                ironLog.verbose("waterfall size is currently " + P.this.a.size());
                ironLog.verbose("removing adInfo with id " + this.s + " from memory");
                P.this.h.remove(this.s);
                ironLog.verbose("adInfo size is currently " + P.this.h.size());
            } finally {
                cancel();
            }
        }
    }

    public P(List<String> list, int i) {
        this.e = list;
        this.f = i;
    }

    private synchronized boolean c() {
        boolean z;
        N n = this.d;
        if (n != null) {
            z = n.p.equals(this.c);
        }
        return z;
    }

    private void d() {
        Iterator<N> it = a().iterator();
        while (it.hasNext()) {
            N next = it.next();
            if (!next.equals(this.d)) {
                next.d();
            }
        }
    }

    public final AdInfo a(String str) {
        if (this.h.containsKey(str)) {
            return this.h.get(str);
        }
        return null;
    }

    public final CopyOnWriteArrayList<N> a() {
        CopyOnWriteArrayList<N> copyOnWriteArrayList = this.a.get(this.b);
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList<>() : copyOnWriteArrayList;
    }

    public final synchronized void a(N n) {
        IronLog.INTERNAL.verbose("");
        N n2 = this.d;
        if (n2 != null && !n2.equals(n)) {
            this.d.d();
        }
        this.d = n;
    }

    public final void a(String str, ImpressionData impressionData) {
        if (TextUtils.isEmpty(str) || impressionData == null) {
            return;
        }
        this.h.put(str, new AdInfo(impressionData));
    }

    public final void a(CopyOnWriteArrayList<N> copyOnWriteArrayList, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("updating new waterfall with id " + str);
        d();
        this.a.put(str, copyOnWriteArrayList);
        if (!TextUtils.isEmpty(this.c)) {
            if (c()) {
                StringBuilder sb = new StringBuilder("ad from previous waterfall ");
                sb.append(this.c);
                sb.append(" is still showing - the current waterfall ");
                wo1.f0(sb, this.b, " will be deleted instead", ironLog);
                String str2 = this.b;
                this.b = this.c;
                this.c = str2;
            }
            this.g.schedule(new a(this.c), this.f);
        }
        this.c = this.b;
        this.b = str;
    }

    public final boolean b() {
        return this.a.size() > 5;
    }

    public final synchronized boolean b(N n) {
        boolean z;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("");
        if (n != null && (this.d == null || ((n.c() != LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK || !this.d.k().equals(n.k())) && ((n.c() != LoadWhileShowSupportState.NONE && !this.e.contains(n.l())) || !this.d.l().equals(n.l()))))) {
            z = false;
            if (z && n != null) {
                ironLog.verbose(n.k() + " does not support load while show and will not be added to the auction request");
            }
        }
        z = true;
        if (z) {
            ironLog.verbose(n.k() + " does not support load while show and will not be added to the auction request");
        }
        return !z;
    }
}