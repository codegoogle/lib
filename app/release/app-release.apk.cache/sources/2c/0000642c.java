package com.p7700g.p99005;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.anythink.core.api.ATAdConst;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: View.kt */
@vo4(d1 = {"\u0000j\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a5\u0010 \u001a\u00020!*\u00020\u00022#\b\u0004\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020!0#H\u0086\bø\u0001\u0000\u001a5\u0010'\u001a\u00020!*\u00020\u00022#\b\u0004\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020!0#H\u0086\bø\u0001\u0000\u001a5\u0010(\u001a\u00020!*\u00020\u00022#\b\u0004\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020!0#H\u0086\bø\u0001\u0000\u001a5\u0010)\u001a\u00020!*\u00020\u00022#\b\u0004\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020!0#H\u0086\bø\u0001\u0000\u001a5\u0010*\u001a\u00020+*\u00020\u00022#\b\u0004\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020!0#H\u0086\bø\u0001\u0000\u001a\u0014\u0010,\u001a\u00020-*\u00020\u00022\b\b\u0002\u0010.\u001a\u00020/\u001a(\u00100\u001a\u000201*\u00020\u00022\u0006\u00102\u001a\u0002032\u000e\b\u0004\u0010\"\u001a\b\u0012\u0004\u0012\u00020!04H\u0086\bø\u0001\u0000\u001a(\u00105\u001a\u000201*\u00020\u00022\u0006\u00102\u001a\u0002032\u000e\b\u0004\u0010\"\u001a\b\u0012\u0004\u0012\u00020!04H\u0087\bø\u0001\u0000\u001a\u0017\u00106\u001a\u00020!*\u00020\u00022\b\b\u0001\u00107\u001a\u00020\u0013H\u0086\b\u001a:\u00108\u001a\u00020!\"\n\b\u0000\u00109\u0018\u0001*\u00020:*\u00020\u00022\u0017\u0010;\u001a\u0013\u0012\u0004\u0012\u0002H9\u0012\u0004\u0012\u00020!0#¢\u0006\u0002\b<H\u0087\bø\u0001\u0000¢\u0006\u0002\b=\u001a)\u00108\u001a\u00020!*\u00020\u00022\u0017\u0010;\u001a\u0013\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020!0#¢\u0006\u0002\b<H\u0086\bø\u0001\u0000\u001a5\u0010>\u001a\u00020!*\u00020\u00022\b\b\u0003\u0010?\u001a\u00020\u00132\b\b\u0003\u0010@\u001a\u00020\u00132\b\b\u0003\u0010A\u001a\u00020\u00132\b\b\u0003\u0010B\u001a\u00020\u0013H\u0086\b\u001a5\u0010C\u001a\u00020!*\u00020\u00022\b\b\u0003\u0010D\u001a\u00020\u00132\b\b\u0003\u0010@\u001a\u00020\u00132\b\b\u0003\u0010E\u001a\u00020\u00132\b\b\u0003\u0010B\u001a\u00020\u0013H\u0087\b\"\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001b\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0004\"*\u0010\n\u001a\u00020\t*\u00020\u00022\u0006\u0010\b\u001a\u00020\t8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\"*\u0010\u000e\u001a\u00020\t*\u00020\u00022\u0006\u0010\b\u001a\u00020\t8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\r\"*\u0010\u0010\u001a\u00020\t*\u00020\u00022\u0006\u0010\b\u001a\u00020\t8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\r\"\u0016\u0010\u0012\u001a\u00020\u0013*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0016\u0010\u0016\u001a\u00020\u0013*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015\"\u0016\u0010\u0018\u001a\u00020\u0013*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015\"\u0016\u0010\u001a\u001a\u00020\u0013*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015\"\u0016\u0010\u001c\u001a\u00020\u0013*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0015\"\u0016\u0010\u001e\u001a\u00020\u0013*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006F"}, d2 = {"allViews", "Lkotlin/sequences/Sequence;", "Landroid/view/View;", "getAllViews", "(Landroid/view/View;)Lkotlin/sequences/Sequence;", "ancestors", "Landroid/view/ViewParent;", "getAncestors", "value", "", "isGone", "(Landroid/view/View;)Z", "setGone", "(Landroid/view/View;Z)V", "isInvisible", "setInvisible", "isVisible", "setVisible", "marginBottom", "", "getMarginBottom", "(Landroid/view/View;)I", "marginEnd", "getMarginEnd", "marginLeft", "getMarginLeft", "marginRight", "getMarginRight", "marginStart", "getMarginStart", "marginTop", "getMarginTop", "doOnAttach", "", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", com.anythink.expressad.a.B, "doOnDetach", "doOnLayout", "doOnNextLayout", "doOnPreDraw", "Landroidx/core/view/OneShotPreDrawListener;", "drawToBitmap", "Landroid/graphics/Bitmap;", "config", "Landroid/graphics/Bitmap$Config;", "postDelayed", "Ljava/lang/Runnable;", "delayInMillis", "", "Lkotlin/Function0;", "postOnAnimationDelayed", "setPadding", ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "updateLayoutParams", "T", "Landroid/view/ViewGroup$LayoutParams;", "block", "Lkotlin/ExtensionFunctionType;", "updateLayoutParamsTyped", "updatePadding", "left", "top", "right", "bottom", "updatePaddingRelative", com.anythink.expressad.foundation.d.c.bR, "end", "core-ktx_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class wr {

    /* compiled from: View.kt */
    @mw4(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", i = {0}, l = {406, 408}, m = "invokeSuspend", n = {"$this$sequence"}, s = {"L$0"})
    @vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Landroid/view/View;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a extends rw4 implements j05<i75<? super View>, uv4<? super yq4>, Object> {
        public int u;
        private /* synthetic */ Object v;
        public final /* synthetic */ View w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, uv4<? super a> uv4Var) {
            super(2, uv4Var);
            this.w = view;
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            i75 i75Var;
            Object h = gw4.h();
            int i = this.u;
            if (i == 0) {
                rp4.n(obj);
                i75Var = (i75) this.v;
                View view = this.w;
                this.v = i75Var;
                this.u = 1;
                if (i75Var.b(view, this) == h) {
                    return h;
                }
            } else if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rp4.n(obj);
                return yq4.a;
            } else {
                i75Var = (i75) this.v;
                rp4.n(obj);
            }
            View view2 = this.w;
            if (view2 instanceof ViewGroup) {
                g75<View> f = vr.f((ViewGroup) view2);
                this.v = null;
                this.u = 2;
                if (i75Var.e(f, this) == h) {
                    return h;
                }
            }
            return yq4.a;
        }

        @Override // com.p7700g.p99005.hw4
        @NotNull
        public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
            a aVar = new a(this.w, uv4Var);
            aVar.v = obj;
            return aVar;
        }

        @Override // com.p7700g.p99005.j05
        @Nullable
        /* renamed from: t3 */
        public final Object w3(@NotNull i75<? super View> i75Var, @Nullable uv4<? super yq4> uv4Var) {
            return ((a) X(i75Var, uv4Var)).D1(yq4.a);
        }
    }

    /* compiled from: View.kt */
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class b extends y15 implements f05<ViewParent, ViewParent> {
        public static final b B = new b();

        public b() {
            super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
        }

        @Override // com.p7700g.p99005.f05
        /* renamed from: K4 */
        public final ViewParent M(@NotNull ViewParent viewParent) {
            c25.p(viewParent, "p0");
            return viewParent.getParent();
        }
    }

    /* compiled from: View.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"androidx/core/view/ViewKt$doOnAttach$1", "Landroid/view/View$OnAttachStateChangeListener;", "onViewAttachedToWindow", "", com.anythink.expressad.a.B, "Landroid/view/View;", "onViewDetachedFromWindow", "core-ktx_release"}, k = 1, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes.dex */
    public static final class c implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View s;
        public final /* synthetic */ f05<View, yq4> t;

        /* JADX WARN: Multi-variable type inference failed */
        public c(View view, f05<? super View, yq4> f05Var) {
            this.s = view;
            this.t = f05Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull View view) {
            c25.p(view, com.anythink.expressad.a.B);
            this.s.removeOnAttachStateChangeListener(this);
            this.t.M(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull View view) {
            c25.p(view, com.anythink.expressad.a.B);
        }
    }

    /* compiled from: View.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"androidx/core/view/ViewKt$doOnDetach$1", "Landroid/view/View$OnAttachStateChangeListener;", "onViewAttachedToWindow", "", com.anythink.expressad.a.B, "Landroid/view/View;", "onViewDetachedFromWindow", "core-ktx_release"}, k = 1, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes.dex */
    public static final class d implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View s;
        public final /* synthetic */ f05<View, yq4> t;

        /* JADX WARN: Multi-variable type inference failed */
        public d(View view, f05<? super View, yq4> f05Var) {
            this.s = view;
            this.t = f05Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull View view) {
            c25.p(view, com.anythink.expressad.a.B);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull View view) {
            c25.p(view, com.anythink.expressad.a.B);
            this.s.removeOnAttachStateChangeListener(this);
            this.t.M(view);
        }
    }

    /* compiled from: View.kt */
    @vo4(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JP\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¨\u0006\u000f¸\u0006\u0000"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "onLayoutChange", "", com.anythink.expressad.a.B, "Landroid/view/View;", "left", "", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "core-ktx_release"}, k = 1, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes.dex */
    public static final class e implements View.OnLayoutChangeListener {
        public final /* synthetic */ f05 a;

        public e(f05 f05Var) {
            this.a = f05Var;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@NotNull View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            c25.p(view, com.anythink.expressad.a.B);
            view.removeOnLayoutChangeListener(this);
            this.a.M(view);
        }
    }

    /* compiled from: View.kt */
    @vo4(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JP\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¨\u0006\u000f"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "onLayoutChange", "", com.anythink.expressad.a.B, "Landroid/view/View;", "left", "", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "core-ktx_release"}, k = 1, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes.dex */
    public static final class f implements View.OnLayoutChangeListener {
        public final /* synthetic */ f05<View, yq4> a;

        /* JADX WARN: Multi-variable type inference failed */
        public f(f05<? super View, yq4> f05Var) {
            this.a = f05Var;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@NotNull View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            c25.p(view, com.anythink.expressad.a.B);
            view.removeOnLayoutChangeListener(this);
            this.a.M(view);
        }
    }

    /* compiled from: View.kt */
    @vo4(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes.dex */
    public static final class g implements Runnable {
        public final /* synthetic */ f05<View, yq4> s;
        public final /* synthetic */ View t;

        /* JADX WARN: Multi-variable type inference failed */
        public g(f05<? super View, yq4> f05Var, View view) {
            this.s = f05Var;
            this.t = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.s.M(this.t);
        }
    }

    /* compiled from: View.kt */
    @vo4(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes.dex */
    public static final class h implements Runnable {
        public final /* synthetic */ uz4<yq4> s;

        public h(uz4<yq4> uz4Var) {
            this.s = uz4Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.s.x();
        }
    }

    /* compiled from: View.kt */
    @vo4(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes.dex */
    public static final class i implements Runnable {
        public final /* synthetic */ uz4<yq4> s;

        public i(uz4<yq4> uz4Var) {
            this.s = uz4Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.s.x();
        }
    }

    public static final void A(@NotNull View view, @c2 int i2, @c2 int i3, @c2 int i4, @c2 int i5) {
        c25.p(view, "<this>");
        view.setPadding(i2, i3, i4, i5);
    }

    public static /* synthetic */ void B(View view, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i2 = view.getPaddingLeft();
        }
        if ((i6 & 2) != 0) {
            i3 = view.getPaddingTop();
        }
        if ((i6 & 4) != 0) {
            i4 = view.getPaddingRight();
        }
        if ((i6 & 8) != 0) {
            i5 = view.getPaddingBottom();
        }
        c25.p(view, "<this>");
        view.setPadding(i2, i3, i4, i5);
    }

    @e2(17)
    public static final void C(@NotNull View view, @c2 int i2, @c2 int i3, @c2 int i4, @c2 int i5) {
        c25.p(view, "<this>");
        view.setPaddingRelative(i2, i3, i4, i5);
    }

    public static /* synthetic */ void D(View view, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i2 = view.getPaddingStart();
        }
        if ((i6 & 2) != 0) {
            i3 = view.getPaddingTop();
        }
        if ((i6 & 4) != 0) {
            i4 = view.getPaddingEnd();
        }
        if ((i6 & 8) != 0) {
            i5 = view.getPaddingBottom();
        }
        c25.p(view, "<this>");
        view.setPaddingRelative(i2, i3, i4, i5);
    }

    public static final void a(@NotNull View view, @NotNull f05<? super View, yq4> f05Var) {
        c25.p(view, "<this>");
        c25.p(f05Var, "action");
        if (sr.N0(view)) {
            f05Var.M(view);
        } else {
            view.addOnAttachStateChangeListener(new c(view, f05Var));
        }
    }

    public static final void b(@NotNull View view, @NotNull f05<? super View, yq4> f05Var) {
        c25.p(view, "<this>");
        c25.p(f05Var, "action");
        if (!sr.N0(view)) {
            f05Var.M(view);
        } else {
            view.addOnAttachStateChangeListener(new d(view, f05Var));
        }
    }

    public static final void c(@NotNull View view, @NotNull f05<? super View, yq4> f05Var) {
        c25.p(view, "<this>");
        c25.p(f05Var, "action");
        if (sr.T0(view) && !view.isLayoutRequested()) {
            f05Var.M(view);
        } else {
            view.addOnLayoutChangeListener(new e(f05Var));
        }
    }

    public static final void d(@NotNull View view, @NotNull f05<? super View, yq4> f05Var) {
        c25.p(view, "<this>");
        c25.p(f05Var, "action");
        view.addOnLayoutChangeListener(new f(f05Var));
    }

    @NotNull
    public static final mr e(@NotNull View view, @NotNull f05<? super View, yq4> f05Var) {
        c25.p(view, "<this>");
        c25.p(f05Var, "action");
        mr a2 = mr.a(view, new g(f05Var, view));
        c25.o(a2, "View.doOnPreDraw(\n    cr…dd(this) { action(this) }");
        return a2;
    }

    @NotNull
    public static final Bitmap f(@NotNull View view, @NotNull Bitmap.Config config) {
        c25.p(view, "<this>");
        c25.p(config, "config");
        if (sr.T0(view)) {
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
            c25.o(createBitmap, "createBitmap(width, height, config)");
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(-view.getScrollX(), -view.getScrollY());
            view.draw(canvas);
            return createBitmap;
        }
        throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
    }

    public static /* synthetic */ Bitmap g(View view, Bitmap.Config config, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return f(view, config);
    }

    @NotNull
    public static final g75<View> h(@NotNull View view) {
        c25.p(view, "<this>");
        return k75.b(new a(view, null));
    }

    @NotNull
    public static final g75<ViewParent> i(@NotNull View view) {
        c25.p(view, "<this>");
        return m75.l(view.getParent(), b.B);
    }

    public static final int j(@NotNull View view) {
        c25.p(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.bottomMargin;
        }
        return 0;
    }

    public static final int k(@NotNull View view) {
        c25.p(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return sq.b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return 0;
    }

    public static final int l(@NotNull View view) {
        c25.p(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.leftMargin;
        }
        return 0;
    }

    public static final int m(@NotNull View view) {
        c25.p(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.rightMargin;
        }
        return 0;
    }

    public static final int n(@NotNull View view) {
        c25.p(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return sq.c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return 0;
    }

    public static final int o(@NotNull View view) {
        c25.p(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    public static final boolean p(@NotNull View view) {
        c25.p(view, "<this>");
        return view.getVisibility() == 8;
    }

    public static final boolean q(@NotNull View view) {
        c25.p(view, "<this>");
        return view.getVisibility() == 4;
    }

    public static final boolean r(@NotNull View view) {
        c25.p(view, "<this>");
        return view.getVisibility() == 0;
    }

    @NotNull
    public static final Runnable s(@NotNull View view, long j, @NotNull uz4<yq4> uz4Var) {
        c25.p(view, "<this>");
        c25.p(uz4Var, "action");
        h hVar = new h(uz4Var);
        view.postDelayed(hVar, j);
        return hVar;
    }

    @e2(16)
    @NotNull
    public static final Runnable t(@NotNull View view, long j, @NotNull uz4<yq4> uz4Var) {
        c25.p(view, "<this>");
        c25.p(uz4Var, "action");
        i iVar = new i(uz4Var);
        view.postOnAnimationDelayed(iVar, j);
        return iVar;
    }

    public static final void u(@NotNull View view, boolean z) {
        c25.p(view, "<this>");
        view.setVisibility(z ? 8 : 0);
    }

    public static final void v(@NotNull View view, boolean z) {
        c25.p(view, "<this>");
        view.setVisibility(z ? 4 : 0);
    }

    public static final void w(@NotNull View view, @c2 int i2) {
        c25.p(view, "<this>");
        view.setPadding(i2, i2, i2, i2);
    }

    public static final void x(@NotNull View view, boolean z) {
        c25.p(view, "<this>");
        view.setVisibility(z ? 0 : 8);
    }

    public static final void y(@NotNull View view, @NotNull f05<? super ViewGroup.LayoutParams, yq4> f05Var) {
        c25.p(view, "<this>");
        c25.p(f05Var, "block");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        f05Var.M(layoutParams);
        view.setLayoutParams(layoutParams);
    }

    @fz4(name = "updateLayoutParamsTyped")
    public static final /* synthetic */ <T extends ViewGroup.LayoutParams> void z(View view, f05<? super T, yq4> f05Var) {
        c25.p(view, "<this>");
        c25.p(f05Var, "block");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        c25.y(1, "T");
        f05Var.M(layoutParams);
        view.setLayoutParams(layoutParams);
    }
}