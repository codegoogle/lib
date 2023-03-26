package com.p7700g.p99005;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.OnBackPressedDispatcher;
import com.p7700g.p99005.mz;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ComponentDialog.kt */
@vo4(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u000fJ\b\u0010\u0019\u001a\u00020\u0011H\u0002J\b\u0010\u001a\u001a\u00020\u0011H\u0017J\u0012\u0010\u001b\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0015J\b\u0010\u001e\u001a\u00020\u0011H\u0015J\b\u0010\u001f\u001a\u00020\u0011H\u0015J\u0010\u0010 \u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010 \u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0007H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Landroidx/activity/ComponentDialog;", "Landroid/app/Dialog;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/activity/OnBackPressedDispatcherOwner;", "context", "Landroid/content/Context;", "themeResId", "", "(Landroid/content/Context;I)V", "_lifecycleRegistry", "Landroidx/lifecycle/LifecycleRegistry;", "lifecycleRegistry", "getLifecycleRegistry", "()Landroidx/lifecycle/LifecycleRegistry;", "onBackPressedDispatcher", "Landroidx/activity/OnBackPressedDispatcher;", "addContentView", "", com.anythink.expressad.a.B, "Landroid/view/View;", "params", "Landroid/view/ViewGroup$LayoutParams;", "getLifecycle", "Landroidx/lifecycle/Lifecycle;", "getOnBackPressedDispatcher", "initViewTreeOwners", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "setContentView", "layoutResID", "activity_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public class v extends Dialog implements qz, x {
    @Nullable
    private rz s;
    @NotNull
    private final OnBackPressedDispatcher t;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @gz4
    public v(@NotNull Context context) {
        this(context, 0, 2, null);
        c25.p(context, "context");
    }

    public /* synthetic */ v(Context context, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? 0 : i);
    }

    private final rz a() {
        rz rzVar = this.s;
        if (rzVar == null) {
            rz rzVar2 = new rz(this);
            this.s = rzVar2;
            return rzVar2;
        }
        return rzVar;
    }

    private final void b() {
        Window window = getWindow();
        c25.m(window);
        r00.b(window.getDecorView(), this);
        Window window2 = getWindow();
        c25.m(window2);
        View decorView = window2.getDecorView();
        c25.o(decorView, "window!!.decorView");
        z.b(decorView, this);
    }

    public static /* synthetic */ void d(v vVar) {
        g(vVar);
    }

    public static final void g(v vVar) {
        c25.p(vVar, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(@NotNull View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        c25.p(view, com.anythink.expressad.a.B);
        b();
        super.addContentView(view, layoutParams);
    }

    @Override // com.p7700g.p99005.x
    @NotNull
    public final OnBackPressedDispatcher c() {
        return this.t;
    }

    @Override // com.p7700g.p99005.qz
    @NotNull
    public final mz getLifecycle() {
        return a();
    }

    @Override // android.app.Dialog
    @t0
    public void onBackPressed() {
        this.t.e();
    }

    @Override // android.app.Dialog
    @t0
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        a().j(mz.b.ON_CREATE);
    }

    @Override // android.app.Dialog
    @t0
    public void onStart() {
        super.onStart();
        a().j(mz.b.ON_RESUME);
    }

    @Override // android.app.Dialog
    @t0
    public void onStop() {
        a().j(mz.b.ON_DESTROY);
        this.s = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        b();
        super.setContentView(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @gz4
    public v(@NotNull Context context, @m2 int i) {
        super(context, i);
        c25.p(context, "context");
        this.t = new OnBackPressedDispatcher(new Runnable() { // from class: com.p7700g.p99005.t
            @Override // java.lang.Runnable
            public final void run() {
                v.d(v.this);
            }
        });
    }

    @Override // android.app.Dialog
    public void setContentView(@NotNull View view) {
        c25.p(view, com.anythink.expressad.a.B);
        b();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(@NotNull View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        c25.p(view, com.anythink.expressad.a.B);
        b();
        super.setContentView(view, layoutParams);
    }
}