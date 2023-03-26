package com.p7700g.p99005;

import com.anythink.core.api.ATAdConst;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.onesignal.shortcutbadger.impl.NewHtcHomeBadger;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;

/* compiled from: SlidingWindow.kt */
@vo4(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001d\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010\fJ\u0013\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0018\u001a\u00020\u0006J\u0016\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0002\u0010\u001bJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0096\u0002J\u000e\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u0006J\u0015\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0014¢\u0006\u0002\u0010#J'\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u00010\t\"\u0004\b\u0001\u0010\u00012\f\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u00010\tH\u0014¢\u0006\u0002\u0010%J\u0015\u0010&\u001a\u00020\u0006*\u00020\u00062\u0006\u0010!\u001a\u00020\u0006H\u0082\bR\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lkotlin/collections/RingBuffer;", "T", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "capacity", "", "(I)V", "buffer", "", "", "filledSize", "([Ljava/lang/Object;I)V", "[Ljava/lang/Object;", "<set-?>", ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "getSize", "()I", "startIndex", com.anythink.expressad.d.a.b.ay, "", "element", "(Ljava/lang/Object;)V", CallMraidJS.g, "maxCapacity", "get", la1.l, "(I)Ljava/lang/Object;", "isFull", "", "iterator", "", "removeFirst", "n", "toArray", "()[Ljava/lang/Object;", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "forward", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class vt4<T> extends nr4<T> implements RandomAccess {
    @NotNull
    private final Object[] t;
    private final int u;
    private int v;
    private int w;

    /* compiled from: SlidingWindow.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0005\u001a\u00020\u0006H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"kotlin/collections/RingBuffer$iterator$1", "Lkotlin/collections/AbstractIterator;", NewHtcHomeBadger.d, "", la1.l, "computeNext", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends mr4<T> {
        private int u;
        private int v;
        public final /* synthetic */ vt4<T> w;

        public a(vt4<T> vt4Var) {
            this.w = vt4Var;
            this.u = vt4Var.size();
            this.v = ((vt4) vt4Var).v;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p7700g.p99005.mr4
        public void a() {
            if (this.u != 0) {
                c(((vt4) this.w).t[this.v]);
                this.v = (this.v + 1) % ((vt4) this.w).u;
                this.u--;
                return;
            }
            b();
        }
    }

    public vt4(@NotNull Object[] objArr, int i) {
        c25.p(objArr, "buffer");
        this.t = objArr;
        if (i >= 0) {
            if (i <= objArr.length) {
                this.u = objArr.length;
                this.w = i;
                return;
            }
            StringBuilder H = wo1.H("ring buffer filled size: ", i, " cannot be larger than the buffer size: ");
            H.append(objArr.length);
            throw new IllegalArgumentException(H.toString().toString());
        }
        throw new IllegalArgumentException(wo1.l("ring buffer filled size should not be negative but it is ", i).toString());
    }

    private final int i(int i, int i2) {
        return (i + i2) % this.u;
    }

    @Override // com.p7700g.p99005.nr4, com.p7700g.p99005.lr4
    public int a() {
        return this.w;
    }

    public final void e(T t) {
        if (!m()) {
            this.t[(size() + this.v) % this.u] = t;
            this.w = size() + 1;
            return;
        }
        throw new IllegalStateException("ring buffer is full");
    }

    @Override // com.p7700g.p99005.nr4, java.util.List
    public T get(int i) {
        nr4.s.b(i, size());
        return (T) this.t[(this.v + i) % this.u];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final vt4<T> h(int i) {
        Object[] array;
        int i2 = this.u;
        int u = i55.u(i2 + (i2 >> 1) + 1, i);
        if (this.v == 0) {
            array = Arrays.copyOf(this.t, u);
            c25.o(array, "copyOf(this, newSize)");
        } else {
            array = toArray(new Object[u]);
        }
        return new vt4<>(array, size());
    }

    @Override // com.p7700g.p99005.nr4, com.p7700g.p99005.lr4, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return new a(this);
    }

    public final boolean m() {
        return size() == this.u;
    }

    public final void n(int i) {
        if (i >= 0) {
            if (!(i <= size())) {
                StringBuilder H = wo1.H("n shouldn't be greater than the buffer size: n = ", i, ", size = ");
                H.append(size());
                throw new IllegalArgumentException(H.toString().toString());
            } else if (i > 0) {
                int i2 = this.v;
                int i3 = (i2 + i) % this.u;
                if (i2 > i3) {
                    zr4.n2(this.t, null, i2, this.u);
                    zr4.n2(this.t, null, 0, i3);
                } else {
                    zr4.n2(this.t, null, i2, i3);
                }
                this.v = i3;
                this.w = size() - i;
                return;
            } else {
                return;
            }
        }
        throw new IllegalArgumentException(wo1.l("n shouldn't be negative but it is ", i).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p7700g.p99005.lr4, java.util.Collection
    @NotNull
    public <T> T[] toArray(@NotNull T[] tArr) {
        c25.p(tArr, "array");
        if (tArr.length < size()) {
            tArr = (T[]) Arrays.copyOf(tArr, size());
            c25.o(tArr, "copyOf(this, newSize)");
        }
        int size = size();
        int i = 0;
        int i2 = 0;
        for (int i3 = this.v; i2 < size && i3 < this.u; i3++) {
            tArr[i2] = this.t[i3];
            i2++;
        }
        while (i2 < size) {
            tArr[i2] = this.t[i];
            i2++;
            i++;
        }
        if (tArr.length > size()) {
            tArr[size()] = null;
        }
        c25.n(tArr, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.RingBuffer.toArray>");
        return tArr;
    }

    public vt4(int i) {
        this(new Object[i], 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p7700g.p99005.lr4, java.util.Collection
    @NotNull
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}