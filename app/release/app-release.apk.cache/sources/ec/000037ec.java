package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.p7700g.p99005.fp3;
import com.p7700g.p99005.gp3;
import com.p7700g.p99005.ip3;
import com.p7700g.p99005.wo1;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class NewHtcHomeBadger implements fp3 {
    public static final String a = "com.htc.launcher.action.UPDATE_SHORTCUT";
    public static final String b = "com.htc.launcher.action.SET_NOTIFICATION";
    public static final String c = "packagename";
    public static final String d = "count";
    public static final String e = "com.htc.launcher.extra.COMPONENT";
    public static final String f = "com.htc.launcher.extra.COUNT";

    @Override // com.p7700g.p99005.fp3
    public List<String> a() {
        return Arrays.asList("com.htc.launcher");
    }

    @Override // com.p7700g.p99005.fp3
    public void b(Context context, ComponentName componentName, int i) throws gp3 {
        Intent intent = new Intent(b);
        intent.putExtra(e, componentName.flattenToShortString());
        intent.putExtra(f, i);
        Intent intent2 = new Intent(a);
        intent2.putExtra(c, componentName.getPackageName());
        intent2.putExtra(d, i);
        if (!ip3.a(context, intent) && !ip3.a(context, intent2)) {
            StringBuilder G = wo1.G("unable to resolve intent: ");
            G.append(intent2.toString());
            throw new gp3(G.toString());
        }
        context.sendBroadcast(intent);
        context.sendBroadcast(intent2);
    }
}