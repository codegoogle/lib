package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.la0;

@i2({i2.a.LIBRARY})
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(la0 la0Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.a = (IconCompat) la0Var.h0(remoteActionCompat.a, 1);
        remoteActionCompat.b = la0Var.w(remoteActionCompat.b, 2);
        remoteActionCompat.c = la0Var.w(remoteActionCompat.c, 3);
        remoteActionCompat.d = (PendingIntent) la0Var.W(remoteActionCompat.d, 4);
        remoteActionCompat.e = la0Var.m(remoteActionCompat.e, 5);
        remoteActionCompat.f = la0Var.m(remoteActionCompat.f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, la0 la0Var) {
        la0Var.j0(false, false);
        la0Var.m1(remoteActionCompat.a, 1);
        la0Var.z0(remoteActionCompat.b, 2);
        la0Var.z0(remoteActionCompat.c, 3);
        la0Var.X0(remoteActionCompat.d, 4);
        la0Var.n0(remoteActionCompat.e, 5);
        la0Var.n0(remoteActionCompat.f, 6);
    }
}