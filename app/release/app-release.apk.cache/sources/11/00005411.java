package com.p7700g.p99005;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xbill.DNS.TTL;

/* compiled from: Duration.kt */
@dr4(markerClass = {v95.class})
@dz4
@vo4(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087@\u0018\u0000 ¤\u00012\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002¤\u0001B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010D\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u00032\u0006\u0010F\u001a\u00020\u0003H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bG\u0010HJ\u001b\u0010I\u001a\u00020\t2\u0006\u0010J\u001a\u00020\u0000H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\bK\u0010LJ\u001e\u0010M\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\u000fH\u0086\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bO\u0010PJ\u001e\u0010M\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\tH\u0086\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bO\u0010QJ\u001b\u0010M\u001a\u00020\u000f2\u0006\u0010J\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bR\u0010SJ\u001a\u0010T\u001a\u00020U2\b\u0010J\u001a\u0004\u0018\u00010VHÖ\u0003¢\u0006\u0004\bW\u0010XJ\u0010\u0010Y\u001a\u00020\tHÖ\u0001¢\u0006\u0004\bZ\u0010\rJ\r\u0010[\u001a\u00020U¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020UH\u0002¢\u0006\u0004\b_\u0010]J\u000f\u0010`\u001a\u00020UH\u0002¢\u0006\u0004\ba\u0010]J\r\u0010b\u001a\u00020U¢\u0006\u0004\bc\u0010]J\r\u0010d\u001a\u00020U¢\u0006\u0004\be\u0010]J\r\u0010f\u001a\u00020U¢\u0006\u0004\bg\u0010]J\u001b\u0010h\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bi\u0010jJ\u001b\u0010k\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bl\u0010jJ\u001e\u0010m\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\u000fH\u0086\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bn\u0010PJ\u001e\u0010m\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\tH\u0086\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bn\u0010QJ\u009d\u0001\u0010o\u001a\u0002Hp\"\u0004\b\u0000\u0010p2u\u0010q\u001aq\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(u\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(v\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(w\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(y\u0012\u0004\u0012\u0002Hp0rH\u0086\bø\u0001\u0002\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bz\u0010{J\u0088\u0001\u0010o\u001a\u0002Hp\"\u0004\b\u0000\u0010p2`\u0010q\u001a\\\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(v\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(w\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(y\u0012\u0004\u0012\u0002Hp0|H\u0086\bø\u0001\u0002\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bz\u0010}Js\u0010o\u001a\u0002Hp\"\u0004\b\u0000\u0010p2K\u0010q\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(w\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(y\u0012\u0004\u0012\u0002Hp0~H\u0086\bø\u0001\u0002\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bz\u0010\u007fJ`\u0010o\u001a\u0002Hp\"\u0004\b\u0000\u0010p27\u0010q\u001a3\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(y\u0012\u0004\u0012\u0002Hp0\u0080\u0001H\u0086\bø\u0001\u0002\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0005\bz\u0010\u0081\u0001J\u0019\u0010\u0082\u0001\u001a\u00020\u000f2\u0007\u0010\u0083\u0001\u001a\u00020=¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u0019\u0010\u0086\u0001\u001a\u00020\t2\u0007\u0010\u0083\u0001\u001a\u00020=¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u0011\u0010\u0089\u0001\u001a\u00030\u008a\u0001¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u0019\u0010\u008d\u0001\u001a\u00020\u00032\u0007\u0010\u0083\u0001\u001a\u00020=¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u0011\u0010\u0090\u0001\u001a\u00020\u0003H\u0007¢\u0006\u0005\b\u0091\u0001\u0010\u0005J\u0011\u0010\u0092\u0001\u001a\u00020\u0003H\u0007¢\u0006\u0005\b\u0093\u0001\u0010\u0005J\u0013\u0010\u0094\u0001\u001a\u00030\u008a\u0001H\u0016¢\u0006\u0006\b\u0095\u0001\u0010\u008c\u0001J%\u0010\u0094\u0001\u001a\u00030\u008a\u00012\u0007\u0010\u0083\u0001\u001a\u00020=2\t\b\u0002\u0010\u0096\u0001\u001a\u00020\t¢\u0006\u0006\b\u0095\u0001\u0010\u0097\u0001J\u0018\u0010\u0098\u0001\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0005\b\u0099\u0001\u0010\u0005JK\u0010\u009a\u0001\u001a\u00030\u009b\u0001*\b0\u009c\u0001j\u0003`\u009d\u00012\u0007\u0010\u009e\u0001\u001a\u00020\t2\u0007\u0010\u009f\u0001\u001a\u00020\t2\u0007\u0010 \u0001\u001a\u00020\t2\b\u0010\u0083\u0001\u001a\u00030\u008a\u00012\u0007\u0010¡\u0001\u001a\u00020UH\u0002¢\u0006\u0006\b¢\u0001\u0010£\u0001R\u0017\u0010\u0006\u001a\u00020\u00008Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u001a\u0010\b\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001b\u0010\u0012R\u001a\u0010\u001c\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001e\u0010\u0012R\u001a\u0010\u001f\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010\u000b\u001a\u0004\b!\u0010\u0012R\u001a\u0010\"\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b#\u0010\u000b\u001a\u0004\b$\u0010\u0012R\u0011\u0010%\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b&\u0010\u0005R\u0011\u0010'\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b(\u0010\u0005R\u0011\u0010)\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b*\u0010\u0005R\u0011\u0010+\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b,\u0010\u0005R\u0011\u0010-\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b.\u0010\u0005R\u0011\u0010/\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b0\u0010\u0005R\u0011\u00101\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b2\u0010\u0005R\u001a\u00103\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b4\u0010\u000b\u001a\u0004\b5\u0010\rR\u001a\u00106\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b7\u0010\u000b\u001a\u0004\b8\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00109\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b:\u0010\u000b\u001a\u0004\b;\u0010\rR\u0014\u0010<\u001a\u00020=8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0015\u0010@\u001a\u00020\t8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010\rR\u0014\u0010B\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010\u0005\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u009920\u0001¨\u0006¥\u0001"}, d2 = {"Lkotlin/time/Duration;", "", "rawValue", "", "constructor-impl", "(J)J", "absoluteValue", "getAbsoluteValue-UwyO8pc", "hoursComponent", "", "getHoursComponent$annotations", "()V", "getHoursComponent-impl", "(J)I", "inDays", "", "getInDays$annotations", "getInDays-impl", "(J)D", "inHours", "getInHours$annotations", "getInHours-impl", "inMicroseconds", "getInMicroseconds$annotations", "getInMicroseconds-impl", "inMilliseconds", "getInMilliseconds$annotations", "getInMilliseconds-impl", "inMinutes", "getInMinutes$annotations", "getInMinutes-impl", "inNanoseconds", "getInNanoseconds$annotations", "getInNanoseconds-impl", "inSeconds", "getInSeconds$annotations", "getInSeconds-impl", "inWholeDays", "getInWholeDays-impl", "inWholeHours", "getInWholeHours-impl", "inWholeMicroseconds", "getInWholeMicroseconds-impl", "inWholeMilliseconds", "getInWholeMilliseconds-impl", "inWholeMinutes", "getInWholeMinutes-impl", "inWholeNanoseconds", "getInWholeNanoseconds-impl", "inWholeSeconds", "getInWholeSeconds-impl", "minutesComponent", "getMinutesComponent$annotations", "getMinutesComponent-impl", "nanosecondsComponent", "getNanosecondsComponent$annotations", "getNanosecondsComponent-impl", "secondsComponent", "getSecondsComponent$annotations", "getSecondsComponent-impl", "storageUnit", "Lkotlin/time/DurationUnit;", "getStorageUnit-impl", "(J)Lkotlin/time/DurationUnit;", "unitDiscriminator", "getUnitDiscriminator-impl", "value", "getValue-impl", "addValuesMixedRanges", "thisMillis", "otherNanos", "addValuesMixedRanges-UwyO8pc", "(JJJ)J", "compareTo", "other", "compareTo-LRDsOJo", "(JJ)I", "div", "scale", "div-UwyO8pc", "(JD)J", "(JI)J", "div-LRDsOJo", "(JJ)D", "equals", "", "", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "isFinite", "isFinite-impl", "(J)Z", "isInMillis", "isInMillis-impl", "isInNanos", "isInNanos-impl", "isInfinite", "isInfinite-impl", "isNegative", "isNegative-impl", "isPositive", "isPositive-impl", "minus", "minus-LRDsOJo", "(JJ)J", "plus", "plus-LRDsOJo", "times", "times-UwyO8pc", "toComponents", "T", "action", "Lkotlin/Function5;", "Lkotlin/ParameterName;", "name", "days", "hours", "minutes", "seconds", "nanoseconds", "toComponents-impl", "(JLkotlin/jvm/functions/Function5;)Ljava/lang/Object;", "Lkotlin/Function4;", "(JLkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "Lkotlin/Function3;", "(JLkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "Lkotlin/Function2;", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "toDouble", "unit", "toDouble-impl", "(JLkotlin/time/DurationUnit;)D", "toInt", "toInt-impl", "(JLkotlin/time/DurationUnit;)I", "toIsoString", "", "toIsoString-impl", "(J)Ljava/lang/String;", "toLong", "toLong-impl", "(JLkotlin/time/DurationUnit;)J", "toLongMilliseconds", "toLongMilliseconds-impl", "toLongNanoseconds", "toLongNanoseconds-impl", "toString", "toString-impl", "decimals", "(JLkotlin/time/DurationUnit;I)Ljava/lang/String;", "unaryMinus", "unaryMinus-UwyO8pc", "appendFractional", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "whole", "fractional", "fractionalSize", "isoZeroes", "appendFractional-impl", "(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
@tp4(version = "1.6")
/* loaded from: classes3.dex */
public final class o95 implements Comparable<o95> {
    @NotNull
    public static final a s = new a(null);
    private static final long t = i(0);
    private static final long u = q95.b(q95.c);
    private static final long v = q95.b(-4611686018427387903L);
    private final long w;

    /* compiled from: Duration.kt */
    @vo4(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\r2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-H\u0007J\u001d\u0010\f\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0011J\u001d\u0010\f\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0014J\u001d\u0010\f\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0011J\u001d\u0010\u0018\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0011J\u001d\u0010\u001b\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0014J\u001d\u0010\u001b\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0017J\u001d\u0010\u001e\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b2\u0010\u0011J\u001d\u0010\u001e\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b2\u0010\u0014J\u001d\u0010\u001e\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b2\u0010\u0017J\u001d\u0010!\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b3\u0010\u0011J\u001d\u0010!\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b3\u0010\u0014J\u001d\u0010!\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b3\u0010\u0017J\u001d\u0010$\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u0010\u0011J\u001d\u0010$\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u0010\u0014J\u001d\u0010$\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u0010\u0017J\u001b\u00105\u001a\u00020\u00042\u0006\u0010+\u001a\u000206ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b7\u00108J\u001b\u00109\u001a\u00020\u00042\u0006\u0010+\u001a\u000206ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b:\u00108J\u001b\u0010;\u001a\u0004\u0018\u00010\u00042\u0006\u0010+\u001a\u000206ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b<J\u001b\u0010=\u001a\u0004\u0018\u00010\u00042\u0006\u0010+\u001a\u000206ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b>J\u001d\u0010'\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u0010\u0011J\u001d\u0010'\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u0010\u0014J\u001d\u0010'\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u0010\u0017R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R%\u0010\f\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R%\u0010\f\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0010\u0010\u0014R%\u0010\f\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0010\u0010\u0017R%\u0010\u0018\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011R%\u0010\u0018\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0014R%\u0010\u0018\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0017R%\u0010\u001b\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u0011R%\u0010\u001b\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0014R%\u0010\u001b\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0017R%\u0010\u001e\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001f\u0010\u000f\u001a\u0004\b \u0010\u0011R%\u0010\u001e\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010\u0014R%\u0010\u001e\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0017R%\u0010!\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\"\u0010\u000f\u001a\u0004\b#\u0010\u0011R%\u0010!\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010\u0014R%\u0010!\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\u0017R%\u0010$\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b%\u0010\u000f\u001a\u0004\b&\u0010\u0011R%\u0010$\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b%\u0010\u0013\u001a\u0004\b&\u0010\u0014R%\u0010$\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010\u0017R%\u0010'\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b(\u0010\u000f\u001a\u0004\b)\u0010\u0011R%\u0010'\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b(\u0010\u0013\u001a\u0004\b)\u0010\u0014R%\u0010'\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b(\u0010\u0016\u001a\u0004\b)\u0010\u0017\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006@"}, d2 = {"Lkotlin/time/Duration$Companion;", "", "()V", "INFINITE", "Lkotlin/time/Duration;", "getINFINITE-UwyO8pc", "()J", "J", "NEG_INFINITE", "getNEG_INFINITE-UwyO8pc$kotlin_stdlib", "ZERO", "getZERO-UwyO8pc", "days", "", "getDays-UwyO8pc$annotations", "(D)V", "getDays-UwyO8pc", "(D)J", "", "(I)V", "(I)J", "", "(J)V", "(J)J", "hours", "getHours-UwyO8pc$annotations", "getHours-UwyO8pc", "microseconds", "getMicroseconds-UwyO8pc$annotations", "getMicroseconds-UwyO8pc", "milliseconds", "getMilliseconds-UwyO8pc$annotations", "getMilliseconds-UwyO8pc", "minutes", "getMinutes-UwyO8pc$annotations", "getMinutes-UwyO8pc", "nanoseconds", "getNanoseconds-UwyO8pc$annotations", "getNanoseconds-UwyO8pc", "seconds", "getSeconds-UwyO8pc$annotations", "getSeconds-UwyO8pc", "convert", "value", "sourceUnit", "Lkotlin/time/DurationUnit;", "targetUnit", "days-UwyO8pc", "hours-UwyO8pc", "microseconds-UwyO8pc", "milliseconds-UwyO8pc", "minutes-UwyO8pc", "nanoseconds-UwyO8pc", "parse", "", "parse-UwyO8pc", "(Ljava/lang/String;)J", "parseIsoString", "parseIsoString-UwyO8pc", "parseIsoStringOrNull", "parseIsoStringOrNull-FghU774", "parseOrNull", "parseOrNull-FghU774", "seconds-UwyO8pc", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @dx4
        public static /* synthetic */ void A(double d) {
        }

        @dx4
        public static /* synthetic */ void B(int i) {
        }

        @dx4
        public static /* synthetic */ void C(long j) {
        }

        private final long D(double d) {
            return q95.l0(d, r95.MINUTES);
        }

        private final long E(int i) {
            return q95.m0(i, r95.MINUTES);
        }

        private final long F(long j) {
            return q95.n0(j, r95.MINUTES);
        }

        @dx4
        public static /* synthetic */ void G(double d) {
        }

        @dx4
        public static /* synthetic */ void H(int i) {
        }

        @dx4
        public static /* synthetic */ void I(long j) {
        }

        private final long K(double d) {
            return q95.l0(d, r95.NANOSECONDS);
        }

        private final long L(int i) {
            return q95.m0(i, r95.NANOSECONDS);
        }

        private final long M(long j) {
            return q95.n0(j, r95.NANOSECONDS);
        }

        @dx4
        public static /* synthetic */ void N(double d) {
        }

        @dx4
        public static /* synthetic */ void O(int i) {
        }

        @dx4
        public static /* synthetic */ void P(long j) {
        }

        private final long Q(double d) {
            return q95.l0(d, r95.SECONDS);
        }

        private final long R(int i) {
            return q95.m0(i, r95.SECONDS);
        }

        private final long S(long j) {
            return q95.n0(j, r95.SECONDS);
        }

        @dx4
        public static /* synthetic */ void T(double d) {
        }

        @dx4
        public static /* synthetic */ void U(int i) {
        }

        @dx4
        public static /* synthetic */ void V(long j) {
        }

        private final long e(double d) {
            return q95.l0(d, r95.DAYS);
        }

        private final long f(int i) {
            return q95.m0(i, r95.DAYS);
        }

        private final long g(long j) {
            return q95.n0(j, r95.DAYS);
        }

        @dx4
        public static /* synthetic */ void h(double d) {
        }

        @dx4
        public static /* synthetic */ void i(int i) {
        }

        @dx4
        public static /* synthetic */ void j(long j) {
        }

        private final long k(double d) {
            return q95.l0(d, r95.HOURS);
        }

        private final long l(int i) {
            return q95.m0(i, r95.HOURS);
        }

        private final long m(long j) {
            return q95.n0(j, r95.HOURS);
        }

        @dx4
        public static /* synthetic */ void n(double d) {
        }

        @dx4
        public static /* synthetic */ void o(int i) {
        }

        @dx4
        public static /* synthetic */ void p(long j) {
        }

        private final long r(double d) {
            return q95.l0(d, r95.MICROSECONDS);
        }

        private final long s(int i) {
            return q95.m0(i, r95.MICROSECONDS);
        }

        private final long t(long j) {
            return q95.n0(j, r95.MICROSECONDS);
        }

        @dx4
        public static /* synthetic */ void u(double d) {
        }

        @dx4
        public static /* synthetic */ void v(int i) {
        }

        @dx4
        public static /* synthetic */ void w(long j) {
        }

        private final long x(double d) {
            return q95.l0(d, r95.MILLISECONDS);
        }

        private final long y(int i) {
            return q95.m0(i, r95.MILLISECONDS);
        }

        private final long z(long j) {
            return q95.n0(j, r95.MILLISECONDS);
        }

        public final long J() {
            return o95.v;
        }

        public final long W() {
            return o95.t;
        }

        @yn4(warningSince = "1.6")
        @xn4(message = "Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith = @op4(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @v95
        @tp4(version = "1.5")
        public final long X(double d) {
            return q95.l0(d, r95.HOURS);
        }

        @yn4(warningSince = "1.6")
        @xn4(message = "Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith = @op4(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @v95
        @tp4(version = "1.5")
        public final long Y(int i) {
            return q95.m0(i, r95.HOURS);
        }

        @yn4(warningSince = "1.6")
        @xn4(message = "Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith = @op4(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @v95
        @tp4(version = "1.5")
        public final long Z(long j) {
            return q95.n0(j, r95.HOURS);
        }

        @v95
        public final double a(double d, @NotNull r95 r95Var, @NotNull r95 r95Var2) {
            c25.p(r95Var, "sourceUnit");
            c25.p(r95Var2, "targetUnit");
            return t95.a(d, r95Var, r95Var2);
        }

        @yn4(warningSince = "1.6")
        @xn4(message = "Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith = @op4(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @v95
        @tp4(version = "1.5")
        public final long a0(double d) {
            return q95.l0(d, r95.MICROSECONDS);
        }

        @yn4(warningSince = "1.6")
        @xn4(message = "Use 'Double.days' extension property from Duration.Companion instead.", replaceWith = @op4(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @v95
        @tp4(version = "1.5")
        public final long b(double d) {
            return q95.l0(d, r95.DAYS);
        }

        @yn4(warningSince = "1.6")
        @xn4(message = "Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith = @op4(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @v95
        @tp4(version = "1.5")
        public final long b0(int i) {
            return q95.m0(i, r95.MICROSECONDS);
        }

        @yn4(warningSince = "1.6")
        @xn4(message = "Use 'Int.days' extension property from Duration.Companion instead.", replaceWith = @op4(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @v95
        @tp4(version = "1.5")
        public final long c(int i) {
            return q95.m0(i, r95.DAYS);
        }

        @yn4(warningSince = "1.6")
        @xn4(message = "Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith = @op4(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @v95
        @tp4(version = "1.5")
        public final long c0(long j) {
            return q95.n0(j, r95.MICROSECONDS);
        }

        @yn4(warningSince = "1.6")
        @xn4(message = "Use 'Long.days' extension property from Duration.Companion instead.", replaceWith = @op4(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @v95
        @tp4(version = "1.5")
        public final long d(long j) {
            return q95.n0(j, r95.DAYS);
        }

        @yn4(warningSince = "1.6")
        @xn4(message = "Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith = @op4(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @v95
        @tp4(version = "1.5")
        public final long d0(double d) {
            return q95.l0(d, r95.MILLISECONDS);
        }

        @yn4(warningSince = "1.6")
        @xn4(message = "Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith = @op4(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @v95
        @tp4(version = "1.5")
        public final long e0(int i) {
            return q95.m0(i, r95.MILLISECONDS);
        }

        @yn4(warningSince = "1.6")
        @xn4(message = "Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith = @op4(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @v95
        @tp4(version = "1.5")
        public final long f0(long j) {
            return q95.n0(j, r95.MILLISECONDS);
        }

        @yn4(warningSince = "1.6")
        @xn4(message = "Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith = @op4(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @v95
        @tp4(version = "1.5")
        public final long g0(double d) {
            return q95.l0(d, r95.MINUTES);
        }

        @yn4(warningSince = "1.6")
        @xn4(message = "Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith = @op4(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @v95
        @tp4(version = "1.5")
        public final long h0(int i) {
            return q95.m0(i, r95.MINUTES);
        }

        @yn4(warningSince = "1.6")
        @xn4(message = "Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith = @op4(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @v95
        @tp4(version = "1.5")
        public final long i0(long j) {
            return q95.n0(j, r95.MINUTES);
        }

        @yn4(warningSince = "1.6")
        @xn4(message = "Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @op4(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @v95
        @tp4(version = "1.5")
        public final long j0(double d) {
            return q95.l0(d, r95.NANOSECONDS);
        }

        @yn4(warningSince = "1.6")
        @xn4(message = "Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @op4(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @v95
        @tp4(version = "1.5")
        public final long k0(int i) {
            return q95.m0(i, r95.NANOSECONDS);
        }

        @yn4(warningSince = "1.6")
        @xn4(message = "Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @op4(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @v95
        @tp4(version = "1.5")
        public final long l0(long j) {
            return q95.n0(j, r95.NANOSECONDS);
        }

        public final long m0(@NotNull String str) {
            c25.p(str, "value");
            try {
                return q95.h(str, false);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(wo1.u("Invalid duration string format: '", str, "'."), e);
            }
        }

        public final long n0(@NotNull String str) {
            c25.p(str, "value");
            try {
                return q95.h(str, true);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(wo1.u("Invalid ISO duration string format: '", str, "'."), e);
            }
        }

        @Nullable
        public final o95 o0(@NotNull String str) {
            c25.p(str, "value");
            try {
                return o95.f(q95.h(str, true));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @Nullable
        public final o95 p0(@NotNull String str) {
            c25.p(str, "value");
            try {
                return o95.f(q95.h(str, false));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final long q() {
            return o95.u;
        }

        @yn4(warningSince = "1.6")
        @xn4(message = "Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith = @op4(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @v95
        @tp4(version = "1.5")
        public final long q0(double d) {
            return q95.l0(d, r95.SECONDS);
        }

        @yn4(warningSince = "1.6")
        @xn4(message = "Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith = @op4(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @v95
        @tp4(version = "1.5")
        public final long r0(int i) {
            return q95.m0(i, r95.SECONDS);
        }

        @yn4(warningSince = "1.6")
        @xn4(message = "Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith = @op4(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @v95
        @tp4(version = "1.5")
        public final long s0(long j) {
            return q95.n0(j, r95.SECONDS);
        }
    }

    private /* synthetic */ o95(long j) {
        this.w = j;
    }

    public static final double A(long j) {
        return w1(j, r95.MINUTES);
    }

    @v95
    @xn4(message = "Use inWholeNanoseconds property instead or convert toDouble(NANOSECONDS) if a double value is required.", replaceWith = @op4(expression = "toDouble(DurationUnit.NANOSECONDS)", imports = {}))
    public static /* synthetic */ void B() {
    }

    public static final double D(long j) {
        return w1(j, r95.NANOSECONDS);
    }

    public static final int D1(long j, @NotNull r95 r95Var) {
        c25.p(r95Var, "unit");
        return (int) i55.D(H1(j, r95Var), -2147483648L, TTL.MAX_VALUE);
    }

    @v95
    @xn4(message = "Use inWholeSeconds property instead or convert toDouble(SECONDS) if a double value is required.", replaceWith = @op4(expression = "toDouble(DurationUnit.SECONDS)", imports = {}))
    public static /* synthetic */ void E() {
    }

    @NotNull
    public static final String E1(long j) {
        StringBuilder sb = new StringBuilder();
        if (x0(j)) {
            sb.append('-');
        }
        sb.append("PT");
        long o = o(j);
        long H = H(o);
        int O = O(o);
        int S = S(o);
        int Q = Q(o);
        if (w0(j)) {
            H = 9999999999999L;
        }
        boolean z = true;
        boolean z2 = H != 0;
        boolean z3 = (S == 0 && Q == 0) ? false : true;
        if (O == 0 && (!z3 || !z2)) {
            z = false;
        }
        if (z2) {
            sb.append(H);
            sb.append('H');
        }
        if (z) {
            sb.append(O);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            e(j, sb, S, Q, 9, "S", true);
        }
        String sb2 = sb.toString();
        c25.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static final double F(long j) {
        return w1(j, r95.SECONDS);
    }

    public static final long G(long j) {
        return H1(j, r95.DAYS);
    }

    public static final long H(long j) {
        return H1(j, r95.HOURS);
    }

    public static final long H1(long j, @NotNull r95 r95Var) {
        c25.p(r95Var, "unit");
        if (j == u) {
            return Long.MAX_VALUE;
        }
        if (j == v) {
            return Long.MIN_VALUE;
        }
        return t95.b(V(j), T(j), r95Var);
    }

    public static final long I(long j) {
        return H1(j, r95.MICROSECONDS);
    }

    public static final long J(long j) {
        return (Y(j) && X(j)) ? V(j) : H1(j, r95.MILLISECONDS);
    }

    @v95
    @xn4(message = "Use inWholeMilliseconds property instead.", replaceWith = @op4(expression = "this.inWholeMilliseconds", imports = {}))
    public static final long J1(long j) {
        return J(j);
    }

    public static final long K(long j) {
        return H1(j, r95.MINUTES);
    }

    @v95
    @xn4(message = "Use inWholeNanoseconds property instead.", replaceWith = @op4(expression = "this.inWholeNanoseconds", imports = {}))
    public static final long K1(long j) {
        return L(j);
    }

    public static final long L(long j) {
        long V = V(j);
        if (Z(j)) {
            return V;
        }
        if (V > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (V < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return q95.f(V);
    }

    @NotNull
    public static String L1(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == u) {
            return "Infinity";
        }
        if (j == v) {
            return "-Infinity";
        }
        boolean x0 = x0(j);
        StringBuilder sb = new StringBuilder();
        if (x0) {
            sb.append('-');
        }
        long o = o(j);
        long G = G(o);
        int q = q(o);
        int O = O(o);
        int S = S(o);
        int Q = Q(o);
        int i = 0;
        boolean z = G != 0;
        boolean z2 = q != 0;
        boolean z3 = O != 0;
        boolean z4 = (S == 0 && Q == 0) ? false : true;
        if (z) {
            sb.append(G);
            sb.append('d');
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(gl4.R);
            }
            sb.append(q);
            sb.append('h');
            i = i2;
        }
        if (z3 || (z4 && (z2 || z))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(gl4.R);
            }
            sb.append(O);
            sb.append('m');
            i = i3;
        }
        if (z4) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(gl4.R);
            }
            if (S != 0 || z || z2 || z3) {
                e(j, sb, S, Q, 9, "s", false);
            } else if (Q >= 1000000) {
                e(j, sb, Q / q95.a, Q % q95.a, 6, "ms", false);
            } else if (Q >= 1000) {
                e(j, sb, Q / 1000, Q % 1000, 3, "us", false);
            } else {
                sb.append(Q);
                sb.append("ns");
            }
            i = i4;
        }
        if (x0 && i > 1) {
            sb.insert(1, '(').append(')');
        }
        String sb2 = sb.toString();
        c25.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static final long M(long j) {
        return H1(j, r95.SECONDS);
    }

    @NotNull
    public static final String M1(long j, @NotNull r95 r95Var, int i) {
        c25.p(r95Var, "unit");
        if (i >= 0) {
            double w1 = w1(j, r95Var);
            if (Double.isInfinite(w1)) {
                return String.valueOf(w1);
            }
            return p95.b(w1, i55.u(i, 12)) + u95.h(r95Var);
        }
        throw new IllegalArgumentException(wo1.l("decimals must be not negative, but was ", i).toString());
    }

    @np4
    public static /* synthetic */ void N() {
    }

    public static final int O(long j) {
        if (w0(j)) {
            return 0;
        }
        return (int) (K(j) % 60);
    }

    @np4
    public static /* synthetic */ void P() {
    }

    public static final int Q(long j) {
        if (w0(j)) {
            return 0;
        }
        return (int) (Y(j) ? q95.f(V(j) % 1000) : V(j) % 1000000000);
    }

    public static /* synthetic */ String Q1(long j, r95 r95Var, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return M1(j, r95Var, i);
    }

    @np4
    public static /* synthetic */ void R() {
    }

    public static final int S(long j) {
        if (w0(j)) {
            return 0;
        }
        return (int) (M(j) % 60);
    }

    private static final r95 T(long j) {
        return Z(j) ? r95.NANOSECONDS : r95.MILLISECONDS;
    }

    public static final long T1(long j) {
        return q95.a(-V(j), ((int) j) & 1);
    }

    private static final int U(long j) {
        return ((int) j) & 1;
    }

    private static final long V(long j) {
        return j >> 1;
    }

    public static int W(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static final boolean X(long j) {
        return !w0(j);
    }

    public static final boolean X0(long j) {
        return j > 0;
    }

    private static final boolean Y(long j) {
        return (((int) j) & 1) == 1;
    }

    public static final long Y0(long j, long j2) {
        return a1(j, T1(j2));
    }

    private static final boolean Z(long j) {
        return (((int) j) & 1) == 0;
    }

    public static final long a1(long j, long j2) {
        if (w0(j)) {
            if (X(j2) || (j2 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        } else if (w0(j2)) {
            return j2;
        } else {
            if ((((int) j) & 1) == (((int) j2) & 1)) {
                long V = V(j) + V(j2);
                if (Z(j)) {
                    return q95.e(V);
                }
                return q95.c(V);
            } else if (Y(j)) {
                return d(j, V(j), V(j2));
            } else {
                return d(j, V(j2), V(j));
            }
        }
    }

    public static final long c1(long j, double d) {
        int I0 = a45.I0(d);
        if (((double) I0) == d) {
            return d1(j, I0);
        }
        r95 T = T(j);
        return q95.l0(w1(j, T) * d, T);
    }

    private static final long d(long j, long j2, long j3) {
        long g = q95.g(j3);
        long j4 = j2 + g;
        if (new f55(-4611686018426L, 4611686018426L).o(j4)) {
            return q95.d(q95.f(j4) + (j3 - q95.f(g)));
        }
        return q95.b(i55.D(j4, -4611686018427387903L, q95.c));
    }

    public static final long d1(long j, int i) {
        if (w0(j)) {
            if (i != 0) {
                return i > 0 ? j : T1(j);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        } else if (i == 0) {
            return t;
        } else {
            long V = V(j);
            long j2 = i;
            long j3 = V * j2;
            if (Z(j)) {
                if (new f55(-2147483647L, TTL.MAX_VALUE).o(V)) {
                    return q95.d(j3);
                }
                if (j3 / j2 == V) {
                    return q95.e(j3);
                }
                long g = q95.g(V);
                long j4 = g * j2;
                long g2 = q95.g((V - q95.f(g)) * j2) + j4;
                if (j4 / j2 != g || (g2 ^ j4) < 0) {
                    return a45.S(i) * a45.T(V) > 0 ? u : v;
                }
                return q95.b(i55.E(g2, new f55(-4611686018427387903L, q95.c)));
            } else if (j3 / j2 == V) {
                return q95.b(i55.E(j3, new f55(-4611686018427387903L, q95.c)));
            } else {
                return a45.S(i) * a45.T(V) > 0 ? u : v;
            }
        }
    }

    private static final void e(long j, StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String T3 = c95.T3(String.valueOf(i2), i3, '0');
            int i4 = -1;
            int length = T3.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (T3.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (!z && i6 < 3) {
                sb.append((CharSequence) T3, 0, i6);
                c25.o(sb, "this.append(value, startIndex, endIndex)");
            } else {
                sb.append((CharSequence) T3, 0, ((i6 + 2) / 3) * 3);
                c25.o(sb, "this.append(value, startIndex, endIndex)");
            }
        }
        sb.append(str);
    }

    public static final /* synthetic */ o95 f(long j) {
        return new o95(j);
    }

    public static int h(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return c25.u(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return x0(j) ? -i : i;
    }

    public static long i(long j) {
        if (p95.d()) {
            if (Z(j)) {
                if (!new f55(-4611686018426999999L, q95.b).o(V(j))) {
                    throw new AssertionError(V(j) + " ns is out of nanoseconds range");
                }
            } else if (new f55(-4611686018427387903L, q95.c).o(V(j))) {
                if (new f55(-4611686018426L, 4611686018426L).o(V(j))) {
                    throw new AssertionError(V(j) + " ms is denormalized");
                }
            } else {
                throw new AssertionError(V(j) + " ms is out of milliseconds range");
            }
        }
        return j;
    }

    public static final double j(long j, long j2) {
        r95 r95Var = (r95) xu4.O(T(j), T(j2));
        return w1(j, r95Var) / w1(j2, r95Var);
    }

    public static final long k(long j, double d) {
        int I0 = a45.I0(d);
        if ((((double) I0) == d) && I0 != 0) {
            return l(j, I0);
        }
        r95 T = T(j);
        return q95.l0(w1(j, T) / d, T);
    }

    public static final long l(long j, int i) {
        if (i == 0) {
            if (X0(j)) {
                return u;
            }
            if (x0(j)) {
                return v;
            }
            throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
        } else if (Z(j)) {
            return q95.d(V(j) / i);
        } else {
            if (w0(j)) {
                return d1(j, a45.S(i));
            }
            long j2 = i;
            long V = V(j) / j2;
            if (new f55(-4611686018426L, 4611686018426L).o(V)) {
                return q95.d(q95.f(V) + (q95.f(V(j) - (V * j2)) / j2));
            }
            return q95.b(V);
        }
    }

    public static boolean m(long j, Object obj) {
        return (obj instanceof o95) && j == ((o95) obj).c2();
    }

    public static final boolean n(long j, long j2) {
        return j == j2;
    }

    public static final <T> T n1(long j, @NotNull j05<? super Long, ? super Integer, ? extends T> j05Var) {
        c25.p(j05Var, "action");
        return j05Var.w3(Long.valueOf(M(j)), Integer.valueOf(Q(j)));
    }

    public static final long o(long j) {
        return x0(j) ? T1(j) : j;
    }

    public static final <T> T o1(long j, @NotNull k05<? super Long, ? super Integer, ? super Integer, ? extends T> k05Var) {
        c25.p(k05Var, "action");
        return k05Var.I(Long.valueOf(K(j)), Integer.valueOf(S(j)), Integer.valueOf(Q(j)));
    }

    @np4
    public static /* synthetic */ void p() {
    }

    public static final <T> T p1(long j, @NotNull l05<? super Long, ? super Integer, ? super Integer, ? super Integer, ? extends T> l05Var) {
        c25.p(l05Var, "action");
        return l05Var.Z(Long.valueOf(H(j)), Integer.valueOf(O(j)), Integer.valueOf(S(j)), Integer.valueOf(Q(j)));
    }

    public static final int q(long j) {
        if (w0(j)) {
            return 0;
        }
        return (int) (H(j) % 24);
    }

    @v95
    @xn4(message = "Use inWholeDays property instead or convert toDouble(DAYS) if a double value is required.", replaceWith = @op4(expression = "toDouble(DurationUnit.DAYS)", imports = {}))
    public static /* synthetic */ void r() {
    }

    public static final double s(long j) {
        return w1(j, r95.DAYS);
    }

    @v95
    @xn4(message = "Use inWholeHours property instead or convert toDouble(HOURS) if a double value is required.", replaceWith = @op4(expression = "toDouble(DurationUnit.HOURS)", imports = {}))
    public static /* synthetic */ void t() {
    }

    public static final <T> T t1(long j, @NotNull m05<? super Long, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> m05Var) {
        c25.p(m05Var, "action");
        return m05Var.E3(Long.valueOf(G(j)), Integer.valueOf(q(j)), Integer.valueOf(O(j)), Integer.valueOf(S(j)), Integer.valueOf(Q(j)));
    }

    public static final double u(long j) {
        return w1(j, r95.HOURS);
    }

    @v95
    @xn4(message = "Use inWholeMicroseconds property instead or convert toDouble(MICROSECONDS) if a double value is required.", replaceWith = @op4(expression = "toDouble(DurationUnit.MICROSECONDS)", imports = {}))
    public static /* synthetic */ void v() {
    }

    public static final double w(long j) {
        return w1(j, r95.MICROSECONDS);
    }

    public static final boolean w0(long j) {
        return j == u || j == v;
    }

    public static final double w1(long j, @NotNull r95 r95Var) {
        c25.p(r95Var, "unit");
        if (j == u) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == v) {
            return Double.NEGATIVE_INFINITY;
        }
        return t95.a(V(j), T(j), r95Var);
    }

    @v95
    @xn4(message = "Use inWholeMilliseconds property instead or convert toDouble(MILLISECONDS) if a double value is required.", replaceWith = @op4(expression = "toDouble(DurationUnit.MILLISECONDS)", imports = {}))
    public static /* synthetic */ void x() {
    }

    public static final boolean x0(long j) {
        return j < 0;
    }

    public static final double y(long j) {
        return w1(j, r95.MILLISECONDS);
    }

    @v95
    @xn4(message = "Use inWholeMinutes property instead or convert toDouble(MINUTES) if a double value is required.", replaceWith = @op4(expression = "toDouble(DurationUnit.MINUTES)", imports = {}))
    public static /* synthetic */ void z() {
    }

    public final /* synthetic */ long c2() {
        return this.w;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(o95 o95Var) {
        return g(o95Var.c2());
    }

    public boolean equals(Object obj) {
        return m(this.w, obj);
    }

    public int g(long j) {
        return h(this.w, j);
    }

    public int hashCode() {
        return W(this.w);
    }

    @NotNull
    public String toString() {
        return L1(this.w);
    }
}