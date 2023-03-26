package com.p7700g.p99005;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.widget.Toast;
import com.p7700g.p99005.pz2;
import java.util.Objects;
import kotlin.reflect.jvm.KCallablesJvm;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: Extensions.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a8\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00028\u00002\u0019\b\u0004\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a@\u0010\t\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00028\u00002\u0019\b\u0004\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\u0010\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0019\u0010\u0016\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0019\u0010\u0018\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0017\"\u0017\u0010\u001c\u001a\u00020\u000b*\u00020\u00198F@\u0006¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"\u001b\u0010!\u001a\u00020\u001e*\u0006\u0012\u0002\b\u00030\u001d8F@\u0006¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\""}, d2 = {"T", "Lkotlin/Function1;", "Lcom/p7700g/p99005/yq4;", "Lcom/p7700g/p99005/ho4;", "block", com.anythink.basead.d.g.i, "(Ljava/lang/Object;Lcom/p7700g/p99005/f05;)V", "", "delayInMillis", "f", "(Ljava/lang/Object;Lcom/p7700g/p99005/f05;J)V", "", "Landroid/content/Context;", "context", "", "duration", "h", "(Ljava/lang/String;Landroid/content/Context;I)V", "Landroid/graphics/Bitmap;", "Lcom/p7700g/p99005/hz2;", "b", "(Landroid/graphics/Bitmap;)Lcom/p7700g/p99005/hz2;", "a", "(ILandroid/content/Context;)I", "e", "", "c", "(Ljava/lang/Object;)Ljava/lang/String;", "TAG", "Lcom/p7700g/p99005/g65;", "", "d", "(Lcom/p7700g/p99005/g65;)Z", "isLazyInitialized", "com.greedygame.sdkx.commons"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class cz2 {

    /* compiled from: Extensions.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/p7700g/p99005/cz2$a", "Landroid/os/CountDownTimer;", "", "millisUntilFinished", "Lcom/p7700g/p99005/yq4;", "onTick", "(J)V", "onFinish", "()V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class a extends CountDownTimer {
        public final /* synthetic */ f05<T, yq4> a;
        public final /* synthetic */ T b;
        public final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(f05<? super T, yq4> f05Var, T t, long j) {
            super(j, 1000L);
            this.a = f05Var;
            this.b = t;
            this.c = j;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.a.M(this.b);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
        }
    }

    /* compiled from: Extensions.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lcom/p7700g/p99005/yq4;", "<anonymous>", "()V"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class b implements Runnable {
        public final /* synthetic */ f05<T, yq4> s;
        public final /* synthetic */ T t;

        /* JADX WARN: Multi-variable type inference failed */
        public b(f05<? super T, yq4> f05Var, T t) {
            this.s = f05Var;
            this.t = t;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.s.M(this.t);
        }
    }

    public static final int a(int i, @NotNull Context context) {
        c25.p(context, "context");
        return (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    @NotNull
    public static final hz2 b(@Nullable Bitmap bitmap) {
        int parseColor = Color.parseColor("#262625");
        int i = sr.t;
        if (bitmap == null) {
            return new hz2(sr.t, parseColor, null, new iz2(0, 0, false, 7, null));
        }
        try {
            pz2 a2 = pz2.b(bitmap).a();
            c25.o(a2, "from(this).generate()");
            pz2.d i2 = a2.i();
            int f = a2.f(sr.t);
            if (i2 != null) {
                try {
                    f = i2.e();
                } catch (Exception e) {
                    e = e;
                    i = f;
                    xz2.b("xten-paletteGenerator", "Error", e);
                    return new hz2(i, parseColor, null, new iz2(0, 0, false, 7, null));
                }
            }
            double m = fj.m(f);
            iz2 iz2Var = new iz2(0, 0, false, 7, null);
            if (m >= 0.5d) {
                iz2Var.i(Color.parseColor("#262625"));
                iz2Var.j(true);
                iz2Var.k(-1);
                parseColor = Color.parseColor("#262625");
            } else {
                iz2Var.j(false);
                iz2Var.k(sr.t);
                iz2Var.i(-1);
                parseColor = -1;
            }
            return new hz2(f, parseColor, a2, iz2Var);
        } catch (Exception e2) {
            e = e2;
        }
    }

    @NotNull
    public static final String c(@NotNull Object obj) {
        c25.p(obj, "<this>");
        String simpleName = obj.getClass().getSimpleName();
        c25.o(simpleName, "this.javaClass.simpleName");
        return simpleName;
    }

    public static final boolean d(@NotNull g65<?> g65Var) {
        c25.p(g65Var, "<this>");
        if (g65Var instanceof qo4) {
            boolean isAccessible = KCallablesJvm.isAccessible(g65Var);
            KCallablesJvm.setAccessible(g65Var, true);
            Object W3 = g65Var.W3();
            Objects.requireNonNull(W3, "null cannot be cast to non-null type kotlin.Lazy<*>");
            boolean isInitialized = ((qo4) W3).isInitialized();
            KCallablesJvm.setAccessible(g65Var, isAccessible);
            return isInitialized;
        }
        return true;
    }

    public static final int e(int i, @NotNull Context context) {
        c25.p(context, "context");
        return a45.J0(i * context.getResources().getDisplayMetrics().density);
    }

    public static final <T> void f(T t, @NotNull f05<? super T, yq4> f05Var, long j) {
        c25.p(f05Var, "block");
        new a(f05Var, t, j).start();
    }

    public static final <T> void g(T t, @NotNull f05<? super T, yq4> f05Var) {
        c25.p(f05Var, "block");
        if (c25.g(Looper.myLooper(), Looper.getMainLooper())) {
            f05Var.M(t);
        } else {
            new Handler(Looper.getMainLooper()).post(new b(f05Var, t));
        }
    }

    public static final void h(@NotNull String str, @NotNull Context context, int i) {
        c25.p(str, "<this>");
        c25.p(context, "context");
        if (xz2.e) {
            Toast.makeText(context, str, i).show();
        }
    }

    public static /* synthetic */ void i(String str, Context context, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        h(str, context, i);
    }
}