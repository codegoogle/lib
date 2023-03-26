package com.greedygame.core.reporting.crash;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.p7700g.p99005.c23;
import com.p7700g.p99005.c25;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.eg;
import com.p7700g.p99005.f85;
import com.p7700g.p99005.h23;
import com.p7700g.p99005.k23;
import com.p7700g.p99005.la3;
import com.p7700g.p99005.na3;
import com.p7700g.p99005.sa3;
import com.p7700g.p99005.wz2;
import com.p7700g.p99005.xz2;
import java.nio.charset.Charset;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@e2(21)
/* loaded from: classes3.dex */
public final class SupportCrashReporterService extends eg implements k23, la3<String> {
    @NotNull
    public static final a D = new a(null);
    @NotNull
    private final na3 E = na3.s.a();
    @NotNull
    private String F = "";

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@NotNull Context context, @NotNull String str) {
            c25.p(context, "context");
            c25.p(str, "data");
            Intent intent = new Intent(context, SupportCrashReporterService.class);
            intent.putExtra("data", str);
            eg.f(context, SupportCrashReporterService.class, (int) System.currentTimeMillis(), intent);
        }
    }

    private final String r() {
        JSONObject jSONObject = new JSONObject(q());
        boolean optBoolean = jSONObject.optBoolean("non_fatal", false);
        jSONObject.remove("non_fatal");
        String jSONObject2 = jSONObject.toString();
        c25.o(jSONObject2, "jsonObject.toString()");
        p(jSONObject2);
        return optBoolean ? sa3.d() : sa3.e();
    }

    private final void s() {
        String o = o(this);
        try {
            String q = q();
            Charset charset = f85.b;
            if (q == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = q.getBytes(charset);
            c25.o(bytes, "(this as java.lang.String).getBytes(charset)");
            wz2.f(bytes, o);
        } catch (Exception unused) {
            xz2.d("CrsRepS", "Could Not Save the crash report file.");
        }
    }

    @Override // com.p7700g.p99005.la3
    public void a(@NotNull h23<String> h23Var) {
        c25.p(h23Var, "response");
        if (h23Var.d()) {
            xz2.c("CrsRepS", "Job is succesful");
            stopSelf();
            return;
        }
        s();
        stopSelf();
    }

    @Override // com.p7700g.p99005.la3
    public void b(@NotNull h23<String> h23Var, @NotNull Throwable th) {
        c25.p(h23Var, "response");
        c25.p(th, "t");
        s();
        stopSelf();
    }

    @Override // com.p7700g.p99005.eg
    public void j(@NotNull Intent intent) {
        String string;
        c25.p(intent, "intent");
        Bundle extras = intent.getExtras();
        String str = "";
        if (extras != null && (string = extras.getString("data", "")) != null) {
            str = string;
        }
        p(str);
        xz2.c("CrsRepS", "Starting Crash Service Job");
        c23 n = n();
        if (n == null) {
            return;
        }
        xz2.c("CrsRepS", c25.C("Adding Crash Request to network ", n()));
        na3 na3Var = this.E;
        Context applicationContext = getApplicationContext();
        c25.o(applicationContext, "applicationContext");
        na3Var.b(applicationContext);
        this.E.c(n);
    }

    @Nullable
    public c23 n() {
        return new c23(r(), q(), this);
    }

    @NotNull
    public String o(@NotNull Context context) {
        return k23.a.a(this, context);
    }

    public void p(@NotNull String str) {
        c25.p(str, "<set-?>");
        this.F = str;
    }

    @NotNull
    public String q() {
        return this.F;
    }
}