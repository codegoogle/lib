package com.p7700g.p99005;

import android.content.Context;
import com.onesignal.OSUtils;
import com.p7700g.p99005.jm3;
import org.json.JSONObject;

/* compiled from: OSNotificationController.java */
/* loaded from: classes3.dex */
public class xk3 {
    private static final String a = "com.onesignal.NotificationServiceExtension";
    public static final String b = "google.sent_time";
    public static final String c = "google.ttl";
    private final al3 d;
    private boolean e;
    private boolean f;

    public xk3(al3 al3Var, boolean z, boolean z2) {
        this.e = z;
        this.f = z2;
        this.d = al3Var;
    }

    private al3 a(Context context, vk3 vk3Var, JSONObject jSONObject, Long l) {
        al3 al3Var = new al3(context);
        al3Var.u(jSONObject);
        al3Var.D(l);
        al3Var.C(this.e);
        al3Var.v(vk3Var);
        return al3Var;
    }

    private void g(vk3 vk3Var) {
        this.d.v(vk3Var);
        if (this.e) {
            ij3.e(this.d);
            return;
        }
        this.d.t(false);
        ij3.n(this.d, true, false);
        jm3.j1(this.d);
    }

    public static void k(Context context) {
        String g = OSUtils.g(context, a);
        if (g == null) {
            jm3.P1(jm3.u0.VERBOSE, "No class found, not setting up OSRemoteNotificationReceivedHandler");
            return;
        }
        jm3.u0 u0Var = jm3.u0.VERBOSE;
        jm3.P1(u0Var, "Found class: " + g + ", attempting to call constructor");
        try {
            Object newInstance = Class.forName(g).newInstance();
            if ((newInstance instanceof jm3.d1) && jm3.r == null) {
                jm3.f3((jm3.d1) newInstance);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        } catch (InstantiationException e3) {
            e3.printStackTrace();
        }
    }

    public al3 b() {
        return this.d;
    }

    public fl3 c() {
        return new fl3(this, this.d.g());
    }

    public boolean d() {
        return this.f;
    }

    public boolean e() {
        if (jm3.H0().o()) {
            return this.d.g().w() + ((long) this.d.g().D()) > jm3.X0().b() / 1000;
        }
        return true;
    }

    public boolean f() {
        return this.e;
    }

    public void h(vk3 vk3Var, @z1 vk3 vk3Var2) {
        if (vk3Var2 != null) {
            boolean J = OSUtils.J(vk3Var2.i());
            boolean e = e();
            if (J && e) {
                this.d.v(vk3Var2);
                ij3.k(this, this.f);
            } else {
                g(vk3Var);
            }
            if (this.e) {
                OSUtils.Y(100);
                return;
            }
            return;
        }
        g(vk3Var);
    }

    public void i(boolean z) {
        this.f = z;
    }

    public void j(boolean z) {
        this.e = z;
    }

    public String toString() {
        StringBuilder G = wo1.G("OSNotificationController{notificationJob=");
        G.append(this.d);
        G.append(", isRestoring=");
        G.append(this.e);
        G.append(", isBackgroundLogic=");
        G.append(this.f);
        G.append('}');
        return G.toString();
    }

    public xk3(Context context, vk3 vk3Var, JSONObject jSONObject, boolean z, boolean z2, Long l) {
        this.e = z;
        this.f = z2;
        this.d = a(context, vk3Var, jSONObject, l);
    }
}