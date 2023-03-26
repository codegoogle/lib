package com.greedygame.core.adview.general;

import com.p7700g.p99005.iz;
import com.p7700g.p99005.mz;
import com.p7700g.p99005.qz;
import com.p7700g.p99005.wz;

/* loaded from: classes3.dex */
public class GGAdview_LifecycleAdapter implements iz {
    public final GGAdview a;

    public GGAdview_LifecycleAdapter(GGAdview gGAdview) {
        this.a = gGAdview;
    }

    @Override // com.p7700g.p99005.iz
    public void a(qz qzVar, mz.b bVar, boolean z, wz wzVar) {
        boolean z2 = wzVar != null;
        if (z) {
            return;
        }
        if (bVar == mz.b.ON_CREATE) {
            if (!z2 || wzVar.a("onCreate", 1)) {
                this.a.onCreate();
            }
        } else if (bVar == mz.b.ON_START) {
            if (!z2 || wzVar.a("onStart", 1)) {
                this.a.onStart();
            }
        } else if (bVar == mz.b.ON_RESUME) {
            if (!z2 || wzVar.a("onResume", 1)) {
                this.a.onResume();
            }
        } else if (bVar == mz.b.ON_PAUSE) {
            if (!z2 || wzVar.a("onPause", 1)) {
                this.a.onPause();
            }
        } else if (bVar == mz.b.ON_STOP) {
            if (!z2 || wzVar.a("onStop", 1)) {
                this.a.onStop();
            }
        } else if (bVar == mz.b.ON_DESTROY) {
            if (!z2 || wzVar.a("onDestroy", 1)) {
                this.a.onDestroy();
            }
        }
    }
}