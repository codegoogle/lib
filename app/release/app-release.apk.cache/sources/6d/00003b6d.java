package com.p7700g.p99005;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSOutcomeEventParams.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010 \u001a\u00020\b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b!\u0010\"J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0018\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\f\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u0004\u0018\u00010\u00198\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0019\u0010 \u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010\n¨\u0006#"}, d2 = {"Lcom/p7700g/p99005/bp3;", "", "Lorg/json/JSONObject;", "h", "()Lorg/json/JSONObject;", "", "e", "()Z", "", "toString", "()Ljava/lang/String;", "", "c", "F", "d", "()F", com.anythink.basead.d.g.i, "(F)V", "weight", "", "J", "()J", "f", "(J)V", "timestamp", "Lcom/p7700g/p99005/dp3;", "b", "Lcom/p7700g/p99005/dp3;", "()Lcom/p7700g/p99005/dp3;", "outcomeSource", "a", "Ljava/lang/String;", "outcomeId", "<init>", "(Ljava/lang/String;Lcom/p7700g/p99005/dp3;FJ)V", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public final class bp3 {
    @NotNull
    private final String a;
    @Nullable
    private final dp3 b;
    private float c;
    private long d;

    public bp3(@NotNull String str, @Nullable dp3 dp3Var, float f, long j) {
        c25.p(str, "outcomeId");
        this.a = str;
        this.b = dp3Var;
        this.c = f;
        this.d = j;
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    @Nullable
    public final dp3 b() {
        return this.b;
    }

    public final long c() {
        return this.d;
    }

    public final float d() {
        return this.c;
    }

    public final boolean e() {
        dp3 dp3Var = this.b;
        return dp3Var == null || (dp3Var.a() == null && this.b.b() == null);
    }

    public final void f(long j) {
        this.d = j;
    }

    public final void g(float f) {
        this.c = f;
    }

    @NotNull
    public final JSONObject h() throws JSONException {
        JSONObject put = new JSONObject().put("id", this.a);
        dp3 dp3Var = this.b;
        if (dp3Var != null) {
            put.put(ko3.f, dp3Var.g());
        }
        float f = this.c;
        if (f > 0) {
            put.put("weight", Float.valueOf(f));
        }
        long j = this.d;
        if (j > 0) {
            put.put("timestamp", j);
        }
        c25.o(put, "json");
        return put;
    }

    @NotNull
    public String toString() {
        StringBuilder G = wo1.G("OSOutcomeEventParams{outcomeId='");
        wo1.d0(G, this.a, '\'', ", outcomeSource=");
        G.append(this.b);
        G.append(", weight=");
        G.append(this.c);
        G.append(", timestamp=");
        G.append(this.d);
        G.append('}');
        return G.toString();
    }

    public /* synthetic */ bp3(String str, dp3 dp3Var, float f, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, dp3Var, f, (i & 8) != 0 ? 0L : j);
    }
}