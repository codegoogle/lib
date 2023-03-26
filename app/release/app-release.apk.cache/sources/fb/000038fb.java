package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.p7700g.p99005.qp4;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DebugProbesImpl.kt */
@vo4(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\bÀ\u0002\u0018\u00002\u00020\u0014:\u0002\u0095\u0001B\t\b\u0002¢\u0006\u0004\b\u0001\u0010\u0002J3\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0015\u0010\u0016J@\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\b\b\u0000\u0010\u0017*\u00020\u00142\u001e\b\u0004\u0010\u001b\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00028\u00000\u0018H\u0082\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\u000eJ\u0013\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u000f¢\u0006\u0004\b \u0010\u0012J)\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0\u000f2\u0006\u0010!\u001a\u00020\u00102\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u000f¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020&2\u0006\u0010!\u001a\u00020\u0010¢\u0006\u0004\b'\u0010(J5\u0010,\u001a\b\u0012\u0004\u0012\u00020\"0\u000f2\u0006\u0010)\u001a\u00020&2\b\u0010+\u001a\u0004\u0018\u00010*2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u000fH\u0002¢\u0006\u0004\b,\u0010-J?\u00102\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020.012\u0006\u0010/\u001a\u00020.2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\"0\u00132\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u000fH\u0002¢\u0006\u0004\b2\u00103J3\u00105\u001a\u00020.2\u0006\u00104\u001a\u00020.2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\"0\u00132\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u000fH\u0002¢\u0006\u0004\b5\u00106J\u001d\u00109\u001a\u0010\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\f\u0018\u000107H\u0002¢\u0006\u0004\b9\u0010:J\u0015\u0010=\u001a\u00020&2\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\f¢\u0006\u0004\b?\u0010\u0002J%\u0010A\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\"0\u000fH\u0002¢\u0006\u0004\bA\u0010BJ\u001b\u0010D\u001a\u00020\f2\n\u0010C\u001a\u0006\u0012\u0002\b\u00030\u0019H\u0002¢\u0006\u0004\bD\u0010EJ)\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0000¢\u0006\u0004\bF\u0010GJ\u001b\u0010K\u001a\u00020\f2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0004\bI\u0010JJ\u001b\u0010M\u001a\u00020\f2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0004\bL\u0010JJ'\u0010P\u001a\b\u0012\u0004\u0012\u00020\"0\u000f\"\b\b\u0000\u0010\u0003*\u00020N2\u0006\u0010O\u001a\u00028\u0000H\u0002¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\fH\u0002¢\u0006\u0004\bR\u0010\u0002J\u000f\u0010S\u001a\u00020\fH\u0002¢\u0006\u0004\bS\u0010\u0002J\r\u0010T\u001a\u00020\f¢\u0006\u0004\bT\u0010\u0002J\u001f\u0010V\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020U2\u0006\u0010)\u001a\u00020&H\u0002¢\u0006\u0004\bV\u0010WJ#\u0010X\u001a\u00020\f2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010)\u001a\u00020&H\u0002¢\u0006\u0004\bX\u0010YJ/\u0010X\u001a\u00020\f2\n\u0010C\u001a\u0006\u0012\u0002\b\u00030\u00192\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010)\u001a\u00020&H\u0002¢\u0006\u0004\bX\u0010ZJ;\u0010b\u001a\u00020\f*\u00020;2\u0012\u0010]\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\\0[2\n\u0010`\u001a\u00060^j\u0002`_2\u0006\u0010a\u001a\u00020&H\u0002¢\u0006\u0004\bb\u0010cJ\u0017\u0010d\u001a\u000208*\u0006\u0012\u0002\b\u00030\u0019H\u0002¢\u0006\u0004\bd\u0010eJ\u001d\u0010C\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0019*\u0006\u0012\u0002\b\u00030\u0004H\u0002¢\u0006\u0004\bC\u0010fJ\u001a\u0010C\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0019*\u00020UH\u0082\u0010¢\u0006\u0004\bC\u0010gJ\u0016\u0010h\u001a\u0004\u0018\u00010U*\u00020UH\u0082\u0010¢\u0006\u0004\bh\u0010iJ\u001b\u0010j\u001a\u0004\u0018\u00010\u0006*\b\u0012\u0004\u0012\u00020\"0\u000fH\u0002¢\u0006\u0004\bj\u0010kJ\u0013\u0010l\u001a\u00020&*\u00020\u0014H\u0002¢\u0006\u0004\bl\u0010mR\u0014\u0010n\u001a\u00020&8\u0002X\u0082T¢\u0006\u0006\n\u0004\bn\u0010oR \u0010q\u001a\u000e\u0012\u0004\u0012\u00020U\u0012\u0004\u0012\u00020\\0p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u001e\u0010v\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00190s8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bt\u0010uR$\u0010w\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0019\u0012\u0004\u0012\u0002080p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010rR\u0014\u0010y\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010|\u001a\u00020{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\"\u0010~\u001a\u0010\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\f\u0018\u0001078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR)\u0010\u0080\u0001\u001a\u0002088\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0019\u0010\u0086\u0001\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0017\u0010\u0089\u0001\u001a\u0002088@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0088\u0001\u0010\u0083\u0001R)\u0010\u008a\u0001\u001a\u0002088\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008a\u0001\u0010\u0081\u0001\u001a\u0006\b\u008b\u0001\u0010\u0083\u0001\"\u0006\b\u008c\u0001\u0010\u0085\u0001R\u001b\u0010\u008d\u0001\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\"\u0010\u0092\u0001\u001a\u00020&*\u00020;8BX\u0082\u0004¢\u0006\u000f\u0012\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0005\b\u008f\u0001\u0010>R\u001b\u0010\u0093\u0001\u001a\u000208*\u00020\"8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001¨\u0006\u0096\u0001"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebugProbesImpl;", "<init>", "()V", "T", "Lkotlin/coroutines/Continuation;", "completion", "Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "frame", "createOwner", "(Lkotlin/coroutines/Continuation;Lkotlinx/coroutines/debug/internal/StackTraceFrame;)Lkotlin/coroutines/Continuation;", "Ljava/io/PrintStream;", "out", "", "dumpCoroutines", "(Ljava/io/PrintStream;)V", "", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfo;", "dumpCoroutinesInfo", "()Ljava/util/List;", "", "", "dumpCoroutinesInfoAsJsonAndReferences", "()[Ljava/lang/Object;", "R", "Lkotlin/Function2;", "Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "Lkotlin/coroutines/CoroutineContext;", "create", "dumpCoroutinesInfoImpl", "(Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "dumpCoroutinesSynchronized", "Lkotlinx/coroutines/debug/internal/DebuggerInfo;", "dumpDebuggerInfo", "info", "Ljava/lang/StackTraceElement;", "coroutineTrace", "enhanceStackTraceWithThreadDump", "(Lkotlinx/coroutines/debug/internal/DebugCoroutineInfo;Ljava/util/List;)Ljava/util/List;", "", "enhanceStackTraceWithThreadDumpAsJson", "(Lkotlinx/coroutines/debug/internal/DebugCoroutineInfo;)Ljava/lang/String;", CallMraidJS.b, "Ljava/lang/Thread;", "thread", "enhanceStackTraceWithThreadDumpImpl", "(Ljava/lang/String;Ljava/lang/Thread;Ljava/util/List;)Ljava/util/List;", "", "indexOfResumeWith", "actualTrace", "Lkotlin/Pair;", "findContinuationStartIndex", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)Lkotlin/Pair;", "frameIndex", "findIndexOfFrame", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)I", "Lkotlin/Function1;", "", "getDynamicAttach", "()Lkotlin/jvm/functions/Function1;", "Lkotlinx/coroutines/Job;", "job", "hierarchyToString", "(Lkotlinx/coroutines/Job;)Ljava/lang/String;", "install", "frames", "printStackTrace", "(Ljava/io/PrintStream;Ljava/util/List;)V", "owner", "probeCoroutineCompleted", "(Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;)V", "probeCoroutineCreated$kotlinx_coroutines_core", "(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "probeCoroutineCreated", "probeCoroutineResumed$kotlinx_coroutines_core", "(Lkotlin/coroutines/Continuation;)V", "probeCoroutineResumed", "probeCoroutineSuspended$kotlinx_coroutines_core", "probeCoroutineSuspended", "", "throwable", "sanitizeStackTrace", "(Ljava/lang/Throwable;)Ljava/util/List;", "startWeakRefCleanerThread", "stopWeakRefCleanerThread", "uninstall", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "updateRunningState", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;Ljava/lang/String;)V", "updateState", "(Lkotlin/coroutines/Continuation;Ljava/lang/String;)V", "(Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;Lkotlin/coroutines/Continuation;Ljava/lang/String;)V", "", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "map", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "indent", "build", "(Lkotlinx/coroutines/Job;Ljava/util/Map;Ljava/lang/StringBuilder;Ljava/lang/String;)V", "isFinished", "(Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;)Z", "(Lkotlin/coroutines/Continuation;)Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "realCaller", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "toStackTraceFrame", "(Ljava/util/List;)Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "toStringWithQuotes", "(Ljava/lang/Object;)Ljava/lang/String;", "ARTIFICIAL_FRAME_MESSAGE", "Ljava/lang/String;", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "callerInfoCache", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "", "getCapturedCoroutines", "()Ljava/util/Set;", "capturedCoroutines", "capturedCoroutinesMap", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "coroutineStateLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Ljava/text/SimpleDateFormat;", "dateFormat", "Ljava/text/SimpleDateFormat;", "dynamicAttach", "Lkotlin/jvm/functions/Function1;", "enableCreationStackTraces", "Z", "getEnableCreationStackTraces", "()Z", "setEnableCreationStackTraces", "(Z)V", "installations", AFHydra.STATUS_IDLE, "isInstalled$kotlinx_coroutines_core", "isInstalled", "sanitizeStackTraces", "getSanitizeStackTraces", "setSanitizeStackTraces", "weakRefCleanerThread", "Ljava/lang/Thread;", "getDebugString", "getDebugString$annotations", "(Lkotlinx/coroutines/Job;)V", "debugString", "isInternalMethod", "(Ljava/lang/StackTraceElement;)Z", "CoroutineOwner", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ai5 {
    @NotNull
    public static final ai5 a;
    @NotNull
    private static final String b = "Coroutine creation stacktrace";
    @NotNull
    private static final SimpleDateFormat c;
    @Nullable
    private static Thread d;
    @NotNull
    private static final vh5<a<?>, Boolean> e;
    @NotNull
    private static final /* synthetic */ bi5 f;
    private static final /* synthetic */ AtomicLongFieldUpdater g;
    @NotNull
    private static final ReentrantReadWriteLock h;
    private static boolean i;
    private static volatile int installations;
    private static boolean j;
    @Nullable
    private static final f05<Boolean, yq4> k;
    @NotNull
    private static final vh5<lw4, yh5> l;

    /* compiled from: DebugProbesImpl.kt */
    @vo4(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001e\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016ø\u0001\u0000¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "T", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "delegate", "info", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "frame", "(Lkotlin/coroutines/Continuation;Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)V", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "resumeWith", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a<T> implements uv4<T>, lw4 {
        @cz4
        @NotNull
        public final uv4<T> s;
        @cz4
        @NotNull
        public final yh5 t;
        @Nullable
        private final lw4 u;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull uv4<? super T> uv4Var, @NotNull yh5 yh5Var, @Nullable lw4 lw4Var) {
            this.s = uv4Var;
            this.t = yh5Var;
            this.u = lw4Var;
        }

        @Override // com.p7700g.p99005.lw4
        @Nullable
        public StackTraceElement H() {
            lw4 lw4Var = this.u;
            if (lw4Var == null) {
                return null;
            }
            return lw4Var.H();
        }

        @Override // com.p7700g.p99005.uv4
        @NotNull
        public xv4 getContext() {
            return this.s.getContext();
        }

        @Override // com.p7700g.p99005.lw4
        @Nullable
        public lw4 o() {
            lw4 lw4Var = this.u;
            if (lw4Var == null) {
                return null;
            }
            return lw4Var.o();
        }

        @NotNull
        public String toString() {
            return this.s.toString();
        }

        @Override // com.p7700g.p99005.uv4
        public void u(@NotNull Object obj) {
            ai5.a.E(this);
            this.s.u(obj);
        }
    }

    /* compiled from: DebugProbesImpl.kt */
    @vo4(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "R", "", "owner", "Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "invoke", "(Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;)Ljava/lang/Object;", "kotlinx/coroutines/debug/internal/DebugProbesImpl$dumpCoroutinesInfoImpl$1$3"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends e25 implements f05<a<?>, xh5> {
        public b() {
            super(1);
        }

        @Override // com.p7700g.p99005.f05
        @Nullable
        /* renamed from: a */
        public final xh5 M(@NotNull a<?> aVar) {
            xv4 c;
            if (ai5.a.y(aVar) || (c = aVar.t.c()) == null) {
                return null;
            }
            return new xh5(aVar.t, c);
        }
    }

    /* compiled from: DebugProbesImpl.kt */
    @vo4(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "R", "", "owner", "Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "invoke", "(Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c extends e25 implements f05<a<?>, R> {
        public final /* synthetic */ j05<a<?>, xv4, R> t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(j05<? super a<?>, ? super xv4, ? extends R> j05Var) {
            super(1);
            this.t = j05Var;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [R, java.lang.Object] */
        @Override // com.p7700g.p99005.f05
        @Nullable
        /* renamed from: a */
        public final R M(@NotNull a<?> aVar) {
            xv4 c;
            if (ai5.a.y(aVar) || (c = aVar.t.c()) == null) {
                return null;
            }
            return this.t.w3(aVar, c);
        }
    }

    /* compiled from: Comparisons.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return wu4.g(Long.valueOf(((a) t).t.b), Long.valueOf(((a) t2).t.b));
        }
    }

    /* compiled from: DebugProbesImpl.kt */
    @vo4(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "invoke", "(Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e extends e25 implements f05<a<?>, Boolean> {
        public static final e t = new e();

        public e() {
            super(1);
        }

        @Override // com.p7700g.p99005.f05
        @NotNull
        /* renamed from: a */
        public final Boolean M(@NotNull a<?> aVar) {
            return Boolean.valueOf(!ai5.a.y(aVar));
        }
    }

    /* compiled from: Comparisons.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class f<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return wu4.g(Long.valueOf(((a) t).t.b), Long.valueOf(((a) t2).t.b));
        }
    }

    /* compiled from: DebugProbesImpl.kt */
    @vo4(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "R", "", "owner", "Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "invoke", "(Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;)Ljava/lang/Object;", "kotlinx/coroutines/debug/internal/DebugProbesImpl$dumpCoroutinesInfoImpl$1$3"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class g extends e25 implements f05<a<?>, di5> {
        public g() {
            super(1);
        }

        @Override // com.p7700g.p99005.f05
        @Nullable
        /* renamed from: a */
        public final di5 M(@NotNull a<?> aVar) {
            xv4 c;
            if (ai5.a.y(aVar) || (c = aVar.t.c()) == null) {
                return null;
            }
            return new di5(aVar.t, c);
        }
    }

    /* compiled from: DebugProbesImpl.kt */
    @vo4(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class h extends e25 implements uz4<yq4> {
        public static final h t = new h();

        public h() {
            super(0);
        }

        public final void h() {
            ai5.l.o();
        }

        @Override // com.p7700g.p99005.uz4
        public /* bridge */ /* synthetic */ yq4 x() {
            h();
            return yq4.a;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.p7700g.p99005.bi5] */
    static {
        ai5 ai5Var = new ai5();
        a = ai5Var;
        c = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        e = new vh5<>(false, 1, null);
        f = new Object(0L) { // from class: com.p7700g.p99005.bi5
            public volatile long sequenceNumber;

            {
                this.sequenceNumber = r1;
            }
        };
        h = new ReentrantReadWriteLock();
        i = true;
        j = true;
        k = ai5Var.t();
        l = new vh5<>(true);
        g = AtomicLongFieldUpdater.newUpdater(bi5.class, "sequenceNumber");
    }

    private ai5() {
    }

    private final boolean A(StackTraceElement stackTraceElement) {
        return b95.u2(stackTraceElement.getClassName(), "kotlinx.coroutines", false, 2, null);
    }

    private final a<?> B(uv4<?> uv4Var) {
        lw4 lw4Var = uv4Var instanceof lw4 ? (lw4) uv4Var : null;
        if (lw4Var == null) {
            return null;
        }
        return C(lw4Var);
    }

    private final a<?> C(lw4 lw4Var) {
        while (!(lw4Var instanceof a)) {
            lw4Var = lw4Var.o();
            if (lw4Var == null) {
                return null;
            }
        }
        return (a) lw4Var;
    }

    private final void D(PrintStream printStream, List<StackTraceElement> list) {
        for (StackTraceElement stackTraceElement : list) {
            printStream.print(c25.C("\n\tat ", stackTraceElement));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(a<?> aVar) {
        e.remove(aVar);
        lw4 f2 = aVar.t.f();
        lw4 I = f2 == null ? null : I(f2);
        if (I == null) {
            return;
        }
        l.remove(I);
    }

    private final lw4 I(lw4 lw4Var) {
        do {
            lw4Var = lw4Var.o();
            if (lw4Var == null) {
                return null;
            }
        } while (lw4Var.H() == null);
        return lw4Var;
    }

    private final <T extends Throwable> List<StackTraceElement> J(T t) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i3 = length2 - 1;
                if (c25.g(stackTrace[length2].getClassName(), "kotlin.coroutines.jvm.internal.DebugProbesKt")) {
                    i2 = length2;
                    break;
                } else if (i3 < 0) {
                    break;
                } else {
                    length2 = i3;
                }
            }
        }
        if (!i) {
            int i4 = length - i2;
            ArrayList arrayList = new ArrayList(i4);
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i5 + 1;
                arrayList.add(i5 == 0 ? zm5.d(b) : stackTrace[i5 + i2]);
                i5 = i6;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList((length - i2) + 1);
        arrayList2.add(zm5.d(b));
        while (true) {
            i2++;
            while (i2 < length) {
                if (A(stackTrace[i2])) {
                    arrayList2.add(stackTrace[i2]);
                    int i7 = i2 + 1;
                    while (i7 < length && A(stackTrace[i7])) {
                        i7++;
                    }
                    int i8 = i7 - 1;
                    int i9 = i8;
                    while (i9 > i2 && stackTrace[i9].getFileName() == null) {
                        i9--;
                    }
                    if (i9 > i2 && i9 < i8) {
                        arrayList2.add(stackTrace[i9]);
                    }
                    arrayList2.add(stackTrace[i8]);
                    i2 = i7;
                }
            }
            return arrayList2;
            arrayList2.add(stackTrace[i2]);
        }
    }

    private final void M() {
        Thread b2;
        b2 = fv4.b((r12 & 1) != 0, (r12 & 2) != 0 ? false : true, (r12 & 4) != 0 ? null : null, (r12 & 8) != 0 ? null : "Coroutines Debugger Cleaner", (r12 & 16) != 0 ? -1 : 0, h.t);
        d = b2;
    }

    private final void N() {
        Thread thread = d;
        if (thread == null) {
            return;
        }
        d = null;
        thread.interrupt();
        thread.join();
    }

    private final gi5 O(List<StackTraceElement> list) {
        gi5 gi5Var = null;
        if (!list.isEmpty()) {
            ListIterator<StackTraceElement> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                gi5Var = new gi5(gi5Var, listIterator.previous());
            }
        }
        return gi5Var;
    }

    private final String P(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(h95.b);
        sb.append(obj);
        sb.append(h95.b);
        return sb.toString();
    }

    private final void R(lw4 lw4Var, String str) {
        ReentrantReadWriteLock.ReadLock readLock = h.readLock();
        readLock.lock();
        try {
            ai5 ai5Var = a;
            if (ai5Var.z()) {
                vh5<lw4, yh5> vh5Var = l;
                yh5 remove = vh5Var.remove(lw4Var);
                if (remove == null) {
                    a<?> C = ai5Var.C(lw4Var);
                    lw4 lw4Var2 = null;
                    remove = C == null ? null : C.t;
                    if (remove == null) {
                        return;
                    }
                    lw4 f2 = remove.f();
                    if (f2 != null) {
                        lw4Var2 = ai5Var.I(f2);
                    }
                    if (lw4Var2 != null) {
                        vh5Var.remove(lw4Var2);
                    }
                }
                remove.j(str, (uv4) lw4Var);
                lw4 I = ai5Var.I(lw4Var);
                if (I == null) {
                    return;
                }
                vh5Var.put(I, remove);
                yq4 yq4Var = yq4.a;
            }
        } finally {
            readLock.unlock();
        }
    }

    private final void S(uv4<?> uv4Var, String str) {
        if (z()) {
            if (c25.g(str, zh5.b) && no4.u.f(1, 3, 30)) {
                lw4 lw4Var = uv4Var instanceof lw4 ? (lw4) uv4Var : null;
                if (lw4Var == null) {
                    return;
                }
                R(lw4Var, str);
                return;
            }
            a<?> B = B(uv4Var);
            if (B == null) {
                return;
            }
            T(B, uv4Var, str);
        }
    }

    private final void T(a<?> aVar, uv4<?> uv4Var, String str) {
        ReentrantReadWriteLock.ReadLock readLock = h.readLock();
        readLock.lock();
        try {
            if (a.z()) {
                aVar.t.j(str, uv4Var);
                yq4 yq4Var = yq4.a;
            }
        } finally {
            readLock.unlock();
        }
    }

    private final void d(ee5 ee5Var, Map<ee5, yh5> map, StringBuilder sb, String str) {
        yh5 yh5Var = map.get(ee5Var);
        if (yh5Var == null) {
            if (!(ee5Var instanceof wm5)) {
                StringBuilder G = wo1.G(str);
                G.append(r(ee5Var));
                G.append('\n');
                sb.append(G.toString());
                str = c25.C(str, "\t");
            }
        } else {
            String g2 = yh5Var.g();
            StringBuilder G2 = wo1.G(str);
            wo1.h0(G2, r(ee5Var), ", continuation is ", g2, " at line ");
            G2.append((StackTraceElement) rs4.B2(yh5Var.h()));
            G2.append('\n');
            sb.append(G2.toString());
            str = c25.C(str, "\t");
        }
        for (ee5 ee5Var2 : ee5Var.X()) {
            d(ee5Var2, map, sb, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> uv4<T> e(uv4<? super T> uv4Var, gi5 gi5Var) {
        if (z()) {
            a<?> aVar = new a<>(uv4Var, new yh5(uv4Var.getContext(), gi5Var, g.incrementAndGet(f)), gi5Var);
            vh5<a<?>, Boolean> vh5Var = e;
            vh5Var.put(aVar, Boolean.TRUE);
            if (!z()) {
                vh5Var.clear();
            }
            return aVar;
        }
        return uv4Var;
    }

    private final <R> List<R> i(j05<? super a<?>, ? super xv4, ? extends R> j05Var) {
        ReentrantReadWriteLock reentrantReadWriteLock = h;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        int i3 = 0;
        while (i3 < readHoldCount) {
            i3++;
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            ai5 ai5Var = a;
            if (ai5Var.z()) {
                return o75.c3(o75.p1(o75.K2(rs4.v1(ai5Var.q()), new d()), new c(j05Var)));
            }
            throw new IllegalStateException("Debug probes are not installed".toString());
        } finally {
            z15.d(1);
            while (i2 < readHoldCount) {
                i2++;
                readLock.lock();
            }
            writeLock.unlock();
            z15.c(1);
        }
    }

    private final void j(PrintStream printStream) {
        String g2;
        ReentrantReadWriteLock reentrantReadWriteLock = h;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        int i3 = 0;
        while (i3 < readHoldCount) {
            i3++;
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            ai5 ai5Var = a;
            if (ai5Var.z()) {
                printStream.print(c25.C("Coroutines dump ", c.format(Long.valueOf(System.currentTimeMillis()))));
                for (a aVar : o75.K2(o75.p0(rs4.v1(ai5Var.q()), e.t), new f())) {
                    yh5 yh5Var = aVar.t;
                    List<StackTraceElement> h2 = yh5Var.h();
                    ai5 ai5Var2 = a;
                    List<StackTraceElement> n = ai5Var2.n(yh5Var.g(), yh5Var.e, h2);
                    if (c25.g(yh5Var.g(), zh5.b) && n == h2) {
                        g2 = c25.C(yh5Var.g(), " (Last suspension stacktrace, not an actual stacktrace)");
                    } else {
                        g2 = yh5Var.g();
                    }
                    printStream.print("\n\nCoroutine " + aVar.s + ", state: " + g2);
                    if (h2.isEmpty()) {
                        printStream.print(c25.C("\n\tat ", zm5.d(b)));
                        ai5Var2.D(printStream, yh5Var.e());
                    } else {
                        ai5Var2.D(printStream, n);
                    }
                }
                yq4 yq4Var = yq4.a;
                return;
            }
            throw new IllegalStateException("Debug probes are not installed".toString());
        } finally {
            while (i2 < readHoldCount) {
                i2++;
                readLock.lock();
            }
            writeLock.unlock();
        }
    }

    private final List<StackTraceElement> n(String str, Thread thread, List<StackTraceElement> list) {
        Object b2;
        if (!c25.g(str, zh5.b) || thread == null) {
            return list;
        }
        try {
            qp4.a aVar = qp4.s;
            b2 = qp4.b(thread.getStackTrace());
        } catch (Throwable th) {
            qp4.a aVar2 = qp4.s;
            b2 = qp4.b(rp4.a(th));
        }
        if (qp4.i(b2)) {
            b2 = null;
        }
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) b2;
        if (stackTraceElementArr == null) {
            return list;
        }
        int length = stackTraceElementArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            int i3 = i2 + 1;
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            if (c25.g(stackTraceElement.getClassName(), "kotlin.coroutines.jvm.internal.BaseContinuationImpl") && c25.g(stackTraceElement.getMethodName(), "resumeWith") && c25.g(stackTraceElement.getFileName(), "ContinuationImpl.kt")) {
                break;
            }
            i2 = i3;
        }
        hp4<Integer, Integer> o = o(i2, stackTraceElementArr, list);
        int intValue = o.f().intValue();
        int intValue2 = o.g().intValue();
        if (intValue == -1) {
            return list;
        }
        ArrayList arrayList = new ArrayList((((list.size() + i2) - intValue) - 1) - intValue2);
        int i4 = i2 - intValue2;
        for (int i5 = 0; i5 < i4; i5++) {
            arrayList.add(stackTraceElementArr[i5]);
        }
        int size = list.size();
        for (int i6 = intValue + 1; i6 < size; i6++) {
            arrayList.add(list.get(i6));
        }
        return arrayList;
    }

    private final hp4<Integer, Integer> o(int i2, StackTraceElement[] stackTraceElementArr, List<StackTraceElement> list) {
        int i3 = 0;
        while (i3 < 3) {
            int i4 = i3 + 1;
            int p = a.p((i2 - 1) - i3, stackTraceElementArr, list);
            if (p != -1) {
                return cq4.a(Integer.valueOf(p), Integer.valueOf(i3));
            }
            i3 = i4;
        }
        return cq4.a(-1, 0);
    }

    private final int p(int i2, StackTraceElement[] stackTraceElementArr, List<StackTraceElement> list) {
        StackTraceElement stackTraceElement = (StackTraceElement) as4.qf(stackTraceElementArr, i2);
        if (stackTraceElement == null) {
            return -1;
        }
        int i3 = 0;
        for (StackTraceElement stackTraceElement2 : list) {
            if (c25.g(stackTraceElement2.getFileName(), stackTraceElement.getFileName()) && c25.g(stackTraceElement2.getClassName(), stackTraceElement.getClassName()) && c25.g(stackTraceElement2.getMethodName(), stackTraceElement.getMethodName())) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    private final Set<a<?>> q() {
        return e.keySet();
    }

    private final String r(ee5 ee5Var) {
        return ee5Var instanceof me5 ? ((me5) ee5Var).l1() : ee5Var.toString();
    }

    private static /* synthetic */ void s(ee5 ee5Var) {
    }

    private final f05<Boolean, yq4> t() {
        Object b2;
        Object newInstance;
        try {
            qp4.a aVar = qp4.s;
            newInstance = Class.forName("kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(new Object[0]);
        } catch (Throwable th) {
            qp4.a aVar2 = qp4.s;
            b2 = qp4.b(rp4.a(th));
        }
        if (newInstance != null) {
            b2 = qp4.b((f05) k35.q(newInstance, 1));
            if (qp4.i(b2)) {
                b2 = null;
            }
            return (f05) b2;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean y(a<?> aVar) {
        xv4 c2 = aVar.t.c();
        ee5 ee5Var = c2 == null ? null : (ee5) c2.get(ee5.m0);
        if (ee5Var != null && ee5Var.m()) {
            e.remove(aVar);
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final <T> uv4<T> F(@NotNull uv4<? super T> uv4Var) {
        if (z() && B(uv4Var) == null) {
            return e(uv4Var, j ? O(J(new Exception())) : null);
        }
        return uv4Var;
    }

    public final void G(@NotNull uv4<?> uv4Var) {
        S(uv4Var, zh5.b);
    }

    public final void H(@NotNull uv4<?> uv4Var) {
        S(uv4Var, zh5.c);
    }

    public final void K(boolean z) {
        j = z;
    }

    public final void L(boolean z) {
        i = z;
    }

    public final void Q() {
        ReentrantReadWriteLock reentrantReadWriteLock = h;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        int i3 = 0;
        while (i3 < readHoldCount) {
            i3++;
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            ai5 ai5Var = a;
            if (ai5Var.z()) {
                installations--;
                if (installations != 0) {
                    return;
                }
                ai5Var.N();
                e.clear();
                l.clear();
                if (uh5.a.a()) {
                    while (i2 < readHoldCount) {
                        i2++;
                        readLock.lock();
                    }
                    writeLock.unlock();
                    return;
                }
                f05<Boolean, yq4> f05Var = k;
                if (f05Var != null) {
                    f05Var.M(Boolean.FALSE);
                }
                yq4 yq4Var = yq4.a;
                while (i2 < readHoldCount) {
                    i2++;
                    readLock.lock();
                }
                writeLock.unlock();
                return;
            }
            throw new IllegalStateException("Agent was not installed".toString());
        } finally {
            while (i2 < readHoldCount) {
                i2++;
                readLock.lock();
            }
            writeLock.unlock();
        }
    }

    public final void f(@NotNull PrintStream printStream) {
        synchronized (printStream) {
            a.j(printStream);
            yq4 yq4Var = yq4.a;
        }
    }

    @NotNull
    public final List<xh5> g() {
        ReentrantReadWriteLock reentrantReadWriteLock = h;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        int i3 = 0;
        while (i3 < readHoldCount) {
            i3++;
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            ai5 ai5Var = a;
            if (ai5Var.z()) {
                return o75.c3(o75.p1(o75.K2(rs4.v1(ai5Var.q()), new d()), new b()));
            }
            throw new IllegalStateException("Debug probes are not installed".toString());
        } finally {
            while (i2 < readHoldCount) {
                i2++;
                readLock.lock();
            }
            writeLock.unlock();
        }
    }

    @NotNull
    public final Object[] h() {
        String z;
        List<xh5> g2 = g();
        int size = g2.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size);
        ArrayList arrayList3 = new ArrayList(size);
        for (xh5 xh5Var : g2) {
            xv4 a2 = xh5Var.a();
            kc5 kc5Var = (kc5) a2.get(kc5.s);
            Long l2 = null;
            String P = (kc5Var == null || (z = kc5Var.z()) == null) ? null : P(z);
            ec5 ec5Var = (ec5) a2.get(ec5.s);
            String P2 = ec5Var == null ? null : P(ec5Var);
            StringBuilder sb = new StringBuilder();
            sb.append("\n                {\n                    \"name\": ");
            sb.append((Object) P);
            sb.append(",\n                    \"id\": ");
            ic5 ic5Var = (ic5) a2.get(ic5.s);
            if (ic5Var != null) {
                l2 = Long.valueOf(ic5Var.z());
            }
            sb.append(l2);
            sb.append(",\n                    \"dispatcher\": ");
            sb.append((Object) P2);
            sb.append(",\n                    \"sequenceNumber\": ");
            sb.append(xh5Var.f());
            sb.append(",\n                    \"state\": \"");
            sb.append(xh5Var.g());
            sb.append("\"\n                } \n                ");
            arrayList3.add(u85.p(sb.toString()));
            arrayList2.add(xh5Var.d());
            arrayList.add(xh5Var.e());
        }
        Object[] array = arrayList.toArray(new Thread[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Object[] array2 = arrayList2.toArray(new lw4[0]);
        Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Object[] array3 = g2.toArray(new xh5[0]);
        Objects.requireNonNull(array3, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return new Object[]{wo1.B(wo1.F(f14.u), rs4.h3(arrayList3, null, null, null, 0, null, null, 63, null), f14.v), array, array2, array3};
    }

    @NotNull
    public final List<di5> k() {
        ReentrantReadWriteLock reentrantReadWriteLock = h;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        int i3 = 0;
        while (i3 < readHoldCount) {
            i3++;
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            ai5 ai5Var = a;
            if (ai5Var.z()) {
                return o75.c3(o75.p1(o75.K2(rs4.v1(ai5Var.q()), new d()), new g()));
            }
            throw new IllegalStateException("Debug probes are not installed".toString());
        } finally {
            while (i2 < readHoldCount) {
                i2++;
                readLock.lock();
            }
            writeLock.unlock();
        }
    }

    @NotNull
    public final List<StackTraceElement> l(@NotNull xh5 xh5Var, @NotNull List<StackTraceElement> list) {
        return n(xh5Var.g(), xh5Var.e(), list);
    }

    @NotNull
    public final String m(@NotNull xh5 xh5Var) {
        List<StackTraceElement> l2 = l(xh5Var, xh5Var.h());
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : l2) {
            StringBuilder G = wo1.G("\n                {\n                    \"declaringClass\": \"");
            G.append((Object) stackTraceElement.getClassName());
            G.append("\",\n                    \"methodName\": \"");
            G.append((Object) stackTraceElement.getMethodName());
            G.append("\",\n                    \"fileName\": ");
            String fileName = stackTraceElement.getFileName();
            G.append((Object) (fileName == null ? null : P(fileName)));
            G.append(",\n                    \"lineNumber\": ");
            G.append(stackTraceElement.getLineNumber());
            G.append("\n                }\n                ");
            arrayList.add(u85.p(G.toString()));
        }
        return wo1.B(wo1.F(f14.u), rs4.h3(arrayList, null, null, null, 0, null, null, 63, null), f14.v);
    }

    public final boolean u() {
        return j;
    }

    public final boolean v() {
        return i;
    }

    @NotNull
    public final String w(@NotNull ee5 ee5Var) {
        ReentrantReadWriteLock reentrantReadWriteLock = h;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        int i3 = 0;
        while (i3 < readHoldCount) {
            i3++;
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            ai5 ai5Var = a;
            if (ai5Var.z()) {
                Set<a<?>> q = ai5Var.q();
                ArrayList arrayList = new ArrayList();
                for (Object obj : q) {
                    if (((a) obj).s.getContext().get(ee5.m0) != null) {
                        arrayList.add(obj);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(i55.n(mt4.j(ks4.Z(arrayList, 10)), 16));
                for (Object obj2 : arrayList) {
                    linkedHashMap.put(ie5.B(((a) obj2).s.getContext()), ((a) obj2).t);
                }
                StringBuilder sb = new StringBuilder();
                a.d(ee5Var, linkedHashMap, sb, "");
                String sb2 = sb.toString();
                c25.o(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            }
            throw new IllegalStateException("Debug probes are not installed".toString());
        } finally {
            while (i2 < readHoldCount) {
                i2++;
                readLock.lock();
            }
            writeLock.unlock();
        }
    }

    public final void x() {
        ReentrantReadWriteLock reentrantReadWriteLock = h;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        int i3 = 0;
        while (i3 < readHoldCount) {
            i3++;
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            ai5 ai5Var = a;
            installations++;
            if (installations > 1) {
                return;
            }
            ai5Var.M();
            if (uh5.a.a()) {
                while (i2 < readHoldCount) {
                    i2++;
                    readLock.lock();
                }
                writeLock.unlock();
                return;
            }
            f05<Boolean, yq4> f05Var = k;
            if (f05Var != null) {
                f05Var.M(Boolean.TRUE);
            }
            yq4 yq4Var = yq4.a;
            while (i2 < readHoldCount) {
                i2++;
                readLock.lock();
            }
            writeLock.unlock();
        } finally {
            while (i2 < readHoldCount) {
                i2++;
                readLock.lock();
            }
            writeLock.unlock();
        }
    }

    public final boolean z() {
        return installations > 0;
    }
}