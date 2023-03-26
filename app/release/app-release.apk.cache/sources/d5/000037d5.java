package com.onesignal;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.p7700g.p99005.ib0;
import com.p7700g.p99005.im3;
import com.p7700g.p99005.jm3;
import com.p7700g.p99005.kb0;
import com.p7700g.p99005.ml3;
import com.p7700g.p99005.nb0;
import com.p7700g.p99005.nl3;
import com.p7700g.p99005.ub0;
import com.p7700g.p99005.vb0;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.xm3;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class OSReceiveReceiptController {
    private static final String a = "os_notification_id";
    private static OSReceiveReceiptController b;
    private int c = 0;
    private int d = 25;
    private final nl3 e = jm3.H0();

    /* loaded from: classes3.dex */
    public static class ReceiveReceiptWorker extends Worker {

        /* loaded from: classes3.dex */
        public class a extends xm3.g {
            public final /* synthetic */ String a;

            public a(String str) {
                this.a = str;
            }

            @Override // com.p7700g.p99005.xm3.g
            public void a(int i, String str, Throwable th) {
                jm3.u0 u0Var = jm3.u0.ERROR;
                jm3.a(u0Var, "Receive receipt failed with statusCode: " + i + " response: " + str);
            }

            @Override // com.p7700g.p99005.xm3.g
            public void b(String str) {
                jm3.u0 u0Var = jm3.u0.DEBUG;
                StringBuilder G = wo1.G("Receive receipt sent for notificationID: ");
                G.append(this.a);
                jm3.a(u0Var, G.toString());
            }
        }

        public ReceiveReceiptWorker(@x1 Context context, @x1 WorkerParameters workerParameters) {
            super(context, workerParameters);
        }

        public void a(@x1 String str) {
            String str2 = jm3.i;
            String M0 = (str2 == null || str2.isEmpty()) ? jm3.M0() : jm3.i;
            String c1 = jm3.c1();
            Integer num = null;
            ml3 ml3Var = new ml3();
            try {
                num = Integer.valueOf(new OSUtils().f());
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
            Integer num2 = num;
            jm3.u0 u0Var = jm3.u0.DEBUG;
            jm3.a(u0Var, "ReceiveReceiptWorker: Device Type is: " + num2);
            ml3Var.a(M0, c1, num2, str, new a(str));
        }

        @Override // androidx.work.Worker
        @x1
        public ListenableWorker.a doWork() {
            a(getInputData().A(OSReceiveReceiptController.a));
            return ListenableWorker.a.e();
        }
    }

    private OSReceiveReceiptController() {
    }

    public static synchronized OSReceiveReceiptController c() {
        OSReceiveReceiptController oSReceiveReceiptController;
        synchronized (OSReceiveReceiptController.class) {
            if (b == null) {
                b = new OSReceiveReceiptController();
            }
            oSReceiveReceiptController = b;
        }
        return oSReceiveReceiptController;
    }

    public void a(Context context, String str) {
        if (!this.e.m()) {
            jm3.a(jm3.u0.DEBUG, "sendReceiveReceipt disabled");
            return;
        }
        int k = OSUtils.k(this.c, this.d);
        kb0 a2 = new kb0.a().q(a, str).a();
        ib0 b2 = b();
        jm3.u0 u0Var = jm3.u0.DEBUG;
        jm3.a(u0Var, "OSReceiveReceiptController enqueueing send receive receipt work with notificationId: " + str + " and delay: " + k + " seconds");
        im3.a(context).m(wo1.t(str, "_receive_receipt"), nb0.KEEP, new vb0.a(ReceiveReceiptWorker.class).i(b2).k((long) k, TimeUnit.SECONDS).o(a2).b());
    }

    public ib0 b() {
        return new ib0.a().c(ub0.CONNECTED).b();
    }
}