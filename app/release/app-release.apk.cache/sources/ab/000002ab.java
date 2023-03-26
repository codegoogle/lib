package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import com.p7700g.p99005.ec0;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.tb0;
import com.p7700g.p99005.vb0;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    private static final String a = tb0.f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(@x1 Context context, @z1 Intent intent) {
        if (intent == null) {
            return;
        }
        tb0.c().a(a, "Requesting diagnostics", new Throwable[0]);
        try {
            ec0.p(context).j(vb0.e(DiagnosticsWorker.class));
        } catch (IllegalStateException e) {
            tb0.c().b(a, "WorkManager is not initialized", e);
        }
    }
}