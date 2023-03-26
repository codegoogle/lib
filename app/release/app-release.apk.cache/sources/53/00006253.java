package com.p7700g.p99005;

import com.anythink.core.api.ATAdConst;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ArrayDeque.kt */
@dr4(markerClass = {fo4.class})
@vo4(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u0000 P*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001PB\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0007\b\u0016¢\u0006\u0002\u0010\u0006B\u0015\b\u0016\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\u0010\tJ\u0015\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0016J\u001d\u0010\u0013\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0019J\u001e\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0016\u0010\u001a\u001a\u00020\u00142\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0013\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0002\u0010\u001cJ\b\u0010\u001e\u001a\u00020\u0017H\u0016J\u0016\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0016J\u001e\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0004H\u0002J\u0010\u0010$\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0010\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u0004H\u0002J\u001d\u0010'\u001a\u00020\u00142\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140)H\u0082\bJ\u000b\u0010*\u001a\u00028\u0000¢\u0006\u0002\u0010+J\r\u0010,\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010+J\u0016\u0010-\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0002\u0010.J\u0010\u0010/\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0015\u00100\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00101J\u0016\u00102\u001a\u00028\u00002\u0006\u0010!\u001a\u00020\u0004H\u0083\b¢\u0006\u0002\u0010.J\u0011\u0010!\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0083\bJM\u00103\u001a\u00020\u00172>\u00104\u001a:\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(\u000e\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b¢\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u001705H\u0000¢\u0006\u0002\b8J\b\u00109\u001a\u00020\u0014H\u0016J\u000b\u0010:\u001a\u00028\u0000¢\u0006\u0002\u0010+J\u0015\u0010;\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00101J\r\u0010<\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010+J\u0010\u0010=\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0010\u0010>\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0015\u0010?\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0016J\u0016\u0010@\u001a\u00020\u00142\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0015\u0010A\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0002\u0010.J\u000b\u0010B\u001a\u00028\u0000¢\u0006\u0002\u0010+J\r\u0010C\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010+J\u000b\u0010D\u001a\u00028\u0000¢\u0006\u0002\u0010+J\r\u0010E\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010+J\u0016\u0010F\u001a\u00020\u00142\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u001e\u0010G\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010HJ\u0017\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0000¢\u0006\u0004\bJ\u0010KJ)\u0010I\u001a\b\u0012\u0004\u0012\u0002HL0\u000b\"\u0004\b\u0001\u0010L2\f\u0010M\u001a\b\u0012\u0004\u0012\u0002HL0\u000bH\u0000¢\u0006\u0004\bJ\u0010NJ\u0015\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0002\u0010KJ'\u0010O\u001a\b\u0012\u0004\u0012\u0002HL0\u000b\"\u0004\b\u0001\u0010L2\f\u0010M\u001a\b\u0012\u0004\u0012\u0002HL0\u000bH\u0016¢\u0006\u0002\u0010NR\u0018\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006Q"}, d2 = {"Lkotlin/collections/ArrayDeque;", "E", "Lkotlin/collections/AbstractMutableList;", "initialCapacity", "", "(I)V", "()V", "elements", "", "(Ljava/util/Collection;)V", "elementData", "", "", "[Ljava/lang/Object;", "head", "<set-?>", ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "getSize", "()I", com.anythink.expressad.d.a.b.ay, "", "element", "(Ljava/lang/Object;)Z", "", la1.l, "(ILjava/lang/Object;)V", "addAll", "addFirst", "(Ljava/lang/Object;)V", "addLast", "clear", "contains", "copyCollectionElements", "internalIndex", "copyElements", "newCapacity", "decremented", "ensureCapacity", "minCapacity", "filterInPlace", "predicate", "Lkotlin/Function1;", "first", "()Ljava/lang/Object;", "firstOrNull", "get", "(I)Ljava/lang/Object;", "incremented", "indexOf", "(Ljava/lang/Object;)I", "internalGet", "internalStructure", "structure", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "internalStructure$kotlin_stdlib", "isEmpty", "last", "lastIndexOf", "lastOrNull", "negativeMod", "positiveMod", la1.b, "removeAll", "removeAt", "removeFirst", "removeFirstOrNull", "removeLast", "removeLastOrNull", "retainAll", la1.a, "(ILjava/lang/Object;)Ljava/lang/Object;", "testToArray", "testToArray$kotlin_stdlib", "()[Ljava/lang/Object;", "T", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "toArray", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
@tp4(version = "1.4")
/* loaded from: classes3.dex */
public final class vr4<E> extends qr4<E> {
    @NotNull
    public static final a s = new a(null);
    @NotNull
    private static final Object[] t = new Object[0];
    private static final int u = 2147483639;
    private static final int v = 10;
    private int w;
    @NotNull
    private Object[] x;
    private int y;

    /* compiled from: ArrayDeque.kt */
    @vo4(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlin/collections/ArrayDeque$Companion;", "", "()V", "defaultMinCapacity", "", "emptyElementData", "", "[Ljava/lang/Object;", "maxArraySize", "newCapacity", "oldCapacity", "minCapacity", "newCapacity$kotlin_stdlib", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(int i, int i2) {
            int i3 = i + (i >> 1);
            if (i3 - i2 < 0) {
                i3 = i2;
            }
            if (i3 - vr4.u > 0) {
                if (i2 > vr4.u) {
                    return Integer.MAX_VALUE;
                }
                return vr4.u;
            }
            return i3;
        }
    }

    public vr4(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = t;
        } else if (i > 0) {
            objArr = new Object[i];
        } else {
            throw new IllegalArgumentException(wo1.l("Illegal Capacity: ", i));
        }
        this.x = objArr;
    }

    private final int A(int i) {
        if (i == as4.Xe(this.x)) {
            return 0;
        }
        return i + 1;
    }

    @dx4
    private final E B(int i) {
        return (E) this.x[i];
    }

    @dx4
    private final int D(int i) {
        return I(this.w + i);
    }

    private final int H(int i) {
        return i < 0 ? i + this.x.length : i;
    }

    private final int I(int i) {
        Object[] objArr = this.x;
        return i >= objArr.length ? i - objArr.length : i;
    }

    private final void o(int i, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.x.length;
        while (i < length && it.hasNext()) {
            this.x[i] = it.next();
            i++;
        }
        int i2 = this.w;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.x[i3] = it.next();
        }
        this.y = collection.size() + size();
    }

    private final void p(int i) {
        Object[] objArr = new Object[i];
        Object[] objArr2 = this.x;
        zr4.c1(objArr2, objArr, 0, this.w, objArr2.length);
        Object[] objArr3 = this.x;
        int length = objArr3.length;
        int i2 = this.w;
        zr4.c1(objArr3, objArr, length - i2, 0, i2);
        this.w = 0;
        this.x = objArr;
    }

    private final int t(int i) {
        return i == 0 ? as4.Xe(this.x) : i - 1;
    }

    private final void u(int i) {
        if (i >= 0) {
            Object[] objArr = this.x;
            if (i <= objArr.length) {
                return;
            }
            if (objArr == t) {
                this.x = new Object[i55.n(i, 10)];
                return;
            } else {
                p(s.a(objArr.length, i));
                return;
            }
        }
        throw new IllegalStateException("Deque is too big.");
    }

    private final boolean x(f05<? super E, Boolean> f05Var) {
        int I;
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty()) {
            if (!(this.x.length == 0)) {
                int I2 = I(size() + this.w);
                int i = this.w;
                if (i < I2) {
                    I = i;
                    while (i < I2) {
                        Object obj = this.x[i];
                        if (f05Var.M(obj).booleanValue()) {
                            this.x[I] = obj;
                            I++;
                        } else {
                            z = true;
                        }
                        i++;
                    }
                    zr4.n2(this.x, null, I, I2);
                } else {
                    int length = this.x.length;
                    int i2 = i;
                    boolean z2 = false;
                    while (i < length) {
                        Object[] objArr = this.x;
                        Object obj2 = objArr[i];
                        objArr[i] = null;
                        if (f05Var.M(obj2).booleanValue()) {
                            this.x[i2] = obj2;
                            i2++;
                        } else {
                            z2 = true;
                        }
                        i++;
                    }
                    I = I(i2);
                    for (int i3 = 0; i3 < I2; i3++) {
                        Object[] objArr2 = this.x;
                        Object obj3 = objArr2[i3];
                        objArr2[i3] = null;
                        if (f05Var.M(obj3).booleanValue()) {
                            this.x[I] = obj3;
                            I = A(I);
                        } else {
                            z2 = true;
                        }
                    }
                    z = z2;
                }
                if (z) {
                    this.y = H(I - this.w);
                }
            }
        }
        return z;
    }

    public final void E(@NotNull j05<? super Integer, ? super Object[], yq4> j05Var) {
        int i;
        c25.p(j05Var, "structure");
        j05Var.w3(Integer.valueOf((isEmpty() || (i = this.w) < I(size() + this.w)) ? this.w : i - this.x.length), toArray());
    }

    @Nullable
    public final E G() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.x[I(js4.H(this) + this.w)];
    }

    public final E J() {
        if (!isEmpty()) {
            Object[] objArr = this.x;
            int i = this.w;
            E e = (E) objArr[i];
            objArr[i] = null;
            this.w = A(i);
            this.y = size() - 1;
            return e;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Nullable
    public final E L() {
        if (isEmpty()) {
            return null;
        }
        return J();
    }

    public final E M() {
        if (!isEmpty()) {
            int I = I(js4.H(this) + this.w);
            Object[] objArr = this.x;
            E e = (E) objArr[I];
            objArr[I] = null;
            this.y = size() - 1;
            return e;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Nullable
    public final E N() {
        if (isEmpty()) {
            return null;
        }
        return M();
    }

    @NotNull
    public final Object[] O() {
        return toArray();
    }

    @NotNull
    public final <T> T[] P(@NotNull T[] tArr) {
        c25.p(tArr, "array");
        return (T[]) toArray(tArr);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        n(e);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@NotNull Collection<? extends E> collection) {
        c25.p(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        u(collection.size() + size());
        o(I(size() + this.w), collection);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int I = I(size() + this.w);
        int i = this.w;
        if (i < I) {
            zr4.n2(this.x, null, i, I);
        } else if (!isEmpty()) {
            Object[] objArr = this.x;
            zr4.n2(objArr, null, this.w, objArr.length);
            zr4.n2(this.x, null, 0, I);
        }
        this.w = 0;
        this.y = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.x[this.w];
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        nr4.s.b(i, size());
        return (E) this.x[I(this.w + i)];
    }

    @Override // com.p7700g.p99005.qr4
    public int h() {
        return this.y;
    }

    @Override // com.p7700g.p99005.qr4
    public E i(int i) {
        nr4.s.b(i, size());
        if (i == js4.H(this)) {
            return M();
        }
        if (i == 0) {
            return J();
        }
        int I = I(this.w + i);
        E e = (E) this.x[I];
        if (i < (size() >> 1)) {
            int i2 = this.w;
            if (I >= i2) {
                Object[] objArr = this.x;
                zr4.c1(objArr, objArr, i2 + 1, i2, I);
            } else {
                Object[] objArr2 = this.x;
                zr4.c1(objArr2, objArr2, 1, 0, I);
                Object[] objArr3 = this.x;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i3 = this.w;
                zr4.c1(objArr3, objArr3, i3 + 1, i3, objArr3.length - 1);
            }
            Object[] objArr4 = this.x;
            int i4 = this.w;
            objArr4[i4] = null;
            this.w = A(i4);
        } else {
            int I2 = I(js4.H(this) + this.w);
            if (I <= I2) {
                Object[] objArr5 = this.x;
                zr4.c1(objArr5, objArr5, I, I + 1, I2 + 1);
            } else {
                Object[] objArr6 = this.x;
                zr4.c1(objArr6, objArr6, I, I + 1, objArr6.length);
                Object[] objArr7 = this.x;
                objArr7[objArr7.length - 1] = objArr7[0];
                zr4.c1(objArr7, objArr7, 0, 1, I2 + 1);
            }
            this.x[I2] = null;
        }
        this.y = size() - 1;
        return e;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i;
        int I = I(size() + this.w);
        int i2 = this.w;
        if (i2 < I) {
            while (i2 < I) {
                if (c25.g(obj, this.x[i2])) {
                    i = this.w;
                } else {
                    i2++;
                }
            }
            return -1;
        } else if (i2 < I) {
            return -1;
        } else {
            int length = this.x.length;
            while (true) {
                if (i2 >= length) {
                    for (int i3 = 0; i3 < I; i3++) {
                        if (c25.g(obj, this.x[i3])) {
                            i2 = i3 + this.x.length;
                            i = this.w;
                        }
                    }
                    return -1;
                } else if (c25.g(obj, this.x[i2])) {
                    i = this.w;
                    break;
                } else {
                    i2++;
                }
            }
        }
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.x[I(js4.H(this) + this.w)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int Xe;
        int i;
        int I = I(size() + this.w);
        int i2 = this.w;
        if (i2 < I) {
            Xe = I - 1;
            if (i2 <= Xe) {
                while (!c25.g(obj, this.x[Xe])) {
                    if (Xe != i2) {
                        Xe--;
                    }
                }
                i = this.w;
                return Xe - i;
            }
            return -1;
        }
        if (i2 > I) {
            int i3 = I - 1;
            while (true) {
                if (-1 < i3) {
                    if (c25.g(obj, this.x[i3])) {
                        Xe = i3 + this.x.length;
                        i = this.w;
                        break;
                    }
                    i3--;
                } else {
                    Xe = as4.Xe(this.x);
                    int i4 = this.w;
                    if (i4 <= Xe) {
                        while (!c25.g(obj, this.x[Xe])) {
                            if (Xe != i4) {
                                Xe--;
                            }
                        }
                        i = this.w;
                    }
                }
            }
        }
        return -1;
    }

    public final void m(E e) {
        u(size() + 1);
        int t2 = t(this.w);
        this.w = t2;
        this.x[t2] = e;
        this.y = size() + 1;
    }

    public final void n(E e) {
        u(size() + 1);
        this.x[I(size() + this.w)] = e;
        this.y = size() + 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@NotNull Collection<? extends Object> collection) {
        int I;
        c25.p(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty()) {
            if (!(this.x.length == 0)) {
                int I2 = I(size() + this.w);
                int i = this.w;
                if (i < I2) {
                    I = i;
                    while (i < I2) {
                        Object obj = this.x[i];
                        if (!collection.contains(obj)) {
                            this.x[I] = obj;
                            I++;
                        } else {
                            z = true;
                        }
                        i++;
                    }
                    zr4.n2(this.x, null, I, I2);
                } else {
                    int length = this.x.length;
                    int i2 = i;
                    boolean z2 = false;
                    while (i < length) {
                        Object[] objArr = this.x;
                        Object obj2 = objArr[i];
                        objArr[i] = null;
                        if (!collection.contains(obj2)) {
                            this.x[i2] = obj2;
                            i2++;
                        } else {
                            z2 = true;
                        }
                        i++;
                    }
                    I = I(i2);
                    for (int i3 = 0; i3 < I2; i3++) {
                        Object[] objArr2 = this.x;
                        Object obj3 = objArr2[i3];
                        objArr2[i3] = null;
                        if (!collection.contains(obj3)) {
                            this.x[I] = obj3;
                            I = A(I);
                        } else {
                            z2 = true;
                        }
                    }
                    z = z2;
                }
                if (z) {
                    this.y = H(I - this.w);
                }
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@NotNull Collection<? extends Object> collection) {
        int I;
        c25.p(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty()) {
            if (!(this.x.length == 0)) {
                int I2 = I(size() + this.w);
                int i = this.w;
                if (i < I2) {
                    I = i;
                    while (i < I2) {
                        Object obj = this.x[i];
                        if (collection.contains(obj)) {
                            this.x[I] = obj;
                            I++;
                        } else {
                            z = true;
                        }
                        i++;
                    }
                    zr4.n2(this.x, null, I, I2);
                } else {
                    int length = this.x.length;
                    int i2 = i;
                    boolean z2 = false;
                    while (i < length) {
                        Object[] objArr = this.x;
                        Object obj2 = objArr[i];
                        objArr[i] = null;
                        if (collection.contains(obj2)) {
                            this.x[i2] = obj2;
                            i2++;
                        } else {
                            z2 = true;
                        }
                        i++;
                    }
                    I = I(i2);
                    for (int i3 = 0; i3 < I2; i3++) {
                        Object[] objArr2 = this.x;
                        Object obj3 = objArr2[i3];
                        objArr2[i3] = null;
                        if (collection.contains(obj3)) {
                            this.x[I] = obj3;
                            I = A(I);
                        } else {
                            z2 = true;
                        }
                    }
                    z = z2;
                }
                if (z) {
                    this.y = H(I - this.w);
                }
            }
        }
        return z;
    }

    @Override // com.p7700g.p99005.qr4, java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        nr4.s.b(i, size());
        int I = I(this.w + i);
        Object[] objArr = this.x;
        E e2 = (E) objArr[I];
        objArr[I] = e;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public <T> T[] toArray(@NotNull T[] tArr) {
        c25.p(tArr, "array");
        if (tArr.length < size()) {
            tArr = (T[]) xr4.a(tArr, size());
        }
        c25.n(tArr, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        int I = I(size() + this.w);
        int i = this.w;
        if (i < I) {
            zr4.l1(this.x, tArr, 0, i, I, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.x;
            zr4.c1(objArr, tArr, 0, this.w, objArr.length);
            Object[] objArr2 = this.x;
            zr4.c1(objArr2, tArr, objArr2.length - this.w, 0, I);
        }
        if (tArr.length > size()) {
            tArr[size()] = null;
        }
        return tArr;
    }

    @Nullable
    public final E y() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.x[this.w];
    }

    @Override // com.p7700g.p99005.qr4, java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        nr4.s.c(i, size());
        if (i == size()) {
            n(e);
        } else if (i == 0) {
            m(e);
        } else {
            u(size() + 1);
            int I = I(this.w + i);
            if (i < ((size() + 1) >> 1)) {
                int t2 = t(I);
                int t3 = t(this.w);
                int i2 = this.w;
                if (t2 >= i2) {
                    Object[] objArr = this.x;
                    objArr[t3] = objArr[i2];
                    zr4.c1(objArr, objArr, i2, i2 + 1, t2 + 1);
                } else {
                    Object[] objArr2 = this.x;
                    zr4.c1(objArr2, objArr2, i2 - 1, i2, objArr2.length);
                    Object[] objArr3 = this.x;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    zr4.c1(objArr3, objArr3, 0, 1, t2 + 1);
                }
                this.x[t2] = e;
                this.w = t3;
            } else {
                int I2 = I(size() + this.w);
                if (I < I2) {
                    Object[] objArr4 = this.x;
                    zr4.c1(objArr4, objArr4, I + 1, I, I2);
                } else {
                    Object[] objArr5 = this.x;
                    zr4.c1(objArr5, objArr5, 1, 0, I2);
                    Object[] objArr6 = this.x;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    zr4.c1(objArr6, objArr6, I + 1, I, objArr6.length - 1);
                }
                this.x[I] = e;
            }
            this.y = size() + 1;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, @NotNull Collection<? extends E> collection) {
        c25.p(collection, "elements");
        nr4.s.c(i, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(collection);
        }
        u(collection.size() + size());
        int I = I(size() + this.w);
        int I2 = I(this.w + i);
        int size = collection.size();
        if (i < ((size() + 1) >> 1)) {
            int i2 = this.w;
            int i3 = i2 - size;
            if (I2 < i2) {
                Object[] objArr = this.x;
                zr4.c1(objArr, objArr, i3, i2, objArr.length);
                if (size >= I2) {
                    Object[] objArr2 = this.x;
                    zr4.c1(objArr2, objArr2, objArr2.length - size, 0, I2);
                } else {
                    Object[] objArr3 = this.x;
                    zr4.c1(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.x;
                    zr4.c1(objArr4, objArr4, 0, size, I2);
                }
            } else if (i3 >= 0) {
                Object[] objArr5 = this.x;
                zr4.c1(objArr5, objArr5, i3, i2, I2);
            } else {
                Object[] objArr6 = this.x;
                i3 += objArr6.length;
                int i4 = I2 - i2;
                int length = objArr6.length - i3;
                if (length >= i4) {
                    zr4.c1(objArr6, objArr6, i3, i2, I2);
                } else {
                    zr4.c1(objArr6, objArr6, i3, i2, i2 + length);
                    Object[] objArr7 = this.x;
                    zr4.c1(objArr7, objArr7, 0, this.w + length, I2);
                }
            }
            this.w = i3;
            o(H(I2 - size), collection);
        } else {
            int i5 = I2 + size;
            if (I2 < I) {
                int i6 = size + I;
                Object[] objArr8 = this.x;
                if (i6 <= objArr8.length) {
                    zr4.c1(objArr8, objArr8, i5, I2, I);
                } else if (i5 >= objArr8.length) {
                    zr4.c1(objArr8, objArr8, i5 - objArr8.length, I2, I);
                } else {
                    int length2 = I - (i6 - objArr8.length);
                    zr4.c1(objArr8, objArr8, 0, length2, I);
                    Object[] objArr9 = this.x;
                    zr4.c1(objArr9, objArr9, i5, I2, length2);
                }
            } else {
                Object[] objArr10 = this.x;
                zr4.c1(objArr10, objArr10, size, 0, I);
                Object[] objArr11 = this.x;
                if (i5 >= objArr11.length) {
                    zr4.c1(objArr11, objArr11, i5 - objArr11.length, I2, objArr11.length);
                } else {
                    zr4.c1(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.x;
                    zr4.c1(objArr12, objArr12, i5, I2, objArr12.length - size);
                }
            }
            o(I2, collection);
        }
        return true;
    }

    public vr4() {
        this.x = t;
    }

    public vr4(@NotNull Collection<? extends E> collection) {
        c25.p(collection, "elements");
        Object[] array = collection.toArray(new Object[0]);
        c25.n(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        this.x = array;
        this.y = array.length;
        if (array.length == 0) {
            this.x = t;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}