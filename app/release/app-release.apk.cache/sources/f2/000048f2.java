package com.p7700g.p99005;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import java.util.Collections;
import java.util.List;

/* compiled from: BroadcastHelper.java */
/* loaded from: classes3.dex */
public class ip3 {
    public static boolean a(Context context, Intent intent) {
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        return queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0;
    }

    public static List<ResolveInfo> b(Context context, Intent intent) {
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        return queryBroadcastReceivers != null ? queryBroadcastReceivers : Collections.emptyList();
    }

    public static void c(Context context, Intent intent) throws gp3 {
        List<ResolveInfo> b = b(context, intent);
        if (b.size() != 0) {
            for (ResolveInfo resolveInfo : b) {
                Intent intent2 = new Intent(intent);
                if (resolveInfo != null) {
                    intent2.setPackage(resolveInfo.resolvePackageName);
                    context.sendBroadcast(intent2);
                }
            }
            return;
        }
        StringBuilder G = wo1.G("unable to resolve intent: ");
        G.append(intent.toString());
        throw new gp3(G.toString());
    }
}