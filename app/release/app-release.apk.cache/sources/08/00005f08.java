package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.p7700g.p99005.zy2;
import java.util.Queue;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: BaseKeyPool.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000 \n*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\nB\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0004\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00028\u0000H$¢\u0006\u0004\b\n\u0010\u0005R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/p7700g/p99005/ty2;", "Lcom/p7700g/p99005/zy2;", "T", "", "b", "()Lcom/p7700g/p99005/zy2;", "key", "Lcom/p7700g/p99005/yq4;", "c", "(Lcom/p7700g/p99005/zy2;)V", "a", "Ljava/util/Queue;", "Ljava/util/Queue;", "keyPool", "<init>", "()V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public abstract class ty2<T extends zy2> {
    @NotNull
    public static final a a = new a(null);
    private static final int b = 20;
    @NotNull
    private final Queue<T> c = bz2.a.d(b);

    /* compiled from: BaseKeyPool.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/p7700g/p99005/ty2$a", "", "", "MAX_SIZE", AFHydra.STATUS_IDLE, "<init>", "()V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @NotNull
    public abstract T a();

    @NotNull
    public final T b() {
        T poll = this.c.poll();
        return poll == null ? a() : poll;
    }

    public final void c(@NotNull T t) {
        c25.p(t, "key");
        if (this.c.size() < b) {
            this.c.offer(t);
        }
    }
}