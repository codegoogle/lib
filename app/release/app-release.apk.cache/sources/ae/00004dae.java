package com.p7700g.p99005;

import com.p7700g.p99005.k00;
import com.p7700g.p99005.m00;
import com.p7700g.p99005.z00;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewModelLazy.kt */
@vo4(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003BA\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\u0002\u0010\rJ\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0012\u0010\u000e\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Landroidx/lifecycle/ViewModelLazy;", "VM", "Landroidx/lifecycle/ViewModel;", "Lkotlin/Lazy;", "viewModelClass", "Lkotlin/reflect/KClass;", "storeProducer", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelStore;", "factoryProducer", "Landroidx/lifecycle/ViewModelProvider$Factory;", "extrasProducer", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "cached", "Landroidx/lifecycle/ViewModel;", "value", "getValue", "()Landroidx/lifecycle/ViewModel;", "isInitialized", "", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l00<VM extends k00> implements qo4<VM> {
    @NotNull
    private final u55<VM> s;
    @NotNull
    private final uz4<p00> t;
    @NotNull
    private final uz4<m00.b> u;
    @NotNull
    private final uz4<z00> v;
    @Nullable
    private VM w;

    /* compiled from: ViewModelLazy.kt */
    @vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/viewmodel/CreationExtras$Empty;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a extends e25 implements uz4<z00.a> {
        public static final a t = new a();

        public a() {
            super(0);
        }

        @Override // com.p7700g.p99005.uz4
        @NotNull
        /* renamed from: h */
        public final z00.a x() {
            return z00.a.b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @gz4
    public l00(@NotNull u55<VM> u55Var, @NotNull uz4<? extends p00> uz4Var, @NotNull uz4<? extends m00.b> uz4Var2) {
        this(u55Var, uz4Var, uz4Var2, null, 8, null);
        c25.p(u55Var, "viewModelClass");
        c25.p(uz4Var, "storeProducer");
        c25.p(uz4Var2, "factoryProducer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @gz4
    public l00(@NotNull u55<VM> u55Var, @NotNull uz4<? extends p00> uz4Var, @NotNull uz4<? extends m00.b> uz4Var2, @NotNull uz4<? extends z00> uz4Var3) {
        c25.p(u55Var, "viewModelClass");
        c25.p(uz4Var, "storeProducer");
        c25.p(uz4Var2, "factoryProducer");
        c25.p(uz4Var3, "extrasProducer");
        this.s = u55Var;
        this.t = uz4Var;
        this.u = uz4Var2;
        this.v = uz4Var3;
    }

    @Override // com.p7700g.p99005.qo4
    @NotNull
    /* renamed from: a */
    public VM getValue() {
        VM vm = this.w;
        if (vm == null) {
            VM vm2 = (VM) new m00(this.t.x(), this.u.x(), this.v.x()).a(yy4.e(this.s));
            this.w = vm2;
            return vm2;
        }
        return vm;
    }

    @Override // com.p7700g.p99005.qo4
    public boolean isInitialized() {
        return this.w != null;
    }

    public /* synthetic */ l00(u55 u55Var, uz4 uz4Var, uz4 uz4Var2, uz4 uz4Var3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(u55Var, uz4Var, uz4Var2, (i & 8) != 0 ? a.t : uz4Var3);
    }
}