package com.p7700g.p99005;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.p7700g.p99005.zu2;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
/* loaded from: classes3.dex */
public class wu2 extends Binder {
    private final a s;

    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    /* loaded from: classes3.dex */
    public interface a {
        Task<Void> a(Intent intent);
    }

    public wu2(a aVar) {
        this.s = aVar;
    }

    public void b(final zu2.a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            Log.isLoggable(rs2.a, 3);
            this.s.a(aVar.a).addOnCompleteListener(uu2.s, new OnCompleteListener(aVar) { // from class: com.p7700g.p99005.vu2
                private final zu2.a a;

                {
                    this.a = aVar;
                }

                @Override // com.google.android.gms.tasks.OnCompleteListener
                public void onComplete(Task task) {
                    this.a.b();
                }
            });
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}