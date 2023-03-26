package com.anchorfree.vpnsdk.transporthydra.proxyservice;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import com.anchorfree.hdr.AFHydra;
import com.anchorfree.hdr.HydraHeaderListener;
import com.p7700g.p99005.db1;
import com.p7700g.p99005.ej1;
import com.p7700g.p99005.en1;
import com.p7700g.p99005.kj1;
import com.p7700g.p99005.r81;
import com.p7700g.p99005.uc1;
import com.p7700g.p99005.va1;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.yg1;
import com.p7700g.p99005.z1;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public class HydraProxyService extends Service implements HydraHeaderListener {
    private static final ExecutorService s = Executors.newSingleThreadExecutor();
    private static final Map<String, en1> t;
    private final kj1 u = kj1.b("HydraProxyService");
    private final IBinder v = new c();
    @z1
    private db1 w;
    @z1
    private d x;

    /* loaded from: classes2.dex */
    public class a extends ej1 {
        public final /* synthetic */ String u;
        public final /* synthetic */ String v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(va1 va1Var, String str, String str2) {
            super(va1Var);
            this.u = str;
            this.v = str2;
        }

        @Override // com.p7700g.p99005.ej1
        public void a() {
            HydraProxyService.this.k(this.u, this.v);
        }
    }

    /* loaded from: classes2.dex */
    public class b extends ej1 {
        public b(va1 va1Var) {
            super(va1Var);
        }

        @Override // com.p7700g.p99005.ej1
        public void a() {
            HydraProxyService.this.m();
        }
    }

    /* loaded from: classes2.dex */
    public class c extends Binder {
        public c() {
        }

        @x1
        public HydraProxyService a() {
            return HydraProxyService.this;
        }
    }

    /* loaded from: classes2.dex */
    public interface d {
        void a();
    }

    static {
        HashMap hashMap = new HashMap();
        t = hashMap;
        hashMap.put(AFHydra.STATUS_CONNECTED, en1.CONNECTED);
        hashMap.put(AFHydra.STATUS_CONNECTING, en1.CONNECTING_VPN);
        hashMap.put(AFHydra.STATUS_DISCONNECTING, en1.DISCONNECTING);
        hashMap.put(AFHydra.STATUS_IDLE, en1.IDLE);
    }

    private void c(@x1 String str, @x1 String str2, int i) {
        db1 db1Var = this.w;
        if (db1Var != null) {
            StringBuilder G = wo1.G(str);
            G.append(str2.length() > 0 ? wo1.t(" :: ", str2) : "");
            db1Var.n(new yg1(i, G.toString()));
        }
        n(va1.a);
    }

    private void d(@x1 String str, @x1 String str2) {
        c(str, str2, 42);
    }

    private void e(@x1 String str) {
        en1 f = f(str);
        db1 db1Var = this.w;
        if (db1Var != null) {
            db1Var.m((en1) r81.f(f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(String str, String str2) {
        this.u.c("Starting hydra proxy service", new Object[0]);
        db1 db1Var = this.w;
        if (db1Var != null) {
            db1Var.m(en1.CONNECTING_VPN);
        }
        AFHydra.NativeNW(new uc1(getApplicationContext()).c(null));
        AFHydra.NativeA(this, str, true, false, false, getApplicationContext().getCacheDir().getAbsolutePath(), str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        AFHydra.NativeB();
    }

    @z1
    public en1 f(@x1 String str) {
        return t.get(str);
    }

    public void g(int i, @x1 int[] iArr) {
        kj1 kj1Var = this.u;
        StringBuilder H = wo1.H("Dummy protect for type: ", i, " sockets: ");
        H.append(Arrays.toString(iArr));
        kj1Var.c(H.toString(), new Object[0]);
    }

    public boolean h(int i) {
        this.u.c(wo1.l("Dummy protect for socket: ", i), new Object[0]);
        return true;
    }

    public void i(@x1 d dVar) {
        this.x = dVar;
    }

    public void j(@z1 db1 db1Var) {
        this.w = db1Var;
    }

    public void l(@x1 String str, @x1 String str2, @x1 va1 va1Var) {
        s.execute(new a(va1Var, str, str2));
    }

    public void n(@x1 va1 va1Var) {
        s.execute(new b(va1Var));
    }

    @Override // android.app.Service
    @z1
    public IBinder onBind(@x1 Intent intent) {
        return this.v;
    }

    @Override // android.app.Service
    public void onDestroy() {
        d dVar = this.x;
        if (dVar != null) {
            dVar.a();
        }
        super.onDestroy();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
        if (r1.equals("S") != false) goto L12;
     */
    @Override // com.anchorfree.hdr.HydraHeaderListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onHdr(@x1 String str, @z1 String str2) {
        char c2 = 0;
        this.u.c(wo1.w("Header event: ", str, " <", str2, ">"), new Object[0]);
        String[] split = str.split(":");
        String str3 = split[0];
        String str4 = split[1];
        int hashCode = str3.hashCode();
        if (hashCode == 66) {
            if (str3.equals(AFHydra.EV_BYTECOUNT)) {
                c2 = 3;
            }
            c2 = 65535;
        } else if (hashCode == 69) {
            if (str3.equals("E")) {
                c2 = 1;
            }
            c2 = 65535;
        } else if (hashCode != 83) {
            if (hashCode == 79561 && str3.equals(AFHydra.EV_PTM)) {
                c2 = 2;
            }
            c2 = 65535;
        }
        if (c2 == 0) {
            e(str4);
        } else if (c2 != 1) {
        } else {
            if (str2 == null) {
                str2 = "";
            }
            d(str, str2);
        }
    }
}