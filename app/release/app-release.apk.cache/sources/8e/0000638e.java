package com.p7700g.p99005;

import com.anchorfree.sdk.DBProvider;
import com.onesignal.shortcutbadger.impl.NewHtcHomeBadger;
import com.p7700g.p99005.aa;
import com.p7700g.p99005.b35;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xbill.DNS.WKSRecord;

/* compiled from: Deprecated.kt */
@vo4(d1 = {"\u0000 \u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aJ\u0010\u0000\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\u00072\u001a\u0010\b\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\n0\t\"\u0006\u0012\u0002\b\u00030\nH\u0001¢\u0006\u0002\u0010\u000b\u001a!\u0010\f\u001a\u00020\r\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a1\u0010\u0010\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\u0007*\u0006\u0012\u0002\b\u00030\nH\u0001\u001a!\u0010\u0011\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0007\u001aZ\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u0015*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\"\u0010\u0018\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00150\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a0\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007\u001aT\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\"\u0010 \u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a)\u0010!\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010\"\u001a\u00020\u0012H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010#\u001a+\u0010$\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010\"\u001a\u00020\u0012H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010#\u001aT\u0010%\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\"\u0010 \u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001ai\u0010&\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u001727\u0010 \u001a3\b\u0001\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\"\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0'H\u0007ø\u0001\u0000¢\u0006\u0002\u0010(\u001aT\u0010)\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\"\u0010 \u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a$\u0010*\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\b\b\u0000\u0010\u000e*\u00020\u001b*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u000e0\nH\u0001\u001aA\u0010+\u001a\u0002H,\"\b\b\u0000\u0010\u000e*\u00020\u001b\"\u0010\b\u0001\u0010,*\n\u0012\u0006\b\u0000\u0012\u0002H\u000e0-*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u000e0\n2\u0006\u0010.\u001a\u0002H,H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010/\u001a?\u0010+\u001a\u0002H,\"\b\b\u0000\u0010\u000e*\u00020\u001b\"\u000e\b\u0001\u0010,*\b\u0012\u0004\u0012\u0002H\u000e00*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u000e0\n2\u0006\u0010.\u001a\u0002H,H\u0087@ø\u0001\u0000¢\u0006\u0002\u00101\u001a!\u00102\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a#\u00103\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a`\u00104\u001a\b\u0012\u0004\u0012\u0002H50\n\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u00105*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172(\u00106\u001a$\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H50\n0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a)\u00107\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u00108\u001a\u0002H\u000eH\u0087@ø\u0001\u0000¢\u0006\u0002\u00109\u001a!\u0010:\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a)\u0010;\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u00108\u001a\u0002H\u000eH\u0087@ø\u0001\u0000¢\u0006\u0002\u00109\u001a#\u0010<\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001aZ\u0010=\u001a\b\u0012\u0004\u0012\u0002H50\n\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u00105*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\"\u00106\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H50\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001ao\u0010>\u001a\b\u0012\u0004\u0012\u0002H50\n\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u00105*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u001727\u00106\u001a3\b\u0001\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\"\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H50\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0'H\u0001ø\u0001\u0000¢\u0006\u0002\u0010(\u001au\u0010?\u001a\b\u0012\u0004\u0012\u0002H50\n\"\u0004\b\u0000\u0010\u000e\"\b\b\u0001\u00105*\u00020\u001b*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u001729\u00106\u001a5\b\u0001\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\"\u0012\u0004\u0012\u0002H\u000e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H50\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0'H\u0007ø\u0001\u0000¢\u0006\u0002\u0010(\u001a`\u0010@\u001a\b\u0012\u0004\u0012\u0002H50\n\"\u0004\b\u0000\u0010\u000e\"\b\b\u0001\u00105*\u00020\u001b*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172$\u00106\u001a \b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H50\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a?\u0010A\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u001a\u0010B\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u000e0Cj\n\u0012\u0006\b\u0000\u0012\u0002H\u000e`DH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010E\u001a?\u0010F\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u001a\u0010B\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u000e0Cj\n\u0012\u0006\b\u0000\u0012\u0002H\u000e`DH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010E\u001a!\u0010G\u001a\u00020\r\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a$\u0010H\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\b\b\u0000\u0010\u000e*\u00020\u001b*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u000e0\nH\u0007\u001a!\u0010I\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a#\u0010J\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a0\u0010K\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007\u001aT\u0010L\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\"\u0010 \u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a9\u0010M\u001a\u0002H,\"\u0004\b\u0000\u0010\u000e\"\u000e\b\u0001\u0010,*\b\u0012\u0004\u0012\u0002H\u000e00*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010.\u001a\u0002H,H\u0081@ø\u0001\u0000¢\u0006\u0002\u00101\u001a;\u0010N\u001a\u0002H,\"\u0004\b\u0000\u0010\u000e\"\u0010\b\u0001\u0010,*\n\u0012\u0006\b\u0000\u0012\u0002H\u000e0-*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010.\u001a\u0002H,H\u0081@ø\u0001\u0000¢\u0006\u0002\u0010/\u001a?\u0010O\u001a\u000e\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002HQ0P\"\u0004\b\u0000\u0010\u0015\"\u0004\b\u0001\u0010Q*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002HQ0R0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001aU\u0010O\u001a\u0002HS\"\u0004\b\u0000\u0010\u0015\"\u0004\b\u0001\u0010Q\"\u0018\b\u0002\u0010S*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0015\u0012\u0006\b\u0000\u0012\u0002HQ0T*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002HQ0R0\n2\u0006\u0010.\u001a\u0002HSH\u0081@ø\u0001\u0000¢\u0006\u0002\u0010U\u001a'\u0010V\u001a\b\u0012\u0004\u0012\u0002H\u000e0W\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a'\u0010X\u001a\b\u0012\u0004\u0012\u0002H\u000e0Y\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0081@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a'\u0010Z\u001a\b\u0012\u0004\u0012\u0002H\u000e0[\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a.\u0010\\\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0]0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007\u001a?\u0010^\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H50R0\n\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u00105*\b\u0012\u0004\u0012\u0002H\u000e0\n2\f\u0010_\u001a\b\u0012\u0004\u0012\u0002H50\nH\u0087\u0004\u001az\u0010^\u001a\b\u0012\u0004\u0012\u0002HQ0\n\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u00105\"\u0004\b\u0002\u0010Q*\b\u0012\u0004\u0012\u0002H\u000e0\n2\f\u0010_\u001a\b\u0012\u0004\u0012\u0002H50\n2\b\b\u0002\u0010\u0016\u001a\u00020\u001726\u00106\u001a2\u0012\u0013\u0012\u0011H\u000e¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(`\u0012\u0013\u0012\u0011H5¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(a\u0012\u0004\u0012\u0002HQ0\u0019H\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006b"}, d2 = {"consumesAll", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "Lkotlinx/coroutines/CompletionHandler;", "channels", "", "Lkotlinx/coroutines/channels/ReceiveChannel;", "([Lkotlinx/coroutines/channels/ReceiveChannel;)Lkotlin/jvm/functions/Function1;", "any", "", "E", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consumes", NewHtcHomeBadger.d, "", "distinct", "distinctBy", "K", "context", "Lkotlin/coroutines/CoroutineContext;", "selector", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/channels/ReceiveChannel;", "drop", "n", "dropWhile", "predicate", "elementAt", la1.l, "(Lkotlinx/coroutines/channels/ReceiveChannel;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "elementAtOrNull", "filter", "filterIndexed", "Lkotlin/Function3;", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/channels/ReceiveChannel;", "filterNot", "filterNotNull", "filterNotNullTo", "C", "", "destination", "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/SendChannel;", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlinx/coroutines/channels/SendChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "first", "firstOrNull", "flatMap", "R", "transform", "indexOf", "element", "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "last", "lastIndexOf", "lastOrNull", "map", "mapIndexed", "mapIndexedNotNull", "mapNotNull", "maxWith", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/util/Comparator;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "minWith", "none", "requireNoNulls", "single", "singleOrNull", "take", "takeWhile", "toChannel", "toCollection", "toMap", "", bx.C4, "Lkotlin/Pair;", "M", "", "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toMutableList", "", "toMutableSet", "", "toSet", "", "withIndex", "Lkotlin/collections/IndexedValue;", "zip", "other", "a", "b", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "kotlinx/coroutines/channels/ChannelsKt")
/* loaded from: classes3.dex */
public final /* synthetic */ class wg5 {

    /* compiled from: Deprecated.kt */
    @mw4(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0}, l = {com.anythink.expressad.video.dynview.a.a.t}, m = "any", n = {"$this$consume$iv"}, s = {"L$0"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a<E> extends kw4 {
        public Object v;
        public /* synthetic */ Object w;
        public int x;

        public a(uv4<? super a> uv4Var) {
            super(uv4Var);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            Object a;
            this.w = obj;
            this.x |= Integer.MIN_VALUE;
            a = wg5.a(null, this);
            return a;
        }
    }

    /* compiled from: Deprecated.kt */
    @mw4(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {434, 436}, m = "minWith", n = {"comparator", "$this$consume$iv", "iterator", "comparator", "$this$consume$iv", "iterator", "min"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a0<E> extends kw4 {
        public int A;
        public Object v;
        public Object w;
        public Object x;
        public Object y;
        public /* synthetic */ Object z;

        public a0(uv4<? super a0> uv4Var) {
            super(uv4Var);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            Object N;
            this.z = obj;
            this.A |= Integer.MIN_VALUE;
            N = wg5.N(null, null, this);
            return N;
        }
    }

    /* compiled from: Deprecated.kt */
    @vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "cause", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends e25 implements f05<Throwable, yq4> {
        public final /* synthetic */ jh5<?> t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(jh5<?> jh5Var) {
            super(1);
            this.t = jh5Var;
        }

        @Override // com.p7700g.p99005.f05
        public /* bridge */ /* synthetic */ yq4 M(Throwable th) {
            a(th);
            return yq4.a;
        }

        public final void a(@Nullable Throwable th) {
            tg5.b(this.t, th);
        }
    }

    /* compiled from: Deprecated.kt */
    @mw4(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0}, l = {447}, m = "none", n = {"$this$consume$iv"}, s = {"L$0"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b0<E> extends kw4 {
        public Object v;
        public /* synthetic */ Object w;
        public int x;

        public b0(uv4<? super b0> uv4Var) {
            super(uv4Var);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            Object O;
            this.w = obj;
            this.x |= Integer.MIN_VALUE;
            O = wg5.O(null, this);
            return O;
        }
    }

    /* compiled from: Deprecated.kt */
    @vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "cause", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c extends e25 implements f05<Throwable, yq4> {
        public final /* synthetic */ jh5<?>[] t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(jh5<?>[] jh5VarArr) {
            super(1);
            this.t = jh5VarArr;
        }

        @Override // com.p7700g.p99005.f05
        public /* bridge */ /* synthetic */ yq4 M(Throwable th) {
            a(th);
            return yq4.a;
        }

        public final void a(@Nullable Throwable th) {
            jh5<?>[] jh5VarArr = this.t;
            int length = jh5VarArr.length;
            Throwable th2 = null;
            int i = 0;
            while (i < length) {
                jh5<?> jh5Var = jh5VarArr[i];
                i++;
                try {
                    tg5.b(jh5Var, th);
                } catch (Throwable th3) {
                    if (th2 == null) {
                        th2 = th3;
                    } else {
                        co4.a(th2, th3);
                    }
                }
            }
            if (th2 != null) {
                throw th2;
            }
        }
    }

    /* compiled from: Deprecated.kt */
    @mw4(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @vo4(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u0001H\u0001H\u008a@"}, d2 = {"<anonymous>", "E", "", "it"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c0 extends vw4 implements j05<E, uv4<? super E>, Object> {
        public int w;
        public /* synthetic */ Object x;
        public final /* synthetic */ jh5<E> y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c0(jh5<? extends E> jh5Var, uv4<? super c0> uv4Var) {
            super(2, uv4Var);
            this.y = jh5Var;
        }

        @Override // com.p7700g.p99005.j05
        @Nullable
        /* renamed from: C3 */
        public final Object w3(@Nullable E e, @Nullable uv4<? super E> uv4Var) {
            return ((c0) X(e, uv4Var)).D1(yq4.a);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            gw4.h();
            if (this.w == 0) {
                rp4.n(obj);
                Object obj2 = this.x;
                if (obj2 != null) {
                    return obj2;
                }
                StringBuilder G = wo1.G("null element found in ");
                G.append(this.y);
                G.append('.');
                throw new IllegalArgumentException(G.toString());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // com.p7700g.p99005.hw4
        @NotNull
        public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
            c0 c0Var = new c0(this.y, uv4Var);
            c0Var.x = obj;
            return c0Var;
        }
    }

    /* compiled from: Deprecated.kt */
    @mw4(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {487}, m = NewHtcHomeBadger.d, n = {NewHtcHomeBadger.d, "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d<E> extends kw4 {
        public Object v;
        public Object w;
        public Object x;
        public /* synthetic */ Object y;
        public int z;

        public d(uv4<? super d> uv4Var) {
            super(uv4Var);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            Object d;
            this.y = obj;
            this.z |= Integer.MIN_VALUE;
            d = wg5.d(null, this);
            return d;
        }
    }

    /* compiled from: Deprecated.kt */
    @mw4(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {WKSRecord.Service.PROFILE, WKSRecord.Service.NETBIOS_SSN}, m = "single", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "single"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d0<E> extends kw4 {
        public Object v;
        public Object w;
        public /* synthetic */ Object x;
        public int y;

        public d0(uv4<? super d0> uv4Var) {
            super(uv4Var);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            Object Q;
            this.x = obj;
            this.y |= Integer.MIN_VALUE;
            Q = wg5.Q(null, this);
            return Q;
        }
    }

    /* compiled from: Deprecated.kt */
    @mw4(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @vo4(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u0001H\u008a@"}, d2 = {"<anonymous>", "E", "it"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e extends vw4 implements j05<E, uv4<? super E>, Object> {
        public int w;
        public /* synthetic */ Object x;

        public e(uv4<? super e> uv4Var) {
            super(2, uv4Var);
        }

        @Override // com.p7700g.p99005.j05
        @Nullable
        /* renamed from: C3 */
        public final Object w3(E e, @Nullable uv4<? super E> uv4Var) {
            return ((e) X(e, uv4Var)).D1(yq4.a);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            gw4.h();
            if (this.w == 0) {
                rp4.n(obj);
                return this.x;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // com.p7700g.p99005.hw4
        @NotNull
        public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
            e eVar = new e(uv4Var);
            eVar.x = obj;
            return eVar;
        }
    }

    /* compiled from: Deprecated.kt */
    @mw4(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {149, 152}, m = "singleOrNull", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "single"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e0<E> extends kw4 {
        public Object v;
        public Object w;
        public /* synthetic */ Object x;
        public int y;

        public e0(uv4<? super e0> uv4Var) {
            super(uv4Var);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            Object R;
            this.x = obj;
            this.y |= Integer.MIN_VALUE;
            R = wg5.R(null, this);
            return R;
        }
    }

    /* compiled from: Deprecated.kt */
    @mw4(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 1, 2, 2, 2}, l = {387, 388, 390}, m = "invokeSuspend", n = {"$this$produce", DBProvider.s, "$this$produce", DBProvider.s, "e", "$this$produce", DBProvider.s, "k"}, s = {"L$0", "L$1", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3"})
    @vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "E", "K", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class f extends vw4 implements j05<hh5<? super E>, uv4<? super yq4>, Object> {
        private /* synthetic */ Object A;
        public final /* synthetic */ jh5<E> B;
        public final /* synthetic */ j05<E, uv4<? super K>, Object> C;
        public Object w;
        public Object x;
        public Object y;
        public int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(jh5<? extends E> jh5Var, j05<? super E, ? super uv4<? super K>, ? extends Object> j05Var, uv4<? super f> uv4Var) {
            super(2, uv4Var);
            this.B = jh5Var;
            this.C = j05Var;
        }

        @Override // com.p7700g.p99005.j05
        @Nullable
        /* renamed from: C3 */
        public final Object w3(@NotNull hh5<? super E> hh5Var, @Nullable uv4<? super yq4> uv4Var) {
            return ((f) X(hh5Var, uv4Var)).D1(yq4.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:48:0x0082 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x00d2  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x00d8  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x00c5 -> B:62:0x00cb). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x00d2 -> B:46:0x0071). Please submit an issue!!! */
        @Override // com.p7700g.p99005.hw4
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object D1(@NotNull Object obj) {
            hh5 hh5Var;
            f fVar;
            HashSet hashSet;
            qg5 qg5Var;
            hh5 hh5Var2;
            HashSet hashSet2;
            Object obj2;
            qg5 qg5Var2;
            Object obj3;
            f fVar2;
            hh5 hh5Var3;
            HashSet hashSet3;
            Object a;
            Object h = gw4.h();
            int i = this.z;
            if (i == 0) {
                rp4.n(obj);
                HashSet hashSet4 = new HashSet();
                qg5 it = this.B.iterator();
                hh5Var = (hh5) this.A;
                fVar = this;
                hashSet = hashSet4;
                qg5Var = it;
                fVar.A = hh5Var;
                fVar.w = hashSet;
                fVar.x = qg5Var;
                fVar.y = null;
                fVar.z = 1;
                a = qg5Var.a(fVar);
                if (a != h) {
                }
            } else if (i == 1) {
                rp4.n(obj);
                hh5Var3 = (hh5) this.A;
                hashSet3 = (HashSet) this.w;
                qg5Var2 = (qg5) this.x;
                obj3 = h;
                fVar2 = this;
                if (!((Boolean) obj).booleanValue()) {
                }
            } else if (i == 2) {
                Object obj4 = this.y;
                qg5Var2 = (qg5) this.x;
                rp4.n(obj);
                hh5Var2 = (hh5) this.A;
                hashSet2 = (HashSet) this.w;
                obj2 = obj4;
                obj3 = h;
                fVar2 = this;
                if (hashSet2.contains(obj)) {
                }
            } else if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                Object obj5 = this.y;
                qg5Var2 = (qg5) this.x;
                HashSet hashSet5 = (HashSet) this.w;
                hh5 hh5Var4 = (hh5) this.A;
                rp4.n(obj);
                fVar = this;
                hashSet5.add(obj5);
                qg5Var = qg5Var2;
                hashSet = hashSet5;
                hh5Var = hh5Var4;
                fVar.A = hh5Var;
                fVar.w = hashSet;
                fVar.x = qg5Var;
                fVar.y = null;
                fVar.z = 1;
                a = qg5Var.a(fVar);
                if (a != h) {
                    return h;
                }
                Object obj6 = h;
                fVar2 = fVar;
                obj = a;
                hh5Var3 = hh5Var;
                hashSet3 = hashSet;
                qg5Var2 = qg5Var;
                obj3 = obj6;
                if (!((Boolean) obj).booleanValue()) {
                    Object next = qg5Var2.next();
                    j05<E, uv4<? super K>, Object> j05Var = fVar2.C;
                    fVar2.A = hh5Var3;
                    fVar2.w = hashSet3;
                    fVar2.x = qg5Var2;
                    fVar2.y = next;
                    fVar2.z = 2;
                    Object w3 = j05Var.w3(next, fVar2);
                    if (w3 == obj3) {
                        return obj3;
                    }
                    HashSet hashSet6 = hashSet3;
                    obj2 = next;
                    obj = w3;
                    hh5Var2 = hh5Var3;
                    hashSet2 = hashSet6;
                    if (hashSet2.contains(obj)) {
                        fVar2.A = hh5Var2;
                        fVar2.w = hashSet2;
                        fVar2.x = qg5Var2;
                        fVar2.y = obj;
                        fVar2.z = 3;
                        if (hh5Var2.I(obj2, fVar2) == obj3) {
                            return obj3;
                        }
                        hashSet5 = hashSet2;
                        hh5Var4 = hh5Var2;
                        Object obj7 = obj3;
                        obj5 = obj;
                        fVar = fVar2;
                        h = obj7;
                        hashSet5.add(obj5);
                        qg5Var = qg5Var2;
                        hashSet = hashSet5;
                        hh5Var = hh5Var4;
                        fVar.A = hh5Var;
                        fVar.w = hashSet;
                        fVar.x = qg5Var;
                        fVar.y = null;
                        fVar.z = 1;
                        a = qg5Var.a(fVar);
                        if (a != h) {
                        }
                    } else {
                        fVar = fVar2;
                        h = obj3;
                        qg5Var = qg5Var2;
                        hashSet = hashSet2;
                        hh5Var = hh5Var2;
                        fVar.A = hh5Var;
                        fVar.w = hashSet;
                        fVar.x = qg5Var;
                        fVar.y = null;
                        fVar.z = 1;
                        a = qg5Var.a(fVar);
                        if (a != h) {
                        }
                    }
                } else {
                    return yq4.a;
                }
            }
        }

        @Override // com.p7700g.p99005.hw4
        @NotNull
        public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
            f fVar = new f(this.B, this.C, uv4Var);
            fVar.A = obj;
            return fVar;
        }
    }

    /* compiled from: Deprecated.kt */
    @mw4(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {254, 255}, m = "invokeSuspend", n = {"$this$produce", "remaining", "$this$produce", "remaining"}, s = {"L$0", "I$0", "L$0", "I$0"})
    @vo4(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class f0 extends vw4 implements j05<hh5<? super E>, uv4<? super yq4>, Object> {
        public final /* synthetic */ int A;
        public final /* synthetic */ jh5<E> B;
        public Object w;
        public int x;
        public int y;
        private /* synthetic */ Object z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f0(int i, jh5<? extends E> jh5Var, uv4<? super f0> uv4Var) {
            super(2, uv4Var);
            this.A = i;
            this.B = jh5Var;
        }

        @Override // com.p7700g.p99005.j05
        @Nullable
        /* renamed from: C3 */
        public final Object w3(@NotNull hh5<? super E> hh5Var, @Nullable uv4<? super yq4> uv4Var) {
            return ((f0) X(hh5Var, uv4Var)).D1(yq4.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:58:0x0060 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0087  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x007f -> B:66:0x0080). Please submit an issue!!! */
        @Override // com.p7700g.p99005.hw4
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object D1(@NotNull Object obj) {
            hh5 hh5Var;
            int i;
            qg5 it;
            f0 f0Var;
            hh5 hh5Var2;
            Object a;
            Object h = gw4.h();
            int i2 = this.y;
            if (i2 == 0) {
                rp4.n(obj);
                hh5Var = (hh5) this.z;
                i = this.A;
                if (i == 0) {
                    return yq4.a;
                }
                if (i >= 0) {
                    it = this.B.iterator();
                    f0Var = this;
                    f0Var.z = hh5Var;
                    f0Var.w = it;
                    f0Var.x = i;
                    f0Var.y = 1;
                    a = it.a(f0Var);
                    if (a == h) {
                    }
                } else {
                    throw new IllegalArgumentException(wo1.n("Requested element count ", i, " is less than zero.").toString());
                }
            } else if (i2 == 1) {
                i = this.x;
                it = (qg5) this.w;
                rp4.n(obj);
                hh5Var2 = (hh5) this.z;
                f0Var = this;
                if (!((Boolean) obj).booleanValue()) {
                }
            } else if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                i = this.x;
                it = (qg5) this.w;
                rp4.n(obj);
                hh5Var = (hh5) this.z;
                f0Var = this;
                i--;
                if (i == 0) {
                    return yq4.a;
                }
                f0Var.z = hh5Var;
                f0Var.w = it;
                f0Var.x = i;
                f0Var.y = 1;
                a = it.a(f0Var);
                if (a == h) {
                    return h;
                }
                hh5Var2 = hh5Var;
                obj = a;
                if (!((Boolean) obj).booleanValue()) {
                    Object next = it.next();
                    f0Var.z = hh5Var2;
                    f0Var.w = it;
                    f0Var.x = i;
                    f0Var.y = 2;
                    if (hh5Var2.I(next, f0Var) == h) {
                        return h;
                    }
                    hh5Var = hh5Var2;
                    i--;
                    if (i == 0) {
                    }
                    f0Var.z = hh5Var;
                    f0Var.w = it;
                    f0Var.x = i;
                    f0Var.y = 1;
                    a = it.a(f0Var);
                    if (a == h) {
                    }
                } else {
                    return yq4.a;
                }
            }
        }

        @Override // com.p7700g.p99005.hw4
        @NotNull
        public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
            f0 f0Var = new f0(this.A, this.B, uv4Var);
            f0Var.z = obj;
            return f0Var;
        }
    }

    /* compiled from: Deprecated.kt */
    @mw4(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1", f = "Deprecated.kt", i = {0, 0, 1, 2}, l = {164, 169, 170}, m = "invokeSuspend", n = {"$this$produce", "remaining", "$this$produce", "$this$produce"}, s = {"L$0", "I$0", "L$0", "L$0"})
    @vo4(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class g extends vw4 implements j05<hh5<? super E>, uv4<? super yq4>, Object> {
        public final /* synthetic */ int A;
        public final /* synthetic */ jh5<E> B;
        public Object w;
        public int x;
        public int y;
        private /* synthetic */ Object z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(int i, jh5<? extends E> jh5Var, uv4<? super g> uv4Var) {
            super(2, uv4Var);
            this.A = i;
            this.B = jh5Var;
        }

        @Override // com.p7700g.p99005.j05
        @Nullable
        /* renamed from: C3 */
        public final Object w3(@NotNull hh5<? super E> hh5Var, @Nullable uv4<? super yq4> uv4Var) {
            return ((g) X(hh5Var, uv4Var)).D1(yq4.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:67:0x0079 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x00b7 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:81:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x00de  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x007a -> B:69:0x0084). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x00d8 -> B:78:0x00ab). Please submit an issue!!! */
        @Override // com.p7700g.p99005.hw4
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object D1(@NotNull Object obj) {
            int i;
            hh5 hh5Var;
            Object obj2;
            g gVar;
            qg5 it;
            hh5 hh5Var2;
            g gVar2;
            qg5 it2;
            Object a;
            hh5 hh5Var3;
            int i2;
            int i3;
            Object obj3;
            qg5 qg5Var;
            Object a2;
            Object h = gw4.h();
            int i4 = this.y;
            int i5 = 3;
            int i6 = 2;
            int i7 = 1;
            if (i4 == 0) {
                rp4.n(obj);
                hh5 hh5Var4 = (hh5) this.z;
                i = this.A;
                if (!(i >= 0)) {
                    throw new IllegalArgumentException(wo1.n("Requested element count ", i, " is less than zero.").toString());
                }
                if (i > 0) {
                    it = this.B.iterator();
                    hh5Var2 = hh5Var4;
                    gVar2 = this;
                    gVar2.z = hh5Var2;
                    gVar2.w = it;
                    gVar2.x = i;
                    gVar2.y = i7;
                    a = it.a(gVar2);
                    if (a != h) {
                    }
                } else {
                    hh5Var = hh5Var4;
                    obj2 = h;
                    gVar = this;
                    it2 = gVar.B.iterator();
                    gVar.z = hh5Var;
                    gVar.w = it2;
                    gVar.y = i6;
                    a2 = it2.a(gVar);
                    if (a2 != obj2) {
                    }
                }
            } else if (i4 == 1) {
                int i8 = this.x;
                rp4.n(obj);
                int i9 = i8;
                hh5 hh5Var5 = (hh5) this.z;
                int i10 = 3;
                int i11 = 2;
                obj2 = h;
                qg5 qg5Var2 = (qg5) this.w;
                int i12 = 1;
                gVar = this;
                if (((Boolean) obj).booleanValue()) {
                    qg5Var2.next();
                    int i13 = i9 - 1;
                    if (i13 != 0) {
                        i5 = i10;
                        i6 = i11;
                        i7 = i12;
                        it = qg5Var2;
                        hh5Var2 = hh5Var5;
                        Object obj4 = obj2;
                        i = i13;
                        gVar2 = gVar;
                        h = obj4;
                        gVar2.z = hh5Var2;
                        gVar2.w = it;
                        gVar2.x = i;
                        gVar2.y = i7;
                        a = it.a(gVar2);
                        if (a != h) {
                            return h;
                        }
                        Object obj5 = h;
                        gVar = gVar2;
                        obj = a;
                        hh5Var5 = hh5Var2;
                        qg5Var2 = it;
                        i12 = i7;
                        i11 = i6;
                        i10 = i5;
                        i9 = i;
                        obj2 = obj5;
                        if (((Boolean) obj).booleanValue()) {
                        }
                    }
                }
                i5 = i10;
                i6 = i11;
                hh5Var = hh5Var5;
                it2 = gVar.B.iterator();
                gVar.z = hh5Var;
                gVar.w = it2;
                gVar.y = i6;
                a2 = it2.a(gVar);
                if (a2 != obj2) {
                }
            } else if (i4 == 2) {
                qg5Var = (qg5) this.w;
                rp4.n(obj);
                i3 = 3;
                obj3 = h;
                hh5Var3 = (hh5) this.z;
                i2 = 2;
                gVar = this;
                if (!((Boolean) obj).booleanValue()) {
                }
            } else if (i4 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                hh5Var = (hh5) this.z;
                rp4.n(obj);
                it2 = (qg5) this.w;
                obj2 = h;
                gVar = this;
                gVar.z = hh5Var;
                gVar.w = it2;
                gVar.y = i6;
                a2 = it2.a(gVar);
                if (a2 != obj2) {
                    return obj2;
                }
                Object obj6 = obj2;
                qg5Var = it2;
                obj = a2;
                hh5Var3 = hh5Var;
                i2 = i6;
                i3 = i5;
                obj3 = obj6;
                if (!((Boolean) obj).booleanValue()) {
                    Object next = qg5Var.next();
                    gVar.z = hh5Var3;
                    gVar.w = qg5Var;
                    gVar.y = i3;
                    if (hh5Var3.I(next, gVar) == obj3) {
                        return obj3;
                    }
                    it2 = qg5Var;
                    obj2 = obj3;
                    i5 = i3;
                    i6 = i2;
                    hh5Var = hh5Var3;
                    gVar.z = hh5Var;
                    gVar.w = it2;
                    gVar.y = i6;
                    a2 = it2.a(gVar);
                    if (a2 != obj2) {
                    }
                } else {
                    return yq4.a;
                }
            }
        }

        @Override // com.p7700g.p99005.hw4
        @NotNull
        public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
            g gVar = new g(this.A, this.B, uv4Var);
            gVar.z = obj;
            return gVar;
        }
    }

    /* compiled from: Deprecated.kt */
    @mw4(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1", f = "Deprecated.kt", i = {0, 1, 1, 2}, l = {269, 270, 271}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0"})
    @vo4(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class g0 extends vw4 implements j05<hh5<? super E>, uv4<? super yq4>, Object> {
        public final /* synthetic */ jh5<E> A;
        public final /* synthetic */ j05<E, uv4<? super Boolean>, Object> B;
        public Object w;
        public Object x;
        public int y;
        private /* synthetic */ Object z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g0(jh5<? extends E> jh5Var, j05<? super E, ? super uv4<? super Boolean>, ? extends Object> j05Var, uv4<? super g0> uv4Var) {
            super(2, uv4Var);
            this.A = jh5Var;
            this.B = j05Var;
        }

        @Override // com.p7700g.p99005.j05
        @Nullable
        /* renamed from: C3 */
        public final Object w3(@NotNull hh5<? super E> hh5Var, @Nullable uv4<? super yq4> uv4Var) {
            return ((g0) X(hh5Var, uv4Var)).D1(yq4.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x0063 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00ac  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x00a7 -> B:48:0x0057). Please submit an issue!!! */
        @Override // com.p7700g.p99005.hw4
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object D1(@NotNull Object obj) {
            qg5 it;
            hh5 hh5Var;
            Object obj2;
            g0 g0Var;
            g0 g0Var2;
            hh5 hh5Var2;
            qg5 qg5Var;
            Object a;
            Object h = gw4.h();
            int i = this.y;
            if (i == 0) {
                rp4.n(obj);
                it = this.A.iterator();
                hh5Var = (hh5) this.z;
            } else if (i == 1) {
                rp4.n(obj);
                hh5Var2 = (hh5) this.z;
                qg5Var = (qg5) this.w;
                obj2 = h;
                g0Var = this;
                if (!((Boolean) obj).booleanValue()) {
                }
            } else if (i == 2) {
                Object obj3 = this.x;
                rp4.n(obj);
                hh5 hh5Var3 = (hh5) this.z;
                qg5 qg5Var2 = (qg5) this.w;
                Object obj4 = obj3;
                obj2 = h;
                g0Var = this;
                if (((Boolean) obj).booleanValue()) {
                    return yq4.a;
                }
                g0Var.z = hh5Var3;
                g0Var.w = qg5Var2;
                g0Var.x = null;
                g0Var.y = 3;
                if (hh5Var3.I(obj4, g0Var) == obj2) {
                    return obj2;
                }
                g0Var2 = g0Var;
                h = obj2;
                it = qg5Var2;
                hh5Var = hh5Var3;
                g0Var2.z = hh5Var;
                g0Var2.w = it;
                g0Var2.y = 1;
                a = it.a(g0Var2);
                if (a != h) {
                    return h;
                }
                Object obj5 = h;
                g0Var = g0Var2;
                obj = a;
                hh5Var2 = hh5Var;
                qg5Var = it;
                obj2 = obj5;
                if (!((Boolean) obj).booleanValue()) {
                    Object next = qg5Var.next();
                    j05<E, uv4<? super Boolean>, Object> j05Var = g0Var.B;
                    g0Var.z = hh5Var2;
                    g0Var.w = qg5Var;
                    g0Var.x = next;
                    g0Var.y = 2;
                    Object w3 = j05Var.w3(next, g0Var);
                    if (w3 == obj2) {
                        return obj2;
                    }
                    qg5 qg5Var3 = qg5Var;
                    obj4 = next;
                    obj = w3;
                    hh5Var3 = hh5Var2;
                    qg5Var2 = qg5Var3;
                    if (((Boolean) obj).booleanValue()) {
                    }
                } else {
                    return yq4.a;
                }
            } else if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                it = (qg5) this.w;
                hh5Var = (hh5) this.z;
                rp4.n(obj);
            }
            g0Var2 = this;
            g0Var2.z = hh5Var;
            g0Var2.w = it;
            g0Var2.y = 1;
            a = it.a(g0Var2);
            if (a != h) {
            }
        }

        @Override // com.p7700g.p99005.hw4
        @NotNull
        public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
            g0 g0Var = new g0(this.A, this.B, uv4Var);
            g0Var.z = obj;
            return g0Var;
        }
    }

    /* compiled from: Deprecated.kt */
    @mw4(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1", f = "Deprecated.kt", i = {0, 1, 1, 2, 3, 4}, l = {181, 182, yg1.D, 187, 188}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0", "L$0", "L$0"})
    @vo4(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class h extends vw4 implements j05<hh5<? super E>, uv4<? super yq4>, Object> {
        public final /* synthetic */ jh5<E> A;
        public final /* synthetic */ j05<E, uv4<? super Boolean>, Object> B;
        public Object w;
        public Object x;
        public int y;
        private /* synthetic */ Object z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(jh5<? extends E> jh5Var, j05<? super E, ? super uv4<? super Boolean>, ? extends Object> j05Var, uv4<? super h> uv4Var) {
            super(2, uv4Var);
            this.A = jh5Var;
            this.B = j05Var;
        }

        @Override // com.p7700g.p99005.j05
        @Nullable
        /* renamed from: C3 */
        public final Object w3(@NotNull hh5<? super E> hh5Var, @Nullable uv4<? super yq4> uv4Var) {
            return ((h) X(hh5Var, uv4Var)).D1(yq4.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:66:0x008d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x00e5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:85:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x00f1  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x0104  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x00b1 -> B:74:0x00b5). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x0102 -> B:82:0x00d9). Please submit an issue!!! */
        @Override // com.p7700g.p99005.hw4
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object D1(@NotNull Object obj) {
            qg5 it;
            hh5 hh5Var;
            h hVar;
            hh5 hh5Var2;
            qg5 qg5Var;
            Object obj2;
            h hVar2;
            hh5 hh5Var3;
            Object a;
            qg5 it2;
            qg5 qg5Var2;
            Object a2;
            Object h = gw4.h();
            int i = this.y;
            if (i == 0) {
                rp4.n(obj);
                it = this.A.iterator();
                hh5Var = (hh5) this.z;
                hVar = this;
                hVar.z = hh5Var;
                hVar.w = it;
                hVar.x = null;
                hVar.y = 1;
                a = it.a(hVar);
                if (a != h) {
                }
            } else if (i == 1) {
                rp4.n(obj);
                hh5Var2 = (hh5) this.z;
                qg5Var = (qg5) this.w;
                obj2 = h;
                hVar2 = this;
                if (((Boolean) obj).booleanValue()) {
                }
                it2 = hVar2.A.iterator();
                hVar2.z = hh5Var2;
                hVar2.w = it2;
                hVar2.y = 4;
                a2 = it2.a(hVar2);
                if (a2 != obj2) {
                }
            } else if (i == 2) {
                Object obj3 = this.x;
                qg5Var = (qg5) this.w;
                rp4.n(obj);
                hh5Var3 = (hh5) this.z;
                Object obj4 = obj3;
                obj2 = h;
                hVar2 = this;
                if (((Boolean) obj).booleanValue()) {
                    hVar2.z = hh5Var3;
                    hVar2.w = null;
                    hVar2.x = null;
                    hVar2.y = 3;
                    if (hh5Var3.I(obj4, hVar2) == obj2) {
                        return obj2;
                    }
                    hh5Var2 = hh5Var3;
                    it2 = hVar2.A.iterator();
                    hVar2.z = hh5Var2;
                    hVar2.w = it2;
                    hVar2.y = 4;
                    a2 = it2.a(hVar2);
                    if (a2 != obj2) {
                    }
                } else {
                    hVar = hVar2;
                    h = obj2;
                    it = qg5Var;
                    hh5Var = hh5Var3;
                    hVar.z = hh5Var;
                    hVar.w = it;
                    hVar.x = null;
                    hVar.y = 1;
                    a = it.a(hVar);
                    if (a != h) {
                        return h;
                    }
                    Object obj5 = h;
                    hVar2 = hVar;
                    obj = a;
                    hh5Var2 = hh5Var;
                    qg5Var = it;
                    obj2 = obj5;
                    if (((Boolean) obj).booleanValue()) {
                        Object next = qg5Var.next();
                        j05<E, uv4<? super Boolean>, Object> j05Var = hVar2.B;
                        hVar2.z = hh5Var2;
                        hVar2.w = qg5Var;
                        hVar2.x = next;
                        hVar2.y = 2;
                        Object w3 = j05Var.w3(next, hVar2);
                        if (w3 == obj2) {
                            return obj2;
                        }
                        hh5 hh5Var4 = hh5Var2;
                        obj4 = next;
                        obj = w3;
                        hh5Var3 = hh5Var4;
                        if (((Boolean) obj).booleanValue()) {
                        }
                    }
                    it2 = hVar2.A.iterator();
                    hVar2.z = hh5Var2;
                    hVar2.w = it2;
                    hVar2.y = 4;
                    a2 = it2.a(hVar2);
                    if (a2 != obj2) {
                    }
                }
            } else if (i == 3) {
                rp4.n(obj);
                hh5Var3 = (hh5) this.z;
                obj2 = h;
                hVar2 = this;
                hh5Var2 = hh5Var3;
                it2 = hVar2.A.iterator();
                hVar2.z = hh5Var2;
                hVar2.w = it2;
                hVar2.y = 4;
                a2 = it2.a(hVar2);
                if (a2 != obj2) {
                }
            } else if (i == 4) {
                rp4.n(obj);
                hh5Var2 = (hh5) this.z;
                qg5Var2 = (qg5) this.w;
                obj2 = h;
                hVar2 = this;
                if (!((Boolean) obj).booleanValue()) {
                }
            } else if (i != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                rp4.n(obj);
                it2 = (qg5) this.w;
                hh5Var2 = (hh5) this.z;
                obj2 = h;
                hVar2 = this;
                hVar2.z = hh5Var2;
                hVar2.w = it2;
                hVar2.y = 4;
                a2 = it2.a(hVar2);
                if (a2 != obj2) {
                    return obj2;
                }
                qg5Var2 = it2;
                obj = a2;
                if (!((Boolean) obj).booleanValue()) {
                    Object next2 = qg5Var2.next();
                    hVar2.z = hh5Var2;
                    hVar2.w = qg5Var2;
                    hVar2.y = 5;
                    if (hh5Var2.I(next2, hVar2) == obj2) {
                        return obj2;
                    }
                    it2 = qg5Var2;
                    hVar2.z = hh5Var2;
                    hVar2.w = it2;
                    hVar2.y = 4;
                    a2 = it2.a(hVar2);
                    if (a2 != obj2) {
                    }
                } else {
                    return yq4.a;
                }
            }
        }

        @Override // com.p7700g.p99005.hw4
        @NotNull
        public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
            h hVar = new h(this.A, this.B, uv4Var);
            hVar.z = obj;
            return hVar;
        }
    }

    /* compiled from: Deprecated.kt */
    @mw4(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {487, com.anythink.expressad.foundation.g.a.aS}, m = "toChannel", n = {"destination", "$this$consume$iv$iv", "destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class h0<E, C extends nh5<? super E>> extends kw4 {
        public Object v;
        public Object w;
        public Object x;
        public /* synthetic */ Object y;
        public int z;

        public h0(uv4<? super h0> uv4Var) {
            super(uv4Var);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            this.y = obj;
            this.z |= Integer.MIN_VALUE;
            return tg5.e0(null, null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @mw4(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {38}, m = "elementAt", n = {"$this$consume$iv", la1.l, NewHtcHomeBadger.d}, s = {"L$0", "I$0", "I$1"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class i<E> extends kw4 {
        public int A;
        public int v;
        public int w;
        public Object x;
        public Object y;
        public /* synthetic */ Object z;

        public i(uv4<? super i> uv4Var) {
            super(uv4Var);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            Object l;
            this.z = obj;
            this.A |= Integer.MIN_VALUE;
            l = wg5.l(null, 0, this);
            return l;
        }
    }

    /* compiled from: Deprecated.kt */
    @mw4(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {487}, m = "toCollection", n = {"destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class i0<E, C extends Collection<? super E>> extends kw4 {
        public Object v;
        public Object w;
        public Object x;
        public /* synthetic */ Object y;
        public int z;

        public i0(uv4<? super i0> uv4Var) {
            super(uv4Var);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            this.y = obj;
            this.z |= Integer.MIN_VALUE;
            return tg5.f0(null, null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @mw4(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {53}, m = "elementAtOrNull", n = {"$this$consume$iv", la1.l, NewHtcHomeBadger.d}, s = {"L$0", "I$0", "I$1"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class j<E> extends kw4 {
        public int A;
        public int v;
        public int w;
        public Object x;
        public Object y;
        public /* synthetic */ Object z;

        public j(uv4<? super j> uv4Var) {
            super(uv4Var);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            Object m;
            this.z = obj;
            this.A |= Integer.MIN_VALUE;
            m = wg5.m(null, 0, this);
            return m;
        }
    }

    /* compiled from: Deprecated.kt */
    @mw4(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {487}, m = "toMap", n = {"destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class j0<K, V, M extends Map<? super K, ? super V>> extends kw4 {
        public Object v;
        public Object w;
        public Object x;
        public /* synthetic */ Object y;
        public int z;

        public j0(uv4<? super j0> uv4Var) {
            super(uv4Var);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            this.y = obj;
            this.z |= Integer.MIN_VALUE;
            return tg5.h0(null, null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @mw4(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1", f = "Deprecated.kt", i = {0, 1, 1, 2}, l = {198, 199, 199}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0"})
    @vo4(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class k extends vw4 implements j05<hh5<? super E>, uv4<? super yq4>, Object> {
        public final /* synthetic */ jh5<E> A;
        public final /* synthetic */ j05<E, uv4<? super Boolean>, Object> B;
        public Object w;
        public Object x;
        public int y;
        private /* synthetic */ Object z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(jh5<? extends E> jh5Var, j05<? super E, ? super uv4<? super Boolean>, ? extends Object> j05Var, uv4<? super k> uv4Var) {
            super(2, uv4Var);
            this.A = jh5Var;
            this.B = j05Var;
        }

        @Override // com.p7700g.p99005.j05
        @Nullable
        /* renamed from: C3 */
        public final Object w3(@NotNull hh5<? super E> hh5Var, @Nullable uv4<? super yq4> uv4Var) {
            return ((k) X(hh5Var, uv4Var)).D1(yq4.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:48:0x0065 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00a9  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x00a4 -> B:46:0x0057). Please submit an issue!!! */
        @Override // com.p7700g.p99005.hw4
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object D1(@NotNull Object obj) {
            qg5 it;
            hh5 hh5Var;
            qg5 qg5Var;
            Object obj2;
            k kVar;
            k kVar2;
            hh5 hh5Var2;
            Object a;
            Object h = gw4.h();
            int i = this.y;
            if (i == 0) {
                rp4.n(obj);
                it = this.A.iterator();
                hh5Var = (hh5) this.z;
            } else if (i == 1) {
                rp4.n(obj);
                hh5Var2 = (hh5) this.z;
                qg5Var = (qg5) this.w;
                obj2 = h;
                kVar = this;
                if (!((Boolean) obj).booleanValue()) {
                }
            } else if (i == 2) {
                Object obj3 = this.x;
                qg5Var = (qg5) this.w;
                rp4.n(obj);
                hh5 hh5Var3 = (hh5) this.z;
                Object obj4 = obj3;
                obj2 = h;
                kVar = this;
                if (((Boolean) obj).booleanValue()) {
                    kVar.z = hh5Var3;
                    kVar.w = qg5Var;
                    kVar.x = null;
                    kVar.y = 3;
                    if (hh5Var3.I(obj4, kVar) == obj2) {
                        return obj2;
                    }
                }
                kVar2 = kVar;
                h = obj2;
                it = qg5Var;
                hh5Var = hh5Var3;
                kVar2.z = hh5Var;
                kVar2.w = it;
                kVar2.x = null;
                kVar2.y = 1;
                a = it.a(kVar2);
                if (a == h) {
                    return h;
                }
                Object obj5 = h;
                kVar = kVar2;
                obj = a;
                hh5Var2 = hh5Var;
                qg5Var = it;
                obj2 = obj5;
                if (!((Boolean) obj).booleanValue()) {
                    Object next = qg5Var.next();
                    j05<E, uv4<? super Boolean>, Object> j05Var = kVar.B;
                    kVar.z = hh5Var2;
                    kVar.w = qg5Var;
                    kVar.x = next;
                    kVar.y = 2;
                    Object w3 = j05Var.w3(next, kVar);
                    if (w3 == obj2) {
                        return obj2;
                    }
                    hh5 hh5Var4 = hh5Var2;
                    obj4 = next;
                    obj = w3;
                    hh5Var3 = hh5Var4;
                    if (((Boolean) obj).booleanValue()) {
                    }
                    kVar2 = kVar;
                    h = obj2;
                    it = qg5Var;
                    hh5Var = hh5Var3;
                    kVar2.z = hh5Var;
                    kVar2.w = it;
                    kVar2.x = null;
                    kVar2.y = 1;
                    a = it.a(kVar2);
                    if (a == h) {
                    }
                } else {
                    return yq4.a;
                }
            } else if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                it = (qg5) this.w;
                hh5Var = (hh5) this.z;
                rp4.n(obj);
            }
            kVar2 = this;
            kVar2.z = hh5Var;
            kVar2.w = it;
            kVar2.x = null;
            kVar2.y = 1;
            a = it.a(kVar2);
            if (a == h) {
            }
        }

        @Override // com.p7700g.p99005.hw4
        @NotNull
        public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
            k kVar = new k(this.A, this.B, uv4Var);
            kVar.z = obj;
            return kVar;
        }
    }

    /* compiled from: Deprecated.kt */
    @mw4(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {370, 371}, m = "invokeSuspend", n = {"$this$produce", la1.l, "$this$produce", la1.l}, s = {"L$0", "I$0", "L$0", "I$0"})
    @vo4(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H\u008a@"}, d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/collections/IndexedValue;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class k0 extends vw4 implements j05<hh5<? super ct4<? extends E>>, uv4<? super yq4>, Object> {
        public final /* synthetic */ jh5<E> A;
        public Object w;
        public int x;
        public int y;
        private /* synthetic */ Object z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k0(jh5<? extends E> jh5Var, uv4<? super k0> uv4Var) {
            super(2, uv4Var);
            this.A = jh5Var;
        }

        @Override // com.p7700g.p99005.j05
        @Nullable
        /* renamed from: C3 */
        public final Object w3(@NotNull hh5<? super ct4<? extends E>> hh5Var, @Nullable uv4<? super yq4> uv4Var) {
            return ((k0) X(hh5Var, uv4Var)).D1(yq4.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x0051 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0078 -> B:36:0x0043). Please submit an issue!!! */
        @Override // com.p7700g.p99005.hw4
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object D1(@NotNull Object obj) {
            hh5 hh5Var;
            int i;
            qg5 it;
            k0 k0Var;
            Object a;
            Object h = gw4.h();
            int i2 = this.y;
            if (i2 == 0) {
                rp4.n(obj);
                hh5Var = (hh5) this.z;
                i = 0;
                it = this.A.iterator();
            } else if (i2 == 1) {
                i = this.x;
                it = (qg5) this.w;
                hh5 hh5Var2 = (hh5) this.z;
                rp4.n(obj);
                k0 k0Var2 = this;
                if (!((Boolean) obj).booleanValue()) {
                    int i3 = i + 1;
                    ct4 ct4Var = new ct4(i, it.next());
                    k0Var2.z = hh5Var2;
                    k0Var2.w = it;
                    k0Var2.x = i3;
                    k0Var2.y = 2;
                    if (hh5Var2.I(ct4Var, k0Var2) == h) {
                        return h;
                    }
                    hh5Var = hh5Var2;
                    k0Var = k0Var2;
                    i = i3;
                    k0Var.z = hh5Var;
                    k0Var.w = it;
                    k0Var.x = i;
                    k0Var.y = 1;
                    a = it.a(k0Var);
                    if (a != h) {
                        return h;
                    }
                    k0 k0Var3 = k0Var;
                    hh5Var2 = hh5Var;
                    obj = a;
                    k0Var2 = k0Var3;
                    if (!((Boolean) obj).booleanValue()) {
                        return yq4.a;
                    }
                }
            } else if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                i = this.x;
                it = (qg5) this.w;
                rp4.n(obj);
                hh5Var = (hh5) this.z;
            }
            k0Var = this;
            k0Var.z = hh5Var;
            k0Var.w = it;
            k0Var.x = i;
            k0Var.y = 1;
            a = it.a(k0Var);
            if (a != h) {
            }
        }

        @Override // com.p7700g.p99005.hw4
        @NotNull
        public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
            k0 k0Var = new k0(this.A, uv4Var);
            k0Var.z = obj;
            return k0Var;
        }
    }

    /* compiled from: Deprecated.kt */
    @mw4(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 1, 2, 2}, l = {211, 212, 212}, m = "invokeSuspend", n = {"$this$produce", la1.l, "$this$produce", "e", la1.l, "$this$produce", la1.l}, s = {"L$0", "I$0", "L$0", "L$2", "I$0", "L$0", "I$0"})
    @vo4(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class l extends vw4 implements j05<hh5<? super E>, uv4<? super yq4>, Object> {
        private /* synthetic */ Object A;
        public final /* synthetic */ jh5<E> B;
        public final /* synthetic */ k05<Integer, E, uv4<? super Boolean>, Object> C;
        public Object w;
        public Object x;
        public int y;
        public int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public l(jh5<? extends E> jh5Var, k05<? super Integer, ? super E, ? super uv4<? super Boolean>, ? extends Object> k05Var, uv4<? super l> uv4Var) {
            super(2, uv4Var);
            this.B = jh5Var;
            this.C = k05Var;
        }

        @Override // com.p7700g.p99005.j05
        @Nullable
        /* renamed from: C3 */
        public final Object w3(@NotNull hh5<? super E> hh5Var, @Nullable uv4<? super yq4> uv4Var) {
            return ((l) X(hh5Var, uv4Var)).D1(yq4.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x0072 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x00c1  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x00bc -> B:48:0x0062). Please submit an issue!!! */
        @Override // com.p7700g.p99005.hw4
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object D1(@NotNull Object obj) {
            int i;
            qg5 it;
            hh5 hh5Var;
            hh5 hh5Var2;
            Object obj2;
            l lVar;
            l lVar2;
            qg5 qg5Var;
            int i2;
            Object a;
            Object h = gw4.h();
            int i3 = this.z;
            if (i3 == 0) {
                rp4.n(obj);
                i = 0;
                it = this.B.iterator();
                hh5Var = (hh5) this.A;
            } else if (i3 == 1) {
                int i4 = this.y;
                rp4.n(obj);
                hh5Var2 = (hh5) this.A;
                qg5Var = (qg5) this.w;
                i2 = i4;
                obj2 = h;
                lVar = this;
                if (!((Boolean) obj).booleanValue()) {
                }
            } else if (i3 == 2) {
                int i5 = this.y;
                Object obj3 = this.x;
                hh5Var2 = (hh5) this.A;
                rp4.n(obj);
                int i6 = i5;
                obj2 = h;
                lVar = this;
                qg5 qg5Var2 = (qg5) this.w;
                Object obj4 = obj3;
                it = qg5Var2;
                if (((Boolean) obj).booleanValue()) {
                    lVar.A = hh5Var2;
                    lVar.w = it;
                    lVar.x = null;
                    lVar.y = i6;
                    lVar.z = 3;
                    if (hh5Var2.I(obj4, lVar) == obj2) {
                        return obj2;
                    }
                }
                lVar2 = lVar;
                h = obj2;
                hh5Var = hh5Var2;
                i = i6;
                lVar2.A = hh5Var;
                lVar2.w = it;
                lVar2.x = null;
                lVar2.y = i;
                lVar2.z = 1;
                a = it.a(lVar2);
                if (a == h) {
                    return h;
                }
                Object obj5 = h;
                lVar = lVar2;
                obj = a;
                hh5Var2 = hh5Var;
                qg5Var = it;
                i2 = i;
                obj2 = obj5;
                if (!((Boolean) obj).booleanValue()) {
                    Object next = qg5Var.next();
                    k05<Integer, E, uv4<? super Boolean>, Object> k05Var = lVar.C;
                    i6 = i2 + 1;
                    Integer f = iw4.f(i2);
                    lVar.A = hh5Var2;
                    lVar.w = qg5Var;
                    lVar.x = next;
                    lVar.y = i6;
                    lVar.z = 2;
                    Object I = k05Var.I(f, next, lVar);
                    if (I == obj2) {
                        return obj2;
                    }
                    qg5Var2 = qg5Var;
                    obj4 = next;
                    obj = I;
                    it = qg5Var2;
                    if (((Boolean) obj).booleanValue()) {
                    }
                    lVar2 = lVar;
                    h = obj2;
                    hh5Var = hh5Var2;
                    i = i6;
                    lVar2.A = hh5Var;
                    lVar2.w = it;
                    lVar2.x = null;
                    lVar2.y = i;
                    lVar2.z = 1;
                    a = it.a(lVar2);
                    if (a == h) {
                    }
                } else {
                    return yq4.a;
                }
            } else if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                i = this.y;
                it = (qg5) this.w;
                hh5Var = (hh5) this.A;
                rp4.n(obj);
            }
            lVar2 = this;
            lVar2.A = hh5Var;
            lVar2.w = it;
            lVar2.x = null;
            lVar2.y = i;
            lVar2.z = 1;
            a = it.a(lVar2);
            if (a == h) {
            }
        }

        @Override // com.p7700g.p99005.hw4
        @NotNull
        public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
            l lVar = new l(this.B, this.C, uv4Var);
            lVar.A = obj;
            return lVar;
        }
    }

    /* compiled from: Deprecated.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u00022\u0006\u0010\u0005\u001a\u0002H\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "E", "R", "t1", "t2", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class l0 extends e25 implements j05<E, R, hp4<? extends E, ? extends R>> {
        public static final l0 t = new l0();

        public l0() {
            super(2);
        }

        @Override // com.p7700g.p99005.j05
        @NotNull
        /* renamed from: a */
        public final hp4<E, R> w3(E e, R r) {
            return cq4.a(e, r);
        }
    }

    /* compiled from: Deprecated.kt */
    @mw4(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1", f = "Deprecated.kt", i = {}, l = {222}, m = "invokeSuspend", n = {}, s = {})
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "E", "it"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class m extends vw4 implements j05<E, uv4<? super Boolean>, Object> {
        public int w;
        public /* synthetic */ Object x;
        public final /* synthetic */ j05<E, uv4<? super Boolean>, Object> y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public m(j05<? super E, ? super uv4<? super Boolean>, ? extends Object> j05Var, uv4<? super m> uv4Var) {
            super(2, uv4Var);
            this.y = j05Var;
        }

        @Override // com.p7700g.p99005.j05
        @Nullable
        /* renamed from: C3 */
        public final Object w3(E e, @Nullable uv4<? super Boolean> uv4Var) {
            return ((m) X(e, uv4Var)).D1(yq4.a);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            Object h = gw4.h();
            int i = this.w;
            if (i == 0) {
                rp4.n(obj);
                Object obj2 = this.x;
                j05<E, uv4<? super Boolean>, Object> j05Var = this.y;
                this.w = 1;
                obj = j05Var.w3(obj2, this);
                if (obj == h) {
                    return h;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                rp4.n(obj);
            }
            return iw4.a(!((Boolean) obj).booleanValue());
        }

        @Override // com.p7700g.p99005.hw4
        @NotNull
        public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
            m mVar = new m(this.y, uv4Var);
            mVar.x = obj;
            return mVar;
        }
    }

    /* compiled from: Deprecated.kt */
    @mw4(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, l = {487, 469, 471}, m = "invokeSuspend", n = {"$this$produce", "otherIterator", "$this$consume$iv$iv", "$this$produce", "otherIterator", "$this$consume$iv$iv", "element1", "$this$produce", "otherIterator", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$5", "L$0", "L$1", "L$3"})
    @vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u008a@"}, d2 = {"<anonymous>", "", "E", "R", bx.C4, "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class m0 extends vw4 implements j05<hh5<? super V>, uv4<? super yq4>, Object> {
        public Object A;
        public int B;
        private /* synthetic */ Object C;
        public final /* synthetic */ jh5<R> D;
        public final /* synthetic */ jh5<E> E;
        public final /* synthetic */ j05<E, R, V> F;
        public Object w;
        public Object x;
        public Object y;
        public Object z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public m0(jh5<? extends R> jh5Var, jh5<? extends E> jh5Var2, j05<? super E, ? super R, ? extends V> j05Var, uv4<? super m0> uv4Var) {
            super(2, uv4Var);
            this.D = jh5Var;
            this.E = jh5Var2;
            this.F = j05Var;
        }

        @Override // com.p7700g.p99005.j05
        @Nullable
        /* renamed from: C3 */
        public final Object w3(@NotNull hh5<? super V> hh5Var, @Nullable uv4<? super yq4> uv4Var) {
            return ((m0) X(hh5Var, uv4Var)).D1(yq4.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:84:0x00b9 A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #2 {all -> 0x0056, blocks: (B:82:0x00b1, B:84:0x00b9, B:96:0x0109, B:69:0x004a), top: B:108:0x004a }] */
        /* JADX WARN: Removed duplicated region for block: B:91:0x00e9 A[Catch: all -> 0x0106, TRY_LEAVE, TryCatch #1 {all -> 0x0106, blocks: (B:88:0x00d9, B:91:0x00e9), top: B:106:0x00d9 }] */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0109 A[Catch: all -> 0x0056, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0056, blocks: (B:82:0x00b1, B:84:0x00b9, B:96:0x0109, B:69:0x004a), top: B:108:0x004a }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x00e1 -> B:78:0x0093). Please submit an issue!!! */
        @Override // com.p7700g.p99005.hw4
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object D1(@NotNull Object obj) {
            jh5 jh5Var;
            j05 j05Var;
            hh5 hh5Var;
            m0 m0Var;
            qg5 qg5Var;
            qg5 it;
            jh5 jh5Var2;
            hh5 hh5Var2;
            qg5 qg5Var2;
            j05 j05Var2;
            jh5 jh5Var3;
            Object obj2;
            qg5 qg5Var3;
            Object obj3;
            m0 m0Var2;
            hh5 hh5Var3;
            qg5 qg5Var4;
            j05 j05Var3;
            Object h = gw4.h();
            int i = this.B;
            try {
                if (i == 0) {
                    rp4.n(obj);
                    hh5 hh5Var4 = (hh5) this.C;
                    qg5 it2 = this.D.iterator();
                    jh5Var = this.E;
                    j05Var = this.F;
                    hh5Var = hh5Var4;
                    m0Var = this;
                    qg5Var = it2;
                    it = jh5Var.iterator();
                } else if (i == 1) {
                    qg5 qg5Var5 = (qg5) this.z;
                    jh5 jh5Var4 = (jh5) this.y;
                    j05 j05Var4 = (j05) this.x;
                    qg5 qg5Var6 = (qg5) this.w;
                    hh5 hh5Var5 = (hh5) this.C;
                    rp4.n(obj);
                    hh5Var3 = hh5Var5;
                    qg5Var4 = qg5Var6;
                    j05Var3 = j05Var4;
                    jh5Var2 = jh5Var4;
                    qg5Var3 = qg5Var5;
                    obj3 = h;
                    m0Var2 = this;
                    if (!((Boolean) obj).booleanValue()) {
                        Object next = qg5Var3.next();
                        m0Var2.C = hh5Var3;
                        m0Var2.w = qg5Var4;
                        m0Var2.x = j05Var3;
                        m0Var2.y = jh5Var2;
                        m0Var2.z = qg5Var3;
                        m0Var2.A = next;
                        m0Var2.B = 2;
                        Object a = qg5Var4.a(m0Var2);
                        if (a == obj3) {
                            return obj3;
                        }
                        jh5 jh5Var5 = jh5Var2;
                        obj2 = next;
                        obj = a;
                        hh5Var2 = hh5Var3;
                        qg5Var2 = qg5Var4;
                        j05Var2 = j05Var3;
                        jh5Var3 = jh5Var5;
                        if (((Boolean) obj).booleanValue()) {
                        }
                        m0Var = m0Var2;
                        h = obj3;
                        it = qg5Var3;
                        jh5Var = jh5Var3;
                        j05Var = j05Var2;
                        qg5Var = qg5Var2;
                        hh5Var = hh5Var2;
                    } else {
                        yq4 yq4Var = yq4.a;
                        tg5.b(jh5Var2, null);
                        return yq4Var;
                    }
                } else if (i == 2) {
                    Object obj4 = this.A;
                    qg5Var3 = (qg5) this.z;
                    jh5Var2 = (jh5) this.y;
                    j05 j05Var5 = (j05) this.x;
                    qg5 qg5Var7 = (qg5) this.w;
                    hh5 hh5Var6 = (hh5) this.C;
                    try {
                        rp4.n(obj);
                        hh5Var2 = hh5Var6;
                        qg5Var2 = qg5Var7;
                        j05Var2 = j05Var5;
                        jh5Var3 = jh5Var2;
                        obj2 = obj4;
                        obj3 = h;
                        m0Var2 = this;
                    } catch (Throwable th) {
                        th = th;
                        jh5Var = jh5Var2;
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            tg5.b(jh5Var, th);
                            throw th2;
                        }
                    }
                    try {
                        if (((Boolean) obj).booleanValue()) {
                            Object w3 = j05Var2.w3(obj2, qg5Var2.next());
                            m0Var2.C = hh5Var2;
                            m0Var2.w = qg5Var2;
                            m0Var2.x = j05Var2;
                            m0Var2.y = jh5Var3;
                            m0Var2.z = qg5Var3;
                            m0Var2.A = null;
                            m0Var2.B = 3;
                            if (hh5Var2.I(w3, m0Var2) == obj3) {
                                return obj3;
                            }
                        }
                        m0Var = m0Var2;
                        h = obj3;
                        it = qg5Var3;
                        jh5Var = jh5Var3;
                        j05Var = j05Var2;
                        qg5Var = qg5Var2;
                        hh5Var = hh5Var2;
                    } catch (Throwable th3) {
                        th = th3;
                        jh5Var = jh5Var3;
                        throw th;
                    }
                } else if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    it = (qg5) this.z;
                    jh5Var = (jh5) this.y;
                    j05Var = (j05) this.x;
                    qg5Var = (qg5) this.w;
                    hh5Var = (hh5) this.C;
                    rp4.n(obj);
                    m0Var = this;
                }
                m0Var.C = hh5Var;
                m0Var.w = qg5Var;
                m0Var.x = j05Var;
                m0Var.y = jh5Var;
                m0Var.z = it;
                m0Var.A = null;
                m0Var.B = 1;
                Object a2 = it.a(m0Var);
                if (a2 == h) {
                    return h;
                }
                Object obj5 = h;
                m0Var2 = m0Var;
                obj = a2;
                hh5Var3 = hh5Var;
                qg5Var4 = qg5Var;
                j05Var3 = j05Var;
                jh5Var2 = jh5Var;
                qg5Var3 = it;
                obj3 = obj5;
                if (!((Boolean) obj).booleanValue()) {
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }

        @Override // com.p7700g.p99005.hw4
        @NotNull
        public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
            m0 m0Var = new m0(this.D, this.E, this.F, uv4Var);
            m0Var.C = obj;
            return m0Var;
        }
    }

    /* compiled from: Deprecated.kt */
    @mw4(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u0001H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "E", "", "it"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class n extends vw4 implements j05<E, uv4<? super Boolean>, Object> {
        public int w;
        public /* synthetic */ Object x;

        public n(uv4<? super n> uv4Var) {
            super(2, uv4Var);
        }

        @Override // com.p7700g.p99005.j05
        @Nullable
        /* renamed from: C3 */
        public final Object w3(@Nullable E e, @Nullable uv4<? super Boolean> uv4Var) {
            return ((n) X(e, uv4Var)).D1(yq4.a);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            gw4.h();
            if (this.w == 0) {
                rp4.n(obj);
                return iw4.a(this.x != null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // com.p7700g.p99005.hw4
        @NotNull
        public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
            n nVar = new n(uv4Var);
            nVar.x = obj;
            return nVar;
        }
    }

    /* compiled from: Deprecated.kt */
    @mw4(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {487}, m = "filterNotNullTo", n = {"destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class o<E, C extends Collection<? super E>> extends kw4 {
        public Object v;
        public Object w;
        public Object x;
        public /* synthetic */ Object y;
        public int z;

        public o(uv4<? super o> uv4Var) {
            super(uv4Var);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            Object u;
            this.y = obj;
            this.z |= Integer.MIN_VALUE;
            u = wg5.u(null, null, this);
            return u;
        }
    }

    /* compiled from: Deprecated.kt */
    @mw4(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {487, 242}, m = "filterNotNullTo", n = {"destination", "$this$consume$iv$iv", "destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class p<E, C extends nh5<? super E>> extends kw4 {
        public Object v;
        public Object w;
        public Object x;
        public /* synthetic */ Object y;
        public int z;

        public p(uv4<? super p> uv4Var) {
            super(uv4Var);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            Object v;
            this.y = obj;
            this.z |= Integer.MIN_VALUE;
            v = wg5.v(null, null, this);
            return v;
        }
    }

    /* compiled from: Deprecated.kt */
    @mw4(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {65}, m = "first", n = {"$this$consume$iv", "iterator"}, s = {"L$0", "L$1"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class q<E> extends kw4 {
        public Object v;
        public Object w;
        public /* synthetic */ Object x;
        public int y;

        public q(uv4<? super q> uv4Var) {
            super(uv4Var);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            Object w;
            this.x = obj;
            this.y |= Integer.MIN_VALUE;
            w = wg5.w(null, this);
            return w;
        }
    }

    /* compiled from: Deprecated.kt */
    @mw4(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {75}, m = "firstOrNull", n = {"$this$consume$iv", "iterator"}, s = {"L$0", "L$1"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class r<E> extends kw4 {
        public Object v;
        public Object w;
        public /* synthetic */ Object x;
        public int y;

        public r(uv4<? super r> uv4Var) {
            super(uv4Var);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            Object x;
            this.x = obj;
            this.y |= Integer.MIN_VALUE;
            x = wg5.x(null, this);
            return x;
        }
    }

    /* compiled from: Deprecated.kt */
    @mw4(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1", f = "Deprecated.kt", i = {0, 1, 2}, l = {321, 322, 322}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$0"})
    @vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@"}, d2 = {"<anonymous>", "", "E", "R", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class s extends vw4 implements j05<hh5<? super R>, uv4<? super yq4>, Object> {
        public final /* synthetic */ j05<E, uv4<? super jh5<? extends R>>, Object> A;
        public Object w;
        public int x;
        private /* synthetic */ Object y;
        public final /* synthetic */ jh5<E> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public s(jh5<? extends E> jh5Var, j05<? super E, ? super uv4<? super jh5<? extends R>>, ? extends Object> j05Var, uv4<? super s> uv4Var) {
            super(2, uv4Var);
            this.z = jh5Var;
            this.A = j05Var;
        }

        @Override // com.p7700g.p99005.j05
        @Nullable
        /* renamed from: C3 */
        public final Object w3(@NotNull hh5<? super R> hh5Var, @Nullable uv4<? super yq4> uv4Var) {
            return ((s) X(hh5Var, uv4Var)).D1(yq4.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x0060 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0090 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0091 -> B:43:0x0054). Please submit an issue!!! */
        @Override // com.p7700g.p99005.hw4
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object D1(@NotNull Object obj) {
            qg5 it;
            hh5 hh5Var;
            hh5 hh5Var2;
            qg5 qg5Var;
            Object obj2;
            s sVar;
            s sVar2;
            Object a;
            Object h = gw4.h();
            int i = this.x;
            if (i == 0) {
                rp4.n(obj);
                it = this.z.iterator();
                hh5Var = (hh5) this.y;
            } else if (i == 1) {
                rp4.n(obj);
                hh5Var2 = (hh5) this.y;
                qg5Var = (qg5) this.w;
                obj2 = h;
                sVar = this;
                if (!((Boolean) obj).booleanValue()) {
                }
            } else if (i == 2) {
                rp4.n(obj);
                hh5Var2 = (hh5) this.y;
                qg5Var = (qg5) this.w;
                obj2 = h;
                sVar = this;
                sVar.y = hh5Var2;
                sVar.w = qg5Var;
                sVar.x = 3;
                if (tg5.e0((jh5) obj, hh5Var2, sVar) != obj2) {
                    return obj2;
                }
                sVar2 = sVar;
                h = obj2;
                it = qg5Var;
                hh5Var = hh5Var2;
                sVar2.y = hh5Var;
                sVar2.w = it;
                sVar2.x = 1;
                a = it.a(sVar2);
                if (a != h) {
                    return h;
                }
                Object obj3 = h;
                sVar = sVar2;
                obj = a;
                hh5Var2 = hh5Var;
                qg5Var = it;
                obj2 = obj3;
                if (!((Boolean) obj).booleanValue()) {
                    Object next = qg5Var.next();
                    j05<E, uv4<? super jh5<? extends R>>, Object> j05Var = sVar.A;
                    sVar.y = hh5Var2;
                    sVar.w = qg5Var;
                    sVar.x = 2;
                    obj = j05Var.w3(next, sVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                    sVar.y = hh5Var2;
                    sVar.w = qg5Var;
                    sVar.x = 3;
                    if (tg5.e0((jh5) obj, hh5Var2, sVar) != obj2) {
                    }
                } else {
                    return yq4.a;
                }
            } else if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                it = (qg5) this.w;
                hh5Var = (hh5) this.y;
                rp4.n(obj);
            }
            sVar2 = this;
            sVar2.y = hh5Var;
            sVar2.w = it;
            sVar2.x = 1;
            a = it.a(sVar2);
            if (a != h) {
            }
        }

        @Override // com.p7700g.p99005.hw4
        @NotNull
        public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
            s sVar = new s(this.z, this.A, uv4Var);
            sVar.y = obj;
            return sVar;
        }
    }

    /* compiled from: Deprecated.kt */
    @mw4(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {487}, m = "indexOf", n = {"element", la1.l, "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$2"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class t<E> extends kw4 {
        public int A;
        public Object v;
        public Object w;
        public Object x;
        public Object y;
        public /* synthetic */ Object z;

        public t(uv4<? super t> uv4Var) {
            super(uv4Var);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            Object A;
            this.z = obj;
            this.A |= Integer.MIN_VALUE;
            A = wg5.A(null, null, this);
            return A;
        }
    }

    /* compiled from: Deprecated.kt */
    @mw4(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1, 1}, l = {97, 100}, m = "last", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "iterator", "last"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class u<E> extends kw4 {
        public Object v;
        public Object w;
        public Object x;
        public /* synthetic */ Object y;
        public int z;

        public u(uv4<? super u> uv4Var) {
            super(uv4Var);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            Object B;
            this.y = obj;
            this.z |= Integer.MIN_VALUE;
            B = wg5.B(null, this);
            return B;
        }
    }

    /* compiled from: Deprecated.kt */
    @mw4(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 0}, l = {487}, m = "lastIndexOf", n = {"element", "lastIndex", la1.l, "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class v<E> extends kw4 {
        public /* synthetic */ Object A;
        public int B;
        public Object v;
        public Object w;
        public Object x;
        public Object y;
        public Object z;

        public v(uv4<? super v> uv4Var) {
            super(uv4Var);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            Object C;
            this.A = obj;
            this.B |= Integer.MIN_VALUE;
            C = wg5.C(null, null, this);
            return C;
        }
    }

    /* compiled from: Deprecated.kt */
    @mw4(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1, 1}, l = {123, 126}, m = "lastOrNull", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "iterator", "last"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class w<E> extends kw4 {
        public Object v;
        public Object w;
        public Object x;
        public /* synthetic */ Object y;
        public int z;

        public w(uv4<? super w> uv4Var) {
            super(uv4Var);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            Object D;
            this.y = obj;
            this.z |= Integer.MIN_VALUE;
            D = wg5.D(null, this);
            return D;
        }
    }

    /* compiled from: Deprecated.kt */
    @mw4(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 2, 2}, l = {487, 333, 333}, m = "invokeSuspend", n = {"$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv"}, s = {"L$0", "L$2", "L$0", "L$2", "L$0", "L$2"})
    @vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@"}, d2 = {"<anonymous>", "", "E", "R", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class x extends vw4 implements j05<hh5<? super R>, uv4<? super yq4>, Object> {
        public int A;
        private /* synthetic */ Object B;
        public final /* synthetic */ jh5<E> C;
        public final /* synthetic */ j05<E, uv4<? super R>, Object> D;
        public Object w;
        public Object x;
        public Object y;
        public Object z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public x(jh5<? extends E> jh5Var, j05<? super E, ? super uv4<? super R>, ? extends Object> j05Var, uv4<? super x> uv4Var) {
            super(2, uv4Var);
            this.C = jh5Var;
            this.D = j05Var;
        }

        @Override // com.p7700g.p99005.j05
        @Nullable
        /* renamed from: C3 */
        public final Object w3(@NotNull hh5<? super R> hh5Var, @Nullable uv4<? super yq4> uv4Var) {
            return ((x) X(hh5Var, uv4Var)).D1(yq4.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:78:0x0093 A[Catch: all -> 0x00cf, TRY_LEAVE, TryCatch #2 {all -> 0x00cf, blocks: (B:58:0x0022, B:72:0x0076, B:76:0x008b, B:78:0x0093, B:86:0x00c9, B:68:0x005e, B:71:0x006e), top: B:98:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:84:0x00c2 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:85:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x00c9 A[Catch: all -> 0x00cf, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00cf, blocks: (B:58:0x0022, B:72:0x0076, B:76:0x008b, B:78:0x0093, B:86:0x00c9, B:68:0x005e, B:71:0x006e), top: B:98:0x000a }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x00c3 -> B:72:0x0076). Please submit an issue!!! */
        @Override // com.p7700g.p99005.hw4
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object D1(@NotNull Object obj) {
            jh5 jh5Var;
            hh5 hh5Var;
            x xVar;
            j05 j05Var;
            qg5 it;
            jh5 jh5Var2;
            x xVar2;
            hh5 hh5Var2;
            j05 j05Var2;
            qg5 qg5Var;
            hh5 hh5Var3;
            x xVar3;
            hh5 hh5Var4;
            Object h = gw4.h();
            int i = this.A;
            try {
                if (i == 0) {
                    rp4.n(obj);
                    hh5Var = (hh5) this.B;
                    jh5Var = this.C;
                    xVar = this;
                    j05Var = this.D;
                    it = jh5Var.iterator();
                } else if (i == 1) {
                    it = (qg5) this.y;
                    jh5Var = (jh5) this.x;
                    j05Var = (j05) this.w;
                    hh5Var4 = (hh5) this.B;
                    rp4.n(obj);
                    xVar3 = this;
                    if (!((Boolean) obj).booleanValue()) {
                        Object next = it.next();
                        xVar3.B = hh5Var4;
                        xVar3.w = j05Var;
                        xVar3.x = jh5Var;
                        xVar3.y = it;
                        xVar3.z = hh5Var4;
                        xVar3.A = 2;
                        obj = j05Var.w3(next, xVar3);
                        if (obj == h) {
                            return h;
                        }
                        xVar2 = xVar3;
                        hh5Var2 = hh5Var4;
                        j05Var2 = j05Var;
                        jh5Var2 = jh5Var;
                        qg5Var = it;
                        hh5Var3 = hh5Var2;
                        xVar2.B = hh5Var2;
                        xVar2.w = j05Var2;
                        xVar2.x = jh5Var2;
                        xVar2.y = qg5Var;
                        xVar2.z = null;
                        xVar2.A = 3;
                        if (hh5Var3.I(obj, xVar2) != h) {
                        }
                    } else {
                        yq4 yq4Var = yq4.a;
                        tg5.b(jh5Var, null);
                        return yq4Var;
                    }
                } else if (i == 2) {
                    hh5Var3 = (hh5) this.z;
                    qg5Var = (qg5) this.y;
                    jh5Var2 = (jh5) this.x;
                    j05Var2 = (j05) this.w;
                    hh5Var2 = (hh5) this.B;
                    try {
                        rp4.n(obj);
                        xVar2 = this;
                        xVar2.B = hh5Var2;
                        xVar2.w = j05Var2;
                        xVar2.x = jh5Var2;
                        xVar2.y = qg5Var;
                        xVar2.z = null;
                        xVar2.A = 3;
                        if (hh5Var3.I(obj, xVar2) != h) {
                            return h;
                        }
                        it = qg5Var;
                        jh5Var = jh5Var2;
                        j05Var = j05Var2;
                        hh5Var = hh5Var2;
                        xVar = xVar2;
                    } catch (Throwable th) {
                        th = th;
                        jh5Var = jh5Var2;
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            tg5.b(jh5Var, th);
                            throw th2;
                        }
                    }
                } else if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    it = (qg5) this.y;
                    jh5Var = (jh5) this.x;
                    j05Var = (j05) this.w;
                    hh5 hh5Var5 = (hh5) this.B;
                    rp4.n(obj);
                    hh5Var = hh5Var5;
                    xVar = this;
                }
                xVar.B = hh5Var;
                xVar.w = j05Var;
                xVar.x = jh5Var;
                xVar.y = it;
                xVar.A = 1;
                Object a = it.a(xVar);
                if (a == h) {
                    return h;
                }
                x xVar4 = xVar;
                hh5Var4 = hh5Var;
                obj = a;
                xVar3 = xVar4;
                if (!((Boolean) obj).booleanValue()) {
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        @Override // com.p7700g.p99005.hw4
        @NotNull
        public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
            x xVar = new x(this.C, this.D, uv4Var);
            xVar.B = obj;
            return xVar;
        }
    }

    /* compiled from: Deprecated.kt */
    @mw4(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 2, 2}, l = {344, 345, 345}, m = "invokeSuspend", n = {"$this$produce", la1.l, "$this$produce", la1.l, "$this$produce", la1.l}, s = {"L$0", "I$0", "L$0", "I$0", "L$0", "I$0"})
    @vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@"}, d2 = {"<anonymous>", "", "E", "R", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class y extends vw4 implements j05<hh5<? super R>, uv4<? super yq4>, Object> {
        private /* synthetic */ Object A;
        public final /* synthetic */ jh5<E> B;
        public final /* synthetic */ k05<Integer, E, uv4<? super R>, Object> C;
        public Object w;
        public Object x;
        public int y;
        public int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public y(jh5<? extends E> jh5Var, k05<? super Integer, ? super E, ? super uv4<? super R>, ? extends Object> k05Var, uv4<? super y> uv4Var) {
            super(2, uv4Var);
            this.B = jh5Var;
            this.C = k05Var;
        }

        @Override // com.p7700g.p99005.j05
        @Nullable
        /* renamed from: C3 */
        public final Object w3(@NotNull hh5<? super R> hh5Var, @Nullable uv4<? super yq4> uv4Var) {
            return ((y) X(hh5Var, uv4Var)).D1(yq4.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x0067 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00a7 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x00a8 -> B:44:0x0059). Please submit an issue!!! */
        @Override // com.p7700g.p99005.hw4
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object D1(@NotNull Object obj) {
            hh5 hh5Var;
            int i;
            qg5 it;
            y yVar;
            y yVar2;
            hh5 hh5Var2;
            Object a;
            Object h = gw4.h();
            int i2 = this.z;
            if (i2 == 0) {
                rp4.n(obj);
                hh5Var = (hh5) this.A;
                i = 0;
                it = this.B.iterator();
            } else if (i2 == 1) {
                i = this.y;
                it = (qg5) this.w;
                hh5Var2 = (hh5) this.A;
                rp4.n(obj);
                yVar2 = this;
                if (!((Boolean) obj).booleanValue()) {
                }
            } else if (i2 == 2) {
                i = this.y;
                hh5 hh5Var3 = (hh5) this.x;
                qg5 qg5Var = (qg5) this.w;
                hh5 hh5Var4 = (hh5) this.A;
                rp4.n(obj);
                y yVar3 = this;
                yVar3.A = hh5Var4;
                yVar3.w = qg5Var;
                yVar3.x = null;
                yVar3.y = i;
                yVar3.z = 3;
                if (hh5Var3.I(obj, yVar3) != h) {
                    return h;
                }
                it = qg5Var;
                hh5Var = hh5Var4;
                yVar = yVar3;
                yVar.A = hh5Var;
                yVar.w = it;
                yVar.y = i;
                yVar.z = 1;
                a = it.a(yVar);
                if (a != h) {
                    return h;
                }
                y yVar4 = yVar;
                hh5Var2 = hh5Var;
                obj = a;
                yVar2 = yVar4;
                if (!((Boolean) obj).booleanValue()) {
                    Object next = it.next();
                    k05<Integer, E, uv4<? super R>, Object> k05Var = yVar2.C;
                    int i3 = i + 1;
                    Integer f = iw4.f(i);
                    yVar2.A = hh5Var2;
                    yVar2.w = it;
                    yVar2.x = hh5Var2;
                    yVar2.y = i3;
                    yVar2.z = 2;
                    obj = k05Var.I(f, next, yVar2);
                    if (obj == h) {
                        return h;
                    }
                    yVar3 = yVar2;
                    i = i3;
                    hh5Var4 = hh5Var2;
                    qg5Var = it;
                    hh5Var3 = hh5Var4;
                    yVar3.A = hh5Var4;
                    yVar3.w = qg5Var;
                    yVar3.x = null;
                    yVar3.y = i;
                    yVar3.z = 3;
                    if (hh5Var3.I(obj, yVar3) != h) {
                    }
                } else {
                    return yq4.a;
                }
            } else if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                i = this.y;
                it = (qg5) this.w;
                rp4.n(obj);
                hh5Var = (hh5) this.A;
            }
            yVar = this;
            yVar.A = hh5Var;
            yVar.w = it;
            yVar.y = i;
            yVar.z = 1;
            a = it.a(yVar);
            if (a != h) {
            }
        }

        @Override // com.p7700g.p99005.hw4
        @NotNull
        public final uv4<yq4> X(@Nullable Object obj, @NotNull uv4<?> uv4Var) {
            y yVar = new y(this.B, this.C, uv4Var);
            yVar.A = obj;
            return yVar;
        }
    }

    /* compiled from: Deprecated.kt */
    @mw4(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {aa.c.r, aa.c.t}, m = "maxWith", n = {"comparator", "$this$consume$iv", "iterator", "comparator", "$this$consume$iv", "iterator", "max"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class z<E> extends kw4 {
        public int A;
        public Object v;
        public Object w;
        public Object x;
        public Object y;
        public /* synthetic */ Object z;

        public z(uv4<? super z> uv4Var) {
            super(uv4Var);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            Object M;
            this.z = obj;
            this.A |= Integer.MIN_VALUE;
            M = wg5.M(null, null, this);
            return M;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0070 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:59:0x0033, B:72:0x0067, B:74:0x0070, B:76:0x007a, B:79:0x0084, B:68:0x0053, B:80:0x008b), top: B:91:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x008b A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #1 {all -> 0x0037, blocks: (B:59:0x0033, B:72:0x0067, B:74:0x0070, B:76:0x007a, B:79:0x0084, B:68:0x0053, B:80:0x008b), top: B:91:0x0033 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0064 -> B:72:0x0067). Please submit an issue!!! */
    @xn4(level = zn4.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object A(jh5 jh5Var, Object obj, uv4 uv4Var) {
        t tVar;
        int i2;
        jh5 jh5Var2;
        Throwable th;
        qg5 it;
        b35.f fVar;
        Object obj2;
        Object a2;
        try {
            if (uv4Var instanceof t) {
                tVar = (t) uv4Var;
                int i3 = tVar.A;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    tVar.A = i3 - Integer.MIN_VALUE;
                    Object obj3 = tVar.z;
                    Object h2 = gw4.h();
                    i2 = tVar.A;
                    if (i2 != 0) {
                        rp4.n(obj3);
                        b35.f fVar2 = new b35.f();
                        try {
                            jh5Var2 = jh5Var;
                            it = jh5Var.iterator();
                            fVar = fVar2;
                            obj2 = obj;
                            tVar.v = obj2;
                            tVar.w = fVar;
                            tVar.x = jh5Var2;
                            tVar.y = it;
                            tVar.A = 1;
                            a2 = it.a(tVar);
                            if (a2 != h2) {
                            }
                        } catch (Throwable th2) {
                            jh5Var2 = jh5Var;
                            th = th2;
                        }
                    } else if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        it = (qg5) tVar.y;
                        jh5Var2 = (jh5) tVar.x;
                        fVar = (b35.f) tVar.w;
                        Object obj4 = tVar.v;
                        try {
                            rp4.n(obj3);
                            if (((Boolean) obj3).booleanValue()) {
                                if (c25.g(obj4, it.next())) {
                                    Integer f2 = iw4.f(fVar.s);
                                    tg5.b(jh5Var2, null);
                                    return f2;
                                }
                                fVar.s++;
                                obj2 = obj4;
                                tVar.v = obj2;
                                tVar.w = fVar;
                                tVar.x = jh5Var2;
                                tVar.y = it;
                                tVar.A = 1;
                                a2 = it.a(tVar);
                                if (a2 != h2) {
                                    return h2;
                                }
                                obj4 = obj2;
                                obj3 = a2;
                                if (((Boolean) obj3).booleanValue()) {
                                }
                            } else {
                                yq4 yq4Var = yq4.a;
                                tg5.b(jh5Var2, null);
                                return iw4.f(-1);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                    throw th;
                }
            }
            throw th;
        } catch (Throwable th4) {
            tg5.b(jh5Var2, th);
            throw th4;
        }
        tVar = new t(uv4Var);
        Object obj32 = tVar.z;
        Object h22 = gw4.h();
        i2 = tVar.A;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x009d A[Catch: all -> 0x004e, TRY_ENTER, TryCatch #3 {all -> 0x004e, blocks: (B:79:0x004a, B:88:0x0068, B:90:0x0070, B:103:0x009d, B:104:0x00a4), top: B:117:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0070 A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #3 {all -> 0x004e, blocks: (B:79:0x004a, B:88:0x0068, B:90:0x0070, B:103:0x009d, B:104:0x00a4), top: B:117:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0093 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #1 {all -> 0x0036, blocks: (B:72:0x0032, B:97:0x008b, B:99:0x0093), top: B:113:0x0032 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x0086 -> B:96:0x008a). Please submit an issue!!! */
    @xn4(level = zn4.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object B(jh5 jh5Var, uv4 uv4Var) {
        u uVar;
        Object obj;
        int i2;
        jh5 jh5Var2;
        qg5 qg5Var;
        Object next;
        qg5 qg5Var2;
        Object a2;
        if (uv4Var instanceof u) {
            uVar = (u) uv4Var;
            int i3 = uVar.z;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                uVar.z = i3 - Integer.MIN_VALUE;
                obj = uVar.y;
                Object h2 = gw4.h();
                i2 = uVar.z;
                if (i2 != 0) {
                    rp4.n(obj);
                    try {
                        qg5 it = jh5Var.iterator();
                        uVar.v = jh5Var;
                        uVar.w = it;
                        uVar.z = 1;
                        Object a3 = it.a(uVar);
                        if (a3 == h2) {
                            return h2;
                        }
                        jh5Var2 = jh5Var;
                        qg5Var = it;
                        obj = a3;
                    } catch (Throwable th) {
                        jh5Var2 = jh5Var;
                        th = th;
                        throw th;
                    }
                } else if (i2 == 1) {
                    qg5Var = (qg5) uVar.w;
                    jh5Var2 = (jh5) uVar.v;
                    try {
                        rp4.n(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    Object obj2 = uVar.x;
                    qg5Var2 = (qg5) uVar.w;
                    jh5 jh5Var3 = (jh5) uVar.v;
                    try {
                        rp4.n(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            next = qg5Var2.next();
                            jh5Var = jh5Var3;
                            uVar.v = jh5Var;
                            uVar.w = qg5Var2;
                            uVar.x = next;
                            uVar.z = 2;
                            a2 = qg5Var2.a(uVar);
                            if (a2 != h2) {
                                return h2;
                            }
                            jh5Var3 = jh5Var;
                            obj2 = next;
                            obj = a2;
                            if (!((Boolean) obj).booleanValue()) {
                                tg5.b(jh5Var3, null);
                                return obj2;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        jh5Var2 = jh5Var3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            tg5.b(jh5Var2, th);
                            throw th4;
                        }
                    }
                }
                if (!((Boolean) obj).booleanValue()) {
                    next = qg5Var.next();
                    jh5 jh5Var4 = jh5Var2;
                    qg5Var2 = qg5Var;
                    jh5Var = jh5Var4;
                    uVar.v = jh5Var;
                    uVar.w = qg5Var2;
                    uVar.x = next;
                    uVar.z = 2;
                    a2 = qg5Var2.a(uVar);
                    if (a2 != h2) {
                    }
                } else {
                    throw new NoSuchElementException("ReceiveChannel is empty.");
                }
            }
        }
        uVar = new u(uv4Var);
        obj = uVar.y;
        Object h22 = gw4.h();
        i2 = uVar.z;
        if (i2 != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x007e A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:58:0x0037, B:71:0x0075, B:73:0x007e, B:75:0x0088, B:76:0x008c, B:67:0x005f, B:77:0x0093), top: B:88:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0093 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:58:0x0037, B:71:0x0075, B:73:0x007e, B:75:0x0088, B:76:0x008c, B:67:0x005f, B:77:0x0093), top: B:88:0x0037 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0072 -> B:71:0x0075). Please submit an issue!!! */
    @xn4(level = zn4.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object C(jh5 jh5Var, Object obj, uv4 uv4Var) {
        v vVar;
        int i2;
        b35.f fVar;
        jh5 jh5Var2;
        Throwable th;
        qg5 it;
        b35.f fVar2;
        Object obj2;
        Object a2;
        if (uv4Var instanceof v) {
            vVar = (v) uv4Var;
            int i3 = vVar.B;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                vVar.B = i3 - Integer.MIN_VALUE;
                Object obj3 = vVar.A;
                Object h2 = gw4.h();
                i2 = vVar.B;
                if (i2 != 0) {
                    rp4.n(obj3);
                    b35.f fVar3 = new b35.f();
                    fVar3.s = -1;
                    fVar = new b35.f();
                    try {
                        jh5Var2 = jh5Var;
                        it = jh5Var.iterator();
                        fVar2 = fVar3;
                        obj2 = obj;
                        vVar.v = obj2;
                        vVar.w = fVar2;
                        vVar.x = fVar;
                        vVar.y = jh5Var2;
                        vVar.z = it;
                        vVar.B = 1;
                        a2 = it.a(vVar);
                        if (a2 != h2) {
                        }
                    } catch (Throwable th2) {
                        jh5Var2 = jh5Var;
                        th = th2;
                        throw th;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    it = (qg5) vVar.z;
                    jh5Var2 = (jh5) vVar.y;
                    fVar = (b35.f) vVar.x;
                    fVar2 = (b35.f) vVar.w;
                    Object obj4 = vVar.v;
                    try {
                        rp4.n(obj3);
                        if (((Boolean) obj3).booleanValue()) {
                            if (c25.g(obj4, it.next())) {
                                fVar2.s = fVar.s;
                            }
                            fVar.s++;
                            obj2 = obj4;
                            vVar.v = obj2;
                            vVar.w = fVar2;
                            vVar.x = fVar;
                            vVar.y = jh5Var2;
                            vVar.z = it;
                            vVar.B = 1;
                            a2 = it.a(vVar);
                            if (a2 != h2) {
                                return h2;
                            }
                            obj4 = obj2;
                            obj3 = a2;
                            if (((Boolean) obj3).booleanValue()) {
                            }
                        } else {
                            yq4 yq4Var = yq4.a;
                            tg5.b(jh5Var2, null);
                            return iw4.f(fVar2.s);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            tg5.b(jh5Var2, th);
                            throw th4;
                        }
                    }
                }
            }
        }
        vVar = new v(uv4Var);
        Object obj32 = vVar.A;
        Object h22 = gw4.h();
        i2 = vVar.B;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0097 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #2 {all -> 0x0037, blocks: (B:72:0x0033, B:98:0x008f, B:100:0x0097), top: B:114:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0075 A[Catch: all -> 0x004f, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x004f, blocks: (B:79:0x004b, B:88:0x0069, B:92:0x0075), top: B:116:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x008b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x008b -> B:98:0x008f). Please submit an issue!!! */
    @xn4(level = zn4.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object D(jh5 jh5Var, uv4 uv4Var) {
        w wVar;
        Object obj;
        int i2;
        jh5 jh5Var2;
        qg5 qg5Var;
        Object next;
        qg5 qg5Var2;
        Object a2;
        if (uv4Var instanceof w) {
            wVar = (w) uv4Var;
            int i3 = wVar.z;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                wVar.z = i3 - Integer.MIN_VALUE;
                obj = wVar.y;
                Object h2 = gw4.h();
                i2 = wVar.z;
                if (i2 != 0) {
                    rp4.n(obj);
                    try {
                        qg5 it = jh5Var.iterator();
                        wVar.v = jh5Var;
                        wVar.w = it;
                        wVar.z = 1;
                        Object a3 = it.a(wVar);
                        if (a3 == h2) {
                            return h2;
                        }
                        jh5Var2 = jh5Var;
                        qg5Var = it;
                        obj = a3;
                    } catch (Throwable th) {
                        jh5Var2 = jh5Var;
                        th = th;
                        throw th;
                    }
                } else if (i2 == 1) {
                    qg5Var = (qg5) wVar.w;
                    jh5Var2 = (jh5) wVar.v;
                    try {
                        rp4.n(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    Object obj2 = wVar.x;
                    qg5Var2 = (qg5) wVar.w;
                    jh5 jh5Var3 = (jh5) wVar.v;
                    try {
                        rp4.n(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            next = qg5Var2.next();
                            jh5Var = jh5Var3;
                            wVar.v = jh5Var;
                            wVar.w = qg5Var2;
                            wVar.x = next;
                            wVar.z = 2;
                            a2 = qg5Var2.a(wVar);
                            if (a2 != h2) {
                                return h2;
                            }
                            jh5Var3 = jh5Var;
                            obj2 = next;
                            obj = a2;
                            if (!((Boolean) obj).booleanValue()) {
                                tg5.b(jh5Var3, null);
                                return obj2;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        jh5Var2 = jh5Var3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            tg5.b(jh5Var2, th);
                            throw th4;
                        }
                    }
                }
                if (((Boolean) obj).booleanValue()) {
                    tg5.b(jh5Var2, null);
                    return null;
                }
                next = qg5Var.next();
                jh5 jh5Var4 = jh5Var2;
                qg5Var2 = qg5Var;
                jh5Var = jh5Var4;
                wVar.v = jh5Var;
                wVar.w = qg5Var2;
                wVar.x = next;
                wVar.z = 2;
                a2 = qg5Var2.a(wVar);
                if (a2 != h2) {
                }
            }
        }
        wVar = new w(uv4Var);
        obj = wVar.y;
        Object h22 = gw4.h();
        i2 = wVar.z;
        if (i2 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    @np4
    @NotNull
    public static final <E, R> jh5<R> E(@NotNull jh5<? extends E> jh5Var, @NotNull xv4 xv4Var, @NotNull j05<? super E, ? super uv4<? super R>, ? extends Object> j05Var) {
        return fh5.g(vd5.s, xv4Var, 0, null, tg5.g(jh5Var), new x(jh5Var, j05Var, null), 6, null);
    }

    public static /* synthetic */ jh5 F(jh5 jh5Var, xv4 xv4Var, j05 j05Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            xv4Var = dd5.g();
        }
        return tg5.J(jh5Var, xv4Var, j05Var);
    }

    @np4
    @NotNull
    public static final <E, R> jh5<R> G(@NotNull jh5<? extends E> jh5Var, @NotNull xv4 xv4Var, @NotNull k05<? super Integer, ? super E, ? super uv4<? super R>, ? extends Object> k05Var) {
        return fh5.g(vd5.s, xv4Var, 0, null, tg5.g(jh5Var), new y(jh5Var, k05Var, null), 6, null);
    }

    public static /* synthetic */ jh5 H(jh5 jh5Var, xv4 xv4Var, k05 k05Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            xv4Var = dd5.g();
        }
        return tg5.L(jh5Var, xv4Var, k05Var);
    }

    @xn4(level = zn4.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ jh5 I(jh5 jh5Var, xv4 xv4Var, k05 k05Var) {
        return tg5.y(tg5.L(jh5Var, xv4Var, k05Var));
    }

    public static /* synthetic */ jh5 J(jh5 jh5Var, xv4 xv4Var, k05 k05Var, int i2, Object obj) {
        jh5 I;
        if ((i2 & 1) != 0) {
            xv4Var = dd5.g();
        }
        I = I(jh5Var, xv4Var, k05Var);
        return I;
    }

    @xn4(level = zn4.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ jh5 K(jh5 jh5Var, xv4 xv4Var, j05 j05Var) {
        return tg5.y(tg5.J(jh5Var, xv4Var, j05Var));
    }

    public static /* synthetic */ jh5 L(jh5 jh5Var, xv4 xv4Var, j05 j05Var, int i2, Object obj) {
        jh5 K;
        if ((i2 & 1) != 0) {
            xv4Var = dd5.g();
        }
        K = K(jh5Var, xv4Var, j05Var);
        return K;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00ac A[Catch: all -> 0x00bf, TRY_LEAVE, TryCatch #3 {all -> 0x00bf, blocks: (B:103:0x00a4, B:105:0x00ac, B:99:0x008f, B:89:0x0063), top: B:124:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0087 A[Catch: all -> 0x005d, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x005d, blocks: (B:84:0x0059, B:93:0x007b, B:97:0x0087), top: B:122:0x0059 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x00a0 -> B:78:0x003d). Please submit an issue!!! */
    @xn4(level = zn4.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object M(jh5 jh5Var, Comparator comparator, uv4 uv4Var) {
        z zVar;
        Object obj;
        int i2;
        jh5 jh5Var2;
        qg5 qg5Var;
        Comparator comparator2;
        Object next;
        Comparator comparator3;
        qg5 qg5Var2;
        Object a2;
        if (uv4Var instanceof z) {
            zVar = (z) uv4Var;
            int i3 = zVar.A;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                zVar.A = i3 - Integer.MIN_VALUE;
                obj = zVar.z;
                Object h2 = gw4.h();
                i2 = zVar.A;
                if (i2 != 0) {
                    rp4.n(obj);
                    try {
                        qg5 it = jh5Var.iterator();
                        zVar.v = comparator;
                        zVar.w = jh5Var;
                        zVar.x = it;
                        zVar.A = 1;
                        Object a3 = it.a(zVar);
                        if (a3 == h2) {
                            return h2;
                        }
                        jh5Var2 = jh5Var;
                        qg5Var = it;
                        obj = a3;
                        comparator2 = comparator;
                    } catch (Throwable th) {
                        jh5Var2 = jh5Var;
                        th = th;
                        throw th;
                    }
                } else if (i2 == 1) {
                    qg5Var = (qg5) zVar.x;
                    jh5Var2 = (jh5) zVar.w;
                    comparator2 = (Comparator) zVar.v;
                    try {
                        rp4.n(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    Object obj2 = zVar.y;
                    qg5Var2 = (qg5) zVar.x;
                    jh5 jh5Var3 = (jh5) zVar.w;
                    comparator3 = (Comparator) zVar.v;
                    try {
                        rp4.n(obj);
                        z zVar2 = zVar;
                        Object obj3 = obj2;
                        jh5Var = jh5Var3;
                        Object obj4 = h2;
                        z zVar3 = zVar2;
                        if (!((Boolean) obj).booleanValue()) {
                            next = qg5Var2.next();
                            if (comparator3.compare(obj3, next) >= 0) {
                                next = obj3;
                            }
                            zVar = zVar3;
                            h2 = obj4;
                            zVar.v = comparator3;
                            zVar.w = jh5Var;
                            zVar.x = qg5Var2;
                            zVar.y = next;
                            zVar.A = 2;
                            a2 = qg5Var2.a(zVar);
                            if (a2 != h2) {
                                return h2;
                            }
                            zVar2 = zVar;
                            obj3 = next;
                            obj = a2;
                            Object obj42 = h2;
                            z zVar32 = zVar2;
                            if (!((Boolean) obj).booleanValue()) {
                                tg5.b(jh5Var, null);
                                return obj3;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        jh5Var2 = jh5Var3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            tg5.b(jh5Var2, th);
                            throw th4;
                        }
                    }
                }
                if (((Boolean) obj).booleanValue()) {
                    tg5.b(jh5Var2, null);
                    return null;
                }
                next = qg5Var.next();
                comparator3 = comparator2;
                jh5 jh5Var4 = jh5Var2;
                qg5Var2 = qg5Var;
                jh5Var = jh5Var4;
                zVar.v = comparator3;
                zVar.w = jh5Var;
                zVar.x = qg5Var2;
                zVar.y = next;
                zVar.A = 2;
                a2 = qg5Var2.a(zVar);
                if (a2 != h2) {
                }
            }
        }
        zVar = new z(uv4Var);
        obj = zVar.z;
        Object h22 = gw4.h();
        i2 = zVar.A;
        if (i2 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00ac A[Catch: all -> 0x00bf, TRY_LEAVE, TryCatch #3 {all -> 0x00bf, blocks: (B:103:0x00a4, B:105:0x00ac, B:99:0x008f, B:89:0x0063), top: B:124:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0087 A[Catch: all -> 0x005d, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x005d, blocks: (B:84:0x0059, B:93:0x007b, B:97:0x0087), top: B:122:0x0059 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x00a0 -> B:78:0x003d). Please submit an issue!!! */
    @xn4(level = zn4.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object N(jh5 jh5Var, Comparator comparator, uv4 uv4Var) {
        a0 a0Var;
        Object obj;
        int i2;
        jh5 jh5Var2;
        qg5 qg5Var;
        Comparator comparator2;
        Object next;
        Comparator comparator3;
        qg5 qg5Var2;
        Object a2;
        if (uv4Var instanceof a0) {
            a0Var = (a0) uv4Var;
            int i3 = a0Var.A;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                a0Var.A = i3 - Integer.MIN_VALUE;
                obj = a0Var.z;
                Object h2 = gw4.h();
                i2 = a0Var.A;
                if (i2 != 0) {
                    rp4.n(obj);
                    try {
                        qg5 it = jh5Var.iterator();
                        a0Var.v = comparator;
                        a0Var.w = jh5Var;
                        a0Var.x = it;
                        a0Var.A = 1;
                        Object a3 = it.a(a0Var);
                        if (a3 == h2) {
                            return h2;
                        }
                        jh5Var2 = jh5Var;
                        qg5Var = it;
                        obj = a3;
                        comparator2 = comparator;
                    } catch (Throwable th) {
                        jh5Var2 = jh5Var;
                        th = th;
                        throw th;
                    }
                } else if (i2 == 1) {
                    qg5Var = (qg5) a0Var.x;
                    jh5Var2 = (jh5) a0Var.w;
                    comparator2 = (Comparator) a0Var.v;
                    try {
                        rp4.n(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    Object obj2 = a0Var.y;
                    qg5Var2 = (qg5) a0Var.x;
                    jh5 jh5Var3 = (jh5) a0Var.w;
                    comparator3 = (Comparator) a0Var.v;
                    try {
                        rp4.n(obj);
                        a0 a0Var2 = a0Var;
                        Object obj3 = obj2;
                        jh5Var = jh5Var3;
                        Object obj4 = h2;
                        a0 a0Var3 = a0Var2;
                        if (!((Boolean) obj).booleanValue()) {
                            next = qg5Var2.next();
                            if (comparator3.compare(obj3, next) <= 0) {
                                next = obj3;
                            }
                            a0Var = a0Var3;
                            h2 = obj4;
                            a0Var.v = comparator3;
                            a0Var.w = jh5Var;
                            a0Var.x = qg5Var2;
                            a0Var.y = next;
                            a0Var.A = 2;
                            a2 = qg5Var2.a(a0Var);
                            if (a2 != h2) {
                                return h2;
                            }
                            a0Var2 = a0Var;
                            obj3 = next;
                            obj = a2;
                            Object obj42 = h2;
                            a0 a0Var32 = a0Var2;
                            if (!((Boolean) obj).booleanValue()) {
                                tg5.b(jh5Var, null);
                                return obj3;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        jh5Var2 = jh5Var3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            tg5.b(jh5Var2, th);
                            throw th4;
                        }
                    }
                }
                if (((Boolean) obj).booleanValue()) {
                    tg5.b(jh5Var2, null);
                    return null;
                }
                next = qg5Var.next();
                comparator3 = comparator2;
                jh5 jh5Var4 = jh5Var2;
                qg5Var2 = qg5Var;
                jh5Var = jh5Var4;
                a0Var.v = comparator3;
                a0Var.w = jh5Var;
                a0Var.x = qg5Var2;
                a0Var.y = next;
                a0Var.A = 2;
                a2 = qg5Var2.a(a0Var);
                if (a2 != h2) {
                }
            }
        }
        a0Var = new a0(uv4Var);
        obj = a0Var.z;
        Object h22 = gw4.h();
        i2 = a0Var.A;
        if (i2 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0051  */
    @xn4(level = zn4.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object O(jh5 jh5Var, uv4 uv4Var) {
        b0 b0Var;
        Object obj;
        int i2;
        try {
            if (uv4Var instanceof b0) {
                b0Var = (b0) uv4Var;
                int i3 = b0Var.x;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    b0Var.x = i3 - Integer.MIN_VALUE;
                    obj = b0Var.w;
                    Object h2 = gw4.h();
                    i2 = b0Var.x;
                    boolean z2 = true;
                    if (i2 != 0) {
                        rp4.n(obj);
                        qg5 it = jh5Var.iterator();
                        b0Var.v = jh5Var;
                        b0Var.x = 1;
                        obj = it.a(b0Var);
                        if (obj == h2) {
                            return h2;
                        }
                    } else if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        jh5Var = (jh5) b0Var.v;
                        rp4.n(obj);
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        z2 = false;
                    }
                    Boolean a2 = iw4.a(z2);
                    tg5.b(jh5Var, null);
                    return a2;
                }
            }
            if (i2 != 0) {
            }
            if (!((Boolean) obj).booleanValue()) {
            }
            Boolean a22 = iw4.a(z2);
            tg5.b(jh5Var, null);
            return a22;
        } finally {
        }
        b0Var = new b0(uv4Var);
        obj = b0Var.w;
        Object h22 = gw4.h();
        i2 = b0Var.x;
        boolean z22 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x006c A[Catch: all -> 0x004a, TRY_LEAVE, TryCatch #2 {all -> 0x004a, blocks: (B:77:0x0046, B:86:0x0064, B:88:0x006c, B:99:0x0096, B:100:0x009d), top: B:111:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x008e A[Catch: all -> 0x0032, TRY_ENTER, TryCatch #1 {all -> 0x0032, blocks: (B:70:0x002e, B:93:0x0082, B:97:0x008e, B:98:0x0095), top: B:109:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0096 A[Catch: all -> 0x004a, TRY_ENTER, TryCatch #2 {all -> 0x004a, blocks: (B:77:0x0046, B:86:0x0064, B:88:0x006c, B:99:0x0096, B:100:0x009d), top: B:111:0x0046 }] */
    @xn4(level = zn4.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object Q(jh5 jh5Var, uv4 uv4Var) {
        d0 d0Var;
        Object obj;
        int i2;
        jh5 jh5Var2;
        Throwable th;
        qg5 qg5Var;
        jh5 jh5Var3;
        Object obj2;
        if (uv4Var instanceof d0) {
            d0Var = (d0) uv4Var;
            int i3 = d0Var.y;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                d0Var.y = i3 - Integer.MIN_VALUE;
                obj = d0Var.x;
                Object h2 = gw4.h();
                i2 = d0Var.y;
                if (i2 != 0) {
                    rp4.n(obj);
                    try {
                        qg5 it = jh5Var.iterator();
                        d0Var.v = jh5Var;
                        d0Var.w = it;
                        d0Var.y = 1;
                        Object a2 = it.a(d0Var);
                        if (a2 == h2) {
                            return h2;
                        }
                        jh5Var2 = jh5Var;
                        qg5Var = it;
                        obj = a2;
                    } catch (Throwable th2) {
                        jh5Var2 = jh5Var;
                        th = th2;
                        throw th;
                    }
                } else if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = d0Var.w;
                    jh5Var3 = (jh5) d0Var.v;
                    try {
                        rp4.n(obj);
                        if (((Boolean) obj).booleanValue()) {
                            tg5.b(jh5Var3, null);
                            return obj2;
                        }
                        throw new IllegalArgumentException("ReceiveChannel has more than one element.");
                    } catch (Throwable th3) {
                        th = th3;
                        jh5Var2 = jh5Var3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            tg5.b(jh5Var2, th);
                            throw th4;
                        }
                    }
                } else {
                    qg5Var = (qg5) d0Var.w;
                    jh5Var2 = (jh5) d0Var.v;
                    try {
                        rp4.n(obj);
                    } catch (Throwable th5) {
                        th = th5;
                        throw th;
                    }
                }
                if (!((Boolean) obj).booleanValue()) {
                    Object next = qg5Var.next();
                    d0Var.v = jh5Var2;
                    d0Var.w = next;
                    d0Var.y = 2;
                    Object a3 = qg5Var.a(d0Var);
                    if (a3 == h2) {
                        return h2;
                    }
                    jh5Var3 = jh5Var2;
                    obj = a3;
                    obj2 = next;
                    if (((Boolean) obj).booleanValue()) {
                    }
                } else {
                    throw new NoSuchElementException("ReceiveChannel is empty.");
                }
            }
        }
        d0Var = new d0(uv4Var);
        obj = d0Var.x;
        Object h22 = gw4.h();
        i2 = d0Var.y;
        if (i2 != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0071 A[Catch: all -> 0x004b, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x004b, blocks: (B:77:0x0047, B:86:0x0065, B:90:0x0071), top: B:112:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0092  */
    @xn4(level = zn4.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object R(jh5 jh5Var, uv4 uv4Var) {
        e0 e0Var;
        Object obj;
        int i2;
        jh5 jh5Var2;
        Throwable th;
        qg5 qg5Var;
        jh5 jh5Var3;
        Object obj2;
        if (uv4Var instanceof e0) {
            e0Var = (e0) uv4Var;
            int i3 = e0Var.y;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                e0Var.y = i3 - Integer.MIN_VALUE;
                obj = e0Var.x;
                Object h2 = gw4.h();
                i2 = e0Var.y;
                if (i2 != 0) {
                    rp4.n(obj);
                    try {
                        qg5 it = jh5Var.iterator();
                        e0Var.v = jh5Var;
                        e0Var.w = it;
                        e0Var.y = 1;
                        Object a2 = it.a(e0Var);
                        if (a2 == h2) {
                            return h2;
                        }
                        jh5Var2 = jh5Var;
                        qg5Var = it;
                        obj = a2;
                    } catch (Throwable th2) {
                        jh5Var2 = jh5Var;
                        th = th2;
                        throw th;
                    }
                } else if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = e0Var.w;
                    jh5Var3 = (jh5) e0Var.v;
                    try {
                        rp4.n(obj);
                        if (((Boolean) obj).booleanValue()) {
                            tg5.b(jh5Var3, null);
                            return obj2;
                        }
                        tg5.b(jh5Var3, null);
                        return null;
                    } catch (Throwable th3) {
                        th = th3;
                        jh5Var2 = jh5Var3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            tg5.b(jh5Var2, th);
                            throw th4;
                        }
                    }
                } else {
                    qg5Var = (qg5) e0Var.w;
                    jh5Var2 = (jh5) e0Var.v;
                    try {
                        rp4.n(obj);
                    } catch (Throwable th5) {
                        th = th5;
                        throw th;
                    }
                }
                if (((Boolean) obj).booleanValue()) {
                    tg5.b(jh5Var2, null);
                    return null;
                }
                Object next = qg5Var.next();
                e0Var.v = jh5Var2;
                e0Var.w = next;
                e0Var.y = 2;
                Object a3 = qg5Var.a(e0Var);
                if (a3 == h2) {
                    return h2;
                }
                jh5Var3 = jh5Var2;
                obj = a3;
                obj2 = next;
                if (((Boolean) obj).booleanValue()) {
                }
            }
        }
        e0Var = new e0(uv4Var);
        obj = e0Var.x;
        Object h22 = gw4.h();
        i2 = e0Var.y;
        if (i2 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    @xn4(level = zn4.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ jh5 S(jh5 jh5Var, int i2, xv4 xv4Var) {
        return fh5.g(vd5.s, xv4Var, 0, null, tg5.g(jh5Var), new f0(i2, jh5Var, null), 6, null);
    }

    public static /* synthetic */ jh5 T(jh5 jh5Var, int i2, xv4 xv4Var, int i3, Object obj) {
        jh5 S;
        if ((i3 & 2) != 0) {
            xv4Var = dd5.g();
        }
        S = S(jh5Var, i2, xv4Var);
        return S;
    }

    @xn4(level = zn4.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ jh5 U(jh5 jh5Var, xv4 xv4Var, j05 j05Var) {
        return fh5.g(vd5.s, xv4Var, 0, null, tg5.g(jh5Var), new g0(jh5Var, j05Var, null), 6, null);
    }

    public static /* synthetic */ jh5 V(jh5 jh5Var, xv4 xv4Var, j05 j05Var, int i2, Object obj) {
        jh5 U;
        if ((i2 & 1) != 0) {
            xv4Var = dd5.g();
        }
        U = U(jh5Var, xv4Var, j05Var);
        return U;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0079 A[Catch: all -> 0x0053, TryCatch #1 {all -> 0x0053, blocks: (B:62:0x0034, B:78:0x0071, B:80:0x0079, B:83:0x008c, B:67:0x004f), top: B:94:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x008c A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #1 {all -> 0x0053, blocks: (B:62:0x0034, B:78:0x0071, B:80:0x0079, B:83:0x008c, B:67:0x004f), top: B:94:0x0022 }] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v14, types: [com.p7700g.p99005.jh5] */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.p7700g.p99005.jh5] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v5, types: [com.p7700g.p99005.jh5, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0089 -> B:63:0x0037). Please submit an issue!!! */
    @np4
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <E, C extends nh5<? super E>> Object W(@NotNull jh5<? extends E> jh5Var, @NotNull C c2, @NotNull uv4<? super C> uv4Var) {
        h0 h0Var;
        int i2;
        qg5<? extends E> it;
        qg5<? extends E> qg5Var;
        nh5 nh5Var;
        C c3;
        Object a2;
        try {
            if (uv4Var instanceof h0) {
                h0Var = (h0) uv4Var;
                int i3 = h0Var.z;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    h0Var.z = i3 - Integer.MIN_VALUE;
                    Object obj = h0Var.y;
                    Object h2 = gw4.h();
                    i2 = h0Var.z;
                    if (i2 != 0) {
                        rp4.n(obj);
                        try {
                            it = jh5Var.iterator();
                            c3 = c2;
                            h0Var.v = c3;
                            h0Var.w = jh5Var;
                            h0Var.x = it;
                            h0Var.z = 1;
                            a2 = it.a(h0Var);
                            if (a2 == h2) {
                            }
                        } catch (Throwable th) {
                            c2 = jh5Var;
                            th = th;
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                tg5.b(c2, th);
                                throw th2;
                            }
                        }
                    } else if (i2 == 1) {
                        qg5Var = (qg5) h0Var.x;
                        C c4 = (C) ((jh5) h0Var.w);
                        nh5Var = (nh5) h0Var.v;
                        rp4.n(obj);
                        c2 = c4;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    } else if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        qg5Var = (qg5) h0Var.x;
                        ?? r8 = (C) ((jh5) h0Var.w);
                        nh5Var = (nh5) h0Var.v;
                        rp4.n(obj);
                        jh5<? extends E> jh5Var2 = r8;
                        it = qg5Var;
                        jh5Var = jh5Var2;
                        c3 = (C) nh5Var;
                        h0Var.v = c3;
                        h0Var.w = jh5Var;
                        h0Var.x = it;
                        h0Var.z = 1;
                        a2 = it.a(h0Var);
                        if (a2 == h2) {
                            return h2;
                        }
                        qg5Var = it;
                        obj = a2;
                        nh5Var = c3;
                        c2 = (C) jh5Var;
                        if (!((Boolean) obj).booleanValue()) {
                            E next = qg5Var.next();
                            h0Var.v = nh5Var;
                            h0Var.w = (Object) c2;
                            h0Var.x = qg5Var;
                            h0Var.z = 2;
                            jh5Var2 = c2;
                            if (nh5Var.I(next, h0Var) == h2) {
                                return h2;
                            }
                            it = qg5Var;
                            jh5Var = jh5Var2;
                            c3 = (C) nh5Var;
                            h0Var.v = c3;
                            h0Var.w = jh5Var;
                            h0Var.x = it;
                            h0Var.z = 1;
                            a2 = it.a(h0Var);
                            if (a2 == h2) {
                            }
                        } else {
                            yq4 yq4Var = yq4.a;
                            tg5.b((jh5) c2, null);
                            return nh5Var;
                        }
                    }
                }
            }
            if (i2 != 0) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        h0Var = new h0(uv4Var);
        Object obj2 = h0Var.y;
        Object h22 = gw4.h();
        i2 = h0Var.z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0065 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:55:0x0031, B:68:0x005c, B:70:0x0065, B:64:0x004a, B:71:0x006e), top: B:82:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x006e A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:55:0x0031, B:68:0x005c, B:70:0x0065, B:64:0x004a, B:71:0x006e), top: B:82:0x0031 }] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0059 -> B:68:0x005c). Please submit an issue!!! */
    @np4
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <E, C extends Collection<? super E>> Object X(@NotNull jh5<? extends E> jh5Var, @NotNull C c2, @NotNull uv4<? super C> uv4Var) {
        i0 i0Var;
        int i2;
        jh5<? extends E> jh5Var2;
        Throwable th;
        qg5<? extends E> it;
        C c3;
        Object a2;
        if (uv4Var instanceof i0) {
            i0Var = (i0) uv4Var;
            int i3 = i0Var.z;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                i0Var.z = i3 - Integer.MIN_VALUE;
                Object obj = i0Var.y;
                Object h2 = gw4.h();
                i2 = i0Var.z;
                if (i2 != 0) {
                    rp4.n(obj);
                    try {
                        jh5Var2 = jh5Var;
                        it = jh5Var.iterator();
                        c3 = c2;
                        i0Var.v = c3;
                        i0Var.w = jh5Var2;
                        i0Var.x = it;
                        i0Var.z = 1;
                        a2 = it.a(i0Var);
                        if (a2 != h2) {
                        }
                    } catch (Throwable th2) {
                        jh5Var2 = jh5Var;
                        th = th2;
                        throw th;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    qg5<? extends E> qg5Var = (qg5) i0Var.x;
                    jh5Var2 = (jh5) i0Var.w;
                    ?? r2 = (Collection) i0Var.v;
                    try {
                        rp4.n(obj);
                        C c4 = r2;
                        qg5<? extends E> qg5Var2 = qg5Var;
                        if (!((Boolean) obj).booleanValue()) {
                            c4.add(qg5Var2.next());
                            c3 = c4;
                            it = qg5Var2;
                            i0Var.v = c3;
                            i0Var.w = jh5Var2;
                            i0Var.x = it;
                            i0Var.z = 1;
                            a2 = it.a(i0Var);
                            if (a2 != h2) {
                                return h2;
                            }
                            c4 = c3;
                            obj = a2;
                            qg5Var2 = it;
                            if (!((Boolean) obj).booleanValue()) {
                                yq4 yq4Var = yq4.a;
                                tg5.b(jh5Var2, null);
                                return c4;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            tg5.b(jh5Var2, th);
                            throw th4;
                        }
                    }
                }
            }
        }
        i0Var = new i0(uv4Var);
        Object obj2 = i0Var.y;
        Object h22 = gw4.h();
        i2 = i0Var.z;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0065 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:55:0x0031, B:68:0x005c, B:70:0x0065, B:64:0x004a, B:71:0x0078), top: B:82:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0078 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:55:0x0031, B:68:0x005c, B:70:0x0065, B:64:0x004a, B:71:0x0078), top: B:82:0x0031 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0059 -> B:68:0x005c). Please submit an issue!!! */
    @np4
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <K, V, M extends Map<? super K, ? super V>> Object Y(@NotNull jh5<? extends hp4<? extends K, ? extends V>> jh5Var, @NotNull M m2, @NotNull uv4<? super M> uv4Var) {
        j0 j0Var;
        int i2;
        jh5<? extends hp4<? extends K, ? extends V>> jh5Var2;
        Throwable th;
        qg5<? extends hp4<? extends K, ? extends V>> it;
        M m3;
        Object a2;
        if (uv4Var instanceof j0) {
            j0Var = (j0) uv4Var;
            int i3 = j0Var.z;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                j0Var.z = i3 - Integer.MIN_VALUE;
                Object obj = j0Var.y;
                Object h2 = gw4.h();
                i2 = j0Var.z;
                if (i2 != 0) {
                    rp4.n(obj);
                    try {
                        jh5Var2 = jh5Var;
                        it = jh5Var.iterator();
                        m3 = m2;
                        j0Var.v = m3;
                        j0Var.w = jh5Var2;
                        j0Var.x = it;
                        j0Var.z = 1;
                        a2 = it.a(j0Var);
                        if (a2 != h2) {
                        }
                    } catch (Throwable th2) {
                        jh5Var2 = jh5Var;
                        th = th2;
                        throw th;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    qg5<? extends hp4<? extends K, ? extends V>> qg5Var = (qg5) j0Var.x;
                    jh5Var2 = (jh5) j0Var.w;
                    Map map = (Map) j0Var.v;
                    try {
                        rp4.n(obj);
                        Map map2 = map;
                        qg5<? extends hp4<? extends K, ? extends V>> qg5Var2 = qg5Var;
                        if (!((Boolean) obj).booleanValue()) {
                            hp4<? extends K, ? extends V> next = qg5Var2.next();
                            map2.put(next.m(), next.n());
                            m3 = map2;
                            it = qg5Var2;
                            j0Var.v = m3;
                            j0Var.w = jh5Var2;
                            j0Var.x = it;
                            j0Var.z = 1;
                            a2 = it.a(j0Var);
                            if (a2 != h2) {
                                return h2;
                            }
                            map2 = m3;
                            obj = a2;
                            qg5Var2 = it;
                            if (!((Boolean) obj).booleanValue()) {
                                yq4 yq4Var = yq4.a;
                                tg5.b(jh5Var2, null);
                                return map2;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            tg5.b(jh5Var2, th);
                            throw th4;
                        }
                    }
                }
            }
        }
        j0Var = new j0(uv4Var);
        Object obj2 = j0Var.y;
        Object h22 = gw4.h();
        i2 = j0Var.z;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0035  */
    @xn4(level = zn4.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object a(jh5 jh5Var, uv4 uv4Var) {
        a aVar;
        int i2;
        try {
            if (uv4Var instanceof a) {
                aVar = (a) uv4Var;
                int i3 = aVar.x;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    aVar.x = i3 - Integer.MIN_VALUE;
                    Object obj = aVar.w;
                    Object h2 = gw4.h();
                    i2 = aVar.x;
                    if (i2 != 0) {
                        rp4.n(obj);
                        qg5 it = jh5Var.iterator();
                        aVar.v = jh5Var;
                        aVar.x = 1;
                        obj = it.a(aVar);
                        if (obj == h2) {
                            return h2;
                        }
                    } else if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        jh5Var = (jh5) aVar.v;
                        rp4.n(obj);
                    }
                    tg5.b(jh5Var, null);
                    return obj;
                }
            }
            if (i2 != 0) {
            }
            tg5.b(jh5Var, null);
            return obj;
        } finally {
        }
        aVar = new a(uv4Var);
        Object obj2 = aVar.w;
        Object h22 = gw4.h();
        i2 = aVar.x;
    }

    @np4
    @NotNull
    public static final f05<Throwable, yq4> b(@NotNull jh5<?> jh5Var) {
        return new b(jh5Var);
    }

    @np4
    @Nullable
    public static final <E> Object b0(@NotNull jh5<? extends E> jh5Var, @NotNull uv4<? super Set<E>> uv4Var) {
        return tg5.f0(jh5Var, new LinkedHashSet(), uv4Var);
    }

    @np4
    @NotNull
    public static final f05<Throwable, yq4> c(@NotNull jh5<?>... jh5VarArr) {
        return new c(jh5VarArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0069 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:60:0x0031, B:74:0x0061, B:76:0x0069, B:77:0x0073), top: B:90:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0073 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:60:0x0031, B:74:0x0061, B:76:0x0069, B:77:0x0073), top: B:90:0x0031 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x005d -> B:73:0x0060). Please submit an issue!!! */
    @xn4(level = zn4.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object d(jh5 jh5Var, uv4 uv4Var) {
        d dVar;
        int i2;
        jh5 jh5Var2;
        Throwable th;
        b35.f fVar;
        jh5 jh5Var3;
        qg5 it;
        Object a2;
        if (uv4Var instanceof d) {
            dVar = (d) uv4Var;
            int i3 = dVar.z;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dVar.z = i3 - Integer.MIN_VALUE;
                Object obj = dVar.y;
                Object h2 = gw4.h();
                i2 = dVar.z;
                if (i2 != 0) {
                    rp4.n(obj);
                    try {
                        fVar = new b35.f();
                        jh5Var3 = jh5Var;
                        it = jh5Var.iterator();
                        dVar.v = fVar;
                        dVar.w = jh5Var3;
                        dVar.x = it;
                        dVar.z = 1;
                        a2 = it.a(dVar);
                        if (a2 != h2) {
                        }
                    } catch (Throwable th2) {
                        jh5Var2 = jh5Var;
                        th = th2;
                        throw th;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    it = (qg5) dVar.x;
                    jh5Var2 = (jh5) dVar.w;
                    fVar = (b35.f) dVar.v;
                    try {
                        rp4.n(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            it.next();
                            fVar.s++;
                            jh5Var3 = jh5Var2;
                            try {
                                dVar.v = fVar;
                                dVar.w = jh5Var3;
                                dVar.x = it;
                                dVar.z = 1;
                                a2 = it.a(dVar);
                                if (a2 != h2) {
                                    return h2;
                                }
                                jh5Var2 = jh5Var3;
                                obj = a2;
                                if (!((Boolean) obj).booleanValue()) {
                                    yq4 yq4Var = yq4.a;
                                    tg5.b(jh5Var2, null);
                                    return iw4.f(fVar.s);
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                jh5Var2 = jh5Var3;
                                try {
                                    throw th;
                                } catch (Throwable th4) {
                                    tg5.b(jh5Var2, th);
                                    throw th4;
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        throw th;
                    }
                }
            }
        }
        dVar = new d(uv4Var);
        Object obj2 = dVar.y;
        Object h22 = gw4.h();
        i2 = dVar.z;
        if (i2 != 0) {
        }
    }

    @xn4(level = zn4.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ jh5 d0(jh5 jh5Var, xv4 xv4Var) {
        return fh5.g(vd5.s, xv4Var, 0, null, tg5.g(jh5Var), new k0(jh5Var, null), 6, null);
    }

    public static /* synthetic */ jh5 e0(jh5 jh5Var, xv4 xv4Var, int i2, Object obj) {
        jh5 d02;
        if ((i2 & 1) != 0) {
            xv4Var = dd5.g();
        }
        d02 = d0(jh5Var, xv4Var);
        return d02;
    }

    @np4
    @NotNull
    public static final <E, K> jh5<E> f(@NotNull jh5<? extends E> jh5Var, @NotNull xv4 xv4Var, @NotNull j05<? super E, ? super uv4<? super K>, ? extends Object> j05Var) {
        return fh5.g(vd5.s, xv4Var, 0, null, tg5.g(jh5Var), new f(jh5Var, j05Var, null), 6, null);
    }

    public static /* synthetic */ jh5 g(jh5 jh5Var, xv4 xv4Var, j05 j05Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            xv4Var = dd5.g();
        }
        return tg5.k(jh5Var, xv4Var, j05Var);
    }

    @np4
    @NotNull
    public static final <E, R, V> jh5<V> g0(@NotNull jh5<? extends E> jh5Var, @NotNull jh5<? extends R> jh5Var2, @NotNull xv4 xv4Var, @NotNull j05<? super E, ? super R, ? extends V> j05Var) {
        return fh5.g(vd5.s, xv4Var, 0, null, tg5.h(jh5Var, jh5Var2), new m0(jh5Var2, jh5Var, j05Var, null), 6, null);
    }

    @xn4(level = zn4.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ jh5 h(jh5 jh5Var, int i2, xv4 xv4Var) {
        return fh5.g(vd5.s, xv4Var, 0, null, tg5.g(jh5Var), new g(i2, jh5Var, null), 6, null);
    }

    public static /* synthetic */ jh5 h0(jh5 jh5Var, jh5 jh5Var2, xv4 xv4Var, j05 j05Var, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            xv4Var = dd5.g();
        }
        return tg5.q0(jh5Var, jh5Var2, xv4Var, j05Var);
    }

    public static /* synthetic */ jh5 i(jh5 jh5Var, int i2, xv4 xv4Var, int i3, Object obj) {
        jh5 h2;
        if ((i3 & 2) != 0) {
            xv4Var = dd5.g();
        }
        h2 = h(jh5Var, i2, xv4Var);
        return h2;
    }

    @xn4(level = zn4.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ jh5 j(jh5 jh5Var, xv4 xv4Var, j05 j05Var) {
        return fh5.g(vd5.s, xv4Var, 0, null, tg5.g(jh5Var), new h(jh5Var, j05Var, null), 6, null);
    }

    public static /* synthetic */ jh5 k(jh5 jh5Var, xv4 xv4Var, j05 j05Var, int i2, Object obj) {
        jh5 j2;
        if ((i2 & 1) != 0) {
            xv4Var = dd5.g();
        }
        j2 = j(jh5Var, xv4Var, j05Var);
        return j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x006c A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #2 {all -> 0x0039, blocks: (B:62:0x0035, B:77:0x0064, B:79:0x006c, B:85:0x007b, B:86:0x0092), top: B:98:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x007b A[Catch: all -> 0x0039, TRY_ENTER, TryCatch #2 {all -> 0x0039, blocks: (B:62:0x0035, B:77:0x0064, B:79:0x006c, B:85:0x007b, B:86:0x0092), top: B:98:0x0035 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x005f -> B:76:0x0063). Please submit an issue!!! */
    @xn4(level = zn4.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object l(jh5 jh5Var, int i2, uv4 uv4Var) {
        i iVar;
        int i3;
        jh5 jh5Var2;
        Throwable th;
        int i4;
        qg5 it;
        Object a2;
        try {
            if (uv4Var instanceof i) {
                iVar = (i) uv4Var;
                int i5 = iVar.A;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    iVar.A = i5 - Integer.MIN_VALUE;
                    Object obj = iVar.z;
                    Object h2 = gw4.h();
                    i3 = iVar.A;
                    if (i3 != 0) {
                        rp4.n(obj);
                        if (i2 >= 0) {
                            i4 = 0;
                            it = jh5Var.iterator();
                            iVar.x = jh5Var;
                            iVar.y = it;
                            iVar.v = i2;
                            iVar.w = i4;
                            iVar.A = 1;
                            a2 = it.a(iVar);
                            if (a2 != h2) {
                            }
                        } else {
                            throw new IndexOutOfBoundsException("ReceiveChannel doesn't contain element at index " + i2 + '.');
                        }
                    } else if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        int i6 = iVar.w;
                        i2 = iVar.v;
                        it = (qg5) iVar.y;
                        jh5Var2 = (jh5) iVar.x;
                        try {
                            rp4.n(obj);
                            if (!((Boolean) obj).booleanValue()) {
                                Object next = it.next();
                                int i7 = i6 + 1;
                                if (i2 == i6) {
                                    tg5.b(jh5Var2, null);
                                    return next;
                                }
                                jh5Var = jh5Var2;
                                i4 = i7;
                                iVar.x = jh5Var;
                                iVar.y = it;
                                iVar.v = i2;
                                iVar.w = i4;
                                iVar.A = 1;
                                a2 = it.a(iVar);
                                if (a2 != h2) {
                                    return h2;
                                }
                                jh5Var2 = jh5Var;
                                i6 = i4;
                                obj = a2;
                                if (!((Boolean) obj).booleanValue()) {
                                    throw new IndexOutOfBoundsException("ReceiveChannel doesn't contain element at index " + i2 + '.');
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                tg5.b(jh5Var2, th);
                                throw th3;
                            }
                        }
                    }
                }
            }
            if (i3 != 0) {
            }
        } catch (Throwable th4) {
            jh5Var2 = jh5Var;
            th = th4;
        }
        iVar = new i(uv4Var);
        Object obj2 = iVar.z;
        Object h22 = gw4.h();
        i3 = iVar.A;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x006b A[Catch: all -> 0x007d, TRY_LEAVE, TryCatch #2 {all -> 0x007d, blocks: (B:76:0x0063, B:78:0x006b, B:73:0x0052, B:72:0x004e), top: B:96:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0079  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0060 -> B:76:0x0063). Please submit an issue!!! */
    @xn4(level = zn4.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object m(jh5 jh5Var, int i2, uv4 uv4Var) {
        j jVar;
        int i3;
        int i4;
        qg5 it;
        Throwable th;
        jh5 jh5Var2;
        Object a2;
        if (uv4Var instanceof j) {
            jVar = (j) uv4Var;
            int i5 = jVar.A;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                jVar.A = i5 - Integer.MIN_VALUE;
                Object obj = jVar.z;
                Object h2 = gw4.h();
                i3 = jVar.A;
                if (i3 != 0) {
                    rp4.n(obj);
                    if (i2 < 0) {
                        tg5.b(jh5Var, null);
                        return null;
                    }
                    i4 = 0;
                    try {
                        it = jh5Var.iterator();
                        jVar.x = jh5Var;
                        jVar.y = it;
                        jVar.v = i2;
                        jVar.w = i4;
                        jVar.A = 1;
                        a2 = it.a(jVar);
                        if (a2 == h2) {
                        }
                        if (((Boolean) a2).booleanValue()) {
                        }
                    } catch (Throwable th2) {
                        jh5Var2 = jh5Var;
                        th = th2;
                        throw th;
                    }
                } else if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    int i6 = jVar.w;
                    i2 = jVar.v;
                    it = (qg5) jVar.y;
                    jh5Var2 = (jh5) jVar.x;
                    try {
                        rp4.n(obj);
                        i4 = i6;
                        jh5Var = jh5Var2;
                        a2 = obj;
                        if (((Boolean) a2).booleanValue()) {
                            Object next = it.next();
                            int i7 = i4 + 1;
                            if (i2 == i4) {
                                tg5.b(jh5Var, null);
                                return next;
                            }
                            i4 = i7;
                            jVar.x = jh5Var;
                            jVar.y = it;
                            jVar.v = i2;
                            jVar.w = i4;
                            jVar.A = 1;
                            a2 = it.a(jVar);
                            if (a2 == h2) {
                                return h2;
                            }
                            if (((Boolean) a2).booleanValue()) {
                                tg5.b(jh5Var, null);
                                return null;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            tg5.b(jh5Var2, th);
                            throw th4;
                        }
                    }
                }
            }
        }
        jVar = new j(uv4Var);
        Object obj2 = jVar.z;
        Object h22 = gw4.h();
        i3 = jVar.A;
        if (i3 != 0) {
        }
    }

    @np4
    @NotNull
    public static final <E> jh5<E> n(@NotNull jh5<? extends E> jh5Var, @NotNull xv4 xv4Var, @NotNull j05<? super E, ? super uv4<? super Boolean>, ? extends Object> j05Var) {
        return fh5.g(vd5.s, xv4Var, 0, null, tg5.g(jh5Var), new k(jh5Var, j05Var, null), 6, null);
    }

    public static /* synthetic */ jh5 o(jh5 jh5Var, xv4 xv4Var, j05 j05Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            xv4Var = dd5.g();
        }
        return tg5.s(jh5Var, xv4Var, j05Var);
    }

    @xn4(level = zn4.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ jh5 p(jh5 jh5Var, xv4 xv4Var, k05 k05Var) {
        return fh5.g(vd5.s, xv4Var, 0, null, tg5.g(jh5Var), new l(jh5Var, k05Var, null), 6, null);
    }

    public static /* synthetic */ jh5 q(jh5 jh5Var, xv4 xv4Var, k05 k05Var, int i2, Object obj) {
        jh5 p2;
        if ((i2 & 1) != 0) {
            xv4Var = dd5.g();
        }
        p2 = p(jh5Var, xv4Var, k05Var);
        return p2;
    }

    @xn4(level = zn4.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ jh5 r(jh5 jh5Var, xv4 xv4Var, j05 j05Var) {
        return tg5.s(jh5Var, xv4Var, new m(j05Var, null));
    }

    public static /* synthetic */ jh5 s(jh5 jh5Var, xv4 xv4Var, j05 j05Var, int i2, Object obj) {
        jh5 r2;
        if ((i2 & 1) != 0) {
            xv4Var = dd5.g();
        }
        r2 = r(jh5Var, xv4Var, j05Var);
        return r2;
    }

    @np4
    @NotNull
    public static final <E> jh5<E> t(@NotNull jh5<? extends E> jh5Var) {
        jh5<E> o2;
        o2 = o(jh5Var, null, new n(null), 1, null);
        return o2;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0065 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:58:0x0031, B:71:0x005c, B:73:0x0065, B:75:0x006b, B:67:0x004a, B:77:0x0070), top: B:86:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0070 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:58:0x0031, B:71:0x005c, B:73:0x0065, B:75:0x006b, B:67:0x004a, B:77:0x0070), top: B:86:0x0031 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0059 -> B:71:0x005c). Please submit an issue!!! */
    @xn4(level = zn4.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object u(jh5 jh5Var, Collection collection, uv4 uv4Var) {
        o oVar;
        int i2;
        jh5 jh5Var2;
        Throwable th;
        qg5 it;
        Collection collection2;
        Object a2;
        if (uv4Var instanceof o) {
            oVar = (o) uv4Var;
            int i3 = oVar.z;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oVar.z = i3 - Integer.MIN_VALUE;
                Object obj = oVar.y;
                Object h2 = gw4.h();
                i2 = oVar.z;
                if (i2 != 0) {
                    rp4.n(obj);
                    try {
                        jh5Var2 = jh5Var;
                        it = jh5Var.iterator();
                        collection2 = collection;
                        oVar.v = collection2;
                        oVar.w = jh5Var2;
                        oVar.x = it;
                        oVar.z = 1;
                        a2 = it.a(oVar);
                        if (a2 != h2) {
                        }
                    } catch (Throwable th2) {
                        jh5Var2 = jh5Var;
                        th = th2;
                        throw th;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    it = (qg5) oVar.x;
                    jh5Var2 = (jh5) oVar.w;
                    Collection collection3 = (Collection) oVar.v;
                    try {
                        rp4.n(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            yq4 yq4Var = yq4.a;
                            tg5.b(jh5Var2, null);
                            return collection3;
                        }
                        Object next = it.next();
                        if (next != null) {
                            collection3.add(next);
                        }
                        collection2 = collection3;
                        oVar.v = collection2;
                        oVar.w = jh5Var2;
                        oVar.x = it;
                        oVar.z = 1;
                        a2 = it.a(oVar);
                        if (a2 != h2) {
                            return h2;
                        }
                        collection3 = collection2;
                        obj = a2;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            tg5.b(jh5Var2, th);
                            throw th4;
                        }
                    }
                }
            }
        }
        oVar = new o(uv4Var);
        Object obj2 = oVar.y;
        Object h22 = gw4.h();
        i2 = oVar.z;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x007e A[Catch: all -> 0x009d, TryCatch #2 {all -> 0x009d, blocks: (B:76:0x0062, B:80:0x0075, B:82:0x007e, B:84:0x0084, B:88:0x0097, B:75:0x005e), top: B:100:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0097 A[Catch: all -> 0x009d, TRY_LEAVE, TryCatch #2 {all -> 0x009d, blocks: (B:76:0x0062, B:80:0x0075, B:82:0x007e, B:84:0x0084, B:88:0x0097, B:75:0x005e), top: B:100:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0024 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.p7700g.p99005.nh5] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v8, types: [com.p7700g.p99005.jh5] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x0093 -> B:76:0x0062). Please submit an issue!!! */
    @xn4(level = zn4.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object v(jh5 jh5Var, nh5 nh5Var, uv4 uv4Var) {
        p pVar;
        Object h2;
        int i2;
        p pVar2;
        qg5 qg5Var;
        nh5 nh5Var2;
        qg5 qg5Var2;
        nh5 nh5Var3;
        Object a2;
        if (uv4Var instanceof p) {
            pVar = (p) uv4Var;
            int i3 = pVar.z;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pVar.z = i3 - Integer.MIN_VALUE;
                Object obj = pVar.y;
                h2 = gw4.h();
                i2 = pVar.z;
                if (i2 != 0) {
                    rp4.n(obj);
                    try {
                        qg5Var2 = jh5Var.iterator();
                        nh5Var3 = nh5Var;
                    } catch (Throwable th) {
                        nh5Var = jh5Var;
                        th = th;
                        throw th;
                    }
                } else {
                    try {
                        if (i2 == 1) {
                            qg5 qg5Var3 = (qg5) pVar.x;
                            jh5 jh5Var2 = (jh5) pVar.w;
                            nh5 nh5Var4 = (nh5) pVar.v;
                            rp4.n(obj);
                            pVar2 = pVar;
                            qg5Var = qg5Var3;
                            jh5Var = jh5Var2;
                            nh5Var2 = nh5Var4;
                            Object obj2 = h2;
                            p pVar3 = pVar2;
                            if (!((Boolean) obj).booleanValue()) {
                                yq4 yq4Var = yq4.a;
                                tg5.b(jh5Var, null);
                                return nh5Var2;
                            }
                            Object next = qg5Var.next();
                            if (next != null) {
                                pVar3.v = nh5Var2;
                                pVar3.w = jh5Var;
                                pVar3.x = qg5Var;
                                pVar3.z = 2;
                                if (nh5Var2.I(next, pVar3) == obj2) {
                                    return obj2;
                                }
                            }
                            qg5Var2 = qg5Var;
                            pVar = pVar3;
                            h2 = obj2;
                            nh5Var3 = nh5Var2;
                        } else if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            qg5 qg5Var4 = (qg5) pVar.x;
                            jh5 jh5Var3 = (jh5) pVar.w;
                            nh5 nh5Var5 = (nh5) pVar.v;
                            rp4.n(obj);
                            qg5Var2 = qg5Var4;
                            jh5Var = jh5Var3;
                            nh5Var3 = nh5Var5;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            tg5.b(nh5Var, th);
                            throw th3;
                        }
                    }
                }
                pVar.v = nh5Var3;
                pVar.w = jh5Var;
                pVar.x = qg5Var2;
                pVar.z = 1;
                a2 = qg5Var2.a(pVar);
                if (a2 != h2) {
                    return h2;
                }
                pVar2 = pVar;
                qg5Var = qg5Var2;
                obj = a2;
                nh5Var2 = nh5Var3;
                Object obj22 = h2;
                p pVar32 = pVar2;
                if (!((Boolean) obj).booleanValue()) {
                }
            }
        }
        pVar = new p(uv4Var);
        Object obj3 = pVar.y;
        h2 = gw4.h();
        i2 = pVar.z;
        if (i2 != 0) {
        }
        pVar.v = nh5Var3;
        pVar.w = jh5Var;
        pVar.x = qg5Var2;
        pVar.z = 1;
        a2 = qg5Var2.a(pVar);
        if (a2 != h2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x005c A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #1 {all -> 0x0031, blocks: (B:54:0x002d, B:66:0x0054, B:68:0x005c, B:71:0x0064, B:72:0x006b), top: B:81:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0064 A[Catch: all -> 0x0031, TRY_ENTER, TryCatch #1 {all -> 0x0031, blocks: (B:54:0x002d, B:66:0x0054, B:68:0x005c, B:71:0x0064, B:72:0x006b), top: B:81:0x002d }] */
    @xn4(level = zn4.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object w(jh5 jh5Var, uv4 uv4Var) {
        q qVar;
        Object obj;
        int i2;
        jh5 jh5Var2;
        Throwable th;
        qg5 qg5Var;
        if (uv4Var instanceof q) {
            qVar = (q) uv4Var;
            int i3 = qVar.y;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qVar.y = i3 - Integer.MIN_VALUE;
                obj = qVar.x;
                Object h2 = gw4.h();
                i2 = qVar.y;
                if (i2 != 0) {
                    rp4.n(obj);
                    try {
                        qg5 it = jh5Var.iterator();
                        qVar.v = jh5Var;
                        qVar.w = it;
                        qVar.y = 1;
                        Object a2 = it.a(qVar);
                        if (a2 == h2) {
                            return h2;
                        }
                        jh5Var2 = jh5Var;
                        qg5Var = it;
                        obj = a2;
                    } catch (Throwable th2) {
                        jh5Var2 = jh5Var;
                        th = th2;
                        throw th;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    qg5Var = (qg5) qVar.w;
                    jh5Var2 = (jh5) qVar.v;
                    try {
                        rp4.n(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            tg5.b(jh5Var2, th);
                            throw th4;
                        }
                    }
                }
                if (!((Boolean) obj).booleanValue()) {
                    Object next = qg5Var.next();
                    tg5.b(jh5Var2, null);
                    return next;
                }
                throw new NoSuchElementException("ReceiveChannel is empty.");
            }
        }
        qVar = new q(uv4Var);
        obj = qVar.x;
        Object h22 = gw4.h();
        i2 = qVar.y;
        if (i2 != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0060 A[Catch: all -> 0x0031, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:55:0x002d, B:66:0x0053, B:71:0x0060), top: B:80:0x002d }] */
    @xn4(level = zn4.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object x(jh5 jh5Var, uv4 uv4Var) {
        r rVar;
        Object obj;
        int i2;
        jh5 jh5Var2;
        Throwable th;
        qg5 qg5Var;
        if (uv4Var instanceof r) {
            rVar = (r) uv4Var;
            int i3 = rVar.y;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rVar.y = i3 - Integer.MIN_VALUE;
                obj = rVar.x;
                Object h2 = gw4.h();
                i2 = rVar.y;
                if (i2 != 0) {
                    rp4.n(obj);
                    try {
                        qg5 it = jh5Var.iterator();
                        rVar.v = jh5Var;
                        rVar.w = it;
                        rVar.y = 1;
                        Object a2 = it.a(rVar);
                        if (a2 == h2) {
                            return h2;
                        }
                        jh5Var2 = jh5Var;
                        qg5Var = it;
                        obj = a2;
                    } catch (Throwable th2) {
                        jh5Var2 = jh5Var;
                        th = th2;
                        throw th;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    qg5Var = (qg5) rVar.w;
                    jh5Var2 = (jh5) rVar.v;
                    try {
                        rp4.n(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            tg5.b(jh5Var2, th);
                            throw th4;
                        }
                    }
                }
                if (((Boolean) obj).booleanValue()) {
                    tg5.b(jh5Var2, null);
                    return null;
                }
                Object next = qg5Var.next();
                tg5.b(jh5Var2, null);
                return next;
            }
        }
        rVar = new r(uv4Var);
        obj = rVar.x;
        Object h22 = gw4.h();
        i2 = rVar.y;
        if (i2 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    @xn4(level = zn4.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ jh5 y(jh5 jh5Var, xv4 xv4Var, j05 j05Var) {
        return fh5.g(vd5.s, xv4Var, 0, null, tg5.g(jh5Var), new s(jh5Var, j05Var, null), 6, null);
    }

    public static /* synthetic */ jh5 z(jh5 jh5Var, xv4 xv4Var, j05 j05Var, int i2, Object obj) {
        jh5 y2;
        if ((i2 & 1) != 0) {
            xv4Var = dd5.g();
        }
        y2 = y(jh5Var, xv4Var, j05Var);
        return y2;
    }
}