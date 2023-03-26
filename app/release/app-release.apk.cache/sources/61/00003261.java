package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.android.gms.tasks.Tasks;
import com.p7700g.p99005.au2;
import com.p7700g.p99005.et2;
import com.p7700g.p99005.s2;
import com.p7700g.p99005.x1;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
/* loaded from: classes3.dex */
public final class FirebaseInstanceIdReceiver extends CloudMessagingReceiver {
    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    @s2
    public final int onMessageReceive(@x1 Context context, @x1 CloudMessage cloudMessage) {
        try {
            return ((Integer) Tasks.await(new et2(context).g(cloudMessage.getIntent()))).intValue();
        } catch (InterruptedException | ExecutionException unused) {
            return 500;
        }
    }

    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    @s2
    public final void onNotificationDismissed(@x1 Context context, @x1 Bundle bundle) {
        Intent putExtras = new Intent(CloudMessagingReceiver.IntentActionKeys.NOTIFICATION_DISMISS).putExtras(bundle);
        if (au2.B(putExtras)) {
            au2.s(putExtras);
        }
    }
}