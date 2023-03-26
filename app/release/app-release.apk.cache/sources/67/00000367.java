package com.anchorfree.vpnsdk.vpnservice.config;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import com.google.gson.Gson;
import com.p7700g.p99005.kj1;
import com.p7700g.p99005.n81;
import com.p7700g.p99005.o81;
import com.p7700g.p99005.r81;
import com.p7700g.p99005.rp0;
import com.p7700g.p99005.wm1;
import com.p7700g.p99005.wn1;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.yn1;
import com.p7700g.p99005.z1;
import com.p7700g.p99005.zn1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public class VpnConfigProvider extends ContentProvider {
    public static final String s = "com.anchorfree.vpnsdk.vpn_config";
    public static final String t = "com.anchorfree.vpnsdk.action.VPN_CONFIG_CHANGED";
    public static final String u = "vpn_config";
    public static final String v = "VpnConfig.json";
    public static final String w = "get_vpn_config";
    public static final String x = "set_vpn_config";
    public static final String y = "reset_to_default_vpn_config";
    private final kj1 z = kj1.b("VpnConfigProvider");
    private final Gson A = new Gson();

    private void a() {
        Context context = getContext();
        r81.f(context);
        if (wm1.c(context, Binder.getCallingUid())) {
            return;
        }
        StringBuilder G = wo1.G("Permission Denial: opening provider ");
        G.append(getClass().getCanonicalName());
        throw new SecurityException(G.toString());
    }

    @x1
    public static String b(@x1 Context context) {
        return String.format("%s.vpn_config", context.getPackageName());
    }

    @x1
    public static Uri c(@x1 Context context) {
        return new Uri.Builder().scheme("content").authority(b(context)).path(u).build();
    }

    @x1
    public static zn1 d(@x1 Context context) throws IOException {
        return (zn1) new Gson().n(n81.n(context.getResources().openRawResource(wn1.a(context, s, rp0.j.a))), zn1.class);
    }

    @x1
    private Bundle e() throws IOException {
        zn1 zn1Var;
        Bundle bundle = new Bundle();
        try {
            zn1Var = f();
        } catch (IOException e) {
            this.z.f(e);
            zn1Var = null;
        }
        if (zn1Var == null) {
            zn1Var = d((Context) r81.f(getContext()));
        }
        this.z.c("VPN config: %s", zn1Var);
        bundle.putParcelable(u, zn1Var);
        return bundle;
    }

    @z1
    private zn1 f() throws IOException {
        if (new File(((Context) r81.f(getContext())).getFilesDir(), v).exists()) {
            return (zn1) this.A.n(new String(o81.a(((Context) r81.f(getContext())).openFileInput(v)), Charset.forName("UTF-8")), zn1.class);
        }
        return null;
    }

    private void g(@x1 zn1 zn1Var) throws IOException {
        String z = new Gson().z(zn1Var);
        FileOutputStream openFileOutput = ((Context) r81.f(getContext())).openFileOutput(v, 0);
        try {
            openFileOutput.write(z.getBytes(Charset.forName("UTF-8")));
            openFileOutput.close();
            getContext().sendBroadcast(new Intent(yn1.a(getContext())).putExtra(u, zn1Var));
        } catch (Throwable th) {
            if (openFileOutput != null) {
                try {
                    openFileOutput.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
        if (r0 == 1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
        if (r0 == 2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
        return super.call(r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
        ((android.content.Context) com.p7700g.p99005.r81.f(getContext())).deleteFile(com.anchorfree.vpnsdk.vpnservice.config.VpnConfigProvider.v);
        getContext().sendBroadcast(new android.content.Intent(com.p7700g.p99005.yn1.a(getContext())).putExtras(e()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
        r7 = (android.os.Bundle) com.p7700g.p99005.r81.f(r9);
        r7.setClassLoader(com.p7700g.p99005.zn1.class.getClassLoader());
        g((com.p7700g.p99005.zn1) r7.getParcelable(com.anchorfree.vpnsdk.vpnservice.config.VpnConfigProvider.u));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0095, code lost:
        return null;
     */
    @Override // android.content.ContentProvider
    @z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Bundle call(@x1 String str, @z1 String str2, @z1 Bundle bundle) {
        a();
        char c = 65535;
        try {
            int hashCode = str.hashCode();
            if (hashCode != -1703568641) {
                if (hashCode != -1192499990) {
                    if (hashCode == 579236214 && str.equals(w)) {
                        c = 0;
                    }
                } else if (str.equals(x)) {
                    c = 1;
                }
            } else if (str.equals(y)) {
                c = 2;
            }
            return e();
        } catch (Throwable th) {
            throw new RuntimeException(th);
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