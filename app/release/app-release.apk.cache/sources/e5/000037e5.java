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
public class AdwHomeBadger implements fp3 {
    public static final String a = "org.adw.launcher.counter.SEND";
    public static final String b = "PNAME";
    public static final String c = "CNAME";
    public static final String d = "COUNT";

    @Override // com.p7700g.p99005.fp3
    public List<String> a() {
        return Arrays.asList("org.adw.launcher", "org.adwfreak.launcher");
    }

    @Override // com.p7700g.p99005.fp3
    public void b(Context context, ComponentName componentName, int i) throws gp3 {
        Intent intent = new Intent(a);
        intent.putExtra(b, componentName.getPackageName());
        intent.putExtra(c, componentName.getClassName());
        intent.putExtra(d, i);
        if (ip3.a(context, intent)) {
            context.sendBroadcast(intent);
            return;
        }
        StringBuilder G = wo1.G("unable to resolve intent: ");
        G.append(intent.toString());
        throw new gp3(G.toString());
    }
}