package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.p7700g.p99005.rs2;
import com.p7700g.p99005.s2;
import com.p7700g.p99005.x1;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
/* loaded from: classes2.dex */
public abstract class CloudMessagingReceiver extends BroadcastReceiver {
    private final ExecutorService zza = com.google.android.gms.internal.cloudmessaging.zza.zza().zza(new NamedThreadFactory("firebase-iid-executor"), com.google.android.gms.internal.cloudmessaging.zzf.zza);

    /* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
    /* loaded from: classes2.dex */
    public static final class IntentActionKeys {
        @x1
        public static final String NOTIFICATION_DISMISS = "com.google.firebase.messaging.NOTIFICATION_DISMISS";
        @x1
        public static final String NOTIFICATION_OPEN = "com.google.firebase.messaging.NOTIFICATION_OPEN";

        private IntentActionKeys() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
    /* loaded from: classes2.dex */
    public static final class IntentKeys {
        @x1
        public static final String PENDING_INTENT = "pending_intent";
        @x1
        public static final String WRAPPED_INTENT = "wrapped_intent";

        private IntentKeys() {
        }
    }

    @s2
    private final int zza(@x1 Context context, @x1 Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra(IntentKeys.PENDING_INTENT);
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove(IntentKeys.PENDING_INTENT);
        } else {
            extras = new Bundle();
        }
        if (IntentActionKeys.NOTIFICATION_OPEN.equals(intent.getAction())) {
            onNotificationOpen(context, extras);
            return -1;
        } else if (IntentActionKeys.NOTIFICATION_DISMISS.equals(intent.getAction())) {
            onNotificationDismissed(context, extras);
            return -1;
        } else {
            return 500;
        }
    }

    @s2
    private final int zzb(@x1 Context context, @x1 Intent intent) {
        Task<Void> zza;
        if (intent.getExtras() == null) {
            return 500;
        }
        String stringExtra = intent.getStringExtra(rs2.d.h);
        if (TextUtils.isEmpty(stringExtra)) {
            zza = Tasks.forResult(null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString(rs2.d.h, stringExtra);
            zza = zze.zza(context).zza(2, bundle);
        }
        int onMessageReceive = onMessageReceive(context, new CloudMessage(intent));
        try {
            Tasks.await(zza, TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            String.valueOf(e).length();
        }
        return onMessageReceive;
    }

    @x1
    public Executor getBroadcastExecutor() {
        return this.zza;
    }

    @s2
    public abstract int onMessageReceive(@x1 Context context, @x1 CloudMessage cloudMessage);

    @s2
    public void onNotificationDismissed(@x1 Context context, @x1 Bundle bundle) {
    }

    @s2
    public void onNotificationOpen(@x1 Context context, @x1 Bundle bundle) {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@x1 Context context, @x1 Intent intent) {
        if (intent == null) {
            return;
        }
        getBroadcastExecutor().execute(new Runnable(this, intent, context, isOrderedBroadcast(), goAsync()) { // from class: com.google.android.gms.cloudmessaging.zzd
            private final CloudMessagingReceiver zza;
            private final Intent zzb;
            private final Context zzc;
            private final boolean zzd;
            private final BroadcastReceiver.PendingResult zze;

            {
                this.zza = this;
                this.zzb = intent;
                this.zzc = context;
                this.zzd = r4;
                this.zze = r5;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(this.zzb, this.zzc, this.zzd, this.zze);
            }
        });
    }

    public final /* synthetic */ void zza(Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        int zzb;
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra(IntentKeys.WRAPPED_INTENT);
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                zzb = zza(context, intent2);
            } else {
                zzb = zzb(context, intent);
            }
            if (z) {
                pendingResult.setResultCode(zzb);
            }
        } finally {
            pendingResult.finish();
        }
    }
}