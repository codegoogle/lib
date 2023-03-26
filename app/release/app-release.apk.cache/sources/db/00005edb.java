package com.p7700g.p99005;

import com.anythink.core.api.ATAdConst;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;

/* compiled from: _UArraysJvm.kt */
@vo4(d1 = {"\u0000h\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\n0\u0001*\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001*\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a2\u0010\u0012\u001a\u00020\u0013*\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a2\u0010\u0012\u001a\u00020\u0013*\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a2\u0010\u0012\u001a\u00020\u0013*\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a2\u0010\u0012\u001a\u00020\u0013*\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001f\u0010\u001f\u001a\u00020\u0002*\u00020\u00032\u0006\u0010 \u001a\u00020\u0013H\u0087\bø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a\u001f\u0010\u001f\u001a\u00020\u0006*\u00020\u00072\u0006\u0010 \u001a\u00020\u0013H\u0087\bø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u001f\u0010\u001f\u001a\u00020\n*\u00020\u000b2\u0006\u0010 \u001a\u00020\u0013H\u0087\bø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a\u001f\u0010\u001f\u001a\u00020\u000e*\u00020\u000f2\u0006\u0010 \u001a\u00020\u0013H\u0087\bø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a\u0018\u0010)\u001a\u0004\u0018\u00010\u0002*\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a\u0018\u0010)\u001a\u0004\u0018\u00010\u0006*\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001a\u0018\u0010)\u001a\u0004\u0018\u00010\n*\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b.\u0010/\u001a\u0018\u0010)\u001a\u0004\u0018\u00010\u000e*\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a@\u00102\u001a\u0004\u0018\u00010\u0002\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u00032\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b7\u00108\u001a@\u00102\u001a\u0004\u0018\u00010\u0006\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u00072\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a@\u00102\u001a\u0004\u0018\u00010\n\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u000b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001a@\u00102\u001a\u0004\u0018\u00010\u000e\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u000f2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b=\u0010>\u001a4\u0010?\u001a\u0004\u0018\u00010\u0002*\u00020\u00032\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00020Aj\n\u0012\u0006\b\u0000\u0012\u00020\u0002`BH\u0007ø\u0001\u0000¢\u0006\u0004\bC\u0010D\u001a4\u0010?\u001a\u0004\u0018\u00010\u0006*\u00020\u00072\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00060Aj\n\u0012\u0006\b\u0000\u0012\u00020\u0006`BH\u0007ø\u0001\u0000¢\u0006\u0004\bE\u0010F\u001a4\u0010?\u001a\u0004\u0018\u00010\n*\u00020\u000b2\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\n0Aj\n\u0012\u0006\b\u0000\u0012\u00020\n`BH\u0007ø\u0001\u0000¢\u0006\u0004\bG\u0010H\u001a4\u0010?\u001a\u0004\u0018\u00010\u000e*\u00020\u000f2\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u000e0Aj\n\u0012\u0006\b\u0000\u0012\u00020\u000e`BH\u0007ø\u0001\u0000¢\u0006\u0004\bI\u0010J\u001a\u0018\u0010K\u001a\u0004\u0018\u00010\u0002*\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\bL\u0010+\u001a\u0018\u0010K\u001a\u0004\u0018\u00010\u0006*\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\bM\u0010-\u001a\u0018\u0010K\u001a\u0004\u0018\u00010\n*\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\bN\u0010/\u001a\u0018\u0010K\u001a\u0004\u0018\u00010\u000e*\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\bO\u00101\u001a@\u0010P\u001a\u0004\u0018\u00010\u0002\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u00032\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bQ\u00108\u001a@\u0010P\u001a\u0004\u0018\u00010\u0006\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u00072\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bR\u0010:\u001a@\u0010P\u001a\u0004\u0018\u00010\n\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u000b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bS\u0010<\u001a@\u0010P\u001a\u0004\u0018\u00010\u000e\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u000f2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bT\u0010>\u001a4\u0010U\u001a\u0004\u0018\u00010\u0002*\u00020\u00032\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00020Aj\n\u0012\u0006\b\u0000\u0012\u00020\u0002`BH\u0007ø\u0001\u0000¢\u0006\u0004\bV\u0010D\u001a4\u0010U\u001a\u0004\u0018\u00010\u0006*\u00020\u00072\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00060Aj\n\u0012\u0006\b\u0000\u0012\u00020\u0006`BH\u0007ø\u0001\u0000¢\u0006\u0004\bW\u0010F\u001a4\u0010U\u001a\u0004\u0018\u00010\n*\u00020\u000b2\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\n0Aj\n\u0012\u0006\b\u0000\u0012\u00020\n`BH\u0007ø\u0001\u0000¢\u0006\u0004\bX\u0010H\u001a4\u0010U\u001a\u0004\u0018\u00010\u000e*\u00020\u000f2\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u000e0Aj\n\u0012\u0006\b\u0000\u0012\u00020\u000e`BH\u0007ø\u0001\u0000¢\u0006\u0004\bY\u0010J\u001a.\u0010Z\u001a\u00020[*\u00020\u00032\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020[06H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\\\u0010]\u001a.\u0010Z\u001a\u00020^*\u00020\u00032\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020^06H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b_\u0010`\u001a.\u0010Z\u001a\u00020[*\u00020\u00072\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020[06H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\\\u0010a\u001a.\u0010Z\u001a\u00020^*\u00020\u00072\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020^06H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b_\u0010b\u001a.\u0010Z\u001a\u00020[*\u00020\u000b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020[06H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\\\u0010c\u001a.\u0010Z\u001a\u00020^*\u00020\u000b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020^06H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b_\u0010d\u001a.\u0010Z\u001a\u00020[*\u00020\u000f2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020[06H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\\\u0010e\u001a.\u0010Z\u001a\u00020^*\u00020\u000f2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020^06H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b_\u0010f\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006g"}, d2 = {"asList", "", "Lkotlin/UByte;", "Lkotlin/UByteArray;", "asList-GBYM_sE", "([B)Ljava/util/List;", "Lkotlin/UInt;", "Lkotlin/UIntArray;", "asList--ajY-9A", "([I)Ljava/util/List;", "Lkotlin/ULong;", "Lkotlin/ULongArray;", "asList-QwZRm1k", "([J)Ljava/util/List;", "Lkotlin/UShort;", "Lkotlin/UShortArray;", "asList-rL5Bavg", "([S)Ljava/util/List;", "binarySearch", "", "element", "fromIndex", "toIndex", "binarySearch-WpHrYlw", "([BBII)I", "binarySearch-2fe2U9s", "([IIII)I", "binarySearch-K6DWlUc", "([JJII)I", "binarySearch-EtDCXyQ", "([SSII)I", "elementAt", la1.l, "elementAt-PpDY95g", "([BI)B", "elementAt-qFRl0hI", "([II)I", "elementAt-r7IrZao", "([JI)J", "elementAt-nggk6HY", "([SI)S", "max", "max-GBYM_sE", "([B)Lkotlin/UByte;", "max--ajY-9A", "([I)Lkotlin/UInt;", "max-QwZRm1k", "([J)Lkotlin/ULong;", "max-rL5Bavg", "([S)Lkotlin/UShort;", "maxBy", "R", "", "selector", "Lkotlin/Function1;", "maxBy-JOV_ifY", "([BLkotlin/jvm/functions/Function1;)Lkotlin/UByte;", "maxBy-jgv0xPQ", "([ILkotlin/jvm/functions/Function1;)Lkotlin/UInt;", "maxBy-MShoTSo", "([JLkotlin/jvm/functions/Function1;)Lkotlin/ULong;", "maxBy-xTcfx_M", "([SLkotlin/jvm/functions/Function1;)Lkotlin/UShort;", "maxWith", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "maxWith-XMRcp5o", "([BLjava/util/Comparator;)Lkotlin/UByte;", "maxWith-YmdZ_VM", "([ILjava/util/Comparator;)Lkotlin/UInt;", "maxWith-zrEWJaI", "([JLjava/util/Comparator;)Lkotlin/ULong;", "maxWith-eOHTfZs", "([SLjava/util/Comparator;)Lkotlin/UShort;", "min", "min-GBYM_sE", "min--ajY-9A", "min-QwZRm1k", "min-rL5Bavg", "minBy", "minBy-JOV_ifY", "minBy-jgv0xPQ", "minBy-MShoTSo", "minBy-xTcfx_M", "minWith", "minWith-XMRcp5o", "minWith-YmdZ_VM", "minWith-zrEWJaI", "minWith-eOHTfZs", "sumOf", "Ljava/math/BigDecimal;", "sumOfBigDecimal", "([BLkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "Ljava/math/BigInteger;", "sumOfBigInteger", "([BLkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "([ILkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "([ILkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "([JLkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "([JLkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "([SLkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "([SLkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, pn = "kotlin.collections", xi = 49, xs = "kotlin/collections/unsigned/UArraysKt")
/* loaded from: classes3.dex */
public class tu4 {

    /* compiled from: _UArraysJvm.kt */
    @vo4(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u001b\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0006H\u0096\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0011J\b\u0010\u0014\u001a\u00020\nH\u0016J\u001a\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0017"}, d2 = {"kotlin/collections/unsigned/UArraysKt___UArraysJvmKt$asList$1", "Lkotlin/collections/AbstractList;", "Lkotlin/UInt;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "", "getSize", "()I", "contains", "", "element", "contains-WZ4Q5Ns", "(I)Z", "get", la1.l, "get-pVg5ArA", "(I)I", "indexOf", "indexOf-WZ4Q5Ns", "isEmpty", "lastIndexOf", "lastIndexOf-WZ4Q5Ns", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends nr4<jq4> implements RandomAccess {
        public final /* synthetic */ int[] t;

        public a(int[] iArr) {
            this.t = iArr;
        }

        @Override // com.p7700g.p99005.nr4, com.p7700g.p99005.lr4
        public int a() {
            return kq4.t(this.t);
        }

        public boolean b(int i) {
            return kq4.h(this.t, i);
        }

        public int c(int i) {
            return kq4.o(this.t, i);
        }

        @Override // com.p7700g.p99005.lr4, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof jq4) {
                return b(((jq4) obj).n1());
            }
            return false;
        }

        public int d(int i) {
            return as4.hg(this.t, i);
        }

        public int e(int i) {
            return as4.li(this.t, i);
        }

        @Override // com.p7700g.p99005.nr4, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i) {
            return jq4.b(c(i));
        }

        @Override // com.p7700g.p99005.nr4, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof jq4) {
                return d(((jq4) obj).n1());
            }
            return -1;
        }

        @Override // com.p7700g.p99005.lr4, java.util.Collection
        public boolean isEmpty() {
            return kq4.y(this.t);
        }

        @Override // com.p7700g.p99005.nr4, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof jq4) {
                return e(((jq4) obj).n1());
            }
            return -1;
        }
    }

    /* compiled from: _UArraysJvm.kt */
    @vo4(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u001b\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0006H\u0096\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0015\u001a\u00020\nH\u0016J\u001a\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0018"}, d2 = {"kotlin/collections/unsigned/UArraysKt___UArraysJvmKt$asList$2", "Lkotlin/collections/AbstractList;", "Lkotlin/ULong;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "", "getSize", "()I", "contains", "", "element", "contains-VKZWuLQ", "(J)Z", "get", la1.l, "get-s-VKNKU", "(I)J", "indexOf", "indexOf-VKZWuLQ", "(J)I", "isEmpty", "lastIndexOf", "lastIndexOf-VKZWuLQ", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends nr4<nq4> implements RandomAccess {
        public final /* synthetic */ long[] t;

        public b(long[] jArr) {
            this.t = jArr;
        }

        @Override // com.p7700g.p99005.nr4, com.p7700g.p99005.lr4
        public int a() {
            return oq4.t(this.t);
        }

        public boolean b(long j) {
            return oq4.h(this.t, j);
        }

        public long c(int i) {
            return oq4.o(this.t, i);
        }

        @Override // com.p7700g.p99005.lr4, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof nq4) {
                return b(((nq4) obj).n1());
            }
            return false;
        }

        public int d(long j) {
            return as4.ig(this.t, j);
        }

        public int e(long j) {
            return as4.mi(this.t, j);
        }

        @Override // com.p7700g.p99005.nr4, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i) {
            return nq4.b(c(i));
        }

        @Override // com.p7700g.p99005.nr4, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof nq4) {
                return d(((nq4) obj).n1());
            }
            return -1;
        }

        @Override // com.p7700g.p99005.lr4, java.util.Collection
        public boolean isEmpty() {
            return oq4.y(this.t);
        }

        @Override // com.p7700g.p99005.nr4, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof nq4) {
                return e(((nq4) obj).n1());
            }
            return -1;
        }
    }

    /* compiled from: _UArraysJvm.kt */
    @vo4(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u001b\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0006H\u0096\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0015\u001a\u00020\nH\u0016J\u001a\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0018"}, d2 = {"kotlin/collections/unsigned/UArraysKt___UArraysJvmKt$asList$3", "Lkotlin/collections/AbstractList;", "Lkotlin/UByte;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "", "getSize", "()I", "contains", "", "element", "contains-7apg3OU", "(B)Z", "get", la1.l, "get-w2LRezQ", "(I)B", "indexOf", "indexOf-7apg3OU", "(B)I", "isEmpty", "lastIndexOf", "lastIndexOf-7apg3OU", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c extends nr4<fq4> implements RandomAccess {
        public final /* synthetic */ byte[] t;

        public c(byte[] bArr) {
            this.t = bArr;
        }

        @Override // com.p7700g.p99005.nr4, com.p7700g.p99005.lr4
        public int a() {
            return gq4.t(this.t);
        }

        public boolean b(byte b) {
            return gq4.h(this.t, b);
        }

        public byte c(int i) {
            return gq4.o(this.t, i);
        }

        @Override // com.p7700g.p99005.lr4, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof fq4) {
                return b(((fq4) obj).c1());
            }
            return false;
        }

        public int d(byte b) {
            return as4.dg(this.t, b);
        }

        public int e(byte b) {
            return as4.hi(this.t, b);
        }

        @Override // com.p7700g.p99005.nr4, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i) {
            return fq4.b(c(i));
        }

        @Override // com.p7700g.p99005.nr4, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof fq4) {
                return d(((fq4) obj).c1());
            }
            return -1;
        }

        @Override // com.p7700g.p99005.lr4, java.util.Collection
        public boolean isEmpty() {
            return gq4.y(this.t);
        }

        @Override // com.p7700g.p99005.nr4, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof fq4) {
                return e(((fq4) obj).c1());
            }
            return -1;
        }
    }

    /* compiled from: _UArraysJvm.kt */
    @vo4(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u001b\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0006H\u0096\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0015\u001a\u00020\nH\u0016J\u001a\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0018"}, d2 = {"kotlin/collections/unsigned/UArraysKt___UArraysJvmKt$asList$4", "Lkotlin/collections/AbstractList;", "Lkotlin/UShort;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "", "getSize", "()I", "contains", "", "element", "contains-xj2QHRw", "(S)Z", "get", la1.l, "get-Mh2AYeg", "(I)S", "indexOf", "indexOf-xj2QHRw", "(S)I", "isEmpty", "lastIndexOf", "lastIndexOf-xj2QHRw", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d extends nr4<tq4> implements RandomAccess {
        public final /* synthetic */ short[] t;

        public d(short[] sArr) {
            this.t = sArr;
        }

        @Override // com.p7700g.p99005.nr4, com.p7700g.p99005.lr4
        public int a() {
            return uq4.t(this.t);
        }

        public boolean b(short s) {
            return uq4.h(this.t, s);
        }

        public short c(int i) {
            return uq4.o(this.t, i);
        }

        @Override // com.p7700g.p99005.lr4, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof tq4) {
                return b(((tq4) obj).c1());
            }
            return false;
        }

        public int d(short s) {
            return as4.kg(this.t, s);
        }

        public int e(short s) {
            return as4.oi(this.t, s);
        }

        @Override // com.p7700g.p99005.nr4, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i) {
            return tq4.b(c(i));
        }

        @Override // com.p7700g.p99005.nr4, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof tq4) {
                return d(((tq4) obj).c1());
            }
            return -1;
        }

        @Override // com.p7700g.p99005.lr4, java.util.Collection
        public boolean isEmpty() {
            return uq4.y(this.t);
        }

        @Override // com.p7700g.p99005.nr4, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof tq4) {
                return e(((tq4) obj).c1());
            }
            return -1;
        }
    }

    @go4
    @yn4(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @xn4(message = "Use maxWithOrNull instead.", replaceWith = @op4(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @tp4(version = "1.3")
    public static final /* synthetic */ tq4 A(short[] sArr, Comparator comparator) {
        c25.p(sArr, "$this$maxWith");
        c25.p(comparator, "comparator");
        return uu4.M6(sArr, comparator);
    }

    @go4
    @yn4(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @xn4(message = "Use maxWithOrNull instead.", replaceWith = @op4(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @tp4(version = "1.3")
    public static final /* synthetic */ nq4 B(long[] jArr, Comparator comparator) {
        c25.p(jArr, "$this$maxWith");
        c25.p(comparator, "comparator");
        return uu4.N6(jArr, comparator);
    }

    @go4
    @yn4(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @xn4(message = "Use minByOrNull instead.", replaceWith = @op4(expression = "this.minByOrNull(selector)", imports = {}))
    @dx4
    @tp4(version = "1.3")
    private static final /* synthetic */ <R extends Comparable<? super R>> fq4 G(byte[] bArr, f05<? super fq4, ? extends R> f05Var) {
        c25.p(bArr, "$this$minBy");
        c25.p(f05Var, "selector");
        if (gq4.y(bArr)) {
            return null;
        }
        byte o = gq4.o(bArr, 0);
        int Re = as4.Re(bArr);
        if (Re != 0) {
            R M = f05Var.M(fq4.b(o));
            ft4 W = wo1.W(1, Re);
            while (W.hasNext()) {
                byte o2 = gq4.o(bArr, W.b());
                R M2 = f05Var.M(fq4.b(o2));
                if (M.compareTo(M2) > 0) {
                    o = o2;
                    M = M2;
                }
            }
        }
        return fq4.b(o);
    }

    @go4
    @yn4(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @xn4(message = "Use minByOrNull instead.", replaceWith = @op4(expression = "this.minByOrNull(selector)", imports = {}))
    @dx4
    @tp4(version = "1.3")
    private static final /* synthetic */ <R extends Comparable<? super R>> nq4 H(long[] jArr, f05<? super nq4, ? extends R> f05Var) {
        c25.p(jArr, "$this$minBy");
        c25.p(f05Var, "selector");
        if (oq4.y(jArr)) {
            return null;
        }
        long o = oq4.o(jArr, 0);
        int We = as4.We(jArr);
        if (We != 0) {
            R M = f05Var.M(nq4.b(o));
            ft4 W = wo1.W(1, We);
            while (W.hasNext()) {
                long o2 = oq4.o(jArr, W.b());
                R M2 = f05Var.M(nq4.b(o2));
                if (M.compareTo(M2) > 0) {
                    o = o2;
                    M = M2;
                }
            }
        }
        return nq4.b(o);
    }

    @go4
    @yn4(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @xn4(message = "Use minByOrNull instead.", replaceWith = @op4(expression = "this.minByOrNull(selector)", imports = {}))
    @dx4
    @tp4(version = "1.3")
    private static final /* synthetic */ <R extends Comparable<? super R>> jq4 I(int[] iArr, f05<? super jq4, ? extends R> f05Var) {
        c25.p(iArr, "$this$minBy");
        c25.p(f05Var, "selector");
        if (kq4.y(iArr)) {
            return null;
        }
        int o = kq4.o(iArr, 0);
        int Ve = as4.Ve(iArr);
        if (Ve != 0) {
            R M = f05Var.M(jq4.b(o));
            ft4 W = wo1.W(1, Ve);
            while (W.hasNext()) {
                int o2 = kq4.o(iArr, W.b());
                R M2 = f05Var.M(jq4.b(o2));
                if (M.compareTo(M2) > 0) {
                    o = o2;
                    M = M2;
                }
            }
        }
        return jq4.b(o);
    }

    @go4
    @yn4(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @xn4(message = "Use minByOrNull instead.", replaceWith = @op4(expression = "this.minByOrNull(selector)", imports = {}))
    @dx4
    @tp4(version = "1.3")
    private static final /* synthetic */ <R extends Comparable<? super R>> tq4 J(short[] sArr, f05<? super tq4, ? extends R> f05Var) {
        c25.p(sArr, "$this$minBy");
        c25.p(f05Var, "selector");
        if (uq4.y(sArr)) {
            return null;
        }
        short o = uq4.o(sArr, 0);
        int Ye = as4.Ye(sArr);
        if (Ye != 0) {
            R M = f05Var.M(tq4.b(o));
            ft4 W = wo1.W(1, Ye);
            while (W.hasNext()) {
                short o2 = uq4.o(sArr, W.b());
                R M2 = f05Var.M(tq4.b(o2));
                if (M.compareTo(M2) > 0) {
                    o = o2;
                    M = M2;
                }
            }
        }
        return tq4.b(o);
    }

    @go4
    @yn4(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @xn4(message = "Use minWithOrNull instead.", replaceWith = @op4(expression = "this.minWithOrNull(comparator)", imports = {}))
    @tp4(version = "1.3")
    public static final /* synthetic */ fq4 K(byte[] bArr, Comparator comparator) {
        c25.p(bArr, "$this$minWith");
        c25.p(comparator, "comparator");
        return uu4.O7(bArr, comparator);
    }

    @go4
    @yn4(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @xn4(message = "Use minWithOrNull instead.", replaceWith = @op4(expression = "this.minWithOrNull(comparator)", imports = {}))
    @tp4(version = "1.3")
    public static final /* synthetic */ jq4 L(int[] iArr, Comparator comparator) {
        c25.p(iArr, "$this$minWith");
        c25.p(comparator, "comparator");
        return uu4.P7(iArr, comparator);
    }

    @go4
    @yn4(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @xn4(message = "Use minWithOrNull instead.", replaceWith = @op4(expression = "this.minWithOrNull(comparator)", imports = {}))
    @tp4(version = "1.3")
    public static final /* synthetic */ tq4 M(short[] sArr, Comparator comparator) {
        c25.p(sArr, "$this$minWith");
        c25.p(comparator, "comparator");
        return uu4.Q7(sArr, comparator);
    }

    @go4
    @yn4(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @xn4(message = "Use minWithOrNull instead.", replaceWith = @op4(expression = "this.minWithOrNull(comparator)", imports = {}))
    @tp4(version = "1.3")
    public static final /* synthetic */ nq4 N(long[] jArr, Comparator comparator) {
        c25.p(jArr, "$this$minWith");
        c25.p(comparator, "comparator");
        return uu4.R7(jArr, comparator);
    }

    @go4
    @fz4(name = "sumOfBigDecimal")
    @dx4
    @gp4
    @tp4(version = "1.4")
    private static final BigDecimal O(byte[] bArr, f05<? super fq4, ? extends BigDecimal> f05Var) {
        c25.p(bArr, "$this$sumOf");
        c25.p(f05Var, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        c25.o(valueOf, "valueOf(this.toLong())");
        int t = gq4.t(bArr);
        for (int i = 0; i < t; i++) {
            valueOf = valueOf.add((BigDecimal) wo1.f(bArr, i, f05Var));
            c25.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @go4
    @fz4(name = "sumOfBigDecimal")
    @dx4
    @gp4
    @tp4(version = "1.4")
    private static final BigDecimal P(int[] iArr, f05<? super jq4, ? extends BigDecimal> f05Var) {
        c25.p(iArr, "$this$sumOf");
        c25.p(f05Var, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        c25.o(valueOf, "valueOf(this.toLong())");
        int t = kq4.t(iArr);
        for (int i = 0; i < t; i++) {
            valueOf = valueOf.add((BigDecimal) wo1.g(iArr, i, f05Var));
            c25.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @go4
    @fz4(name = "sumOfBigDecimal")
    @dx4
    @gp4
    @tp4(version = "1.4")
    private static final BigDecimal Q(long[] jArr, f05<? super nq4, ? extends BigDecimal> f05Var) {
        c25.p(jArr, "$this$sumOf");
        c25.p(f05Var, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        c25.o(valueOf, "valueOf(this.toLong())");
        int t = oq4.t(jArr);
        for (int i = 0; i < t; i++) {
            valueOf = valueOf.add((BigDecimal) wo1.h(jArr, i, f05Var));
            c25.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @go4
    @fz4(name = "sumOfBigDecimal")
    @dx4
    @gp4
    @tp4(version = "1.4")
    private static final BigDecimal R(short[] sArr, f05<? super tq4, ? extends BigDecimal> f05Var) {
        c25.p(sArr, "$this$sumOf");
        c25.p(f05Var, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        c25.o(valueOf, "valueOf(this.toLong())");
        int t = uq4.t(sArr);
        for (int i = 0; i < t; i++) {
            valueOf = valueOf.add((BigDecimal) wo1.i(sArr, i, f05Var));
            c25.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @go4
    @fz4(name = "sumOfBigInteger")
    @dx4
    @gp4
    @tp4(version = "1.4")
    private static final BigInteger S(byte[] bArr, f05<? super fq4, ? extends BigInteger> f05Var) {
        c25.p(bArr, "$this$sumOf");
        c25.p(f05Var, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        c25.o(valueOf, "valueOf(this.toLong())");
        int t = gq4.t(bArr);
        for (int i = 0; i < t; i++) {
            valueOf = valueOf.add((BigInteger) wo1.f(bArr, i, f05Var));
            c25.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @go4
    @fz4(name = "sumOfBigInteger")
    @dx4
    @gp4
    @tp4(version = "1.4")
    private static final BigInteger T(int[] iArr, f05<? super jq4, ? extends BigInteger> f05Var) {
        c25.p(iArr, "$this$sumOf");
        c25.p(f05Var, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        c25.o(valueOf, "valueOf(this.toLong())");
        int t = kq4.t(iArr);
        for (int i = 0; i < t; i++) {
            valueOf = valueOf.add((BigInteger) wo1.g(iArr, i, f05Var));
            c25.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @go4
    @fz4(name = "sumOfBigInteger")
    @dx4
    @gp4
    @tp4(version = "1.4")
    private static final BigInteger U(long[] jArr, f05<? super nq4, ? extends BigInteger> f05Var) {
        c25.p(jArr, "$this$sumOf");
        c25.p(f05Var, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        c25.o(valueOf, "valueOf(this.toLong())");
        int t = oq4.t(jArr);
        for (int i = 0; i < t; i++) {
            valueOf = valueOf.add((BigInteger) wo1.h(jArr, i, f05Var));
            c25.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @go4
    @fz4(name = "sumOfBigInteger")
    @dx4
    @gp4
    @tp4(version = "1.4")
    private static final BigInteger V(short[] sArr, f05<? super tq4, ? extends BigInteger> f05Var) {
        c25.p(sArr, "$this$sumOf");
        c25.p(f05Var, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        c25.o(valueOf, "valueOf(this.toLong())");
        int t = uq4.t(sArr);
        for (int i = 0; i < t; i++) {
            valueOf = valueOf.add((BigInteger) wo1.i(sArr, i, f05Var));
            c25.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @go4
    @tp4(version = "1.3")
    @NotNull
    public static final List<jq4> a(@NotNull int[] iArr) {
        c25.p(iArr, "$this$asList");
        return new a(iArr);
    }

    @go4
    @tp4(version = "1.3")
    @NotNull
    public static final List<fq4> b(@NotNull byte[] bArr) {
        c25.p(bArr, "$this$asList");
        return new c(bArr);
    }

    @go4
    @tp4(version = "1.3")
    @NotNull
    public static final List<nq4> c(@NotNull long[] jArr) {
        c25.p(jArr, "$this$asList");
        return new b(jArr);
    }

    @go4
    @tp4(version = "1.3")
    @NotNull
    public static final List<tq4> d(@NotNull short[] sArr) {
        c25.p(sArr, "$this$asList");
        return new d(sArr);
    }

    @go4
    @tp4(version = "1.3")
    public static final int e(@NotNull int[] iArr, int i, int i2, int i3) {
        c25.p(iArr, "$this$binarySearch");
        nr4.s.d(i2, i3, kq4.t(iArr));
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int c2 = br4.c(iArr[i5], i);
            if (c2 < 0) {
                i2 = i5 + 1;
            } else if (c2 <= 0) {
                return i5;
            } else {
                i4 = i5 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static /* synthetic */ int f(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = kq4.t(iArr);
        }
        return e(iArr, i, i2, i3);
    }

    @go4
    @tp4(version = "1.3")
    public static final int g(@NotNull short[] sArr, short s, int i, int i2) {
        c25.p(sArr, "$this$binarySearch");
        nr4.s.d(i, i2, uq4.t(sArr));
        int i3 = s & tq4.u;
        int i4 = i2 - 1;
        while (i <= i4) {
            int i5 = (i + i4) >>> 1;
            int c2 = br4.c(sArr[i5], i3);
            if (c2 < 0) {
                i = i5 + 1;
            } else if (c2 <= 0) {
                return i5;
            } else {
                i4 = i5 - 1;
            }
        }
        return -(i + 1);
    }

    public static /* synthetic */ int h(short[] sArr, short s, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = uq4.t(sArr);
        }
        return g(sArr, s, i, i2);
    }

    @go4
    @tp4(version = "1.3")
    public static final int i(@NotNull long[] jArr, long j, int i, int i2) {
        c25.p(jArr, "$this$binarySearch");
        nr4.s.d(i, i2, oq4.t(jArr));
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int g = br4.g(jArr[i4], j);
            if (g < 0) {
                i = i4 + 1;
            } else if (g <= 0) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    public static /* synthetic */ int j(long[] jArr, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = oq4.t(jArr);
        }
        return i(jArr, j, i, i2);
    }

    @go4
    @tp4(version = "1.3")
    public static final int k(@NotNull byte[] bArr, byte b2, int i, int i2) {
        c25.p(bArr, "$this$binarySearch");
        nr4.s.d(i, i2, gq4.t(bArr));
        int i3 = b2 & 255;
        int i4 = i2 - 1;
        while (i <= i4) {
            int i5 = (i + i4) >>> 1;
            int c2 = br4.c(bArr[i5], i3);
            if (c2 < 0) {
                i = i5 + 1;
            } else if (c2 <= 0) {
                return i5;
            } else {
                i4 = i5 - 1;
            }
        }
        return -(i + 1);
    }

    public static /* synthetic */ int l(byte[] bArr, byte b2, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = gq4.t(bArr);
        }
        return k(bArr, b2, i, i2);
    }

    @go4
    @dx4
    @tp4(version = "1.3")
    private static final byte m(byte[] bArr, int i) {
        c25.p(bArr, "$this$elementAt");
        return gq4.o(bArr, i);
    }

    @go4
    @dx4
    @tp4(version = "1.3")
    private static final short n(short[] sArr, int i) {
        c25.p(sArr, "$this$elementAt");
        return uq4.o(sArr, i);
    }

    @go4
    @dx4
    @tp4(version = "1.3")
    private static final int o(int[] iArr, int i) {
        c25.p(iArr, "$this$elementAt");
        return kq4.o(iArr, i);
    }

    @go4
    @dx4
    @tp4(version = "1.3")
    private static final long p(long[] jArr, int i) {
        c25.p(jArr, "$this$elementAt");
        return oq4.o(jArr, i);
    }

    @go4
    @yn4(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @xn4(message = "Use maxByOrNull instead.", replaceWith = @op4(expression = "this.maxByOrNull(selector)", imports = {}))
    @dx4
    @tp4(version = "1.3")
    private static final /* synthetic */ <R extends Comparable<? super R>> fq4 u(byte[] bArr, f05<? super fq4, ? extends R> f05Var) {
        c25.p(bArr, "$this$maxBy");
        c25.p(f05Var, "selector");
        if (gq4.y(bArr)) {
            return null;
        }
        byte o = gq4.o(bArr, 0);
        int Re = as4.Re(bArr);
        if (Re != 0) {
            R M = f05Var.M(fq4.b(o));
            ft4 W = wo1.W(1, Re);
            while (W.hasNext()) {
                byte o2 = gq4.o(bArr, W.b());
                R M2 = f05Var.M(fq4.b(o2));
                if (M.compareTo(M2) < 0) {
                    o = o2;
                    M = M2;
                }
            }
        }
        return fq4.b(o);
    }

    @go4
    @yn4(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @xn4(message = "Use maxByOrNull instead.", replaceWith = @op4(expression = "this.maxByOrNull(selector)", imports = {}))
    @dx4
    @tp4(version = "1.3")
    private static final /* synthetic */ <R extends Comparable<? super R>> nq4 v(long[] jArr, f05<? super nq4, ? extends R> f05Var) {
        c25.p(jArr, "$this$maxBy");
        c25.p(f05Var, "selector");
        if (oq4.y(jArr)) {
            return null;
        }
        long o = oq4.o(jArr, 0);
        int We = as4.We(jArr);
        if (We != 0) {
            R M = f05Var.M(nq4.b(o));
            ft4 W = wo1.W(1, We);
            while (W.hasNext()) {
                long o2 = oq4.o(jArr, W.b());
                R M2 = f05Var.M(nq4.b(o2));
                if (M.compareTo(M2) < 0) {
                    o = o2;
                    M = M2;
                }
            }
        }
        return nq4.b(o);
    }

    @go4
    @yn4(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @xn4(message = "Use maxByOrNull instead.", replaceWith = @op4(expression = "this.maxByOrNull(selector)", imports = {}))
    @dx4
    @tp4(version = "1.3")
    private static final /* synthetic */ <R extends Comparable<? super R>> jq4 w(int[] iArr, f05<? super jq4, ? extends R> f05Var) {
        c25.p(iArr, "$this$maxBy");
        c25.p(f05Var, "selector");
        if (kq4.y(iArr)) {
            return null;
        }
        int o = kq4.o(iArr, 0);
        int Ve = as4.Ve(iArr);
        if (Ve != 0) {
            R M = f05Var.M(jq4.b(o));
            ft4 W = wo1.W(1, Ve);
            while (W.hasNext()) {
                int o2 = kq4.o(iArr, W.b());
                R M2 = f05Var.M(jq4.b(o2));
                if (M.compareTo(M2) < 0) {
                    o = o2;
                    M = M2;
                }
            }
        }
        return jq4.b(o);
    }

    @go4
    @yn4(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @xn4(message = "Use maxByOrNull instead.", replaceWith = @op4(expression = "this.maxByOrNull(selector)", imports = {}))
    @dx4
    @tp4(version = "1.3")
    private static final /* synthetic */ <R extends Comparable<? super R>> tq4 x(short[] sArr, f05<? super tq4, ? extends R> f05Var) {
        c25.p(sArr, "$this$maxBy");
        c25.p(f05Var, "selector");
        if (uq4.y(sArr)) {
            return null;
        }
        short o = uq4.o(sArr, 0);
        int Ye = as4.Ye(sArr);
        if (Ye != 0) {
            R M = f05Var.M(tq4.b(o));
            ft4 W = wo1.W(1, Ye);
            while (W.hasNext()) {
                short o2 = uq4.o(sArr, W.b());
                R M2 = f05Var.M(tq4.b(o2));
                if (M.compareTo(M2) < 0) {
                    o = o2;
                    M = M2;
                }
            }
        }
        return tq4.b(o);
    }

    @go4
    @yn4(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @xn4(message = "Use maxWithOrNull instead.", replaceWith = @op4(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @tp4(version = "1.3")
    public static final /* synthetic */ fq4 y(byte[] bArr, Comparator comparator) {
        c25.p(bArr, "$this$maxWith");
        c25.p(comparator, "comparator");
        return uu4.K6(bArr, comparator);
    }

    @go4
    @yn4(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @xn4(message = "Use maxWithOrNull instead.", replaceWith = @op4(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @tp4(version = "1.3")
    public static final /* synthetic */ jq4 z(int[] iArr, Comparator comparator) {
        c25.p(iArr, "$this$maxWith");
        c25.p(comparator, "comparator");
        return uu4.L6(iArr, comparator);
    }
}