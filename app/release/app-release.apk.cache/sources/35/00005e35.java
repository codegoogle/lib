package com.p7700g.p99005;

import android.annotation.SuppressLint;
import com.p7700g.p99005.qp4;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sun.misc.Signal;

/* compiled from: AgentPremain.kt */
@vo4(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/debug/AgentPremain;", "", "()V", "enableCreationStackTraces", "", "installSignalHandler", "", "premain", "args", "", "instrumentation", "Ljava/lang/instrument/Instrumentation;", "DebugProbesTransformer", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
@SuppressLint({"all"})
@IgnoreJRERequirement
/* loaded from: classes3.dex */
public final class th5 {
    @NotNull
    public static final th5 a = new th5();
    private static final boolean b;

    /* compiled from: AgentPremain.kt */
    @vo4(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/debug/AgentPremain$DebugProbesTransformer;", "Ljava/lang/instrument/ClassFileTransformer;", "()V", "transform", "", "loader", "Ljava/lang/ClassLoader;", "className", "", "classBeingRedefined", "Ljava/lang/Class;", "protectionDomain", "Ljava/security/ProtectionDomain;", "classfileBuffer", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements ClassFileTransformer {
        @NotNull
        public static final a a = new a();

        private a() {
        }

        @Nullable
        public byte[] a(@NotNull ClassLoader classLoader, @NotNull String str, @Nullable Class<?> cls, @NotNull ProtectionDomain protectionDomain, @Nullable byte[] bArr) {
            if (c25.g(str, "kotlin/coroutines/jvm/internal/DebugProbesKt")) {
                uh5.a.b(true);
                return tx4.p(classLoader.getResourceAsStream("DebugProbesKt.bin"));
            }
            return null;
        }
    }

    static {
        Object b2;
        try {
            qp4.a aVar = qp4.s;
            String property = System.getProperty("kotlinx.coroutines.debug.enable.creation.stack.trace");
            b2 = qp4.b(property == null ? null : Boolean.valueOf(Boolean.parseBoolean(property)));
        } catch (Throwable th) {
            qp4.a aVar2 = qp4.s;
            b2 = qp4.b(rp4.a(th));
        }
        Boolean bool = qp4.i(b2) ? null : b2;
        b = bool == null ? ai5.a.u() : bool.booleanValue();
    }

    private th5() {
    }

    private final void a() {
        try {
            Signal.handle(new Signal("TRAP"), sh5.a);
        } catch (Throwable unused) {
        }
    }

    private static final void b(Signal signal) {
        ai5 ai5Var = ai5.a;
        if (ai5Var.z()) {
            ai5Var.f(System.out);
        } else {
            System.out.println((Object) "Cannot perform coroutines dump, debug probes are disabled");
        }
    }

    @jz4
    public static final void c(@Nullable String str, @NotNull Instrumentation instrumentation) {
        uh5.a.b(true);
        instrumentation.addTransformer(a.a);
        ai5 ai5Var = ai5.a;
        ai5Var.K(b);
        ai5Var.x();
        a.a();
    }
}