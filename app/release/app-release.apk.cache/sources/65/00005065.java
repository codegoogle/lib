package com.p7700g.p99005;

import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.p7700g.p99005.ee5;
import com.p7700g.p99005.hm5;
import com.p7700g.p99005.qm3;
import com.p7700g.p99005.xv4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: JobSupport.kt */
@vo4(d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0001\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0017\u0018\u00002\u00020X2\u00020\u00172\u00020\u007f2\u00030Ã\u0001:\u0006Ò\u0001Ó\u0001Ô\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001dJ\u0019\u0010!\u001a\u00020\u00012\b\u0010 \u001a\u0004\u0018\u00010\rH\u0017¢\u0006\u0004\b!\u0010\"J\u001f\u0010!\u001a\u00020\u00112\u000e\u0010 \u001a\n\u0018\u00010#j\u0004\u0018\u0001`$H\u0016¢\u0006\u0004\b!\u0010%J\u0017\u0010&\u001a\u00020\u00012\b\u0010 \u001a\u0004\u0018\u00010\r¢\u0006\u0004\b&\u0010\"J\u0019\u0010)\u001a\u00020\u00012\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\rH\u0016¢\u0006\u0004\b*\u0010+J\u001b\u0010,\u001a\u0004\u0018\u00010\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\rH\u0002¢\u0006\u0004\b.\u0010\"J\u000f\u00100\u001a\u00020/H\u0014¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\rH\u0016¢\u0006\u0004\b2\u0010\"J!\u00105\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b5\u00106J)\u0010;\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u0002072\u0006\u00109\u001a\u0002082\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b;\u0010<J\u0019\u0010=\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b=\u0010>J(\u0010C\u001a\u00020@2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010/2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\rH\u0080\b¢\u0006\u0004\bA\u0010BJ#\u0010D\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u0002072\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\bD\u0010EJ\u0019\u0010F\u001a\u0004\u0018\u0001082\u0006\u0010\u0014\u001a\u000203H\u0002¢\u0006\u0004\bF\u0010GJ\u0011\u0010H\u001a\u00060#j\u0002`$¢\u0006\u0004\bH\u0010IJ\u0013\u0010J\u001a\u00060#j\u0002`$H\u0016¢\u0006\u0004\bJ\u0010IJ\u0011\u0010M\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\bK\u0010LJ\u000f\u0010N\u001a\u0004\u0018\u00010\r¢\u0006\u0004\bN\u0010OJ'\u0010P\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0014\u001a\u0002072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0002¢\u0006\u0004\bP\u0010QJ\u0019\u0010R\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0014\u001a\u000203H\u0002¢\u0006\u0004\bR\u0010SJ\u0017\u0010U\u001a\u00020\u00012\u0006\u0010T\u001a\u00020\rH\u0014¢\u0006\u0004\bU\u0010\"J\u0017\u0010W\u001a\u00020\u00112\u0006\u0010T\u001a\u00020\rH\u0010¢\u0006\u0004\bV\u0010+J\u0019\u0010Z\u001a\u00020\u00112\b\u0010Y\u001a\u0004\u0018\u00010XH\u0004¢\u0006\u0004\bZ\u0010[JF\u0010d\u001a\u00020c2\u0006\u0010\\\u001a\u00020\u00012\u0006\u0010]\u001a\u00020\u00012'\u0010b\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b_\u0012\b\b`\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00110^j\u0002`a¢\u0006\u0004\bd\u0010eJ6\u0010d\u001a\u00020c2'\u0010b\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b_\u0012\b\b`\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00110^j\u0002`a¢\u0006\u0004\bd\u0010fJ\u0013\u0010g\u001a\u00020\u0011H\u0086@ø\u0001\u0000¢\u0006\u0004\bg\u0010\u001dJ\u000f\u0010h\u001a\u00020\u0001H\u0002¢\u0006\u0004\bh\u0010iJ\u0013\u0010j\u001a\u00020\u0011H\u0082@ø\u0001\u0000¢\u0006\u0004\bj\u0010\u001dJ&\u0010m\u001a\u00020l2\u0014\u0010k\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00110^H\u0082\b¢\u0006\u0004\bm\u0010nJ\u001b\u0010o\u001a\u0004\u0018\u00010\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\bo\u0010-J\u0019\u0010q\u001a\u00020\u00012\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\bp\u0010(J\u001b\u0010s\u001a\u0004\u0018\u00010\u00052\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\br\u0010-J@\u0010t\u001a\u00020\t2'\u0010b\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b_\u0012\b\b`\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00110^j\u0002`a2\u0006\u0010\\\u001a\u00020\u0001H\u0002¢\u0006\u0004\bt\u0010uJ\u000f\u0010w\u001a\u00020/H\u0010¢\u0006\u0004\bv\u00101J\u001f\u0010x\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\rH\u0002¢\u0006\u0004\bx\u0010yJ.\u0010{\u001a\u00020\u0011\"\n\b\u0000\u0010z\u0018\u0001*\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\rH\u0082\b¢\u0006\u0004\b{\u0010yJ\u0019\u0010\\\u001a\u00020\u00112\b\u0010 \u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\\\u0010+J\u0019\u0010|\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b|\u0010\u0016J\u000f\u0010}\u001a\u00020\u0011H\u0014¢\u0006\u0004\b}\u0010~J\u0019\u0010\u0081\u0001\u001a\u00020\u00112\u0007\u0010\u0080\u0001\u001a\u00020\u007f¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u001b\u0010\u0084\u0001\u001a\u00020\u00112\u0007\u0010\u0014\u001a\u00030\u0083\u0001H\u0002¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u001a\u0010\u0086\u0001\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001JI\u0010\u008c\u0001\u001a\u00020\u0011\"\u0005\b\u0000\u0010\u0088\u00012\u000e\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0089\u00012\u001d\u0010k\u001a\u0019\b\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00000\u008b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00050^ø\u0001\u0000¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001JX\u0010\u0091\u0001\u001a\u00020\u0011\"\u0004\b\u0000\u0010z\"\u0005\b\u0001\u0010\u0088\u00012\u000e\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u0089\u00012$\u0010k\u001a \b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00010\u008b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u008e\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u001a\u0010\u0093\u0001\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0006\b\u0092\u0001\u0010\u0087\u0001JX\u0010\u0095\u0001\u001a\u00020\u0011\"\u0004\b\u0000\u0010z\"\u0005\b\u0001\u0010\u0088\u00012\u000e\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u0089\u00012$\u0010k\u001a \b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00010\u008b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u008e\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b\u0094\u0001\u0010\u0090\u0001J\u000f\u0010\u0096\u0001\u001a\u00020\u0001¢\u0006\u0005\b\u0096\u0001\u0010iJ\u001d\u0010\u0098\u0001\u001a\u00030\u0097\u00012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u001c\u0010\u009a\u0001\u001a\u00020/2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u0011\u0010\u009c\u0001\u001a\u00020/H\u0007¢\u0006\u0005\b\u009c\u0001\u00101J\u0011\u0010\u009d\u0001\u001a\u00020/H\u0016¢\u0006\u0005\b\u009d\u0001\u00101J$\u0010\u009e\u0001\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\"\u0010 \u0001\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u0002032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0006\b \u0001\u0010¡\u0001J(\u0010¢\u0001\u001a\u0004\u0018\u00010\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u00052\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0006\b¢\u0001\u0010£\u0001J&\u0010¤\u0001\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u0002032\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0006\b¤\u0001\u0010¥\u0001J-\u0010¦\u0001\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u0002072\u0006\u0010\u0018\u001a\u0002082\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0082\u0010¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u0019\u0010©\u0001\u001a\u0004\u0018\u000108*\u00030¨\u0001H\u0002¢\u0006\u0006\b©\u0001\u0010ª\u0001J\u001f\u0010«\u0001\u001a\u00020\u0011*\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0005\b«\u0001\u0010yJ&\u0010¬\u0001\u001a\u00060#j\u0002`$*\u00020\r2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010/H\u0004¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001R\u001b\u0010±\u0001\u001a\t\u0012\u0004\u0012\u00020X0®\u00018F¢\u0006\b\u001a\u0006\b¯\u0001\u0010°\u0001R\u0018\u0010³\u0001\u001a\u0004\u0018\u00010\r8DX\u0084\u0004¢\u0006\u0007\u001a\u0005\b²\u0001\u0010OR\u0016\u0010µ\u0001\u001a\u00020\u00018DX\u0084\u0004¢\u0006\u0007\u001a\u0005\b´\u0001\u0010iR\u0016\u0010·\u0001\u001a\u00020\u00018PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b¶\u0001\u0010iR\u0016\u0010¸\u0001\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¸\u0001\u0010iR\u0013\u0010¹\u0001\u001a\u00020\u00018F¢\u0006\u0007\u001a\u0005\b¹\u0001\u0010iR\u0013\u0010º\u0001\u001a\u00020\u00018F¢\u0006\u0007\u001a\u0005\bº\u0001\u0010iR\u0013\u0010»\u0001\u001a\u00020\u00018F¢\u0006\u0007\u001a\u0005\b»\u0001\u0010iR\u0016\u0010¼\u0001\u001a\u00020\u00018TX\u0094\u0004¢\u0006\u0007\u001a\u0005\b¼\u0001\u0010iR\u0019\u0010À\u0001\u001a\u0007\u0012\u0002\b\u00030½\u00018F¢\u0006\b\u001a\u0006\b¾\u0001\u0010¿\u0001R\u0016\u0010Â\u0001\u001a\u00020\u00018PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bÁ\u0001\u0010iR\u0015\u0010Æ\u0001\u001a\u00030Ã\u00018F¢\u0006\b\u001a\u0006\bÄ\u0001\u0010Å\u0001R.\u0010Ì\u0001\u001a\u0004\u0018\u00010\u00192\t\u0010Ç\u0001\u001a\u0004\u0018\u00010\u00198@@@X\u0080\u000e¢\u0006\u0010\u001a\u0006\bÈ\u0001\u0010É\u0001\"\u0006\bÊ\u0001\u0010Ë\u0001R\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00058@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÍ\u0001\u0010LR\u001e\u0010Ï\u0001\u001a\u0004\u0018\u00010\r*\u0004\u0018\u00010\u00058BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÎ\u0001\u0010>R\u001b\u0010Ð\u0001\u001a\u00020\u0001*\u0002038BX\u0082\u0004¢\u0006\b\u001a\u0006\bÐ\u0001\u0010Ñ\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Õ\u0001"}, d2 = {"Lkotlinx/coroutines/JobSupport;", "", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "<init>", "(Z)V", "", "expect", "Lkotlinx/coroutines/NodeList;", "list", "Lkotlinx/coroutines/JobNode;", "node", "addLastAtomic", "(Ljava/lang/Object;Lkotlinx/coroutines/NodeList;Lkotlinx/coroutines/JobNode;)Z", "", "rootCause", "", "exceptions", "", "addSuppressedExceptions", "(Ljava/lang/Throwable;Ljava/util/List;)V", CallMraidJS.b, "afterCompletion", "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/ChildJob;", "child", "Lkotlinx/coroutines/ChildHandle;", "attachChild", "(Lkotlinx/coroutines/ChildJob;)Lkotlinx/coroutines/ChildHandle;", "awaitInternal$kotlinx_coroutines_core", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitInternal", "awaitSuspend", "cause", com.anythink.expressad.d.a.b.dO, "(Ljava/lang/Throwable;)Z", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "(Ljava/util/concurrent/CancellationException;)V", "cancelCoroutine", "cancelImpl$kotlinx_coroutines_core", "(Ljava/lang/Object;)Z", "cancelImpl", "cancelInternal", "(Ljava/lang/Throwable;)V", "cancelMakeCompleting", "(Ljava/lang/Object;)Ljava/lang/Object;", "cancelParent", "", "cancellationExceptionMessage", "()Ljava/lang/String;", "childCancelled", "Lkotlinx/coroutines/Incomplete;", "update", "completeStateFinalization", "(Lkotlinx/coroutines/Incomplete;Ljava/lang/Object;)V", "Lkotlinx/coroutines/JobSupport$Finishing;", "Lkotlinx/coroutines/ChildHandleNode;", "lastChild", "proposedUpdate", "continueCompleting", "(Lkotlinx/coroutines/JobSupport$Finishing;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)V", "createCauseException", "(Ljava/lang/Object;)Ljava/lang/Throwable;", qm3.b.j, "Lkotlinx/coroutines/JobCancellationException;", "defaultCancellationException$kotlinx_coroutines_core", "(Ljava/lang/String;Ljava/lang/Throwable;)Lkotlinx/coroutines/JobCancellationException;", "defaultCancellationException", "finalizeFinishingState", "(Lkotlinx/coroutines/JobSupport$Finishing;Ljava/lang/Object;)Ljava/lang/Object;", "firstChild", "(Lkotlinx/coroutines/Incomplete;)Lkotlinx/coroutines/ChildHandleNode;", "getCancellationException", "()Ljava/util/concurrent/CancellationException;", "getChildJobCancellationCause", "getCompletedInternal$kotlinx_coroutines_core", "()Ljava/lang/Object;", "getCompletedInternal", "getCompletionExceptionOrNull", "()Ljava/lang/Throwable;", "getFinalRootCause", "(Lkotlinx/coroutines/JobSupport$Finishing;Ljava/util/List;)Ljava/lang/Throwable;", "getOrPromoteCancellingList", "(Lkotlinx/coroutines/Incomplete;)Lkotlinx/coroutines/NodeList;", "exception", "handleJobException", "handleOnCompletionException$kotlinx_coroutines_core", "handleOnCompletionException", "Lkotlinx/coroutines/Job;", "parent", "initParentJob", "(Lkotlinx/coroutines/Job;)V", "onCancelling", "invokeImmediately", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lkotlinx/coroutines/DisposableHandle;", "invokeOnCompletion", "(ZZLkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;", "join", "joinInternal", "()Z", "joinSuspend", "block", "", "loopOnState", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Void;", "makeCancelling", "makeCompleting$kotlinx_coroutines_core", "makeCompleting", "makeCompletingOnce$kotlinx_coroutines_core", "makeCompletingOnce", "makeNode", "(Lkotlin/jvm/functions/Function1;Z)Lkotlinx/coroutines/JobNode;", "nameString$kotlinx_coroutines_core", "nameString", "notifyCancelling", "(Lkotlinx/coroutines/NodeList;Ljava/lang/Throwable;)V", "T", "notifyHandlers", "onCompletionInternal", "onStart", "()V", "Lkotlinx/coroutines/ParentJob;", "parentJob", "parentCancelled", "(Lkotlinx/coroutines/ParentJob;)V", "Lkotlinx/coroutines/Empty;", "promoteEmptyToNodeList", "(Lkotlinx/coroutines/Empty;)V", "promoteSingleToNodeList", "(Lkotlinx/coroutines/JobNode;)V", "R", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "Lkotlin/coroutines/Continuation;", "registerSelectClause0", "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "registerSelectClause1Internal$kotlinx_coroutines_core", "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;)V", "registerSelectClause1Internal", "removeNode$kotlinx_coroutines_core", "removeNode", "selectAwaitCompletion$kotlinx_coroutines_core", "selectAwaitCompletion", com.anythink.expressad.foundation.d.c.bR, "", "startInternal", "(Ljava/lang/Object;)I", "stateString", "(Ljava/lang/Object;)Ljava/lang/String;", "toDebugString", "toString", "tryFinalizeSimpleState", "(Lkotlinx/coroutines/Incomplete;Ljava/lang/Object;)Z", "tryMakeCancelling", "(Lkotlinx/coroutines/Incomplete;Ljava/lang/Throwable;)Z", "tryMakeCompleting", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "tryMakeCompletingSlowPath", "(Lkotlinx/coroutines/Incomplete;Ljava/lang/Object;)Ljava/lang/Object;", "tryWaitForChild", "(Lkotlinx/coroutines/JobSupport$Finishing;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "nextChild", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Lkotlinx/coroutines/ChildHandleNode;", "notifyCompletion", "toCancellationException", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;", "Lkotlin/sequences/Sequence;", "getChildren", "()Lkotlin/sequences/Sequence;", "children", "getCompletionCause", "completionCause", "getCompletionCauseHandled", "completionCauseHandled", "getHandlesException$kotlinx_coroutines_core", "handlesException", "isActive", "isCancelled", "isCompleted", "isCompletedExceptionally", "isScopedCoroutine", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "key", "getOnCancelComplete$kotlinx_coroutines_core", "onCancelComplete", "Lkotlinx/coroutines/selects/SelectClause0;", "getOnJoin", "()Lkotlinx/coroutines/selects/SelectClause0;", "onJoin", "value", "getParentHandle$kotlinx_coroutines_core", "()Lkotlinx/coroutines/ChildHandle;", "setParentHandle$kotlinx_coroutines_core", "(Lkotlinx/coroutines/ChildHandle;)V", "parentHandle", "getState$kotlinx_coroutines_core", "getExceptionOrNull", "exceptionOrNull", "isCancelling", "(Lkotlinx/coroutines/Incomplete;)Z", "AwaitContinuation", "ChildCompletion", "Finishing", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
@xn4(level = zn4.ERROR, message = "This is internal API and may be removed in the future releases")
/* loaded from: classes3.dex */
public class me5 implements ee5, ob5, we5, ko5 {
    private static final /* synthetic */ AtomicReferenceFieldUpdater s = AtomicReferenceFieldUpdater.newUpdater(me5.class, Object.class, "_state");
    @NotNull
    private volatile /* synthetic */ Object _parentHandle;
    @NotNull
    private volatile /* synthetic */ Object _state;

    /* compiled from: JobSupport.kt */
    @vo4(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/JobSupport$AwaitContinuation;", "T", "Lkotlinx/coroutines/CancellableContinuationImpl;", "delegate", "Lkotlin/coroutines/Continuation;", "job", "Lkotlinx/coroutines/JobSupport;", "(Lkotlin/coroutines/Continuation;Lkotlinx/coroutines/JobSupport;)V", "getContinuationCancellationCause", "", "parent", "Lkotlinx/coroutines/Job;", "nameString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a<T> extends hb5<T> {
        @NotNull
        private final me5 A;

        public a(@NotNull uv4<? super T> uv4Var, @NotNull me5 me5Var) {
            super(uv4Var, 1);
            this.A = me5Var;
        }

        @Override // com.p7700g.p99005.hb5
        @NotNull
        public String F() {
            return "AwaitContinuation";
        }

        @Override // com.p7700g.p99005.hb5
        @NotNull
        public Throwable w(@NotNull ee5 ee5Var) {
            Throwable d;
            Object C0 = this.A.C0();
            return (!(C0 instanceof c) || (d = ((c) C0).d()) == null) ? C0 instanceof ub5 ? ((ub5) C0).b : ee5Var.c1() : d;
        }
    }

    /* compiled from: JobSupport.kt */
    @vo4(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/JobSupport$ChildCompletion;", "Lkotlinx/coroutines/JobNode;", "parent", "Lkotlinx/coroutines/JobSupport;", CallMraidJS.b, "Lkotlinx/coroutines/JobSupport$Finishing;", "child", "Lkotlinx/coroutines/ChildHandleNode;", "proposedUpdate", "", "(Lkotlinx/coroutines/JobSupport;Lkotlinx/coroutines/JobSupport$Finishing;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)V", "invoke", "", "cause", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends le5 {
        @NotNull
        private final me5 w;
        @NotNull
        private final c x;
        @NotNull
        private final nb5 y;
        @Nullable
        private final Object z;

        public b(@NotNull me5 me5Var, @NotNull c cVar, @NotNull nb5 nb5Var, @Nullable Object obj) {
            this.w = me5Var;
            this.x = cVar;
            this.y = nb5Var;
            this.z = obj;
        }

        @Override // com.p7700g.p99005.wb5
        public void D0(@Nullable Throwable th) {
            this.w.l0(this.x, this.y, this.z);
        }

        @Override // com.p7700g.p99005.f05
        public /* bridge */ /* synthetic */ yq4 M(Throwable th) {
            D0(th);
            return yq4.a;
        }
    }

    /* compiled from: JobSupport.kt */
    @vo4(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0002\u0018\u00002\u00060\u0018j\u0002`,2\u00020-B!\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00050\rj\b\u0012\u0004\u0012\u00020\u0005`\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R(\u0010\u001e\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00188B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b!\u0010 R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010 \"\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b$\u0010 R\u001a\u0010\u0002\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0002\u0010%\u001a\u0004\b&\u0010'R(\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010\f¨\u0006+"}, d2 = {"Lkotlinx/coroutines/JobSupport$Finishing;", "Lkotlinx/coroutines/NodeList;", "list", "", "isCompleting", "", "rootCause", "<init>", "(Lkotlinx/coroutines/NodeList;ZLjava/lang/Throwable;)V", "exception", "", "addExceptionLocked", "(Ljava/lang/Throwable;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "allocateList", "()Ljava/util/ArrayList;", "proposedException", "", "sealLocked", "(Ljava/lang/Throwable;)Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "", "value", "getExceptionsHolder", "()Ljava/lang/Object;", "setExceptionsHolder", "(Ljava/lang/Object;)V", "exceptionsHolder", "isActive", "()Z", "isCancelling", "setCompleting", "(Z)V", "isSealed", "Lkotlinx/coroutines/NodeList;", "getList", "()Lkotlinx/coroutines/NodeList;", "getRootCause", "()Ljava/lang/Throwable;", "setRootCause", "kotlinx-coroutines-core", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lkotlinx/coroutines/Incomplete;"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c implements xd5 {
        @NotNull
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        @NotNull
        private volatile /* synthetic */ int _isCompleting;
        @NotNull
        private volatile /* synthetic */ Object _rootCause;
        @NotNull
        private final re5 s;

        public c(@NotNull re5 re5Var, boolean z, @Nullable Throwable th) {
            this.s = re5Var;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }

        private final ArrayList<Throwable> b() {
            return new ArrayList<>(4);
        }

        private final Object c() {
            return this._exceptionsHolder;
        }

        private final void k(Object obj) {
            this._exceptionsHolder = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(@NotNull Throwable th) {
            Throwable d = d();
            if (d == null) {
                l(th);
            } else if (th == d) {
            } else {
                Object c = c();
                if (c == null) {
                    k(th);
                } else if (!(c instanceof Throwable)) {
                    if (!(c instanceof ArrayList)) {
                        throw new IllegalStateException(c25.C("State is ", c).toString());
                    }
                    ((ArrayList) c).add(th);
                } else if (th == c) {
                } else {
                    ArrayList<Throwable> b = b();
                    b.add(c);
                    b.add(th);
                    k(b);
                }
            }
        }

        @Nullable
        public final Throwable d() {
            return (Throwable) this._rootCause;
        }

        public final boolean e() {
            return d() != null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
        public final boolean f() {
            return this._isCompleting;
        }

        public final boolean g() {
            return c() == ne5.e();
        }

        @Override // com.p7700g.p99005.xd5
        public boolean h() {
            return d() == null;
        }

        @NotNull
        public final List<Throwable> i(@Nullable Throwable th) {
            ArrayList<Throwable> arrayList;
            Object c = c();
            if (c == null) {
                arrayList = b();
            } else if (c instanceof Throwable) {
                ArrayList<Throwable> b = b();
                b.add(c);
                arrayList = b;
            } else if (!(c instanceof ArrayList)) {
                throw new IllegalStateException(c25.C("State is ", c).toString());
            } else {
                arrayList = (ArrayList) c;
            }
            Throwable d = d();
            if (d != null) {
                arrayList.add(0, d);
            }
            if (th != null && !c25.g(th, d)) {
                arrayList.add(th);
            }
            k(ne5.e());
            return arrayList;
        }

        public final void j(boolean z) {
            this._isCompleting = z ? 1 : 0;
        }

        public final void l(@Nullable Throwable th) {
            this._rootCause = th;
        }

        @Override // com.p7700g.p99005.xd5
        @NotNull
        public re5 r() {
            return this.s;
        }

        @NotNull
        public String toString() {
            StringBuilder G = wo1.G("Finishing[cancelling=");
            G.append(e());
            G.append(", completing=");
            G.append(f());
            G.append(", rootCause=");
            G.append(d());
            G.append(", exceptions=");
            G.append(c());
            G.append(", list=");
            G.append(r());
            G.append(f14.v);
            return G.toString();
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    @vo4(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/internal/LockFreeLinkedListNode$makeCondAddOp$1", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "prepare", "", "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d extends hm5.c {
        public final /* synthetic */ hm5 d;
        public final /* synthetic */ me5 e;
        public final /* synthetic */ Object f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(hm5 hm5Var, me5 me5Var, Object obj) {
            super(hm5Var);
            this.d = hm5Var;
            this.e = me5Var;
            this.f = obj;
        }

        @Override // com.p7700g.p99005.ml5
        @Nullable
        /* renamed from: k */
        public Object i(@NotNull hm5 hm5Var) {
            if (this.e.C0() == this.f) {
                return null;
            }
            return gm5.a();
        }
    }

    /* compiled from: JobSupport.kt */
    @mw4(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", i = {1, 1, 1}, l = {952, 954}, m = "invokeSuspend", n = {"$this$sequence", "this_$iv", "cur$iv"}, s = {"L$0", "L$1", "L$2"})
    @vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Lkotlinx/coroutines/Job;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e extends rw4 implements j05<i75<? super ee5>, uv4<? super yq4>, Object> {
        public Object u;
        public Object v;
        public int w;
        private /* synthetic */ Object x;

        public e(uv4<? super e> uv4Var) {
            super(2, uv4Var);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0069 -> B:28:0x007f). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x007c -> B:28:0x007f). Please submit an issue!!! */
        @Override // com.p7700g.p99005.hw4
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object D1(@NotNull Object obj) {
            re5 r;
            i75 i75Var;
            e eVar;
            Object obj2;
            hm5 hm5Var;
            Object h = gw4.h();
            int i = this.w;
            if (i == 0) {
                rp4.n(obj);
                i75 i75Var2 = (i75) this.x;
                Object C0 = me5.this.C0();
                if (C0 instanceof nb5) {
                    ob5 ob5Var = ((nb5) C0).w;
                    this.w = 1;
                    if (i75Var2.b(ob5Var, this) == h) {
                        return h;
                    }
                } else if ((C0 instanceof xd5) && (r = ((xd5) C0).r()) != null) {
                    i75Var = i75Var2;
                    eVar = this;
                    obj2 = r;
                    hm5Var = (hm5) r.m0();
                    if (!c25.g(hm5Var, obj2)) {
                    }
                }
            } else if (i == 1) {
                rp4.n(obj);
            } else if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                hm5Var = (hm5) this.v;
                obj2 = (fm5) this.u;
                i75Var = (i75) this.x;
                rp4.n(obj);
                eVar = this;
                hm5Var = hm5Var.n0();
                if (!c25.g(hm5Var, obj2)) {
                    if (hm5Var instanceof nb5) {
                        ob5 ob5Var2 = ((nb5) hm5Var).w;
                        eVar.x = i75Var;
                        eVar.u = obj2;
                        eVar.v = hm5Var;
                        eVar.w = 2;
                        if (i75Var.b(ob5Var2, eVar) == h) {
                            return h;
                        }
                    }
                    hm5Var = hm5Var.n0();
                    if (!c25.g(hm5Var, obj2)) {
                    }
                }
            }
            return yq4.a;
        }

        @Override // com.p7700g.p99005.hw4
        @NotNull
        public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
            e eVar = new e(uv4Var);
            eVar.x = obj;
            return eVar;
        }

        @Override // com.p7700g.p99005.j05
        @Nullable
        /* renamed from: t3 */
        public final Object w3(@NotNull i75<? super ee5> i75Var, @Nullable uv4<? super yq4> uv4Var) {
            return ((e) X(i75Var, uv4Var)).D1(yq4.a);
        }
    }

    public me5(boolean z) {
        this._state = z ? ne5.c() : ne5.d();
        this._parentHandle = null;
    }

    private final re5 A0(xd5 xd5Var) {
        re5 r = xd5Var.r();
        if (r == null) {
            if (xd5Var instanceof jd5) {
                return new re5();
            }
            if (xd5Var instanceof le5) {
                a1((le5) xd5Var);
                return null;
            }
            throw new IllegalStateException(c25.C("State should have list: ", xd5Var).toString());
        }
        return r;
    }

    private final boolean G0(xd5 xd5Var) {
        return (xd5Var instanceof c) && ((c) xd5Var).e();
    }

    private final boolean J0() {
        Object C0;
        do {
            C0 = C0();
            if (!(C0 instanceof xd5)) {
                return false;
            }
        } while (h1(C0) < 0);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object K0(uv4<? super yq4> uv4Var) {
        hb5 hb5Var = new hb5(fw4.d(uv4Var), 1);
        hb5Var.T();
        jb5.a(hb5Var, d3(new ze5(hb5Var)));
        Object x = hb5Var.x();
        if (x == gw4.h()) {
            ow4.c(uv4Var);
        }
        return x == gw4.h() ? x : yq4.a;
    }

    private final Void L0(f05<Object, yq4> f05Var) {
        while (true) {
            f05Var.M(C0());
        }
    }

    private final Object M0(Object obj) {
        Throwable th = null;
        while (true) {
            Object C0 = C0();
            if (C0 instanceof c) {
                synchronized (C0) {
                    if (((c) C0).g()) {
                        return ne5.f();
                    }
                    boolean e2 = ((c) C0).e();
                    if (obj != null || !e2) {
                        if (th == null) {
                            th = m0(obj);
                        }
                        ((c) C0).a(th);
                    }
                    Throwable d2 = e2 ^ true ? ((c) C0).d() : null;
                    if (d2 != null) {
                        S0(((c) C0).r(), d2);
                    }
                    return ne5.a();
                }
            } else if (C0 instanceof xd5) {
                if (th == null) {
                    th = m0(obj);
                }
                xd5 xd5Var = (xd5) C0;
                if (xd5Var.h()) {
                    if (n1(xd5Var, th)) {
                        return ne5.a();
                    }
                } else {
                    Object o1 = o1(C0, new ub5(th, false, 2, null));
                    if (o1 != ne5.a()) {
                        if (o1 != ne5.b()) {
                            return o1;
                        }
                    } else {
                        throw new IllegalStateException(c25.C("Cannot happen in ", C0).toString());
                    }
                }
            } else {
                return ne5.f();
            }
        }
    }

    private final le5 P0(f05<? super Throwable, yq4> f05Var, boolean z) {
        le5 le5Var;
        if (z) {
            le5Var = f05Var instanceof ge5 ? (ge5) f05Var : null;
            if (le5Var == null) {
                le5Var = new ce5(f05Var);
            }
        } else {
            le5 le5Var2 = f05Var instanceof le5 ? (le5) f05Var : null;
            le5Var = le5Var2 != null ? le5Var2 : null;
            if (le5Var == null) {
                le5Var = new de5(f05Var);
            }
        }
        le5Var.F0(this);
        return le5Var;
    }

    private final nb5 R0(hm5 hm5Var) {
        while (hm5Var.r0()) {
            hm5Var = hm5Var.o0();
        }
        while (true) {
            hm5Var = hm5Var.n0();
            if (!hm5Var.r0()) {
                if (hm5Var instanceof nb5) {
                    return (nb5) hm5Var;
                }
                if (hm5Var instanceof re5) {
                    return null;
                }
            }
        }
    }

    private final void S0(re5 re5Var, Throwable th) {
        xb5 xb5Var;
        V0(th);
        xb5 xb5Var2 = null;
        for (hm5 hm5Var = (hm5) re5Var.m0(); !c25.g(hm5Var, re5Var); hm5Var = hm5Var.n0()) {
            if (hm5Var instanceof ge5) {
                le5 le5Var = (le5) hm5Var;
                try {
                    le5Var.D0(th);
                } catch (Throwable th2) {
                    if (xb5Var2 == null) {
                        xb5Var = null;
                    } else {
                        co4.a(xb5Var2, th2);
                        xb5Var = xb5Var2;
                    }
                    if (xb5Var == null) {
                        xb5Var2 = new xb5("Exception in completion handler " + le5Var + " for " + this, th2);
                    }
                }
            }
        }
        if (xb5Var2 != null) {
            E0(xb5Var2);
        }
        h0(th);
    }

    private final void T0(re5 re5Var, Throwable th) {
        xb5 xb5Var;
        xb5 xb5Var2 = null;
        for (hm5 hm5Var = (hm5) re5Var.m0(); !c25.g(hm5Var, re5Var); hm5Var = hm5Var.n0()) {
            if (hm5Var instanceof le5) {
                le5 le5Var = (le5) hm5Var;
                try {
                    le5Var.D0(th);
                } catch (Throwable th2) {
                    if (xb5Var2 == null) {
                        xb5Var = null;
                    } else {
                        co4.a(xb5Var2, th2);
                        xb5Var = xb5Var2;
                    }
                    if (xb5Var == null) {
                        xb5Var2 = new xb5("Exception in completion handler " + le5Var + " for " + this, th2);
                    }
                }
            }
        }
        if (xb5Var2 == null) {
            return;
        }
        E0(xb5Var2);
    }

    private final /* synthetic */ <T extends le5> void U0(re5 re5Var, Throwable th) {
        xb5 xb5Var;
        xb5 xb5Var2 = null;
        for (hm5 hm5Var = (hm5) re5Var.m0(); !c25.g(hm5Var, re5Var); hm5Var = hm5Var.n0()) {
            c25.y(3, "T");
            if (hm5Var instanceof hm5) {
                le5 le5Var = (le5) hm5Var;
                try {
                    le5Var.D0(th);
                } catch (Throwable th2) {
                    if (xb5Var2 == null) {
                        xb5Var = null;
                    } else {
                        co4.a(xb5Var2, th2);
                        xb5Var = xb5Var2;
                    }
                    if (xb5Var == null) {
                        xb5Var2 = new xb5("Exception in completion handler " + le5Var + " for " + this, th2);
                    }
                }
            }
        }
        if (xb5Var2 == null) {
            return;
        }
        E0(xb5Var2);
    }

    private final boolean W(Object obj, re5 re5Var, le5 le5Var) {
        int B0;
        d dVar = new d(le5Var, this, obj);
        do {
            B0 = re5Var.o0().B0(le5Var, re5Var, dVar);
            if (B0 == 1) {
                return true;
            }
        } while (B0 != 2);
        return false;
    }

    private final void Y(Throwable th, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        for (Throwable th2 : list) {
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                co4.a(th, th2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.p7700g.p99005.wd5] */
    private final void Z0(jd5 jd5Var) {
        re5 re5Var = new re5();
        if (!jd5Var.h()) {
            re5Var = new wd5(re5Var);
        }
        s.compareAndSet(this, jd5Var, re5Var);
    }

    private final void a1(le5 le5Var) {
        le5Var.g0(new re5());
        s.compareAndSet(this, le5Var, le5Var.n0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object c0(uv4<Object> uv4Var) {
        a aVar = new a(fw4.d(uv4Var), this);
        aVar.T();
        jb5.a(aVar, d3(new ye5(aVar)));
        Object x = aVar.x();
        if (x == gw4.h()) {
            ow4.c(uv4Var);
        }
        return x;
    }

    private final Object g0(Object obj) {
        Object o1;
        do {
            Object C0 = C0();
            if ((C0 instanceof xd5) && (!(C0 instanceof c) || !((c) C0).f())) {
                o1 = o1(C0, new ub5(m0(obj), false, 2, null));
            } else {
                return ne5.a();
            }
        } while (o1 == ne5.b());
        return o1;
    }

    private final boolean h0(Throwable th) {
        if (I0()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        mb5 B0 = B0();
        return (B0 == null || B0 == te5.s) ? z : B0.q(th) || z;
    }

    private final int h1(Object obj) {
        if (obj instanceof jd5) {
            if (((jd5) obj).h()) {
                return 0;
            }
            if (s.compareAndSet(this, obj, ne5.c())) {
                Y0();
                return 1;
            }
            return -1;
        } else if (obj instanceof wd5) {
            if (s.compareAndSet(this, obj, ((wd5) obj).r())) {
                Y0();
                return 1;
            }
            return -1;
        } else {
            return 0;
        }
    }

    private final String i1(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof xd5 ? ((xd5) obj).h() ? "Active" : "New" : obj instanceof ub5 ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.e() ? "Cancelling" : cVar.f() ? "Completing" : "Active";
    }

    private final void k0(xd5 xd5Var, Object obj) {
        mb5 B0 = B0();
        if (B0 != null) {
            B0.w();
            g1(te5.s);
        }
        ub5 ub5Var = obj instanceof ub5 ? (ub5) obj : null;
        Throwable th = ub5Var != null ? ub5Var.b : null;
        if (xd5Var instanceof le5) {
            try {
                ((le5) xd5Var).D0(th);
                return;
            } catch (Throwable th2) {
                E0(new xb5("Exception in completion handler " + xd5Var + " for " + this, th2));
                return;
            }
        }
        re5 r = xd5Var.r();
        if (r == null) {
            return;
        }
        T0(r, th);
    }

    public static /* synthetic */ CancellationException k1(me5 me5Var, Throwable th, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            return me5Var.j1(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l0(c cVar, nb5 nb5Var, Object obj) {
        nb5 R0 = R0(nb5Var);
        if (R0 == null || !q1(cVar, R0, obj)) {
            a0(p0(cVar, obj));
        }
    }

    private final Throwable m0(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new fe5(i0(), null, this) : th;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((we5) obj).n3();
    }

    private final boolean m1(xd5 xd5Var, Object obj) {
        if (s.compareAndSet(this, xd5Var, ne5.g(obj))) {
            V0(null);
            W0(obj);
            k0(xd5Var, obj);
            return true;
        }
        return false;
    }

    private final boolean n1(xd5 xd5Var, Throwable th) {
        re5 A0 = A0(xd5Var);
        if (A0 == null) {
            return false;
        }
        if (s.compareAndSet(this, xd5Var, new c(A0, false, th))) {
            S0(A0, th);
            return true;
        }
        return false;
    }

    public static /* synthetic */ fe5 o0(me5 me5Var, String str, Throwable th, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                th = null;
            }
            if (str == null) {
                str = me5Var.i0();
            }
            return new fe5(str, th, me5Var);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defaultCancellationException");
    }

    private final Object o1(Object obj, Object obj2) {
        if (!(obj instanceof xd5)) {
            return ne5.a();
        }
        if ((!(obj instanceof jd5) && !(obj instanceof le5)) || (obj instanceof nb5) || (obj2 instanceof ub5)) {
            return p1((xd5) obj, obj2);
        }
        return m1((xd5) obj, obj2) ? obj2 : ne5.b();
    }

    private final Object p0(c cVar, Object obj) {
        boolean e2;
        Throwable v0;
        ub5 ub5Var = obj instanceof ub5 ? (ub5) obj : null;
        Throwable th = ub5Var == null ? null : ub5Var.b;
        synchronized (cVar) {
            e2 = cVar.e();
            List<Throwable> i = cVar.i(th);
            v0 = v0(cVar, i);
            if (v0 != null) {
                Y(v0, i);
            }
        }
        boolean z = false;
        if (v0 != null && v0 != th) {
            obj = new ub5(v0, false, 2, null);
        }
        if (v0 != null) {
            if ((h0(v0) || D0(v0)) ? true : true) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                ((ub5) obj).b();
            }
        }
        if (!e2) {
            V0(v0);
        }
        W0(obj);
        s.compareAndSet(this, cVar, ne5.g(obj));
        k0(cVar, obj);
        return obj;
    }

    private final Object p1(xd5 xd5Var, Object obj) {
        re5 A0 = A0(xd5Var);
        if (A0 == null) {
            return ne5.b();
        }
        c cVar = xd5Var instanceof c ? (c) xd5Var : null;
        if (cVar == null) {
            cVar = new c(A0, false, null);
        }
        synchronized (cVar) {
            if (cVar.f()) {
                return ne5.a();
            }
            cVar.j(true);
            if (cVar != xd5Var && !s.compareAndSet(this, xd5Var, cVar)) {
                return ne5.b();
            }
            boolean e2 = cVar.e();
            ub5 ub5Var = obj instanceof ub5 ? (ub5) obj : null;
            if (ub5Var != null) {
                cVar.a(ub5Var.b);
            }
            Throwable d2 = true ^ e2 ? cVar.d() : null;
            yq4 yq4Var = yq4.a;
            if (d2 != null) {
                S0(A0, d2);
            }
            nb5 q0 = q0(xd5Var);
            if (q0 != null && q1(cVar, q0, obj)) {
                return ne5.b;
            }
            return p0(cVar, obj);
        }
    }

    private final nb5 q0(xd5 xd5Var) {
        nb5 nb5Var = xd5Var instanceof nb5 ? (nb5) xd5Var : null;
        if (nb5Var == null) {
            re5 r = xd5Var.r();
            if (r == null) {
                return null;
            }
            return R0(r);
        }
        return nb5Var;
    }

    private final boolean q1(c cVar, nb5 nb5Var, Object obj) {
        while (ee5.a.f(nb5Var.w, false, false, new b(this, cVar, nb5Var, obj), 1, null) == te5.s) {
            nb5Var = R0(nb5Var);
            if (nb5Var == null) {
                return false;
            }
        }
        return true;
    }

    private final Throwable u0(Object obj) {
        ub5 ub5Var = obj instanceof ub5 ? (ub5) obj : null;
        if (ub5Var == null) {
            return null;
        }
        return ub5Var.b;
    }

    private final Throwable v0(c cVar, List<? extends Throwable> list) {
        Object obj;
        boolean z;
        Object obj2 = null;
        if (list.isEmpty()) {
            if (cVar.e()) {
                return new fe5(i0(), null, this);
            }
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = list.get(0);
        if (th2 instanceof of5) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 == th2 || !(th3 instanceof of5)) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    @Nullable
    public final mb5 B0() {
        return (mb5) this._parentHandle;
    }

    @Nullable
    public final Object C0() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof sm5)) {
                return obj;
            }
            ((sm5) obj).c(this);
        }
    }

    public boolean D0(@NotNull Throwable th) {
        return false;
    }

    @Override // com.p7700g.p99005.ob5
    public final void D1(@NotNull we5 we5Var) {
        e0(we5Var);
    }

    public void E0(@NotNull Throwable th) {
        throw th;
    }

    public final void F0(@Nullable ee5 ee5Var) {
        if (ee5Var == null) {
            g1(te5.s);
            return;
        }
        ee5Var.start();
        mb5 t3 = ee5Var.t3(this);
        g1(t3);
        if (m()) {
            t3.w();
            g1(te5.s);
        }
    }

    public final boolean H0() {
        return C0() instanceof ub5;
    }

    public boolean I0() {
        return false;
    }

    public final boolean N0(@Nullable Object obj) {
        Object o1;
        do {
            o1 = o1(C0(), obj);
            if (o1 == ne5.a()) {
                return false;
            }
            if (o1 == ne5.b) {
                return true;
            }
        } while (o1 == ne5.b());
        a0(o1);
        return true;
    }

    @Nullable
    public final Object O0(@Nullable Object obj) {
        Object o1;
        do {
            o1 = o1(C0(), obj);
            if (o1 == ne5.a()) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, u0(obj));
            }
        } while (o1 == ne5.b());
        return o1;
    }

    @NotNull
    public String Q0() {
        return qc5.a(this);
    }

    public void V0(@Nullable Throwable th) {
    }

    public void W0(@Nullable Object obj) {
    }

    @Override // com.p7700g.p99005.ee5
    @NotNull
    public final g75<ee5> X() {
        return k75.b(new e(null));
    }

    @Override // com.p7700g.p99005.ee5
    @NotNull
    public final gd5 X0(boolean z, boolean z2, @NotNull f05<? super Throwable, yq4> f05Var) {
        le5 P0 = P0(f05Var, z);
        while (true) {
            Object C0 = C0();
            if (C0 instanceof jd5) {
                jd5 jd5Var = (jd5) C0;
                if (jd5Var.h()) {
                    if (s.compareAndSet(this, C0, P0)) {
                        return P0;
                    }
                } else {
                    Z0(jd5Var);
                }
            } else {
                if (C0 instanceof xd5) {
                    re5 r = ((xd5) C0).r();
                    if (r == null) {
                        Objects.requireNonNull(C0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        a1((le5) C0);
                    } else {
                        gd5 gd5Var = te5.s;
                        if (z && (C0 instanceof c)) {
                            synchronized (C0) {
                                r3 = ((c) C0).d();
                                if (r3 == null || ((f05Var instanceof nb5) && !((c) C0).f())) {
                                    if (W(C0, r, P0)) {
                                        if (r3 == null) {
                                            return P0;
                                        }
                                        gd5Var = P0;
                                    }
                                }
                                yq4 yq4Var = yq4.a;
                            }
                        }
                        if (r3 != null) {
                            if (z2) {
                                f05Var.M(r3);
                            }
                            return gd5Var;
                        } else if (W(C0, r, P0)) {
                            return P0;
                        }
                    }
                } else {
                    if (z2) {
                        ub5 ub5Var = C0 instanceof ub5 ? (ub5) C0 : null;
                        f05Var.M(ub5Var != null ? ub5Var.b : null);
                    }
                    return te5.s;
                }
            }
        }
    }

    @Override // com.p7700g.p99005.ee5
    @xn4(level = zn4.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    @NotNull
    public ee5 X2(@NotNull ee5 ee5Var) {
        return ee5.a.i(this, ee5Var);
    }

    public void Y0() {
    }

    @Nullable
    public final Throwable Z() {
        Object C0 = C0();
        if (!(C0 instanceof xd5)) {
            return u0(C0);
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    @Override // com.p7700g.p99005.ee5, com.p7700g.p99005.jg5
    @xn4(level = zn4.HIDDEN, message = "Added since 1.2.0 for binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean a(Throwable th) {
        CancellationException k1 = th == null ? null : k1(this, th, null, 1, null);
        if (k1 == null) {
            k1 = new fe5(i0(), null, this);
        }
        f0(k1);
        return true;
    }

    public void a0(@Nullable Object obj) {
    }

    @Override // com.p7700g.p99005.ee5, com.p7700g.p99005.jg5
    public void b(@Nullable CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new fe5(i0(), null, this);
        }
        f0(cancellationException);
    }

    @Nullable
    public final Object b0(@NotNull uv4<Object> uv4Var) {
        Object C0;
        do {
            C0 = C0();
            if (!(C0 instanceof xd5)) {
                if (C0 instanceof ub5) {
                    throw ((ub5) C0).b;
                }
                return ne5.o(C0);
            }
        } while (h1(C0) < 0);
        return c0(uv4Var);
    }

    public final <T, R> void b1(@NotNull no5<? super R> no5Var, @NotNull j05<? super T, ? super uv4<? super R>, ? extends Object> j05Var) {
        Object C0;
        do {
            C0 = C0();
            if (no5Var.v()) {
                return;
            }
            if (!(C0 instanceof xd5)) {
                if (no5Var.p()) {
                    if (C0 instanceof ub5) {
                        no5Var.C(((ub5) C0).b);
                        return;
                    } else {
                        pn5.d(j05Var, ne5.o(C0), no5Var.y());
                        return;
                    }
                }
                return;
            }
        } while (h1(C0) != 0);
        no5Var.K(d3(new df5(no5Var, j05Var)));
    }

    @Override // com.p7700g.p99005.ee5
    @NotNull
    public final CancellationException c1() {
        Object C0 = C0();
        if (!(C0 instanceof c)) {
            if (C0 instanceof xd5) {
                throw new IllegalStateException(c25.C("Job is still new or active: ", this).toString());
            }
            return C0 instanceof ub5 ? k1(this, ((ub5) C0).b, null, 1, null) : new fe5(c25.C(qc5.a(this), " has completed normally"), null, this);
        }
        Throwable d2 = ((c) C0).d();
        CancellationException j1 = d2 != null ? j1(d2, c25.C(qc5.a(this), " is cancelling")) : null;
        if (j1 != null) {
            return j1;
        }
        throw new IllegalStateException(c25.C("Job is still new or active: ", this).toString());
    }

    @Override // com.p7700g.p99005.ee5
    @xn4(level = zn4.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        ee5.a.a(this);
    }

    public final boolean d0(@Nullable Throwable th) {
        return e0(th);
    }

    @Override // com.p7700g.p99005.ee5
    @NotNull
    public final gd5 d3(@NotNull f05<? super Throwable, yq4> f05Var) {
        return X0(false, true, f05Var);
    }

    public final boolean e0(@Nullable Object obj) {
        Object a2 = ne5.a();
        if (z0() && (a2 = g0(obj)) == ne5.b) {
            return true;
        }
        if (a2 == ne5.a()) {
            a2 = M0(obj);
        }
        if (a2 == ne5.a() || a2 == ne5.b) {
            return true;
        }
        if (a2 == ne5.f()) {
            return false;
        }
        a0(a2);
        return true;
    }

    public final void e1(@NotNull le5 le5Var) {
        Object C0;
        do {
            C0 = C0();
            if (!(C0 instanceof le5)) {
                if (!(C0 instanceof xd5) || ((xd5) C0).r() == null) {
                    return;
                }
                le5Var.u0();
                return;
            } else if (C0 != le5Var) {
                return;
            }
        } while (!s.compareAndSet(this, C0, ne5.c()));
    }

    public void f0(@NotNull Throwable th) {
        e0(th);
    }

    public final <T, R> void f1(@NotNull no5<? super R> no5Var, @NotNull j05<? super T, ? super uv4<? super R>, ? extends Object> j05Var) {
        Object C0 = C0();
        if (C0 instanceof ub5) {
            no5Var.C(((ub5) C0).b);
        } else {
            on5.f(j05Var, ne5.o(C0), no5Var.y(), null, 4, null);
        }
    }

    @Override // com.p7700g.p99005.xv4.b, com.p7700g.p99005.xv4
    public <R> R fold(R r, @NotNull j05<? super R, ? super xv4.b, ? extends R> j05Var) {
        return (R) ee5.a.d(this, r, j05Var);
    }

    public final void g1(@Nullable mb5 mb5Var) {
        this._parentHandle = mb5Var;
    }

    @Override // com.p7700g.p99005.xv4.b, com.p7700g.p99005.xv4
    @Nullable
    public <E extends xv4.b> E get(@NotNull xv4.c<E> cVar) {
        return (E) ee5.a.e(this, cVar);
    }

    @Override // com.p7700g.p99005.xv4.b
    @NotNull
    public final xv4.c<?> getKey() {
        return ee5.m0;
    }

    @Override // com.p7700g.p99005.ee5
    public boolean h() {
        Object C0 = C0();
        return (C0 instanceof xd5) && ((xd5) C0).h();
    }

    @NotNull
    public String i0() {
        return "Job was cancelled";
    }

    @Override // com.p7700g.p99005.ee5
    public final boolean isCancelled() {
        Object C0 = C0();
        return (C0 instanceof ub5) || ((C0 instanceof c) && ((c) C0).e());
    }

    public boolean j0(@NotNull Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return e0(th) && y0();
    }

    @NotNull
    public final CancellationException j1(@NotNull Throwable th, @Nullable String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = i0();
            }
            cancellationException = new fe5(str, th, this);
        }
        return cancellationException;
    }

    @Override // com.p7700g.p99005.ee5
    @NotNull
    public final ko5 k3() {
        return this;
    }

    @zd5
    @NotNull
    public final String l1() {
        StringBuilder sb = new StringBuilder();
        sb.append(Q0());
        sb.append('{');
        return wo1.B(sb, i1(C0()), '}');
    }

    @Override // com.p7700g.p99005.ee5
    public final boolean m() {
        return !(C0() instanceof xd5);
    }

    @Override // com.p7700g.p99005.xv4.b, com.p7700g.p99005.xv4
    @NotNull
    public xv4 minusKey(@NotNull xv4.c<?> cVar) {
        return ee5.a.g(this, cVar);
    }

    @NotNull
    public final fe5 n0(@Nullable String str, @Nullable Throwable th) {
        if (str == null) {
            str = i0();
        }
        return new fe5(str, th, this);
    }

    @Override // com.p7700g.p99005.we5
    @NotNull
    public CancellationException n3() {
        Throwable th;
        Object C0 = C0();
        if (C0 instanceof c) {
            th = ((c) C0).d();
        } else if (C0 instanceof ub5) {
            th = ((ub5) C0).b;
        } else if (C0 instanceof xd5) {
            throw new IllegalStateException(c25.C("Cannot be cancelling child in this state: ", C0).toString());
        } else {
            th = null;
        }
        CancellationException cancellationException = th instanceof CancellationException ? th : null;
        return cancellationException == null ? new fe5(c25.C("Parent job is ", i1(C0)), th, this) : cancellationException;
    }

    @Override // com.p7700g.p99005.xv4
    @NotNull
    public xv4 plus(@NotNull xv4 xv4Var) {
        return ee5.a.h(this, xv4Var);
    }

    @Override // com.p7700g.p99005.ko5
    public final <R> void r(@NotNull no5<? super R> no5Var, @NotNull f05<? super uv4<? super R>, ? extends Object> f05Var) {
        Object C0;
        do {
            C0 = C0();
            if (no5Var.v()) {
                return;
            }
            if (!(C0 instanceof xd5)) {
                if (no5Var.p()) {
                    pn5.c(f05Var, no5Var.y());
                    return;
                }
                return;
            }
        } while (h1(C0) != 0);
        no5Var.K(d3(new ef5(no5Var, f05Var)));
    }

    @Nullable
    public final Object r0() {
        Object C0 = C0();
        if (!(C0 instanceof xd5)) {
            if (!(C0 instanceof ub5)) {
                return ne5.o(C0);
            }
            throw ((ub5) C0).b;
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    @Nullable
    public final Throwable s0() {
        Object C0 = C0();
        if (C0 instanceof c) {
            Throwable d2 = ((c) C0).d();
            if (d2 != null) {
                return d2;
            }
            throw new IllegalStateException(c25.C("Job is still new or active: ", this).toString());
        } else if (!(C0 instanceof xd5)) {
            if (C0 instanceof ub5) {
                return ((ub5) C0).b;
            }
            return null;
        } else {
            throw new IllegalStateException(c25.C("Job is still new or active: ", this).toString());
        }
    }

    @Override // com.p7700g.p99005.ee5
    public final boolean start() {
        int h1;
        do {
            h1 = h1(C0());
            if (h1 == 0) {
                return false;
            }
        } while (h1 != 1);
        return true;
    }

    public final boolean t0() {
        Object C0 = C0();
        return (C0 instanceof ub5) && ((ub5) C0).a();
    }

    @Override // com.p7700g.p99005.ee5
    @NotNull
    public final mb5 t3(@NotNull ob5 ob5Var) {
        return (mb5) ee5.a.f(this, true, false, new nb5(ob5Var), 2, null);
    }

    @NotNull
    public String toString() {
        return l1() + '@' + qc5.b(this);
    }

    @Override // com.p7700g.p99005.ee5
    @Nullable
    public final Object x0(@NotNull uv4<? super yq4> uv4Var) {
        if (!J0()) {
            ie5.z(uv4Var.getContext());
            return yq4.a;
        }
        Object K0 = K0(uv4Var);
        return K0 == gw4.h() ? K0 : yq4.a;
    }

    public boolean y0() {
        return true;
    }

    public boolean z0() {
        return false;
    }
}