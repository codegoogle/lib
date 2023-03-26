package com.p7700g.p99005;

import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.NotNull;

/* compiled from: Debug.kt */
@vo4(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0015H\u0081\b\u001a\b\u0010\u0016\u001a\u00020\u0013H\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0014\u0010\b\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0003\"\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000\"\u0014\u0010\u000f\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0003\"\u000e\u0010\u0011\u001a\u00020\u000bX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"ASSERTIONS_ENABLED", "", "getASSERTIONS_ENABLED", "()Z", "COROUTINE_ID", "Ljava/util/concurrent/atomic/AtomicLong;", "getCOROUTINE_ID", "()Ljava/util/concurrent/atomic/AtomicLong;", "DEBUG", "getDEBUG", "DEBUG_PROPERTY_NAME", "", "DEBUG_PROPERTY_VALUE_AUTO", "DEBUG_PROPERTY_VALUE_OFF", "DEBUG_PROPERTY_VALUE_ON", "RECOVER_STACK_TRACES", "getRECOVER_STACK_TRACES", "STACKTRACE_RECOVERY_PROPERTY_NAME", "assert", "", "value", "Lkotlin/Function0;", "resetCoroutineId", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class pc5 {
    @NotNull
    public static final String a = "kotlinx.coroutines.debug";
    @NotNull
    public static final String b = "kotlinx.coroutines.stacktrace.recovery";
    @NotNull
    public static final String c = "auto";
    @NotNull
    public static final String d = "on";
    @NotNull
    public static final String e = "off";
    private static final boolean f = false;
    private static final boolean g;
    private static final boolean h;
    @NotNull
    private static final AtomicLong i;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
        if (r0.equals(com.p7700g.p99005.pc5.d) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
        if (r0.equals("") != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
        r0 = true;
     */
    static {
        String d2 = cn5.d(a);
        boolean z = true;
        if (d2 != null) {
            int hashCode = d2.hashCode();
            if (hashCode != 0) {
                if (hashCode != 3551) {
                    if (hashCode == 109935) {
                    }
                }
                throw new IllegalStateException(("System property 'kotlinx.coroutines.debug' has unrecognized value '" + ((Object) d2) + '\'').toString());
            }
            g = r0;
            h = (r0 || !cn5.e(b, true)) ? false : false;
            i = new AtomicLong(0L);
        }
        boolean z2 = false;
        g = z2;
        h = (z2 || !cn5.e(b, true)) ? false : false;
        i = new AtomicLong(0L);
    }

    @dx4
    private static final void a(uz4<Boolean> uz4Var) {
    }

    public static final boolean b() {
        return f;
    }

    @NotNull
    public static final AtomicLong c() {
        return i;
    }

    public static final boolean d() {
        return g;
    }

    public static final boolean e() {
        return h;
    }

    public static final void f() {
        i.set(0L);
    }
}