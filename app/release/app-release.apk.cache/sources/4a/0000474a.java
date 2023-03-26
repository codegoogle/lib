package com.p7700g.p99005;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
/* loaded from: classes3.dex */
public class hu2 {
    private final Executor a;
    @GuardedBy("this")
    private final Map<String, Task<String>> b = new q7();

    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    /* loaded from: classes3.dex */
    public interface a {
        Task<String> start();
    }

    public hu2(Executor executor) {
        this.a = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized Task<String> a(String str, a aVar) {
        Task<String> task = this.b.get(str);
        if (task != null) {
            if (Log.isLoggable(rs2.a, 3)) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    "Joining ongoing request for: ".concat(valueOf);
                } else {
                    new String("Joining ongoing request for: ");
                }
            }
            return task;
        }
        if (Log.isLoggable(rs2.a, 3)) {
            String valueOf2 = String.valueOf(str);
            if (valueOf2.length() != 0) {
                "Making new request for: ".concat(valueOf2);
            } else {
                new String("Making new request for: ");
            }
        }
        Task continueWithTask = aVar.start().continueWithTask(this.a, new Continuation(this, str) { // from class: com.p7700g.p99005.gu2
            private final hu2 a;
            private final String b;

            {
                this.a = this;
                this.b = str;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public Object then(Task task2) {
                this.a.b(this.b, task2);
                return task2;
            }
        });
        this.b.put(str, continueWithTask);
        return continueWithTask;
    }

    public final /* synthetic */ Task b(String str, Task task) throws Exception {
        synchronized (this) {
            this.b.remove(str);
        }
        return task;
    }
}