package com.p7700g.p99005;

import com.onesignal.shortcutbadger.impl.NewHtcHomeBadger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* compiled from: _Maps.kt */
@vo4(d1 = {"\u0000\u0082\u0001\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000f\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001aJ\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010\u0005\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u00020\u00010\u0006H\u0086\bø\u0001\u0000\u001a$\u0010\b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004\u001aJ\u0010\b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010\u0005\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u00020\u00010\u0006H\u0086\bø\u0001\u0000\u001a9\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00070\n\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004H\u0087\b\u001a6\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00070\f\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004\u001a'\u0010\r\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004H\u0087\b\u001aJ\u0010\r\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010\u0005\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u00020\u00010\u0006H\u0086\bø\u0001\u0000\u001a[\u0010\u000f\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\b\b\u0002\u0010\u0010*\u00020\u0011*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042 \u0010\u0012\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u0001H\u00100\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001a]\u0010\u0014\u001a\u0004\u0018\u0001H\u0010\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\b\b\u0002\u0010\u0010*\u00020\u0011*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042 \u0010\u0012\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u0001H\u00100\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001a\\\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0016\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0010*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042$\u0010\u0012\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00100\n0\u0006H\u0086\bø\u0001\u0000\u001aa\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0016\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0010*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042$\u0010\u0012\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00100\f0\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0017\u001au\u0010\u0018\u001a\u0002H\u0019\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0010\"\u0010\b\u0003\u0010\u0019*\n\u0012\u0006\b\u0000\u0012\u0002H\u00100\u001a*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u001b\u001a\u0002H\u00192$\u0010\u0012\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00100\n0\u0006H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001aw\u0010\u0018\u001a\u0002H\u0019\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0010\"\u0010\b\u0003\u0010\u0019*\n\u0012\u0006\b\u0000\u0012\u0002H\u00100\u001a*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u001b\u001a\u0002H\u00192$\u0010\u0012\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00100\f0\u0006H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001c\u001aJ\u0010\u001e\u001a\u00020\u001f\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010 \u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u00020\u001f0\u0006H\u0087\bø\u0001\u0000\u001aV\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0016\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0010*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010\u0012\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u0002H\u00100\u0006H\u0086\bø\u0001\u0000\u001a\\\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0016\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\b\b\u0002\u0010\u0010*\u00020\u0011*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042 \u0010\u0012\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u0001H\u00100\u0006H\u0086\bø\u0001\u0000\u001au\u0010#\u001a\u0002H\u0019\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\b\b\u0002\u0010\u0010*\u00020\u0011\"\u0010\b\u0003\u0010\u0019*\n\u0012\u0006\b\u0000\u0012\u0002H\u00100\u001a*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u001b\u001a\u0002H\u00192 \u0010\u0012\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u0001H\u00100\u0006H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001ao\u0010$\u001a\u0002H\u0019\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0010\"\u0010\b\u0003\u0010\u0019*\n\u0012\u0006\b\u0000\u0012\u0002H\u00100\u001a*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u001b\u001a\u0002H\u00192\u001e\u0010\u0012\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u0002H\u00100\u0006H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001ak\u0010%\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u000e\b\u0002\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u00100&*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u0002H\u00100\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\b(\u001ah\u0010)\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u000e\b\u0002\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u00100&*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u0002H\u00100\u0006H\u0087\bø\u0001\u0000\u001a_\u0010*\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u000e\b\u0002\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u00100&*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u0002H\u00100\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010+\u001aJ\u0010*\u001a\u00020,\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u00020,0\u0006H\u0087\bø\u0001\u0000\u001aJ\u0010*\u001a\u00020-\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u00020-0\u0006H\u0087\bø\u0001\u0000\u001aa\u0010.\u001a\u0004\u0018\u0001H\u0010\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u000e\b\u0002\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u00100&*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u0002H\u00100\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010+\u001aQ\u0010.\u001a\u0004\u0018\u00010,\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u00020,0\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010/\u001aQ\u0010.\u001a\u0004\u0018\u00010-\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u00020-0\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\u00100\u001aq\u00101\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0010*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001a\u00102\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u001003j\n\u0012\u0006\b\u0000\u0012\u0002H\u0010`42\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u0002H\u00100\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\u00105\u001as\u00106\u001a\u0004\u0018\u0001H\u0010\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0010*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001a\u00102\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u001003j\n\u0012\u0006\b\u0000\u0012\u0002H\u0010`42\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u0002H\u00100\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\u00105\u001al\u00107\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u000422\u00102\u001a.\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u000703j\u0016\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007`4H\u0087\b¢\u0006\u0002\b8\u001ai\u00109\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u000422\u00102\u001a.\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u000703j\u0016\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007`4H\u0087\b\u001ak\u0010:\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u000e\b\u0002\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u00100&*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u0002H\u00100\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\b;\u001ah\u0010<\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u000e\b\u0002\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u00100&*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u0002H\u00100\u0006H\u0087\bø\u0001\u0000\u001a_\u0010=\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u000e\b\u0002\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u00100&*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u0002H\u00100\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010+\u001aJ\u0010=\u001a\u00020,\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u00020,0\u0006H\u0087\bø\u0001\u0000\u001aJ\u0010=\u001a\u00020-\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u00020-0\u0006H\u0087\bø\u0001\u0000\u001aa\u0010>\u001a\u0004\u0018\u0001H\u0010\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u000e\b\u0002\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u00100&*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u0002H\u00100\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010+\u001aQ\u0010>\u001a\u0004\u0018\u00010,\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u00020,0\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010/\u001aQ\u0010>\u001a\u0004\u0018\u00010-\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u00020-0\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\u00100\u001aq\u0010?\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0010*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001a\u00102\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u001003j\n\u0012\u0006\b\u0000\u0012\u0002H\u0010`42\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u0002H\u00100\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\u00105\u001as\u0010@\u001a\u0004\u0018\u0001H\u0010\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0010*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001a\u00102\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u001003j\n\u0012\u0006\b\u0000\u0012\u0002H\u0010`42\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u0002H\u00100\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\u00105\u001al\u0010A\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u000422\u00102\u001a.\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u000703j\u0016\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007`4H\u0087\b¢\u0006\u0002\bB\u001ai\u0010C\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u000422\u00102\u001a.\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u000703j\u0016\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007`4H\u0087\b\u001a$\u0010D\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004\u001aJ\u0010D\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u001e\u0010\u0005\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u00020\u00010\u0006H\u0086\bø\u0001\u0000\u001aY\u0010E\u001a\u0002HF\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0016\b\u0002\u0010F*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004*\u0002HF2\u001e\u0010 \u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u00020\u001f0\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010G\u001an\u0010H\u001a\u0002HF\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0016\b\u0002\u0010F*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004*\u0002HF23\u0010 \u001a/\u0012\u0013\u0012\u00110\u000e¢\u0006\f\bJ\u0012\b\bK\u0012\u0004\b\b(L\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u00020\u001f0IH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010M\u001a6\u0010N\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030O0\u0016\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006P"}, d2 = {"all", "", "K", bx.C4, "", "predicate", "Lkotlin/Function1;", "", "any", "asIterable", "", "asSequence", "Lkotlin/sequences/Sequence;", NewHtcHomeBadger.d, "", "firstNotNullOf", "R", "", "transform", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "firstNotNullOfOrNull", "flatMap", "", "flatMapSequence", "flatMapTo", "C", "", "destination", "(Ljava/util/Map;Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;", "flatMapSequenceTo", "forEach", "", "action", "map", "mapNotNull", "mapNotNullTo", "mapTo", "maxBy", "", "selector", "maxByOrThrow", "maxByOrNull", "maxOf", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/lang/Comparable;", "", "", "maxOfOrNull", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/lang/Double;", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/lang/Float;", "maxOfWith", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Ljava/util/Map;Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "maxOfWithOrNull", "maxWith", "maxWithOrThrow", "maxWithOrNull", "minBy", "minByOrThrow", "minByOrNull", "minOf", "minOfOrNull", "minOfWith", "minOfWithOrNull", "minWith", "minWithOrThrow", "minWithOrNull", "none", "onEach", "M", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "onEachIndexed", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", la1.l, "(Ljava/util/Map;Lkotlin/jvm/functions/Function2;)Ljava/util/Map;", "toList", "Lkotlin/Pair;", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/collections/MapsKt")
/* loaded from: classes3.dex */
public class pt4 extends ot4 {
    @dx4
    @gp4
    @tp4(version = "1.4")
    private static final <K, V> Float A1(Map<? extends K, ? extends V> map, f05<? super Map.Entry<? extends K, ? extends V>, Float> f05Var) {
        c25.p(map, "<this>");
        c25.p(f05Var, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            float floatValue = f05Var.M((Object) it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, f05Var.M((Object) it.next()).floatValue());
            }
            return Float.valueOf(floatValue);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dx4
    @gp4
    @tp4(version = "1.4")
    private static final <K, V, R> R B1(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, f05<? super Map.Entry<? extends K, ? extends V>, ? extends R> f05Var) {
        c25.p(map, "<this>");
        c25.p(comparator, "comparator");
        c25.p(f05Var, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Object obj = (R) f05Var.M((Object) it.next());
            while (it.hasNext()) {
                R M = f05Var.M((Object) it.next());
                if (comparator.compare(obj, M) > 0) {
                    obj = M;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dx4
    @gp4
    @tp4(version = "1.4")
    private static final <K, V, R> R C1(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, f05<? super Map.Entry<? extends K, ? extends V>, ? extends R> f05Var) {
        c25.p(map, "<this>");
        c25.p(comparator, "comparator");
        c25.p(f05Var, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Object obj = (R) f05Var.M((Object) it.next());
            while (it.hasNext()) {
                R M = f05Var.M((Object) it.next());
                if (comparator.compare(obj, M) > 0) {
                    obj = (Object) M;
                }
            }
            return obj;
        }
        return null;
    }

    @dx4
    @tp4(version = "1.4")
    private static final <K, V> Map.Entry<K, V> D1(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        c25.p(map, "<this>");
        c25.p(comparator, "comparator");
        return (Map.Entry) rs4.i4(map.entrySet(), comparator);
    }

    @fz4(name = "minWithOrThrow")
    @dx4
    @tp4(version = "1.7")
    private static final <K, V> Map.Entry<K, V> E1(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        c25.p(map, "<this>");
        c25.p(comparator, "comparator");
        return (Map.Entry) rs4.j4(map.entrySet(), comparator);
    }

    public static final <K, V> boolean F1(@NotNull Map<? extends K, ? extends V> map) {
        c25.p(map, "<this>");
        return map.isEmpty();
    }

    public static final <K, V> boolean G1(@NotNull Map<? extends K, ? extends V> map, @NotNull f05<? super Map.Entry<? extends K, ? extends V>, Boolean> f05Var) {
        c25.p(map, "<this>");
        c25.p(f05Var, "predicate");
        if (map.isEmpty()) {
            return true;
        }
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (f05Var.M(entry).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @tp4(version = "1.1")
    @NotNull
    public static final <K, V, M extends Map<? extends K, ? extends V>> M H1(@NotNull M m, @NotNull f05<? super Map.Entry<? extends K, ? extends V>, yq4> f05Var) {
        c25.p(m, "<this>");
        c25.p(f05Var, "action");
        for (Map.Entry<K, V> entry : m.entrySet()) {
            f05Var.M(entry);
        }
        return m;
    }

    @tp4(version = "1.4")
    @NotNull
    public static final <K, V, M extends Map<? extends K, ? extends V>> M I1(@NotNull M m, @NotNull j05<? super Integer, ? super Map.Entry<? extends K, ? extends V>, yq4> j05Var) {
        c25.p(m, "<this>");
        c25.p(j05Var, "action");
        int i = 0;
        for (Object obj : m.entrySet()) {
            int i2 = i + 1;
            if (i < 0) {
                js4.X();
            }
            j05Var.w3(Integer.valueOf(i), obj);
            i = i2;
        }
        return m;
    }

    @NotNull
    public static final <K, V> List<hp4<K, V>> J1(@NotNull Map<? extends K, ? extends V> map) {
        c25.p(map, "<this>");
        if (map.size() == 0) {
            return js4.F();
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return js4.F();
        }
        Map.Entry<? extends K, ? extends V> next = it.next();
        if (!it.hasNext()) {
            return is4.l(new hp4(next.getKey(), next.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new hp4(next.getKey(), next.getValue()));
        do {
            Map.Entry<? extends K, ? extends V> next2 = it.next();
            arrayList.add(new hp4(next2.getKey(), next2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    public static final <K, V> boolean P0(@NotNull Map<? extends K, ? extends V> map, @NotNull f05<? super Map.Entry<? extends K, ? extends V>, Boolean> f05Var) {
        c25.p(map, "<this>");
        c25.p(f05Var, "predicate");
        if (map.isEmpty()) {
            return true;
        }
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (!f05Var.M(entry).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <K, V> boolean Q0(@NotNull Map<? extends K, ? extends V> map) {
        c25.p(map, "<this>");
        return !map.isEmpty();
    }

    public static final <K, V> boolean R0(@NotNull Map<? extends K, ? extends V> map, @NotNull f05<? super Map.Entry<? extends K, ? extends V>, Boolean> f05Var) {
        c25.p(map, "<this>");
        c25.p(f05Var, "predicate");
        if (map.isEmpty()) {
            return false;
        }
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (f05Var.M(entry).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @dx4
    private static final <K, V> Iterable<Map.Entry<K, V>> S0(Map<? extends K, ? extends V> map) {
        c25.p(map, "<this>");
        return map.entrySet();
    }

    @NotNull
    public static final <K, V> g75<Map.Entry<K, V>> T0(@NotNull Map<? extends K, ? extends V> map) {
        c25.p(map, "<this>");
        return rs4.v1(map.entrySet());
    }

    @dx4
    private static final <K, V> int U0(Map<? extends K, ? extends V> map) {
        c25.p(map, "<this>");
        return map.size();
    }

    public static final <K, V> int V0(@NotNull Map<? extends K, ? extends V> map, @NotNull f05<? super Map.Entry<? extends K, ? extends V>, Boolean> f05Var) {
        c25.p(map, "<this>");
        c25.p(f05Var, "predicate");
        int i = 0;
        if (map.isEmpty()) {
            return 0;
        }
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (f05Var.M(entry).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    @dx4
    @tp4(version = "1.5")
    private static final <K, V, R> R W0(Map<? extends K, ? extends V> map, f05<? super Map.Entry<? extends K, ? extends V>, ? extends R> f05Var) {
        R r;
        c25.p(map, "<this>");
        c25.p(f05Var, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                r = null;
                break;
            }
            r = f05Var.M(it.next());
            if (r != null) {
                break;
            }
        }
        if (r != null) {
            return r;
        }
        throw new NoSuchElementException("No element of the map was transformed to a non-null value.");
    }

    @dx4
    @tp4(version = "1.5")
    private static final <K, V, R> R X0(Map<? extends K, ? extends V> map, f05<? super Map.Entry<? extends K, ? extends V>, ? extends R> f05Var) {
        c25.p(map, "<this>");
        c25.p(f05Var, "transform");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            R M = f05Var.M(entry);
            if (M != null) {
                return M;
            }
        }
        return null;
    }

    @NotNull
    public static final <K, V, R> List<R> Y0(@NotNull Map<? extends K, ? extends V> map, @NotNull f05<? super Map.Entry<? extends K, ? extends V>, ? extends Iterable<? extends R>> f05Var) {
        c25.p(map, "<this>");
        c25.p(f05Var, "transform");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            os4.o0(arrayList, f05Var.M(entry));
        }
        return arrayList;
    }

    @NotNull
    @fz4(name = "flatMapSequence")
    @gp4
    @tp4(version = "1.4")
    public static final <K, V, R> List<R> Z0(@NotNull Map<? extends K, ? extends V> map, @NotNull f05<? super Map.Entry<? extends K, ? extends V>, ? extends g75<? extends R>> f05Var) {
        c25.p(map, "<this>");
        c25.p(f05Var, "transform");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            os4.p0(arrayList, f05Var.M(entry));
        }
        return arrayList;
    }

    @NotNull
    @fz4(name = "flatMapSequenceTo")
    @gp4
    @tp4(version = "1.4")
    public static final <K, V, R, C extends Collection<? super R>> C a1(@NotNull Map<? extends K, ? extends V> map, @NotNull C c, @NotNull f05<? super Map.Entry<? extends K, ? extends V>, ? extends g75<? extends R>> f05Var) {
        c25.p(map, "<this>");
        c25.p(c, "destination");
        c25.p(f05Var, "transform");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            os4.p0(c, f05Var.M(entry));
        }
        return c;
    }

    @NotNull
    public static final <K, V, R, C extends Collection<? super R>> C b1(@NotNull Map<? extends K, ? extends V> map, @NotNull C c, @NotNull f05<? super Map.Entry<? extends K, ? extends V>, ? extends Iterable<? extends R>> f05Var) {
        c25.p(map, "<this>");
        c25.p(c, "destination");
        c25.p(f05Var, "transform");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            os4.o0(c, f05Var.M(entry));
        }
        return c;
    }

    @cx4
    public static final <K, V> void c1(@NotNull Map<? extends K, ? extends V> map, @NotNull f05<? super Map.Entry<? extends K, ? extends V>, yq4> f05Var) {
        c25.p(map, "<this>");
        c25.p(f05Var, "action");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            f05Var.M(entry);
        }
    }

    @NotNull
    public static final <K, V, R> List<R> d1(@NotNull Map<? extends K, ? extends V> map, @NotNull f05<? super Map.Entry<? extends K, ? extends V>, ? extends R> f05Var) {
        c25.p(map, "<this>");
        c25.p(f05Var, "transform");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            arrayList.add(f05Var.M(entry));
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V, R> List<R> e1(@NotNull Map<? extends K, ? extends V> map, @NotNull f05<? super Map.Entry<? extends K, ? extends V>, ? extends R> f05Var) {
        c25.p(map, "<this>");
        c25.p(f05Var, "transform");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            R M = f05Var.M(entry);
            if (M != null) {
                arrayList.add(M);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V, R, C extends Collection<? super R>> C f1(@NotNull Map<? extends K, ? extends V> map, @NotNull C c, @NotNull f05<? super Map.Entry<? extends K, ? extends V>, ? extends R> f05Var) {
        c25.p(map, "<this>");
        c25.p(c, "destination");
        c25.p(f05Var, "transform");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            R M = f05Var.M(entry);
            if (M != null) {
                c.add(M);
            }
        }
        return c;
    }

    @NotNull
    public static final <K, V, R, C extends Collection<? super R>> C g1(@NotNull Map<? extends K, ? extends V> map, @NotNull C c, @NotNull f05<? super Map.Entry<? extends K, ? extends V>, ? extends R> f05Var) {
        c25.p(map, "<this>");
        c25.p(c, "destination");
        c25.p(f05Var, "transform");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            c.add(f05Var.M(entry));
        }
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dx4
    @tp4(version = "1.4")
    private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> h1(Map<? extends K, ? extends V> map, f05<? super Map.Entry<? extends K, ? extends V>, ? extends R> f05Var) {
        Object obj;
        c25.p(map, "<this>");
        c25.p(f05Var, "selector");
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            Object obj2 = (Object) it.next();
            if (it.hasNext()) {
                R M = f05Var.M(obj2);
                Object obj3 = obj2;
                do {
                    Object obj4 = (Object) it.next();
                    R M2 = f05Var.M(obj4);
                    obj2 = obj3;
                    if (M.compareTo(M2) < 0) {
                        M = M2;
                        obj2 = (Object) obj4;
                    }
                    obj3 = obj2;
                } while (it.hasNext());
                obj = obj2;
            } else {
                obj = obj2;
            }
        } else {
            obj = null;
        }
        return (Map.Entry) obj;
    }

    @fz4(name = "maxByOrThrow")
    @dx4
    @tp4(version = "1.7")
    private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> i1(Map<? extends K, ? extends V> map, f05<? super Map.Entry<? extends K, ? extends V>, ? extends R> f05Var) {
        c25.p(map, "<this>");
        c25.p(f05Var, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Object obj = (Object) it.next();
            if (it.hasNext()) {
                R M = f05Var.M(obj);
                do {
                    Object obj2 = (Object) it.next();
                    R M2 = f05Var.M(obj2);
                    if (M.compareTo(M2) < 0) {
                        obj = (Object) obj2;
                        M = M2;
                    }
                } while (it.hasNext());
                return (Map.Entry) obj;
            }
            return (Map.Entry) obj;
        }
        throw new NoSuchElementException();
    }

    @dx4
    @gp4
    @tp4(version = "1.4")
    private static final <K, V> double j1(Map<? extends K, ? extends V> map, f05<? super Map.Entry<? extends K, ? extends V>, Double> f05Var) {
        c25.p(map, "<this>");
        c25.p(f05Var, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            double doubleValue = f05Var.M((Object) it.next()).doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, f05Var.M((Object) it.next()).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @dx4
    @gp4
    @tp4(version = "1.4")
    private static final <K, V> float k1(Map<? extends K, ? extends V> map, f05<? super Map.Entry<? extends K, ? extends V>, Float> f05Var) {
        c25.p(map, "<this>");
        c25.p(f05Var, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            float floatValue = f05Var.M((Object) it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, f05Var.M((Object) it.next()).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @dx4
    @gp4
    @tp4(version = "1.4")
    private static final <K, V, R extends Comparable<? super R>> R l1(Map<? extends K, ? extends V> map, f05<? super Map.Entry<? extends K, ? extends V>, ? extends R> f05Var) {
        c25.p(map, "<this>");
        c25.p(f05Var, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            R M = f05Var.M((Object) it.next());
            while (it.hasNext()) {
                R M2 = f05Var.M((Object) it.next());
                if (M.compareTo(M2) < 0) {
                    M = M2;
                }
            }
            return M;
        }
        throw new NoSuchElementException();
    }

    @dx4
    @gp4
    @tp4(version = "1.4")
    private static final <K, V, R extends Comparable<? super R>> R m1(Map<? extends K, ? extends V> map, f05<? super Map.Entry<? extends K, ? extends V>, ? extends R> f05Var) {
        c25.p(map, "<this>");
        c25.p(f05Var, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            R M = f05Var.M((Object) it.next());
            while (it.hasNext()) {
                R M2 = f05Var.M((Object) it.next());
                if (M.compareTo(M2) < 0) {
                    M = M2;
                }
            }
            return M;
        }
        return null;
    }

    @dx4
    @gp4
    @tp4(version = "1.4")
    private static final <K, V> Double n1(Map<? extends K, ? extends V> map, f05<? super Map.Entry<? extends K, ? extends V>, Double> f05Var) {
        c25.p(map, "<this>");
        c25.p(f05Var, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            double doubleValue = f05Var.M((Object) it.next()).doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, f05Var.M((Object) it.next()).doubleValue());
            }
            return Double.valueOf(doubleValue);
        }
        return null;
    }

    @dx4
    @gp4
    @tp4(version = "1.4")
    private static final <K, V> Float o1(Map<? extends K, ? extends V> map, f05<? super Map.Entry<? extends K, ? extends V>, Float> f05Var) {
        c25.p(map, "<this>");
        c25.p(f05Var, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            float floatValue = f05Var.M((Object) it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, f05Var.M((Object) it.next()).floatValue());
            }
            return Float.valueOf(floatValue);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dx4
    @gp4
    @tp4(version = "1.4")
    private static final <K, V, R> R p1(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, f05<? super Map.Entry<? extends K, ? extends V>, ? extends R> f05Var) {
        c25.p(map, "<this>");
        c25.p(comparator, "comparator");
        c25.p(f05Var, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Object obj = (R) f05Var.M((Object) it.next());
            while (it.hasNext()) {
                R M = f05Var.M((Object) it.next());
                if (comparator.compare(obj, M) < 0) {
                    obj = M;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dx4
    @gp4
    @tp4(version = "1.4")
    private static final <K, V, R> R q1(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, f05<? super Map.Entry<? extends K, ? extends V>, ? extends R> f05Var) {
        c25.p(map, "<this>");
        c25.p(comparator, "comparator");
        c25.p(f05Var, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Object obj = (R) f05Var.M((Object) it.next());
            while (it.hasNext()) {
                R M = f05Var.M((Object) it.next());
                if (comparator.compare(obj, M) < 0) {
                    obj = (Object) M;
                }
            }
            return obj;
        }
        return null;
    }

    @dx4
    @tp4(version = "1.4")
    private static final <K, V> Map.Entry<K, V> r1(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        c25.p(map, "<this>");
        c25.p(comparator, "comparator");
        return (Map.Entry) rs4.Q3(map.entrySet(), comparator);
    }

    @fz4(name = "maxWithOrThrow")
    @dx4
    @tp4(version = "1.7")
    private static final <K, V> Map.Entry<K, V> s1(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        c25.p(map, "<this>");
        c25.p(comparator, "comparator");
        return (Map.Entry) rs4.R3(map.entrySet(), comparator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dx4
    @tp4(version = "1.4")
    private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> t1(Map<? extends K, ? extends V> map, f05<? super Map.Entry<? extends K, ? extends V>, ? extends R> f05Var) {
        Object obj;
        c25.p(map, "<this>");
        c25.p(f05Var, "selector");
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            Object obj2 = (Object) it.next();
            if (it.hasNext()) {
                R M = f05Var.M(obj2);
                Object obj3 = obj2;
                do {
                    Object obj4 = (Object) it.next();
                    R M2 = f05Var.M(obj4);
                    obj2 = obj3;
                    if (M.compareTo(M2) > 0) {
                        M = M2;
                        obj2 = (Object) obj4;
                    }
                    obj3 = obj2;
                } while (it.hasNext());
                obj = obj2;
            } else {
                obj = obj2;
            }
        } else {
            obj = null;
        }
        return (Map.Entry) obj;
    }

    @fz4(name = "minByOrThrow")
    @dx4
    @tp4(version = "1.7")
    private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> u1(Map<? extends K, ? extends V> map, f05<? super Map.Entry<? extends K, ? extends V>, ? extends R> f05Var) {
        c25.p(map, "<this>");
        c25.p(f05Var, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Object obj = (Object) it.next();
            if (it.hasNext()) {
                R M = f05Var.M(obj);
                do {
                    Object obj2 = (Object) it.next();
                    R M2 = f05Var.M(obj2);
                    if (M.compareTo(M2) > 0) {
                        obj = (Object) obj2;
                        M = M2;
                    }
                } while (it.hasNext());
                return (Map.Entry) obj;
            }
            return (Map.Entry) obj;
        }
        throw new NoSuchElementException();
    }

    @dx4
    @gp4
    @tp4(version = "1.4")
    private static final <K, V> double v1(Map<? extends K, ? extends V> map, f05<? super Map.Entry<? extends K, ? extends V>, Double> f05Var) {
        c25.p(map, "<this>");
        c25.p(f05Var, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            double doubleValue = f05Var.M((Object) it.next()).doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, f05Var.M((Object) it.next()).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @dx4
    @gp4
    @tp4(version = "1.4")
    private static final <K, V> float w1(Map<? extends K, ? extends V> map, f05<? super Map.Entry<? extends K, ? extends V>, Float> f05Var) {
        c25.p(map, "<this>");
        c25.p(f05Var, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            float floatValue = f05Var.M((Object) it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, f05Var.M((Object) it.next()).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @dx4
    @gp4
    @tp4(version = "1.4")
    private static final <K, V, R extends Comparable<? super R>> R x1(Map<? extends K, ? extends V> map, f05<? super Map.Entry<? extends K, ? extends V>, ? extends R> f05Var) {
        c25.p(map, "<this>");
        c25.p(f05Var, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            R M = f05Var.M((Object) it.next());
            while (it.hasNext()) {
                R M2 = f05Var.M((Object) it.next());
                if (M.compareTo(M2) > 0) {
                    M = M2;
                }
            }
            return M;
        }
        throw new NoSuchElementException();
    }

    @dx4
    @gp4
    @tp4(version = "1.4")
    private static final <K, V, R extends Comparable<? super R>> R y1(Map<? extends K, ? extends V> map, f05<? super Map.Entry<? extends K, ? extends V>, ? extends R> f05Var) {
        c25.p(map, "<this>");
        c25.p(f05Var, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            R M = f05Var.M((Object) it.next());
            while (it.hasNext()) {
                R M2 = f05Var.M((Object) it.next());
                if (M.compareTo(M2) > 0) {
                    M = M2;
                }
            }
            return M;
        }
        return null;
    }

    @dx4
    @gp4
    @tp4(version = "1.4")
    private static final <K, V> Double z1(Map<? extends K, ? extends V> map, f05<? super Map.Entry<? extends K, ? extends V>, Double> f05Var) {
        c25.p(map, "<this>");
        c25.p(f05Var, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            double doubleValue = f05Var.M((Object) it.next()).doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, f05Var.M((Object) it.next()).doubleValue());
            }
            return Double.valueOf(doubleValue);
        }
        return null;
    }
}