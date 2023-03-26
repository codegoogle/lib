package com.p7700g.p99005;

import androidx.media.AudioAttributesCompat;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xbill.DNS.Type;

/* compiled from: Zip.kt */
@vo4(d1 = {"\u0000d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aq\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0003\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u001e\u0010\u0004\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00010\u0005\"\b\u0012\u0004\u0012\u0002H\u00030\u00012*\b\u0004\u0010\u0006\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\n\u001ae\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0003\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00010\u000b2*\b\u0004\u0010\u0006\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\f\u001aº\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e\"\u0004\b\u0002\u0010\u000f\"\u0004\b\u0003\u0010\u0010\"\u0004\b\u0004\u0010\u0011\"\u0004\b\u0005\u0010\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\r0\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00100\u00012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00110\u00012:\u0010\u0006\u001a6\b\u0001\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0017ø\u0001\u0000¢\u0006\u0002\u0010\u0018\u001a \u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e\"\u0004\b\u0002\u0010\u000f\"\u0004\b\u0003\u0010\u0010\"\u0004\b\u0004\u0010\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\r0\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00100\u000124\u0010\u0006\u001a0\b\u0001\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0019ø\u0001\u0000¢\u0006\u0002\u0010\u001a\u001a\u0088\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e\"\u0004\b\u0002\u0010\u000f\"\u0004\b\u0003\u0010\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\r0\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u000120\b\u0001\u0010\u0006\u001a*\b\u0001\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u001bø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a\u008a\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e\"\u0004\b\u0002\u0010\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\r0\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00012F\u0010\u0006\u001aB\b\u0001\u0012\u0013\u0012\u0011H\r¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0013\u0012\u0011H\u000e¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(!\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u001dø\u0001\u0000¢\u0006\u0002\u0010\"\u001a\u0082\u0001\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0003\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u001e\u0010\u0004\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00010\u0005\"\b\u0012\u0004\u0012\u0002H\u00030\u00012;\b\u0005\u0010\u0006\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u001d¢\u0006\u0002\b&H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010'\u001av\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0003\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00010\u000b2;\b\u0005\u0010\u0006\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u001d¢\u0006\u0002\b&H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010(\u001aÍ\u0001\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e\"\u0004\b\u0002\u0010\u000f\"\u0004\b\u0003\u0010\u0010\"\u0004\b\u0004\u0010\u0011\"\u0004\b\u0005\u0010\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\r0\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00100\u00012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00110\u00012M\b\u0001\u0010\u0006\u001aG\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020$\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\b\u0012\u0006\u0012\u0004\u0018\u00010\t0)¢\u0006\u0002\b&ø\u0001\u0000¢\u0006\u0002\u0010*\u001a³\u0001\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e\"\u0004\b\u0002\u0010\u000f\"\u0004\b\u0003\u0010\u0010\"\u0004\b\u0004\u0010\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\r0\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00100\u00012G\b\u0001\u0010\u0006\u001aA\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020$\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0017¢\u0006\u0002\b&ø\u0001\u0000¢\u0006\u0002\u0010+\u001a\u0099\u0001\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e\"\u0004\b\u0002\u0010\u000f\"\u0004\b\u0003\u0010\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\r0\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00012A\b\u0001\u0010\u0006\u001a;\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020$\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0019¢\u0006\u0002\b&ø\u0001\u0000¢\u0006\u0002\u0010,\u001a\u009d\u0001\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e\"\u0004\b\u0002\u0010\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\r0\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00012Y\b\u0001\u0010\u0006\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020$\u0012\u0013\u0012\u0011H\r¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0013\u0012\u0011H\u000e¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(!\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u001b¢\u0006\u0002\b&ø\u0001\u0000¢\u0006\u0002\u0010-\u001a\u0084\u0001\u0010.\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0003\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u001e\u0010\u0004\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00010\u0005\"\b\u0012\u0004\u0012\u0002H\u00030\u00012;\b\u0005\u0010\u0006\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u001d¢\u0006\u0002\b&H\u0082\bø\u0001\u0000¢\u0006\u0004\b/\u0010'\u001as\u00100\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0003\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u001e\u0010\u0004\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00010\u0005\"\b\u0012\u0004\u0012\u0002H\u00030\u00012*\b\u0004\u0010\u0006\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0082\bø\u0001\u0000¢\u0006\u0004\b1\u0010\n\u001a!\u00102\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u000503\"\u0004\b\u0000\u0010\u0003H\u0002¢\u0006\u0002\b4\u001a\u008a\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u0002H\r0\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00012F\u0010\u0006\u001aB\b\u0001\u0012\u0013\u0012\u0011H\r¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0013\u0012\u0011H\u000e¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(!\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u001dH\u0007ø\u0001\u0000¢\u0006\u0004\b5\u0010\"\u001a\u009d\u0001\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u0002H\r0\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00012Y\b\u0001\u0010\u0006\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020$\u0012\u0013\u0012\u0011H\r¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0013\u0012\u0011H\u000e¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(!\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u001b¢\u0006\u0002\b&H\u0007ø\u0001\u0000¢\u0006\u0004\b6\u0010-\u001ah\u00107\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u0002H\r0\u00012\f\u00108\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00012(\u0010\u0006\u001a$\b\u0001\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u001dø\u0001\u0000¢\u0006\u0002\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u00069"}, d2 = {"combine", "Lkotlinx/coroutines/flow/Flow;", "R", "T", "flows", "", "transform", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "([Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "T1", "T2", "T3", "T4", "T5", "flow", "flow2", "flow3", "flow4", "flow5", "Lkotlin/Function6;", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function6;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function5;", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function5;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function4;", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function4;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "a", "b", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "combineTransform", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lkotlin/ExtensionFunctionType;", "([Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function7;", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function7;)Lkotlinx/coroutines/flow/Flow;", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function6;)Lkotlinx/coroutines/flow/Flow;", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function5;)Lkotlinx/coroutines/flow/Flow;", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function4;)Lkotlinx/coroutines/flow/Flow;", "combineTransformUnsafe", "combineTransformUnsafe$FlowKt__ZipKt", "combineUnsafe", "combineUnsafe$FlowKt__ZipKt", "nullArrayFactory", "Lkotlin/Function0;", "nullArrayFactory$FlowKt__ZipKt", "flowCombine", "flowCombineTransform", "zip", "other", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes3.dex */
public final /* synthetic */ class ij5 {

    /* compiled from: SafeCollector.common.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements pi5<R> {
        public final /* synthetic */ pi5[] s;
        public final /* synthetic */ l05 t;

        /* compiled from: Zip.kt */
        @mw4(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", f = "Zip.kt", i = {}, l = {333, 333}, m = "invokeSuspend", n = {}, s = {})
        @vo4(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u008a@¨\u0006\u0007"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* renamed from: com.p7700g.p99005.ij5$a$a */
        /* loaded from: classes3.dex */
        public static final class C0195a extends vw4 implements k05<qi5<? super R>, Object[], uv4<? super yq4>, Object> {
            public int w;
            private /* synthetic */ Object x;
            public /* synthetic */ Object y;
            public final /* synthetic */ l05 z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0195a(uv4 uv4Var, l05 l05Var) {
                super(3, uv4Var);
                this.z = l05Var;
            }

            @Override // com.p7700g.p99005.k05
            @Nullable
            /* renamed from: C3 */
            public final Object I(@NotNull qi5<? super R> qi5Var, @NotNull Object[] objArr, @Nullable uv4<? super yq4> uv4Var) {
                C0195a c0195a = new C0195a(uv4Var, this.z);
                c0195a.x = qi5Var;
                c0195a.y = objArr;
                return c0195a.D1(yq4.a);
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
                    Object[] objArr = (Object[]) this.y;
                    l05 l05Var = this.z;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    this.x = qi5Var;
                    this.w = 1;
                    z15.e(6);
                    obj = l05Var.Z(obj2, obj3, obj4, this);
                    z15.e(7);
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
                if (qi5Var.b(obj, this) == h) {
                    return h;
                }
                return yq4.a;
            }
        }

        public a(pi5[] pi5VarArr, l05 l05Var) {
            this.s = pi5VarArr;
            this.t = l05Var;
        }

        @Override // com.p7700g.p99005.pi5
        @Nullable
        public Object a(@NotNull qi5 qi5Var, @NotNull uv4 uv4Var) {
            Object a = tk5.a(qi5Var, this.s, ij5.r(), new C0195a(null, this.t), uv4Var);
            return a == gw4.h() ? a : yq4.a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements pi5<R> {
        public final /* synthetic */ pi5[] s;
        public final /* synthetic */ m05 t;

        /* compiled from: Zip.kt */
        @mw4(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2", f = "Zip.kt", i = {}, l = {333, 333}, m = "invokeSuspend", n = {}, s = {})
        @vo4(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u008a@¨\u0006\u0007"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends vw4 implements k05<qi5<? super R>, Object[], uv4<? super yq4>, Object> {
            public int w;
            private /* synthetic */ Object x;
            public /* synthetic */ Object y;
            public final /* synthetic */ m05 z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(uv4 uv4Var, m05 m05Var) {
                super(3, uv4Var);
                this.z = m05Var;
            }

            @Override // com.p7700g.p99005.k05
            @Nullable
            /* renamed from: C3 */
            public final Object I(@NotNull qi5<? super R> qi5Var, @NotNull Object[] objArr, @Nullable uv4<? super yq4> uv4Var) {
                a aVar = new a(uv4Var, this.z);
                aVar.x = qi5Var;
                aVar.y = objArr;
                return aVar.D1(yq4.a);
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
                    Object[] objArr = (Object[]) this.y;
                    m05 m05Var = this.z;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    this.x = qi5Var;
                    this.w = 1;
                    z15.e(6);
                    obj = m05Var.E3(obj2, obj3, obj4, obj5, this);
                    z15.e(7);
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
                if (qi5Var.b(obj, this) == h) {
                    return h;
                }
                return yq4.a;
            }
        }

        public b(pi5[] pi5VarArr, m05 m05Var) {
            this.s = pi5VarArr;
            this.t = m05Var;
        }

        @Override // com.p7700g.p99005.pi5
        @Nullable
        public Object a(@NotNull qi5 qi5Var, @NotNull uv4 uv4Var) {
            Object a2 = tk5.a(qi5Var, this.s, ij5.r(), new a(null, this.t), uv4Var);
            return a2 == gw4.h() ? a2 : yq4.a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c implements pi5<R> {
        public final /* synthetic */ pi5[] s;
        public final /* synthetic */ n05 t;

        /* compiled from: Zip.kt */
        @mw4(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2", f = "Zip.kt", i = {}, l = {333, 333}, m = "invokeSuspend", n = {}, s = {})
        @vo4(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u008a@¨\u0006\u0007"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends vw4 implements k05<qi5<? super R>, Object[], uv4<? super yq4>, Object> {
            public int w;
            private /* synthetic */ Object x;
            public /* synthetic */ Object y;
            public final /* synthetic */ n05 z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(uv4 uv4Var, n05 n05Var) {
                super(3, uv4Var);
                this.z = n05Var;
            }

            @Override // com.p7700g.p99005.k05
            @Nullable
            /* renamed from: C3 */
            public final Object I(@NotNull qi5<? super R> qi5Var, @NotNull Object[] objArr, @Nullable uv4<? super yq4> uv4Var) {
                a aVar = new a(uv4Var, this.z);
                aVar.x = qi5Var;
                aVar.y = objArr;
                return aVar.D1(yq4.a);
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
                    Object[] objArr = (Object[]) this.y;
                    n05 n05Var = this.z;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    Object obj6 = objArr[4];
                    this.x = qi5Var;
                    this.w = 1;
                    z15.e(6);
                    obj = n05Var.k3(obj2, obj3, obj4, obj5, obj6, this);
                    z15.e(7);
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
                if (qi5Var.b(obj, this) == h) {
                    return h;
                }
                return yq4.a;
            }
        }

        public c(pi5[] pi5VarArr, n05 n05Var) {
            this.s = pi5VarArr;
            this.t = n05Var;
        }

        @Override // com.p7700g.p99005.pi5
        @Nullable
        public Object a(@NotNull qi5 qi5Var, @NotNull uv4 uv4Var) {
            Object a2 = tk5.a(qi5Var, this.s, ij5.r(), new a(null, this.t), uv4Var);
            return a2 == gw4.h() ? a2 : yq4.a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d implements pi5<R> {
        public final /* synthetic */ pi5 s;
        public final /* synthetic */ pi5 t;
        public final /* synthetic */ k05 u;

        public d(pi5 pi5Var, pi5 pi5Var2, k05 k05Var) {
            this.s = pi5Var;
            this.t = pi5Var2;
            this.u = k05Var;
        }

        @Override // com.p7700g.p99005.pi5
        @Nullable
        public Object a(@NotNull qi5<? super R> qi5Var, @NotNull uv4<? super yq4> uv4Var) {
            Object a = tk5.a(qi5Var, new pi5[]{this.s, this.t}, ij5.r(), new g(this.u, null), uv4Var);
            return a == gw4.h() ? a : yq4.a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes3.dex */
    public static final class e implements pi5<R> {
        public final /* synthetic */ pi5[] s;
        public final /* synthetic */ j05 t;

        /* compiled from: SafeCollector.common.kt */
        @vo4(k = 3, mv = {1, 6, 0}, xi = 176)
        /* loaded from: classes3.dex */
        public static final class a extends kw4 {
            public /* synthetic */ Object v;
            public int w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(uv4 uv4Var) {
                super(uv4Var);
                e.this = r1;
            }

            @Override // com.p7700g.p99005.hw4
            @Nullable
            public final Object D1(@NotNull Object obj) {
                this.v = obj;
                this.w |= Integer.MIN_VALUE;
                return e.this.a(null, this);
            }
        }

        public e(pi5[] pi5VarArr, j05 j05Var) {
            this.s = pi5VarArr;
            this.t = j05Var;
        }

        @Override // com.p7700g.p99005.pi5
        @Nullable
        public Object a(@NotNull qi5<? super R> qi5Var, @NotNull uv4<? super yq4> uv4Var) {
            pi5[] pi5VarArr = this.s;
            c25.w();
            h hVar = new h(this.s);
            c25.w();
            Object a2 = tk5.a(qi5Var, pi5VarArr, hVar, new i(this.t, null), uv4Var);
            return a2 == gw4.h() ? a2 : yq4.a;
        }

        @Nullable
        public Object e(@NotNull qi5 qi5Var, @NotNull uv4 uv4Var) {
            z15.e(4);
            new a(uv4Var);
            z15.e(5);
            pi5[] pi5VarArr = this.s;
            c25.w();
            h hVar = new h(this.s);
            c25.w();
            i iVar = new i(this.t, null);
            z15.e(0);
            tk5.a(qi5Var, pi5VarArr, hVar, iVar, uv4Var);
            z15.e(1);
            return yq4.a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes3.dex */
    public static final class f implements pi5<R> {
        public final /* synthetic */ pi5[] s;
        public final /* synthetic */ j05 t;

        /* compiled from: SafeCollector.common.kt */
        @vo4(k = 3, mv = {1, 6, 0}, xi = 176)
        /* loaded from: classes3.dex */
        public static final class a extends kw4 {
            public /* synthetic */ Object v;
            public int w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(uv4 uv4Var) {
                super(uv4Var);
                f.this = r1;
            }

            @Override // com.p7700g.p99005.hw4
            @Nullable
            public final Object D1(@NotNull Object obj) {
                this.v = obj;
                this.w |= Integer.MIN_VALUE;
                return f.this.a(null, this);
            }
        }

        public f(pi5[] pi5VarArr, j05 j05Var) {
            this.s = pi5VarArr;
            this.t = j05Var;
        }

        @Override // com.p7700g.p99005.pi5
        @Nullable
        public Object a(@NotNull qi5<? super R> qi5Var, @NotNull uv4<? super yq4> uv4Var) {
            pi5[] pi5VarArr = this.s;
            c25.w();
            j jVar = new j(this.s);
            c25.w();
            Object a2 = tk5.a(qi5Var, pi5VarArr, jVar, new k(this.t, null), uv4Var);
            return a2 == gw4.h() ? a2 : yq4.a;
        }

        @Nullable
        public Object e(@NotNull qi5 qi5Var, @NotNull uv4 uv4Var) {
            z15.e(4);
            new a(uv4Var);
            z15.e(5);
            pi5[] pi5VarArr = this.s;
            c25.w();
            j jVar = new j(this.s);
            c25.w();
            k kVar = new k(this.t, null);
            z15.e(0);
            tk5.a(qi5Var, pi5VarArr, jVar, kVar, uv4Var);
            z15.e(1);
            return yq4.a;
        }
    }

    /* compiled from: Zip.kt */
    @mw4(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", i = {}, l = {33, 33}, m = "invokeSuspend", n = {}, s = {})
    @vo4(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u008a@"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class g extends vw4 implements k05<qi5<? super R>, Object[], uv4<? super yq4>, Object> {
        public int w;
        private /* synthetic */ Object x;
        public /* synthetic */ Object y;
        public final /* synthetic */ k05<T1, T2, uv4<? super R>, Object> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(k05<? super T1, ? super T2, ? super uv4<? super R>, ? extends Object> k05Var, uv4<? super g> uv4Var) {
            super(3, uv4Var);
            this.z = k05Var;
        }

        @Override // com.p7700g.p99005.k05
        @Nullable
        /* renamed from: C3 */
        public final Object I(@NotNull qi5<? super R> qi5Var, @NotNull Object[] objArr, @Nullable uv4<? super yq4> uv4Var) {
            g gVar = new g(this.z, uv4Var);
            gVar.x = qi5Var;
            gVar.y = objArr;
            return gVar.D1(yq4.a);
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
                Object[] objArr = (Object[]) this.y;
                k05<T1, T2, uv4<? super R>, Object> k05Var = this.z;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                this.x = qi5Var;
                this.w = 1;
                obj = k05Var.I(obj2, obj3, this);
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
            if (qi5Var.b(obj, this) == h) {
                return h;
            }
            return yq4.a;
        }
    }

    /* compiled from: Zip.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\u0010\u0000\u001a\f\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "R", "invoke", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes3.dex */
    public static final class h extends e25 implements uz4<T[]> {
        public final /* synthetic */ pi5<T>[] t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(pi5<? extends T>[] pi5VarArr) {
            super(0);
            this.t = pi5VarArr;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [T[], java.lang.Object[]] */
        @Override // com.p7700g.p99005.uz4
        @Nullable
        /* renamed from: h */
        public final T[] x() {
            int length = this.t.length;
            c25.y(0, "T?");
            return new Object[length];
        }
    }

    /* compiled from: Zip.kt */
    @mw4(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$5$2", f = "Zip.kt", i = {}, l = {238, 238}, m = "invokeSuspend", n = {}, s = {})
    @vo4(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u008a@"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", ""}, k = 3, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes3.dex */
    public static final class i extends vw4 implements k05<qi5<? super R>, T[], uv4<? super yq4>, Object> {
        public int w;
        private /* synthetic */ Object x;
        public /* synthetic */ Object y;
        public final /* synthetic */ j05<T[], uv4<? super R>, Object> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(j05<? super T[], ? super uv4<? super R>, ? extends Object> j05Var, uv4<? super i> uv4Var) {
            super(3, uv4Var);
            this.z = j05Var;
        }

        @Override // com.p7700g.p99005.k05
        @Nullable
        /* renamed from: C3 */
        public final Object I(@NotNull qi5<? super R> qi5Var, @NotNull T[] tArr, @Nullable uv4<? super yq4> uv4Var) {
            i iVar = new i(this.z, uv4Var);
            iVar.x = qi5Var;
            iVar.y = tArr;
            return iVar.D1(yq4.a);
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
                j05<T[], uv4<? super R>, Object> j05Var = this.z;
                this.x = qi5Var;
                this.w = 1;
                obj = j05Var.w3((Object[]) this.y, this);
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
            if (qi5Var.b(obj, this) == h) {
                return h;
            }
            return yq4.a;
        }

        @Nullable
        public final Object G3(@NotNull Object obj) {
            Object w3 = this.z.w3((Object[]) this.y, this);
            z15.e(0);
            ((qi5) this.x).b(w3, this);
            z15.e(1);
            return yq4.a;
        }
    }

    /* compiled from: Zip.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\u0010\u0000\u001a\f\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "R", "invoke", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes3.dex */
    public static final class j extends e25 implements uz4<T[]> {
        public final /* synthetic */ pi5<T>[] t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(pi5<T>[] pi5VarArr) {
            super(0);
            this.t = pi5VarArr;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [T[], java.lang.Object[]] */
        @Override // com.p7700g.p99005.uz4
        @Nullable
        /* renamed from: h */
        public final T[] x() {
            int length = this.t.length;
            c25.y(0, "T?");
            return new Object[length];
        }
    }

    /* compiled from: Zip.kt */
    @mw4(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$6$2", f = "Zip.kt", i = {}, l = {292, 292}, m = "invokeSuspend", n = {}, s = {})
    @vo4(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u008a@"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", ""}, k = 3, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes3.dex */
    public static final class k extends vw4 implements k05<qi5<? super R>, T[], uv4<? super yq4>, Object> {
        public int w;
        private /* synthetic */ Object x;
        public /* synthetic */ Object y;
        public final /* synthetic */ j05<T[], uv4<? super R>, Object> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(j05<? super T[], ? super uv4<? super R>, ? extends Object> j05Var, uv4<? super k> uv4Var) {
            super(3, uv4Var);
            this.z = j05Var;
        }

        @Override // com.p7700g.p99005.k05
        @Nullable
        /* renamed from: C3 */
        public final Object I(@NotNull qi5<? super R> qi5Var, @NotNull T[] tArr, @Nullable uv4<? super yq4> uv4Var) {
            k kVar = new k(this.z, uv4Var);
            kVar.x = qi5Var;
            kVar.y = tArr;
            return kVar.D1(yq4.a);
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
                j05<T[], uv4<? super R>, Object> j05Var = this.z;
                this.x = qi5Var;
                this.w = 1;
                obj = j05Var.w3((Object[]) this.y, this);
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
            if (qi5Var.b(obj, this) == h) {
                return h;
            }
            return yq4.a;
        }

        @Nullable
        public final Object G3(@NotNull Object obj) {
            Object w3 = this.z.w3((Object[]) this.y, this);
            z15.e(0);
            ((qi5) this.x).b(w3, this);
            z15.e(1);
            return yq4.a;
        }
    }

    /* compiled from: Zip.kt */
    @mw4(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1", f = "Zip.kt", i = {}, l = {AudioAttributesCompat.N}, m = "invokeSuspend", n = {}, s = {})
    @vo4(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@¨\u0006\u0005"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class l extends vw4 implements j05<qi5<? super R>, uv4<? super yq4>, Object> {
        public int w;
        private /* synthetic */ Object x;
        public final /* synthetic */ pi5[] y;
        public final /* synthetic */ l05 z;

        /* compiled from: Zip.kt */
        @mw4(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1$1", f = "Zip.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
        @vo4(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u008a@¨\u0006\u0007"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1$1"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends vw4 implements k05<qi5<? super R>, Object[], uv4<? super yq4>, Object> {
            public int w;
            private /* synthetic */ Object x;
            public /* synthetic */ Object y;
            public final /* synthetic */ l05 z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(uv4 uv4Var, l05 l05Var) {
                super(3, uv4Var);
                this.z = l05Var;
            }

            @Override // com.p7700g.p99005.k05
            @Nullable
            /* renamed from: C3 */
            public final Object I(@NotNull qi5<? super R> qi5Var, @NotNull Object[] objArr, @Nullable uv4<? super yq4> uv4Var) {
                a aVar = new a(uv4Var, this.z);
                aVar.x = qi5Var;
                aVar.y = objArr;
                return aVar.D1(yq4.a);
            }

            @Override // com.p7700g.p99005.hw4
            @Nullable
            public final Object D1(@NotNull Object obj) {
                Object h = gw4.h();
                int i = this.w;
                if (i == 0) {
                    rp4.n(obj);
                    Object[] objArr = (Object[]) this.y;
                    l05 l05Var = this.z;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    this.w = 1;
                    z15.e(6);
                    Object Z = l05Var.Z((qi5) this.x, obj2, obj3, this);
                    z15.e(7);
                    if (Z == h) {
                        return h;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    rp4.n(obj);
                }
                return yq4.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(pi5[] pi5VarArr, uv4 uv4Var, l05 l05Var) {
            super(2, uv4Var);
            this.y = pi5VarArr;
            this.z = l05Var;
        }

        @Override // com.p7700g.p99005.j05
        @Nullable
        /* renamed from: C3 */
        public final Object w3(@NotNull qi5<? super R> qi5Var, @Nullable uv4<? super yq4> uv4Var) {
            return ((l) X(qi5Var, uv4Var)).D1(yq4.a);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            Object h = gw4.h();
            int i = this.w;
            if (i == 0) {
                rp4.n(obj);
                pi5[] pi5VarArr = this.y;
                uz4 r = ij5.r();
                a aVar = new a(null, this.z);
                this.w = 1;
                if (tk5.a((qi5) this.x, pi5VarArr, r, aVar, this) == h) {
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
            l lVar = new l(this.y, uv4Var, this.z);
            lVar.x = obj;
            return lVar;
        }
    }

    /* compiled from: Zip.kt */
    @mw4(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2", f = "Zip.kt", i = {}, l = {AudioAttributesCompat.N}, m = "invokeSuspend", n = {}, s = {})
    @vo4(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@¨\u0006\u0005"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class m extends vw4 implements j05<qi5<? super R>, uv4<? super yq4>, Object> {
        public int w;
        private /* synthetic */ Object x;
        public final /* synthetic */ pi5[] y;
        public final /* synthetic */ l05 z;

        /* compiled from: Zip.kt */
        @mw4(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2$1", f = "Zip.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
        @vo4(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u008a@¨\u0006\u0007"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1$1"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends vw4 implements k05<qi5<? super R>, Object[], uv4<? super yq4>, Object> {
            public int w;
            private /* synthetic */ Object x;
            public /* synthetic */ Object y;
            public final /* synthetic */ l05 z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(uv4 uv4Var, l05 l05Var) {
                super(3, uv4Var);
                this.z = l05Var;
            }

            @Override // com.p7700g.p99005.k05
            @Nullable
            /* renamed from: C3 */
            public final Object I(@NotNull qi5<? super R> qi5Var, @NotNull Object[] objArr, @Nullable uv4<? super yq4> uv4Var) {
                a aVar = new a(uv4Var, this.z);
                aVar.x = qi5Var;
                aVar.y = objArr;
                return aVar.D1(yq4.a);
            }

            @Override // com.p7700g.p99005.hw4
            @Nullable
            public final Object D1(@NotNull Object obj) {
                Object h = gw4.h();
                int i = this.w;
                if (i == 0) {
                    rp4.n(obj);
                    Object[] objArr = (Object[]) this.y;
                    l05 l05Var = this.z;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    this.w = 1;
                    z15.e(6);
                    Object Z = l05Var.Z((qi5) this.x, obj2, obj3, this);
                    z15.e(7);
                    if (Z == h) {
                        return h;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    rp4.n(obj);
                }
                return yq4.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(pi5[] pi5VarArr, uv4 uv4Var, l05 l05Var) {
            super(2, uv4Var);
            this.y = pi5VarArr;
            this.z = l05Var;
        }

        @Override // com.p7700g.p99005.j05
        @Nullable
        /* renamed from: C3 */
        public final Object w3(@NotNull qi5<? super R> qi5Var, @Nullable uv4<? super yq4> uv4Var) {
            return ((m) X(qi5Var, uv4Var)).D1(yq4.a);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            Object h = gw4.h();
            int i = this.w;
            if (i == 0) {
                rp4.n(obj);
                pi5[] pi5VarArr = this.y;
                uz4 r = ij5.r();
                a aVar = new a(null, this.z);
                this.w = 1;
                if (tk5.a((qi5) this.x, pi5VarArr, r, aVar, this) == h) {
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
            m mVar = new m(this.y, uv4Var, this.z);
            mVar.x = obj;
            return mVar;
        }
    }

    /* compiled from: Zip.kt */
    @mw4(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3", f = "Zip.kt", i = {}, l = {AudioAttributesCompat.N}, m = "invokeSuspend", n = {}, s = {})
    @vo4(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@¨\u0006\u0005"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class n extends vw4 implements j05<qi5<? super R>, uv4<? super yq4>, Object> {
        public int w;
        private /* synthetic */ Object x;
        public final /* synthetic */ pi5[] y;
        public final /* synthetic */ m05 z;

        /* compiled from: Zip.kt */
        @mw4(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3$1", f = "Zip.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
        @vo4(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u008a@¨\u0006\u0007"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1$1"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends vw4 implements k05<qi5<? super R>, Object[], uv4<? super yq4>, Object> {
            public int w;
            private /* synthetic */ Object x;
            public /* synthetic */ Object y;
            public final /* synthetic */ m05 z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(uv4 uv4Var, m05 m05Var) {
                super(3, uv4Var);
                this.z = m05Var;
            }

            @Override // com.p7700g.p99005.k05
            @Nullable
            /* renamed from: C3 */
            public final Object I(@NotNull qi5<? super R> qi5Var, @NotNull Object[] objArr, @Nullable uv4<? super yq4> uv4Var) {
                a aVar = new a(uv4Var, this.z);
                aVar.x = qi5Var;
                aVar.y = objArr;
                return aVar.D1(yq4.a);
            }

            @Override // com.p7700g.p99005.hw4
            @Nullable
            public final Object D1(@NotNull Object obj) {
                Object h = gw4.h();
                int i = this.w;
                if (i == 0) {
                    rp4.n(obj);
                    qi5 qi5Var = (qi5) this.x;
                    Object[] objArr = (Object[]) this.y;
                    m05 m05Var = this.z;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    this.w = 1;
                    z15.e(6);
                    Object E3 = m05Var.E3(qi5Var, obj2, obj3, obj4, this);
                    z15.e(7);
                    if (E3 == h) {
                        return h;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    rp4.n(obj);
                }
                return yq4.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(pi5[] pi5VarArr, uv4 uv4Var, m05 m05Var) {
            super(2, uv4Var);
            this.y = pi5VarArr;
            this.z = m05Var;
        }

        @Override // com.p7700g.p99005.j05
        @Nullable
        /* renamed from: C3 */
        public final Object w3(@NotNull qi5<? super R> qi5Var, @Nullable uv4<? super yq4> uv4Var) {
            return ((n) X(qi5Var, uv4Var)).D1(yq4.a);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            Object h = gw4.h();
            int i = this.w;
            if (i == 0) {
                rp4.n(obj);
                pi5[] pi5VarArr = this.y;
                uz4 r = ij5.r();
                a aVar = new a(null, this.z);
                this.w = 1;
                if (tk5.a((qi5) this.x, pi5VarArr, r, aVar, this) == h) {
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
            n nVar = new n(this.y, uv4Var, this.z);
            nVar.x = obj;
            return nVar;
        }
    }

    /* compiled from: Zip.kt */
    @mw4(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4", f = "Zip.kt", i = {}, l = {AudioAttributesCompat.N}, m = "invokeSuspend", n = {}, s = {})
    @vo4(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@¨\u0006\u0005"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class o extends vw4 implements j05<qi5<? super R>, uv4<? super yq4>, Object> {
        public int w;
        private /* synthetic */ Object x;
        public final /* synthetic */ pi5[] y;
        public final /* synthetic */ n05 z;

        /* compiled from: Zip.kt */
        @mw4(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4$1", f = "Zip.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
        @vo4(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u008a@¨\u0006\u0007"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1$1"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends vw4 implements k05<qi5<? super R>, Object[], uv4<? super yq4>, Object> {
            public int w;
            private /* synthetic */ Object x;
            public /* synthetic */ Object y;
            public final /* synthetic */ n05 z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(uv4 uv4Var, n05 n05Var) {
                super(3, uv4Var);
                this.z = n05Var;
            }

            @Override // com.p7700g.p99005.k05
            @Nullable
            /* renamed from: C3 */
            public final Object I(@NotNull qi5<? super R> qi5Var, @NotNull Object[] objArr, @Nullable uv4<? super yq4> uv4Var) {
                a aVar = new a(uv4Var, this.z);
                aVar.x = qi5Var;
                aVar.y = objArr;
                return aVar.D1(yq4.a);
            }

            @Override // com.p7700g.p99005.hw4
            @Nullable
            public final Object D1(@NotNull Object obj) {
                Object h = gw4.h();
                int i = this.w;
                if (i == 0) {
                    rp4.n(obj);
                    qi5 qi5Var = (qi5) this.x;
                    Object[] objArr = (Object[]) this.y;
                    n05 n05Var = this.z;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    this.w = 1;
                    z15.e(6);
                    Object k3 = n05Var.k3(qi5Var, obj2, obj3, obj4, obj5, this);
                    z15.e(7);
                    if (k3 == h) {
                        return h;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    rp4.n(obj);
                }
                return yq4.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(pi5[] pi5VarArr, uv4 uv4Var, n05 n05Var) {
            super(2, uv4Var);
            this.y = pi5VarArr;
            this.z = n05Var;
        }

        @Override // com.p7700g.p99005.j05
        @Nullable
        /* renamed from: C3 */
        public final Object w3(@NotNull qi5<? super R> qi5Var, @Nullable uv4<? super yq4> uv4Var) {
            return ((o) X(qi5Var, uv4Var)).D1(yq4.a);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            Object h = gw4.h();
            int i = this.w;
            if (i == 0) {
                rp4.n(obj);
                pi5[] pi5VarArr = this.y;
                uz4 r = ij5.r();
                a aVar = new a(null, this.z);
                this.w = 1;
                if (tk5.a((qi5) this.x, pi5VarArr, r, aVar, this) == h) {
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
            o oVar = new o(this.y, uv4Var, this.z);
            oVar.x = obj;
            return oVar;
        }
    }

    /* compiled from: Zip.kt */
    @mw4(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5", f = "Zip.kt", i = {}, l = {AudioAttributesCompat.N}, m = "invokeSuspend", n = {}, s = {})
    @vo4(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@¨\u0006\u0005"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class p extends vw4 implements j05<qi5<? super R>, uv4<? super yq4>, Object> {
        public int w;
        private /* synthetic */ Object x;
        public final /* synthetic */ pi5[] y;
        public final /* synthetic */ o05 z;

        /* compiled from: Zip.kt */
        @mw4(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5$1", f = "Zip.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
        @vo4(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u008a@¨\u0006\u0007"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1$1"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends vw4 implements k05<qi5<? super R>, Object[], uv4<? super yq4>, Object> {
            public int w;
            private /* synthetic */ Object x;
            public /* synthetic */ Object y;
            public final /* synthetic */ o05 z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(uv4 uv4Var, o05 o05Var) {
                super(3, uv4Var);
                this.z = o05Var;
            }

            @Override // com.p7700g.p99005.k05
            @Nullable
            /* renamed from: C3 */
            public final Object I(@NotNull qi5<? super R> qi5Var, @NotNull Object[] objArr, @Nullable uv4<? super yq4> uv4Var) {
                a aVar = new a(uv4Var, this.z);
                aVar.x = qi5Var;
                aVar.y = objArr;
                return aVar.D1(yq4.a);
            }

            @Override // com.p7700g.p99005.hw4
            @Nullable
            public final Object D1(@NotNull Object obj) {
                Object h = gw4.h();
                int i = this.w;
                if (i == 0) {
                    rp4.n(obj);
                    qi5 qi5Var = (qi5) this.x;
                    Object[] objArr = (Object[]) this.y;
                    o05 o05Var = this.z;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    Object obj6 = objArr[4];
                    this.w = 1;
                    z15.e(6);
                    Object S3 = o05Var.S3(qi5Var, obj2, obj3, obj4, obj5, obj6, this);
                    z15.e(7);
                    if (S3 == h) {
                        return h;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    rp4.n(obj);
                }
                return yq4.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(pi5[] pi5VarArr, uv4 uv4Var, o05 o05Var) {
            super(2, uv4Var);
            this.y = pi5VarArr;
            this.z = o05Var;
        }

        @Override // com.p7700g.p99005.j05
        @Nullable
        /* renamed from: C3 */
        public final Object w3(@NotNull qi5<? super R> qi5Var, @Nullable uv4<? super yq4> uv4Var) {
            return ((p) X(qi5Var, uv4Var)).D1(yq4.a);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            Object h = gw4.h();
            int i = this.w;
            if (i == 0) {
                rp4.n(obj);
                pi5[] pi5VarArr = this.y;
                uz4 r = ij5.r();
                a aVar = new a(null, this.z);
                this.w = 1;
                if (tk5.a((qi5) this.x, pi5VarArr, r, aVar, this) == h) {
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
            p pVar = new p(this.y, uv4Var, this.z);
            pVar.x = obj;
            return pVar;
        }
    }

    /* compiled from: Zip.kt */
    @mw4(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6", f = "Zip.kt", i = {}, l = {Type.IXFR}, m = "invokeSuspend", n = {}, s = {})
    @vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes3.dex */
    public static final class q extends vw4 implements j05<qi5<? super R>, uv4<? super yq4>, Object> {
        public int w;
        private /* synthetic */ Object x;
        public final /* synthetic */ pi5<T>[] y;
        public final /* synthetic */ k05<qi5<? super R>, T[], uv4<? super yq4>, Object> z;

        /* compiled from: Zip.kt */
        @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\u0010\u0000\u001a\f\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "R", "invoke", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 176)
        /* loaded from: classes3.dex */
        public static final class a extends e25 implements uz4<T[]> {
            public final /* synthetic */ pi5<T>[] t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(pi5<? extends T>[] pi5VarArr) {
                super(0);
                this.t = pi5VarArr;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [T[], java.lang.Object[]] */
            @Override // com.p7700g.p99005.uz4
            @Nullable
            /* renamed from: h */
            public final T[] x() {
                int length = this.t.length;
                c25.y(0, "T?");
                return new Object[length];
            }
        }

        /* compiled from: Zip.kt */
        @mw4(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$2", f = "Zip.kt", i = {}, l = {Type.IXFR}, m = "invokeSuspend", n = {}, s = {})
        @vo4(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u008a@"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", ""}, k = 3, mv = {1, 6, 0}, xi = 176)
        /* loaded from: classes3.dex */
        public static final class b extends vw4 implements k05<qi5<? super R>, T[], uv4<? super yq4>, Object> {
            public int w;
            private /* synthetic */ Object x;
            public /* synthetic */ Object y;
            public final /* synthetic */ k05<qi5<? super R>, T[], uv4<? super yq4>, Object> z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(k05<? super qi5<? super R>, ? super T[], ? super uv4<? super yq4>, ? extends Object> k05Var, uv4<? super b> uv4Var) {
                super(3, uv4Var);
                this.z = k05Var;
            }

            @Override // com.p7700g.p99005.k05
            @Nullable
            /* renamed from: C3 */
            public final Object I(@NotNull qi5<? super R> qi5Var, @NotNull T[] tArr, @Nullable uv4<? super yq4> uv4Var) {
                b bVar = new b(this.z, uv4Var);
                bVar.x = qi5Var;
                bVar.y = tArr;
                return bVar.D1(yq4.a);
            }

            @Override // com.p7700g.p99005.hw4
            @Nullable
            public final Object D1(@NotNull Object obj) {
                Object h = gw4.h();
                int i = this.w;
                if (i == 0) {
                    rp4.n(obj);
                    k05<qi5<? super R>, T[], uv4<? super yq4>, Object> k05Var = this.z;
                    this.x = null;
                    this.w = 1;
                    if (k05Var.I((qi5) this.x, (Object[]) this.y, this) == h) {
                        return h;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    rp4.n(obj);
                }
                return yq4.a;
            }

            @Nullable
            public final Object G3(@NotNull Object obj) {
                this.z.I((qi5) this.x, (Object[]) this.y, this);
                return yq4.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public q(pi5<? extends T>[] pi5VarArr, k05<? super qi5<? super R>, ? super T[], ? super uv4<? super yq4>, ? extends Object> k05Var, uv4<? super q> uv4Var) {
            super(2, uv4Var);
            this.y = pi5VarArr;
            this.z = k05Var;
        }

        @Override // com.p7700g.p99005.j05
        @Nullable
        /* renamed from: C3 */
        public final Object w3(@NotNull qi5<? super R> qi5Var, @Nullable uv4<? super yq4> uv4Var) {
            return ((q) X(qi5Var, uv4Var)).D1(yq4.a);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            Object h = gw4.h();
            int i = this.w;
            if (i == 0) {
                rp4.n(obj);
                pi5<T>[] pi5VarArr = this.y;
                c25.w();
                a aVar = new a(this.y);
                c25.w();
                b bVar = new b(this.z, null);
                this.w = 1;
                if (tk5.a((qi5) this.x, pi5VarArr, aVar, bVar, this) == h) {
                    return h;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                rp4.n(obj);
            }
            return yq4.a;
        }

        @Nullable
        public final Object G3(@NotNull Object obj) {
            pi5<T>[] pi5VarArr = this.y;
            c25.w();
            a aVar = new a(this.y);
            c25.w();
            b bVar = new b(this.z, null);
            z15.e(0);
            tk5.a((qi5) this.x, pi5VarArr, aVar, bVar, this);
            z15.e(1);
            return yq4.a;
        }

        @Override // com.p7700g.p99005.hw4
        @NotNull
        public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
            q qVar = new q(this.y, this.z, uv4Var);
            qVar.x = obj;
            return qVar;
        }
    }

    /* compiled from: Zip.kt */
    @mw4(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7", f = "Zip.kt", i = {}, l = {308}, m = "invokeSuspend", n = {}, s = {})
    @vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes3.dex */
    public static final class r extends vw4 implements j05<qi5<? super R>, uv4<? super yq4>, Object> {
        public int w;
        private /* synthetic */ Object x;
        public final /* synthetic */ pi5<T>[] y;
        public final /* synthetic */ k05<qi5<? super R>, T[], uv4<? super yq4>, Object> z;

        /* compiled from: Zip.kt */
        @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\u0010\u0000\u001a\f\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "R", "invoke", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 176)
        /* loaded from: classes3.dex */
        public static final class a extends e25 implements uz4<T[]> {
            public final /* synthetic */ pi5<T>[] t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(pi5<T>[] pi5VarArr) {
                super(0);
                this.t = pi5VarArr;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [T[], java.lang.Object[]] */
            @Override // com.p7700g.p99005.uz4
            @Nullable
            /* renamed from: h */
            public final T[] x() {
                int length = this.t.length;
                c25.y(0, "T?");
                return new Object[length];
            }
        }

        /* compiled from: Zip.kt */
        @mw4(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$2", f = "Zip.kt", i = {}, l = {308}, m = "invokeSuspend", n = {}, s = {})
        @vo4(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u008a@"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", ""}, k = 3, mv = {1, 6, 0}, xi = 176)
        /* loaded from: classes3.dex */
        public static final class b extends vw4 implements k05<qi5<? super R>, T[], uv4<? super yq4>, Object> {
            public int w;
            private /* synthetic */ Object x;
            public /* synthetic */ Object y;
            public final /* synthetic */ k05<qi5<? super R>, T[], uv4<? super yq4>, Object> z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(k05<? super qi5<? super R>, ? super T[], ? super uv4<? super yq4>, ? extends Object> k05Var, uv4<? super b> uv4Var) {
                super(3, uv4Var);
                this.z = k05Var;
            }

            @Override // com.p7700g.p99005.k05
            @Nullable
            /* renamed from: C3 */
            public final Object I(@NotNull qi5<? super R> qi5Var, @NotNull T[] tArr, @Nullable uv4<? super yq4> uv4Var) {
                b bVar = new b(this.z, uv4Var);
                bVar.x = qi5Var;
                bVar.y = tArr;
                return bVar.D1(yq4.a);
            }

            @Override // com.p7700g.p99005.hw4
            @Nullable
            public final Object D1(@NotNull Object obj) {
                Object h = gw4.h();
                int i = this.w;
                if (i == 0) {
                    rp4.n(obj);
                    k05<qi5<? super R>, T[], uv4<? super yq4>, Object> k05Var = this.z;
                    this.x = null;
                    this.w = 1;
                    if (k05Var.I((qi5) this.x, (Object[]) this.y, this) == h) {
                        return h;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    rp4.n(obj);
                }
                return yq4.a;
            }

            @Nullable
            public final Object G3(@NotNull Object obj) {
                this.z.I((qi5) this.x, (Object[]) this.y, this);
                return yq4.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public r(pi5<T>[] pi5VarArr, k05<? super qi5<? super R>, ? super T[], ? super uv4<? super yq4>, ? extends Object> k05Var, uv4<? super r> uv4Var) {
            super(2, uv4Var);
            this.y = pi5VarArr;
            this.z = k05Var;
        }

        @Override // com.p7700g.p99005.j05
        @Nullable
        /* renamed from: C3 */
        public final Object w3(@NotNull qi5<? super R> qi5Var, @Nullable uv4<? super yq4> uv4Var) {
            return ((r) X(qi5Var, uv4Var)).D1(yq4.a);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            Object h = gw4.h();
            int i = this.w;
            if (i == 0) {
                rp4.n(obj);
                pi5<T>[] pi5VarArr = this.y;
                c25.w();
                a aVar = new a(this.y);
                c25.w();
                b bVar = new b(this.z, null);
                this.w = 1;
                if (tk5.a((qi5) this.x, pi5VarArr, aVar, bVar, this) == h) {
                    return h;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                rp4.n(obj);
            }
            return yq4.a;
        }

        @Nullable
        public final Object G3(@NotNull Object obj) {
            pi5<T>[] pi5VarArr = this.y;
            c25.w();
            a aVar = new a(this.y);
            c25.w();
            b bVar = new b(this.z, null);
            z15.e(0);
            tk5.a((qi5) this.x, pi5VarArr, aVar, bVar, this);
            z15.e(1);
            return yq4.a;
        }

        @Override // com.p7700g.p99005.hw4
        @NotNull
        public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
            r rVar = new r(this.y, this.z, uv4Var);
            rVar.x = obj;
            return rVar;
        }
    }

    /* compiled from: Zip.kt */
    @mw4(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1", f = "Zip.kt", i = {}, l = {AudioAttributesCompat.N}, m = "invokeSuspend", n = {}, s = {})
    @vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class s extends vw4 implements j05<qi5<? super R>, uv4<? super yq4>, Object> {
        public int w;
        private /* synthetic */ Object x;
        public final /* synthetic */ pi5<T>[] y;
        public final /* synthetic */ k05<qi5<? super R>, T[], uv4<? super yq4>, Object> z;

        /* compiled from: Zip.kt */
        @mw4(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1$1", f = "Zip.kt", i = {}, l = {AudioAttributesCompat.N}, m = "invokeSuspend", n = {}, s = {})
        @vo4(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u008a@"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends vw4 implements k05<qi5<? super R>, T[], uv4<? super yq4>, Object> {
            public int w;
            private /* synthetic */ Object x;
            public /* synthetic */ Object y;
            public final /* synthetic */ k05<qi5<? super R>, T[], uv4<? super yq4>, Object> z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(k05<? super qi5<? super R>, ? super T[], ? super uv4<? super yq4>, ? extends Object> k05Var, uv4<? super a> uv4Var) {
                super(3, uv4Var);
                this.z = k05Var;
            }

            @Override // com.p7700g.p99005.k05
            @Nullable
            /* renamed from: C3 */
            public final Object I(@NotNull qi5<? super R> qi5Var, @NotNull T[] tArr, @Nullable uv4<? super yq4> uv4Var) {
                a aVar = new a(this.z, uv4Var);
                aVar.x = qi5Var;
                aVar.y = tArr;
                return aVar.D1(yq4.a);
            }

            @Override // com.p7700g.p99005.hw4
            @Nullable
            public final Object D1(@NotNull Object obj) {
                Object h = gw4.h();
                int i = this.w;
                if (i == 0) {
                    rp4.n(obj);
                    k05<qi5<? super R>, T[], uv4<? super yq4>, Object> k05Var = this.z;
                    this.x = null;
                    this.w = 1;
                    if (k05Var.I((qi5) this.x, (Object[]) this.y, this) == h) {
                        return h;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    rp4.n(obj);
                }
                return yq4.a;
            }

            @Nullable
            public final Object G3(@NotNull Object obj) {
                this.z.I((qi5) this.x, (Object[]) this.y, this);
                return yq4.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public s(pi5<? extends T>[] pi5VarArr, k05<? super qi5<? super R>, ? super T[], ? super uv4<? super yq4>, ? extends Object> k05Var, uv4<? super s> uv4Var) {
            super(2, uv4Var);
            this.y = pi5VarArr;
            this.z = k05Var;
        }

        @Override // com.p7700g.p99005.j05
        @Nullable
        /* renamed from: C3 */
        public final Object w3(@NotNull qi5<? super R> qi5Var, @Nullable uv4<? super yq4> uv4Var) {
            return ((s) X(qi5Var, uv4Var)).D1(yq4.a);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            Object h = gw4.h();
            int i = this.w;
            if (i == 0) {
                rp4.n(obj);
                pi5<T>[] pi5VarArr = this.y;
                uz4 r = ij5.r();
                c25.w();
                a aVar = new a(this.z, null);
                this.w = 1;
                if (tk5.a((qi5) this.x, pi5VarArr, r, aVar, this) == h) {
                    return h;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                rp4.n(obj);
            }
            return yq4.a;
        }

        @Nullable
        public final Object G3(@NotNull Object obj) {
            pi5<T>[] pi5VarArr = this.y;
            uz4 r = ij5.r();
            c25.w();
            a aVar = new a(this.z, null);
            z15.e(0);
            tk5.a((qi5) this.x, pi5VarArr, r, aVar, this);
            z15.e(1);
            return yq4.a;
        }

        @Override // com.p7700g.p99005.hw4
        @NotNull
        public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
            s sVar = new s(this.y, this.z, uv4Var);
            sVar.x = obj;
            return sVar;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @vo4(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class t implements pi5<R> {
        public final /* synthetic */ pi5[] s;
        public final /* synthetic */ j05 t;

        /* compiled from: SafeCollector.common.kt */
        @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kw4 {
            public /* synthetic */ Object v;
            public int w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(uv4 uv4Var) {
                super(uv4Var);
                t.this = r1;
            }

            @Override // com.p7700g.p99005.hw4
            @Nullable
            public final Object D1(@NotNull Object obj) {
                this.v = obj;
                this.w |= Integer.MIN_VALUE;
                return t.this.a(null, this);
            }
        }

        public t(pi5[] pi5VarArr, j05 j05Var) {
            this.s = pi5VarArr;
            this.t = j05Var;
        }

        @Override // com.p7700g.p99005.pi5
        @Nullable
        public Object a(@NotNull qi5<? super R> qi5Var, @NotNull uv4<? super yq4> uv4Var) {
            pi5[] pi5VarArr = this.s;
            uz4 r = ij5.r();
            c25.w();
            Object a2 = tk5.a(qi5Var, pi5VarArr, r, new u(this.t, null), uv4Var);
            return a2 == gw4.h() ? a2 : yq4.a;
        }

        @Nullable
        public Object e(@NotNull qi5 qi5Var, @NotNull uv4 uv4Var) {
            z15.e(4);
            new a(uv4Var);
            z15.e(5);
            pi5[] pi5VarArr = this.s;
            uz4 r = ij5.r();
            c25.w();
            u uVar = new u(this.t, null);
            z15.e(0);
            tk5.a(qi5Var, pi5VarArr, r, uVar, uv4Var);
            z15.e(1);
            return yq4.a;
        }
    }

    /* compiled from: Zip.kt */
    @mw4(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineUnsafe$1$1", f = "Zip.kt", i = {}, l = {262, 262}, m = "invokeSuspend", n = {}, s = {})
    @vo4(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u008a@"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class u extends vw4 implements k05<qi5<? super R>, T[], uv4<? super yq4>, Object> {
        public int w;
        private /* synthetic */ Object x;
        public /* synthetic */ Object y;
        public final /* synthetic */ j05<T[], uv4<? super R>, Object> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public u(j05<? super T[], ? super uv4<? super R>, ? extends Object> j05Var, uv4<? super u> uv4Var) {
            super(3, uv4Var);
            this.z = j05Var;
        }

        @Override // com.p7700g.p99005.k05
        @Nullable
        /* renamed from: C3 */
        public final Object I(@NotNull qi5<? super R> qi5Var, @NotNull T[] tArr, @Nullable uv4<? super yq4> uv4Var) {
            u uVar = new u(this.z, uv4Var);
            uVar.x = qi5Var;
            uVar.y = tArr;
            return uVar.D1(yq4.a);
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
                j05<T[], uv4<? super R>, Object> j05Var = this.z;
                this.x = qi5Var;
                this.w = 1;
                obj = j05Var.w3((Object[]) this.y, this);
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
            if (qi5Var.b(obj, this) == h) {
                return h;
            }
            return yq4.a;
        }

        @Nullable
        public final Object G3(@NotNull Object obj) {
            Object w3 = this.z.w3((Object[]) this.y, this);
            z15.e(0);
            ((qi5) this.x).b(w3, this);
            z15.e(1);
            return yq4.a;
        }
    }

    /* compiled from: Zip.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class v extends e25 implements uz4 {
        public static final v t = new v();

        public v() {
            super(0);
        }

        @Override // com.p7700g.p99005.uz4
        @Nullable
        /* renamed from: h */
        public final Void x() {
            return null;
        }
    }

    public static final /* synthetic */ <T, R> pi5<R> b(Iterable<? extends pi5<? extends T>> iterable, j05<? super T[], ? super uv4<? super R>, ? extends Object> j05Var) {
        Object[] array = rs4.Q5(iterable).toArray(new pi5[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        c25.w();
        return new f((pi5[]) array, j05Var);
    }

    @NotNull
    public static final <T1, T2, R> pi5<R> c(@NotNull pi5<? extends T1> pi5Var, @NotNull pi5<? extends T2> pi5Var2, @NotNull k05<? super T1, ? super T2, ? super uv4<? super R>, ? extends Object> k05Var) {
        return ri5.J0(pi5Var, pi5Var2, k05Var);
    }

    @NotNull
    public static final <T1, T2, T3, R> pi5<R> d(@NotNull pi5<? extends T1> pi5Var, @NotNull pi5<? extends T2> pi5Var2, @NotNull pi5<? extends T3> pi5Var3, @on4 @NotNull l05<? super T1, ? super T2, ? super T3, ? super uv4<? super R>, ? extends Object> l05Var) {
        return new a(new pi5[]{pi5Var, pi5Var2, pi5Var3}, l05Var);
    }

    @NotNull
    public static final <T1, T2, T3, T4, R> pi5<R> e(@NotNull pi5<? extends T1> pi5Var, @NotNull pi5<? extends T2> pi5Var2, @NotNull pi5<? extends T3> pi5Var3, @NotNull pi5<? extends T4> pi5Var4, @NotNull m05<? super T1, ? super T2, ? super T3, ? super T4, ? super uv4<? super R>, ? extends Object> m05Var) {
        return new b(new pi5[]{pi5Var, pi5Var2, pi5Var3, pi5Var4}, m05Var);
    }

    @NotNull
    public static final <T1, T2, T3, T4, T5, R> pi5<R> f(@NotNull pi5<? extends T1> pi5Var, @NotNull pi5<? extends T2> pi5Var2, @NotNull pi5<? extends T3> pi5Var3, @NotNull pi5<? extends T4> pi5Var4, @NotNull pi5<? extends T5> pi5Var5, @NotNull n05<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super uv4<? super R>, ? extends Object> n05Var) {
        return new c(new pi5[]{pi5Var, pi5Var2, pi5Var3, pi5Var4, pi5Var5}, n05Var);
    }

    public static final /* synthetic */ <T, R> pi5<R> h(Iterable<? extends pi5<? extends T>> iterable, @on4 k05<? super qi5<? super R>, ? super T[], ? super uv4<? super yq4>, ? extends Object> k05Var) {
        Object[] array = rs4.Q5(iterable).toArray(new pi5[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        c25.w();
        return ri5.I0(new r((pi5[]) array, k05Var, null));
    }

    @NotNull
    public static final <T1, T2, R> pi5<R> i(@NotNull pi5<? extends T1> pi5Var, @NotNull pi5<? extends T2> pi5Var2, @on4 @NotNull l05<? super qi5<? super R>, ? super T1, ? super T2, ? super uv4<? super yq4>, ? extends Object> l05Var) {
        return ri5.I0(new m(new pi5[]{pi5Var, pi5Var2}, null, l05Var));
    }

    @NotNull
    public static final <T1, T2, T3, R> pi5<R> j(@NotNull pi5<? extends T1> pi5Var, @NotNull pi5<? extends T2> pi5Var2, @NotNull pi5<? extends T3> pi5Var3, @on4 @NotNull m05<? super qi5<? super R>, ? super T1, ? super T2, ? super T3, ? super uv4<? super yq4>, ? extends Object> m05Var) {
        return ri5.I0(new n(new pi5[]{pi5Var, pi5Var2, pi5Var3}, null, m05Var));
    }

    @NotNull
    public static final <T1, T2, T3, T4, R> pi5<R> k(@NotNull pi5<? extends T1> pi5Var, @NotNull pi5<? extends T2> pi5Var2, @NotNull pi5<? extends T3> pi5Var3, @NotNull pi5<? extends T4> pi5Var4, @on4 @NotNull n05<? super qi5<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super uv4<? super yq4>, ? extends Object> n05Var) {
        return ri5.I0(new o(new pi5[]{pi5Var, pi5Var2, pi5Var3, pi5Var4}, null, n05Var));
    }

    @NotNull
    public static final <T1, T2, T3, T4, T5, R> pi5<R> l(@NotNull pi5<? extends T1> pi5Var, @NotNull pi5<? extends T2> pi5Var2, @NotNull pi5<? extends T3> pi5Var3, @NotNull pi5<? extends T4> pi5Var4, @NotNull pi5<? extends T5> pi5Var5, @on4 @NotNull o05<? super qi5<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super uv4<? super yq4>, ? extends Object> o05Var) {
        return ri5.I0(new p(new pi5[]{pi5Var, pi5Var2, pi5Var3, pi5Var4, pi5Var5}, null, o05Var));
    }

    @fz4(name = "flowCombine")
    @NotNull
    public static final <T1, T2, R> pi5<R> p(@NotNull pi5<? extends T1> pi5Var, @NotNull pi5<? extends T2> pi5Var2, @NotNull k05<? super T1, ? super T2, ? super uv4<? super R>, ? extends Object> k05Var) {
        return new d(pi5Var, pi5Var2, k05Var);
    }

    @fz4(name = "flowCombineTransform")
    @NotNull
    public static final <T1, T2, R> pi5<R> q(@NotNull pi5<? extends T1> pi5Var, @NotNull pi5<? extends T2> pi5Var2, @on4 @NotNull l05<? super qi5<? super R>, ? super T1, ? super T2, ? super uv4<? super yq4>, ? extends Object> l05Var) {
        return ri5.I0(new l(new pi5[]{pi5Var, pi5Var2}, null, l05Var));
    }

    public static final <T> uz4<T[]> r() {
        return v.t;
    }

    @NotNull
    public static final <T1, T2, R> pi5<R> s(@NotNull pi5<? extends T1> pi5Var, @NotNull pi5<? extends T2> pi5Var2, @NotNull k05<? super T1, ? super T2, ? super uv4<? super R>, ? extends Object> k05Var) {
        return tk5.b(pi5Var, pi5Var2, k05Var);
    }
}