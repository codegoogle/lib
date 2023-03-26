package com.p7700g.p99005;

import android.content.ContentValues;
import android.database.Cursor;
import com.onesignal.OSUtils;
import com.p7700g.p99005.jm3;
import com.p7700g.p99005.qm3;
import com.p7700g.p99005.xm3;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSInAppMessageRepository.java */
/* loaded from: classes3.dex */
public class qk3 {
    public static final String a = "retry";
    public static final long b = 15552000;
    private final rm3 c;
    private final tk3 d;
    private final sl3 e;
    private int f = 0;

    /* compiled from: OSInAppMessageRepository.java */
    /* loaded from: classes3.dex */
    public class a extends JSONObject {
        public final /* synthetic */ String a;
        public final /* synthetic */ int b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ boolean f;

        public a(String str, int i, String str2, String str3, String str4, boolean z) throws JSONException {
            this.a = str;
            this.b = i;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = z;
            put("app_id", str);
            put("device_type", i);
            put("player_id", str2);
            put("click_id", str3);
            put("variant_id", str4);
            if (z) {
                put("first_click", true);
            }
        }
    }

    /* compiled from: OSInAppMessageRepository.java */
    /* loaded from: classes3.dex */
    public class b extends xm3.g {
        public final /* synthetic */ Set a;
        public final /* synthetic */ i b;

        public b(Set set, i iVar) {
            this.a = set;
            this.b = iVar;
        }

        @Override // com.p7700g.p99005.xm3.g
        public void a(int i, String str, Throwable th) {
            qk3.this.u("engagement", i, str);
            this.b.onFailure(str);
        }

        @Override // com.p7700g.p99005.xm3.g
        public void b(String str) {
            qk3.this.v("engagement", str);
            qk3.this.w(this.a);
        }
    }

    /* compiled from: OSInAppMessageRepository.java */
    /* loaded from: classes3.dex */
    public class c extends JSONObject {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ int d;
        public final /* synthetic */ String e;

        public c(String str, String str2, String str3, int i, String str4) throws JSONException {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = i;
            this.e = str4;
            put("app_id", str);
            put("player_id", str2);
            put("variant_id", str3);
            put("device_type", i);
            put("page_id", str4);
        }
    }

    /* compiled from: OSInAppMessageRepository.java */
    /* loaded from: classes3.dex */
    public class d extends xm3.g {
        public final /* synthetic */ Set a;
        public final /* synthetic */ i b;

        public d(Set set, i iVar) {
            this.a = set;
            this.b = iVar;
        }

        @Override // com.p7700g.p99005.xm3.g
        public void a(int i, String str, Throwable th) {
            qk3.this.u("page impression", i, str);
            this.b.onFailure(str);
        }

        @Override // com.p7700g.p99005.xm3.g
        public void b(String str) {
            qk3.this.v("page impression", str);
            qk3.this.C(this.a);
        }
    }

    /* compiled from: OSInAppMessageRepository.java */
    /* loaded from: classes3.dex */
    public class e extends JSONObject {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ int d;

        public e(String str, String str2, String str3, int i) throws JSONException {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = i;
            put("app_id", str);
            put("player_id", str2);
            put("variant_id", str3);
            put("device_type", i);
            put("first_impression", true);
        }
    }

    /* compiled from: OSInAppMessageRepository.java */
    /* loaded from: classes3.dex */
    public class f extends xm3.g {
        public final /* synthetic */ Set a;
        public final /* synthetic */ i b;

        public f(Set set, i iVar) {
            this.a = set;
            this.b = iVar;
        }

        @Override // com.p7700g.p99005.xm3.g
        public void a(int i, String str, Throwable th) {
            qk3.this.u(com.anythink.expressad.foundation.d.c.bQ, i, str);
            this.b.onFailure(str);
        }

        @Override // com.p7700g.p99005.xm3.g
        public void b(String str) {
            qk3.this.v(com.anythink.expressad.foundation.d.c.bQ, str);
            qk3.this.z(this.a);
        }
    }

    /* compiled from: OSInAppMessageRepository.java */
    /* loaded from: classes3.dex */
    public class g extends xm3.g {
        public final /* synthetic */ i a;

        public g(i iVar) {
            this.a = iVar;
        }

        @Override // com.p7700g.p99005.xm3.g
        public void a(int i, String str, Throwable th) {
            qk3.this.u(ck3.a, i, str);
            this.a.onFailure(str);
        }

        @Override // com.p7700g.p99005.xm3.g
        public void b(String str) {
            this.a.onSuccess(str);
        }
    }

    /* compiled from: OSInAppMessageRepository.java */
    /* loaded from: classes3.dex */
    public class h extends xm3.g {
        public final /* synthetic */ i a;

        public h(i iVar) {
            this.a = iVar;
        }

        @Override // com.p7700g.p99005.xm3.g
        public void a(int i, String str, Throwable th) {
            qk3.this.u(ck3.a, i, str);
            JSONObject jSONObject = new JSONObject();
            if (!OSUtils.X(i) || qk3.this.f >= OSUtils.b) {
                qk3.this.f = 0;
                try {
                    jSONObject.put(qk3.a, false);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } else {
                qk3.g(qk3.this);
                try {
                    jSONObject.put(qk3.a, true);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            this.a.onFailure(jSONObject.toString());
        }

        @Override // com.p7700g.p99005.xm3.g
        public void b(String str) {
            qk3.this.f = 0;
            this.a.onSuccess(str);
        }
    }

    /* compiled from: OSInAppMessageRepository.java */
    /* loaded from: classes3.dex */
    public interface i {
        void onFailure(String str);

        void onSuccess(String str);
    }

    public qk3(rm3 rm3Var, tk3 tk3Var, sl3 sl3Var) {
        this.c = rm3Var;
        this.d = tk3Var;
        this.e = sl3Var;
    }

    public static /* synthetic */ int g(qk3 qk3Var) {
        int i2 = qk3Var.f;
        qk3Var.f = i2 + 1;
        return i2;
    }

    private void i(Set<String> set) {
        String str;
        Set<String> h2;
        if (set == null || set.size() <= 0 || (h2 = vm3.h((str = vm3.a), vm3.T, null)) == null || h2.size() <= 0) {
            return;
        }
        h2.removeAll(set);
        vm3.p(str, vm3.T, h2);
    }

    private void j(Set<String> set) {
        if (set == null || set.size() <= 0) {
            return;
        }
        String str = vm3.a;
        Set<String> h2 = vm3.h(str, vm3.R, null);
        Set<String> h3 = vm3.h(str, vm3.S, null);
        if (h2 != null && h2.size() > 0) {
            h2.removeAll(set);
            vm3.p(str, vm3.R, h2);
        }
        if (h3 == null || h3.size() <= 0) {
            return;
        }
        h3.removeAll(set);
        vm3.p(str, vm3.S, h3);
    }

    @z1
    private String t(String str, String str2, String str3) {
        if (str2 == null) {
            tk3 tk3Var = this.d;
            tk3Var.d("Unable to find a variant for in-app message " + str);
            return null;
        }
        StringBuilder N = wo1.N("in_app_messages/", str, "/variants/", str2, "/html?app_id=");
        N.append(str3);
        return N.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(String str, int i2, String str2) {
        tk3 tk3Var = this.d;
        tk3Var.d("Encountered a " + i2 + " error while attempting in-app message " + str + " request: " + str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(String str, String str2) {
        tk3 tk3Var = this.d;
        tk3Var.b("Successful post for in-app message " + str + " request: " + str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(Set<String> set) {
        this.e.i(vm3.a, vm3.T, set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(Set<String> set) {
        this.e.i(vm3.a, vm3.S, set);
    }

    @s2
    public synchronized void A(gk3 gk3Var) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("message_id", gk3Var.b);
        contentValues.put(qm3.a.c, Integer.valueOf(gk3Var.h().c()));
        contentValues.put(qm3.a.d, Long.valueOf(gk3Var.h().d()));
        contentValues.put(qm3.a.e, gk3Var.e().toString());
        contentValues.put(qm3.a.f, Boolean.valueOf(gk3Var.j()));
        if (this.c.a(qm3.a.a, contentValues, "message_id = ?", new String[]{gk3Var.b}) == 0) {
            this.c.h(qm3.a.a, null, contentValues);
        }
    }

    public void B(Date date) {
        this.e.l(vm3.a, vm3.V, date != null ? date.toString() : null);
    }

    public void C(Set<String> set) {
        this.e.i(vm3.a, vm3.U, set);
    }

    public void D(String str, String str2, String str3, int i2, String str4, String str5, boolean z, Set<String> set, i iVar) {
        try {
            a aVar = new a(str, i2, str2, str5, str3, z);
            xm3.j("in_app_messages/" + str4 + "/click", aVar, new b(set, iVar));
        } catch (JSONException e2) {
            e2.printStackTrace();
            this.d.d("Unable to execute in-app message action HTTP request due to invalid JSON");
        }
    }

    public void E(String str, String str2, String str3, int i2, String str4, Set<String> set, i iVar) {
        try {
            e eVar = new e(str, str2, str3, i2);
            xm3.j("in_app_messages/" + str4 + "/impression", eVar, new f(set, iVar));
        } catch (JSONException e2) {
            e2.printStackTrace();
            this.d.d("Unable to execute in-app message impression HTTP request due to invalid JSON");
        }
    }

    public void F(String str, String str2, String str3, int i2, String str4, String str5, Set<String> set, i iVar) {
        try {
            c cVar = new c(str, str2, str3, i2, str5);
            xm3.j("in_app_messages/" + str4 + "/pageImpression", cVar, new d(set, iVar));
        } catch (JSONException e2) {
            e2.printStackTrace();
            this.d.d("Unable to execute in-app message impression HTTP request due to invalid JSON");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0072, code lost:
        if (r12.isClosed() != false) goto L19;
     */
    @s2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void h() {
        String[] strArr = {"message_id", qm3.a.e};
        String[] strArr2 = {String.valueOf((System.currentTimeMillis() / 1000) - b)};
        Set<String> N = OSUtils.N();
        Set<String> N2 = OSUtils.N();
        Cursor cursor = null;
        try {
            cursor = this.c.d(qm3.a.a, strArr, "last_display < ?", strArr2, null, null, null);
            if (cursor != null && cursor.getCount() != 0) {
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString(cursor.getColumnIndex("message_id"));
                        String string2 = cursor.getString(cursor.getColumnIndex(qm3.a.e));
                        N.add(string);
                        N2.addAll(OSUtils.O(new JSONArray(string2)));
                    } while (cursor.moveToNext());
                }
            }
            jm3.P1(jm3.u0.DEBUG, "Attempted to clean 6 month old IAM data, but none exists!");
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
            if (0 != 0 && !cursor.isClosed()) {
                cursor.close();
            }
            this.c.f(qm3.a.a, "last_display < ?", strArr2);
            j(N);
            i(N2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0072, code lost:
        if (r1.isClosed() != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0074, code lost:
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0088, code lost:
        if (r1.isClosed() == false) goto L18;
     */
    @s2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized List<gk3> k() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = this.c.d(qm3.a.a, null, null, null, null, null, null);
            if (cursor.moveToFirst()) {
                do {
                    String string = cursor.getString(cursor.getColumnIndex("message_id"));
                    String string2 = cursor.getString(cursor.getColumnIndex(qm3.a.e));
                    int i2 = cursor.getInt(cursor.getColumnIndex(qm3.a.c));
                    long j = cursor.getLong(cursor.getColumnIndex(qm3.a.d));
                    boolean z = true;
                    if (cursor.getInt(cursor.getColumnIndex(qm3.a.f)) != 1) {
                        z = false;
                    }
                    arrayList.add(new gk3(string, OSUtils.O(new JSONArray(string2)), z, new pk3(i2, j)));
                } while (cursor.moveToNext());
            }
        } catch (JSONException e2) {
            jm3.b(jm3.u0.ERROR, "Generating JSONArray from iam click ids:JSON Failed.", e2);
            if (cursor != null) {
            }
            return arrayList;
        }
        return arrayList;
    }

    public Set<String> l() {
        return this.e.c(vm3.a, vm3.T, null);
    }

    public Set<String> m() {
        return this.e.c(vm3.a, vm3.R, null);
    }

    public void n(String str, String str2, String str3, i iVar) {
        xm3.e(t(str2, str3, str), new h(iVar), null);
    }

    public void o(String str, String str2, i iVar) {
        xm3.e(wo1.v("in_app_messages/device_preview?preview_id=", str2, "&app_id=", str), new g(iVar), null);
    }

    public Set<String> p() {
        return this.e.c(vm3.a, vm3.S, null);
    }

    @z1
    public Date q() {
        String f2 = this.e.f(vm3.a, vm3.V, null);
        if (f2 == null) {
            return null;
        }
        try {
            return new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ENGLISH).parse(f2);
        } catch (ParseException e2) {
            jm3.P1(jm3.u0.ERROR, e2.getLocalizedMessage());
            return null;
        }
    }

    public String r() {
        return this.e.f(vm3.a, vm3.Q, null);
    }

    public Set<String> s() {
        return this.e.c(vm3.a, vm3.U, null);
    }

    public void x(Set<String> set) {
        this.e.i(vm3.a, vm3.R, set);
    }

    public void y(String str) {
        this.e.l(vm3.a, vm3.Q, str);
    }
}