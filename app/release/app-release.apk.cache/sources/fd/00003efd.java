package com.p7700g.p99005;

import android.content.Context;
import com.onesignal.OSUtils;
import com.p7700g.p99005.bn3;
import com.p7700g.p99005.jm3;
import java.io.IOException;

/* compiled from: PushRegistratorAbstractGoogle.java */
/* loaded from: classes3.dex */
public abstract class dn3 implements bn3 {
    private static int a = 5;
    private static int b = 10000;
    private bn3.a c;
    private Thread d;
    private boolean e;

    /* compiled from: PushRegistratorAbstractGoogle.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public final /* synthetic */ String s;

        public a(String str) {
            this.s = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 0;
            while (i < dn3.a && !dn3.this.e(this.s, i)) {
                i++;
                OSUtils.Y(dn3.b * i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(String str, int i) {
        try {
            String g = g(str);
            jm3.u0 u0Var = jm3.u0.INFO;
            jm3.a(u0Var, "Device registered, push token = " + g);
            this.c.a(g, 1);
            return true;
        } catch (IOException e) {
            int j = j(e);
            String m = OSUtils.m(e);
            if ("SERVICE_NOT_AVAILABLE".equals(m) || "AUTHENTICATION_FAILED".equals(m)) {
                Exception exc = new Exception(e);
                if (i >= a - 1) {
                    jm3.u0 u0Var2 = jm3.u0.ERROR;
                    StringBuilder G = wo1.G("Retry count of ");
                    G.append(a);
                    G.append(" exceed! Could not get a ");
                    G.append(f());
                    G.append(" Token.");
                    jm3.b(u0Var2, G.toString(), exc);
                } else {
                    jm3.u0 u0Var3 = jm3.u0.INFO;
                    jm3.b(u0Var3, "'Google Play services' returned " + m + " error. Current retry count: " + i, exc);
                    if (i == 2) {
                        this.c.a(null, j);
                        this.e = true;
                        return true;
                    }
                }
                return false;
            }
            Exception exc2 = new Exception(e);
            jm3.u0 u0Var4 = jm3.u0.ERROR;
            StringBuilder G2 = wo1.G("Error Getting ");
            G2.append(f());
            G2.append(" Token");
            jm3.b(u0Var4, G2.toString(), exc2);
            if (!this.e) {
                this.c.a(null, j);
            }
            return true;
        } catch (Throwable th) {
            Exception exc3 = new Exception(th);
            int j2 = j(th);
            jm3.u0 u0Var5 = jm3.u0.ERROR;
            StringBuilder G3 = wo1.G("Unknown error getting ");
            G3.append(f());
            G3.append(" Token");
            jm3.b(u0Var5, G3.toString(), exc3);
            this.c.a(null, j2);
            return true;
        }
    }

    private void h(String str) {
        try {
            if (OSUtils.E()) {
                k(str);
            } else {
                yi3.d();
                jm3.a(jm3.u0.ERROR, "'Google Play services' app not installed or disabled on the device.");
                this.c.a(null, -7);
            }
        } catch (Throwable th) {
            jm3.u0 u0Var = jm3.u0.ERROR;
            StringBuilder G = wo1.G("Could not register with ");
            G.append(f());
            G.append(" due to an issue with your AndroidManifest.xml or with 'Google Play services'.");
            jm3.b(u0Var, G.toString(), th);
            this.c.a(null, -8);
        }
    }

    private boolean i(String str, bn3.a aVar) {
        boolean z;
        try {
            Float.parseFloat(str);
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        if (z) {
            return true;
        }
        jm3.a(jm3.u0.ERROR, "Missing Google Project number!\nPlease enter a Google Project number / Sender ID on under App Settings > Android > Configuration on the OneSignal dashboard.");
        aVar.a(null, -6);
        return false;
    }

    private static int j(Throwable th) {
        String m = OSUtils.m(th);
        if (th instanceof IOException) {
            if ("SERVICE_NOT_AVAILABLE".equals(m)) {
                return -9;
            }
            return "AUTHENTICATION_FAILED".equals(m) ? -29 : -11;
        }
        return -12;
    }

    private synchronized void k(String str) {
        Thread thread = this.d;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new a(str));
            this.d = thread2;
            thread2.start();
        }
    }

    @Override // com.p7700g.p99005.bn3
    public void a(Context context, String str, bn3.a aVar) {
        this.c = aVar;
        if (i(str, aVar)) {
            h(str);
        }
    }

    public abstract String f();

    public abstract String g(String str) throws Throwable;
}