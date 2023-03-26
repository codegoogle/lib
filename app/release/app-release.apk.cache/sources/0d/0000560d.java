package com.p7700g.p99005;

import android.animation.Animator;
import org.jetbrains.annotations.NotNull;

/* compiled from: Animator.kt */
@vo4(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u001a¤\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00022#\b\u0006\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\bø\u0001\u0000\u001aZ\u0010\f\u001a\u00020\r*\u00020\u00022#\b\u0006\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0087\bø\u0001\u0000\u001a5\u0010\u0010\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\bø\u0001\u0000\u001a5\u0010\u0012\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\bø\u0001\u0000\u001a5\u0010\u0013\u001a\u00020\r*\u00020\u00022#\b\u0004\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0087\bø\u0001\u0000\u001a5\u0010\u0014\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\bø\u0001\u0000\u001a5\u0010\u0015\u001a\u00020\r*\u00020\u00022#\b\u0004\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0087\bø\u0001\u0000\u001a5\u0010\u0016\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"addListener", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "onEnd", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "animator", "", "onStart", "onCancel", "onRepeat", "addPauseListener", "Landroid/animation/Animator$AnimatorPauseListener;", "onResume", "onPause", "doOnCancel", "action", "doOnEnd", "doOnPause", "doOnRepeat", "doOnResume", "doOnStart", "core-ktx_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class pf {

    /* compiled from: Animator.kt */
    @vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/Animator;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes.dex */
    public static final class a extends e25 implements f05<Animator, yq4> {
        public static final a t = new a();

        public a() {
            super(1);
        }

        @Override // com.p7700g.p99005.f05
        public /* bridge */ /* synthetic */ yq4 M(Animator animator) {
            a(animator);
            return yq4.a;
        }

        public final void a(@NotNull Animator animator) {
            c25.p(animator, "it");
        }
    }

    /* compiled from: Animator.kt */
    @vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/Animator;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes.dex */
    public static final class b extends e25 implements f05<Animator, yq4> {
        public static final b t = new b();

        public b() {
            super(1);
        }

        @Override // com.p7700g.p99005.f05
        public /* bridge */ /* synthetic */ yq4 M(Animator animator) {
            a(animator);
            return yq4.a;
        }

        public final void a(@NotNull Animator animator) {
            c25.p(animator, "it");
        }
    }

    /* compiled from: Animator.kt */
    @vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/Animator;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes.dex */
    public static final class c extends e25 implements f05<Animator, yq4> {
        public static final c t = new c();

        public c() {
            super(1);
        }

        @Override // com.p7700g.p99005.f05
        public /* bridge */ /* synthetic */ yq4 M(Animator animator) {
            a(animator);
            return yq4.a;
        }

        public final void a(@NotNull Animator animator) {
            c25.p(animator, "it");
        }
    }

    /* compiled from: Animator.kt */
    @vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/Animator;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes.dex */
    public static final class d extends e25 implements f05<Animator, yq4> {
        public static final d t = new d();

        public d() {
            super(1);
        }

        @Override // com.p7700g.p99005.f05
        public /* bridge */ /* synthetic */ yq4 M(Animator animator) {
            a(animator);
            return yq4.a;
        }

        public final void a(@NotNull Animator animator) {
            c25.p(animator, "it");
        }
    }

    /* compiled from: Animator.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animator", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes.dex */
    public static final class e implements Animator.AnimatorListener {
        public final /* synthetic */ f05<Animator, yq4> s;
        public final /* synthetic */ f05<Animator, yq4> t;
        public final /* synthetic */ f05<Animator, yq4> u;
        public final /* synthetic */ f05<Animator, yq4> v;

        /* JADX WARN: Multi-variable type inference failed */
        public e(f05<? super Animator, yq4> f05Var, f05<? super Animator, yq4> f05Var2, f05<? super Animator, yq4> f05Var3, f05<? super Animator, yq4> f05Var4) {
            this.s = f05Var;
            this.t = f05Var2;
            this.u = f05Var3;
            this.v = f05Var4;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull Animator animator) {
            c25.p(animator, "animator");
            this.u.M(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animator) {
            c25.p(animator, "animator");
            this.t.M(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NotNull Animator animator) {
            c25.p(animator, "animator");
            this.s.M(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull Animator animator) {
            c25.p(animator, "animator");
            this.v.M(animator);
        }
    }

    /* compiled from: Animator.kt */
    @vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/Animator;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes.dex */
    public static final class f extends e25 implements f05<Animator, yq4> {
        public static final f t = new f();

        public f() {
            super(1);
        }

        @Override // com.p7700g.p99005.f05
        public /* bridge */ /* synthetic */ yq4 M(Animator animator) {
            a(animator);
            return yq4.a;
        }

        public final void a(@NotNull Animator animator) {
            c25.p(animator, "it");
        }
    }

    /* compiled from: Animator.kt */
    @vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/Animator;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes.dex */
    public static final class g extends e25 implements f05<Animator, yq4> {
        public static final g t = new g();

        public g() {
            super(1);
        }

        @Override // com.p7700g.p99005.f05
        public /* bridge */ /* synthetic */ yq4 M(Animator animator) {
            a(animator);
            return yq4.a;
        }

        public final void a(@NotNull Animator animator) {
            c25.p(animator, "it");
        }
    }

    /* compiled from: Animator.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"androidx/core/animation/AnimatorKt$addPauseListener$listener$1", "Landroid/animation/Animator$AnimatorPauseListener;", "onAnimationPause", "", "animator", "Landroid/animation/Animator;", "onAnimationResume", "core-ktx_release"}, k = 1, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes.dex */
    public static final class h implements Animator.AnimatorPauseListener {
        public final /* synthetic */ f05<Animator, yq4> s;
        public final /* synthetic */ f05<Animator, yq4> t;

        /* JADX WARN: Multi-variable type inference failed */
        public h(f05<? super Animator, yq4> f05Var, f05<? super Animator, yq4> f05Var2) {
            this.s = f05Var;
            this.t = f05Var2;
        }

        @Override // android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(@NotNull Animator animator) {
            c25.p(animator, "animator");
            this.s.M(animator);
        }

        @Override // android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(@NotNull Animator animator) {
            c25.p(animator, "animator");
            this.t.M(animator);
        }
    }

    /* compiled from: Animator.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animator", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes.dex */
    public static final class i implements Animator.AnimatorListener {
        public final /* synthetic */ f05 s;

        public i(f05 f05Var) {
            this.s = f05Var;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull Animator animator) {
            c25.p(animator, "animator");
            this.s.M(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animator) {
            c25.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NotNull Animator animator) {
            c25.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull Animator animator) {
            c25.p(animator, "animator");
        }
    }

    /* compiled from: Animator.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animator", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes.dex */
    public static final class j implements Animator.AnimatorListener {
        public final /* synthetic */ f05 s;

        public j(f05 f05Var) {
            this.s = f05Var;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull Animator animator) {
            c25.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animator) {
            c25.p(animator, "animator");
            this.s.M(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NotNull Animator animator) {
            c25.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull Animator animator) {
            c25.p(animator, "animator");
        }
    }

    /* compiled from: Animator.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"androidx/core/animation/AnimatorKt$addPauseListener$listener$1", "Landroid/animation/Animator$AnimatorPauseListener;", "onAnimationPause", "", "animator", "Landroid/animation/Animator;", "onAnimationResume", "core-ktx_release"}, k = 1, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes.dex */
    public static final class k implements Animator.AnimatorPauseListener {
        public final /* synthetic */ f05 s;

        public k(f05 f05Var) {
            this.s = f05Var;
        }

        @Override // android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(@NotNull Animator animator) {
            c25.p(animator, "animator");
            this.s.M(animator);
        }

        @Override // android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(@NotNull Animator animator) {
            c25.p(animator, "animator");
        }
    }

    /* compiled from: Animator.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animator", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes.dex */
    public static final class l implements Animator.AnimatorListener {
        public final /* synthetic */ f05 s;

        public l(f05 f05Var) {
            this.s = f05Var;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull Animator animator) {
            c25.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animator) {
            c25.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NotNull Animator animator) {
            c25.p(animator, "animator");
            this.s.M(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull Animator animator) {
            c25.p(animator, "animator");
        }
    }

    /* compiled from: Animator.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"androidx/core/animation/AnimatorKt$addPauseListener$listener$1", "Landroid/animation/Animator$AnimatorPauseListener;", "onAnimationPause", "", "animator", "Landroid/animation/Animator;", "onAnimationResume", "core-ktx_release"}, k = 1, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes.dex */
    public static final class m implements Animator.AnimatorPauseListener {
        public final /* synthetic */ f05 s;

        public m(f05 f05Var) {
            this.s = f05Var;
        }

        @Override // android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(@NotNull Animator animator) {
            c25.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(@NotNull Animator animator) {
            c25.p(animator, "animator");
            this.s.M(animator);
        }
    }

    /* compiled from: Animator.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animator", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes.dex */
    public static final class n implements Animator.AnimatorListener {
        public final /* synthetic */ f05 s;

        public n(f05 f05Var) {
            this.s = f05Var;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull Animator animator) {
            c25.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animator) {
            c25.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NotNull Animator animator) {
            c25.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull Animator animator) {
            c25.p(animator, "animator");
            this.s.M(animator);
        }
    }

    @NotNull
    public static final Animator.AnimatorListener a(@NotNull Animator animator, @NotNull f05<? super Animator, yq4> f05Var, @NotNull f05<? super Animator, yq4> f05Var2, @NotNull f05<? super Animator, yq4> f05Var3, @NotNull f05<? super Animator, yq4> f05Var4) {
        c25.p(animator, "<this>");
        c25.p(f05Var, "onEnd");
        c25.p(f05Var2, "onStart");
        c25.p(f05Var3, "onCancel");
        c25.p(f05Var4, "onRepeat");
        e eVar = new e(f05Var4, f05Var, f05Var3, f05Var2);
        animator.addListener(eVar);
        return eVar;
    }

    public static /* synthetic */ Animator.AnimatorListener b(Animator animator, f05 f05Var, f05 f05Var2, f05 f05Var3, f05 f05Var4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f05Var = a.t;
        }
        if ((i2 & 2) != 0) {
            f05Var2 = b.t;
        }
        if ((i2 & 4) != 0) {
            f05Var3 = c.t;
        }
        if ((i2 & 8) != 0) {
            f05Var4 = d.t;
        }
        c25.p(animator, "<this>");
        c25.p(f05Var, "onEnd");
        c25.p(f05Var2, "onStart");
        c25.p(f05Var3, "onCancel");
        c25.p(f05Var4, "onRepeat");
        e eVar = new e(f05Var4, f05Var, f05Var3, f05Var2);
        animator.addListener(eVar);
        return eVar;
    }

    @e2(19)
    @NotNull
    public static final Animator.AnimatorPauseListener c(@NotNull Animator animator, @NotNull f05<? super Animator, yq4> f05Var, @NotNull f05<? super Animator, yq4> f05Var2) {
        c25.p(animator, "<this>");
        c25.p(f05Var, "onResume");
        c25.p(f05Var2, "onPause");
        h hVar = new h(f05Var2, f05Var);
        animator.addPauseListener(hVar);
        return hVar;
    }

    public static /* synthetic */ Animator.AnimatorPauseListener d(Animator animator, f05 f05Var, f05 f05Var2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f05Var = f.t;
        }
        if ((i2 & 2) != 0) {
            f05Var2 = g.t;
        }
        c25.p(animator, "<this>");
        c25.p(f05Var, "onResume");
        c25.p(f05Var2, "onPause");
        h hVar = new h(f05Var2, f05Var);
        animator.addPauseListener(hVar);
        return hVar;
    }

    @NotNull
    public static final Animator.AnimatorListener e(@NotNull Animator animator, @NotNull f05<? super Animator, yq4> f05Var) {
        c25.p(animator, "<this>");
        c25.p(f05Var, "action");
        i iVar = new i(f05Var);
        animator.addListener(iVar);
        return iVar;
    }

    @NotNull
    public static final Animator.AnimatorListener f(@NotNull Animator animator, @NotNull f05<? super Animator, yq4> f05Var) {
        c25.p(animator, "<this>");
        c25.p(f05Var, "action");
        j jVar = new j(f05Var);
        animator.addListener(jVar);
        return jVar;
    }

    @e2(19)
    @NotNull
    public static final Animator.AnimatorPauseListener g(@NotNull Animator animator, @NotNull f05<? super Animator, yq4> f05Var) {
        c25.p(animator, "<this>");
        c25.p(f05Var, "action");
        k kVar = new k(f05Var);
        animator.addPauseListener(kVar);
        return kVar;
    }

    @NotNull
    public static final Animator.AnimatorListener h(@NotNull Animator animator, @NotNull f05<? super Animator, yq4> f05Var) {
        c25.p(animator, "<this>");
        c25.p(f05Var, "action");
        l lVar = new l(f05Var);
        animator.addListener(lVar);
        return lVar;
    }

    @e2(19)
    @NotNull
    public static final Animator.AnimatorPauseListener i(@NotNull Animator animator, @NotNull f05<? super Animator, yq4> f05Var) {
        c25.p(animator, "<this>");
        c25.p(f05Var, "action");
        m mVar = new m(f05Var);
        animator.addPauseListener(mVar);
        return mVar;
    }

    @NotNull
    public static final Animator.AnimatorListener j(@NotNull Animator animator, @NotNull f05<? super Animator, yq4> f05Var) {
        c25.p(animator, "<this>");
        c25.p(f05Var, "action");
        n nVar = new n(f05Var);
        animator.addListener(nVar);
        return nVar;
    }
}