package com.p7700g.p99005;

import com.p7700g.p99005.qm3;
import com.p7700g.p99005.qp4;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: StackTraceRecovery.kt */
@vo4(d1 = {"\u0000f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u001a\u0014\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\t\u001a\u00020\u0001H\u0007\u001a9\u0010\n\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\r\u001a\u0002H\u000b2\u0006\u0010\u000e\u001a\u0002H\u000b2\u0010\u0010\u000f\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u0010H\u0002¢\u0006\u0002\u0010\u0011\u001a\u001e\u0010\u0012\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00102\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0002\u001a1\u0010\u0016\u001a\u00020\u00172\u0010\u0010\u0018\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00192\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u0010H\u0002¢\u0006\u0002\u0010\u001a\u001a\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\fH\u0080Hø\u0001\u0000¢\u0006\u0002\u0010\u001e\u001a+\u0010\u001f\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u0002H\u000b2\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0002¢\u0006\u0002\u0010 \u001a\u001f\u0010!\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u0002H\u000bH\u0000¢\u0006\u0002\u0010\"\u001a,\u0010!\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u0002H\u000b2\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030#H\u0080\b¢\u0006\u0002\u0010$\u001a!\u0010%\u001a\u0004\u0018\u0001H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u0002H\u000bH\u0002¢\u0006\u0002\u0010\"\u001a \u0010&\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u0002H\u000bH\u0080\b¢\u0006\u0002\u0010\"\u001a\u001f\u0010'\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u0002H\u000bH\u0000¢\u0006\u0002\u0010\"\u001a1\u0010(\u001a\u0018\u0012\u0004\u0012\u0002H\u000b\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00190)\"\b\b\u0000\u0010\u000b*\u00020\f*\u0002H\u000bH\u0002¢\u0006\u0002\u0010*\u001a\u001c\u0010+\u001a\u00020,*\u00060\u0007j\u0002`\b2\n\u0010-\u001a\u00060\u0007j\u0002`\bH\u0002\u001a#\u0010.\u001a\u00020/*\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00192\u0006\u00100\u001a\u00020\u0001H\u0002¢\u0006\u0002\u00101\u001a\u0014\u00102\u001a\u00020\u0017*\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0000\u001a\u0010\u00103\u001a\u00020,*\u00060\u0007j\u0002`\bH\u0000\u001a\u001b\u00104\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f*\u0002H\u000bH\u0002¢\u0006\u0002\u0010\"\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0005\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000*\f\b\u0000\u00105\"\u00020\u00142\u00020\u0014*\f\b\u0000\u00106\"\u00020\u00072\u00020\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u00067"}, d2 = {"baseContinuationImplClass", "", "baseContinuationImplClassName", "kotlin.jvm.PlatformType", "stackTraceRecoveryClass", "stackTraceRecoveryClassName", "artificialFrame", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", qm3.b.j, "createFinalException", "E", "", "cause", "result", "resultStackTrace", "Ljava/util/ArrayDeque;", "(Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/util/ArrayDeque;)Ljava/lang/Throwable;", "createStackTrace", "continuation", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "mergeRecoveredTraces", "", "recoveredStacktrace", "", "([Ljava/lang/StackTraceElement;Ljava/util/ArrayDeque;)V", "recoverAndThrow", "", "exception", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recoverFromStackFrame", "(Ljava/lang/Throwable;Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Ljava/lang/Throwable;", "recoverStackTrace", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Lkotlin/coroutines/Continuation;", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Throwable;", "tryCopyAndVerify", "unwrap", "unwrapImpl", "causeAndStacktrace", "Lkotlin/Pair;", "(Ljava/lang/Throwable;)Lkotlin/Pair;", "elementWiseEquals", "", "e", "frameIndex", "", "methodName", "([Ljava/lang/StackTraceElement;Ljava/lang/String;)I", "initCause", "isArtificial", "sanitizeStackTrace", "CoroutineStackFrame", "StackTraceElement", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class zm5 {
    @NotNull
    private static final String a = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
    @NotNull
    private static final String b = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
    private static final String c;
    private static final String d;

    static {
        Object b2;
        Object b3;
        try {
            qp4.a aVar = qp4.s;
            b2 = qp4.b(Class.forName("com.p7700g.p99005.hw4").getCanonicalName());
        } catch (Throwable th) {
            qp4.a aVar2 = qp4.s;
            b2 = qp4.b(rp4.a(th));
        }
        if (qp4.e(b2) != null) {
            b2 = a;
        }
        c = (String) b2;
        try {
            qp4.a aVar3 = qp4.s;
            b3 = qp4.b(Class.forName("com.p7700g.p99005.zm5").getCanonicalName());
        } catch (Throwable th2) {
            qp4.a aVar4 = qp4.s;
            b3 = qp4.b(rp4.a(th2));
        }
        if (qp4.e(b3) != null) {
            b3 = b;
        }
        d = (String) b3;
    }

    public static /* synthetic */ void a() {
    }

    public static /* synthetic */ void b() {
    }

    @zd5
    @NotNull
    public static final StackTraceElement d(@NotNull String str) {
        return new StackTraceElement(c25.C("\b\b\b(", str), "\b", "\b", -1);
    }

    private static final <E extends Throwable> hp4<E, StackTraceElement[]> e(E e) {
        boolean z;
        Throwable cause = e.getCause();
        if (cause != null && c25.g(cause.getClass(), e.getClass())) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            int length = stackTrace.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i];
                i++;
                if (k(stackTraceElement)) {
                    z = true;
                    break;
                }
            }
            if (z) {
                return cq4.a(cause, stackTrace);
            }
            return cq4.a(e, new StackTraceElement[0]);
        }
        return cq4.a(e, new StackTraceElement[0]);
    }

    private static final <E extends Throwable> E f(E e, E e2, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(d("Coroutine boundary"));
        StackTraceElement[] stackTrace = e.getStackTrace();
        int i = i(stackTrace, c);
        int i2 = 0;
        if (i == -1) {
            Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            e2.setStackTrace((StackTraceElement[]) array);
            return e2;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[arrayDeque.size() + i];
        for (int i3 = 0; i3 < i; i3++) {
            stackTraceElementArr[i3] = stackTrace[i3];
        }
        Iterator<StackTraceElement> it = arrayDeque.iterator();
        while (it.hasNext()) {
            int i4 = i2 + 1;
            stackTraceElementArr[i2 + i] = it.next();
            i2 = i4;
        }
        e2.setStackTrace(stackTraceElementArr);
        return e2;
    }

    private static final ArrayDeque<StackTraceElement> g(lw4 lw4Var) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement H = lw4Var.H();
        if (H != null) {
            arrayDeque.add(H);
        }
        while (true) {
            lw4Var = lw4Var == null ? null : lw4Var.o();
            if (lw4Var == null) {
                return arrayDeque;
            }
            StackTraceElement H2 = lw4Var.H();
            if (H2 != null) {
                arrayDeque.add(H2);
            }
        }
    }

    private static final boolean h(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && c25.g(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && c25.g(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && c25.g(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    private static final int i(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (c25.g(str, stackTraceElementArr[i].getClassName())) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    public static final void j(@NotNull Throwable th, @NotNull Throwable th2) {
        th.initCause(th2);
    }

    public static final boolean k(@NotNull StackTraceElement stackTraceElement) {
        return b95.u2(stackTraceElement.getClassName(), "\b\b\b", false, 2, null);
    }

    private static final void l(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            int i2 = i + 1;
            if (k(stackTraceElementArr[i])) {
                break;
            }
            i = i2;
        }
        int i3 = i + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i3 > length2) {
            return;
        }
        while (true) {
            int i4 = length2 - 1;
            if (h(stackTraceElementArr[length2], arrayDeque.getLast())) {
                arrayDeque.removeLast();
            }
            arrayDeque.addFirst(stackTraceElementArr[length2]);
            if (length2 == i3) {
                return;
            }
            length2 = i4;
        }
    }

    @Nullable
    public static final Object m(@NotNull Throwable th, @NotNull uv4<?> uv4Var) {
        throw th;
    }

    private static final Object n(Throwable th, uv4<?> uv4Var) {
        throw th;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends Throwable> E o(E e, lw4 lw4Var) {
        hp4 e2 = e(e);
        Throwable th = (Throwable) e2.f();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) e2.g();
        Throwable s = s(th);
        if (s == null) {
            return e;
        }
        ArrayDeque<StackTraceElement> g = g(lw4Var);
        if (g.isEmpty()) {
            return e;
        }
        if (th != e) {
            l(stackTraceElementArr, g);
        }
        return (E) f(th, s, g);
    }

    @NotNull
    public static final <E extends Throwable> E p(@NotNull E e) {
        return e;
    }

    @NotNull
    public static final <E extends Throwable> E q(@NotNull E e, @NotNull uv4<?> uv4Var) {
        return e;
    }

    private static final <E extends Throwable> E r(E e) {
        StackTraceElement stackTraceElement;
        StackTraceElement[] stackTrace = e.getStackTrace();
        int length = stackTrace.length;
        int i = i(stackTrace, d);
        int i2 = i + 1;
        int i3 = i(stackTrace, c);
        int i4 = (length - i) - (i3 == -1 ? 0 : length - i3);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 == 0) {
                stackTraceElement = d("Coroutine boundary");
            } else {
                stackTraceElement = stackTrace[(i2 + i5) - 1];
            }
            stackTraceElementArr[i5] = stackTraceElement;
        }
        e.setStackTrace(stackTraceElementArr);
        return e;
    }

    private static final <E extends Throwable> E s(E e) {
        E e2 = (E) wl5.h(e);
        if (e2 == null) {
            return null;
        }
        if ((e instanceof cc5) || c25.g(e2.getMessage(), e.getMessage())) {
            return e2;
        }
        return null;
    }

    @NotNull
    public static final <E extends Throwable> E t(@NotNull E e) {
        return e;
    }

    @NotNull
    public static final <E extends Throwable> E u(@NotNull E e) {
        E e2 = (E) e.getCause();
        if (e2 != null && c25.g(e2.getClass(), e.getClass())) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            int length = stackTrace.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i];
                i++;
                if (k(stackTraceElement)) {
                    z = true;
                    break;
                }
            }
            if (z) {
                return e2;
            }
        }
        return e;
    }
}