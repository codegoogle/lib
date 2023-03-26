package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.google.android.gms.ads.RequestConfiguration;
import com.p7700g.p99005.rs2;
import com.p7700g.p99005.sv5;
import java.io.EOFException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Buffer.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0016\u001a7\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001aA\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0011*\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\f2\u001a\u0010\u0014\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\u0013H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a%\u0010\u001a\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a,\u0010\u001f\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\fH\u0080\b¢\u0006\u0004\b\u001f\u0010 \u001a\u0014\u0010!\u001a\u00020\f*\u00020\u000bH\u0080\b¢\u0006\u0004\b!\u0010\"\u001a\u0014\u0010$\u001a\u00020#*\u00020\u000bH\u0080\b¢\u0006\u0004\b$\u0010%\u001a\u0014\u0010'\u001a\u00020&*\u00020\u000bH\u0080\b¢\u0006\u0004\b'\u0010(\u001a\u0014\u0010)\u001a\u00020\u0002*\u00020\u000bH\u0080\b¢\u0006\u0004\b)\u0010*\u001a\u0014\u0010+\u001a\u00020\f*\u00020\u000bH\u0080\b¢\u0006\u0004\b+\u0010\"\u001a\u001c\u0010-\u001a\u00020#*\u00020\u000b2\u0006\u0010,\u001a\u00020\fH\u0080\b¢\u0006\u0004\b-\u0010.\u001a\u0014\u00100\u001a\u00020/*\u00020\u000bH\u0080\b¢\u0006\u0004\b0\u00101\u001a\u001c\u00102\u001a\u00020/*\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\fH\u0080\b¢\u0006\u0004\b2\u00103\u001a0\u00106\u001a\u00020\u000b*\u00020\u000b2\u0006\u00105\u001a\u0002042\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b6\u00107\u001a\u001c\u00109\u001a\u00020\u000b*\u00020\u000b2\u0006\u00108\u001a\u00020\fH\u0080\b¢\u0006\u0004\b9\u0010:\u001a\u001c\u0010;\u001a\u00020\u000b*\u00020\u000b2\u0006\u00108\u001a\u00020\fH\u0080\b¢\u0006\u0004\b;\u0010:\u001a\u001c\u0010=\u001a\u00020\u0000*\u00020\u000b2\u0006\u0010<\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b=\u0010>\u001a\u001c\u0010\u0011\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010?\u001a\u00020\u0004H\u0080\b¢\u0006\u0004\b\u0011\u0010@\u001a,\u0010A\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010?\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bA\u0010B\u001a\u0014\u0010C\u001a\u00020\u0004*\u00020\u000bH\u0080\b¢\u0006\u0004\bC\u0010D\u001a\u001c\u00108\u001a\u00020\u0004*\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\fH\u0080\b¢\u0006\u0004\b8\u0010E\u001a\u001c\u0010G\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010F\u001a\u00020\u0004H\u0080\b¢\u0006\u0004\bG\u0010H\u001a\u001c\u0010I\u001a\u00020/*\u00020\u000b2\u0006\u0010F\u001a\u00020\u0004H\u0080\b¢\u0006\u0004\bI\u0010J\u001a,\u0010K\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010F\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bK\u0010L\u001a\u0014\u0010M\u001a\u00020\f*\u00020\u000bH\u0080\b¢\u0006\u0004\bM\u0010\"\u001a\u0014\u0010N\u001a\u00020\f*\u00020\u000bH\u0080\b¢\u0006\u0004\bN\u0010\"\u001a\u0014\u0010O\u001a\u000204*\u00020\u000bH\u0080\b¢\u0006\u0004\bO\u0010P\u001a\u001c\u0010Q\u001a\u000204*\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\fH\u0080\b¢\u0006\u0004\bQ\u0010R\u001a\u001c\u0010S\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0080\b¢\u0006\u0004\bS\u0010T\u001a$\u0010U\u001a\u00020/*\u00020\u000b2\u0006\u0010F\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\fH\u0080\b¢\u0006\u0004\bU\u0010V\u001a\u001c\u0010X\u001a\u00020\f*\u00020\u000b2\u0006\u0010F\u001a\u00020WH\u0080\b¢\u0006\u0004\bX\u0010Y\u001a\u001c\u0010Z\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\fH\u0080\b¢\u0006\u0004\bZ\u0010\u0010\u001a\u0016\u0010[\u001a\u0004\u0018\u00010\u000e*\u00020\u000bH\u0080\b¢\u0006\u0004\b[\u0010\\\u001a\u001c\u0010^\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010]\u001a\u00020\fH\u0080\b¢\u0006\u0004\b^\u0010\u0010\u001a\u0014\u0010_\u001a\u00020\u0002*\u00020\u000bH\u0080\b¢\u0006\u0004\b_\u0010*\u001a,\u0010c\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010`\u001a\u00020\u000e2\u0006\u0010a\u001a\u00020\u00022\u0006\u0010b\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bc\u0010d\u001a\u001c\u0010f\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010e\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bf\u0010g\u001a\u001c\u0010i\u001a\u00020\f*\u00020\u000b2\u0006\u0010?\u001a\u00020hH\u0080\b¢\u0006\u0004\bi\u0010j\u001a$\u0010k\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010?\u001a\u00020h2\u0006\u0010\u001e\u001a\u00020\fH\u0080\b¢\u0006\u0004\bk\u0010l\u001a\u001c\u0010n\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010m\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bn\u0010g\u001a\u001c\u0010p\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010o\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bp\u0010g\u001a\u001c\u0010r\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010q\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\br\u0010g\u001a\u001c\u0010s\u001a\u00020\u000b*\u00020\u000b2\u0006\u00108\u001a\u00020\fH\u0080\b¢\u0006\u0004\bs\u0010:\u001a$\u0010t\u001a\u00020/*\u00020\u000b2\u0006\u0010?\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\fH\u0080\b¢\u0006\u0004\bt\u0010V\u001a$\u0010u\u001a\u00020\f*\u00020\u000b2\u0006\u0010F\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\fH\u0080\b¢\u0006\u0004\bu\u0010v\u001a,\u0010x\u001a\u00020\f*\u00020\u000b2\u0006\u0010m\u001a\u00020#2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010w\u001a\u00020\fH\u0080\b¢\u0006\u0004\bx\u0010y\u001a$\u0010z\u001a\u00020\f*\u00020\u000b2\u0006\u0010\u0005\u001a\u0002042\u0006\u0010\u0012\u001a\u00020\fH\u0080\b¢\u0006\u0004\bz\u0010{\u001a$\u0010}\u001a\u00020\f*\u00020\u000b2\u0006\u0010|\u001a\u0002042\u0006\u0010\u0012\u001a\u00020\fH\u0080\b¢\u0006\u0004\b}\u0010{\u001a4\u0010~\u001a\u00020\b*\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0005\u001a\u0002042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b~\u0010\u007f\u001a#\u0010\u0082\u0001\u001a\u00020\b*\u00020\u000b2\n\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u0001H\u0080\b¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0014\u0010q\u001a\u00020\u0002*\u00020\u000bH\u0080\b¢\u0006\u0004\bq\u0010*\u001a\u0017\u0010\u0084\u0001\u001a\u00020\u000b*\u00020\u000bH\u0080\b¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0016\u0010\u0086\u0001\u001a\u000204*\u00020\u000bH\u0080\b¢\u0006\u0005\b\u0086\u0001\u0010P\u001a\u001f\u0010\u0087\u0001\u001a\u000204*\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u0002H\u0080\b¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a!\u0010\u008b\u0001\u001a\u00030\u0089\u0001*\u00020\u000b2\b\u0010\u008a\u0001\u001a\u00030\u0089\u0001H\u0000¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u001f\u0010o\u001a\u00030\u0089\u0001*\u00020\u000b2\b\u0010\u008a\u0001\u001a\u00030\u0089\u0001H\u0000¢\u0006\u0005\bo\u0010\u008c\u0001\u001a\u0018\u0010\u008d\u0001\u001a\u00020\u0002*\u00030\u0089\u0001H\u0080\b¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a \u0010\u008f\u0001\u001a\u00020\u0002*\u00030\u0089\u00012\u0006\u0010\u001d\u001a\u00020\fH\u0080\b¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a!\u0010\u0092\u0001\u001a\u00020\f*\u00030\u0089\u00012\u0007\u0010\u0091\u0001\u001a\u00020\fH\u0080\b¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a!\u0010\u0095\u0001\u001a\u00020\f*\u00030\u0089\u00012\u0007\u0010\u0094\u0001\u001a\u00020\u0002H\u0080\b¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0016\u0010m\u001a\u00020/*\u00030\u0089\u0001H\u0080\b¢\u0006\u0005\bm\u0010\u0097\u0001\"\u0017\u0010\u0098\u0001\u001a\u00020\f8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b!\u0010^\"\u0017\u0010\u0099\u0001\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bm\u0010[\"\u0018\u0010\u009a\u0001\u001a\u00020\f8\u0000@\u0000X\u0080T¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010^\" \u0010\u009e\u0001\u001a\u00020\u00048\u0000@\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b0\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u009f\u0001"}, d2 = {"Lcom/p7700g/p99005/sw5;", "segment", "", "segmentPos", "", "bytes", "bytesOffset", "bytesLimit", "", "h0", "(Lcom/p7700g/p99005/sw5;I[BII)Z", "Lcom/p7700g/p99005/sv5;", "", "newline", "", "i0", "(Lcom/p7700g/p99005/sv5;J)Ljava/lang/String;", "T", "fromIndex", "Lkotlin/Function2;", "lambda", "j0", "(Lcom/p7700g/p99005/sv5;JLcom/p7700g/p99005/j05;)Ljava/lang/Object;", "Lcom/p7700g/p99005/mw5;", "options", "selectTruncated", "k0", "(Lcom/p7700g/p99005/sv5;Lcom/p7700g/p99005/mw5;Z)I", "out", "offset", "byteCount", "e", "(Lcom/p7700g/p99005/sv5;Lcom/p7700g/p99005/sv5;JJ)Lcom/p7700g/p99005/sv5;", "c", "(Lcom/p7700g/p99005/sv5;)J", "", "t", "(Lcom/p7700g/p99005/sv5;)B", "", "E", "(Lcom/p7700g/p99005/sv5;)S", "C", "(Lcom/p7700g/p99005/sv5;)I", "D", "pos", "h", "(Lcom/p7700g/p99005/sv5;J)B", "Lcom/p7700g/p99005/yq4;", "a", "(Lcom/p7700g/p99005/sv5;)V", "N", "(Lcom/p7700g/p99005/sv5;J)V", "Lcom/p7700g/p99005/vv5;", "byteString", "R", "(Lcom/p7700g/p99005/sv5;Lcom/p7700g/p99005/vv5;II)Lcom/p7700g/p99005/sv5;", com.ironsource.sdk.controller.v.a, "Z", "(Lcom/p7700g/p99005/sv5;J)Lcom/p7700g/p99005/sv5;", "a0", "minimumCapacity", "Q", "(Lcom/p7700g/p99005/sv5;I)Lcom/p7700g/p99005/sw5;", rs2.f.b, "(Lcom/p7700g/p99005/sv5;[B)Lcom/p7700g/p99005/sv5;", "U", "(Lcom/p7700g/p99005/sv5;[BII)Lcom/p7700g/p99005/sv5;", "u", "(Lcom/p7700g/p99005/sv5;)[B", "(Lcom/p7700g/p99005/sv5;J)[B", "sink", ij3.b, "(Lcom/p7700g/p99005/sv5;[B)I", bx.B4, "(Lcom/p7700g/p99005/sv5;[B)V", "p", "(Lcom/p7700g/p99005/sv5;[BII)I", "y", AFHydra.EV_BYTECOUNT, "w", "(Lcom/p7700g/p99005/sv5;)Lcom/p7700g/p99005/vv5;", "x", "(Lcom/p7700g/p99005/sv5;J)Lcom/p7700g/p99005/vv5;", "M", "(Lcom/p7700g/p99005/sv5;Lcom/p7700g/p99005/mw5;)I", "z", "(Lcom/p7700g/p99005/sv5;Lcom/p7700g/p99005/sv5;J)V", "Lcom/p7700g/p99005/vw5;", "r", "(Lcom/p7700g/p99005/sv5;Lcom/p7700g/p99005/vw5;)J", RequestConfiguration.MAX_AD_CONTENT_RATING_G, AFHydra.STATUS_IDLE, "(Lcom/p7700g/p99005/sv5;)Ljava/lang/String;", "limit", "J", "H", "string", "beginIndex", "endIndex", "e0", "(Lcom/p7700g/p99005/sv5;Ljava/lang/String;II)Lcom/p7700g/p99005/sv5;", "codePoint", "f0", "(Lcom/p7700g/p99005/sv5;I)Lcom/p7700g/p99005/sv5;", "Lcom/p7700g/p99005/xw5;", "X", "(Lcom/p7700g/p99005/sv5;Lcom/p7700g/p99005/xw5;)J", "S", "(Lcom/p7700g/p99005/sv5;Lcom/p7700g/p99005/xw5;J)Lcom/p7700g/p99005/sv5;", "b", "Y", "s", "d0", "i", "b0", "c0", bx.C4, "q", "(Lcom/p7700g/p99005/sv5;Lcom/p7700g/p99005/sv5;J)J", "toIndex", "j", "(Lcom/p7700g/p99005/sv5;BJJ)J", "k", "(Lcom/p7700g/p99005/sv5;Lcom/p7700g/p99005/vv5;J)J", "targetBytes", "l", "n", "(Lcom/p7700g/p99005/sv5;JLcom/p7700g/p99005/vv5;II)Z", "", "other", "f", "(Lcom/p7700g/p99005/sv5;Ljava/lang/Object;)Z", "d", "(Lcom/p7700g/p99005/sv5;)Lcom/p7700g/p99005/sv5;", "O", "P", "(Lcom/p7700g/p99005/sv5;I)Lcom/p7700g/p99005/vv5;", "Lcom/p7700g/p99005/sv5$a;", "unsafeCursor", "F", "(Lcom/p7700g/p99005/sv5;Lcom/p7700g/p99005/sv5$a;)Lcom/p7700g/p99005/sv5$a;", com.anythink.expressad.d.a.b.dH, "(Lcom/p7700g/p99005/sv5$a;)I", "L", "(Lcom/p7700g/p99005/sv5$a;J)I", "newSize", "K", "(Lcom/p7700g/p99005/sv5$a;J)J", "minByteCount", com.anythink.basead.d.g.i, "(Lcom/p7700g/p99005/sv5$a;I)J", "(Lcom/p7700g/p99005/sv5$a;)V", "OVERFLOW_ZONE", "SEGMENTING_THRESHOLD", "OVERFLOW_DIGIT_START", "[B", "g0", "()[B", "HEX_DIGIT_BYTES", "okio"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes3.dex */
public final class bx5 {
    @NotNull
    private static final byte[] a = ov5.a("0123456789abcdef");
    public static final int b = 4096;
    public static final long c = -922337203685477580L;
    public static final long d = -7;

    public static final void A(@NotNull sv5 sv5Var, @NotNull byte[] bArr) {
        c25.p(sv5Var, "$this$commonReadFully");
        c25.p(bArr, "sink");
        int i = 0;
        while (i < bArr.length) {
            int read = sv5Var.read(bArr, i, bArr.length - i);
            if (read == -1) {
                throw new EOFException();
            }
            i += read;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00aa A[EDGE_INSN: B:90:0x00aa->B:85:0x00aa ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long B(@NotNull sv5 sv5Var) {
        int i;
        c25.p(sv5Var, "$this$commonReadHexadecimalUnsignedLong");
        if (sv5Var.z2() != 0) {
            int i2 = 0;
            boolean z = false;
            long j = 0;
            do {
                sw5 sw5Var = sv5Var.s;
                c25.m(sw5Var);
                byte[] bArr = sw5Var.d;
                int i3 = sw5Var.e;
                int i4 = sw5Var.f;
                while (i3 < i4) {
                    byte b2 = bArr[i3];
                    byte b3 = (byte) 48;
                    if (b2 < b3 || b2 > ((byte) 57)) {
                        byte b4 = (byte) 97;
                        if ((b2 >= b4 && b2 <= ((byte) 102)) || (b2 >= (b4 = (byte) 65) && b2 <= ((byte) 70))) {
                            i = (b2 - b4) + 10;
                        } else if (i2 == 0) {
                            StringBuilder G = wo1.G("Expected leading [0-9a-fA-F] character but was 0x");
                            G.append(pv5.o(b2));
                            throw new NumberFormatException(G.toString());
                        } else {
                            z = true;
                            if (i3 != i4) {
                                sv5Var.s = sw5Var.b();
                                tw5.d(sw5Var);
                            } else {
                                sw5Var.e = i3;
                            }
                            if (!z) {
                                break;
                            }
                        }
                    } else {
                        i = b2 - b3;
                    }
                    if (((-1152921504606846976L) & j) != 0) {
                        sv5 g0 = new sv5().e1(j).g0(b2);
                        StringBuilder G2 = wo1.G("Number too large: ");
                        G2.append(g0.u1());
                        throw new NumberFormatException(G2.toString());
                    }
                    j = (j << 4) | i;
                    i3++;
                    i2++;
                }
                if (i3 != i4) {
                }
                if (!z) {
                }
            } while (sv5Var.s != null);
            sv5Var.v2(sv5Var.z2() - i2);
            return j;
        }
        throw new EOFException();
    }

    public static final int C(@NotNull sv5 sv5Var) {
        c25.p(sv5Var, "$this$commonReadInt");
        if (sv5Var.z2() >= 4) {
            sw5 sw5Var = sv5Var.s;
            c25.m(sw5Var);
            int i = sw5Var.e;
            int i2 = sw5Var.f;
            if (i2 - i < 4) {
                return (sv5Var.readByte() & 255) | ((sv5Var.readByte() & 255) << 24) | ((sv5Var.readByte() & 255) << 16) | ((sv5Var.readByte() & 255) << 8);
            }
            byte[] bArr = sw5Var.d;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i6 = i4 + 1;
            int i7 = i5 | ((bArr[i4] & 255) << 8);
            int i8 = i6 + 1;
            int i9 = i7 | (bArr[i6] & 255);
            sv5Var.v2(sv5Var.z2() - 4);
            if (i8 == i2) {
                sv5Var.s = sw5Var.b();
                tw5.d(sw5Var);
            } else {
                sw5Var.e = i8;
            }
            return i9;
        }
        throw new EOFException();
    }

    public static final long D(@NotNull sv5 sv5Var) {
        c25.p(sv5Var, "$this$commonReadLong");
        if (sv5Var.z2() >= 8) {
            sw5 sw5Var = sv5Var.s;
            c25.m(sw5Var);
            int i = sw5Var.e;
            int i2 = sw5Var.f;
            if (i2 - i < 8) {
                return ((sv5Var.readInt() & 4294967295L) << 32) | (4294967295L & sv5Var.readInt());
            }
            byte[] bArr = sw5Var.d;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = i4 + 1;
            long j = ((bArr[i] & 255) << 56) | ((bArr[i3] & 255) << 48) | ((bArr[i4] & 255) << 40);
            int i6 = i5 + 1;
            long j2 = ((bArr[i5] & 255) << 32) | j;
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            long j3 = j2 | ((bArr[i6] & 255) << 24) | ((bArr[i7] & 255) << 16);
            int i9 = i8 + 1;
            int i10 = i9 + 1;
            long j4 = j3 | ((bArr[i8] & 255) << 8) | (bArr[i9] & 255);
            sv5Var.v2(sv5Var.z2() - 8);
            if (i10 == i2) {
                sv5Var.s = sw5Var.b();
                tw5.d(sw5Var);
            } else {
                sw5Var.e = i10;
            }
            return j4;
        }
        throw new EOFException();
    }

    public static final short E(@NotNull sv5 sv5Var) {
        c25.p(sv5Var, "$this$commonReadShort");
        if (sv5Var.z2() >= 2) {
            sw5 sw5Var = sv5Var.s;
            c25.m(sw5Var);
            int i = sw5Var.e;
            int i2 = sw5Var.f;
            if (i2 - i < 2) {
                return (short) ((sv5Var.readByte() & 255) | ((sv5Var.readByte() & 255) << 8));
            }
            byte[] bArr = sw5Var.d;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            sv5Var.v2(sv5Var.z2() - 2);
            if (i4 == i2) {
                sv5Var.s = sw5Var.b();
                tw5.d(sw5Var);
            } else {
                sw5Var.e = i4;
            }
            return (short) i5;
        }
        throw new EOFException();
    }

    @NotNull
    public static final sv5.a F(@NotNull sv5 sv5Var, @NotNull sv5.a aVar) {
        c25.p(sv5Var, "$this$commonReadUnsafe");
        c25.p(aVar, "unsafeCursor");
        if (aVar.s == null) {
            aVar.s = sv5Var;
            aVar.t = false;
            return aVar;
        }
        throw new IllegalStateException("already attached to a buffer".toString());
    }

    @NotNull
    public static final String G(@NotNull sv5 sv5Var, long j) {
        c25.p(sv5Var, "$this$commonReadUtf8");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0 && j <= ((long) Integer.MAX_VALUE)) {
            if (sv5Var.z2() >= j) {
                if (i == 0) {
                    return "";
                }
                sw5 sw5Var = sv5Var.s;
                c25.m(sw5Var);
                int i2 = sw5Var.e;
                if (i2 + j > sw5Var.f) {
                    return gx5.c(sv5Var.r1(j), 0, 0, 3, null);
                }
                int i3 = (int) j;
                String b2 = gx5.b(sw5Var.d, i2, i2 + i3);
                sw5Var.e += i3;
                sv5Var.v2(sv5Var.z2() - j);
                if (sw5Var.e == sw5Var.f) {
                    sv5Var.s = sw5Var.b();
                    tw5.d(sw5Var);
                }
                return b2;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(wo1.p("byteCount: ", j).toString());
    }

    public static final int H(@NotNull sv5 sv5Var) {
        int i;
        int i2;
        int i3;
        c25.p(sv5Var, "$this$commonReadUtf8CodePoint");
        if (sv5Var.z2() != 0) {
            byte d2 = sv5Var.d2(0L);
            if ((d2 & g15.b) == 0) {
                i = d2 & g15.c;
                i2 = 1;
                i3 = 0;
            } else if ((d2 & 224) == 192) {
                i = d2 & 31;
                i2 = 2;
                i3 = 128;
            } else if ((d2 & 240) == 224) {
                i = d2 & 15;
                i2 = 3;
                i3 = 2048;
            } else if ((d2 & 248) != 240) {
                sv5Var.skip(1L);
                return ax5.c;
            } else {
                i = d2 & 7;
                i2 = 4;
                i3 = 65536;
            }
            long j = i2;
            if (sv5Var.z2() >= j) {
                for (int i4 = 1; i4 < i2; i4++) {
                    long j2 = i4;
                    byte d22 = sv5Var.d2(j2);
                    if ((d22 & 192) != 128) {
                        sv5Var.skip(j2);
                        return ax5.c;
                    }
                    i = (i << 6) | (d22 & ax5.a);
                }
                sv5Var.skip(j);
                return i > 1114111 ? ax5.c : ((55296 <= i && 57343 >= i) || i < i3) ? ax5.c : i;
            }
            StringBuilder H = wo1.H("size < ", i2, ": ");
            H.append(sv5Var.z2());
            H.append(" (to read code point prefixed 0x");
            H.append(pv5.o(d2));
            H.append(')');
            throw new EOFException(H.toString());
        }
        throw new EOFException();
    }

    @Nullable
    public static final String I(@NotNull sv5 sv5Var) {
        c25.p(sv5Var, "$this$commonReadUtf8Line");
        long U1 = sv5Var.U1((byte) 10);
        if (U1 != -1) {
            return i0(sv5Var, U1);
        }
        if (sv5Var.z2() != 0) {
            return sv5Var.g(sv5Var.z2());
        }
        return null;
    }

    @NotNull
    public static final String J(@NotNull sv5 sv5Var, long j) {
        c25.p(sv5Var, "$this$commonReadUtf8LineStrict");
        if (j >= 0) {
            long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
            byte b2 = (byte) 10;
            long m0 = sv5Var.m0(b2, 0L, j2);
            if (m0 != -1) {
                return i0(sv5Var, m0);
            }
            if (j2 < sv5Var.z2() && sv5Var.d2(j2 - 1) == ((byte) 13) && sv5Var.d2(j2) == b2) {
                return i0(sv5Var, j2);
            }
            sv5 sv5Var2 = new sv5();
            sv5Var.X(sv5Var2, 0L, Math.min(32, sv5Var.z2()));
            StringBuilder G = wo1.G("\\n not found: limit=");
            G.append(Math.min(sv5Var.z2(), j));
            G.append(" content=");
            G.append(sv5Var2.f1().H());
            G.append(h95.F);
            throw new EOFException(G.toString());
        }
        throw new IllegalArgumentException(wo1.p("limit < 0: ", j).toString());
    }

    public static final long K(@NotNull sv5.a aVar, long j) {
        c25.p(aVar, "$this$commonResizeBuffer");
        sv5 sv5Var = aVar.s;
        if (sv5Var != null) {
            if (aVar.t) {
                long z2 = sv5Var.z2();
                int i = 1;
                int i2 = (j > z2 ? 1 : (j == z2 ? 0 : -1));
                if (i2 <= 0) {
                    if (j >= 0) {
                        long j2 = z2 - j;
                        while (true) {
                            if (j2 <= 0) {
                                break;
                            }
                            sw5 sw5Var = sv5Var.s;
                            c25.m(sw5Var);
                            sw5 sw5Var2 = sw5Var.j;
                            c25.m(sw5Var2);
                            int i3 = sw5Var2.f;
                            long j3 = i3 - sw5Var2.e;
                            if (j3 <= j2) {
                                sv5Var.s = sw5Var2.b();
                                tw5.d(sw5Var2);
                                j2 -= j3;
                            } else {
                                sw5Var2.f = i3 - ((int) j2);
                                break;
                            }
                        }
                        aVar.h(null);
                        aVar.v = j;
                        aVar.w = null;
                        aVar.x = -1;
                        aVar.y = -1;
                    } else {
                        throw new IllegalArgumentException(wo1.p("newSize < 0: ", j).toString());
                    }
                } else if (i2 > 0) {
                    long j4 = j - z2;
                    boolean z = true;
                    while (j4 > 0) {
                        sw5 D2 = sv5Var.D2(i);
                        int min = (int) Math.min(j4, 8192 - D2.f);
                        D2.f += min;
                        j4 -= min;
                        if (z) {
                            aVar.h(D2);
                            aVar.v = z2;
                            aVar.w = D2.d;
                            int i4 = D2.f;
                            aVar.x = i4 - min;
                            aVar.y = i4;
                            z = false;
                        }
                        i = 1;
                    }
                }
                sv5Var.v2(j);
                return z2;
            }
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
        }
        throw new IllegalStateException("not attached to a buffer".toString());
    }

    public static final int L(@NotNull sv5.a aVar, long j) {
        sw5 sw5Var;
        c25.p(aVar, "$this$commonSeek");
        sv5 sv5Var = aVar.s;
        if (sv5Var != null) {
            if (j >= -1 && j <= sv5Var.z2()) {
                if (j != -1 && j != sv5Var.z2()) {
                    long j2 = 0;
                    long z2 = sv5Var.z2();
                    sw5 sw5Var2 = sv5Var.s;
                    if (aVar.b() != null) {
                        long j3 = aVar.v;
                        int i = aVar.x;
                        sw5 b2 = aVar.b();
                        c25.m(b2);
                        long j4 = j3 - (i - b2.e);
                        if (j4 > j) {
                            sw5Var2 = aVar.b();
                            z2 = j4;
                            sw5Var = sw5Var2;
                        } else {
                            sw5Var = aVar.b();
                            j2 = j4;
                        }
                    } else {
                        sw5Var = sw5Var2;
                    }
                    if (z2 - j > j - j2) {
                        while (true) {
                            c25.m(sw5Var);
                            int i2 = sw5Var.f;
                            int i3 = sw5Var.e;
                            if (j < (i2 - i3) + j2) {
                                break;
                            }
                            j2 += i2 - i3;
                            sw5Var = sw5Var.i;
                        }
                    } else {
                        while (z2 > j) {
                            c25.m(sw5Var2);
                            sw5Var2 = sw5Var2.j;
                            c25.m(sw5Var2);
                            z2 -= sw5Var2.f - sw5Var2.e;
                        }
                        j2 = z2;
                        sw5Var = sw5Var2;
                    }
                    if (aVar.t) {
                        c25.m(sw5Var);
                        if (sw5Var.g) {
                            sw5 f = sw5Var.f();
                            if (sv5Var.s == sw5Var) {
                                sv5Var.s = f;
                            }
                            sw5Var = sw5Var.c(f);
                            sw5 sw5Var3 = sw5Var.j;
                            c25.m(sw5Var3);
                            sw5Var3.b();
                        }
                    }
                    aVar.h(sw5Var);
                    aVar.v = j;
                    c25.m(sw5Var);
                    aVar.w = sw5Var.d;
                    int i4 = sw5Var.e + ((int) (j - j2));
                    aVar.x = i4;
                    int i5 = sw5Var.f;
                    aVar.y = i5;
                    return i5 - i4;
                }
                aVar.h(null);
                aVar.v = j;
                aVar.w = null;
                aVar.x = -1;
                aVar.y = -1;
                return -1;
            }
            throw new ArrayIndexOutOfBoundsException("offset=" + j + " > size=" + sv5Var.z2());
        }
        throw new IllegalStateException("not attached to a buffer".toString());
    }

    public static final int M(@NotNull sv5 sv5Var, @NotNull mw5 mw5Var) {
        c25.p(sv5Var, "$this$commonSelect");
        c25.p(mw5Var, "options");
        int l0 = l0(sv5Var, mw5Var, false, 2, null);
        if (l0 == -1) {
            return -1;
        }
        sv5Var.skip(mw5Var.d()[l0].C3());
        return l0;
    }

    public static final void N(@NotNull sv5 sv5Var, long j) {
        c25.p(sv5Var, "$this$commonSkip");
        while (j > 0) {
            sw5 sw5Var = sv5Var.s;
            if (sw5Var != null) {
                int min = (int) Math.min(j, sw5Var.f - sw5Var.e);
                long j2 = min;
                sv5Var.v2(sv5Var.z2() - j2);
                j -= j2;
                int i = sw5Var.e + min;
                sw5Var.e = i;
                if (i == sw5Var.f) {
                    sv5Var.s = sw5Var.b();
                    tw5.d(sw5Var);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @NotNull
    public static final vv5 O(@NotNull sv5 sv5Var) {
        c25.p(sv5Var, "$this$commonSnapshot");
        if (sv5Var.z2() <= ((long) Integer.MAX_VALUE)) {
            return sv5Var.C2((int) sv5Var.z2());
        }
        StringBuilder G = wo1.G("size > Int.MAX_VALUE: ");
        G.append(sv5Var.z2());
        throw new IllegalStateException(G.toString().toString());
    }

    @NotNull
    public static final vv5 P(@NotNull sv5 sv5Var, int i) {
        c25.p(sv5Var, "$this$commonSnapshot");
        if (i == 0) {
            return vv5.t;
        }
        pv5.e(sv5Var.z2(), 0L, i);
        sw5 sw5Var = sv5Var.s;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            c25.m(sw5Var);
            int i5 = sw5Var.f;
            int i6 = sw5Var.e;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                sw5Var = sw5Var.i;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i4];
        int[] iArr = new int[i4 * 2];
        sw5 sw5Var2 = sv5Var.s;
        int i7 = 0;
        while (i2 < i) {
            c25.m(sw5Var2);
            bArr[i7] = sw5Var2.d;
            i2 += sw5Var2.f - sw5Var2.e;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = sw5Var2.e;
            sw5Var2.g = true;
            i7++;
            sw5Var2 = sw5Var2.i;
        }
        return new uw5(bArr, iArr);
    }

    @NotNull
    public static final sw5 Q(@NotNull sv5 sv5Var, int i) {
        c25.p(sv5Var, "$this$commonWritableSegment");
        boolean z = true;
        if ((i < 1 || i > 8192) ? false : false) {
            sw5 sw5Var = sv5Var.s;
            if (sw5Var == null) {
                sw5 e = tw5.e();
                sv5Var.s = e;
                e.j = e;
                e.i = e;
                return e;
            }
            c25.m(sw5Var);
            sw5 sw5Var2 = sw5Var.j;
            c25.m(sw5Var2);
            return (sw5Var2.f + i > 8192 || !sw5Var2.h) ? sw5Var2.c(tw5.e()) : sw5Var2;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    @NotNull
    public static final sv5 R(@NotNull sv5 sv5Var, @NotNull vv5 vv5Var, int i, int i2) {
        c25.p(sv5Var, "$this$commonWrite");
        c25.p(vv5Var, "byteString");
        vv5Var.w4(sv5Var, i, i2);
        return sv5Var;
    }

    @NotNull
    public static final sv5 S(@NotNull sv5 sv5Var, @NotNull xw5 xw5Var, long j) {
        c25.p(sv5Var, "$this$commonWrite");
        c25.p(xw5Var, rs2.f.b);
        while (j > 0) {
            long read = xw5Var.read(sv5Var, j);
            if (read == -1) {
                throw new EOFException();
            }
            j -= read;
        }
        return sv5Var;
    }

    @NotNull
    public static final sv5 T(@NotNull sv5 sv5Var, @NotNull byte[] bArr) {
        c25.p(sv5Var, "$this$commonWrite");
        c25.p(bArr, rs2.f.b);
        return sv5Var.V0(bArr, 0, bArr.length);
    }

    @NotNull
    public static final sv5 U(@NotNull sv5 sv5Var, @NotNull byte[] bArr, int i, int i2) {
        c25.p(sv5Var, "$this$commonWrite");
        c25.p(bArr, rs2.f.b);
        long j = i2;
        pv5.e(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            sw5 D2 = sv5Var.D2(1);
            int min = Math.min(i3 - i, 8192 - D2.f);
            int i4 = i + min;
            zr4.W0(bArr, D2.d, D2.f, i, i4);
            D2.f += min;
            i = i4;
        }
        sv5Var.v2(sv5Var.z2() + j);
        return sv5Var;
    }

    public static final void V(@NotNull sv5 sv5Var, @NotNull sv5 sv5Var2, long j) {
        sw5 sw5Var;
        sw5 sw5Var2;
        c25.p(sv5Var, "$this$commonWrite");
        c25.p(sv5Var2, rs2.f.b);
        if (sv5Var2 != sv5Var) {
            pv5.e(sv5Var2.z2(), 0L, j);
            while (j > 0) {
                sw5 sw5Var3 = sv5Var2.s;
                c25.m(sw5Var3);
                int i = sw5Var3.f;
                c25.m(sv5Var2.s);
                if (j < i - sw5Var.e) {
                    sw5 sw5Var4 = sv5Var.s;
                    if (sw5Var4 != null) {
                        c25.m(sw5Var4);
                        sw5Var2 = sw5Var4.j;
                    } else {
                        sw5Var2 = null;
                    }
                    if (sw5Var2 != null && sw5Var2.h) {
                        if ((sw5Var2.f + j) - (sw5Var2.g ? 0 : sw5Var2.e) <= 8192) {
                            sw5 sw5Var5 = sv5Var2.s;
                            c25.m(sw5Var5);
                            sw5Var5.g(sw5Var2, (int) j);
                            sv5Var2.v2(sv5Var2.z2() - j);
                            sv5Var.v2(sv5Var.z2() + j);
                            return;
                        }
                    }
                    sw5 sw5Var6 = sv5Var2.s;
                    c25.m(sw5Var6);
                    sv5Var2.s = sw5Var6.e((int) j);
                }
                sw5 sw5Var7 = sv5Var2.s;
                c25.m(sw5Var7);
                long j2 = sw5Var7.f - sw5Var7.e;
                sv5Var2.s = sw5Var7.b();
                sw5 sw5Var8 = sv5Var.s;
                if (sw5Var8 == null) {
                    sv5Var.s = sw5Var7;
                    sw5Var7.j = sw5Var7;
                    sw5Var7.i = sw5Var7;
                } else {
                    c25.m(sw5Var8);
                    sw5 sw5Var9 = sw5Var8.j;
                    c25.m(sw5Var9);
                    sw5Var9.c(sw5Var7).a();
                }
                sv5Var2.v2(sv5Var2.z2() - j2);
                sv5Var.v2(sv5Var.z2() + j2);
                j -= j2;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    public static /* synthetic */ sv5 W(sv5 sv5Var, vv5 vv5Var, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = vv5Var.C3();
        }
        c25.p(sv5Var, "$this$commonWrite");
        c25.p(vv5Var, "byteString");
        vv5Var.w4(sv5Var, i, i2);
        return sv5Var;
    }

    public static final long X(@NotNull sv5 sv5Var, @NotNull xw5 xw5Var) {
        c25.p(sv5Var, "$this$commonWriteAll");
        c25.p(xw5Var, rs2.f.b);
        long j = 0;
        while (true) {
            long read = xw5Var.read(sv5Var, 8192);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    @NotNull
    public static final sv5 Y(@NotNull sv5 sv5Var, int i) {
        c25.p(sv5Var, "$this$commonWriteByte");
        sw5 D2 = sv5Var.D2(1);
        byte[] bArr = D2.d;
        int i2 = D2.f;
        D2.f = i2 + 1;
        bArr[i2] = (byte) i;
        sv5Var.v2(sv5Var.z2() + 1);
        return sv5Var;
    }

    @NotNull
    public static final sv5 Z(@NotNull sv5 sv5Var, long j) {
        c25.p(sv5Var, "$this$commonWriteDecimalLong");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            return sv5Var.g0(48);
        }
        boolean z = false;
        int i2 = 1;
        if (i < 0) {
            j = -j;
            if (j < 0) {
                return sv5Var.K0("-9223372036854775808");
            }
            z = true;
        }
        if (j >= 100000000) {
            i2 = j < 1000000000000L ? j < ls5.e ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= gc0.c) {
            i2 = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i2 = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i2 = 2;
        }
        if (z) {
            i2++;
        }
        sw5 D2 = sv5Var.D2(i2);
        byte[] bArr = D2.d;
        int i3 = D2.f + i2;
        while (j != 0) {
            long j2 = 10;
            i3--;
            bArr[i3] = g0()[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i3 - 1] = (byte) 45;
        }
        D2.f += i2;
        sv5Var.v2(sv5Var.z2() + i2);
        return sv5Var;
    }

    public static final void a(@NotNull sv5 sv5Var) {
        c25.p(sv5Var, "$this$commonClear");
        sv5Var.skip(sv5Var.z2());
    }

    @NotNull
    public static final sv5 a0(@NotNull sv5 sv5Var, long j) {
        c25.p(sv5Var, "$this$commonWriteHexadecimalUnsignedLong");
        if (j == 0) {
            return sv5Var.g0(48);
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        sw5 D2 = sv5Var.D2(i);
        byte[] bArr = D2.d;
        int i2 = D2.f;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = g0()[(int) (15 & j)];
            j >>>= 4;
        }
        D2.f += i;
        sv5Var.v2(sv5Var.z2() + i);
        return sv5Var;
    }

    public static final void b(@NotNull sv5.a aVar) {
        c25.p(aVar, "$this$commonClose");
        if (aVar.s != null) {
            aVar.s = null;
            aVar.h(null);
            aVar.v = -1L;
            aVar.w = null;
            aVar.x = -1;
            aVar.y = -1;
            return;
        }
        throw new IllegalStateException("not attached to a buffer".toString());
    }

    @NotNull
    public static final sv5 b0(@NotNull sv5 sv5Var, int i) {
        c25.p(sv5Var, "$this$commonWriteInt");
        sw5 D2 = sv5Var.D2(4);
        byte[] bArr = D2.d;
        int i2 = D2.f;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        D2.f = i5 + 1;
        sv5Var.v2(sv5Var.z2() + 4);
        return sv5Var;
    }

    public static final long c(@NotNull sv5 sv5Var) {
        c25.p(sv5Var, "$this$commonCompleteSegmentByteCount");
        long z2 = sv5Var.z2();
        if (z2 == 0) {
            return 0L;
        }
        sw5 sw5Var = sv5Var.s;
        c25.m(sw5Var);
        sw5 sw5Var2 = sw5Var.j;
        c25.m(sw5Var2);
        int i = sw5Var2.f;
        return (i >= 8192 || !sw5Var2.h) ? z2 : z2 - (i - sw5Var2.e);
    }

    @NotNull
    public static final sv5 c0(@NotNull sv5 sv5Var, long j) {
        c25.p(sv5Var, "$this$commonWriteLong");
        sw5 D2 = sv5Var.D2(8);
        byte[] bArr = D2.d;
        int i = D2.f;
        int i2 = i + 1;
        bArr[i] = (byte) ((j >>> 56) & 255);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((j >>> 48) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((j >>> 40) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((j >>> 32) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((j >>> 24) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((j >>> 16) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((j >>> 8) & 255);
        bArr[i8] = (byte) (j & 255);
        D2.f = i8 + 1;
        sv5Var.v2(sv5Var.z2() + 8);
        return sv5Var;
    }

    @NotNull
    public static final sv5 d(@NotNull sv5 sv5Var) {
        c25.p(sv5Var, "$this$commonCopy");
        sv5 sv5Var2 = new sv5();
        if (sv5Var.z2() == 0) {
            return sv5Var2;
        }
        sw5 sw5Var = sv5Var.s;
        c25.m(sw5Var);
        sw5 d2 = sw5Var.d();
        sv5Var2.s = d2;
        d2.j = d2;
        d2.i = d2;
        for (sw5 sw5Var2 = sw5Var.i; sw5Var2 != sw5Var; sw5Var2 = sw5Var2.i) {
            sw5 sw5Var3 = d2.j;
            c25.m(sw5Var3);
            c25.m(sw5Var2);
            sw5Var3.c(sw5Var2.d());
        }
        sv5Var2.v2(sv5Var.z2());
        return sv5Var2;
    }

    @NotNull
    public static final sv5 d0(@NotNull sv5 sv5Var, int i) {
        c25.p(sv5Var, "$this$commonWriteShort");
        sw5 D2 = sv5Var.D2(2);
        byte[] bArr = D2.d;
        int i2 = D2.f;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        D2.f = i3 + 1;
        sv5Var.v2(sv5Var.z2() + 2);
        return sv5Var;
    }

    @NotNull
    public static final sv5 e(@NotNull sv5 sv5Var, @NotNull sv5 sv5Var2, long j, long j2) {
        c25.p(sv5Var, "$this$commonCopyTo");
        c25.p(sv5Var2, "out");
        pv5.e(sv5Var.z2(), j, j2);
        if (j2 == 0) {
            return sv5Var;
        }
        sv5Var2.v2(sv5Var2.z2() + j2);
        sw5 sw5Var = sv5Var.s;
        while (true) {
            c25.m(sw5Var);
            int i = sw5Var.f;
            int i2 = sw5Var.e;
            if (j < i - i2) {
                break;
            }
            j -= i - i2;
            sw5Var = sw5Var.i;
        }
        while (j2 > 0) {
            c25.m(sw5Var);
            sw5 d2 = sw5Var.d();
            int i3 = d2.e + ((int) j);
            d2.e = i3;
            d2.f = Math.min(i3 + ((int) j2), d2.f);
            sw5 sw5Var2 = sv5Var2.s;
            if (sw5Var2 == null) {
                d2.j = d2;
                d2.i = d2;
                sv5Var2.s = d2;
            } else {
                c25.m(sw5Var2);
                sw5 sw5Var3 = sw5Var2.j;
                c25.m(sw5Var3);
                sw5Var3.c(d2);
            }
            j2 -= d2.f - d2.e;
            sw5Var = sw5Var.i;
            j = 0;
        }
        return sv5Var;
    }

    @NotNull
    public static final sv5 e0(@NotNull sv5 sv5Var, @NotNull String str, int i, int i2) {
        char charAt;
        c25.p(sv5Var, "$this$commonWriteUtf8");
        c25.p(str, "string");
        if (i >= 0) {
            if (i2 >= i) {
                if (!(i2 <= str.length())) {
                    StringBuilder H = wo1.H("endIndex > string.length: ", i2, " > ");
                    H.append(str.length());
                    throw new IllegalArgumentException(H.toString().toString());
                }
                while (i < i2) {
                    char charAt2 = str.charAt(i);
                    if (charAt2 < 128) {
                        sw5 D2 = sv5Var.D2(1);
                        byte[] bArr = D2.d;
                        int i3 = D2.f - i;
                        int min = Math.min(i2, 8192 - i3);
                        int i4 = i + 1;
                        bArr[i + i3] = (byte) charAt2;
                        while (true) {
                            i = i4;
                            if (i >= min || (charAt = str.charAt(i)) >= 128) {
                                break;
                            }
                            i4 = i + 1;
                            bArr[i + i3] = (byte) charAt;
                        }
                        int i5 = D2.f;
                        int i6 = (i3 + i) - i5;
                        D2.f = i5 + i6;
                        sv5Var.v2(sv5Var.z2() + i6);
                    } else {
                        if (charAt2 < 2048) {
                            sw5 D22 = sv5Var.D2(2);
                            byte[] bArr2 = D22.d;
                            int i7 = D22.f;
                            bArr2[i7] = (byte) ((charAt2 >> 6) | yg1.K);
                            bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                            D22.f = i7 + 2;
                            sv5Var.v2(sv5Var.z2() + 2);
                        } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                            int i8 = i + 1;
                            char charAt3 = i8 < i2 ? str.charAt(i8) : (char) 0;
                            if (charAt2 <= 56319 && 56320 <= charAt3 && 57343 >= charAt3) {
                                int i9 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                                sw5 D23 = sv5Var.D2(4);
                                byte[] bArr3 = D23.d;
                                int i10 = D23.f;
                                bArr3[i10] = (byte) ((i9 >> 18) | 240);
                                bArr3[i10 + 1] = (byte) (((i9 >> 12) & 63) | 128);
                                bArr3[i10 + 2] = (byte) (((i9 >> 6) & 63) | 128);
                                bArr3[i10 + 3] = (byte) ((i9 & 63) | 128);
                                D23.f = i10 + 4;
                                sv5Var.v2(sv5Var.z2() + 4);
                                i += 2;
                            } else {
                                sv5Var.g0(63);
                                i = i8;
                            }
                        } else {
                            sw5 D24 = sv5Var.D2(3);
                            byte[] bArr4 = D24.d;
                            int i11 = D24.f;
                            bArr4[i11] = (byte) ((charAt2 >> '\f') | 224);
                            bArr4[i11 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                            bArr4[i11 + 2] = (byte) ((charAt2 & '?') | 128);
                            D24.f = i11 + 3;
                            sv5Var.v2(sv5Var.z2() + 3);
                        }
                        i++;
                    }
                }
                return sv5Var;
            }
            throw new IllegalArgumentException(wo1.o("endIndex < beginIndex: ", i2, " < ", i).toString());
        }
        throw new IllegalArgumentException(wo1.l("beginIndex < 0: ", i).toString());
    }

    public static final boolean f(@NotNull sv5 sv5Var, @Nullable Object obj) {
        c25.p(sv5Var, "$this$commonEquals");
        if (sv5Var == obj) {
            return true;
        }
        if (obj instanceof sv5) {
            sv5 sv5Var2 = (sv5) obj;
            if (sv5Var.z2() != sv5Var2.z2()) {
                return false;
            }
            if (sv5Var.z2() == 0) {
                return true;
            }
            sw5 sw5Var = sv5Var.s;
            c25.m(sw5Var);
            sw5 sw5Var2 = sv5Var2.s;
            c25.m(sw5Var2);
            int i = sw5Var.e;
            int i2 = sw5Var2.e;
            long j = 0;
            while (j < sv5Var.z2()) {
                long min = Math.min(sw5Var.f - i, sw5Var2.f - i2);
                long j2 = 0;
                while (j2 < min) {
                    int i3 = i + 1;
                    int i4 = i2 + 1;
                    if (sw5Var.d[i] != sw5Var2.d[i2]) {
                        return false;
                    }
                    j2++;
                    i = i3;
                    i2 = i4;
                }
                if (i == sw5Var.f) {
                    sw5Var = sw5Var.i;
                    c25.m(sw5Var);
                    i = sw5Var.e;
                }
                if (i2 == sw5Var2.f) {
                    sw5Var2 = sw5Var2.i;
                    c25.m(sw5Var2);
                    i2 = sw5Var2.e;
                }
                j += min;
            }
            return true;
        }
        return false;
    }

    @NotNull
    public static final sv5 f0(@NotNull sv5 sv5Var, int i) {
        c25.p(sv5Var, "$this$commonWriteUtf8CodePoint");
        if (i < 128) {
            sv5Var.g0(i);
        } else if (i < 2048) {
            sw5 D2 = sv5Var.D2(2);
            byte[] bArr = D2.d;
            int i2 = D2.f;
            bArr[i2] = (byte) ((i >> 6) | yg1.K);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            D2.f = i2 + 2;
            sv5Var.v2(sv5Var.z2() + 2);
        } else if (55296 <= i && 57343 >= i) {
            sv5Var.g0(63);
        } else if (i < 65536) {
            sw5 D22 = sv5Var.D2(3);
            byte[] bArr2 = D22.d;
            int i3 = D22.f;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            D22.f = i3 + 3;
            sv5Var.v2(sv5Var.z2() + 3);
        } else if (i <= 1114111) {
            sw5 D23 = sv5Var.D2(4);
            byte[] bArr3 = D23.d;
            int i4 = D23.f;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            D23.f = i4 + 4;
            sv5Var.v2(sv5Var.z2() + 4);
        } else {
            StringBuilder G = wo1.G("Unexpected code point: 0x");
            G.append(pv5.p(i));
            throw new IllegalArgumentException(G.toString());
        }
        return sv5Var;
    }

    public static final long g(@NotNull sv5.a aVar, int i) {
        c25.p(aVar, "$this$commonExpandBuffer");
        if (i > 0) {
            if (i <= 8192) {
                sv5 sv5Var = aVar.s;
                if (sv5Var != null) {
                    if (aVar.t) {
                        long z2 = sv5Var.z2();
                        sw5 D2 = sv5Var.D2(i);
                        int i2 = 8192 - D2.f;
                        D2.f = 8192;
                        long j = i2;
                        sv5Var.v2(z2 + j);
                        aVar.h(D2);
                        aVar.v = z2;
                        aVar.w = D2.d;
                        aVar.x = 8192 - i2;
                        aVar.y = 8192;
                        return j;
                    }
                    throw new IllegalStateException("expandBuffer() only permitted for read/write buffers".toString());
                }
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            throw new IllegalArgumentException(wo1.l("minByteCount > Segment.SIZE: ", i).toString());
        }
        throw new IllegalArgumentException(wo1.l("minByteCount <= 0: ", i).toString());
    }

    @NotNull
    public static final byte[] g0() {
        return a;
    }

    public static final byte h(@NotNull sv5 sv5Var, long j) {
        c25.p(sv5Var, "$this$commonGet");
        pv5.e(sv5Var.z2(), j, 1L);
        sw5 sw5Var = sv5Var.s;
        if (sw5Var != null) {
            if (sv5Var.z2() - j < j) {
                long z2 = sv5Var.z2();
                while (z2 > j) {
                    sw5Var = sw5Var.j;
                    c25.m(sw5Var);
                    z2 -= sw5Var.f - sw5Var.e;
                }
                c25.m(sw5Var);
                return sw5Var.d[(int) ((sw5Var.e + j) - z2)];
            }
            long j2 = 0;
            while (true) {
                long j3 = (sw5Var.f - sw5Var.e) + j2;
                if (j3 > j) {
                    c25.m(sw5Var);
                    return sw5Var.d[(int) ((sw5Var.e + j) - j2)];
                }
                sw5Var = sw5Var.i;
                c25.m(sw5Var);
                j2 = j3;
            }
        } else {
            c25.m(null);
            throw null;
        }
    }

    public static final boolean h0(@NotNull sw5 sw5Var, int i, @NotNull byte[] bArr, int i2, int i3) {
        c25.p(sw5Var, "segment");
        c25.p(bArr, "bytes");
        int i4 = sw5Var.f;
        byte[] bArr2 = sw5Var.d;
        while (i2 < i3) {
            if (i == i4) {
                sw5Var = sw5Var.i;
                c25.m(sw5Var);
                byte[] bArr3 = sw5Var.d;
                bArr2 = bArr3;
                i = sw5Var.e;
                i4 = sw5Var.f;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static final int i(@NotNull sv5 sv5Var) {
        c25.p(sv5Var, "$this$commonHashCode");
        sw5 sw5Var = sv5Var.s;
        if (sw5Var != null) {
            int i = 1;
            do {
                int i2 = sw5Var.f;
                for (int i3 = sw5Var.e; i3 < i2; i3++) {
                    i = (i * 31) + sw5Var.d[i3];
                }
                sw5Var = sw5Var.i;
                c25.m(sw5Var);
            } while (sw5Var != sv5Var.s);
            return i;
        }
        return 0;
    }

    @NotNull
    public static final String i0(@NotNull sv5 sv5Var, long j) {
        c25.p(sv5Var, "$this$readUtf8Line");
        if (j > 0) {
            long j2 = j - 1;
            if (sv5Var.d2(j2) == ((byte) 13)) {
                String g = sv5Var.g(j2);
                sv5Var.skip(2L);
                return g;
            }
        }
        String g2 = sv5Var.g(j);
        sv5Var.skip(1L);
        return g2;
    }

    public static final long j(@NotNull sv5 sv5Var, byte b2, long j, long j2) {
        sw5 sw5Var;
        int i;
        c25.p(sv5Var, "$this$commonIndexOf");
        long j3 = 0;
        if (0 <= j && j2 >= j) {
            if (j2 > sv5Var.z2()) {
                j2 = sv5Var.z2();
            }
            if (j == j2 || (sw5Var = sv5Var.s) == null) {
                return -1L;
            }
            if (sv5Var.z2() - j < j) {
                j3 = sv5Var.z2();
                while (j3 > j) {
                    sw5Var = sw5Var.j;
                    c25.m(sw5Var);
                    j3 -= sw5Var.f - sw5Var.e;
                }
                while (j3 < j2) {
                    byte[] bArr = sw5Var.d;
                    int min = (int) Math.min(sw5Var.f, (sw5Var.e + j2) - j3);
                    i = (int) ((sw5Var.e + j) - j3);
                    while (i < min) {
                        if (bArr[i] != b2) {
                            i++;
                        }
                    }
                    j3 += sw5Var.f - sw5Var.e;
                    sw5Var = sw5Var.i;
                    c25.m(sw5Var);
                    j = j3;
                }
                return -1L;
            }
            while (true) {
                long j4 = (sw5Var.f - sw5Var.e) + j3;
                if (j4 > j) {
                    break;
                }
                sw5Var = sw5Var.i;
                c25.m(sw5Var);
                j3 = j4;
            }
            while (j3 < j2) {
                byte[] bArr2 = sw5Var.d;
                int min2 = (int) Math.min(sw5Var.f, (sw5Var.e + j2) - j3);
                i = (int) ((sw5Var.e + j) - j3);
                while (i < min2) {
                    if (bArr2[i] != b2) {
                        i++;
                    }
                }
                j3 += sw5Var.f - sw5Var.e;
                sw5Var = sw5Var.i;
                c25.m(sw5Var);
                j = j3;
            }
            return -1L;
            return (i - sw5Var.e) + j3;
        }
        StringBuilder G = wo1.G("size=");
        G.append(sv5Var.z2());
        G.append(" fromIndex=");
        G.append(j);
        G.append(" toIndex=");
        G.append(j2);
        throw new IllegalArgumentException(G.toString().toString());
    }

    public static final <T> T j0(@NotNull sv5 sv5Var, long j, @NotNull j05<? super sw5, ? super Long, ? extends T> j05Var) {
        c25.p(sv5Var, "$this$seek");
        c25.p(j05Var, "lambda");
        sw5 sw5Var = sv5Var.s;
        if (sw5Var != null) {
            if (sv5Var.z2() - j < j) {
                long z2 = sv5Var.z2();
                while (z2 > j) {
                    sw5Var = sw5Var.j;
                    c25.m(sw5Var);
                    z2 -= sw5Var.f - sw5Var.e;
                }
                return j05Var.w3(sw5Var, Long.valueOf(z2));
            }
            long j2 = 0;
            while (true) {
                long j3 = (sw5Var.f - sw5Var.e) + j2;
                if (j3 > j) {
                    return j05Var.w3(sw5Var, Long.valueOf(j2));
                }
                sw5Var = sw5Var.i;
                c25.m(sw5Var);
                j2 = j3;
            }
        } else {
            return j05Var.w3(null, -1L);
        }
    }

    public static final long k(@NotNull sv5 sv5Var, @NotNull vv5 vv5Var, long j) {
        int i;
        long j2 = j;
        c25.p(sv5Var, "$this$commonIndexOf");
        c25.p(vv5Var, "bytes");
        if (vv5Var.C3() > 0) {
            long j3 = 0;
            if (j2 >= 0) {
                sw5 sw5Var = sv5Var.s;
                if (sw5Var != null) {
                    if (sv5Var.z2() - j2 < j2) {
                        long z2 = sv5Var.z2();
                        while (z2 > j2) {
                            sw5Var = sw5Var.j;
                            c25.m(sw5Var);
                            z2 -= sw5Var.f - sw5Var.e;
                        }
                        byte[] T = vv5Var.T();
                        byte b2 = T[0];
                        int C3 = vv5Var.C3();
                        long z22 = (sv5Var.z2() - C3) + 1;
                        j3 = z2;
                        while (j3 < z22) {
                            byte[] bArr = sw5Var.d;
                            long j4 = z22;
                            int min = (int) Math.min(sw5Var.f, (sw5Var.e + z22) - j3);
                            i = (int) ((sw5Var.e + j2) - j3);
                            while (i < min) {
                                if (bArr[i] == b2 && h0(sw5Var, i + 1, T, 1, C3)) {
                                }
                                i++;
                            }
                            j3 += sw5Var.f - sw5Var.e;
                            sw5Var = sw5Var.i;
                            c25.m(sw5Var);
                            z22 = j4;
                            j2 = j3;
                        }
                        return -1L;
                    }
                    while (true) {
                        long j5 = (sw5Var.f - sw5Var.e) + j3;
                        if (j5 > j2) {
                            break;
                        }
                        sw5Var = sw5Var.i;
                        c25.m(sw5Var);
                        j3 = j5;
                    }
                    byte[] T2 = vv5Var.T();
                    byte b3 = T2[0];
                    int C32 = vv5Var.C3();
                    long z23 = (sv5Var.z2() - C32) + 1;
                    while (j3 < z23) {
                        byte[] bArr2 = sw5Var.d;
                        int min2 = (int) Math.min(sw5Var.f, (sw5Var.e + z23) - j3);
                        i = (int) ((sw5Var.e + j2) - j3);
                        while (i < min2) {
                            if (bArr2[i] != b3 || !h0(sw5Var, i + 1, T2, 1, C32)) {
                                i++;
                            }
                        }
                        j3 += sw5Var.f - sw5Var.e;
                        sw5Var = sw5Var.i;
                        c25.m(sw5Var);
                        j2 = j3;
                    }
                    return -1L;
                    return (i - sw5Var.e) + j3;
                }
                return -1L;
            }
            throw new IllegalArgumentException(wo1.p("fromIndex < 0: ", j2).toString());
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }

    public static final int k0(@NotNull sv5 sv5Var, @NotNull mw5 mw5Var, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        sw5 sw5Var;
        c25.p(sv5Var, "$this$selectPrefix");
        c25.p(mw5Var, "options");
        sw5 sw5Var2 = sv5Var.s;
        if (sw5Var2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = sw5Var2.d;
        int i5 = sw5Var2.e;
        int i6 = sw5Var2.f;
        int[] e = mw5Var.e();
        sw5 sw5Var3 = sw5Var2;
        int i7 = 0;
        int i8 = -1;
        loop0: while (true) {
            int i9 = i7 + 1;
            int i10 = e[i7];
            int i11 = i9 + 1;
            int i12 = e[i9];
            if (i12 != -1) {
                i8 = i12;
            }
            if (sw5Var3 == null) {
                break;
            }
            if (i10 >= 0) {
                i = i5 + 1;
                int i13 = bArr[i5] & 255;
                int i14 = i11 + i10;
                while (i11 != i14) {
                    if (i13 == e[i11]) {
                        i2 = e[i11 + i10];
                        if (i == i6) {
                            sw5Var3 = sw5Var3.i;
                            c25.m(sw5Var3);
                            i = sw5Var3.e;
                            bArr = sw5Var3.d;
                            i6 = sw5Var3.f;
                            if (sw5Var3 == sw5Var2) {
                                sw5Var3 = null;
                            }
                        }
                    } else {
                        i11++;
                    }
                }
                return i8;
            }
            int i15 = (i10 * (-1)) + i11;
            while (true) {
                int i16 = i5 + 1;
                int i17 = i11 + 1;
                if ((bArr[i5] & 255) != e[i11]) {
                    return i8;
                }
                boolean z2 = i17 == i15;
                if (i16 == i6) {
                    c25.m(sw5Var3);
                    sw5 sw5Var4 = sw5Var3.i;
                    c25.m(sw5Var4);
                    i4 = sw5Var4.e;
                    byte[] bArr2 = sw5Var4.d;
                    i3 = sw5Var4.f;
                    if (sw5Var4 != sw5Var2) {
                        sw5Var = sw5Var4;
                        bArr = bArr2;
                    } else if (!z2) {
                        break loop0;
                    } else {
                        bArr = bArr2;
                        sw5Var = null;
                    }
                } else {
                    sw5 sw5Var5 = sw5Var3;
                    i3 = i6;
                    i4 = i16;
                    sw5Var = sw5Var5;
                }
                if (z2) {
                    i2 = e[i17];
                    i = i4;
                    i6 = i3;
                    sw5Var3 = sw5Var;
                    break;
                }
                i5 = i4;
                i6 = i3;
                i11 = i17;
                sw5Var3 = sw5Var;
            }
            if (i2 >= 0) {
                return i2;
            }
            i7 = -i2;
            i5 = i;
        }
        if (z) {
            return -2;
        }
        return i8;
    }

    public static final long l(@NotNull sv5 sv5Var, @NotNull vv5 vv5Var, long j) {
        int i;
        int i2;
        c25.p(sv5Var, "$this$commonIndexOfElement");
        c25.p(vv5Var, "targetBytes");
        long j2 = 0;
        if (j >= 0) {
            sw5 sw5Var = sv5Var.s;
            if (sw5Var != null) {
                if (sv5Var.z2() - j < j) {
                    j2 = sv5Var.z2();
                    while (j2 > j) {
                        sw5Var = sw5Var.j;
                        c25.m(sw5Var);
                        j2 -= sw5Var.f - sw5Var.e;
                    }
                    if (vv5Var.C3() == 2) {
                        byte A = vv5Var.A(0);
                        byte A2 = vv5Var.A(1);
                        while (j2 < sv5Var.z2()) {
                            byte[] bArr = sw5Var.d;
                            i = (int) ((sw5Var.e + j) - j2);
                            int i3 = sw5Var.f;
                            while (i < i3) {
                                byte b2 = bArr[i];
                                if (b2 != A && b2 != A2) {
                                    i++;
                                }
                                i2 = sw5Var.e;
                            }
                            j2 += sw5Var.f - sw5Var.e;
                            sw5Var = sw5Var.i;
                            c25.m(sw5Var);
                            j = j2;
                        }
                    } else {
                        byte[] T = vv5Var.T();
                        while (j2 < sv5Var.z2()) {
                            byte[] bArr2 = sw5Var.d;
                            i = (int) ((sw5Var.e + j) - j2);
                            int i4 = sw5Var.f;
                            while (i < i4) {
                                byte b3 = bArr2[i];
                                for (byte b4 : T) {
                                    if (b3 == b4) {
                                        i2 = sw5Var.e;
                                    }
                                }
                                i++;
                            }
                            j2 += sw5Var.f - sw5Var.e;
                            sw5Var = sw5Var.i;
                            c25.m(sw5Var);
                            j = j2;
                        }
                    }
                    return -1L;
                }
                while (true) {
                    long j3 = (sw5Var.f - sw5Var.e) + j2;
                    if (j3 > j) {
                        break;
                    }
                    sw5Var = sw5Var.i;
                    c25.m(sw5Var);
                    j2 = j3;
                }
                if (vv5Var.C3() == 2) {
                    byte A3 = vv5Var.A(0);
                    byte A4 = vv5Var.A(1);
                    while (j2 < sv5Var.z2()) {
                        byte[] bArr3 = sw5Var.d;
                        i = (int) ((sw5Var.e + j) - j2);
                        int i5 = sw5Var.f;
                        while (i < i5) {
                            byte b5 = bArr3[i];
                            if (b5 != A3 && b5 != A4) {
                                i++;
                            }
                            i2 = sw5Var.e;
                        }
                        j2 += sw5Var.f - sw5Var.e;
                        sw5Var = sw5Var.i;
                        c25.m(sw5Var);
                        j = j2;
                    }
                } else {
                    byte[] T2 = vv5Var.T();
                    while (j2 < sv5Var.z2()) {
                        byte[] bArr4 = sw5Var.d;
                        i = (int) ((sw5Var.e + j) - j2);
                        int i6 = sw5Var.f;
                        while (i < i6) {
                            byte b6 = bArr4[i];
                            for (byte b7 : T2) {
                                if (b6 == b7) {
                                    i2 = sw5Var.e;
                                }
                            }
                            i++;
                        }
                        j2 += sw5Var.f - sw5Var.e;
                        sw5Var = sw5Var.i;
                        c25.m(sw5Var);
                        j = j2;
                    }
                }
                return -1L;
                return (i - i2) + j2;
            }
            return -1L;
        }
        throw new IllegalArgumentException(wo1.p("fromIndex < 0: ", j).toString());
    }

    public static /* synthetic */ int l0(sv5 sv5Var, mw5 mw5Var, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return k0(sv5Var, mw5Var, z);
    }

    public static final int m(@NotNull sv5.a aVar) {
        c25.p(aVar, "$this$commonNext");
        long j = aVar.v;
        sv5 sv5Var = aVar.s;
        c25.m(sv5Var);
        if (j != sv5Var.z2()) {
            long j2 = aVar.v;
            return aVar.f(j2 == -1 ? 0L : j2 + (aVar.y - aVar.x));
        }
        throw new IllegalStateException("no more bytes".toString());
    }

    public static final boolean n(@NotNull sv5 sv5Var, long j, @NotNull vv5 vv5Var, int i, int i2) {
        c25.p(sv5Var, "$this$commonRangeEquals");
        c25.p(vv5Var, "bytes");
        if (j < 0 || i < 0 || i2 < 0 || sv5Var.z2() - j < i2 || vv5Var.C3() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (sv5Var.d2(i3 + j) != vv5Var.A(i + i3)) {
                return false;
            }
        }
        return true;
    }

    public static final int o(@NotNull sv5 sv5Var, @NotNull byte[] bArr) {
        c25.p(sv5Var, "$this$commonRead");
        c25.p(bArr, "sink");
        return sv5Var.read(bArr, 0, bArr.length);
    }

    public static final int p(@NotNull sv5 sv5Var, @NotNull byte[] bArr, int i, int i2) {
        c25.p(sv5Var, "$this$commonRead");
        c25.p(bArr, "sink");
        pv5.e(bArr.length, i, i2);
        sw5 sw5Var = sv5Var.s;
        if (sw5Var != null) {
            int min = Math.min(i2, sw5Var.f - sw5Var.e);
            byte[] bArr2 = sw5Var.d;
            int i3 = sw5Var.e;
            zr4.W0(bArr2, bArr, i, i3, i3 + min);
            sw5Var.e += min;
            sv5Var.v2(sv5Var.z2() - min);
            if (sw5Var.e == sw5Var.f) {
                sv5Var.s = sw5Var.b();
                tw5.d(sw5Var);
            }
            return min;
        }
        return -1;
    }

    public static final long q(@NotNull sv5 sv5Var, @NotNull sv5 sv5Var2, long j) {
        c25.p(sv5Var, "$this$commonRead");
        c25.p(sv5Var2, "sink");
        if (j >= 0) {
            if (sv5Var.z2() == 0) {
                return -1L;
            }
            if (j > sv5Var.z2()) {
                j = sv5Var.z2();
            }
            sv5Var2.write(sv5Var, j);
            return j;
        }
        throw new IllegalArgumentException(wo1.p("byteCount < 0: ", j).toString());
    }

    public static final long r(@NotNull sv5 sv5Var, @NotNull vw5 vw5Var) {
        c25.p(sv5Var, "$this$commonReadAll");
        c25.p(vw5Var, "sink");
        long z2 = sv5Var.z2();
        if (z2 > 0) {
            vw5Var.write(sv5Var, z2);
        }
        return z2;
    }

    @NotNull
    public static final sv5.a s(@NotNull sv5 sv5Var, @NotNull sv5.a aVar) {
        c25.p(sv5Var, "$this$commonReadAndWriteUnsafe");
        c25.p(aVar, "unsafeCursor");
        if (aVar.s == null) {
            aVar.s = sv5Var;
            aVar.t = true;
            return aVar;
        }
        throw new IllegalStateException("already attached to a buffer".toString());
    }

    public static final byte t(@NotNull sv5 sv5Var) {
        c25.p(sv5Var, "$this$commonReadByte");
        if (sv5Var.z2() != 0) {
            sw5 sw5Var = sv5Var.s;
            c25.m(sw5Var);
            int i = sw5Var.e;
            int i2 = sw5Var.f;
            int i3 = i + 1;
            byte b2 = sw5Var.d[i];
            sv5Var.v2(sv5Var.z2() - 1);
            if (i3 == i2) {
                sv5Var.s = sw5Var.b();
                tw5.d(sw5Var);
            } else {
                sw5Var.e = i3;
            }
            return b2;
        }
        throw new EOFException();
    }

    @NotNull
    public static final byte[] u(@NotNull sv5 sv5Var) {
        c25.p(sv5Var, "$this$commonReadByteArray");
        return sv5Var.r1(sv5Var.z2());
    }

    @NotNull
    public static final byte[] v(@NotNull sv5 sv5Var, long j) {
        c25.p(sv5Var, "$this$commonReadByteArray");
        if (j >= 0 && j <= ((long) Integer.MAX_VALUE)) {
            if (sv5Var.z2() >= j) {
                byte[] bArr = new byte[(int) j];
                sv5Var.readFully(bArr);
                return bArr;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(wo1.p("byteCount: ", j).toString());
    }

    @NotNull
    public static final vv5 w(@NotNull sv5 sv5Var) {
        c25.p(sv5Var, "$this$commonReadByteString");
        return sv5Var.D(sv5Var.z2());
    }

    @NotNull
    public static final vv5 x(@NotNull sv5 sv5Var, long j) {
        c25.p(sv5Var, "$this$commonReadByteString");
        if (j >= 0 && j <= ((long) Integer.MAX_VALUE)) {
            if (sv5Var.z2() >= j) {
                if (j >= 4096) {
                    vv5 C2 = sv5Var.C2((int) j);
                    sv5Var.skip(j);
                    return C2;
                }
                return new vv5(sv5Var.r1(j));
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(wo1.p("byteCount: ", j).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00b0 A[EDGE_INSN: B:102:0x00b0->B:94:0x00b0 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long y(@NotNull sv5 sv5Var) {
        c25.p(sv5Var, "$this$commonReadDecimalLong");
        long j = 0;
        if (sv5Var.z2() != 0) {
            long j2 = -7;
            int i = 0;
            boolean z = false;
            boolean z2 = false;
            do {
                sw5 sw5Var = sv5Var.s;
                c25.m(sw5Var);
                byte[] bArr = sw5Var.d;
                int i2 = sw5Var.e;
                int i3 = sw5Var.f;
                while (i2 < i3) {
                    byte b2 = bArr[i2];
                    byte b3 = (byte) 48;
                    if (b2 >= b3 && b2 <= ((byte) 57)) {
                        int i4 = b3 - b2;
                        int i5 = (j > c ? 1 : (j == c ? 0 : -1));
                        if (i5 < 0 || (i5 == 0 && i4 < j2)) {
                            sv5 g0 = new sv5().Q1(j).g0(b2);
                            if (!z) {
                                g0.readByte();
                            }
                            StringBuilder G = wo1.G("Number too large: ");
                            G.append(g0.u1());
                            throw new NumberFormatException(G.toString());
                        }
                        j = (j * 10) + i4;
                    } else if (b2 == ((byte) 45) && i == 0) {
                        j2--;
                        z = true;
                    } else if (i == 0) {
                        StringBuilder G2 = wo1.G("Expected leading [0-9] or '-' character but was 0x");
                        G2.append(pv5.o(b2));
                        throw new NumberFormatException(G2.toString());
                    } else {
                        z2 = true;
                        if (i2 != i3) {
                            sv5Var.s = sw5Var.b();
                            tw5.d(sw5Var);
                        } else {
                            sw5Var.e = i2;
                        }
                        if (!z2) {
                            break;
                        }
                    }
                    i2++;
                    i++;
                }
                if (i2 != i3) {
                }
                if (!z2) {
                }
            } while (sv5Var.s != null);
            sv5Var.v2(sv5Var.z2() - i);
            return z ? j : -j;
        }
        throw new EOFException();
    }

    public static final void z(@NotNull sv5 sv5Var, @NotNull sv5 sv5Var2, long j) {
        c25.p(sv5Var, "$this$commonReadFully");
        c25.p(sv5Var2, "sink");
        if (sv5Var.z2() >= j) {
            sv5Var2.write(sv5Var, j);
        } else {
            sv5Var2.write(sv5Var, sv5Var.z2());
            throw new EOFException();
        }
    }
}