package com.p7700g.p99005;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: StatusReceiver.java */
/* loaded from: classes2.dex */
public class se1 extends BroadcastReceiver {
    public static final String a = "com.anchorfree.vpnsdk.receiver.status";
    @x1
    public kj1 b = kj1.b("StatusReceiver");

    @Override // android.content.BroadcastReceiver
    public void onReceive(@x1 Context context, @x1 Intent intent) {
        this.b.c("StatusReceiver: onReceive", new Object[0]);
    }
}