package com.google.android.gms.tasks;

import android.app.Activity;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* loaded from: classes2.dex */
public abstract class Task<TResult> {
    @x1
    public Task<TResult> addOnCanceledListener(@x1 Activity activity, @x1 OnCanceledListener onCanceledListener) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    @x1
    public Task<TResult> addOnCompleteListener(@x1 Activity activity, @x1 OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @x1
    public abstract Task<TResult> addOnFailureListener(@x1 Activity activity, @x1 OnFailureListener onFailureListener);

    @x1
    public abstract Task<TResult> addOnFailureListener(@x1 OnFailureListener onFailureListener);

    @x1
    public abstract Task<TResult> addOnFailureListener(@x1 Executor executor, @x1 OnFailureListener onFailureListener);

    @x1
    public abstract Task<TResult> addOnSuccessListener(@x1 Activity activity, @x1 OnSuccessListener<? super TResult> onSuccessListener);

    @x1
    public abstract Task<TResult> addOnSuccessListener(@x1 OnSuccessListener<? super TResult> onSuccessListener);

    @x1
    public abstract Task<TResult> addOnSuccessListener(@x1 Executor executor, @x1 OnSuccessListener<? super TResult> onSuccessListener);

    @x1
    public <TContinuationResult> Task<TContinuationResult> continueWith(@x1 Continuation<TResult, TContinuationResult> continuation) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @x1
    public <TContinuationResult> Task<TContinuationResult> continueWithTask(@x1 Continuation<TResult, Task<TContinuationResult>> continuation) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @z1
    public abstract Exception getException();

    public abstract TResult getResult();

    public abstract <X extends Throwable> TResult getResult(@x1 Class<X> cls) throws Throwable;

    public abstract boolean isCanceled();

    public abstract boolean isComplete();

    public abstract boolean isSuccessful();

    @x1
    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(@x1 SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    @x1
    public Task<TResult> addOnCanceledListener(@x1 OnCanceledListener onCanceledListener) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    @x1
    public Task<TResult> addOnCompleteListener(@x1 OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @x1
    public <TContinuationResult> Task<TContinuationResult> continueWith(@x1 Executor executor, @x1 Continuation<TResult, TContinuationResult> continuation) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @x1
    public <TContinuationResult> Task<TContinuationResult> continueWithTask(@x1 Executor executor, @x1 Continuation<TResult, Task<TContinuationResult>> continuation) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @x1
    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(@x1 Executor executor, @x1 SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    @x1
    public Task<TResult> addOnCanceledListener(@x1 Executor executor, @x1 OnCanceledListener onCanceledListener) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    @x1
    public Task<TResult> addOnCompleteListener(@x1 Executor executor, @x1 OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }
}