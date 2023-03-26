package com.p7700g.p99005;

import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.onesignal.OSNotificationWorkManager;
import com.p7700g.p99005.qm3;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: OSNotificationDataController.java */
/* loaded from: classes3.dex */
public class yk3 extends qj3 {
    private static final long a = 604800;
    private static final String b = "OS_NOTIFICATIONS_THREAD";
    private final rm3 c;
    private final tk3 d;

    /* compiled from: OSNotificationDataController.java */
    /* loaded from: classes3.dex */
    public class a extends ji3 {
        public a() {
        }

        @Override // com.p7700g.p99005.ji3, java.lang.Runnable
        public void run() {
            super.run();
            yk3.this.c.f(qm3.b.a, "created_time < ?", new String[]{String.valueOf((jm3.X0().b() / 1000) - yk3.a)});
        }
    }

    /* compiled from: OSNotificationDataController.java */
    /* loaded from: classes3.dex */
    public class b extends ji3 {
        public final /* synthetic */ WeakReference s;

        public b(WeakReference weakReference) {
            this.s = weakReference;
        }

        @Override // com.p7700g.p99005.ji3, java.lang.Runnable
        public void run() {
            super.run();
            Context context = (Context) this.s.get();
            if (context == null) {
                return;
            }
            NotificationManager i = um3.i(context);
            Cursor d = yk3.this.c.d(qm3.b.a, new String[]{qm3.b.c}, "dismissed = 0 AND opened = 0", null, null, null, null);
            if (d.moveToFirst()) {
                do {
                    i.cancel(d.getInt(d.getColumnIndex(qm3.b.c)));
                } while (d.moveToNext());
                ContentValues contentValues = new ContentValues();
                contentValues.put(qm3.b.h, (Integer) 1);
                yk3.this.c.a(qm3.b.a, contentValues, "opened = 0", null);
                ki3.d(0, context);
                d.close();
            }
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put(qm3.b.h, (Integer) 1);
            yk3.this.c.a(qm3.b.a, contentValues2, "opened = 0", null);
            ki3.d(0, context);
            d.close();
        }
    }

    /* compiled from: OSNotificationDataController.java */
    /* loaded from: classes3.dex */
    public class c extends ji3 {
        public final /* synthetic */ WeakReference s;
        public final /* synthetic */ String t;

        public c(WeakReference weakReference, String str) {
            this.s = weakReference;
            this.t = str;
        }

        @Override // com.p7700g.p99005.ji3, java.lang.Runnable
        public void run() {
            super.run();
            Context context = (Context) this.s.get();
            if (context == null) {
                return;
            }
            NotificationManager i = um3.i(context);
            String[] strArr = {qm3.b.c};
            String[] strArr2 = {this.t};
            Cursor d = yk3.this.c.d(qm3.b.a, strArr, "group_id = ? AND dismissed = 0 AND opened = 0", strArr2, null, null, null);
            while (d.moveToNext()) {
                int i2 = d.getInt(d.getColumnIndex(qm3.b.c));
                if (i2 != -1) {
                    i.cancel(i2);
                }
            }
            d.close();
            ContentValues contentValues = new ContentValues();
            contentValues.put(qm3.b.h, (Integer) 1);
            yk3.this.c.a(qm3.b.a, contentValues, "group_id = ? AND opened = 0 AND dismissed = 0", strArr2);
            ki3.c(yk3.this.c, context);
        }
    }

    /* compiled from: OSNotificationDataController.java */
    /* loaded from: classes3.dex */
    public class d extends ji3 {
        public final /* synthetic */ WeakReference s;
        public final /* synthetic */ int t;

        public d(WeakReference weakReference, int i) {
            this.s = weakReference;
            this.t = i;
        }

        @Override // com.p7700g.p99005.ji3, java.lang.Runnable
        public void run() {
            super.run();
            Context context = (Context) this.s.get();
            if (context == null) {
                return;
            }
            StringBuilder G = wo1.G("android_notification_id = ");
            G.append(this.t);
            G.append(" AND ");
            G.append(qm3.b.g);
            G.append(" = 0 AND ");
            String C = wo1.C(G, qm3.b.h, " = 0");
            ContentValues contentValues = new ContentValues();
            contentValues.put(qm3.b.h, (Integer) 1);
            if (yk3.this.c.a(qm3.b.a, contentValues, C, null) > 0) {
                pj3.e(context, yk3.this.c, this.t);
            }
            ki3.c(yk3.this.c, context);
            um3.i(context).cancel(this.t);
        }
    }

    /* compiled from: OSNotificationDataController.java */
    /* loaded from: classes3.dex */
    public class e extends ji3 {
        public final /* synthetic */ String s;
        public final /* synthetic */ f t;

        public e(String str, f fVar) {
            this.s = str;
            this.t = fVar;
        }

        @Override // com.p7700g.p99005.ji3, java.lang.Runnable
        public void run() {
            super.run();
            boolean z = true;
            Cursor d = yk3.this.c.d(qm3.b.a, new String[]{"notification_id"}, "notification_id = ?", new String[]{this.s}, null, null, null);
            boolean moveToFirst = d.moveToFirst();
            d.close();
            if (moveToFirst) {
                tk3 tk3Var = yk3.this.d;
                StringBuilder G = wo1.G("Notification notValidOrDuplicated with id duplicated, duplicate FCM message received, skip processing of ");
                G.append(this.s);
                tk3Var.b(G.toString());
            } else {
                z = false;
            }
            this.t.a(z);
        }
    }

    /* compiled from: OSNotificationDataController.java */
    /* loaded from: classes3.dex */
    public interface f {
        void a(boolean z);
    }

    public yk3(rm3 rm3Var, tk3 tk3Var) {
        this.c = rm3Var;
        this.d = tk3Var;
    }

    private void g() {
        d(new a(), b);
    }

    private void j(String str, @x1 f fVar) {
        if (str != null && !"".equals(str)) {
            if (!OSNotificationWorkManager.a(str)) {
                this.d.b("Notification notValidOrDuplicated with id duplicated");
                fVar.a(true);
                return;
            }
            d(new e(str, fVar), b);
            return;
        }
        fVar.a(false);
    }

    public void h() {
        g();
    }

    public void i(WeakReference<Context> weakReference) {
        d(new b(weakReference), b);
    }

    public void k(@z1 JSONObject jSONObject, @x1 f fVar) {
        String b2 = zk3.b(jSONObject);
        if (b2 == null) {
            this.d.b("Notification notValidOrDuplicated with id null");
            fVar.a(true);
            return;
        }
        j(b2, fVar);
    }

    public void l(String str, WeakReference<Context> weakReference) {
        d(new c(weakReference, str), b);
    }

    public void m(int i, WeakReference<Context> weakReference) {
        d(new d(weakReference, i), b);
    }
}