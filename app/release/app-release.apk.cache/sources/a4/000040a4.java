package com.p7700g.p99005;

import com.onesignal.shortcutbadger.impl.NewHtcHomeBadger;
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
/* compiled from: Migration.kt */
@vo4(d1 = {"\u0000x\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000\u001a\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0003H\u0007\u001a¸\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0003\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\b\"\u0004\b\u0002\u0010\t\"\u0004\b\u0003\u0010\n\"\u0004\b\u0004\u0010\u000b\"\u0004\b\u0005\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00070\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\t0\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\n0\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u00032:\u0010\u0010\u001a6\b\u0001\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u0002H\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0014\u001a\u009e\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0003\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\b\"\u0004\b\u0002\u0010\t\"\u0004\b\u0003\u0010\n\"\u0004\b\u0004\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00070\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\t0\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\n0\u000324\u0010\u0010\u001a0\b\u0001\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0015H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0016\u001a\u0084\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0003\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\b\"\u0004\b\u0002\u0010\t\"\u0004\b\u0003\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00070\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\t0\u00032.\u0010\u0010\u001a*\b\u0001\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\t\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0017H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0018\u001aj\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0003\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\b\"\u0004\b\u0002\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00070\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\u00032(\u0010\u0010\u001a$\b\u0001\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0019H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001a\u001aI\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0003\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00040\u00032#\u0010\u001c\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00030\u001d¢\u0006\u0002\b\u001eH\u0007\u001a>\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0003\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00040\u00032\u0018\u0010 \u001a\u0014\u0012\u0004\u0012\u0002H\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00030\u001dH\u0007\u001a+\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00032\u0006\u0010\"\u001a\u0002H\u0004H\u0007¢\u0006\u0002\u0010#\u001a,\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003H\u0007\u001a&\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00032\u0006\u0010%\u001a\u00020&H\u0007\u001a&\u0010'\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00032\u0006\u0010%\u001a\u00020&H\u0007\u001aV\u0010(\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0003\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00040\u00032(\u0010 \u001a$\b\u0001\u0012\u0004\u0012\u0002H\u0004\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00030\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130)H\u0007ø\u0001\u0000¢\u0006\u0002\u0010*\u001a$\u0010+\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00030\u0003H\u0007\u001aS\u0010,\u001a\u00020-\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u000321\u0010.\u001a-\b\u0001\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130)H\u0007ø\u0001\u0000¢\u0006\u0002\u00101\u001a$\u00102\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00030\u0003H\u0007\u001a&\u00103\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00032\u0006\u00104\u001a\u000205H\u0007\u001a,\u00106\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00032\f\u00107\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003H\u0007\u001a,\u00108\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00032\f\u00107\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003H\u0007\u001a+\u00109\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00032\u0006\u00107\u001a\u0002H\u0004H\u0007¢\u0006\u0002\u0010#\u001aA\u00109\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00032\u0006\u00107\u001a\u0002H\u00042\u0014\b\u0002\u0010:\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020<0\u001dH\u0007¢\u0006\u0002\u0010=\u001a\u001e\u0010>\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0003H\u0007\u001a&\u0010>\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00032\u0006\u0010?\u001a\u00020@H\u0007\u001a&\u0010A\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00032\u0006\u00104\u001a\u000205H\u0007\u001a\u001e\u0010B\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0003H\u0007\u001a&\u0010B\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00032\u0006\u0010?\u001a\u00020@H\u0007\u001a~\u0010C\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0003\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00040\u00032\u0006\u0010D\u001a\u0002H\u00062H\b\u0001\u0010E\u001aB\b\u0001\u0012\u0013\u0012\u0011H\u0006¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(F\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(\"\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0019H\u0007ø\u0001\u0000¢\u0006\u0002\u0010G\u001an\u0010H\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00032F\u0010E\u001aB\b\u0001\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(F\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(\"\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0019H\u0007ø\u0001\u0000¢\u0006\u0002\u0010I\u001a&\u0010J\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00032\u0006\u0010K\u001a\u00020@H\u0007\u001a+\u0010L\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00032\u0006\u0010\"\u001a\u0002H\u0004H\u0007¢\u0006\u0002\u0010#\u001a,\u0010L\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003H\u0007\u001a\u0018\u0010M\u001a\u00020-\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0003H\u0007\u001aD\u0010M\u001a\u00020-\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00032\"\u0010N\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130)H\u0007ø\u0001\u0000¢\u0006\u0002\u00101\u001ah\u0010M\u001a\u00020-\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00032\"\u0010N\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130)2\"\u0010O\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020;\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130)H\u0007ø\u0001\u0000¢\u0006\u0002\u0010P\u001a&\u0010Q\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00032\u0006\u00104\u001a\u000205H\u0007\u001ae\u0010R\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0003\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00040\u000327\u0010\u0010\u001a3\b\u0001\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(\"\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00030\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130)H\u0007ø\u0001\u0000¢\u0006\u0002\u0010*\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006S"}, d2 = {"noImpl", "", com.anythink.expressad.foundation.g.a.a.a, "Lkotlinx/coroutines/flow/Flow;", "T", "combineLatest", "R", "T1", "T2", "T3", "T4", "T5", "other", "other2", "other3", "other4", "transform", "Lkotlin/Function6;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function6;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function5;", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function5;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function4;", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function4;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function3;", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "compose", "transformer", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "concatMap", "mapper", "concatWith", "value", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;)Lkotlinx/coroutines/flow/Flow;", "delayEach", "timeMillis", "", "delayFlow", "flatMap", "Lkotlin/Function2;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "flatten", "forEach", "", "action", "Lkotlin/ParameterName;", "name", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)V", "merge", "observeOn", "context", "Lkotlin/coroutines/CoroutineContext;", "onErrorResume", "fallback", "onErrorResumeNext", "onErrorReturn", "predicate", "", "", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;", "publish", "bufferSize", "", "publishOn", "replay", "scanFold", "initial", "operation", "accumulator", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "scanReduce", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "skip", NewHtcHomeBadger.d, "startWith", "subscribe", "onEach", "onError", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "subscribeOn", "switchMap", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes3.dex */
public final /* synthetic */ class ej5 {

    /* compiled from: Migration.kt */
    @mw4(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayEach$1", f = "Migration.kt", i = {}, l = {427}, m = "invokeSuspend", n = {}, s = {})
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T", "it"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends vw4 implements j05<T, uv4<? super yq4>, Object> {
        public int w;
        public final /* synthetic */ long x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, uv4<? super a> uv4Var) {
            super(2, uv4Var);
            this.x = j;
        }

        @Override // com.p7700g.p99005.j05
        @Nullable
        /* renamed from: C3 */
        public final Object w3(T t, @Nullable uv4<? super yq4> uv4Var) {
            return ((a) X(t, uv4Var)).D1(yq4.a);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            Object h = gw4.h();
            int i = this.w;
            if (i == 0) {
                rp4.n(obj);
                long j = this.x;
                this.w = 1;
                if (wc5.b(j, this) == h) {
                    return h;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                rp4.n(obj);
            }
            return yq4.a;
        }

        @Override // com.p7700g.p99005.hw4
        @NotNull
        public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
            return new a(this.x, uv4Var);
        }
    }

    /* compiled from: Migration.kt */
    @mw4(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayFlow$1", f = "Migration.kt", i = {}, l = {415}, m = "invokeSuspend", n = {}, s = {})
    @vo4(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends vw4 implements j05<qi5<? super T>, uv4<? super yq4>, Object> {
        public int w;
        public final /* synthetic */ long x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, uv4<? super b> uv4Var) {
            super(2, uv4Var);
            this.x = j;
        }

        @Override // com.p7700g.p99005.j05
        @Nullable
        /* renamed from: C3 */
        public final Object w3(@NotNull qi5<? super T> qi5Var, @Nullable uv4<? super yq4> uv4Var) {
            return ((b) X(qi5Var, uv4Var)).D1(yq4.a);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            Object h = gw4.h();
            int i = this.w;
            if (i == 0) {
                rp4.n(obj);
                long j = this.x;
                this.w = 1;
                if (wc5.b(j, this) == h) {
                    return h;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                rp4.n(obj);
            }
            return yq4.a;
        }

        @Override // com.p7700g.p99005.hw4
        @NotNull
        public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
            return new b(this.x, uv4Var);
        }
    }

    /* compiled from: Migration.kt */
    @vo4(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "it", "", "invoke", "(Ljava/lang/Throwable;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c extends e25 implements f05<Throwable, Boolean> {
        public static final c t = new c();

        public c() {
            super(1);
        }

        @Override // com.p7700g.p99005.f05
        @NotNull
        /* renamed from: a */
        public final Boolean M(@NotNull Throwable th) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: Migration.kt */
    @mw4(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$2", f = "Migration.kt", i = {}, l = {306}, m = "invokeSuspend", n = {}, s = {})
    @vo4(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "e", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d extends vw4 implements k05<qi5<? super T>, Throwable, uv4<? super yq4>, Object> {
        public final /* synthetic */ T A;
        public int w;
        private /* synthetic */ Object x;
        public /* synthetic */ Object y;
        public final /* synthetic */ f05<Throwable, Boolean> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(f05<? super Throwable, Boolean> f05Var, T t, uv4<? super d> uv4Var) {
            super(3, uv4Var);
            this.z = f05Var;
            this.A = t;
        }

        @Nullable
        public final Object C3(@NotNull qi5<? super T> qi5Var, @NotNull Throwable th, @Nullable uv4<? super yq4> uv4Var) {
            d dVar = new d(this.z, this.A, uv4Var);
            dVar.x = qi5Var;
            dVar.y = th;
            return dVar.D1(yq4.a);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            Object h = gw4.h();
            int i = this.w;
            if (i == 0) {
                rp4.n(obj);
                qi5 qi5Var = (qi5) this.x;
                Throwable th = (Throwable) this.y;
                if (this.z.M(th).booleanValue()) {
                    T t = this.A;
                    this.x = null;
                    this.w = 1;
                    if (qi5Var.b(t, this) == h) {
                        return h;
                    }
                } else {
                    throw th;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                rp4.n(obj);
            }
            return yq4.a;
        }

        @Override // com.p7700g.p99005.k05
        public /* bridge */ /* synthetic */ Object I(Object obj, Throwable th, uv4<? super yq4> uv4Var) {
            return C3((qi5) obj, th, uv4Var);
        }
    }

    /* compiled from: Merge.kt */
    @mw4(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1", f = "Migration.kt", i = {}, l = {190, 190}, m = "invokeSuspend", n = {}, s = {})
    @vo4(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u008a@¨\u0006\u0006"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e extends vw4 implements k05<qi5<? super R>, T, uv4<? super yq4>, Object> {
        public int w;
        private /* synthetic */ Object x;
        public /* synthetic */ Object y;
        public final /* synthetic */ j05 z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(j05 j05Var, uv4 uv4Var) {
            super(3, uv4Var);
            this.z = j05Var;
        }

        @Nullable
        public final Object C3(@NotNull qi5<? super R> qi5Var, T t, @Nullable uv4<? super yq4> uv4Var) {
            e eVar = new e(this.z, uv4Var);
            eVar.x = qi5Var;
            eVar.y = t;
            return eVar.D1(yq4.a);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            qi5 qi5Var;
            Object h = gw4.h();
            int i = this.w;
            if (i == 0) {
                rp4.n(obj);
                qi5Var = (qi5) this.x;
                Object obj2 = this.y;
                j05 j05Var = this.z;
                this.x = qi5Var;
                this.w = 1;
                obj = j05Var.w3(obj2, this);
                if (obj == h) {
                    return h;
                }
            } else if (i != 1) {
                if (i == 2) {
                    rp4.n(obj);
                    return yq4.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                qi5Var = (qi5) this.x;
                rp4.n(obj);
            }
            this.x = null;
            this.w = 2;
            if (ri5.m0(qi5Var, (pi5) obj, this) == h) {
                return h;
            }
            return yq4.a;
        }

        @Override // com.p7700g.p99005.k05
        public /* bridge */ /* synthetic */ Object I(Object obj, Object obj2, uv4<? super yq4> uv4Var) {
            return C3((qi5) obj, obj2, uv4Var);
        }
    }

    @xn4(level = zn4.ERROR, message = "Flow analogue of 'replay(bufferSize)' is 'shareIn' with the specified replay parameter. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @op4(expression = "this.shareIn(scope, bufferSize)", imports = {}))
    @NotNull
    public static final <T> pi5<T> A(@NotNull pi5<? extends T> pi5Var, int i) {
        throw wo1.V();
    }

    @xn4(level = zn4.ERROR, message = "Flow has less verbose 'scan' shortcut", replaceWith = @op4(expression = "scan(initial, operation)", imports = {}))
    @NotNull
    public static final <T, R> pi5<R> B(@NotNull pi5<? extends T> pi5Var, R r, @on4 @NotNull k05<? super R, ? super T, ? super uv4<? super R>, ? extends Object> k05Var) {
        throw wo1.V();
    }

    @xn4(level = zn4.ERROR, message = "'scanReduce' was renamed to 'runningReduce' to be consistent with Kotlin standard library", replaceWith = @op4(expression = "runningReduce(operation)", imports = {}))
    @NotNull
    public static final <T> pi5<T> C(@NotNull pi5<? extends T> pi5Var, @NotNull k05<? super T, ? super T, ? super uv4<? super T>, ? extends Object> k05Var) {
        return ri5.z1(pi5Var, k05Var);
    }

    @xn4(level = zn4.ERROR, message = "Flow analogue of 'skip' is 'drop'", replaceWith = @op4(expression = "drop(count)", imports = {}))
    @NotNull
    public static final <T> pi5<T> D(@NotNull pi5<? extends T> pi5Var, int i) {
        throw wo1.V();
    }

    @xn4(level = zn4.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emit(value) }'", replaceWith = @op4(expression = "onStart { emit(value) }", imports = {}))
    @NotNull
    public static final <T> pi5<T> E(@NotNull pi5<? extends T> pi5Var, T t) {
        throw wo1.V();
    }

    @xn4(level = zn4.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emitAll(other) }'", replaceWith = @op4(expression = "onStart { emitAll(other) }", imports = {}))
    @NotNull
    public static final <T> pi5<T> F(@NotNull pi5<? extends T> pi5Var, @NotNull pi5<? extends T> pi5Var2) {
        throw wo1.V();
    }

    @xn4(level = zn4.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void G(@NotNull pi5<? extends T> pi5Var) {
        throw wo1.V();
    }

    @xn4(level = zn4.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void H(@NotNull pi5<? extends T> pi5Var, @NotNull j05<? super T, ? super uv4<? super yq4>, ? extends Object> j05Var) {
        throw wo1.V();
    }

    @xn4(level = zn4.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void I(@NotNull pi5<? extends T> pi5Var, @NotNull j05<? super T, ? super uv4<? super yq4>, ? extends Object> j05Var, @NotNull j05<? super Throwable, ? super uv4<? super yq4>, ? extends Object> j05Var2) {
        throw wo1.V();
    }

    @xn4(level = zn4.ERROR, message = "Use 'flowOn' instead")
    @NotNull
    public static final <T> pi5<T> J(@NotNull pi5<? extends T> pi5Var, @NotNull xv4 xv4Var) {
        throw wo1.V();
    }

    @xn4(level = zn4.ERROR, message = "Flow analogues of 'switchMap' are 'transformLatest', 'flatMapLatest' and 'mapLatest'", replaceWith = @op4(expression = "this.flatMapLatest(transform)", imports = {}))
    @NotNull
    public static final <T, R> pi5<R> K(@NotNull pi5<? extends T> pi5Var, @NotNull j05<? super T, ? super uv4<? super pi5<? extends R>>, ? extends Object> j05Var) {
        return ri5.b2(pi5Var, new e(j05Var, null));
    }

    @xn4(level = zn4.ERROR, message = "Flow analogue of 'cache()' is 'shareIn' with unlimited replay and 'started = SharingStared.Lazily' argument'", replaceWith = @op4(expression = "this.shareIn(scope, Int.MAX_VALUE, started = SharingStared.Lazily)", imports = {}))
    @NotNull
    public static final <T> pi5<T> a(@NotNull pi5<? extends T> pi5Var) {
        throw wo1.V();
    }

    @xn4(level = zn4.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @op4(expression = "this.combine(other, transform)", imports = {}))
    @NotNull
    public static final <T1, T2, R> pi5<R> b(@NotNull pi5<? extends T1> pi5Var, @NotNull pi5<? extends T2> pi5Var2, @NotNull k05<? super T1, ? super T2, ? super uv4<? super R>, ? extends Object> k05Var) {
        return ri5.D(pi5Var, pi5Var2, k05Var);
    }

    @xn4(level = zn4.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @op4(expression = "combine(this, other, other2, transform)", imports = {}))
    @NotNull
    public static final <T1, T2, T3, R> pi5<R> c(@NotNull pi5<? extends T1> pi5Var, @NotNull pi5<? extends T2> pi5Var2, @NotNull pi5<? extends T3> pi5Var3, @NotNull l05<? super T1, ? super T2, ? super T3, ? super uv4<? super R>, ? extends Object> l05Var) {
        return ri5.E(pi5Var, pi5Var2, pi5Var3, l05Var);
    }

    @xn4(level = zn4.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @op4(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    @NotNull
    public static final <T1, T2, T3, T4, R> pi5<R> d(@NotNull pi5<? extends T1> pi5Var, @NotNull pi5<? extends T2> pi5Var2, @NotNull pi5<? extends T3> pi5Var3, @NotNull pi5<? extends T4> pi5Var4, @NotNull m05<? super T1, ? super T2, ? super T3, ? super T4, ? super uv4<? super R>, ? extends Object> m05Var) {
        return ri5.F(pi5Var, pi5Var2, pi5Var3, pi5Var4, m05Var);
    }

    @xn4(level = zn4.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @op4(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    @NotNull
    public static final <T1, T2, T3, T4, T5, R> pi5<R> e(@NotNull pi5<? extends T1> pi5Var, @NotNull pi5<? extends T2> pi5Var2, @NotNull pi5<? extends T3> pi5Var3, @NotNull pi5<? extends T4> pi5Var4, @NotNull pi5<? extends T5> pi5Var5, @NotNull n05<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super uv4<? super R>, ? extends Object> n05Var) {
        return ri5.G(pi5Var, pi5Var2, pi5Var3, pi5Var4, pi5Var5, n05Var);
    }

    @xn4(level = zn4.ERROR, message = "Flow analogue of 'compose' is 'let'", replaceWith = @op4(expression = "let(transformer)", imports = {}))
    @NotNull
    public static final <T, R> pi5<R> f(@NotNull pi5<? extends T> pi5Var, @NotNull f05<? super pi5<? extends T>, ? extends pi5<? extends R>> f05Var) {
        throw wo1.V();
    }

    @xn4(level = zn4.ERROR, message = "Flow analogue of 'concatMap' is 'flatMapConcat'", replaceWith = @op4(expression = "flatMapConcat(mapper)", imports = {}))
    @NotNull
    public static final <T, R> pi5<R> g(@NotNull pi5<? extends T> pi5Var, @NotNull f05<? super T, ? extends pi5<? extends R>> f05Var) {
        throw wo1.V();
    }

    @xn4(level = zn4.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { emit(value) }'", replaceWith = @op4(expression = "onCompletion { emit(value) }", imports = {}))
    @NotNull
    public static final <T> pi5<T> h(@NotNull pi5<? extends T> pi5Var, T t) {
        throw wo1.V();
    }

    @xn4(level = zn4.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { if (it == null) emitAll(other) }'", replaceWith = @op4(expression = "onCompletion { if (it == null) emitAll(other) }", imports = {}))
    @NotNull
    public static final <T> pi5<T> i(@NotNull pi5<? extends T> pi5Var, @NotNull pi5<? extends T> pi5Var2) {
        throw wo1.V();
    }

    @xn4(level = zn4.ERROR, message = "Use 'onEach { delay(timeMillis) }'", replaceWith = @op4(expression = "onEach { delay(timeMillis) }", imports = {}))
    @NotNull
    public static final <T> pi5<T> j(@NotNull pi5<? extends T> pi5Var, long j) {
        return ri5.e1(pi5Var, new a(j, null));
    }

    @xn4(level = zn4.ERROR, message = "Use 'onStart { delay(timeMillis) }'", replaceWith = @op4(expression = "onStart { delay(timeMillis) }", imports = {}))
    @NotNull
    public static final <T> pi5<T> k(@NotNull pi5<? extends T> pi5Var, long j) {
        return ri5.l1(pi5Var, new b(j, null));
    }

    @xn4(level = zn4.ERROR, message = "Flow analogue is 'flatMapConcat'", replaceWith = @op4(expression = "flatMapConcat(mapper)", imports = {}))
    @NotNull
    public static final <T, R> pi5<R> l(@NotNull pi5<? extends T> pi5Var, @NotNull j05<? super T, ? super uv4<? super pi5<? extends R>>, ? extends Object> j05Var) {
        throw wo1.V();
    }

    @xn4(level = zn4.ERROR, message = "Flow analogue of 'flatten' is 'flattenConcat'", replaceWith = @op4(expression = "flattenConcat()", imports = {}))
    @NotNull
    public static final <T> pi5<T> m(@NotNull pi5<? extends pi5<? extends T>> pi5Var) {
        throw wo1.V();
    }

    @xn4(level = zn4.ERROR, message = "Flow analogue of 'forEach' is 'collect'", replaceWith = @op4(expression = "collect(action)", imports = {}))
    public static final <T> void n(@NotNull pi5<? extends T> pi5Var, @NotNull j05<? super T, ? super uv4<? super yq4>, ? extends Object> j05Var) {
        throw wo1.V();
    }

    @xn4(level = zn4.ERROR, message = "Flow analogue of 'merge' is 'flattenConcat'", replaceWith = @op4(expression = "flattenConcat()", imports = {}))
    @NotNull
    public static final <T> pi5<T> o(@NotNull pi5<? extends pi5<? extends T>> pi5Var) {
        throw wo1.V();
    }

    @NotNull
    public static final Void p() {
        throw new UnsupportedOperationException("Not implemented, should not be called");
    }

    @xn4(level = zn4.ERROR, message = "Collect flow in the desired context instead")
    @NotNull
    public static final <T> pi5<T> q(@NotNull pi5<? extends T> pi5Var, @NotNull xv4 xv4Var) {
        throw wo1.V();
    }

    @xn4(level = zn4.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @op4(expression = "catch { emitAll(fallback) }", imports = {}))
    @NotNull
    public static final <T> pi5<T> r(@NotNull pi5<? extends T> pi5Var, @NotNull pi5<? extends T> pi5Var2) {
        throw wo1.V();
    }

    @xn4(level = zn4.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @op4(expression = "catch { emitAll(fallback) }", imports = {}))
    @NotNull
    public static final <T> pi5<T> s(@NotNull pi5<? extends T> pi5Var, @NotNull pi5<? extends T> pi5Var2) {
        throw wo1.V();
    }

    @xn4(level = zn4.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emit(fallback) }'", replaceWith = @op4(expression = "catch { emit(fallback) }", imports = {}))
    @NotNull
    public static final <T> pi5<T> t(@NotNull pi5<? extends T> pi5Var, T t) {
        throw wo1.V();
    }

    @xn4(level = zn4.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { e -> if (predicate(e)) emit(fallback) else throw e }'", replaceWith = @op4(expression = "catch { e -> if (predicate(e)) emit(fallback) else throw e }", imports = {}))
    @NotNull
    public static final <T> pi5<T> u(@NotNull pi5<? extends T> pi5Var, T t, @NotNull f05<? super Throwable, Boolean> f05Var) {
        return ri5.u(pi5Var, new d(f05Var, t, null));
    }

    public static /* synthetic */ pi5 v(pi5 pi5Var, Object obj, f05 f05Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            f05Var = c.t;
        }
        return ri5.j1(pi5Var, obj, f05Var);
    }

    @xn4(level = zn4.ERROR, message = "Flow analogue of 'publish()' is 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @op4(expression = "this.shareIn(scope, 0)", imports = {}))
    @NotNull
    public static final <T> pi5<T> w(@NotNull pi5<? extends T> pi5Var) {
        throw wo1.V();
    }

    @xn4(level = zn4.ERROR, message = "Flow analogue of 'publish(bufferSize)' is 'buffer' followed by 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @op4(expression = "this.buffer(bufferSize).shareIn(scope, 0)", imports = {}))
    @NotNull
    public static final <T> pi5<T> x(@NotNull pi5<? extends T> pi5Var, int i) {
        throw wo1.V();
    }

    @xn4(level = zn4.ERROR, message = "Collect flow in the desired context instead")
    @NotNull
    public static final <T> pi5<T> y(@NotNull pi5<? extends T> pi5Var, @NotNull xv4 xv4Var) {
        throw wo1.V();
    }

    @xn4(level = zn4.ERROR, message = "Flow analogue of 'replay()' is 'shareIn' with unlimited replay. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @op4(expression = "this.shareIn(scope, Int.MAX_VALUE)", imports = {}))
    @NotNull
    public static final <T> pi5<T> z(@NotNull pi5<? extends T> pi5Var) {
        throw wo1.V();
    }
}