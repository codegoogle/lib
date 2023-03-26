package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import com.p7700g.p99005.if0;
import com.p7700g.p99005.rc0;
import com.p7700g.p99005.tb0;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    public static final String a = tb0.f("ConstrntProxyUpdtRecvr");
    public static final String b = "androidx.work.impl.background.systemalarm.UpdateProxies";
    public static final String c = "KEY_BATTERY_NOT_LOW_PROXY_ENABLED";
    public static final String d = "KEY_BATTERY_CHARGING_PROXY_ENABLED";
    public static final String e = "KEY_STORAGE_NOT_LOW_PROXY_ENABLED";
    public static final String f = "KEY_NETWORK_STATE_PROXY_ENABLED";

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ Intent s;
        public final /* synthetic */ Context t;
        public final /* synthetic */ BroadcastReceiver.PendingResult u;

        public a(final Intent val$intent, final Context val$context, final BroadcastReceiver.PendingResult val$pendingResult) {
            this.s = val$intent;
            this.t = val$context;
            this.u = val$pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.s.getBooleanExtra(ConstraintProxyUpdateReceiver.c, false);
                boolean booleanExtra2 = this.s.getBooleanExtra(ConstraintProxyUpdateReceiver.d, false);
                boolean booleanExtra3 = this.s.getBooleanExtra(ConstraintProxyUpdateReceiver.e, false);
                boolean booleanExtra4 = this.s.getBooleanExtra(ConstraintProxyUpdateReceiver.f, false);
                tb0.c().a(ConstraintProxyUpdateReceiver.a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)), new Throwable[0]);
                if0.c(this.t, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                if0.c(this.t, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                if0.c(this.t, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                if0.c(this.t, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.u.finish();
            }
        }
    }

    public static Intent a(Context context, boolean batteryNotLowProxyEnabled, boolean batteryChargingProxyEnabled, boolean storageNotLowProxyEnabled, boolean networkStateProxyEnabled) {
        Intent intent = new Intent(b);
        intent.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
        intent.putExtra(c, batteryNotLowProxyEnabled).putExtra(d, batteryChargingProxyEnabled).putExtra(e, storageNotLowProxyEnabled).putExtra(f, networkStateProxyEnabled);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@x1 final Context context, @z1 final Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (!b.equals(action)) {
            tb0.c().a(a, String.format("Ignoring unknown action %s", action), new Throwable[0]);
        } else {
            rc0.H(context).O().c(new a(intent, context, goAsync()));
        }
    }
}