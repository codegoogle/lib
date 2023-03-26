package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.anythink.expressad.foundation.g.a;
import com.google.android.gms.cloudmessaging.zza;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.p7700g.p99005.o0;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.y7;
import com.p7700g.p99005.z1;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
/* loaded from: classes2.dex */
public class Rpc {
    private static int zza;
    private static PendingIntent zzb;
    private static final Executor zzc = zzz.zza;
    private final Context zze;
    private final zzr zzf;
    private final ScheduledExecutorService zzg;
    private Messenger zzi;
    private zza zzj;
    @GuardedBy("responseCallbacks")
    private final y7<String, TaskCompletionSource<Bundle>> zzd = new y7<>();
    private Messenger zzh = new Messenger(new zzy(this, Looper.getMainLooper()));

    public Rpc(@x1 Context context) {
        this.zze = context;
        this.zzf = new zzr(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.zzg = scheduledThreadPoolExecutor;
    }

    public final void zza(Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new zza.C0102zza());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zza) {
                        this.zzj = (zza) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        this.zzi = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    if (Log.isLoggable("Rpc", 3)) {
                        String valueOf = String.valueOf(action);
                        if (valueOf.length() != 0) {
                            "Unexpected response action: ".concat(valueOf);
                            return;
                        } else {
                            new String("Unexpected response action: ");
                            return;
                        }
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra == null) {
                    String stringExtra2 = intent2.getStringExtra("error");
                    if (stringExtra2 == null) {
                        String.valueOf(intent2.getExtras()).length();
                        return;
                    }
                    if (Log.isLoggable("Rpc", 3)) {
                        if (stringExtra2.length() != 0) {
                            "Received InstanceID error ".concat(stringExtra2);
                        } else {
                            new String("Received InstanceID error ");
                        }
                    }
                    if (stringExtra2.startsWith(a.bQ)) {
                        String[] split = stringExtra2.split("\\|");
                        if (split.length > 2 && "ID".equals(split[1])) {
                            String str = split[2];
                            String str2 = split[3];
                            if (str2.startsWith(":")) {
                                str2 = str2.substring(1);
                            }
                            zza(str, intent2.putExtra("error", str2).getExtras());
                            return;
                        } else if (stringExtra2.length() != 0) {
                            "Unexpected structured response ".concat(stringExtra2);
                            return;
                        } else {
                            new String("Unexpected structured response ");
                            return;
                        }
                    }
                    synchronized (this.zzd) {
                        for (int i = 0; i < this.zzd.size(); i++) {
                            zza(this.zzd.n(i), intent2.getExtras());
                        }
                    }
                    return;
                }
                Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                if (!matcher.matches()) {
                    if (Log.isLoggable("Rpc", 3)) {
                        if (stringExtra.length() != 0) {
                            "Unexpected response string: ".concat(stringExtra);
                            return;
                        } else {
                            new String("Unexpected response string: ");
                            return;
                        }
                    }
                    return;
                }
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                if (group != null) {
                    Bundle extras = intent2.getExtras();
                    extras.putString("registration_id", group2);
                    zza(group, extras);
                }
            }
        }
    }

    private static boolean zzb(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    @o0
    private final Task<Bundle> zzc(Bundle bundle) {
        String zza2 = zza();
        TaskCompletionSource<Bundle> taskCompletionSource = new TaskCompletionSource<>();
        synchronized (this.zzd) {
            this.zzd.put(zza2, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.zzf.zza() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        zza(this.zze, intent);
        StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 5);
        sb.append("|ID|");
        sb.append(zza2);
        sb.append(a.bQ);
        intent.putExtra("kid", sb.toString());
        if (Log.isLoggable("Rpc", 3)) {
            String.valueOf(intent.getExtras()).length();
        }
        intent.putExtra("google.messenger", this.zzh);
        if (this.zzi != null || this.zzj != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.zzi;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.zzj.zza(obtain);
                }
            } catch (RemoteException unused) {
                Log.isLoggable("Rpc", 3);
            }
            taskCompletionSource.getTask().addOnCompleteListener(zzc, new OnCompleteListener(this, zza2, this.zzg.schedule(new Runnable(taskCompletionSource) { // from class: com.google.android.gms.cloudmessaging.zzu
                private final TaskCompletionSource zza;

                {
                    this.zza = taskCompletionSource;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Rpc.zza(this.zza);
                }
            }, 30L, TimeUnit.SECONDS)) { // from class: com.google.android.gms.cloudmessaging.zzx
                private final Rpc zza;
                private final String zzb;
                private final ScheduledFuture zzc;

                {
                    this.zza = this;
                    this.zzb = zza2;
                    this.zzc = r3;
                }

                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    this.zza.zza(this.zzb, this.zzc, task);
                }
            });
            return taskCompletionSource.getTask();
        }
        if (this.zzf.zza() == 2) {
            this.zze.sendBroadcast(intent);
        } else {
            this.zze.startService(intent);
        }
        taskCompletionSource.getTask().addOnCompleteListener(zzc, new OnCompleteListener(this, zza2, this.zzg.schedule(new Runnable(taskCompletionSource) { // from class: com.google.android.gms.cloudmessaging.zzu
            private final TaskCompletionSource zza;

            {
                this.zza = taskCompletionSource;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Rpc.zza(this.zza);
            }
        }, 30L, TimeUnit.SECONDS)) { // from class: com.google.android.gms.cloudmessaging.zzx
            private final Rpc zza;
            private final String zzb;
            private final ScheduledFuture zzc;

            {
                this.zza = this;
                this.zzb = zza2;
                this.zzc = r3;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.zza.zza(this.zzb, this.zzc, task);
            }
        });
        return taskCompletionSource.getTask();
    }

    @x1
    public Task<Bundle> send(@x1 Bundle bundle) {
        if (this.zzf.zzb() >= 12000000) {
            return zze.zza(this.zze).zzb(1, bundle).continueWith(zzc, zzt.zza);
        }
        if (!(this.zzf.zza() != 0)) {
            return Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        return zzc(bundle).continueWithTask(zzc, new Continuation(this, bundle) { // from class: com.google.android.gms.cloudmessaging.zzv
            private final Rpc zza;
            private final Bundle zzb;

            {
                this.zza = this;
                this.zzb = bundle;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.zza.zza(this.zzb, task);
            }
        });
    }

    private static synchronized void zza(Context context, Intent intent) {
        synchronized (Rpc.class) {
            if (zzb == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                zzb = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", zzb);
        }
    }

    private final void zza(String str, @z1 Bundle bundle) {
        synchronized (this.zzd) {
            TaskCompletionSource<Bundle> remove = this.zzd.remove(str);
            if (remove == null) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    "Missing callback for ".concat(valueOf);
                } else {
                    new String("Missing callback for ");
                }
                return;
            }
            remove.setResult(bundle);
        }
    }

    private static synchronized String zza() {
        String num;
        synchronized (Rpc.class) {
            int i = zza;
            zza = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    public final /* synthetic */ void zza(String str, ScheduledFuture scheduledFuture, Task task) {
        synchronized (this.zzd) {
            this.zzd.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public static final /* synthetic */ void zza(TaskCompletionSource taskCompletionSource) {
        taskCompletionSource.trySetException(new IOException("TIMEOUT"));
    }

    public final /* synthetic */ Task zza(Bundle bundle, Task task) throws Exception {
        return (task.isSuccessful() && zzb((Bundle) task.getResult())) ? zzc(bundle).onSuccessTask(zzc, zzw.zza) : task;
    }

    public static final /* synthetic */ Task zza(Bundle bundle) throws Exception {
        if (zzb(bundle)) {
            return Tasks.forResult(null);
        }
        return Tasks.forResult(bundle);
    }

    public static final /* synthetic */ Bundle zza(Task task) throws Exception {
        if (task.isSuccessful()) {
            return (Bundle) task.getResult();
        }
        if (Log.isLoggable("Rpc", 3)) {
            String.valueOf(task.getException()).length();
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
    }
}