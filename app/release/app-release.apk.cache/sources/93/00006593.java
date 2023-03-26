package com.p7700g.p99005;

import android.content.Context;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import com.anchorfree.hdr.AFHydra;
import com.anchorfree.hdr.HydraConnInfo;
import com.anchorfree.hdr.HydraHeaderListener;
import com.p7700g.p99005.vg1;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: HydraTransport.java */
/* loaded from: classes2.dex */
public class xg1 extends hn1 implements HydraHeaderListener {
    @x1
    public static final List<Integer> A;
    public static final int t = 1;
    @x1
    public static final String u = "hydra";
    @x1
    public static final String v = "resource";
    @x1
    public static final String w = "connection_log.json";
    public static final String x = "hydra";
    @x1
    public static final kj1 y = kj1.b("HydraTransport");
    public static final int z = 1500;
    @x1
    public final Context B;
    @x1
    public final String C;
    @x1
    public final Pattern D;
    @x1
    public final qd1 E;
    @x1
    public final td1 F;
    @x1
    public final qg1 G;
    @x1
    public final tc1 H;
    public final boolean I;
    @x1
    public final Executor J;
    @x1
    public String K;
    @x1
    public rg1 L;
    public volatile boolean M;
    public volatile boolean N;
    @z1
    public ParcelFileDescriptor O;

    /* compiled from: HydraTransport.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public final /* synthetic */ String s;
        public final /* synthetic */ fo1 t;

        public a(String str, fo1 fo1Var) {
            xg1.this = r1;
            this.s = str;
            this.t = fo1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            xg1.y.c("startHydra: AFHydra.NativeA", new Object[0]);
            xg1.this.P("Called start");
            xg1.this.G.b();
            xg1 xg1Var = xg1.this;
            xg1Var.G.o(this.s, true, false, false, xg1Var.C, this.t.z, xg1Var);
            xg1.this.M = true;
        }
    }

    /* compiled from: HydraTransport.java */
    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
            xg1.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            xg1.this.P("called stopVpn");
            if (xg1.this.M) {
                xg1.y.c("Real connection notifyStopped", new Object[0]);
                xg1 xg1Var = xg1.this;
                xg1Var.H.c(xg1Var.B);
                xg1.this.E.r();
                xg1.this.Q();
                xg1.this.M = false;
            } else {
                xg1.y.c("Hydra stopped. Skip", new Object[0]);
            }
            xg1.y.c("Notify idle state with isHydraRunning: %s", Boolean.valueOf(xg1.this.M));
        }
    }

    /* compiled from: HydraTransport.java */
    /* loaded from: classes2.dex */
    public class c implements Runnable {
        public final /* synthetic */ fo1 s;

        public c(fo1 fo1Var) {
            xg1.this = r1;
            this.s = fo1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            xg1 xg1Var;
            ParcelFileDescriptor parcelFileDescriptor;
            kj1 kj1Var = xg1.y;
            kj1Var.c("Started updateConfig", new Object[0]);
            if (xg1.this.M && (parcelFileDescriptor = (xg1Var = xg1.this).O) != null) {
                xg1.this.Z(xg1Var.I(this.s.v, parcelFileDescriptor.getFd()));
            } else {
                kj1Var.c("Tried to update config with hydra not running", new Object[0]);
            }
        }
    }

    /* compiled from: HydraTransport.java */
    /* loaded from: classes2.dex */
    public class d implements Runnable {
        public final /* synthetic */ int s;

        public d(int i) {
            xg1.this = r1;
            this.s = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            xg1 xg1Var = xg1.this;
            StringBuilder G = wo1.G("Notify network ");
            G.append(this.s);
            xg1Var.P(G.toString());
            xg1.this.G.m(this.s);
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        A = arrayList;
        arrayList.add(196);
        arrayList.add(191);
        arrayList.add(181);
    }

    public xg1(@x1 Context context, @x1 qg1 qg1Var, @x1 td1 td1Var, @x1 qd1 qd1Var, @x1 Executor executor) {
        this(context, qg1Var, td1Var, qd1Var, false, executor);
    }

    @x1
    public String I(@x1 String str, int i) {
        return str.replaceAll("%FD%", String.valueOf(i));
    }

    private synchronized void J(@x1 fo1 fo1Var, @x1 ParcelFileDescriptor parcelFileDescriptor) {
        y.c("connect entered", new Object[0]);
        this.J.execute(new a(I(fo1Var.v, parcelFileDescriptor.getFd()), fo1Var));
        String N = N(fo1Var.v);
        if (N != null) {
            this.E.q(N);
        }
    }

    private void K(@x1 String str) {
        try {
            n81.p(new File(this.B.getExternalFilesDir(null), w), str);
        } catch (IOException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            y.e(message, e);
        }
    }

    @x1
    private List<km1> L(int i) {
        P("Get connection info");
        List<HydraConnInfo> c2 = this.G.c(i);
        ArrayList arrayList = new ArrayList(c2.size());
        for (HydraConnInfo hydraConnInfo : c2) {
            arrayList.add(new km1(hydraConnInfo.getDomain(), hydraConnInfo.getAllIps()));
        }
        kj1 kj1Var = y;
        kj1Var.c("Read connection for type " + i + " " + arrayList, new Object[0]);
        return arrayList;
    }

    @z1
    private String N(@x1 String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            y.f(e);
        }
        if (jSONObject.has("enable_network_quality_tests") && jSONObject.getInt("enable_network_quality_tests") == 1) {
            JSONObject optJSONObject = jSONObject.optJSONObject("sd");
            JSONObject optJSONObject2 = optJSONObject != null ? optJSONObject.optJSONObject("routes") : null;
            JSONObject optJSONObject3 = optJSONObject2 != null ? optJSONObject2.optJSONObject("default") : null;
            JSONArray optJSONArray = optJSONObject3 != null ? optJSONObject3.optJSONArray("sections") : null;
            JSONObject optJSONObject4 = optJSONArray != null ? optJSONArray.optJSONObject(0) : null;
            JSONArray optJSONArray2 = optJSONObject4 != null ? optJSONObject4.optJSONArray("servers") : null;
            if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                Random random = new Random();
                JSONObject jSONObject2 = optJSONArray2.getJSONObject(random.nextInt(optJSONArray2.length()));
                if (jSONObject2.has("ips")) {
                    JSONArray jSONArray = jSONObject2.getJSONArray("ips");
                    if (jSONArray.length() > 0) {
                        return jSONArray.getString(random.nextInt(jSONArray.length()));
                    }
                } else {
                    return jSONObject2.getString("domain");
                }
            }
            return null;
        }
        return null;
    }

    public static /* synthetic */ void O(xg1 xg1Var, int i) {
        xg1Var.R(i);
    }

    public void P(@x1 String str) {
        kj1 kj1Var = y;
        StringBuilder L = wo1.L(str, " in Thread:");
        L.append(Thread.currentThread().getId());
        kj1Var.c(L.toString(), new Object[0]);
    }

    public void Q() {
        this.N = true;
        this.K = "";
        this.O = null;
        try {
            y.c("Stop called on hydra", new Object[0]);
            P("Stop called");
            this.G.q();
        } finally {
            this.L = new rg1();
            this.N = false;
        }
    }

    public void R(int i) {
        this.J.execute(new d(i));
    }

    private void S(@x1 Parcelable parcelable) {
        u(parcelable);
    }

    private void T(@x1 String str) {
        if (this.L.d()) {
            return;
        }
        int b2 = this.L.b();
        Set<String> a2 = this.L.a(b2);
        StringBuilder sb = new StringBuilder();
        for (String str2 : a2) {
            if (!str2.isEmpty()) {
                if (sb.length() == 0) {
                    sb.append(" :: ");
                    sb.append(str2);
                } else {
                    sb.append(", ");
                    sb.append(str);
                }
            }
        }
        s(new yg1(b2, sb.toString()));
        this.L = new rg1();
        this.K = "";
        this.O = null;
    }

    private void U(@x1 String str) {
        try {
            String[] split = str.split(",");
            t(Long.parseLong(split[1]), Long.parseLong(split[0]));
        } catch (Exception e) {
            y.f(e);
        }
    }

    private void V(@x1 String str, @x1 String str2) {
        try {
            if (v.equals(str)) {
                S(wg1.a(str2));
            }
        } catch (Exception e) {
            y.f(e);
        }
    }

    private void W(@x1 String str, @x1 String str2) {
        y.c(wo1.w("Ptm: ", str, " <", str2, ">"), new Object[0]);
        S(new ug1(str, str2));
    }

    private void X(@x1 @sg1 String str, @z1 String str2) {
        y.c(wo1.t("State changed to ", str), new Object[0]);
        if (!AFHydra.STATUS_IDLE.equals(str) && !AFHydra.STATUS_DISCONNECTING.equals(str)) {
            if (!AFHydra.STATUS_CONNECTED.equals(str) || str2 == null) {
                return;
            }
            this.K = str2;
            r();
            return;
        }
        T(str);
    }

    private int Y(@x1 String str) {
        Matcher matcher = this.D.matcher(str);
        if (matcher.find()) {
            try {
                return Integer.parseInt(matcher.group(0));
            } catch (Exception unused) {
            }
        }
        return -100;
    }

    public synchronized void Z(String str) {
        y.c("performActualUpdateConfig", new Object[0]);
        this.G.r(str);
    }

    private void a0(@x1 String str, @z1 String str2) {
        int Y = Y(str);
        this.L.g(Y, str2);
        if (A.contains(Integer.valueOf(Y))) {
            T(str);
        }
    }

    @x1
    private ParcelFileDescriptor b0(@x1 fo1 fo1Var, @x1 ln1 ln1Var) throws gc1 {
        gn1 gn1Var = fo1Var.t;
        kj1 kj1Var = y;
        kj1Var.c("Apply vpn params " + gn1Var, new Object[0]);
        mn1 c2 = ln1Var.c(fo1Var);
        c2.j(1500);
        c2.c(gn1Var.c());
        c2.c(gn1Var.d());
        List<xm1> e = gn1Var.e();
        for (xm1 xm1Var : e) {
            c2.e(xm1Var.d(), xm1Var.c());
        }
        kj1 kj1Var2 = y;
        kj1Var2.c("Routes added: " + e, new Object[0]);
        c2.a("10.254.0.1", 30);
        c2.i(null);
        return (ParcelFileDescriptor) r81.f(ln1Var.g(c2));
    }

    @Override // com.p7700g.p99005.hn1
    public void A(@x1 fo1 fo1Var, @x1 ln1 ln1Var) throws gc1 {
        this.O = b0(fo1Var, ln1Var);
        this.H.b(this.B, Executors.newSingleThreadScheduledExecutor(), new xa1() { // from class: com.p7700g.p99005.og1
            @Override // com.p7700g.p99005.xa1
            public final void accept(Object obj) {
                xg1.O(xg1.this, ((Integer) obj).intValue());
            }
        });
        J(fo1Var, this.O);
    }

    @Override // com.p7700g.p99005.hn1
    public synchronized void B() {
        this.J.execute(new b());
    }

    @Override // com.p7700g.p99005.hn1
    public void C(@x1 fo1 fo1Var) {
        this.J.execute(new c(fo1Var));
    }

    @Override // com.p7700g.p99005.hn1
    @x1
    public String D() {
        return this.G.k();
    }

    @x1
    public String M() {
        return "hydra";
    }

    @Override // com.p7700g.p99005.hn1
    public void j() {
        this.G.a();
    }

    @Override // com.p7700g.p99005.hn1
    @x1
    public synchronized lm1 l() {
        String d2;
        d2 = this.G.d();
        if (d2 == null) {
            d2 = "";
        }
        kj1 kj1Var = y;
        kj1Var.l("Connection log: " + d2, new Object[0]);
        if (this.I) {
            K(d2);
        }
        return tg1.s().i(L(1)).e(L(2)).f(M()).h(this.K).g(D()).d(d2).a();
    }

    @Override // com.p7700g.p99005.hn1
    public int m(@x1 String str) {
        if (TextUtils.isEmpty(str)) {
            return this.G.h();
        }
        return this.G.i(str);
    }

    @Override // com.p7700g.p99005.hn1
    public int n() {
        return this.G.j();
    }

    @Override // com.p7700g.p99005.hn1
    @x1
    public String o() {
        return "hydra";
    }

    @Override // com.anchorfree.hdr.HydraHeaderListener
    public void onHdr(@x1 String str, @z1 String str2) {
        kj1 kj1Var = y;
        kj1Var.c(wo1.w("Header event: ", str, " <", str2, ">"), new Object[0]);
        char c2 = 65535;
        String[] split = str.split(":", -1);
        String str3 = split[0];
        String str4 = split[1];
        str3.hashCode();
        switch (str3.hashCode()) {
            case 66:
                if (str3.equals(AFHydra.EV_BYTECOUNT)) {
                    c2 = 0;
                    break;
                }
                break;
            case 69:
                if (str3.equals("E")) {
                    c2 = 1;
                    break;
                }
                break;
            case 83:
                if (str3.equals("S")) {
                    c2 = 2;
                    break;
                }
                break;
            case 79561:
                if (str3.equals(AFHydra.EV_PTM)) {
                    c2 = 3;
                    break;
                }
                break;
            case 84294:
                if (str3.equals(AFHydra.EV_URC)) {
                    c2 = 4;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                U(str4);
                return;
            case 1:
                if (str2 == null) {
                    str2 = "";
                }
                a0(str, str2);
                return;
            case 2:
                if (!this.N) {
                    X(str4, str2);
                    return;
                } else {
                    kj1Var.c("Got hydra state with isStopping = true", new Object[0]);
                    return;
                }
            case 3:
                if (str2 == null) {
                    str2 = "";
                }
                W(str4, str2);
                return;
            case 4:
                V(str4, (String) r81.f(str2));
                return;
            default:
                return;
        }
    }

    @Override // com.p7700g.p99005.hn1
    @x1
    public List<ld1> p() {
        return Collections.singletonList(this.E);
    }

    public boolean protect(int i) {
        return this.F.l(i);
    }

    @Override // com.p7700g.p99005.hn1
    public void v(int i, @x1 Bundle bundle) {
        if (i != 1) {
            return;
        }
        AFHydra.NativeCustomCategoryRulesApply(bundle.getStringArray("extra:resources"), ((vg1.d) bundle.getSerializable("extra:type")).ordinal(), ((vg1.c) bundle.getSerializable("extra:op")).ordinal(), bundle.getString("extra:category"));
    }

    @Override // com.p7700g.p99005.hn1
    public void y() {
        this.G.n();
    }

    @Override // com.p7700g.p99005.hn1
    public void z(@x1 String str, @x1 String str2) {
        this.G.p(str, str2);
    }

    public xg1(@x1 Context context, @x1 qg1 qg1Var, @x1 td1 td1Var, @x1 qd1 qd1Var) {
        this(context, qg1Var, td1Var, qd1Var, Executors.newSingleThreadExecutor());
    }

    public void protect(int i, @z1 int[] iArr) {
        if (iArr != null) {
            for (int i2 : iArr) {
                this.F.l(i2);
            }
        }
    }

    public xg1(@x1 Context context, @x1 qg1 qg1Var, @x1 td1 td1Var, @x1 qd1 qd1Var, boolean z2, @x1 Executor executor) {
        this.D = Pattern.compile("\\d+");
        this.H = new tc1(oc1.a);
        this.K = "";
        this.L = new rg1();
        this.M = false;
        this.N = false;
        this.B = context.getApplicationContext();
        this.G = qg1Var;
        this.F = td1Var;
        this.E = qd1Var;
        this.I = z2;
        this.J = executor;
        this.C = context.getCacheDir().getAbsolutePath();
        qg1Var.l(context);
    }
}