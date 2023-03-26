package com.anchorfree.vpnsdk.vpnservice;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.VpnService;
import android.os.Bundle;
import com.p7700g.p99005.dq0;
import com.p7700g.p99005.eq0;
import com.p7700g.p99005.gc1;
import com.p7700g.p99005.hc1;
import com.p7700g.p99005.wp0;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.yl1;
import com.p7700g.p99005.z1;
import java.util.UUID;

/* loaded from: classes2.dex */
public class StartVPNServiceShadowActivity extends Activity {
    public static final int s = 256;
    @x1
    public static final String t = "extra:stop";
    @x1
    public static final String u = "extra:key";
    @z1
    private static eq0<Void> v = null;
    @z1
    private static wp0 w = null;
    @x1
    private static String x = "";

    private boolean a() {
        if (d()) {
            eq0<Void> eq0Var = v;
            if (eq0Var != null) {
                eq0Var.b();
                v = null;
            }
            finish();
            return true;
        }
        return false;
    }

    @x1
    private static gc1 b() {
        return new hc1();
    }

    private void c() {
        if (a()) {
            return;
        }
        if (v == null) {
            finish();
            return;
        }
        Intent prepare = VpnService.prepare(this);
        if (prepare == null) {
            onActivityResult(0, -1, null);
        } else if (getIntent().hasExtra(t)) {
            finish();
        } else {
            try {
                prepare.addFlags(1073741824);
                startActivityForResult(prepare, 256);
            } catch (Throwable unused) {
                onActivityResult(256, 0, null);
            }
        }
    }

    private boolean d() {
        wp0 wp0Var = w;
        return wp0Var == null || wp0Var.a();
    }

    public static /* synthetic */ Void e() throws Exception {
        return null;
    }

    @x1
    public static dq0<Void> f(@x1 Context context, @x1 wp0 wp0Var) {
        try {
            if (VpnService.prepare(context) == null) {
                return dq0.c(yl1.a);
            }
            x = UUID.randomUUID().toString();
            Intent putExtra = new Intent(context, StartVPNServiceShadowActivity.class).addFlags(268435456).putExtra(u, x);
            eq0<Void> eq0Var = v;
            if (eq0Var != null) {
                eq0Var.c(b());
            }
            v = new eq0<>();
            w = wp0Var;
            context.startActivity(putExtra);
            return v.a();
        } catch (Throwable th) {
            return dq0.C(gc1.unexpected(th));
        }
    }

    public static void g(@x1 Context context) {
        context.startActivity(new Intent(context, StartVPNServiceShadowActivity.class).addFlags(268435456).putExtra(t, true));
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, @z1 Intent intent) {
        if (a()) {
            return;
        }
        eq0<Void> eq0Var = v;
        if (eq0Var != null) {
            if (i2 == -1) {
                eq0Var.d(null);
            } else {
                eq0Var.c(b());
            }
            v = null;
            w = null;
        }
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(@z1 Bundle bundle) {
        super.onCreate(bundle);
        c();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Intent intent = getIntent();
        if (v == null || intent == null || !x.equals(intent.getStringExtra(u))) {
            return;
        }
        v.c(b());
        v = null;
    }

    @Override // android.app.Activity
    public void onNewIntent(@z1 Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        c();
    }
}