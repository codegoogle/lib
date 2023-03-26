package com.p7700g.p99005;

import android.support.v4.media.session.PlaybackStateCompat;
import com.anchorfree.hdr.AFHydra;
import com.google.android.gms.ads.RequestConfiguration;
import com.onesignal.shortcutbadger.impl.NewHtcHomeBadger;
import com.p7700g.p99005.ir5;
import com.p7700g.p99005.kr5;
import com.p7700g.p99005.mw5;
import com.p7700g.p99005.rs2;
import com.p7700g.p99005.vq5;
import com.p7700g.p99005.vv5;
import com.p7700g.p99005.yq5;
import com.squareup.moshi.adapters.Iso8601Utils;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Util.kt */
@fz4(name = "Util")
@vo4(bv = {1, 0, 3}, d1 = {"\u0000È\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\f\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r\u001a;\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e*\b\u0012\u0004\u0012\u00020\u00070\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00070\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a7\u0010\u0014\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00070\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00070\u0010¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0018\u001a\u00020\u0007*\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019\u001a-\u0010\u001c\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u001a\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010¢\u0006\u0004\b\u001c\u0010\u001d\u001a%\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e*\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a%\u0010\"\u001a\u00020\u001b*\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b\"\u0010#\u001a%\u0010$\u001a\u00020\u001b*\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b$\u0010#\u001a%\u0010%\u001a\u00020\u0007*\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b%\u0010&\u001a-\u0010(\u001a\u00020\u001b*\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b(\u0010)\u001a-\u0010,\u001a\u00020\u001b*\u00020\u00072\u0006\u0010+\u001a\u00020*2\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b,\u0010-\u001a\u0011\u0010.\u001a\u00020\u001b*\u00020\u0007¢\u0006\u0004\b.\u0010/\u001a\u0011\u00100\u001a\u00020\t*\u00020\u0007¢\u0006\u0004\b0\u00101\u001a)\u00105\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u00072\u0012\u00104\u001a\n\u0012\u0006\b\u0001\u0012\u0002030\u000e\"\u000203¢\u0006\u0004\b5\u00106\u001a\u0019\u0010:\u001a\u000208*\u0002072\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;\u001a'\u0010?\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010<\u001a\u00020\u00002\b\u0010>\u001a\u0004\u0018\u00010=¢\u0006\u0004\b?\u0010@\u001a\u0011\u0010A\u001a\u00020\u001b*\u00020*¢\u0006\u0004\bA\u0010B\u001a\u0017\u0010F\u001a\u00020E*\b\u0012\u0004\u0012\u00020D0C¢\u0006\u0004\bF\u0010G\u001a\u0017\u0010H\u001a\b\u0012\u0004\u0012\u00020D0C*\u00020E¢\u0006\u0004\bH\u0010I\u001a\u0019\u0010J\u001a\u00020\t*\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0016¢\u0006\u0004\bJ\u0010K\u001a\u0011\u0010N\u001a\u00020M*\u00020L¢\u0006\u0004\bN\u0010O\u001a\u001c\u0010R\u001a\u00020\u001b*\u00020P2\u0006\u0010Q\u001a\u00020\u001bH\u0086\u0004¢\u0006\u0004\bR\u0010S\u001a\u001c\u0010U\u001a\u00020\u001b*\u00020T2\u0006\u0010Q\u001a\u00020\u001bH\u0086\u0004¢\u0006\u0004\bU\u0010V\u001a\u001c\u0010W\u001a\u00020\u0000*\u00020\u001b2\u0006\u0010Q\u001a\u00020\u0000H\u0086\u0004¢\u0006\u0004\bW\u0010X\u001a\u0019\u0010[\u001a\u00020\u0004*\u00020Y2\u0006\u0010Z\u001a\u00020\u001b¢\u0006\u0004\b[\u0010\\\u001a\u0011\u0010]\u001a\u00020\u001b*\u000207¢\u0006\u0004\b]\u0010^\u001a!\u0010a\u001a\u00020\t*\u00020_2\u0006\u0010<\u001a\u00020\u001b2\u0006\u0010`\u001a\u00020=¢\u0006\u0004\ba\u0010b\u001a!\u0010d\u001a\u00020\t*\u00020_2\u0006\u0010c\u001a\u00020\u001b2\u0006\u0010`\u001a\u00020=¢\u0006\u0004\bd\u0010b\u001a\u0011\u0010f\u001a\u00020\u0007*\u00020e¢\u0006\u0004\bf\u0010g\u001a\u0019\u0010i\u001a\u00020\t*\u00020e2\u0006\u0010h\u001a\u000207¢\u0006\u0004\bi\u0010j\u001a!\u0010m\u001a\u00020\u00042\f\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00040kH\u0086\bø\u0001\u0000¢\u0006\u0004\bm\u0010n\u001a)\u0010o\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00040kH\u0086\bø\u0001\u0000¢\u0006\u0004\bo\u0010p\u001a\u0019\u0010r\u001a\u00020\u001b*\u00020q2\u0006\u0010R\u001a\u00020P¢\u0006\u0004\br\u0010s\u001a\u001b\u0010t\u001a\u00020\u001b*\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b¢\u0006\u0004\bt\u0010u\u001a\u0011\u0010w\u001a\u00020\u0000*\u00020v¢\u0006\u0004\bw\u0010x\u001a\u0019\u0010z\u001a\u00020\u0000*\u00020\u00072\u0006\u0010y\u001a\u00020\u0000¢\u0006\u0004\bz\u0010{\u001a\u001b\u0010|\u001a\u00020\u001b*\u0004\u0018\u00010\u00072\u0006\u0010y\u001a\u00020\u001b¢\u0006\u0004\b|\u0010u\u001a#\u0010}\u001a\b\u0012\u0004\u0012\u00028\u00000C\"\u0004\b\u0000\u0010a*\b\u0012\u0004\u0012\u00028\u00000C¢\u0006\u0004\b}\u0010~\u001a2\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000C\"\u0004\b\u0000\u0010a2\u0012\u0010\u007f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000e\"\u00028\u0000H\u0007¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a:\u0010\u0083\u0001\u001a\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0082\u0001\"\u0004\b\u0000\u0010i\"\u0004\b\u0001\u0010o*\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0082\u0001¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0015\u0010\u0086\u0001\u001a\u00020\u0004*\u00030\u0085\u0001¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0014\u0010\u0088\u0001\u001a\u00020\u0004*\u00020e¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0015\u0010\u008b\u0001\u001a\u00020\u0004*\u00030\u008a\u0001¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u001f\u0010\u0090\u0001\u001a\u00020\t*\u00030\u008d\u00012\b\u0010\u008f\u0001\u001a\u00030\u008e\u0001¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0014\u0010\u0092\u0001\u001a\u00020\u0007*\u00020\u0000¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0014\u0010\u0094\u0001\u001a\u00020\u0007*\u00020\u001b¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0017\u0010\u0096\u0001\u001a\u00020\u0004*\u000203H\u0086\b¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0017\u0010\u0098\u0001\u001a\u00020\u0004*\u000203H\u0086\b¢\u0006\u0006\b\u0098\u0001\u0010\u0097\u0001\u001a\u0017\u0010\u0099\u0001\u001a\u00020\u0004*\u000203H\u0086\b¢\u0006\u0006\b\u0099\u0001\u0010\u0097\u0001\u001a:\u0010\u009e\u0001\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010a2\u0007\u0010\u009a\u0001\u001a\u0002032\u000e\u0010\u009c\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u009b\u00012\u0007\u0010\u009d\u0001\u001a\u00020\u0007¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a,\u0010¢\u0001\u001a\u00020\u0004\"\u0004\b\u0000\u0010$*\t\u0012\u0004\u0012\u00028\u00000 \u00012\u0007\u0010¡\u0001\u001a\u00028\u0000H\u0000¢\u0006\u0006\b¢\u0001\u0010£\u0001\u001a\u0017\u0010¤\u0001\u001a\u00020\u0004*\u000203H\u0080\b¢\u0006\u0006\b¤\u0001\u0010\u0097\u0001\u001a\u0017\u0010¥\u0001\u001a\u00020\u0004*\u000203H\u0080\b¢\u0006\u0006\b¥\u0001\u0010\u0097\u0001\u001a0\u0010ª\u0001\u001a\u00030©\u0001*\b0¦\u0001j\u0003`§\u00012\u0013\u0010¨\u0001\u001a\u000e\u0012\n\u0012\b0¦\u0001j\u0003`§\u00010C¢\u0006\u0006\bª\u0001\u0010«\u0001\u001aI\u0010°\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000C\"\u0004\b\u0000\u0010a*\t\u0012\u0004\u0012\u00028\u00000¬\u00012\u001a\u0010¯\u0001\u001a\u0015\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u00ad\u0001¢\u0006\u0003\b®\u0001H\u0086\bø\u0001\u0000¢\u0006\u0006\b°\u0001\u0010±\u0001\"\u0019\u0010´\u0001\u001a\u00030²\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bN\u0010³\u0001\"\u0019\u0010·\u0001\u001a\u00030µ\u00018\u0006@\u0007X\u0087\u0004¢\u0006\u0007\n\u0005\bU\u0010¶\u0001\"\u0018\u0010¹\u0001\u001a\u00020E8\u0006@\u0007X\u0087\u0004¢\u0006\u0007\n\u0005\bR\u0010¸\u0001\"\u0018\u0010»\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0007\n\u0005\b?\u0010º\u0001\"\u0018\u0010¼\u0001\u001a\u00020\u00078\u0000@\u0001X\u0081\u0004¢\u0006\u0007\n\u0005\bJ\u0010º\u0001\"\u001a\u0010¿\u0001\u001a\u00030½\u00018\u0006@\u0007X\u0087\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¾\u0001\"\u0018\u0010À\u0001\u001a\u00020\t8\u0000@\u0001X\u0081\u0004¢\u0006\u0007\n\u0005\b0\u0010\u0092\u0001\"\u001a\u0010Ã\u0001\u001a\u00030Á\u00018\u0006@\u0007X\u0087\u0004¢\u0006\b\n\u0006\b¢\u0001\u0010Â\u0001\"\u001a\u0010Æ\u0001\u001a\u00030Ä\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010Å\u0001\"\u0019\u0010É\u0001\u001a\u00030Ç\u00018\u0006@\u0007X\u0087\u0004¢\u0006\u0007\n\u0005\bW\u0010È\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006Ê\u0001"}, d2 = {"", "arrayLength", "offset", NewHtcHomeBadger.d, "Lcom/p7700g/p99005/yq4;", "k", "(JJJ)V", "", "name", "", "daemon", "Ljava/util/concurrent/ThreadFactory;", "U", "(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;", "", "other", "Ljava/util/Comparator;", "comparator", AFHydra.STATUS_IDLE, "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;", "w", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z", "Lcom/p7700g/p99005/zq5;", "includeDefaultPort", "a0", "(Lcom/p7700g/p99005/zq5;Z)Ljava/lang/String;", "value", "", bx.B4, "([Ljava/lang/String;Ljava/lang/String;Ljava/util/Comparator;)I", ij3.b, "([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;", "startIndex", "endIndex", "C", "(Ljava/lang/String;II)I", "E", "g0", "(Ljava/lang/String;II)Ljava/lang/String;", "delimiters", "q", "(Ljava/lang/String;Ljava/lang/String;II)I", "", "delimiter", "p", "(Ljava/lang/String;CII)I", AFHydra.EV_BYTECOUNT, "(Ljava/lang/String;)I", "h", "(Ljava/lang/String;)Z", "format", "", "args", com.ironsource.sdk.controller.v.a, "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Lcom/p7700g/p99005/uv5;", "Ljava/nio/charset/Charset;", "default", "P", "(Lcom/p7700g/p99005/uv5;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;", "duration", "Ljava/util/concurrent/TimeUnit;", "unit", "j", "(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I", "N", "(C)I", "", "Lcom/p7700g/p99005/gt5;", "Lcom/p7700g/p99005/yq5;", "X", "(Ljava/util/List;)Lcom/p7700g/p99005/yq5;", bx.y4, "(Lcom/p7700g/p99005/yq5;)Ljava/util/List;", "i", "(Lcom/p7700g/p99005/zq5;Lcom/p7700g/p99005/zq5;)Z", "Lcom/p7700g/p99005/vq5;", "Lcom/p7700g/p99005/vq5$c;", "e", "(Lcom/p7700g/p99005/vq5;)Lcom/p7700g/p99005/vq5$c;", "", "mask", "b", "(BI)I", "", "c", "(SI)I", "d", "(IJ)J", "Lcom/p7700g/p99005/tv5;", rs2.f.c, "k0", "(Lcom/p7700g/p99005/tv5;I)V", "R", "(Lcom/p7700g/p99005/uv5;)I", "Lcom/p7700g/p99005/xw5;", "timeUnit", "T", "(Lcom/p7700g/p99005/xw5;ILjava/util/concurrent/TimeUnit;)Z", "timeout", "t", "Ljava/net/Socket;", "O", "(Ljava/net/Socket;)Ljava/lang/String;", rs2.f.b, "K", "(Ljava/net/Socket;Lcom/p7700g/p99005/uv5;)Z", "Lkotlin/Function0;", "block", "y", "(Lcom/p7700g/p99005/uz4;)V", bx.C4, "(Ljava/lang/String;Lcom/p7700g/p99005/uz4;)V", "Lcom/p7700g/p99005/sv5;", "S", "(Lcom/p7700g/p99005/sv5;B)I", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "(Ljava/lang/String;I)I", "Lcom/p7700g/p99005/jr5;", "x", "(Lcom/p7700g/p99005/jr5;)J", "defaultValue", "e0", "(Ljava/lang/String;J)J", "f0", "c0", "(Ljava/util/List;)Ljava/util/List;", "elements", "z", "([Ljava/lang/Object;)Ljava/util/List;", "", "d0", "(Ljava/util/Map;)Ljava/util/Map;", "Ljava/io/Closeable;", "l", "(Ljava/io/Closeable;)V", "n", "(Ljava/net/Socket;)V", "Ljava/net/ServerSocket;", com.anythink.expressad.d.a.b.dH, "(Ljava/net/ServerSocket;)V", "Lcom/p7700g/p99005/st5;", "Ljava/io/File;", o31.b, "J", "(Lcom/p7700g/p99005/st5;Ljava/io/File;)Z", "Z", "(J)Ljava/lang/String;", "Y", "(I)Ljava/lang/String;", "i0", "(Ljava/lang/Object;)V", "L", "M", "instance", "Ljava/lang/Class;", "fieldType", "fieldName", "Q", "(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "", "element", "a", "(Ljava/util/List;Ljava/lang/Object;)V", com.anythink.basead.d.g.i, "f", "Ljava/lang/Exception;", "Lkotlin/Exception;", "suppressed", "", "j0", "(Ljava/lang/Exception;Ljava/util/List;)Ljava/lang/Throwable;", "", "Lkotlin/Function1;", "Lcom/p7700g/p99005/ho4;", "predicate", "u", "(Ljava/lang/Iterable;Lcom/p7700g/p99005/f05;)Ljava/util/List;", "Lcom/p7700g/p99005/mw5;", "Lcom/p7700g/p99005/mw5;", "UNICODE_BOMS", "Lcom/p7700g/p99005/kr5;", "Lcom/p7700g/p99005/kr5;", "EMPTY_RESPONSE", "Lcom/p7700g/p99005/yq5;", "EMPTY_HEADERS", "Ljava/lang/String;", "userAgent", "okHttpName", "Ljava/util/TimeZone;", "Ljava/util/TimeZone;", md2.a, "assertionsEnabled", "", "[B", "EMPTY_BYTE_ARRAY", "Lcom/p7700g/p99005/o85;", "Lcom/p7700g/p99005/o85;", "VERIFY_AS_IP_ADDRESS", "Lcom/p7700g/p99005/ir5;", "Lcom/p7700g/p99005/ir5;", "EMPTY_REQUEST", "okhttp"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class sr5 {
    @cz4
    @NotNull
    public static final byte[] a;
    @cz4
    @NotNull
    public static final yq5 b = yq5.s.j(new String[0]);
    @cz4
    @NotNull
    public static final kr5 c;
    @cz4
    @NotNull
    public static final ir5 d;
    private static final mw5 e;
    @cz4
    @NotNull
    public static final TimeZone f;
    private static final o85 g;
    @cz4
    public static final boolean h;
    @cz4
    @NotNull
    public static final String i;
    @NotNull
    public static final String j = "okhttp/4.9.0";

    /* compiled from: Util.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/p7700g/p99005/hq5;", "it", "Lcom/p7700g/p99005/vq5;", "a", "(Lcom/p7700g/p99005/hq5;)Lcom/p7700g/p99005/vq5;"}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a implements vq5.c {
        public final /* synthetic */ vq5 a;

        public a(vq5 vq5Var) {
            this.a = vq5Var;
        }

        @Override // com.p7700g.p99005.vq5.c
        @NotNull
        public final vq5 a(@NotNull hq5 hq5Var) {
            c25.p(hq5Var, "it");
            return this.a;
        }
    }

    /* compiled from: Util.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n \u0001*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Runnable;", "kotlin.jvm.PlatformType", "runnable", "Ljava/lang/Thread;", "newThread", "(Ljava/lang/Runnable;)Ljava/lang/Thread;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class b implements ThreadFactory {
        public final /* synthetic */ String a;
        public final /* synthetic */ boolean b;

        public b(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.a);
            thread.setDaemon(this.b);
            return thread;
        }
    }

    static {
        byte[] bArr = new byte[0];
        a = bArr;
        c = kr5.b.l(kr5.s, bArr, null, 1, null);
        d = ir5.a.r(ir5.a, bArr, null, 0, 0, 7, null);
        mw5.a aVar = mw5.t;
        vv5.a aVar2 = vv5.u;
        e = aVar.d(aVar2.i("efbbbf"), aVar2.i("feff"), aVar2.i("fffe"), aVar2.i("0000ffff"), aVar2.i("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone(Iso8601Utils.GMT_ID);
        c25.m(timeZone);
        f = timeZone;
        g = new o85("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        h = false;
        String name = fr5.class.getName();
        c25.o(name, "OkHttpClient::class.java.name");
        i = c95.i4(c95.c4(name, "okhttp3."), "Client");
    }

    public static final int A(@NotNull String[] strArr, @NotNull String str, @NotNull Comparator<String> comparator) {
        c25.p(strArr, "$this$indexOf");
        c25.p(str, "value");
        c25.p(comparator, "comparator");
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (comparator.compare(strArr[i2], str) == 0) {
                return i2;
            }
        }
        return -1;
    }

    public static final int B(@NotNull String str) {
        c25.p(str, "$this$indexOfControlOrNonAscii");
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (c25.t(charAt, 31) <= 0 || c25.t(charAt, 127) >= 0) {
                return i2;
            }
        }
        return -1;
    }

    public static final int C(@NotNull String str, int i2, int i3) {
        c25.p(str, "$this$indexOfFirstNonAsciiWhitespace");
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static /* synthetic */ int D(String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        return C(str, i2, i3);
    }

    public static final int E(@NotNull String str, int i2, int i3) {
        c25.p(str, "$this$indexOfLastNonAsciiWhitespace");
        int i4 = i3 - 1;
        if (i4 >= i2) {
            while (true) {
                char charAt = str.charAt(i4);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i4 + 1;
                }
                if (i4 == i2) {
                    break;
                }
                i4--;
            }
        }
        return i2;
    }

    public static /* synthetic */ int F(String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        return E(str, i2, i3);
    }

    public static final int G(@NotNull String str, int i2) {
        c25.p(str, "$this$indexOfNonWhitespace");
        int length = str.length();
        while (i2 < length) {
            char charAt = str.charAt(i2);
            if (charAt != ' ' && charAt != '\t') {
                return i2;
            }
            i2++;
        }
        return str.length();
    }

    public static /* synthetic */ int H(String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return G(str, i2);
    }

    @NotNull
    public static final String[] I(@NotNull String[] strArr, @NotNull String[] strArr2, @NotNull Comparator<? super String> comparator) {
        c25.p(strArr, "$this$intersect");
        c25.p(strArr2, "other");
        c25.p(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i2]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i2++;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (String[]) array;
    }

    public static final boolean J(@NotNull st5 st5Var, @NotNull File file) {
        c25.p(st5Var, "$this$isCivilized");
        c25.p(file, o31.b);
        vw5 b2 = st5Var.b(file);
        try {
            try {
                st5Var.f(file);
                ux4.a(b2, null);
                return true;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ux4.a(b2, th);
                    throw th2;
                }
            }
        } catch (IOException unused) {
            yq4 yq4Var = yq4.a;
            ux4.a(b2, null);
            st5Var.f(file);
            return false;
        }
    }

    public static final boolean K(@NotNull Socket socket, @NotNull uv5 uv5Var) {
        c25.p(socket, "$this$isHealthy");
        c25.p(uv5Var, rs2.f.b);
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                boolean z = !uv5Var.f0();
                socket.setSoTimeout(soTimeout);
                return z;
            } catch (Throwable th) {
                socket.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final void L(@NotNull Object obj) {
        c25.p(obj, "$this$notify");
        obj.notify();
    }

    public static final void M(@NotNull Object obj) {
        c25.p(obj, "$this$notifyAll");
        obj.notifyAll();
    }

    public static final int N(char c2) {
        if ('0' <= c2 && '9' >= c2) {
            return c2 - '0';
        }
        char c3 = 'a';
        if ('a' > c2 || 'f' < c2) {
            c3 = 'A';
            if ('A' > c2 || 'F' < c2) {
                return -1;
            }
        }
        return (c2 - c3) + 10;
    }

    @NotNull
    public static final String O(@NotNull Socket socket) {
        c25.p(socket, "$this$peerName");
        SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        if (remoteSocketAddress instanceof InetSocketAddress) {
            String hostName = ((InetSocketAddress) remoteSocketAddress).getHostName();
            c25.o(hostName, "address.hostName");
            return hostName;
        }
        return remoteSocketAddress.toString();
    }

    @NotNull
    public static final Charset P(@NotNull uv5 uv5Var, @NotNull Charset charset) throws IOException {
        c25.p(uv5Var, "$this$readBomAsCharset");
        c25.p(charset, "default");
        int X1 = uv5Var.X1(e);
        if (X1 != -1) {
            if (X1 == 0) {
                Charset charset2 = StandardCharsets.UTF_8;
                c25.o(charset2, "UTF_8");
                return charset2;
            } else if (X1 == 1) {
                Charset charset3 = StandardCharsets.UTF_16BE;
                c25.o(charset3, "UTF_16BE");
                return charset3;
            } else if (X1 == 2) {
                Charset charset4 = StandardCharsets.UTF_16LE;
                c25.o(charset4, "UTF_16LE");
                return charset4;
            } else if (X1 != 3) {
                if (X1 == 4) {
                    return f85.a.c();
                }
                throw new AssertionError();
            } else {
                return f85.a.b();
            }
        }
        return charset;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0039, code lost:
        return r4;
     */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> T Q(@NotNull Object obj, @NotNull Class<T> cls, @NotNull String str) {
        Object Q;
        c25.p(obj, "instance");
        c25.p(cls, "fieldType");
        c25.p(str, "fieldName");
        Class<?> cls2 = obj.getClass();
        while (true) {
            T t = null;
            if (!c25.g(cls2, Object.class)) {
                try {
                    Field declaredField = cls2.getDeclaredField(str);
                    c25.o(declaredField, "field");
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(obj);
                    if (!cls.isInstance(obj2)) {
                        break;
                    }
                    t = cls.cast(obj2);
                    break;
                } catch (NoSuchFieldException unused) {
                    cls2 = cls2.getSuperclass();
                    c25.o(cls2, "c.superclass");
                }
            } else if (!(!c25.g(str, "delegate")) || (Q = Q(obj, Object.class, "delegate")) == null) {
                return null;
            } else {
                return (T) Q(Q, cls, str);
            }
        }
    }

    public static final int R(@NotNull uv5 uv5Var) throws IOException {
        c25.p(uv5Var, "$this$readMedium");
        return b(uv5Var.readByte(), 255) | (b(uv5Var.readByte(), 255) << 16) | (b(uv5Var.readByte(), 255) << 8);
    }

    public static final int S(@NotNull sv5 sv5Var, byte b2) {
        c25.p(sv5Var, "$this$skipAll");
        int i2 = 0;
        while (!sv5Var.f0() && sv5Var.d2(0L) == b2) {
            i2++;
            sv5Var.readByte();
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0051, code lost:
        if (r5 == Long.MAX_VALUE) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0053, code lost:
        r11.timeout().a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x005b, code lost:
        r11.timeout().e(r0 + r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x007e, code lost:
        if (r5 != Long.MAX_VALUE) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0081, code lost:
        return r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean T(@NotNull xw5 xw5Var, int i2, @NotNull TimeUnit timeUnit) throws IOException {
        boolean z;
        c25.p(xw5Var, "$this$skipAll");
        c25.p(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long d2 = xw5Var.timeout().f() ? xw5Var.timeout().d() - nanoTime : Long.MAX_VALUE;
        xw5Var.timeout().e(Math.min(d2, timeUnit.toNanos(i2)) + nanoTime);
        try {
            sv5 sv5Var = new sv5();
            while (xw5Var.read(sv5Var, PlaybackStateCompat.F) != -1) {
                sv5Var.d();
            }
            z = true;
        } catch (InterruptedIOException unused) {
            z = false;
        } catch (Throwable th) {
            if (d2 == Long.MAX_VALUE) {
                xw5Var.timeout().a();
            } else {
                xw5Var.timeout().e(nanoTime + d2);
            }
            throw th;
        }
    }

    @NotNull
    public static final ThreadFactory U(@NotNull String str, boolean z) {
        c25.p(str, "name");
        return new b(str, z);
    }

    public static final void V(@NotNull String str, @NotNull uz4<yq4> uz4Var) {
        c25.p(str, "name");
        c25.p(uz4Var, "block");
        Thread currentThread = Thread.currentThread();
        c25.o(currentThread, "currentThread");
        String name = currentThread.getName();
        currentThread.setName(str);
        try {
            uz4Var.x();
        } finally {
            z15.d(1);
            currentThread.setName(name);
            z15.c(1);
        }
    }

    @NotNull
    public static final List<gt5> W(@NotNull yq5 yq5Var) {
        c25.p(yq5Var, "$this$toHeaderList");
        c55 z1 = i55.z1(0, yq5Var.size());
        ArrayList arrayList = new ArrayList(ks4.Z(z1, 10));
        Iterator<Integer> it = z1.iterator();
        while (it.hasNext()) {
            int b2 = ((ft4) it).b();
            arrayList.add(new gt5(yq5Var.h(b2), yq5Var.t(b2)));
        }
        return arrayList;
    }

    @NotNull
    public static final yq5 X(@NotNull List<gt5> list) {
        c25.p(list, "$this$toHeaders");
        yq5.a aVar = new yq5.a();
        for (gt5 gt5Var : list) {
            aVar.g(gt5Var.a().p4(), gt5Var.b().p4());
        }
        return aVar.i();
    }

    @NotNull
    public static final String Y(int i2) {
        String hexString = Integer.toHexString(i2);
        c25.o(hexString, "Integer.toHexString(this)");
        return hexString;
    }

    @NotNull
    public static final String Z(long j2) {
        String hexString = Long.toHexString(j2);
        c25.o(hexString, "java.lang.Long.toHexString(this)");
        return hexString;
    }

    public static final <E> void a(@NotNull List<E> list, E e2) {
        c25.p(list, "$this$addIfAbsent");
        if (list.contains(e2)) {
            return;
        }
        list.add(e2);
    }

    @NotNull
    public static final String a0(@NotNull zq5 zq5Var, boolean z) {
        String F;
        c25.p(zq5Var, "$this$toHostHeader");
        if (c95.V2(zq5Var.F(), ":", false, 2, null)) {
            StringBuilder F2 = wo1.F(f14.u);
            F2.append(zq5Var.F());
            F2.append(f14.v);
            F = F2.toString();
        } else {
            F = zq5Var.F();
        }
        if (z || zq5Var.N() != zq5.m.g(zq5Var.X())) {
            return F + ':' + zq5Var.N();
        }
        return F;
    }

    public static final int b(byte b2, int i2) {
        return b2 & i2;
    }

    public static /* synthetic */ String b0(zq5 zq5Var, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        return a0(zq5Var, z);
    }

    public static final int c(short s, int i2) {
        return s & i2;
    }

    @NotNull
    public static final <T> List<T> c0(@NotNull List<? extends T> list) {
        c25.p(list, "$this$toImmutableList");
        List<T> unmodifiableList = Collections.unmodifiableList(rs4.T5(list));
        c25.o(unmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final long d(int i2, long j2) {
        return i2 & j2;
    }

    @NotNull
    public static final <K, V> Map<K, V> d0(@NotNull Map<K, ? extends V> map) {
        c25.p(map, "$this$toImmutableMap");
        if (map.isEmpty()) {
            return nt4.z();
        }
        Map<K, V> unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        c25.o(unmodifiableMap, "Collections.unmodifiableMap(LinkedHashMap(this))");
        return unmodifiableMap;
    }

    @NotNull
    public static final vq5.c e(@NotNull vq5 vq5Var) {
        c25.p(vq5Var, "$this$asFactory");
        return new a(vq5Var);
    }

    public static final long e0(@NotNull String str, long j2) {
        c25.p(str, "$this$toLongOrDefault");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j2;
        }
    }

    public static final void f(@NotNull Object obj) {
        c25.p(obj, "$this$assertThreadDoesntHoldLock");
        if (h && Thread.holdsLock(obj)) {
            StringBuilder G = wo1.G("Thread ");
            Thread currentThread = Thread.currentThread();
            c25.o(currentThread, "Thread.currentThread()");
            G.append(currentThread.getName());
            G.append(" MUST NOT hold lock on ");
            G.append(obj);
            throw new AssertionError(G.toString());
        }
    }

    public static final int f0(@Nullable String str, int i2) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i2;
    }

    public static final void g(@NotNull Object obj) {
        c25.p(obj, "$this$assertThreadHoldsLock");
        if (!h || Thread.holdsLock(obj)) {
            return;
        }
        StringBuilder G = wo1.G("Thread ");
        Thread currentThread = Thread.currentThread();
        c25.o(currentThread, "Thread.currentThread()");
        G.append(currentThread.getName());
        G.append(" MUST hold lock on ");
        G.append(obj);
        throw new AssertionError(G.toString());
    }

    @NotNull
    public static final String g0(@NotNull String str, int i2, int i3) {
        c25.p(str, "$this$trimSubstring");
        int C = C(str, i2, i3);
        String substring = str.substring(C, E(str, C, i3));
        c25.o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static final boolean h(@NotNull String str) {
        c25.p(str, "$this$canParseAsIpAddress");
        return g.n(str);
    }

    public static /* synthetic */ String h0(String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        return g0(str, i2, i3);
    }

    public static final boolean i(@NotNull zq5 zq5Var, @NotNull zq5 zq5Var2) {
        c25.p(zq5Var, "$this$canReuseConnectionFor");
        c25.p(zq5Var2, "other");
        return c25.g(zq5Var.F(), zq5Var2.F()) && zq5Var.N() == zq5Var2.N() && c25.g(zq5Var.X(), zq5Var2.X());
    }

    public static final void i0(@NotNull Object obj) {
        c25.p(obj, "$this$wait");
        obj.wait();
    }

    public static final int j(@NotNull String str, long j2, @Nullable TimeUnit timeUnit) {
        c25.p(str, "name");
        boolean z = true;
        int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i2 >= 0) {
            if (timeUnit != null) {
                long millis = timeUnit.toMillis(j2);
                if (millis <= ((long) Integer.MAX_VALUE)) {
                    if (millis == 0 && i2 > 0) {
                        z = false;
                    }
                    if (z) {
                        return (int) millis;
                    }
                    throw new IllegalArgumentException(wo1.t(str, " too small.").toString());
                }
                throw new IllegalArgumentException(wo1.t(str, " too large.").toString());
            }
            throw new IllegalStateException("unit == null".toString());
        }
        throw new IllegalStateException(wo1.t(str, " < 0").toString());
    }

    @NotNull
    public static final Throwable j0(@NotNull Exception exc, @NotNull List<? extends Exception> list) {
        c25.p(exc, "$this$withSuppressed");
        c25.p(list, "suppressed");
        if (list.size() > 1) {
            System.out.println(list);
        }
        for (Exception exc2 : list) {
            co4.a(exc, exc2);
        }
        return exc;
    }

    public static final void k(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void k0(@NotNull tv5 tv5Var, int i2) throws IOException {
        c25.p(tv5Var, "$this$writeMedium");
        tv5Var.g0((i2 >>> 16) & 255);
        tv5Var.g0((i2 >>> 8) & 255);
        tv5Var.g0(i2 & 255);
    }

    public static final void l(@NotNull Closeable closeable) {
        c25.p(closeable, "$this$closeQuietly");
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void m(@NotNull ServerSocket serverSocket) {
        c25.p(serverSocket, "$this$closeQuietly");
        try {
            serverSocket.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void n(@NotNull Socket socket) {
        c25.p(socket, "$this$closeQuietly");
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            throw e3;
        } catch (Exception unused) {
        }
    }

    @NotNull
    public static final String[] o(@NotNull String[] strArr, @NotNull String str) {
        c25.p(strArr, "$this$concat");
        c25.p(str, "value");
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        c25.o(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        String[] strArr2 = (String[]) copyOf;
        strArr2[as4.Xe(strArr2)] = str;
        return strArr2;
    }

    public static final int p(@NotNull String str, char c2, int i2, int i3) {
        c25.p(str, "$this$delimiterOffset");
        while (i2 < i3) {
            if (str.charAt(i2) == c2) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static final int q(@NotNull String str, @NotNull String str2, int i2, int i3) {
        c25.p(str, "$this$delimiterOffset");
        c25.p(str2, "delimiters");
        while (i2 < i3) {
            if (c95.U2(str2, str.charAt(i2), false, 2, null)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static /* synthetic */ int r(String str, char c2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = str.length();
        }
        return p(str, c2, i2, i3);
    }

    public static /* synthetic */ int s(String str, String str2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = str.length();
        }
        return q(str, str2, i2, i3);
    }

    public static final boolean t(@NotNull xw5 xw5Var, int i2, @NotNull TimeUnit timeUnit) {
        c25.p(xw5Var, "$this$discard");
        c25.p(timeUnit, "timeUnit");
        try {
            return T(xw5Var, i2, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    @NotNull
    public static final <T> List<T> u(@NotNull Iterable<? extends T> iterable, @NotNull f05<? super T, Boolean> f05Var) {
        c25.p(iterable, "$this$filterList");
        c25.p(f05Var, "predicate");
        List<T> F = js4.F();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            if (f05Var.M(obj).booleanValue()) {
                if (F.isEmpty()) {
                    F = new ArrayList<>();
                }
                k35.g(F).add(obj);
            }
        }
        return F;
    }

    @NotNull
    public static final String v(@NotNull String str, @NotNull Object... objArr) {
        c25.p(str, "format");
        c25.p(objArr, "args");
        j35 j35Var = j35.a;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        c25.o(format, "java.lang.String.format(locale, format, *args)");
        return format;
    }

    public static final boolean w(@NotNull String[] strArr, @Nullable String[] strArr2, @NotNull Comparator<? super String> comparator) {
        c25.p(strArr, "$this$hasIntersection");
        c25.p(comparator, "comparator");
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                for (String str : strArr) {
                    for (String str2 : strArr2) {
                        if (comparator.compare(str, str2) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long x(@NotNull jr5 jr5Var) {
        c25.p(jr5Var, "$this$headersContentLength");
        String c2 = jr5Var.Y().c(sm4.i);
        if (c2 != null) {
            return e0(c2, -1L);
        }
        return -1L;
    }

    public static final void y(@NotNull uz4<yq4> uz4Var) {
        c25.p(uz4Var, "block");
        try {
            uz4Var.x();
        } catch (IOException unused) {
        }
    }

    @SafeVarargs
    @NotNull
    public static final <T> List<T> z(@NotNull T... tArr) {
        c25.p(tArr, "elements");
        Object[] objArr = (Object[]) tArr.clone();
        List<T> unmodifiableList = Collections.unmodifiableList(js4.M(Arrays.copyOf(objArr, objArr.length)));
        c25.o(unmodifiableList, "Collections.unmodifiable…istOf(*elements.clone()))");
        return unmodifiableList;
    }
}