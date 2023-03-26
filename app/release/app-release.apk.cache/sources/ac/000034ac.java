package com.ironsource.mediationsdk.adunit.e;

import android.text.TextUtils;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.adunit.c.b.a;
import com.ironsource.mediationsdk.adunit.d.a.c;
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
public final class a<Smash extends c<?>> {
    private c<?> d;
    private final List<String> e;
    private final int f;
    private b h;
    public ConcurrentHashMap<String, CopyOnWriteArrayList<Smash>> a = new ConcurrentHashMap<>();
    public String b = "";
    private String c = "";
    private final Timer g = new Timer();
    private final int i = 5;
    public ConcurrentHashMap<String, AdInfo> j = new ConcurrentHashMap<>();

    /* renamed from: com.ironsource.mediationsdk.adunit.e.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0117a extends TimerTask {
        private /* synthetic */ String s;

        public C0117a(String str) {
            this.s = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            try {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("removing waterfall with id " + this.s + " from memory");
                a.this.a.remove(this.s);
                ironLog.verbose("waterfall size is currently " + a.this.a.size());
                ironLog.verbose("removing adInfo with id " + this.s + " from memory");
                a.this.j.remove(this.s);
                ironLog.verbose("adInfo size is currently " + a.this.j.size());
            } finally {
                cancel();
            }
        }
    }

    public a(List<String> list, int i, b bVar) {
        this.e = list;
        this.f = i;
        this.h = bVar;
    }

    private synchronized void b() {
        c<?> cVar = this.d;
        if (cVar != null) {
            cVar.c();
        }
    }

    private synchronized boolean c() {
        boolean z;
        c<?> cVar = this.d;
        if (cVar != null && cVar.p()) {
            z = this.d.o().equals(this.c);
        }
        return z;
    }

    private void d() {
        Iterator<Smash> it = a().iterator();
        while (it.hasNext()) {
            Smash next = it.next();
            if (!next.equals(this.d)) {
                next.c();
            }
        }
    }

    public final AdInfo a(String str) {
        if (this.j.containsKey(str)) {
            return this.j.get(str);
        }
        return null;
    }

    public final CopyOnWriteArrayList<Smash> a() {
        CopyOnWriteArrayList<Smash> copyOnWriteArrayList = this.a.get(this.b);
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList<>() : copyOnWriteArrayList;
    }

    public final void a(a.EnumC0116a enumC0116a, CopyOnWriteArrayList<Smash> copyOnWriteArrayList, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("updating new waterfall with id " + str);
        d();
        if (enumC0116a == a.EnumC0116a.AUTOMATIC_LOAD_WHILE_SHOW) {
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
                this.g.schedule(new C0117a(this.c), this.f);
            }
        } else {
            this.a.clear();
            this.a.put(str, copyOnWriteArrayList);
        }
        this.c = this.b;
        this.b = str;
        if (this.a.size() > 5) {
            this.h.a(this.a.size());
        }
    }

    public final synchronized void a(c<?> cVar) {
        IronLog.INTERNAL.verbose("");
        c<?> cVar2 = this.d;
        if (cVar2 != null && !cVar2.equals(cVar)) {
            b();
        }
        this.d = cVar;
    }

    public final void a(String str, ImpressionData impressionData) {
        if (TextUtils.isEmpty(str) || impressionData == null) {
            return;
        }
        this.j.put(str, new AdInfo(impressionData));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
        if (r3.e.contains(r6) == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
        if (r3.d.n().equals(r6) == false) goto L5;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f A[Catch: all -> 0x0057, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:23:0x003f, B:6:0x0009, B:8:0x000d, B:11:0x0014, B:13:0x0018, B:16:0x0025, B:18:0x0029, B:20:0x0031), top: B:29:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean a(a.EnumC0116a enumC0116a, String str, String str2, LoadWhileShowSupportState loadWhileShowSupportState) {
        boolean z;
        z = false;
        if (enumC0116a == a.EnumC0116a.AUTOMATIC_LOAD_WHILE_SHOW) {
            c<?> cVar = this.d;
            if (cVar != null) {
                if (cVar.p()) {
                    if (loadWhileShowSupportState == LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK) {
                        if (this.d.k().equals(str)) {
                            if (!z) {
                                IronLog ironLog = IronLog.INTERNAL;
                                ironLog.verbose(str + " does not support load while show and will not be added to the auction request");
                            }
                        }
                    }
                    if (loadWhileShowSupportState != LoadWhileShowSupportState.NONE) {
                    }
                }
            }
        }
        z = true;
        if (!z) {
        }
        return z;
    }
}