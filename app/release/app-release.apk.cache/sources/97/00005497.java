package com.p7700g.p99005;

import android.app.PendingIntent;
import java.util.Objects;

/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes3.dex */
public final class om2 extends ll2 {
    private final PendingIntent s;
    private final boolean t;

    public om2(PendingIntent pendingIntent, boolean z) {
        Objects.requireNonNull(pendingIntent, "Null pendingIntent");
        this.s = pendingIntent;
        this.t = z;
    }

    @Override // com.p7700g.p99005.ll2
    public final PendingIntent c() {
        return this.s;
    }

    @Override // com.p7700g.p99005.ll2
    public final boolean d() {
        return this.t;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ll2) {
            ll2 ll2Var = (ll2) obj;
            if (this.s.equals(ll2Var.c()) && this.t == ll2Var.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.s.hashCode() ^ 1000003) * 1000003) ^ (true != this.t ? 1237 : 1231);
    }

    public final String toString() {
        String obj = this.s.toString();
        boolean z = this.t;
        return "ReviewInfo{pendingIntent=" + obj + ", isNoOp=" + z + "}";
    }
}