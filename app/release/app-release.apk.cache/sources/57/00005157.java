package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: FragmentHostCallback.java */
/* loaded from: classes.dex */
public abstract class mx<E> extends jx {
    @z1
    private final Activity s;
    @x1
    private final Context t;
    @x1
    private final Handler u;
    private final int v;
    public final FragmentManager w;

    public mx(@x1 Context context, @x1 Handler handler, int i) {
        this(context instanceof Activity ? (Activity) context : null, context, handler, i);
    }

    @Override // com.p7700g.p99005.jx
    @z1
    public View d(int i) {
        return null;
    }

    @Override // com.p7700g.p99005.jx
    public boolean e() {
        return true;
    }

    @z1
    public Activity f() {
        return this.s;
    }

    @x1
    public Context g() {
        return this.t;
    }

    @x1
    public Handler h() {
        return this.u;
    }

    public void i(@x1 String str, @z1 FileDescriptor fileDescriptor, @x1 PrintWriter printWriter, @z1 String[] strArr) {
    }

    @z1
    public abstract E j();

    @x1
    public LayoutInflater k() {
        return LayoutInflater.from(this.t);
    }

    public int l() {
        return this.v;
    }

    public boolean n() {
        return true;
    }

    @Deprecated
    public void o(@x1 Fragment fragment, @x1 String[] strArr, int i) {
    }

    public boolean p(@x1 Fragment fragment) {
        return true;
    }

    public boolean q(@x1 String str) {
        return false;
    }

    public void r(@x1 Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        s(fragment, intent, i, null);
    }

    public void s(@x1 Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, @z1 Bundle bundle) {
        if (i == -1) {
            gh.t(this.t, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    @Deprecated
    public void t(@x1 Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, @z1 Intent intent, int i2, int i3, int i4, @z1 Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            sf.N(this.s, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
    }

    public void u() {
    }

    public mx(@x1 hx hxVar) {
        this(hxVar, hxVar, new Handler(), 0);
    }

    public mx(@z1 Activity activity, @x1 Context context, @x1 Handler handler, int i) {
        this.w = new px();
        this.s = activity;
        this.t = (Context) jp.m(context, "context == null");
        this.u = (Handler) jp.m(handler, "handler == null");
        this.v = i;
    }
}