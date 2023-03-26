package com.greedygame.core.reporting.crash;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import com.p7700g.p99005.c23;
import com.p7700g.p99005.c25;
import com.p7700g.p99005.e2;
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
public final class CrashReporterService extends JobService implements k23, la3<String> {
    @NotNull
    public static final a s = new a(null);
    @Nullable
    private JobParameters t;
    @NotNull
    private final na3 u = na3.s.a();
    @NotNull
    private String v = "";

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final String g() {
        JobParameters jobParameters = this.t;
        if (jobParameters == null) {
            xz2.c("CrsRepS", "Job Parameter is null. Finishing job");
            jobFinished(this.t, false);
            return "";
        }
        c25.m(jobParameters);
        String string = jobParameters.getExtras().getString("data", "");
        c25.o(string, "params.extras.getString(\"data\", \"\")");
        e(string);
        JSONObject jSONObject = new JSONObject(f());
        boolean optBoolean = jSONObject.optBoolean("non_fatal", false);
        jSONObject.remove("non_fatal");
        String jSONObject2 = jSONObject.toString();
        c25.o(jSONObject2, "jsonObject.toString()");
        e(jSONObject2);
        return optBoolean ? sa3.d() : sa3.e();
    }

    private final void h() {
        String d = d(this);
        try {
            String f = f();
            Charset charset = f85.b;
            if (f == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = f.getBytes(charset);
            c25.o(bytes, "(this as java.lang.String).getBytes(charset)");
            wz2.f(bytes, d);
        } catch (Exception unused) {
            xz2.d("CrsRepS", "Could Not Save the crash report file.");
        }
    }

    @Override // com.p7700g.p99005.la3
    public void a(@NotNull h23<String> h23Var) {
        c25.p(h23Var, "response");
        if (h23Var.d()) {
            xz2.c("CrsRepS", "Job is succesful");
            jobFinished(this.t, false);
            return;
        }
        h();
        jobFinished(this.t, true);
    }

    @Override // com.p7700g.p99005.la3
    public void b(@NotNull h23<String> h23Var, @NotNull Throwable th) {
        c25.p(h23Var, "response");
        c25.p(th, "t");
        h();
        jobFinished(this.t, true);
    }

    @Nullable
    public c23 c() {
        return new c23(g(), f(), this);
    }

    @NotNull
    public String d(@NotNull Context context) {
        return k23.a.a(this, context);
    }

    public void e(@NotNull String str) {
        c25.p(str, "<set-?>");
        this.v = str;
    }

    @NotNull
    public String f() {
        return this.v;
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(@Nullable JobParameters jobParameters) {
        xz2.c("CrsRepS", "Starting Crash Service Job");
        this.t = jobParameters;
        c23 c = c();
        if (c == null) {
            return false;
        }
        xz2.c("CrsRepS", c25.C("Adding Crash Request to network ", c()));
        na3 na3Var = this.u;
        Context applicationContext = getApplicationContext();
        c25.o(applicationContext, "applicationContext");
        na3Var.b(applicationContext);
        this.u.c(c);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(@Nullable JobParameters jobParameters) {
        this.t = jobParameters;
        return false;
    }
}