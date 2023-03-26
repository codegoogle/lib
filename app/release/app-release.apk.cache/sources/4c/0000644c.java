package com.p7700g.p99005;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.p7700g.p99005.kg;
import com.p7700g.p99005.xq2;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
/* loaded from: classes3.dex */
public class wt2 {
    private final pn2 a;
    private final bu2 b;
    private final Rpc c;
    private final er2<kv2> d;
    private final er2<xq2> e;
    private final pr2 f;

    @r2
    public wt2(pn2 pn2Var, bu2 bu2Var, Rpc rpc, er2<kv2> er2Var, er2<xq2> er2Var2, pr2 pr2Var) {
        this.a = pn2Var;
        this.b = bu2Var;
        this.c = rpc;
        this.d = er2Var;
        this.e = er2Var2;
        this.f = pr2Var;
    }

    public wt2(pn2 pn2Var, bu2 bu2Var, er2<kv2> er2Var, er2<xq2> er2Var2, pr2 pr2Var) {
        this(pn2Var, bu2Var, new Rpc(pn2Var.l()), er2Var, er2Var2, pr2Var);
    }

    private static String a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private Task<String> c(Task<Bundle> task) {
        return task.continueWith(ut2.s, new Continuation(this) { // from class: com.p7700g.p99005.vt2
            private final wt2 a;

            {
                this.a = this;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public Object then(Task task2) {
                return this.a.h(task2);
            }
        });
    }

    private String d() {
        try {
            return a(MessageDigest.getInstance("SHA-1").digest(this.a.p().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    @o0
    private String f(Bundle bundle) throws IOException {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            }
            if (string3 != null) {
                throw new IOException(string3);
            }
            String.valueOf(bundle).length();
            new Throwable();
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    public static boolean g(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    private Bundle i(String str, String str2, String str3, Bundle bundle) {
        xq2.a b;
        bundle.putString("scope", str3);
        bundle.putString(kg.m.a.c, str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.a.q().j());
        bundle.putString("gmsv", Integer.toString(this.b.d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.b.a());
        bundle.putString("app_ver_name", this.b.b());
        bundle.putString("firebase-app-name-hash", d());
        try {
            String b2 = ((tr2) Tasks.await(this.f.b(false))).b();
            if (!TextUtils.isEmpty(b2)) {
                bundle.putString("Goog-Firebase-Installations-Auth", b2);
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        bundle.putString("cliv", "fcm-22.0.0");
        xq2 xq2Var = this.e.get();
        kv2 kv2Var = this.d.get();
        if (xq2Var != null && kv2Var != null && (b = xq2Var.b("fire-iid")) != xq2.a.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(b.f()));
            bundle.putString("Firebase-Client", kv2Var.a());
        }
        return bundle;
    }

    private Task<Bundle> j(String str, String str2, String str3, Bundle bundle) {
        i(str, str2, str3, bundle);
        return this.c.send(bundle);
    }

    public Task<?> b(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(com.anythink.expressad.d.a.b.az, "1");
        return c(j(str, bu2.c(this.a), tm4.g, bundle));
    }

    public Task<String> e(String str) {
        return c(j(str, bu2.c(this.a), tm4.g, new Bundle()));
    }

    public final /* synthetic */ String h(Task task) throws Exception {
        return f((Bundle) task.getResult(IOException.class));
    }

    public Task<?> k(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        String valueOf2 = String.valueOf(str3);
        return c(j(str, str2, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle));
    }

    public Task<?> l(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        bundle.putString(com.anythink.expressad.d.a.b.az, "1");
        String valueOf2 = String.valueOf(str3);
        return c(j(str, str2, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle));
    }
}