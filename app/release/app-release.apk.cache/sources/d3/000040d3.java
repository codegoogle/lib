package com.p7700g.p99005;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.p7700g.p99005.jm3;
import com.p7700g.p99005.vn2;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutionException;

/* compiled from: PushRegistratorFCM.java */
/* loaded from: classes3.dex */
public class en3 extends dn3 {
    private static final String f = "ONESIGNAL_SDK_FCM_APP_NAME";
    private pn2 g;
    @x1
    private final Context h;
    @x1
    private final a i;

    /* compiled from: PushRegistratorFCM.java */
    /* loaded from: classes3.dex */
    public static class a {
        private static final String a = "onesignal-shared-public";
        private static final String b = "1:754795614042:android:c682b8144a8dd52bc1ad63";
        private static final String c = "QUl6YVN5QW5UTG41LV80TWMyYTJQLWRLVWVFLWFCdGd5Q3JqbFlV";
        @x1
        private final String d;
        @x1
        private final String e;
        @x1
        private final String f;

        public a() {
            this(null, null, null);
        }

        public a(@z1 String str, @z1 String str2, @z1 String str3) {
            this.d = str == null ? a : str;
            this.e = str2 == null ? b : str2;
            this.f = str3 == null ? new String(Base64.decode(c, 0)) : str3;
        }
    }

    public en3(@x1 Context context, @z1 a aVar) {
        this.h = context;
        if (aVar == null) {
            this.i = new a();
        } else {
            this.i = aVar;
        }
    }

    @s2
    @Deprecated
    private String l(String str) throws IOException {
        try {
            Object invoke = Class.forName("com.google.firebase.iid.FirebaseInstanceId").getMethod("getInstance", pn2.class).invoke(null, this.g);
            return (String) invoke.getClass().getMethod("getToken", String.class, String.class).invoke(invoke, str, FirebaseMessaging.a);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new Error("Reflection error on FirebaseInstanceId.getInstance(firebaseApp).getToken(senderId, FirebaseMessaging.INSTANCE_ID_SCOPE)", e);
        }
    }

    @s2
    private String m() throws Exception {
        Task<String> k = ((FirebaseMessaging) this.g.j(FirebaseMessaging.class)).k();
        try {
            return (String) Tasks.await(k);
        } catch (ExecutionException unused) {
            throw k.getException();
        }
    }

    private void n(String str) {
        if (this.g != null) {
            return;
        }
        this.g = pn2.x(this.h, new vn2.b().f(str).c(this.i.e).b(this.i.f).g(this.i.d).a(), f);
    }

    @Override // com.p7700g.p99005.dn3
    public String f() {
        return FirebaseMessaging.a;
    }

    @Override // com.p7700g.p99005.dn3
    @s2
    public String g(String str) throws Exception {
        n(str);
        try {
            return m();
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
            jm3.a(jm3.u0.INFO, "FirebaseMessaging.getToken not found, attempting to use FirebaseInstanceId.getToken");
            return l(str);
        }
    }
}