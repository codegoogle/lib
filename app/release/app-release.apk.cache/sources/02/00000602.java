package com.anythink.core.common.b;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.appcompat.widget.ActivityChooserModel;
import com.anythink.core.api.ATDebuggerConfig;
import com.anythink.core.api.ATInitConfig;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.ATNetworkConfig;
import com.anythink.core.api.AdError;
import com.anythink.core.api.AreaCode;
import com.anythink.core.api.DeviceInfoCallback;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.api.IATAdFilter;
import com.anythink.core.api.IExHandler;
import com.anythink.core.common.b.g;
import com.anythink.core.common.e.af;
import com.anythink.core.common.j.p;
import com.anythink.core.common.q;
import com.anythink.core.common.s;
import com.anythink.core.common.t;
import com.anythink.core.common.u;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p7700g.p99005.b91;
import com.p7700g.p99005.wo1;
import dalvik.system.DexFile;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class m {
    public static final int a = 0;
    public static final int b = 1;
    private static m j;
    private String D;
    private String E;
    private boolean G;
    private com.anythink.core.common.f.c I;
    private Location J;
    private JSONArray L;
    private List<String> M;
    private String P;
    private ATDebuggerConfig Q;
    private boolean R;
    private ConcurrentHashMap<String, IATAdFilter> V;
    public Boolean c;
    public WeakReference<Activity> e;
    private int f;
    private Context k;
    private String l;
    private String m;
    private Map<String, Boolean> q;
    private String r;
    private BroadcastReceiver t;
    private String u;
    private String v;
    private String w;
    private IExHandler x;
    private final String g = "SDK.init";
    private final String h = "com.anythink.pd.ExHandler";
    private boolean i = false;
    private boolean z = false;
    private boolean A = false;
    private long B = 0;
    private long C = 0;
    private boolean H = false;
    private String K = "";
    private int O = 0;
    private int S = 1;
    private boolean T = false;
    private boolean U = false;
    private String W = "";
    public long d = 0;
    private Handler n = new Handler(Looper.getMainLooper());
    private ConcurrentHashMap<String, Map<String, Object>> p = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, Object> o = new ConcurrentHashMap<>();
    private final String y = wo1.C(new StringBuilder(), File.separator, "anythink.test");
    private boolean F = true;
    private ConcurrentHashMap<String, List<String>> N = new ConcurrentHashMap<>();
    private JSONObject s = new JSONObject();

    /* renamed from: com.anythink.core.common.b.m$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                com.anythink.core.common.j.d.a(m.this.k);
                com.anythink.core.common.j.d.q(m.this.k);
            } catch (Exception unused) {
            }
            if (m.this.y()) {
                String d = com.anythink.core.common.j.d.d(m.this.k);
                com.anythink.core.common.j.g.a();
                com.anythink.core.common.j.d.f();
                com.anythink.core.common.j.g.a();
                TextUtils.isEmpty(d);
            }
        }
    }

    /* renamed from: com.anythink.core.common.b.m$10  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass10 extends BroadcastReceiver {
        public AnonymousClass10() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (com.anythink.core.common.j.h.a(context)) {
                s.a().b();
                com.anythink.core.common.i.b.a().b();
                m mVar = m.this;
                mVar.a(context, mVar.n(), m.this.o());
            }
        }
    }

    /* renamed from: com.anythink.core.common.b.m$11  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass11 implements Runnable {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;

        public AnonymousClass11(Context context, String str) {
            this.a = context;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.anythink.core.c.a b = com.anythink.core.c.b.a(this.a.getApplicationContext()).b(this.b);
            if (b != null) {
                if (!b.y()) {
                    q.a(m.this.k).a(b);
                }
                if (com.anythink.core.c.b.a(this.a.getApplicationContext()).a(this.b)) {
                    return;
                }
                m.this.a(b);
                com.anythink.core.c.b.a(this.a.getApplicationContext());
            }
        }
    }

    /* renamed from: com.anythink.core.common.b.m$5  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass5 implements Runnable {
        public final /* synthetic */ ATInitConfig a;
        public final /* synthetic */ Context b;

        public AnonymousClass5(ATInitConfig aTInitConfig, Context context) {
            this.a = aTInitConfig;
            this.b = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Map<String, Object> requestParamMap;
            try {
                ATInitMediation initMediation = this.a.getInitMediation();
                if (initMediation != null) {
                    String b = com.anythink.core.common.j.n.b(m.this.k, g.y, initMediation.getNetworkName(), "");
                    if (!TextUtils.isEmpty(b)) {
                        requestParamMap = com.anythink.core.common.j.h.c(b);
                    } else {
                        requestParamMap = this.a.getRequestParamMap();
                        requestParamMap.put(ATInitMediation.KEY_LOCAL, Boolean.TRUE);
                    }
                    initMediation.setUserDataConsent(this.b, o.a(this.b).c(), o.a(this.b).d());
                    com.anythink.core.c.a b2 = com.anythink.core.c.b.a(this.b).b(m.this.l);
                    boolean z = true;
                    requestParamMap.put(g.k.c, Boolean.valueOf(b2.h() == 3));
                    boolean b3 = com.anythink.core.common.j.g.b();
                    if (b2.i() != 2 || !b3) {
                        z = false;
                    }
                    requestParamMap.put(g.k.d, Boolean.valueOf(z));
                    if (m.a().y()) {
                        new JSONObject(requestParamMap).toString();
                    }
                    initMediation.initSDK(m.this.k, requestParamMap, null);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private m() {
    }

    private void I() {
        com.anythink.core.common.j.b.a.a().a(new AnonymousClass1());
    }

    private void J() {
        try {
            BroadcastReceiver broadcastReceiver = this.t;
            if (broadcastReceiver != null) {
                this.k.unregisterReceiver(broadcastReceiver);
            }
            this.t = null;
        } catch (Throwable unused) {
        }
        try {
            this.t = new AnonymousClass10();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(b91.a);
            this.k.registerReceiver(this.t, intentFilter);
        } catch (Throwable unused2) {
        }
    }

    private void K() {
        Throwable th;
        boolean z;
        boolean z2 = false;
        if (this.k != null) {
            try {
                z = new File(this.k.getExternalFilesDir(null), this.y).exists();
                if (!z) {
                    try {
                        z = new File(this.k.getFilesDir(), this.y).exists();
                    } catch (Throwable th2) {
                        th = th2;
                        th.printStackTrace();
                        z2 = z;
                        this.z = z2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                z = false;
            }
            z2 = z;
        }
        this.z = z2;
    }

    private boolean L() {
        return this.F;
    }

    private void o(String str) {
        this.l = str;
        com.anythink.core.common.j.n.a(this.k, g.o, g.p, str);
    }

    private void p(String str) {
        this.m = str;
        com.anythink.core.common.j.n.a(this.k, g.o, g.q, str);
    }

    public final boolean A() {
        return this.T;
    }

    public final boolean B() {
        return this.U;
    }

    @Deprecated
    public final boolean C() {
        if (this.O == 0) {
            this.O = com.anythink.core.common.j.n.b(this.k, g.o, g.s, g.d.a);
        }
        return this.O == g.d.b;
    }

    @Deprecated
    public final int D() {
        if (this.O == 0) {
            this.O = com.anythink.core.common.j.n.b(this.k, g.o, g.s, g.d.a);
        }
        return this.O;
    }

    public final Context E() {
        WeakReference<Activity> weakReference = this.e;
        if (weakReference != null && weakReference.get() != null) {
            return this.e.get();
        }
        return this.k;
    }

    public final String F() {
        return this.W;
    }

    public final boolean G() {
        Boolean bool = this.c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Class.forName("com.anythink.detection.RyInterface");
            this.c = Boolean.TRUE;
        } catch (Throwable unused) {
            this.c = Boolean.FALSE;
        }
        return this.c.booleanValue();
    }

    public final boolean H() {
        return this.H;
    }

    public final synchronized IExHandler b() {
        if (this.i) {
            return this.x;
        }
        try {
            Constructor declaredConstructor = Class.forName("com.anythink.pd.ExHandler").asSubclass(IExHandler.class).getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            this.x = (IExHandler) declaredConstructor.newInstance(new Object[0]);
        } catch (Exception unused) {
        }
        this.i = true;
        return this.x;
    }

    public final long f() {
        return this.B;
    }

    public final long g() {
        return this.C;
    }

    public final int h() {
        return this.f;
    }

    public final List<String> i() {
        return this.M;
    }

    public final JSONArray j() {
        return this.L;
    }

    public final Map<String, Object> k() {
        return this.o;
    }

    public final String l() {
        Object obj = this.o.get("channel");
        return obj != null ? obj.toString() : "";
    }

    public final String m() {
        Object obj = this.o.get("sub_channel");
        return obj != null ? obj.toString() : "";
    }

    public final String n() {
        if (TextUtils.isEmpty(this.l)) {
            this.l = com.anythink.core.common.j.n.b(this.k, g.o, g.p, "");
        }
        return this.l;
    }

    public final Location q() {
        return this.J;
    }

    public final String r() {
        return this.K;
    }

    public final boolean s() {
        return this.R;
    }

    public final boolean t() {
        return this.R && this.Q != null;
    }

    public final ATDebuggerConfig u() {
        return this.Q;
    }

    public final String v() {
        if (TextUtils.isEmpty(this.u)) {
            this.u = com.anythink.core.common.j.n.b(this.k, g.o, g.o.i, "");
        }
        return this.u;
    }

    public final String w() {
        if (TextUtils.isEmpty(this.v)) {
            this.v = com.anythink.core.common.j.n.b(this.k, g.x, g.o.l, "");
        }
        return this.v;
    }

    public final String x() {
        if (TextUtils.isEmpty(this.w)) {
            this.w = com.anythink.core.common.j.n.b(this.k, g.x, g.o.m, "");
        }
        return this.w;
    }

    public final boolean y() {
        return this.z || this.A;
    }

    public final com.anythink.core.common.f.c z() {
        if (this.I == null) {
            this.I = new com.anythink.core.common.h.d();
        }
        return this.I;
    }

    public static synchronized m a() {
        m mVar;
        synchronized (m.class) {
            if (j == null) {
                j = new m();
            }
            mVar = j;
        }
        return mVar;
    }

    public static boolean f(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Deprecated
    private void q(String str) {
        this.P = str;
    }

    private synchronized String r(String str) {
        String optString = this.s.optString(str);
        if (TextUtils.isEmpty(optString)) {
            com.anythink.core.common.j.e.b("SDK.init", str + ": sessionid is empty.");
            String v = v();
            String str2 = "";
            if (TextUtils.isEmpty(v)) {
                v = com.anythink.core.common.j.d.d(this.k) + com.anythink.core.common.j.d.f();
                StringBuilder sb = new StringBuilder();
                sb.append(new Random().nextInt(10000000));
                str2 = sb.toString();
            }
            long currentTimeMillis = System.currentTimeMillis();
            String a2 = com.anythink.core.common.j.f.a(v + str + str2 + currentTimeMillis);
            try {
                this.s.put(str, a2);
            } catch (Exception unused) {
            }
            com.anythink.core.common.j.n.a(this.k, g.o, g.o.g, this.s.toString());
            com.anythink.core.common.j.e.b("SDK.init", "placementSessionId :".concat(String.valueOf(a2)));
            if (!TextUtils.isEmpty(v())) {
                str2 = null;
            }
            com.anythink.core.common.i.c.a(str, "2", str2, String.valueOf(currentTimeMillis));
            return a2;
        }
        return optString;
    }

    public final int c() {
        return this.S;
    }

    public final synchronized String[] d() {
        Set<String> keySet;
        int size;
        Map<String, Boolean> map = this.q;
        if (map == null || (size = (keySet = map.keySet()).size()) <= 0) {
            return null;
        }
        String[] strArr = new String[size];
        keySet.toArray(strArr);
        return strArr;
    }

    public final Context e() {
        return this.k;
    }

    public final void g(String str) {
        this.v = str;
        com.anythink.core.common.j.n.a(this.k, g.x, g.o.l, str);
    }

    public final void h(String str) {
        this.w = str;
        com.anythink.core.common.j.n.a(this.k, g.x, g.o.m, str);
    }

    public final void i(String str) {
        com.anythink.core.common.j.n.a(this.k, g.o, g.o.i, str);
        this.u = str;
    }

    public final List<String> j(String str) {
        return this.N.get(str);
    }

    public final List<String> k(String str) {
        ConcurrentHashMap<String, List<String>> concurrentHashMap = this.N;
        return concurrentHashMap.get(str + "_network_firm");
    }

    public static void l(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            int i = (Long.parseLong(str) > 0L ? 1 : (Long.parseLong(str) == 0L ? 0 : -1));
        } catch (Exception unused) {
        }
    }

    public final void c(String str) {
        this.D = str;
        this.o.put("channel", str);
        if (G()) {
            i.a().a(this.D);
        }
    }

    public final String e(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String optString = this.s.optString(str);
        if (TextUtils.isEmpty(optString)) {
            return r(str);
        }
        com.anythink.core.common.j.e.b("SDK.init", str + ": sessionid exists.");
        com.anythink.core.common.j.e.b("SDK.init", "placementSessionId :".concat(String.valueOf(optString)));
        return optString;
    }

    public final IATAdFilter m(String str) {
        ConcurrentHashMap<String, IATAdFilter> concurrentHashMap;
        if (TextUtils.isEmpty(str) || (concurrentHashMap = this.V) == null) {
            return null;
        }
        return concurrentHashMap.get(str);
    }

    public final String o() {
        if (TextUtils.isEmpty(this.m)) {
            this.m = com.anythink.core.common.j.n.b(this.k, g.o, g.q, "");
        }
        return this.m;
    }

    public final String p() {
        try {
            if (TextUtils.isEmpty(this.r)) {
                a(this.k, n(), 0);
            }
        } catch (Exception unused) {
        }
        return this.r;
    }

    public final void n(String str) {
        this.W = str;
    }

    public final void a(int i) {
        if (i == 2) {
            this.S = 2;
        } else {
            this.S = 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
        if (r2.importance != 100) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean c(Context context) {
        try {
            Iterator<ActivityManager.RunningAppProcessInfo> it = ((ActivityManager) context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY)).getRunningAppProcesses().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.processName.equals(context.getPackageName())) {
                    break;
                }
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public final synchronized void a(String... strArr) {
        if (strArr != null) {
            this.q = new HashMap();
            for (String str : strArr) {
                this.q.put(str, Boolean.TRUE);
            }
            return;
        }
        this.q = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void e(Context context) {
        long j2 = this.d;
        try {
            Context context2 = a().k;
            String b2 = com.anythink.core.common.j.n.b(context2, g.o, a().n() + "playRecord", "");
            if (!TextUtils.isEmpty(b2)) {
                JSONObject jSONObject = new JSONObject(b2);
                long optLong = jSONObject.optLong(e.a);
                long optLong2 = jSONObject.optLong(e.b);
                String optString = jSONObject.optString(e.c);
                int optInt = jSONObject.optInt(e.d);
                if (j2 != 0) {
                    com.anythink.core.common.i.c.a(optInt == 1 ? 4 : 2, optLong, optLong2, optString);
                    com.anythink.core.common.j.e.d("SDK.init", "Create new psid, SDKContext.init to send playTime:" + ((optLong2 - optLong) / 1000));
                } else {
                    try {
                        com.anythink.core.common.j.e.d("SDK.init", "Psid is old, use pervioud statime，close before:" + ((optLong2 - optLong) / 1000));
                        j2 = optLong;
                    } catch (Exception unused) {
                        j2 = optLong;
                        Context context3 = a().k;
                        com.anythink.core.common.j.n.a(context3, g.o, a().n() + "playRecord", "");
                        if (j2 != 0) {
                        }
                        if (j2 == 0) {
                        }
                        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new e(j2));
                    }
                }
                Context context4 = a().k;
                com.anythink.core.common.j.n.a(context4, g.o, a().n() + "playRecord", "");
            }
        } catch (Exception unused2) {
        }
        if (j2 != 0) {
            j2 = com.anythink.core.common.j.n.a(context, g.o, g.o.h, (Long) 0L).longValue();
        }
        if (j2 == 0) {
            j2 = System.currentTimeMillis();
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new e(j2));
    }

    public final void d(String str) {
        this.E = str;
        this.o.put("sub_channel", str);
    }

    public final Map<String, Object> b(String str) {
        HashMap hashMap = new HashMap();
        Map<String, Object> map = this.p.get(str);
        ConcurrentHashMap<String, Object> concurrentHashMap = this.o;
        if (concurrentHashMap != null) {
            hashMap.putAll(concurrentHashMap);
        }
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.remove("channel");
        hashMap.remove("sub_channel");
        Object obj = this.o.get("channel");
        Object obj2 = this.o.get("sub_channel");
        if (obj != null) {
            hashMap.put("channel", obj);
        }
        if (obj2 != null) {
            hashMap.put("sub_channel", obj2);
        }
        return hashMap;
    }

    private boolean d(Context context) {
        String d = com.anythink.core.common.j.d.d(context);
        if (TextUtils.isEmpty(d) || !d.equals(this.P)) {
            String f = com.anythink.core.common.j.d.f();
            if (TextUtils.isEmpty(f) || !f.equals(this.P)) {
                IExHandler b2 = a().b();
                return b2 != null && b2.checkDebuggerDevice(context, this.P);
            }
            return true;
        }
        return true;
    }

    public static boolean c(Context context, List<String> list) {
        boolean z;
        boolean z2;
        if (list == null) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        PackageInfo packageInfo = null;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 8);
            z = true;
        } catch (Throwable th) {
            sb.append(", error: ");
            sb.append(th.getMessage());
            z = false;
        }
        if (packageInfo == null) {
            return false;
        }
        ProviderInfo[] providerInfoArr = packageInfo.providers;
        for (String str : list) {
            int length = providerInfoArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z2 = false;
                    break;
                } else if (TextUtils.equals(providerInfoArr[i].name, str)) {
                    z2 = true;
                    break;
                } else {
                    i++;
                }
            }
            if (!z2) {
                sb.append(", ");
                sb.append(str);
                z = false;
            }
        }
        if (sb.length() > 2) {
            sb.delete(0, 2);
        }
        if (!z) {
            sb.toString();
        }
        return z;
    }

    public final synchronized boolean a(String str) {
        Map<String, Boolean> map = this.q;
        if (map == null) {
            return false;
        }
        return map.containsKey(str);
    }

    public final void a(Context context) {
        this.k = context;
    }

    public final void a(Map<String, Object> map) {
        if (map != null && map.containsKey("channel")) {
            Object obj = map.get("channel");
            String obj2 = obj != null ? obj.toString() : "";
            this.D = obj2;
            if (!com.anythink.core.common.j.g.a(obj2)) {
                this.D = null;
                map.remove("channel");
            } else if (G()) {
                i.a().a(this.D);
            }
        }
        if (map != null && map.containsKey("sub_channel")) {
            Object obj3 = map.get("sub_channel");
            String obj4 = obj3 != null ? obj3.toString() : "";
            this.E = obj4;
            if (!com.anythink.core.common.j.g.b(obj4)) {
                this.E = null;
                map.remove("sub_channel");
            }
        }
        this.o.clear();
        if (map != null) {
            this.o.putAll(map);
        }
        if (!TextUtils.isEmpty(this.D)) {
            this.o.put("channel", this.D);
        }
        if (TextUtils.isEmpty(this.E)) {
            return;
        }
        this.o.put("sub_channel", this.E);
    }

    public static boolean d(Context context, List<String> list) {
        boolean z = true;
        if (list == null || list.size() == 0) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        boolean z2 = false;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = list.get(i);
                if (TextUtils.isEmpty(applicationInfo.metaData.getString(str))) {
                    sb.append(", \"");
                    sb.append(str);
                    sb.append("\"");
                    z = false;
                }
            }
            if (sb.length() > 2) {
                sb.delete(0, 2);
            }
            z2 = z;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (!z2) {
            sb.toString();
        }
        return z2;
    }

    public final void b(int i) {
        this.f = i;
    }

    private void b(Context context, String str, String str2) {
        a(context.getApplicationContext(), str, str2);
        com.anythink.core.common.j.b.a.a().a(new AnonymousClass11(context, str));
    }

    public final void b(final Context context) {
        if (y()) {
            com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.b.m.12
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        ArrayList arrayList = new ArrayList();
                        Enumeration<String> entries = new DexFile(context.getPackageCodePath()).entries();
                        while (entries.hasMoreElements()) {
                            String nextElement = entries.nextElement();
                            if (nextElement.contains("com.anythink.network") && nextElement.contains("InitManager") && !nextElement.contains("$")) {
                                arrayList.add(nextElement);
                            }
                        }
                        arrayList.size();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            try {
                                Object obj = null;
                                try {
                                    obj = Class.forName((String) it.next()).getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                                } catch (Throwable unused) {
                                }
                                if (obj != null && (obj instanceof ATInitMediation)) {
                                    ATInitMediation aTInitMediation = (ATInitMediation) obj;
                                    String networkName = aTInitMediation.getNetworkName();
                                    if (!TextUtils.isEmpty(networkName)) {
                                        if (TextUtils.isEmpty(aTInitMediation.getNetworkVersion())) {
                                            "NetworkName: ".concat(String.valueOf(networkName));
                                        }
                                        boolean f = m.f(aTInitMediation.getNetworkSDKClass());
                                        boolean b2 = m.b(aTInitMediation.getPluginClassStatus());
                                        boolean a2 = m.a(context, aTInitMediation.getActivityStatus());
                                        boolean b3 = m.b(context, aTInitMediation.getServiceStatus());
                                        boolean c = m.c(context, aTInitMediation.getProviderStatus());
                                        boolean d = m.d(context, aTInitMediation.getMetaValutStatus());
                                        boolean e = m.e(context, aTInitMediation.getPermissionStatus());
                                        if (f && b2 && a2 && b3 && c && d && !e) {
                                        }
                                    }
                                }
                            } catch (Throwable unused2) {
                            }
                        }
                    } catch (Exception unused3) {
                    }
                }
            });
        }
    }

    private static void c(Runnable runnable) {
        com.anythink.core.common.j.b.a.a().a(runnable);
    }

    public static boolean b(Map<String, Boolean> map) {
        boolean z = true;
        if (map == null) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : map.keySet()) {
            if (!map.get(str).booleanValue()) {
                sb.append(", ");
                sb.append(str);
                z = false;
            }
        }
        if (sb.length() > 2) {
            sb.delete(0, 2);
        }
        if (!z) {
            "Dependence Plugin: Missing ".concat(String.valueOf(sb));
        }
        return z;
    }

    public final void c(boolean z) {
        this.F = z;
    }

    public static boolean e(Context context, List<String> list) {
        int size;
        boolean z;
        if (list == null || (size = list.size()) == 0) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        boolean z2 = false;
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr != null) {
                boolean z3 = true;
                for (int i = 0; i < size; i++) {
                    String str = list.get(i);
                    int length = strArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z = false;
                            break;
                        } else if (TextUtils.equals(str, strArr[i2])) {
                            z = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (!z) {
                        if (sb.length() == 0) {
                            sb.append(str);
                        } else {
                            sb.append(", ");
                            sb.append(str);
                        }
                        z3 = false;
                    }
                }
                z2 = z3;
            } else {
                for (int i3 = 0; i3 < size; i3++) {
                    String str2 = list.get(i3);
                    if (i3 == 0) {
                        sb.append(str2);
                    } else {
                        sb.append(", ");
                        sb.append(str2);
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (!z2) {
            sb.toString();
        }
        return z2;
    }

    public static boolean b(Context context, List<String> list) {
        boolean z = true;
        if (list == null) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        PackageManager packageManager = context.getPackageManager();
        for (String str : list) {
            try {
            } catch (Throwable th) {
                sb.append(", error: ");
                sb.append(th.getMessage());
            }
            if (packageManager.queryIntentServices(new Intent(context, Class.forName(str)), 131072).size() <= 0) {
                sb.append(", ");
                sb.append(str);
                z = false;
            }
        }
        if (sb.length() > 2) {
            sb.delete(0, 2);
        }
        if (!z) {
            sb.toString();
        }
        return z;
    }

    private static void d(Runnable runnable) {
        com.anythink.core.common.j.b.a.a().a(runnable, 1000L);
    }

    public final void d(boolean z) {
        this.U = z;
    }

    public final void a(String str, Map<String, Object> map) {
        if (map != null) {
            this.p.put(str, map);
        }
    }

    public final void a(List<String> list) {
        try {
            this.M = list;
            if (list != null && !list.isEmpty()) {
                this.L = new JSONArray((Collection) list);
            } else {
                this.L = null;
            }
        } catch (Exception unused) {
        }
    }

    public final synchronized void a(Location location) {
        this.J = location;
    }

    public final void b(Runnable runnable) {
        this.n.removeCallbacks(runnable);
    }

    public final void b(boolean z) {
        this.A = z;
    }

    public final synchronized void a(boolean z) {
        this.K = z ? "1" : "2";
    }

    public final void b(String str, List<String> list) {
        ConcurrentHashMap<String, List<String>> concurrentHashMap = this.N;
        concurrentHashMap.put(str + "_network_firm", list);
    }

    public static /* synthetic */ void b(m mVar) {
        Throwable th;
        boolean z;
        boolean z2 = false;
        if (mVar.k != null) {
            try {
                z = new File(mVar.k.getExternalFilesDir(null), mVar.y).exists();
                if (!z) {
                    try {
                        z = new File(mVar.k.getFilesDir(), mVar.y).exists();
                    } catch (Throwable th2) {
                        th = th2;
                        th.printStackTrace();
                        z2 = z;
                        mVar.z = z2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                z = false;
            }
            z2 = z;
        }
        mVar.z = z2;
    }

    public final synchronized void a(final Context context, final String str, String str2, final ATNetworkConfig aTNetworkConfig) {
        if (context == null) {
            return;
        }
        this.k = context.getApplicationContext();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (this.G) {
                return;
            }
            this.G = true;
            try {
                long currentTimeMillis = System.currentTimeMillis();
                long longValue = com.anythink.core.common.j.n.a(context, g.o, g.o.k, (Long) 0L).longValue();
                this.B = longValue;
                if (longValue == 0) {
                    this.B = currentTimeMillis;
                    com.anythink.core.common.j.n.a(context, g.o, g.o.k, currentTimeMillis);
                }
                this.C = ((a(currentTimeMillis) - a(this.B)) / com.anythink.expressad.foundation.g.a.bV) + 1;
                this.d = 0L;
                com.anythink.core.a.a.a(context.getApplicationContext()).a();
                final Context applicationContext = context.getApplicationContext();
                this.k = applicationContext;
                this.l = str;
                com.anythink.core.common.j.n.a(applicationContext, g.o, g.p, str);
                this.m = str2;
                com.anythink.core.common.j.n.a(this.k, g.o, g.q, str2);
                this.T = com.anythink.core.common.j.h.a();
                try {
                    BroadcastReceiver broadcastReceiver = this.t;
                    if (broadcastReceiver != null) {
                        this.k.unregisterReceiver(broadcastReceiver);
                    }
                    this.t = null;
                } catch (Throwable unused) {
                }
                try {
                    this.t = new AnonymousClass10();
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction(b91.a);
                    this.k.registerReceiver(this.t, intentFilter);
                } catch (Throwable unused2) {
                }
                com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.b.m.6
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            com.anythink.core.common.i.b.a().a(applicationContext);
                            m.this.a(applicationContext, str, 0);
                            m.a(m.this, context);
                            h.a(applicationContext).a();
                            m.b(m.this);
                        } catch (Exception unused3) {
                        }
                    }
                });
                ((Application) this.k).registerActivityLifecycleCallbacks(new f(c(this.k)));
                a(new Runnable() { // from class: com.anythink.core.common.b.m.7
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.anythink.core.common.j.d.p(applicationContext);
                    }
                }, 5000L);
                com.anythink.core.common.j.b.a.a().a(new AnonymousClass1());
                com.anythink.core.common.o.a().a(this.k);
                com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.b.m.8
                    @Override // java.lang.Runnable
                    public final void run() {
                        m.this.b();
                        if (m.this.x != null) {
                            m.this.x.initDeviceInfo(context);
                        }
                        com.anythink.core.c.e.a(applicationContext).a();
                        com.anythink.core.common.j.d.r(m.this.k);
                    }
                });
                com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.b.m.9
                    @Override // java.lang.Runnable
                    public final void run() {
                        m mVar = m.this;
                        m.a(mVar, mVar.k, aTNetworkConfig);
                    }
                });
                a(context.getApplicationContext(), str, str2);
                com.anythink.core.common.j.b.a.a().a(new AnonymousClass11(context, str));
            } catch (Exception unused3) {
            }
        }
    }

    private void e(boolean z) {
        this.T = z;
    }

    public final void a(Context context, String str, ATDebuggerConfig aTDebuggerConfig) {
        IExHandler b2;
        if (context == null) {
            y();
            return;
        }
        if (a().k == null) {
            a().k = context.getApplicationContext();
        }
        this.P = str;
        this.Q = aTDebuggerConfig;
        String d = com.anythink.core.common.j.d.d(context);
        boolean z = true;
        if (TextUtils.isEmpty(d) || !d.equals(this.P)) {
            String f = com.anythink.core.common.j.d.f();
            if ((TextUtils.isEmpty(f) || !f.equals(this.P)) && ((b2 = a().b()) == null || !b2.checkDebuggerDevice(context, this.P))) {
                z = false;
            }
        }
        this.R = z;
        if (TextUtils.isEmpty(this.P)) {
            y();
            this.R = false;
        } else if (this.R) {
            y();
            if (this.Q != null) {
                y();
            }
        } else {
            y();
        }
    }

    public final synchronized long a(Context context, String str, int i) {
        com.anythink.core.c.a b2 = com.anythink.core.c.b.a(context).b(str);
        String b3 = com.anythink.core.common.j.n.b(context, g.o, g.o.f, "");
        String b4 = com.anythink.core.common.j.n.b(context, g.o, g.o.g, "");
        long longValue = com.anythink.core.common.j.n.a(context, g.o, g.o.h, (Long) 0L).longValue();
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - longValue < 0) {
            longValue = 0;
        }
        if (currentTimeMillis - longValue <= (i == 0 ? b2.H() : b2.t())) {
            com.anythink.core.common.j.e.b("SDK.init", "psid updataTime<=" + b2.H());
            this.r = b3;
            if (!TextUtils.isEmpty(b4)) {
                this.s = new JSONObject(b4);
            }
            com.anythink.core.common.j.e.b("SDK.init", "psid :" + this.r);
            return 0L;
        }
        com.anythink.core.common.j.e.b("SDK.init", "psid updataTime>" + b2.H());
        String v = v();
        String str2 = "";
        if (TextUtils.isEmpty(v)) {
            v = com.anythink.core.common.j.d.d(context) + com.anythink.core.common.j.d.f();
            str2 = String.valueOf(new Random().nextInt(10000000));
        }
        this.r = com.anythink.core.common.j.f.a(v + str + str2 + currentTimeMillis);
        this.s = new JSONObject();
        com.anythink.core.common.j.n.a(context, g.o, g.o.f, this.r);
        com.anythink.core.common.j.n.a(context, g.o, g.o.g, "");
        com.anythink.core.common.j.n.a(context, g.o, g.o.h, currentTimeMillis);
        com.anythink.core.common.j.e.b("SDK.init", "psid :" + this.r);
        com.anythink.core.common.i.c.a((String) null, "1", str2, String.valueOf(currentTimeMillis));
        if (i == 0) {
            this.d = currentTimeMillis;
        }
        return currentTimeMillis;
    }

    public final void a(Context context, final String str, Map<String, Object> map) {
        if (y()) {
            new com.anythink.core.common.g.i(context, a().n(), a().o(), str, "", map).a(0, new com.anythink.core.common.g.h() { // from class: com.anythink.core.common.b.m.13
                @Override // com.anythink.core.common.g.h
                public final void onLoadCanceled(int i) {
                }

                @Override // com.anythink.core.common.g.h
                public final void onLoadError(int i, String str2, AdError adError) {
                    adError.printStackTrace();
                }

                @Override // com.anythink.core.common.g.h
                public final void onLoadFinish(int i, Object obj) {
                    com.anythink.core.c.d b2 = com.anythink.core.c.d.b((String) obj);
                    if ("4".equals(String.valueOf(b2.S()))) {
                        List<af> A = b2.A();
                        if (A != null && A.size() != 0) {
                            for (af afVar : A) {
                                afVar.c();
                                afVar.t();
                                afVar.g();
                            }
                            return;
                        }
                        ErrorCode.getErrorCode(ErrorCode.noAdsourceConfig, "", "").getDesc();
                    }
                }

                @Override // com.anythink.core.common.g.h
                public final void onLoadStart(int i) {
                }
            });
        }
    }

    public static boolean a(Context context, List<String> list) {
        boolean z = true;
        if (list == null) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            try {
            } catch (Throwable th) {
                sb.append(", error: ");
                sb.append(th.getMessage());
            }
            if (context.getPackageManager().queryIntentActivities(new Intent(context, Class.forName(str)), 131072).size() <= 0) {
                sb.append(", ");
                sb.append(str);
                z = false;
            }
        }
        if (sb.length() > 2) {
            sb.delete(0, 2);
        }
        if (!z) {
            sb.toString();
        }
        return z;
    }

    public final void a(final Context context, final String str, final String str2) {
        com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.b.m.2
            @Override // java.lang.Runnable
            public final void run() {
                if (com.anythink.core.c.b.a(context).a(str)) {
                    com.anythink.core.c.b.a(context).a(str, str2);
                }
            }
        });
    }

    public final void a(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.n.post(runnable);
        }
    }

    public final void a(Runnable runnable, long j2) {
        if (j2 <= 0 && Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.n.postDelayed(runnable, j2);
        }
    }

    private static long a(long j2) {
        Date date = new Date(j2);
        return new Date(date.getYear(), date.getMonth(), date.getDate()).getTime();
    }

    public final void a(String str, List<String> list) {
        this.N.put(str, list);
    }

    @Deprecated
    public final void a(AreaCode areaCode) {
        int areaCode2 = areaCode.getAreaCode();
        this.O = areaCode2;
        com.anythink.core.common.j.n.a(this.k, g.o, g.s, areaCode2);
    }

    public final void a(final Context context, final DeviceInfoCallback deviceInfoCallback) {
        if (this.G) {
            com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.b.m.3
                @Override // java.lang.Runnable
                public final void run() {
                    com.anythink.core.c.a l0 = wo1.l0(com.anythink.core.c.b.a(context));
                    String x = l0 != null ? l0.x() : "";
                    boolean z = true;
                    if (!TextUtils.isEmpty(x)) {
                        try {
                            JSONObject jSONObject = new JSONObject(x);
                            if (!jSONObject.isNull("a")) {
                                if (jSONObject.optInt("a") != 1) {
                                    z = false;
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        IExHandler b2 = m.a().b();
                        if (b2 != null) {
                            b2.fillTestDeviceData(jSONObject2, l0);
                        }
                        jSONObject2.put(IronSourceConstants.TYPE_GAID, com.anythink.core.common.j.d.r(context));
                        jSONObject2.put("AndroidID", z ? com.anythink.core.common.j.d.d(context) : "");
                        jSONObject2.put("How to config TestMode", "Please visit the document center and learn more through： Integration(Basic) -> How To Test");
                        com.anythink.core.common.j.m.a("testModeDeviceInfo", jSONObject2.toString());
                        DeviceInfoCallback deviceInfoCallback2 = deviceInfoCallback;
                        if (deviceInfoCallback2 != null) {
                            deviceInfoCallback2.deviceInfo(jSONObject2.toString());
                        }
                    } catch (Throwable unused2) {
                    }
                }
            });
        } else if (deviceInfoCallback != null) {
            deviceInfoCallback.deviceInfo("You should init SDK first.");
        }
    }

    public final void a(final String str, final String str2, final String str3) {
        com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.b.m.4
            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                if (m.this.G) {
                    com.anythink.core.common.f b2 = t.a().b(str);
                    com.anythink.core.c.d a2 = com.anythink.core.c.e.a(m.this.k).a(str);
                    String b3 = u.a().b(str);
                    String str4 = (TextUtils.isEmpty(str2) || !com.anythink.core.common.j.g.c(str2)) ? "" : str2;
                    com.anythink.core.common.e.b bVar = null;
                    if (b2 != null) {
                        boolean d = b2.d();
                        bVar = b2.a(m.this.k, false, false);
                        z = d;
                    } else {
                        z = false;
                    }
                    if (bVar != null) {
                        com.anythink.core.common.e.e M = bVar.h().M();
                        M.d(1);
                        M.C = str4;
                        com.anythink.core.common.i.a.a(m.this.k).a(16, M);
                        return;
                    }
                    com.anythink.core.common.e.e a3 = p.a(TextUtils.isEmpty(b3) ? "" : b3, str, "", a2, "", 0, 0, 0);
                    a3.d(z ? 3 : 2);
                    if (a2 == null) {
                        a3.x(str3);
                    }
                    a3.C = str4;
                    com.anythink.core.common.i.a.a(m.this.k).a(16, a3);
                }
            }
        });
    }

    public final void a(Activity activity) {
        WeakReference<Activity> weakReference = this.e;
        if (weakReference == null || weakReference.get() == null) {
            this.e = new WeakReference<>(activity);
        }
    }

    private void a(Context context, ATNetworkConfig aTNetworkConfig) {
        if (aTNetworkConfig == null) {
            aTNetworkConfig = new ATNetworkConfig();
        }
        List<ATInitConfig> aTInitConfigList = aTNetworkConfig.getATInitConfigList();
        if (aTInitConfigList == null) {
            aTInitConfigList = new ArrayList<>(2);
        }
        if (t()) {
            aTInitConfigList.clear();
        }
        boolean z = false;
        this.H = aTInitConfigList.size() > 0;
        ATInitConfig aTInitConfig = null;
        try {
            Constructor declaredConstructor = Class.forName("com.anythink.network.facebook.FacebookATInitConfig").asSubclass(ATInitConfig.class).getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            ATInitConfig aTInitConfig2 = (ATInitConfig) declaredConstructor.newInstance(new Object[0]);
            try {
                aTInitConfigList.add(0, aTInitConfig2);
            } catch (Throwable unused) {
            }
            aTInitConfig = aTInitConfig2;
        } catch (Throwable unused2) {
        }
        for (ATInitConfig aTInitConfig3 : aTInitConfigList) {
            if (aTInitConfig3 != null) {
                if (aTInitConfig != null && TextUtils.equals(aTInitConfig.getClass().getSimpleName(), aTInitConfig3.getClass().getSimpleName())) {
                    if (!z) {
                        z = true;
                    }
                }
                com.anythink.core.common.j.b.a.a().a(new AnonymousClass5(aTInitConfig3, context));
            }
        }
    }

    public final void a(String str, Map<String, Object> map, String... strArr) {
        com.anythink.core.common.e.e eVar;
        if (map == null || map.containsKey(ATInitMediation.KEY_LOCAL)) {
            return;
        }
        try {
            eVar = (com.anythink.core.common.e.e) map.get(g.k.h);
        } catch (Throwable unused) {
            eVar = null;
        }
        map.remove(g.k.h);
        com.anythink.core.common.j.n.a(this.k, g.y, str, new JSONObject(map).toString());
        if (eVar == null || strArr == null) {
            return;
        }
        try {
            com.anythink.core.common.i.c.a(eVar, strArr[0], strArr.length > 1 ? strArr[1] : null);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void a(String[] strArr, IATAdFilter iATAdFilter) {
        ConcurrentHashMap<String, IATAdFilter> concurrentHashMap = this.V;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
        }
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        if (this.V == null) {
            this.V = new ConcurrentHashMap<>();
        }
        for (String str : strArr) {
            this.V.put(str, iATAdFilter);
        }
    }

    public final void a(com.anythink.core.c.a aVar) {
        try {
            String e = aVar.e();
            String f = aVar.f();
            if (TextUtils.isEmpty(e) || TextUtils.isEmpty(f)) {
                return;
            }
            i.a().b();
        } catch (Throwable th) {
            if (y()) {
                th.printStackTrace();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(m mVar, Context context) {
        long j2 = mVar.d;
        try {
            Context context2 = a().k;
            String b2 = com.anythink.core.common.j.n.b(context2, g.o, a().n() + "playRecord", "");
            if (!TextUtils.isEmpty(b2)) {
                JSONObject jSONObject = new JSONObject(b2);
                long optLong = jSONObject.optLong(e.a);
                long optLong2 = jSONObject.optLong(e.b);
                String optString = jSONObject.optString(e.c);
                int optInt = jSONObject.optInt(e.d);
                if (j2 != 0) {
                    com.anythink.core.common.i.c.a(optInt == 1 ? 4 : 2, optLong, optLong2, optString);
                    com.anythink.core.common.j.e.d("SDK.init", "Create new psid, SDKContext.init to send playTime:" + ((optLong2 - optLong) / 1000));
                } else {
                    try {
                        com.anythink.core.common.j.e.d("SDK.init", "Psid is old, use pervioud statime，close before:" + ((optLong2 - optLong) / 1000));
                        j2 = optLong;
                    } catch (Exception unused) {
                        j2 = optLong;
                        Context context3 = a().k;
                        com.anythink.core.common.j.n.a(context3, g.o, a().n() + "playRecord", "");
                        if (j2 != 0) {
                        }
                        if (j2 == 0) {
                        }
                        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new e(j2));
                    }
                }
                Context context4 = a().k;
                com.anythink.core.common.j.n.a(context4, g.o, a().n() + "playRecord", "");
            }
        } catch (Exception unused2) {
        }
        if (j2 != 0) {
            j2 = com.anythink.core.common.j.n.a(context, g.o, g.o.h, (Long) 0L).longValue();
        }
        if (j2 == 0) {
            j2 = System.currentTimeMillis();
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new e(j2));
    }

    public static /* synthetic */ void a(m mVar, Context context, ATNetworkConfig aTNetworkConfig) {
        if (aTNetworkConfig == null) {
            aTNetworkConfig = new ATNetworkConfig();
        }
        List<ATInitConfig> aTInitConfigList = aTNetworkConfig.getATInitConfigList();
        if (aTInitConfigList == null) {
            aTInitConfigList = new ArrayList<>(2);
        }
        if (mVar.t()) {
            aTInitConfigList.clear();
        }
        boolean z = false;
        mVar.H = aTInitConfigList.size() > 0;
        ATInitConfig aTInitConfig = null;
        try {
            Constructor declaredConstructor = Class.forName("com.anythink.network.facebook.FacebookATInitConfig").asSubclass(ATInitConfig.class).getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            ATInitConfig aTInitConfig2 = (ATInitConfig) declaredConstructor.newInstance(new Object[0]);
            try {
                aTInitConfigList.add(0, aTInitConfig2);
            } catch (Throwable unused) {
            }
            aTInitConfig = aTInitConfig2;
        } catch (Throwable unused2) {
        }
        for (ATInitConfig aTInitConfig3 : aTInitConfigList) {
            if (aTInitConfig3 != null) {
                if (aTInitConfig != null && TextUtils.equals(aTInitConfig.getClass().getSimpleName(), aTInitConfig3.getClass().getSimpleName())) {
                    if (!z) {
                        z = true;
                    }
                }
                com.anythink.core.common.j.b.a.a().a(new AnonymousClass5(aTInitConfig3, context));
            }
        }
    }
}