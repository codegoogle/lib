package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.p7700g.p99005.fp3;
import com.p7700g.p99005.gp3;
import com.p7700g.p99005.ip3;
import com.p7700g.p99005.wo1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class DefaultBadger implements fp3 {
    private static final String a = "android.intent.action.BADGE_COUNT_UPDATE";
    private static final String b = "badge_count";
    private static final String c = "badge_count_package_name";
    private static final String d = "badge_count_class_name";

    @Override // com.p7700g.p99005.fp3
    public List<String> a() {
        return new ArrayList(0);
    }

    @Override // com.p7700g.p99005.fp3
    public void b(Context context, ComponentName componentName, int i) throws gp3 {
        Intent intent = new Intent(a);
        intent.putExtra(b, i);
        intent.putExtra(c, componentName.getPackageName());
        intent.putExtra(d, componentName.getClassName());
        if (ip3.a(context, intent)) {
            context.sendBroadcast(intent);
            return;
        }
        StringBuilder G = wo1.G("unable to resolve intent: ");
        G.append(intent.toString());
        throw new gp3(G.toString());
    }

    public boolean c(Context context) {
        return ip3.a(context, new Intent(a));
    }
}