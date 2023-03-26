package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.p7700g.p99005.x1;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public final class zaac implements OnCompleteListener {
    public final /* synthetic */ TaskCompletionSource zaa;
    public final /* synthetic */ zaad zab;

    public zaac(zaad zaadVar, TaskCompletionSource taskCompletionSource) {
        this.zab = zaadVar;
        this.zaa = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(@x1 Task task) {
        Map map;
        map = this.zab.zab;
        map.remove(this.zaa);
    }
}