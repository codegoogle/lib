package com.p7700g.p99005;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* compiled from: RenderTask.java */
/* loaded from: classes4.dex */
public class hy5 extends iy5 {
    public hy5(ox5 ox5Var) {
        super(ox5Var);
    }

    @Override // com.p7700g.p99005.iy5
    public void a() {
        ox5 ox5Var = this.s;
        long B = ox5Var.y.B(ox5Var.x);
        if (B >= 0) {
            this.s.u = SystemClock.uptimeMillis() + B;
            if (this.s.isVisible() && this.s.t) {
                ox5 ox5Var2 = this.s;
                if (!ox5Var2.D) {
                    ox5Var2.s.remove(this);
                    ox5 ox5Var3 = this.s;
                    ox5Var3.H = ox5Var3.s.schedule(this, B, TimeUnit.MILLISECONDS);
                }
            }
            if (!this.s.z.isEmpty() && this.s.k() == this.s.y.n() - 1) {
                ox5 ox5Var4 = this.s;
                ox5Var4.E.sendEmptyMessageAtTime(ox5Var4.l(), this.s.u);
            }
        } else {
            ox5 ox5Var5 = this.s;
            ox5Var5.u = Long.MIN_VALUE;
            ox5Var5.t = false;
        }
        if (!this.s.isVisible() || this.s.E.hasMessages(-1)) {
            return;
        }
        this.s.E.sendEmptyMessageAtTime(-1, 0L);
    }
}