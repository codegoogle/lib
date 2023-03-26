package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.LegacySavedStateHandleController;
import androidx.lifecycle.SavedStateHandleController;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.m00;

/* compiled from: AbstractSavedStateViewModelFactory.java */
/* loaded from: classes.dex */
public abstract class az extends m00.d implements m00.b {
    public static final String b = "androidx.lifecycle.savedstate.vm.tag";
    private f60 c;
    private mz d;
    private Bundle e;

    public az() {
    }

    @x1
    private <T extends k00> T d(@x1 String str, @x1 Class<T> cls) {
        SavedStateHandleController b2 = LegacySavedStateHandleController.b(this.c, this.d, str, this.e);
        T t = (T) e(str, cls, b2.f());
        t.f("androidx.lifecycle.savedstate.vm.tag", b2);
        return t;
    }

    @Override // com.p7700g.p99005.m00.b
    @x1
    public final <T extends k00> T a(@x1 Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            if (this.d != null) {
                return (T) d(canonicalName, cls);
            }
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // com.p7700g.p99005.m00.b
    @x1
    public final <T extends k00> T b(@x1 Class<T> cls, @x1 z00 z00Var) {
        String str = (String) z00Var.a(m00.c.d);
        if (str != null) {
            if (this.c != null) {
                return (T) d(str, cls);
            }
            return (T) e(str, cls, d00.a(z00Var));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // com.p7700g.p99005.m00.d
    @i2({i2.a.LIBRARY_GROUP})
    public void c(@x1 k00 k00Var) {
        f60 f60Var = this.c;
        if (f60Var != null) {
            LegacySavedStateHandleController.a(k00Var, f60Var, this.d);
        }
    }

    @x1
    public abstract <T extends k00> T e(@x1 String str, @x1 Class<T> cls, @x1 c00 c00Var);

    @SuppressLint({"LambdaLast"})
    public az(@x1 h60 h60Var, @z1 Bundle bundle) {
        this.c = h60Var.getSavedStateRegistry();
        this.d = h60Var.getLifecycle();
        this.e = bundle;
    }
}