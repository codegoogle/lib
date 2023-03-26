package com.p7700g.p99005;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.p7700g.p99005.m00;
import com.p7700g.p99005.mz;

/* compiled from: FragmentViewLifecycleOwner.java */
/* loaded from: classes.dex */
public class hy implements lz, h60, q00 {
    private final Fragment s;
    private final p00 t;
    private m00.b u;
    private rz v = null;
    private g60 w = null;

    public hy(@x1 Fragment fragment, @x1 p00 p00Var) {
        this.s = fragment;
        this.t = p00Var;
    }

    public void a(@x1 mz.b bVar) {
        this.v.j(bVar);
    }

    public void b() {
        if (this.v == null) {
            this.v = new rz(this);
            this.w = g60.a(this);
        }
    }

    public boolean d() {
        return this.v != null;
    }

    public void e(@z1 Bundle bundle) {
        this.w.d(bundle);
    }

    public void f(@x1 Bundle bundle) {
        this.w.e(bundle);
    }

    public void g(@x1 mz.c cVar) {
        this.v.q(cVar);
    }

    @Override // com.p7700g.p99005.lz
    @x1
    public m00.b getDefaultViewModelProviderFactory() {
        m00.b defaultViewModelProviderFactory = this.s.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.s.mDefaultFactory)) {
            this.u = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.u == null) {
            Application application = null;
            Context applicationContext = this.s.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    break;
                } else if (applicationContext instanceof Application) {
                    application = applicationContext;
                    break;
                } else {
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                }
            }
            this.u = new g00(application, this, this.s.getArguments());
        }
        return this.u;
    }

    @Override // com.p7700g.p99005.qz
    @x1
    public mz getLifecycle() {
        b();
        return this.v;
    }

    @Override // com.p7700g.p99005.h60
    @x1
    public f60 getSavedStateRegistry() {
        b();
        return this.w.b();
    }

    @Override // com.p7700g.p99005.q00
    @x1
    public p00 getViewModelStore() {
        b();
        return this.t;
    }

    @Override // com.p7700g.p99005.lz
    public /* synthetic */ z00 j() {
        return kz.a(this);
    }
}