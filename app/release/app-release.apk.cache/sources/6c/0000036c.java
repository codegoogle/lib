package com.anchorfree.vpnsdk.vpnservice.credentials;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import com.anchorfree.vpnsdk.vpnservice.credentials.CredentialsContentProvider;
import com.p7700g.p99005.dq0;
import com.p7700g.p99005.eq0;
import com.p7700g.p99005.gc1;
import com.p7700g.p99005.go1;
import com.p7700g.p99005.ho1;
import com.p7700g.p99005.kj1;
import com.p7700g.p99005.r81;
import com.p7700g.p99005.ti1;
import com.p7700g.p99005.ua1;
import com.p7700g.p99005.ve1;
import com.p7700g.p99005.wm1;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.wp0;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.yp0;
import com.p7700g.p99005.z1;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class CredentialsContentProvider extends ContentProvider {
    @x1
    public static final String A = "start_params";
    @x1
    public static final String B = "connectionAttemptId";
    @x1
    public static final String C = "extra_fast_start";
    @x1
    public static final String D = "is_kill_switch_activated";
    @x1
    public static final String E = "response";
    @x1
    public static final String F = "exception";
    @x1
    public static final String G = "diagnostics";
    @z1
    private static volatile ho1 H = null;
    @x1
    private static final kj1 s = kj1.b("CredentialsContentProvider");
    @x1
    public static final String t = "cancel_credentials";
    @x1
    public static final String u = "load_credentials";
    @x1
    public static final String v = "get_credentials";
    @x1
    public static final String w = "preload_credentials";
    @x1
    public static final String x = "store_start_params";
    @x1
    public static final String y = "load_start_params";
    @x1
    public static final String z = "virtualLocation";
    @z1
    private yp0 I;

    /* loaded from: classes2.dex */
    public class a implements ua1<go1> {
        public final /* synthetic */ eq0 b;

        public a(eq0 eq0Var) {
            CredentialsContentProvider.this = r1;
            this.b = eq0Var;
        }

        @Override // com.p7700g.p99005.ua1
        public void a(@x1 gc1 gc1Var) {
            this.b.f(gc1Var);
        }

        @Override // com.p7700g.p99005.ua1
        /* renamed from: c */
        public void b(@x1 go1 go1Var) {
            this.b.g(go1Var);
        }
    }

    private void a() {
        Context context = getContext();
        r81.f(context);
        if (wm1.c(context, Binder.getCallingUid())) {
            return;
        }
        StringBuilder G2 = wo1.G("Permission Denial: opening provider ");
        G2.append(getClass().getCanonicalName());
        throw new SecurityException(G2.toString());
    }

    @x1
    private static ho1 b(@z1 ho1 ho1Var) {
        if (ho1Var != null) {
            return ho1Var;
        }
        throw new IllegalStateException("Credentials source was not initiated. Call CredentialsContentProvider.setCredentialsSource(@NonNull final CredentialsSource credentialsSource) before using VPN service");
    }

    @x1
    private static String c(@x1 Context context) {
        try {
            return context.getPackageManager().getProviderInfo(new ComponentName(context, CredentialsContentProvider.class.getName()), 0).authority;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @x1
    public static Uri d(@x1 Context context) {
        return new Uri.Builder().scheme("content").authority(c(context)).path("credentials").build();
    }

    @x1
    private Bundle e(@x1 Bundle bundle) throws Exception {
        String string = bundle.getString(z);
        ti1 ti1Var = (ti1) bundle.getParcelable(B);
        o(string, ti1Var);
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("response", f().get(string, ti1Var, bundle));
        return bundle2;
    }

    @x1
    public static ho1 f() {
        if (H == null) {
            synchronized (CredentialsContentProvider.class) {
                if (H == null) {
                    try {
                        CredentialsContentProvider.class.wait(TimeUnit.SECONDS.toMillis(5L));
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
        return b(H);
    }

    public static /* synthetic */ void g(eq0 eq0Var) {
        s.c("Cancelled loading credentials", new Object[0]);
        eq0Var.e();
    }

    @x1
    private eq0<go1> h(@x1 String str, @x1 ti1 ti1Var, @x1 Bundle bundle, @x1 wp0 wp0Var) {
        final eq0<go1> eq0Var = new eq0<>();
        wp0Var.b(new Runnable() { // from class: com.p7700g.p99005.ao1
            @Override // java.lang.Runnable
            public final void run() {
                CredentialsContentProvider.g(eq0.this);
            }
        });
        f().load(str, ti1Var, bundle, new a(eq0Var));
        return eq0Var;
    }

    @x1
    private Bundle i(@x1 Bundle bundle) throws Exception {
        yp0 yp0Var = new yp0();
        m(yp0Var);
        String string = bundle.getString(z);
        ti1 ti1Var = (ti1) bundle.getParcelable(B);
        o(string, ti1Var);
        dq0<go1> a2 = h(string, ti1Var, bundle, yp0Var.j()).a();
        a2.Y();
        if (a2.J()) {
            Exception E2 = a2.E();
            if (E2 == null) {
                throw new NullPointerException();
            }
            throw E2;
        } else if (!a2.H()) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("response", a2.F());
            return bundle2;
        } else {
            throw gc1.vpnConnectCanceled();
        }
    }

    @x1
    private Bundle j() {
        ve1 loadStartParams = f().loadStartParams();
        Bundle bundle = new Bundle();
        bundle.putParcelable("response", loadStartParams);
        return bundle;
    }

    private void k(@x1 Bundle bundle) {
        r81.f(bundle);
        f().preloadCredentials(bundle.getString(z), bundle);
    }

    public static void l(@x1 ho1 ho1Var) {
        synchronized (CredentialsContentProvider.class) {
            H = ho1Var;
            CredentialsContentProvider.class.notifyAll();
        }
    }

    private synchronized void m(@z1 yp0 yp0Var) {
        yp0 yp0Var2 = this.I;
        if (yp0Var2 == yp0Var) {
            s.c("loadCredsTokenSource equal new. skip set", new Object[0]);
            return;
        }
        if (yp0Var2 != null) {
            s.c("cancel loadCredsTokenSource", new Object[0]);
            this.I.d();
        }
        s.c("loadCredsTokenSource set to new %s", this.I);
        this.I = yp0Var;
    }

    private void n(@x1 Bundle bundle) {
        f().storeStartParams((ve1) bundle.getParcelable(A));
    }

    private void o(@z1 String str, @z1 ti1 ti1Var) {
        if (str == null) {
            throw new IllegalArgumentException("virtualLocation is null");
        }
        if (ti1Var == null) {
            throw new IllegalArgumentException("connectionAttemptId is null");
        }
    }

    @Override // android.content.ContentProvider
    @z1
    public Bundle call(@x1 String str, @z1 String str2, @z1 Bundle bundle) {
        a();
        try {
            Bundle bundle2 = (Bundle) r81.f(bundle);
            bundle2.setClassLoader(CredentialsContentProvider.class.getClassLoader());
            char c = 65535;
            switch (str.hashCode()) {
                case -1708315972:
                    if (str.equals(y)) {
                        c = 5;
                        break;
                    }
                    break;
                case -871752413:
                    if (str.equals(u)) {
                        c = 1;
                        break;
                    }
                    break;
                case -381957961:
                    if (str.equals(t)) {
                        c = 0;
                        break;
                    }
                    break;
                case 579873222:
                    if (str.equals(w)) {
                        c = 3;
                        break;
                    }
                    break;
                case 1129103251:
                    if (str.equals(v)) {
                        c = 2;
                        break;
                    }
                    break;
                case 1182041761:
                    if (str.equals(x)) {
                        c = 4;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                m(null);
                return null;
            } else if (c != 1) {
                if (c != 2) {
                    if (c == 3) {
                        k(bundle2);
                        return null;
                    } else if (c == 4) {
                        n(bundle2);
                        return null;
                    } else if (c != 5) {
                        return super.call(str, str2, bundle2);
                    } else {
                        return j();
                    }
                }
                return e(bundle2);
            } else {
                return i(bundle2);
            }
        } catch (Throwable th) {
            Bundle bundle3 = new Bundle();
            bundle3.putSerializable("exception", th);
            return bundle3;
        }
    }

    @Override // android.content.ContentProvider
    public int delete(@x1 Uri uri, @z1 String str, @z1 String[] strArr) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    @z1
    public String getType(@x1 Uri uri) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    @z1
    public Uri insert(@x1 Uri uri, @z1 ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @z1
    public Cursor query(@x1 Uri uri, @z1 String[] strArr, @z1 String str, @z1 String[] strArr2, @z1 String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public int update(@x1 Uri uri, @z1 ContentValues contentValues, @z1 String str, @z1 String[] strArr) {
        throw new UnsupportedOperationException();
    }
}