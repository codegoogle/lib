package com.google.android.gms.tasks;

import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* loaded from: classes2.dex */
public final class Tasks {
    private Tasks() {
    }

    public static <TResult> TResult await(@x1 Task<TResult> task) throws ExecutionException, InterruptedException {
        Preconditions.checkNotMainThread();
        Preconditions.checkNotNull(task, "Task must not be null");
        if (task.isComplete()) {
            return (TResult) zza(task);
        }
        zzad zzadVar = new zzad(null);
        zzb(task, zzadVar);
        zzadVar.zza();
        return (TResult) zza(task);
    }

    @x1
    @Deprecated
    public static <TResult> Task<TResult> call(@x1 Callable<TResult> callable) {
        return call(TaskExecutors.MAIN_THREAD, callable);
    }

    @x1
    public static <TResult> Task<TResult> forCanceled() {
        zzw zzwVar = new zzw();
        zzwVar.zzc();
        return zzwVar;
    }

    @x1
    public static <TResult> Task<TResult> forException(@x1 Exception exc) {
        zzw zzwVar = new zzw();
        zzwVar.zza(exc);
        return zzwVar;
    }

    @x1
    public static <TResult> Task<TResult> forResult(TResult tresult) {
        zzw zzwVar = new zzw();
        zzwVar.zzb(tresult);
        return zzwVar;
    }

    @x1
    public static Task<Void> whenAll(@z1 Collection<? extends Task<?>> collection) {
        if (collection != null && !collection.isEmpty()) {
            for (Task<?> task : collection) {
                Objects.requireNonNull(task, "null tasks are not accepted");
            }
            zzw zzwVar = new zzw();
            zzaf zzafVar = new zzaf(collection.size(), zzwVar);
            for (Task<?> task2 : collection) {
                zzb(task2, zzafVar);
            }
            return zzwVar;
        }
        return forResult(null);
    }

    @x1
    public static Task<List<Task<?>>> whenAllComplete(@z1 Collection<? extends Task<?>> collection) {
        if (collection != null && !collection.isEmpty()) {
            return whenAll(collection).continueWithTask(TaskExecutors.MAIN_THREAD, new zzab(collection));
        }
        return forResult(Collections.emptyList());
    }

    @x1
    public static <TResult> Task<List<TResult>> whenAllSuccess(@z1 Collection<? extends Task> collection) {
        if (collection != null && !collection.isEmpty()) {
            return (Task<List<TResult>>) whenAll(collection).continueWith(TaskExecutors.MAIN_THREAD, new zzaa(collection));
        }
        return forResult(Collections.emptyList());
    }

    @x1
    public static <T> Task<T> withTimeout(@x1 Task<T> task, long j, @x1 TimeUnit timeUnit) {
        Preconditions.checkNotNull(task, "Task must not be null");
        Preconditions.checkArgument(j > 0, "Timeout must be positive");
        Preconditions.checkNotNull(timeUnit, "TimeUnit must not be null");
        final zzb zzbVar = new zzb();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(zzbVar);
        final com.google.android.gms.internal.tasks.zza zzaVar = new com.google.android.gms.internal.tasks.zza(Looper.getMainLooper());
        zzaVar.postDelayed(new Runnable() { // from class: com.google.android.gms.tasks.zzy
            @Override // java.lang.Runnable
            public final void run() {
                TaskCompletionSource.this.trySetException(new TimeoutException());
            }
        }, timeUnit.toMillis(j));
        task.addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.tasks.zzx
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                com.google.android.gms.internal.tasks.zza zzaVar2 = com.google.android.gms.internal.tasks.zza.this;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                zzb zzbVar2 = zzbVar;
                zzaVar2.removeCallbacksAndMessages(null);
                if (task2.isSuccessful()) {
                    taskCompletionSource2.trySetResult(task2.getResult());
                } else if (task2.isCanceled()) {
                    zzbVar2.zza();
                } else {
                    Exception exception = task2.getException();
                    exception.getClass();
                    taskCompletionSource2.trySetException(exception);
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    private static <TResult> TResult zza(@x1 Task<TResult> task) throws ExecutionException {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.getException());
    }

    private static <T> void zzb(Task<T> task, zzae<? super T> zzaeVar) {
        Executor executor = TaskExecutors.zza;
        task.addOnSuccessListener(executor, zzaeVar);
        task.addOnFailureListener(executor, zzaeVar);
        task.addOnCanceledListener(executor, zzaeVar);
    }

    @x1
    @Deprecated
    public static <TResult> Task<TResult> call(@x1 Executor executor, @x1 Callable<TResult> callable) {
        Preconditions.checkNotNull(executor, "Executor must not be null");
        Preconditions.checkNotNull(callable, "Callback must not be null");
        zzw zzwVar = new zzw();
        executor.execute(new zzz(zzwVar, callable));
        return zzwVar;
    }

    @x1
    public static Task<List<Task<?>>> whenAllComplete(@z1 Task<?>... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return whenAllComplete(Arrays.asList(taskArr));
        }
        return forResult(Collections.emptyList());
    }

    @x1
    public static <TResult> Task<List<TResult>> whenAllSuccess(@z1 Task... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return whenAllSuccess(Arrays.asList(taskArr));
        }
        return forResult(Collections.emptyList());
    }

    public static <TResult> TResult await(@x1 Task<TResult> task, long j, @x1 TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        Preconditions.checkNotMainThread();
        Preconditions.checkNotNull(task, "Task must not be null");
        Preconditions.checkNotNull(timeUnit, "TimeUnit must not be null");
        if (task.isComplete()) {
            return (TResult) zza(task);
        }
        zzad zzadVar = new zzad(null);
        zzb(task, zzadVar);
        if (zzadVar.zzb(j, timeUnit)) {
            return (TResult) zza(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @x1
    public static Task<Void> whenAll(@z1 Task<?>... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return whenAll(Arrays.asList(taskArr));
        }
        return forResult(null);
    }
}