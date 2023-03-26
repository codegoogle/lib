package com.ironsource.mediationsdk.a;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.environment.a;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.L;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.q;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.p7700g.p99005.me3;
import com.p7700g.p99005.un3;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.zg2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class b {
    public int[] B;
    public int[] C;
    public int[] D;
    private int[] E;
    public int H;
    public String I;
    public String J;
    public Set<Integer> K;
    public f L;
    private q M;
    public boolean a;
    public com.ironsource.b.a q;
    private me3 r;
    public ArrayList<com.ironsource.mediationsdk.a.c> s;
    public int t;
    public String u;
    public IronSourceSegment v;
    public Context x;
    private int b = 1;
    private int d = 100;
    private int e = un3.f.v;
    private int g = com.anythink.expressad.foundation.g.a.bM;
    private int h = 1024;
    private int i = 5;
    private String j = "supersonic_sdk.db";
    private String k = IronSourceConstants.EVENTS_PROVIDER;
    private String l = "placement";
    private final String m = "abt";
    private final String n = "mt";
    public boolean o = false;
    public boolean c = false;
    public boolean f = true;
    public int y = 100;
    private int z = un3.f.v;
    public int A = 1;
    private Map<String, String> F = new HashMap();
    public Map<String, String> G = new HashMap();
    public String p = "";
    private final Object N = new Object();

    /* loaded from: classes3.dex */
    public enum a {
        NOT_SUPPORTED(-1),
        OFFERWALL(1),
        INTERSTITIAL(2),
        REWARDED_VIDEO(3),
        BANNER(8);
        
        public int t;

        a(int i) {
            this.t = i;
        }
    }

    /* renamed from: com.ironsource.mediationsdk.a.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class RunnableC0115b implements Runnable {
        public RunnableC0115b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            b.f(b.this);
        }
    }

    /* loaded from: classes3.dex */
    public class c implements Runnable {
        private /* synthetic */ com.ironsource.mediationsdk.a.c s;

        public c(com.ironsource.mediationsdk.a.c cVar) {
            this.s = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.ironsource.mediationsdk.a.c cVar = this.s;
            if (cVar != null) {
                b bVar = b.this;
                if (bVar.f) {
                    cVar.a("eventSessionId", bVar.u);
                    String connectionType = IronSourceUtils.getConnectionType(b.this.x);
                    if (b.this.w(this.s)) {
                        this.s.a("connectionType", connectionType);
                    }
                    if (b.this.l(connectionType, this.s)) {
                        com.ironsource.mediationsdk.a.c cVar2 = this.s;
                        cVar2.a(b.this.a(cVar2));
                    }
                    int t = b.t(this.s.a());
                    if (t != a.NOT_SUPPORTED.t) {
                        this.s.a("adUnit", Integer.valueOf(t));
                    }
                    b.g(b.this, this.s, "reason");
                    b.g(b.this, this.s, IronSourceConstants.EVENTS_EXT1);
                    if (!b.this.G.isEmpty()) {
                        for (Map.Entry<String, String> entry : b.this.G.entrySet()) {
                            if (!this.s.d().has(entry.getKey()) && entry.getKey() != "eventId" && entry.getKey() != "timestamp") {
                                this.s.a(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                    b bVar2 = b.this;
                    com.ironsource.mediationsdk.a.c cVar3 = this.s;
                    boolean z = false;
                    if (cVar3 != null ? b.m(bVar2.B) ? !bVar2.j(cVar3.a(), bVar2.B) : b.m(bVar2.C) ? bVar2.j(cVar3.a(), bVar2.C) : true : false) {
                        if (b.this.v(this.s)) {
                            JSONObject d = this.s.d();
                            if (!(d == null ? false : d.has(IronSourceConstants.KEY_SESSION_DEPTH))) {
                                this.s.a(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(b.this.u(this.s)));
                            }
                        }
                        if (!TextUtils.isEmpty(b.this.q(this.s.a())) && b.this.p(this.s)) {
                            com.ironsource.mediationsdk.a.c cVar4 = this.s;
                            cVar4.a("placement", b.this.q(cVar4.a()));
                        }
                        long firstSessionTimestamp = IronSourceUtils.getFirstSessionTimestamp(b.this.x);
                        if (firstSessionTimestamp != -1) {
                            this.s.a(IronSourceConstants.FIRST_SESSION_TIMESTAMP, Long.valueOf(firstSessionTimestamp));
                        }
                        try {
                            IronLog.EVENT.verbose(("{\"eventId\":" + this.s.a() + ",\"timestamp\":" + this.s.b() + "," + this.s.c().substring(1)).replace(",", "\n"));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        b.this.s.add(this.s);
                        b.this.t++;
                    }
                    boolean j = b.m(b.this.D) ? b.this.j(this.s.a(), b.this.D) : b.this.s(this.s);
                    b bVar3 = b.this;
                    if (!bVar3.o && j) {
                        bVar3.o = true;
                    }
                    if (bVar3.q != null) {
                        if ((bVar3.t >= bVar3.y || bVar3.o) && bVar3.a) {
                            bVar3.r();
                            return;
                        }
                        ArrayList<com.ironsource.mediationsdk.a.c> arrayList = bVar3.s;
                        if (arrayList != null && arrayList.size() >= bVar3.A) {
                            z = true;
                        }
                        if (z || j) {
                            b.f(b.this);
                        }
                    }
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class d implements com.ironsource.b.c {

        /* loaded from: classes3.dex */
        public class a implements Runnable {
            private /* synthetic */ boolean s;
            private /* synthetic */ ArrayList t;

            public a(boolean z, ArrayList arrayList) {
                this.s = z;
                this.t = arrayList;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (!this.s) {
                    IronLog.INTERNAL.error("Failed to send events. Saving them back to storage.");
                    b.this.i(this.t);
                    return;
                }
                b bVar = b.this;
                ArrayList<com.ironsource.mediationsdk.a.c> a = bVar.q.a(bVar.J);
                b.this.t = b.this.s.size() + a.size();
            }
        }

        public d() {
        }

        @Override // com.ironsource.b.c
        public final synchronized void a(ArrayList<com.ironsource.mediationsdk.a.c> arrayList, boolean z) {
            b.this.L.a(new a(z, arrayList));
        }
    }

    /* loaded from: classes3.dex */
    public class e implements Comparator<com.ironsource.mediationsdk.a.c> {
        public e() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(com.ironsource.mediationsdk.a.c cVar, com.ironsource.mediationsdk.a.c cVar2) {
            return cVar.b() >= cVar2.b() ? 1 : -1;
        }
    }

    /* loaded from: classes3.dex */
    public class f extends HandlerThread {
        public Handler s;

        public f(String str) {
            super(str);
        }

        public final void a(Runnable runnable) {
            this.s.post(runnable);
        }
    }

    public static void a(Map<String, Object> map, int i, String str) {
        map.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(i));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        map.put(IronSourceConstants.AUCTION_FALLBACK, str);
    }

    private ArrayList<com.ironsource.mediationsdk.a.c> b(ArrayList<com.ironsource.mediationsdk.a.c> arrayList, ArrayList<com.ironsource.mediationsdk.a.c> arrayList2, int i) {
        ArrayList<com.ironsource.mediationsdk.a.c> arrayList3 = new ArrayList<>();
        try {
            ArrayList arrayList4 = new ArrayList();
            arrayList4.addAll(arrayList);
            arrayList4.addAll(arrayList2);
            Collections.sort(arrayList4, new e());
            if (arrayList4.size() <= i) {
                arrayList3.addAll(arrayList4);
            } else {
                arrayList3.addAll(arrayList4.subList(0, i));
                this.q.a(arrayList4.subList(i, arrayList4.size()), this.J);
            }
        } catch (Exception e2) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("CombinedEventList exception: " + e2.getMessage());
        }
        return arrayList3;
    }

    public static /* synthetic */ void f(b bVar) {
        synchronized (bVar.N) {
            bVar.q.a(bVar.s, bVar.J);
            bVar.s.clear();
        }
    }

    public static /* synthetic */ void g(b bVar, com.ironsource.mediationsdk.a.c cVar, String str) {
        JSONObject d2 = cVar.d();
        if (d2 == null || !d2.has(str)) {
            return;
        }
        try {
            String optString = d2.optString(str, null);
            if (optString != null) {
                cVar.a(str, optString.substring(0, Math.min(optString.length(), 1024)));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void h(String str) {
        me3 me3Var = this.r;
        if (me3Var == null || !me3Var.c().equals(str)) {
            this.r = com.ironsource.mediationsdk.a.c.b(str, this.H);
        }
    }

    public static boolean m(int[] iArr) {
        return iArr != null && iArr.length > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        ArrayList<com.ironsource.mediationsdk.a.c> b;
        this.o = false;
        synchronized (this.N) {
            b = b(this.s, this.q.a(this.J), this.z);
            if (b.size() > 0) {
                this.s.clear();
                this.q.b(this.J);
            }
        }
        if (b.size() > 0) {
            this.t = 0;
            JSONObject b2 = com.ironsource.mediationsdk.sdk.e.a().b();
            try {
                try {
                    IronSourceSegment ironSourceSegment = this.v;
                    if (ironSourceSegment != null) {
                        if (ironSourceSegment.getAge() > 0) {
                            b2.put("age", this.v.getAge());
                        }
                        if (!TextUtils.isEmpty(this.v.getGender())) {
                            b2.put(IronSourceSegment.GENDER, this.v.getGender());
                        }
                        if (this.v.getLevel() > 0) {
                            b2.put(IronSourceSegment.LEVEL, this.v.getLevel());
                        }
                        if (this.v.getIsPaying() != null) {
                            b2.put(IronSourceSegment.PAYING, this.v.getIsPaying().get());
                        }
                        if (this.v.getIapt() > zg2.s) {
                            b2.put(IronSourceSegment.IAPT, this.v.getIapt());
                        }
                        if (this.v.getUcd() > 0) {
                            b2.put(IronSourceSegment.USER_CREATION_DATE, this.v.getUcd());
                        }
                    }
                    q qVar = this.M;
                    if (qVar != null) {
                        String str = qVar.b;
                        if (!TextUtils.isEmpty(str)) {
                            b2.put("segmentId", str);
                        }
                        JSONObject jSONObject = this.M.c;
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            b2.put(next, jSONObject.get(next));
                        }
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                String str2 = this.p;
                if (!TextUtils.isEmpty(str2)) {
                    b2.put("abt", str2);
                }
                String str3 = L.a().o;
                if (!TextUtils.isEmpty(str3)) {
                    b2.put("mt", str3);
                }
                Map<String, String> map = this.F;
                if (!map.isEmpty()) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        if (!b2.has(entry.getKey())) {
                            b2.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                JSONObject a2 = new com.ironsource.environment.b.b().a();
                Iterator<String> keys2 = a2.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    b2.put(next2, a2.get(next2));
                }
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
            String a3 = this.r.a(b, b2);
            if (TextUtils.isEmpty(a3)) {
                IronLog.INTERNAL.error("Failed to parse events. Saving them back to storage.");
                i(b);
                return;
            }
            if (this.c) {
                try {
                    a3 = Base64.encodeToString(a.AnonymousClass1.b(a3), 0);
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
            com.ironsource.environment.e.c.a.c(new com.ironsource.b.b(new d(), a3, this.r.a(), b));
        }
    }

    public static int t(int i) {
        a aVar;
        int i2 = a.NOT_SUPPORTED.t;
        if (i == 15 || (i >= 300 && i < 400)) {
            aVar = a.OFFERWALL;
        } else if ((i >= 1000 && i < 2000) || (i >= 91000 && i < 92000)) {
            aVar = a.REWARDED_VIDEO;
        } else if ((i >= 2000 && i < 3000) || (i >= 92000 && i < 93000)) {
            aVar = a.INTERSTITIAL;
        } else if ((i < 3000 || i >= 4000) && (i < 93000 || i >= 94000)) {
            return i2;
        } else {
            aVar = a.BANNER;
        }
        return aVar.t;
    }

    public synchronized int a(com.ironsource.mediationsdk.a.c cVar) {
        return cVar.a() + com.anythink.expressad.foundation.g.a.bM;
    }

    public final void a(int i) {
        if (i > 0) {
            this.A = i;
        }
    }

    public final synchronized void a(Context context, IronSourceSegment ironSourceSegment) {
        String defaultEventsFormatterType = IronSourceUtils.getDefaultEventsFormatterType(context, this.J, this.I);
        this.I = defaultEventsFormatterType;
        h(defaultEventsFormatterType);
        this.r.h = IronSourceUtils.getDefaultEventsURL(context, this.J, null);
        this.q = com.ironsource.b.a.a(context, "supersonic_sdk.db", 5);
        this.L.a(new RunnableC0115b());
        this.B = IronSourceUtils.getDefaultOptOutEvents(context, this.J);
        this.C = IronSourceUtils.getDefaultOptInEvents(context, this.J);
        this.D = IronSourceUtils.getDefaultTriggerEvents(context, this.J);
        this.E = IronSourceUtils.getDefaultNonConnectivityEvents(context, this.J);
        this.v = ironSourceSegment;
        this.x = context;
    }

    public final synchronized void a(q qVar) {
        this.M = qVar;
    }

    public final void a(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        me3 me3Var = this.r;
        if (me3Var != null) {
            me3Var.h = str;
        }
        IronSourceUtils.saveDefaultEventsURL(context, this.J, str);
    }

    public final void a(Map<String, String> map) {
        this.F.putAll(map);
    }

    public final void a(int[] iArr, Context context) {
        this.B = iArr;
        IronSourceUtils.saveDefaultOptOutEvents(context, this.J, iArr);
    }

    public final void b(int i) {
        if (i > 0) {
            this.y = i;
        }
    }

    public final synchronized void b(com.ironsource.mediationsdk.a.c cVar) {
        this.L.a(new c(cVar));
    }

    public final void b(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.I = str;
        IronSourceUtils.saveDefaultEventsFormatterType(context, this.J, str);
        h(str);
    }

    public final void b(Map<String, String> map) {
        this.G.putAll(map);
    }

    public final void b(int[] iArr, Context context) {
        this.C = iArr;
        IronSourceUtils.saveDefaultOptInEvents(context, this.J, iArr);
    }

    public final void c() {
        r();
    }

    public final void c(int i) {
        if (i > 0) {
            this.z = i;
        }
    }

    public final void c(int[] iArr, Context context) {
        this.D = iArr;
        IronSourceUtils.saveDefaultTriggerEvents(context, this.J, iArr);
    }

    public final void d(int[] iArr, Context context) {
        this.E = iArr;
        IronSourceUtils.saveDefaultNonConnectivityEvents(context, this.J, iArr);
    }

    public final void e() {
        this.s = new ArrayList<>();
        this.t = 0;
        this.r = com.ironsource.mediationsdk.a.c.b(this.I, this.H);
        f fVar = new f(wo1.C(new StringBuilder(), this.J, "EventThread"));
        this.L = fVar;
        fVar.start();
        f fVar2 = this.L;
        fVar2.s = new Handler(fVar2.getLooper());
        this.u = IronSourceUtils.getSessionId();
        this.K = new HashSet();
        n();
    }

    public void i(ArrayList<com.ironsource.mediationsdk.a.c> arrayList) {
        if (arrayList != null) {
            synchronized (this.N) {
                this.q.a(arrayList, this.J);
                this.t = this.q.a(this.J).size() + this.s.size();
            }
        }
    }

    public boolean j(int i, int[] iArr) {
        if (m(iArr)) {
            for (int i2 : iArr) {
                if (i == i2) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public synchronized boolean l(String str, com.ironsource.mediationsdk.a.c cVar) {
        if (str.equalsIgnoreCase("none")) {
            return m(this.E) ? j(cVar.a(), this.E) : this.K.contains(Integer.valueOf(cVar.a()));
        }
        return false;
    }

    public void n() {
    }

    public abstract boolean p(com.ironsource.mediationsdk.a.c cVar);

    public abstract String q(int i);

    public abstract boolean s(com.ironsource.mediationsdk.a.c cVar);

    public abstract int u(com.ironsource.mediationsdk.a.c cVar);

    public boolean v(com.ironsource.mediationsdk.a.c cVar) {
        return (cVar.a() == 14 || cVar.a() == 114 || cVar.a() == 514 || cVar.a() == 140 || cVar.a() == 40 || cVar.a() == 41 || cVar.a() == 50 || cVar.a() == 51 || cVar.a() == 52) ? false : true;
    }

    public boolean w(com.ironsource.mediationsdk.a.c cVar) {
        return (cVar.a() == 40 || cVar.a() == 41 || cVar.a() == 50 || cVar.a() == 51 || cVar.a() == 52) ? false : true;
    }
}