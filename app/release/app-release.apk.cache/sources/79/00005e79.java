package com.p7700g.p99005;

import android.os.Handler;
import com.ironsource.adapters.ironsource.IronSourceAdapter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Handler.kt */
@vo4(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a4\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0004\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086\bø\u0001\u0000\u001a4\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0004\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, d2 = {"postAtTime", "Ljava/lang/Runnable;", "Landroid/os/Handler;", "uptimeMillis", "", IronSourceAdapter.IRONSOURCE_BIDDING_TOKEN_KEY, "", "action", "Lkotlin/Function0;", "", "postDelayed", "delayInMillis", "core-ktx_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class tm {

    /* compiled from: Handler.kt */
    @vo4(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes.dex */
    public static final class a implements Runnable {
        public final /* synthetic */ uz4<yq4> s;

        public a(uz4<yq4> uz4Var) {
            this.s = uz4Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.s.x();
        }
    }

    /* compiled from: Handler.kt */
    @vo4(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes.dex */
    public static final class b implements Runnable {
        public final /* synthetic */ uz4<yq4> s;

        public b(uz4<yq4> uz4Var) {
            this.s = uz4Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.s.x();
        }
    }

    @NotNull
    public static final Runnable a(@NotNull Handler handler, long j, @Nullable Object obj, @NotNull uz4<yq4> uz4Var) {
        c25.p(handler, "<this>");
        c25.p(uz4Var, "action");
        a aVar = new a(uz4Var);
        handler.postAtTime(aVar, obj, j);
        return aVar;
    }

    public static /* synthetic */ Runnable b(Handler handler, long j, Object obj, uz4 uz4Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        c25.p(handler, "<this>");
        c25.p(uz4Var, "action");
        a aVar = new a(uz4Var);
        handler.postAtTime(aVar, obj, j);
        return aVar;
    }

    @NotNull
    public static final Runnable c(@NotNull Handler handler, long j, @Nullable Object obj, @NotNull uz4<yq4> uz4Var) {
        c25.p(handler, "<this>");
        c25.p(uz4Var, "action");
        b bVar = new b(uz4Var);
        if (obj == null) {
            handler.postDelayed(bVar, j);
        } else {
            sm.d(handler, bVar, obj, j);
        }
        return bVar;
    }

    public static /* synthetic */ Runnable d(Handler handler, long j, Object obj, uz4 uz4Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        c25.p(handler, "<this>");
        c25.p(uz4Var, "action");
        b bVar = new b(uz4Var);
        if (obj == null) {
            handler.postDelayed(bVar, j);
        } else {
            sm.d(handler, bVar, obj, j);
        }
        return bVar;
    }
}