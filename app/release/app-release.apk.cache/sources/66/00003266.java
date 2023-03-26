package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.adapters.ironsource.IronSourceAdapter;
import com.p7700g.p99005.au2;
import com.p7700g.p99005.cu2;
import com.p7700g.p99005.eu2;
import com.p7700g.p99005.ft2;
import com.p7700g.p99005.iu2;
import com.p7700g.p99005.ju2;
import com.p7700g.p99005.rs2;
import com.p7700g.p99005.s2;
import com.p7700g.p99005.ss2;
import com.p7700g.p99005.ws2;
import com.p7700g.p99005.x1;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
/* loaded from: classes3.dex */
public class FirebaseMessagingService extends ws2 {
    @x1
    public static final String x = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    private static final Queue<String> y = new ArrayDeque(10);

    private boolean j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = y;
        if (queue.contains(str)) {
            if (Log.isLoggable(rs2.a, 3)) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    "Received duplicate message: ".concat(valueOf);
                    return true;
                }
                new String("Received duplicate message: ");
                return true;
            }
            return true;
        }
        if (queue.size() >= 10) {
            queue.remove();
        }
        queue.add(str);
        return false;
    }

    private void k(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (cu2.v(extras)) {
            cu2 cu2Var = new cu2(extras);
            ExecutorService d = ft2.d();
            try {
                if (new ss2(this, cu2Var, d).a()) {
                    return;
                }
                d.shutdown();
                if (au2.B(intent)) {
                    au2.t(intent);
                }
            } finally {
                d.shutdown();
            }
        }
        o(new eu2(extras));
    }

    private String l(Intent intent) {
        String stringExtra = intent.getStringExtra(rs2.d.h);
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    private void m(Intent intent) {
        if (j(intent.getStringExtra(rs2.d.h))) {
            return;
        }
        s(intent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void s(Intent intent) {
        char c;
        String stringExtra = intent.getStringExtra(rs2.d.d);
        if (stringExtra == null) {
            stringExtra = rs2.e.a;
        }
        switch (stringExtra.hashCode()) {
            case -2062414158:
                if (stringExtra.equals(rs2.e.b)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 102161:
                if (stringExtra.equals(rs2.e.a)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 814694033:
                if (stringExtra.equals(rs2.e.d)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 814800675:
                if (stringExtra.equals(rs2.e.c)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            au2.v(intent);
            k(intent);
        } else if (c == 1) {
            n();
        } else if (c == 2) {
            p(intent.getStringExtra(rs2.d.h));
        } else if (c != 3) {
            if (stringExtra.length() != 0) {
                "Received message with unknown type: ".concat(stringExtra);
            } else {
                new String("Received message with unknown type: ");
            }
        } else {
            r(l(intent), new iu2(intent.getStringExtra("error")));
        }
    }

    @Override // com.p7700g.p99005.ws2
    @x1
    public Intent c(@x1 Intent intent) {
        return ju2.b().c();
    }

    @Override // com.p7700g.p99005.ws2
    public void d(@x1 Intent intent) {
        String action = intent.getAction();
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(action) && !x.equals(action)) {
            if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
                q(intent.getStringExtra(IronSourceAdapter.IRONSOURCE_BIDDING_TOKEN_KEY));
                return;
            }
            String valueOf = String.valueOf(intent.getAction());
            if (valueOf.length() != 0) {
                "Unknown intent action: ".concat(valueOf);
                return;
            } else {
                new String("Unknown intent action: ");
                return;
            }
        }
        m(intent);
    }

    @s2
    public void n() {
    }

    @s2
    public void o(@x1 eu2 eu2Var) {
    }

    @s2
    public void p(@x1 String str) {
    }

    @s2
    public void q(@x1 String str) {
    }

    @s2
    public void r(@x1 String str, @x1 Exception exc) {
    }
}