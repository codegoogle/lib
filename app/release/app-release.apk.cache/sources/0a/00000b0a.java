package com.anythink.expressad.videocommon.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.p7700g.p99005.b91;

/* loaded from: classes2.dex */
public final class i extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            if (b91.a.equals(intent.getAction())) {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                    if (activeNetworkInfo.getType() == 1) {
                        c.a().a(true);
                        return;
                    } else if (activeNetworkInfo.getType() == 0) {
                        c.a().c();
                        return;
                    } else {
                        return;
                    }
                }
                c.a().b();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}