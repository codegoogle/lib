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
public class ApexHomeBadger implements fp3 {
    private static final String a = "com.anddoes.launcher.COUNTER_CHANGED";
    private static final String b = "package";
    private static final String c = "count";
    private static final String d = "class";

    @Override // com.p7700g.p99005.fp3
    public List<String> a() {
        return Arrays.asList("com.anddoes.launcher");
    }

    @Override // com.p7700g.p99005.fp3
    public void b(Context context, ComponentName componentName, int i) throws gp3 {
        Intent intent = new Intent(a);
        intent.putExtra(b, componentName.getPackageName());
        intent.putExtra("count", i);
        intent.putExtra(d, componentName.getClassName());
        if (ip3.a(context, intent)) {
            context.sendBroadcast(intent);
            return;
        }
        StringBuilder G = wo1.G("unable to resolve intent: ");
        G.append(intent.toString());
        throw new gp3(G.toString());
    }
}