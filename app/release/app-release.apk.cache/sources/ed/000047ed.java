package com.p7700g.p99005;

import com.p7700g.p99005.a55;
import com.p7700g.p99005.aa;
import com.p7700g.p99005.d55;
import com.p7700g.p99005.s45;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xbill.DNS.TTL;

/* compiled from: _Ranges.kt */
@vo4(d1 = {"\u0000p\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001d\u001a'\u0010\u0000\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\u0006\u0010\u0003\u001a\u0002H\u0001¢\u0006\u0002\u0010\u0004\u001a\u0012\u0010\u0000\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005\u001a\u0012\u0010\u0000\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006\u001a\u0012\u0010\u0000\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0007\u001a\u0012\u0010\u0000\u001a\u00020\b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\b\u001a\u0012\u0010\u0000\u001a\u00020\t*\u00020\t2\u0006\u0010\u0003\u001a\u00020\t\u001a\u0012\u0010\u0000\u001a\u00020\n*\u00020\n2\u0006\u0010\u0003\u001a\u00020\n\u001a'\u0010\u000b\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\u0006\u0010\f\u001a\u0002H\u0001¢\u0006\u0002\u0010\u0004\u001a\u0012\u0010\u000b\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005\u001a\u0012\u0010\u000b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006\u001a\u0012\u0010\u000b\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007\u001a\u0012\u0010\u000b\u001a\u00020\b*\u00020\b2\u0006\u0010\f\u001a\u00020\b\u001a\u0012\u0010\u000b\u001a\u00020\t*\u00020\t2\u0006\u0010\f\u001a\u00020\t\u001a\u0012\u0010\u000b\u001a\u00020\n*\u00020\n2\u0006\u0010\f\u001a\u00020\n\u001a3\u0010\r\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\b\u0010\u0003\u001a\u0004\u0018\u0001H\u00012\b\u0010\f\u001a\u0004\u0018\u0001H\u0001¢\u0006\u0002\u0010\u000e\u001a/\u0010\r\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001a-\u0010\r\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0012¢\u0006\u0002\u0010\u0013\u001a\u001a\u0010\r\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005\u001a\u001a\u0010\r\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006\u001a\u001a\u0010\r\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007\u001a\u001a\u0010\r\u001a\u00020\b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b\u001a\u0018\u0010\r\u001a\u00020\b*\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0012\u001a\u001a\u0010\r\u001a\u00020\t*\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t\u001a\u0018\u0010\r\u001a\u00020\t*\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0012\u001a\u001a\u0010\r\u001a\u00020\n*\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n\u001a\u001c\u0010\u0014\u001a\u00020\u0015*\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0087\n¢\u0006\u0002\u0010\u0019\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0002\b \u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b \u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\b \u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0087\u0002¢\u0006\u0002\b \u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b \u001a\u001c\u0010\u0014\u001a\u00020\u0015*\u00020!2\b\u0010\u0017\u001a\u0004\u0018\u00010\bH\u0087\n¢\u0006\u0002\u0010\"\u001a\u001c\u0010\u0014\u001a\u00020\u0015*\u00020#2\b\u0010\u0017\u001a\u0004\u0018\u00010\tH\u0087\n¢\u0006\u0002\u0010$\u001a\u0015\u0010%\u001a\u00020&*\u00020\u00052\u0006\u0010'\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010%\u001a\u00020&*\u00020\u00052\u0006\u0010'\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010%\u001a\u00020(*\u00020\u00052\u0006\u0010'\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010%\u001a\u00020&*\u00020\u00052\u0006\u0010'\u001a\u00020\nH\u0086\u0004\u001a\u0015\u0010%\u001a\u00020)*\u00020\u00182\u0006\u0010'\u001a\u00020\u0018H\u0086\u0004\u001a\u0015\u0010%\u001a\u00020&*\u00020\b2\u0006\u0010'\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010%\u001a\u00020&*\u00020\b2\u0006\u0010'\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010%\u001a\u00020(*\u00020\b2\u0006\u0010'\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010%\u001a\u00020&*\u00020\b2\u0006\u0010'\u001a\u00020\nH\u0086\u0004\u001a\u0015\u0010%\u001a\u00020(*\u00020\t2\u0006\u0010'\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010%\u001a\u00020(*\u00020\t2\u0006\u0010'\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010%\u001a\u00020(*\u00020\t2\u0006\u0010'\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010%\u001a\u00020(*\u00020\t2\u0006\u0010'\u001a\u00020\nH\u0086\u0004\u001a\u0015\u0010%\u001a\u00020&*\u00020\n2\u0006\u0010'\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010%\u001a\u00020&*\u00020\n2\u0006\u0010'\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010%\u001a\u00020(*\u00020\n2\u0006\u0010'\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010%\u001a\u00020&*\u00020\n2\u0006\u0010'\u001a\u00020\nH\u0086\u0004\u001a\f\u0010*\u001a\u00020\u0018*\u00020)H\u0007\u001a\f\u0010*\u001a\u00020\b*\u00020&H\u0007\u001a\f\u0010*\u001a\u00020\t*\u00020(H\u0007\u001a\u0013\u0010+\u001a\u0004\u0018\u00010\u0018*\u00020)H\u0007¢\u0006\u0002\u0010,\u001a\u0013\u0010+\u001a\u0004\u0018\u00010\b*\u00020&H\u0007¢\u0006\u0002\u0010-\u001a\u0013\u0010+\u001a\u0004\u0018\u00010\t*\u00020(H\u0007¢\u0006\u0002\u0010.\u001a\f\u0010/\u001a\u00020\u0018*\u00020)H\u0007\u001a\f\u0010/\u001a\u00020\b*\u00020&H\u0007\u001a\f\u0010/\u001a\u00020\t*\u00020(H\u0007\u001a\u0013\u00100\u001a\u0004\u0018\u00010\u0018*\u00020)H\u0007¢\u0006\u0002\u0010,\u001a\u0013\u00100\u001a\u0004\u0018\u00010\b*\u00020&H\u0007¢\u0006\u0002\u0010-\u001a\u0013\u00100\u001a\u0004\u0018\u00010\t*\u00020(H\u0007¢\u0006\u0002\u0010.\u001a\r\u00101\u001a\u00020\u0018*\u00020\u0016H\u0087\b\u001a\u0014\u00101\u001a\u00020\u0018*\u00020\u00162\u0006\u00101\u001a\u000202H\u0007\u001a\r\u00101\u001a\u00020\b*\u00020!H\u0087\b\u001a\u0014\u00101\u001a\u00020\b*\u00020!2\u0006\u00101\u001a\u000202H\u0007\u001a\r\u00101\u001a\u00020\t*\u00020#H\u0087\b\u001a\u0014\u00101\u001a\u00020\t*\u00020#2\u0006\u00101\u001a\u000202H\u0007\u001a\u0014\u00103\u001a\u0004\u0018\u00010\u0018*\u00020\u0016H\u0087\b¢\u0006\u0002\u00104\u001a\u001b\u00103\u001a\u0004\u0018\u00010\u0018*\u00020\u00162\u0006\u00101\u001a\u000202H\u0007¢\u0006\u0002\u00105\u001a\u0014\u00103\u001a\u0004\u0018\u00010\b*\u00020!H\u0087\b¢\u0006\u0002\u00106\u001a\u001b\u00103\u001a\u0004\u0018\u00010\b*\u00020!2\u0006\u00101\u001a\u000202H\u0007¢\u0006\u0002\u00107\u001a\u0014\u00103\u001a\u0004\u0018\u00010\t*\u00020#H\u0087\b¢\u0006\u0002\u00108\u001a\u001b\u00103\u001a\u0004\u0018\u00010\t*\u00020#2\u0006\u00101\u001a\u000202H\u0007¢\u0006\u0002\u00109\u001a\n\u0010:\u001a\u00020)*\u00020)\u001a\n\u0010:\u001a\u00020&*\u00020&\u001a\n\u0010:\u001a\u00020(*\u00020(\u001a\u0015\u0010;\u001a\u00020)*\u00020)2\u0006\u0010;\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010;\u001a\u00020&*\u00020&2\u0006\u0010;\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010;\u001a\u00020(*\u00020(2\u0006\u0010;\u001a\u00020\tH\u0086\u0004\u001a\u0013\u0010<\u001a\u0004\u0018\u00010\u0005*\u00020\u0006H\u0000¢\u0006\u0002\u0010=\u001a\u0013\u0010<\u001a\u0004\u0018\u00010\u0005*\u00020\u0007H\u0000¢\u0006\u0002\u0010>\u001a\u0013\u0010<\u001a\u0004\u0018\u00010\u0005*\u00020\bH\u0000¢\u0006\u0002\u0010?\u001a\u0013\u0010<\u001a\u0004\u0018\u00010\u0005*\u00020\tH\u0000¢\u0006\u0002\u0010@\u001a\u0013\u0010<\u001a\u0004\u0018\u00010\u0005*\u00020\nH\u0000¢\u0006\u0002\u0010A\u001a\u0013\u0010B\u001a\u0004\u0018\u00010\b*\u00020\u0006H\u0000¢\u0006\u0002\u0010C\u001a\u0013\u0010B\u001a\u0004\u0018\u00010\b*\u00020\u0007H\u0000¢\u0006\u0002\u0010D\u001a\u0013\u0010B\u001a\u0004\u0018\u00010\b*\u00020\tH\u0000¢\u0006\u0002\u0010E\u001a\u0013\u0010F\u001a\u0004\u0018\u00010\t*\u00020\u0006H\u0000¢\u0006\u0002\u0010G\u001a\u0013\u0010F\u001a\u0004\u0018\u00010\t*\u00020\u0007H\u0000¢\u0006\u0002\u0010H\u001a\u0013\u0010I\u001a\u0004\u0018\u00010\n*\u00020\u0006H\u0000¢\u0006\u0002\u0010J\u001a\u0013\u0010I\u001a\u0004\u0018\u00010\n*\u00020\u0007H\u0000¢\u0006\u0002\u0010K\u001a\u0013\u0010I\u001a\u0004\u0018\u00010\n*\u00020\bH\u0000¢\u0006\u0002\u0010L\u001a\u0013\u0010I\u001a\u0004\u0018\u00010\n*\u00020\tH\u0000¢\u0006\u0002\u0010M\u001a\u0015\u0010N\u001a\u00020!*\u00020\u00052\u0006\u0010'\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010N\u001a\u00020!*\u00020\u00052\u0006\u0010'\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010N\u001a\u00020#*\u00020\u00052\u0006\u0010'\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010N\u001a\u00020!*\u00020\u00052\u0006\u0010'\u001a\u00020\nH\u0086\u0004\u001a\u0015\u0010N\u001a\u00020\u0016*\u00020\u00182\u0006\u0010'\u001a\u00020\u0018H\u0086\u0004\u001a\u0015\u0010N\u001a\u00020!*\u00020\b2\u0006\u0010'\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010N\u001a\u00020!*\u00020\b2\u0006\u0010'\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010N\u001a\u00020#*\u00020\b2\u0006\u0010'\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010N\u001a\u00020!*\u00020\b2\u0006\u0010'\u001a\u00020\nH\u0086\u0004\u001a\u0015\u0010N\u001a\u00020#*\u00020\t2\u0006\u0010'\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010N\u001a\u00020#*\u00020\t2\u0006\u0010'\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010N\u001a\u00020#*\u00020\t2\u0006\u0010'\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010N\u001a\u00020#*\u00020\t2\u0006\u0010'\u001a\u00020\nH\u0086\u0004\u001a\u0015\u0010N\u001a\u00020!*\u00020\n2\u0006\u0010'\u001a\u00020\u0005H\u0086\u0004\u001a\u0015\u0010N\u001a\u00020!*\u00020\n2\u0006\u0010'\u001a\u00020\bH\u0086\u0004\u001a\u0015\u0010N\u001a\u00020#*\u00020\n2\u0006\u0010'\u001a\u00020\tH\u0086\u0004\u001a\u0015\u0010N\u001a\u00020!*\u00020\n2\u0006\u0010'\u001a\u00020\nH\u0086\u0004¨\u0006O"}, d2 = {"coerceAtLeast", "T", "", "minimumValue", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "", "", "", "", "", "", "coerceAtMost", "maximumValue", "coerceIn", "(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "range", "Lkotlin/ranges/ClosedFloatingPointRange;", "(Ljava/lang/Comparable;Lkotlin/ranges/ClosedFloatingPointRange;)Ljava/lang/Comparable;", "Lkotlin/ranges/ClosedRange;", "(Ljava/lang/Comparable;Lkotlin/ranges/ClosedRange;)Ljava/lang/Comparable;", "contains", "", "Lkotlin/ranges/CharRange;", "element", "", "(Lkotlin/ranges/CharRange;Ljava/lang/Character;)Z", "value", "byteRangeContains", "doubleRangeContains", "floatRangeContains", "intRangeContains", "longRangeContains", "shortRangeContains", "Lkotlin/ranges/IntRange;", "(Lkotlin/ranges/IntRange;Ljava/lang/Integer;)Z", "Lkotlin/ranges/LongRange;", "(Lkotlin/ranges/LongRange;Ljava/lang/Long;)Z", "downTo", "Lkotlin/ranges/IntProgression;", aa.h.d, "Lkotlin/ranges/LongProgression;", "Lkotlin/ranges/CharProgression;", "first", "firstOrNull", "(Lkotlin/ranges/CharProgression;)Ljava/lang/Character;", "(Lkotlin/ranges/IntProgression;)Ljava/lang/Integer;", "(Lkotlin/ranges/LongProgression;)Ljava/lang/Long;", "last", "lastOrNull", "random", "Lkotlin/random/Random;", "randomOrNull", "(Lkotlin/ranges/CharRange;)Ljava/lang/Character;", "(Lkotlin/ranges/CharRange;Lkotlin/random/Random;)Ljava/lang/Character;", "(Lkotlin/ranges/IntRange;)Ljava/lang/Integer;", "(Lkotlin/ranges/IntRange;Lkotlin/random/Random;)Ljava/lang/Integer;", "(Lkotlin/ranges/LongRange;)Ljava/lang/Long;", "(Lkotlin/ranges/LongRange;Lkotlin/random/Random;)Ljava/lang/Long;", "reversed", "step", "toByteExactOrNull", "(D)Ljava/lang/Byte;", "(F)Ljava/lang/Byte;", "(I)Ljava/lang/Byte;", "(J)Ljava/lang/Byte;", "(S)Ljava/lang/Byte;", "toIntExactOrNull", "(D)Ljava/lang/Integer;", "(F)Ljava/lang/Integer;", "(J)Ljava/lang/Integer;", "toLongExactOrNull", "(D)Ljava/lang/Long;", "(F)Ljava/lang/Long;", "toShortExactOrNull", "(D)Ljava/lang/Short;", "(F)Ljava/lang/Short;", "(I)Ljava/lang/Short;", "(J)Ljava/lang/Short;", "until", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/ranges/RangesKt")
/* loaded from: classes3.dex */
public class i55 extends h55 {
    public static final float A(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    @tp4(version = "1.7")
    public static final long A0(@NotNull d55 d55Var) {
        c25.p(d55Var, "<this>");
        if (!d55Var.isEmpty()) {
            return d55Var.h();
        }
        throw new NoSuchElementException("Progression " + d55Var + " is empty.");
    }

    @NotNull
    public static final c55 A1(int i, short s) {
        return new c55(i, s - 1);
    }

    public static final int B(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    @tp4(version = "1.7")
    @Nullable
    public static final Character B0(@NotNull s45 s45Var) {
        c25.p(s45Var, "<this>");
        if (s45Var.isEmpty()) {
            return null;
        }
        return Character.valueOf(s45Var.h());
    }

    @NotNull
    public static final c55 B1(short s, byte b) {
        return new c55(s, b - 1);
    }

    public static final int C(int i, @NotNull y45<Integer> y45Var) {
        c25.p(y45Var, "range");
        if (y45Var instanceof x45) {
            return ((Number) G(Integer.valueOf(i), (x45) y45Var)).intValue();
        }
        if (!y45Var.isEmpty()) {
            return i < y45Var.c().intValue() ? y45Var.c().intValue() : i > y45Var.d().intValue() ? y45Var.d().intValue() : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + y45Var + '.');
    }

    @tp4(version = "1.7")
    @Nullable
    public static final Integer C0(@NotNull a55 a55Var) {
        c25.p(a55Var, "<this>");
        if (a55Var.isEmpty()) {
            return null;
        }
        return Integer.valueOf(a55Var.h());
    }

    @NotNull
    public static final c55 C1(short s, int i) {
        if (i <= Integer.MIN_VALUE) {
            return c55.w.a();
        }
        return new c55(s, i - 1);
    }

    public static final long D(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
    }

    @tp4(version = "1.7")
    @Nullable
    public static final Long D0(@NotNull d55 d55Var) {
        c25.p(d55Var, "<this>");
        if (d55Var.isEmpty()) {
            return null;
        }
        return Long.valueOf(d55Var.h());
    }

    @NotNull
    public static final c55 D1(short s, short s2) {
        return new c55(s, s2 - 1);
    }

    public static final long E(long j, @NotNull y45<Long> y45Var) {
        c25.p(y45Var, "range");
        if (y45Var instanceof x45) {
            return ((Number) G(Long.valueOf(j), (x45) y45Var)).longValue();
        }
        if (!y45Var.isEmpty()) {
            return j < y45Var.c().longValue() ? y45Var.c().longValue() : j > y45Var.d().longValue() ? y45Var.d().longValue() : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + y45Var + '.');
    }

    @fz4(name = "longRangeContains")
    public static final boolean E0(@NotNull y45<Long> y45Var, byte b) {
        c25.p(y45Var, "<this>");
        return y45Var.a(Long.valueOf(b));
    }

    @NotNull
    public static final f55 E1(byte b, long j) {
        if (j <= Long.MIN_VALUE) {
            return f55.w.a();
        }
        return new f55(b, j - 1);
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T F(@NotNull T t, @Nullable T t2, @Nullable T t3) {
        c25.p(t, "<this>");
        if (t2 != null && t3 != null) {
            if (t2.compareTo(t3) <= 0) {
                if (t.compareTo(t2) < 0) {
                    return t2;
                }
                if (t.compareTo(t3) > 0) {
                    return t3;
                }
            } else {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + t3 + " is less than minimum " + t2 + '.');
            }
        } else if (t2 != null && t.compareTo(t2) < 0) {
            return t2;
        } else {
            if (t3 != null && t.compareTo(t3) > 0) {
                return t3;
            }
        }
        return t;
    }

    @fz4(name = "longRangeContains")
    @yn4(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @xn4(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean F0(y45 y45Var, double d) {
        c25.p(y45Var, "<this>");
        Long o1 = o1(d);
        if (o1 != null) {
            return y45Var.a(o1);
        }
        return false;
    }

    @NotNull
    public static final f55 F1(int i, long j) {
        if (j <= Long.MIN_VALUE) {
            return f55.w.a();
        }
        return new f55(i, j - 1);
    }

    @tp4(version = "1.1")
    @NotNull
    public static final <T extends Comparable<? super T>> T G(@NotNull T t, @NotNull x45<T> x45Var) {
        c25.p(t, "<this>");
        c25.p(x45Var, "range");
        if (!x45Var.isEmpty()) {
            return (!x45Var.b(t, x45Var.c()) || x45Var.b(x45Var.c(), t)) ? (!x45Var.b(x45Var.d(), t) || x45Var.b(t, x45Var.d())) ? t : x45Var.d() : x45Var.c();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + x45Var + '.');
    }

    @fz4(name = "longRangeContains")
    @yn4(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @xn4(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean G0(y45 y45Var, float f) {
        c25.p(y45Var, "<this>");
        Long p1 = p1(f);
        if (p1 != null) {
            return y45Var.a(p1);
        }
        return false;
    }

    @NotNull
    public static final f55 G1(long j, byte b) {
        return new f55(j, b - 1);
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T H(@NotNull T t, @NotNull y45<T> y45Var) {
        c25.p(t, "<this>");
        c25.p(y45Var, "range");
        if (y45Var instanceof x45) {
            return (T) G(t, (x45) y45Var);
        }
        if (!y45Var.isEmpty()) {
            return t.compareTo(y45Var.c()) < 0 ? y45Var.c() : t.compareTo(y45Var.d()) > 0 ? y45Var.d() : t;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + y45Var + '.');
    }

    @fz4(name = "longRangeContains")
    public static final boolean H0(@NotNull y45<Long> y45Var, int i) {
        c25.p(y45Var, "<this>");
        return y45Var.a(Long.valueOf(i));
    }

    @NotNull
    public static final f55 H1(long j, int i) {
        return new f55(j, i - 1);
    }

    public static final short I(short s, short s2, short s3) {
        if (s2 <= s3) {
            return s < s2 ? s2 : s > s3 ? s3 : s;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) s3) + " is less than minimum " + ((int) s2) + '.');
    }

    @fz4(name = "longRangeContains")
    public static final boolean I0(@NotNull y45<Long> y45Var, short s) {
        c25.p(y45Var, "<this>");
        return y45Var.a(Long.valueOf(s));
    }

    @NotNull
    public static final f55 I1(long j, long j2) {
        if (j2 <= Long.MIN_VALUE) {
            return f55.w.a();
        }
        return new f55(j, j2 - 1);
    }

    @dx4
    @tp4(version = "1.3")
    private static final boolean J(u45 u45Var, Character ch) {
        c25.p(u45Var, "<this>");
        return ch != null && u45Var.o(ch.charValue());
    }

    @dx4
    @tp4(version = "1.3")
    private static final char J0(u45 u45Var) {
        c25.p(u45Var, "<this>");
        return K0(u45Var, n45.s);
    }

    @NotNull
    public static final f55 J1(long j, short s) {
        return new f55(j, s - 1);
    }

    @dx4
    @tp4(version = "1.3")
    private static final boolean K(c55 c55Var, Integer num) {
        c25.p(c55Var, "<this>");
        return num != null && c55Var.o(num.intValue());
    }

    @tp4(version = "1.3")
    public static final char K0(@NotNull u45 u45Var, @NotNull n45 n45Var) {
        c25.p(u45Var, "<this>");
        c25.p(n45Var, "random");
        try {
            return (char) n45Var.B(u45Var.e(), u45Var.h() + 1);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @NotNull
    public static final f55 K1(short s, long j) {
        if (j <= Long.MIN_VALUE) {
            return f55.w.a();
        }
        return new f55(s, j - 1);
    }

    @dx4
    @tp4(version = "1.3")
    private static final boolean L(f55 f55Var, Long l) {
        c25.p(f55Var, "<this>");
        return l != null && f55Var.o(l.longValue());
    }

    @dx4
    @tp4(version = "1.3")
    private static final int L0(c55 c55Var) {
        c25.p(c55Var, "<this>");
        return M0(c55Var, n45.s);
    }

    @tp4(version = "1.3")
    public static final int M0(@NotNull c55 c55Var, @NotNull n45 n45Var) {
        c25.p(c55Var, "<this>");
        c25.p(n45Var, "random");
        try {
            return o45.h(n45Var, c55Var);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @fz4(name = "doubleRangeContains")
    public static final boolean N(@NotNull y45<Double> y45Var, float f) {
        c25.p(y45Var, "<this>");
        return y45Var.a(Double.valueOf(f));
    }

    @dx4
    @tp4(version = "1.3")
    private static final long N0(f55 f55Var) {
        c25.p(f55Var, "<this>");
        return O0(f55Var, n45.s);
    }

    @tp4(version = "1.3")
    public static final long O0(@NotNull f55 f55Var, @NotNull n45 n45Var) {
        c25.p(f55Var, "<this>");
        c25.p(n45Var, "random");
        try {
            return o45.i(n45Var, f55Var);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @dr4(markerClass = {fo4.class})
    @dx4
    @tp4(version = "1.4")
    private static final Character P0(u45 u45Var) {
        c25.p(u45Var, "<this>");
        return Q0(u45Var, n45.s);
    }

    @dr4(markerClass = {fo4.class})
    @tp4(version = "1.4")
    @Nullable
    public static final Character Q0(@NotNull u45 u45Var, @NotNull n45 n45Var) {
        c25.p(u45Var, "<this>");
        c25.p(n45Var, "random");
        if (u45Var.isEmpty()) {
            return null;
        }
        return Character.valueOf((char) n45Var.B(u45Var.e(), u45Var.h() + 1));
    }

    @NotNull
    public static final s45 R(char c, char c2) {
        return s45.s.a(c, c2, -1);
    }

    @dr4(markerClass = {fo4.class})
    @dx4
    @tp4(version = "1.4")
    private static final Integer R0(c55 c55Var) {
        c25.p(c55Var, "<this>");
        return S0(c55Var, n45.s);
    }

    @NotNull
    public static final a55 S(byte b, byte b2) {
        return a55.s.a(b, b2, -1);
    }

    @dr4(markerClass = {fo4.class})
    @tp4(version = "1.4")
    @Nullable
    public static final Integer S0(@NotNull c55 c55Var, @NotNull n45 n45Var) {
        c25.p(c55Var, "<this>");
        c25.p(n45Var, "random");
        if (c55Var.isEmpty()) {
            return null;
        }
        return Integer.valueOf(o45.h(n45Var, c55Var));
    }

    @NotNull
    public static final a55 T(byte b, int i) {
        return a55.s.a(b, i, -1);
    }

    @dr4(markerClass = {fo4.class})
    @dx4
    @tp4(version = "1.4")
    private static final Long T0(f55 f55Var) {
        c25.p(f55Var, "<this>");
        return U0(f55Var, n45.s);
    }

    @NotNull
    public static final a55 U(byte b, short s) {
        return a55.s.a(b, s, -1);
    }

    @dr4(markerClass = {fo4.class})
    @tp4(version = "1.4")
    @Nullable
    public static final Long U0(@NotNull f55 f55Var, @NotNull n45 n45Var) {
        c25.p(f55Var, "<this>");
        c25.p(n45Var, "random");
        if (f55Var.isEmpty()) {
            return null;
        }
        return Long.valueOf(o45.i(n45Var, f55Var));
    }

    @NotNull
    public static final a55 V(int i, byte b) {
        return a55.s.a(i, b, -1);
    }

    @NotNull
    public static final s45 V0(@NotNull s45 s45Var) {
        c25.p(s45Var, "<this>");
        return s45.s.a(s45Var.h(), s45Var.e(), -s45Var.i());
    }

    @NotNull
    public static final a55 W(int i, int i2) {
        return a55.s.a(i, i2, -1);
    }

    @NotNull
    public static final a55 W0(@NotNull a55 a55Var) {
        c25.p(a55Var, "<this>");
        return a55.s.a(a55Var.h(), a55Var.e(), -a55Var.i());
    }

    @NotNull
    public static final a55 X(int i, short s) {
        return a55.s.a(i, s, -1);
    }

    @NotNull
    public static final d55 X0(@NotNull d55 d55Var) {
        c25.p(d55Var, "<this>");
        return d55.s.a(d55Var.h(), d55Var.e(), -d55Var.i());
    }

    @NotNull
    public static final a55 Y(short s, byte b) {
        return a55.s.a(s, b, -1);
    }

    @fz4(name = "shortRangeContains")
    public static final boolean Y0(@NotNull y45<Short> y45Var, byte b) {
        c25.p(y45Var, "<this>");
        return y45Var.a(Short.valueOf(b));
    }

    @NotNull
    public static final a55 Z(short s, int i) {
        return a55.s.a(s, i, -1);
    }

    @fz4(name = "shortRangeContains")
    @yn4(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @xn4(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean Z0(y45 y45Var, double d) {
        c25.p(y45Var, "<this>");
        Short q1 = q1(d);
        if (q1 != null) {
            return y45Var.a(q1);
        }
        return false;
    }

    @NotNull
    public static final a55 a0(short s, short s2) {
        return a55.s.a(s, s2, -1);
    }

    @fz4(name = "shortRangeContains")
    @yn4(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @xn4(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean a1(y45 y45Var, float f) {
        c25.p(y45Var, "<this>");
        Short r1 = r1(f);
        if (r1 != null) {
            return y45Var.a(r1);
        }
        return false;
    }

    @NotNull
    public static final d55 b0(byte b, long j) {
        return d55.s.a(b, j, -1L);
    }

    @fz4(name = "shortRangeContains")
    public static final boolean b1(@NotNull y45<Short> y45Var, int i) {
        c25.p(y45Var, "<this>");
        Short s1 = s1(i);
        if (s1 != null) {
            return y45Var.a(s1);
        }
        return false;
    }

    @NotNull
    public static final d55 c0(int i, long j) {
        return d55.s.a(i, j, -1L);
    }

    @fz4(name = "shortRangeContains")
    public static final boolean c1(@NotNull y45<Short> y45Var, long j) {
        c25.p(y45Var, "<this>");
        Short t1 = t1(j);
        if (t1 != null) {
            return y45Var.a(t1);
        }
        return false;
    }

    @NotNull
    public static final d55 d0(long j, byte b) {
        return d55.s.a(j, b, -1L);
    }

    @NotNull
    public static final s45 d1(@NotNull s45 s45Var, int i) {
        c25.p(s45Var, "<this>");
        h55.a(i > 0, Integer.valueOf(i));
        s45.a aVar = s45.s;
        char e = s45Var.e();
        char h = s45Var.h();
        if (s45Var.i() <= 0) {
            i = -i;
        }
        return aVar.a(e, h, i);
    }

    @NotNull
    public static final d55 e0(long j, int i) {
        return d55.s.a(j, i, -1L);
    }

    @NotNull
    public static final a55 e1(@NotNull a55 a55Var, int i) {
        c25.p(a55Var, "<this>");
        h55.a(i > 0, Integer.valueOf(i));
        a55.a aVar = a55.s;
        int e = a55Var.e();
        int h = a55Var.h();
        if (a55Var.i() <= 0) {
            i = -i;
        }
        return aVar.a(e, h, i);
    }

    @fz4(name = "byteRangeContains")
    @yn4(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @xn4(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean f(y45 y45Var, double d) {
        c25.p(y45Var, "<this>");
        Byte g1 = g1(d);
        if (g1 != null) {
            return y45Var.a(g1);
        }
        return false;
    }

    @NotNull
    public static final d55 f0(long j, long j2) {
        return d55.s.a(j, j2, -1L);
    }

    @NotNull
    public static final d55 f1(@NotNull d55 d55Var, long j) {
        c25.p(d55Var, "<this>");
        h55.a(j > 0, Long.valueOf(j));
        d55.a aVar = d55.s;
        long e = d55Var.e();
        long h = d55Var.h();
        if (d55Var.i() <= 0) {
            j = -j;
        }
        return aVar.a(e, h, j);
    }

    @fz4(name = "byteRangeContains")
    @yn4(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @xn4(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean g(y45 y45Var, float f) {
        c25.p(y45Var, "<this>");
        Byte h1 = h1(f);
        if (h1 != null) {
            return y45Var.a(h1);
        }
        return false;
    }

    @NotNull
    public static final d55 g0(long j, short s) {
        return d55.s.a(j, s, -1L);
    }

    @Nullable
    public static final Byte g1(double d) {
        boolean z = false;
        if (d <= 127.0d && -128.0d <= d) {
            z = true;
        }
        if (z) {
            return Byte.valueOf((byte) d);
        }
        return null;
    }

    @fz4(name = "byteRangeContains")
    public static final boolean h(@NotNull y45<Byte> y45Var, int i) {
        c25.p(y45Var, "<this>");
        Byte i1 = i1(i);
        if (i1 != null) {
            return y45Var.a(i1);
        }
        return false;
    }

    @NotNull
    public static final d55 h0(short s, long j) {
        return d55.s.a(s, j, -1L);
    }

    @Nullable
    public static final Byte h1(float f) {
        boolean z = false;
        if (f <= 127.0f && -128.0f <= f) {
            z = true;
        }
        if (z) {
            return Byte.valueOf((byte) f);
        }
        return null;
    }

    @fz4(name = "byteRangeContains")
    public static final boolean i(@NotNull y45<Byte> y45Var, long j) {
        c25.p(y45Var, "<this>");
        Byte j1 = j1(j);
        if (j1 != null) {
            return y45Var.a(j1);
        }
        return false;
    }

    @tp4(version = "1.7")
    public static final char i0(@NotNull s45 s45Var) {
        c25.p(s45Var, "<this>");
        if (!s45Var.isEmpty()) {
            return s45Var.e();
        }
        throw new NoSuchElementException("Progression " + s45Var + " is empty.");
    }

    @Nullable
    public static final Byte i1(int i) {
        if (new c55(-128, 127).o(i)) {
            return Byte.valueOf((byte) i);
        }
        return null;
    }

    @fz4(name = "byteRangeContains")
    public static final boolean j(@NotNull y45<Byte> y45Var, short s) {
        c25.p(y45Var, "<this>");
        Byte k1 = k1(s);
        if (k1 != null) {
            return y45Var.a(k1);
        }
        return false;
    }

    @tp4(version = "1.7")
    public static final int j0(@NotNull a55 a55Var) {
        c25.p(a55Var, "<this>");
        if (!a55Var.isEmpty()) {
            return a55Var.e();
        }
        throw new NoSuchElementException("Progression " + a55Var + " is empty.");
    }

    @Nullable
    public static final Byte j1(long j) {
        if (new f55(-128L, 127L).o(j)) {
            return Byte.valueOf((byte) j);
        }
        return null;
    }

    public static final byte k(byte b, byte b2) {
        return b < b2 ? b2 : b;
    }

    @tp4(version = "1.7")
    public static final long k0(@NotNull d55 d55Var) {
        c25.p(d55Var, "<this>");
        if (!d55Var.isEmpty()) {
            return d55Var.e();
        }
        throw new NoSuchElementException("Progression " + d55Var + " is empty.");
    }

    @Nullable
    public static final Byte k1(short s) {
        if (x0(new c55(-128, 127), s)) {
            return Byte.valueOf((byte) s);
        }
        return null;
    }

    public static final double l(double d, double d2) {
        return d < d2 ? d2 : d;
    }

    @tp4(version = "1.7")
    @Nullable
    public static final Character l0(@NotNull s45 s45Var) {
        c25.p(s45Var, "<this>");
        if (s45Var.isEmpty()) {
            return null;
        }
        return Character.valueOf(s45Var.e());
    }

    @Nullable
    public static final Integer l1(double d) {
        boolean z = false;
        if (d <= 2.147483647E9d && -2.147483648E9d <= d) {
            z = true;
        }
        if (z) {
            return Integer.valueOf((int) d);
        }
        return null;
    }

    public static final float m(float f, float f2) {
        return f < f2 ? f2 : f;
    }

    @tp4(version = "1.7")
    @Nullable
    public static final Integer m0(@NotNull a55 a55Var) {
        c25.p(a55Var, "<this>");
        if (a55Var.isEmpty()) {
            return null;
        }
        return Integer.valueOf(a55Var.e());
    }

    @Nullable
    public static final Integer m1(float f) {
        boolean z = false;
        if (f <= 2.1474836E9f && -2.1474836E9f <= f) {
            z = true;
        }
        if (z) {
            return Integer.valueOf((int) f);
        }
        return null;
    }

    public static final int n(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    @tp4(version = "1.7")
    @Nullable
    public static final Long n0(@NotNull d55 d55Var) {
        c25.p(d55Var, "<this>");
        if (d55Var.isEmpty()) {
            return null;
        }
        return Long.valueOf(d55Var.e());
    }

    @Nullable
    public static final Integer n1(long j) {
        if (new f55(-2147483648L, TTL.MAX_VALUE).o(j)) {
            return Integer.valueOf((int) j);
        }
        return null;
    }

    public static final long o(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    @Nullable
    public static final Long o1(double d) {
        boolean z = false;
        if (d <= 9.223372036854776E18d && -9.223372036854776E18d <= d) {
            z = true;
        }
        if (z) {
            return Long.valueOf((long) d);
        }
        return null;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T p(@NotNull T t, @NotNull T t2) {
        c25.p(t, "<this>");
        c25.p(t2, "minimumValue");
        return t.compareTo(t2) < 0 ? t2 : t;
    }

    @fz4(name = "floatRangeContains")
    public static final boolean p0(@NotNull y45<Float> y45Var, double d) {
        c25.p(y45Var, "<this>");
        return y45Var.a(Float.valueOf((float) d));
    }

    @Nullable
    public static final Long p1(float f) {
        boolean z = false;
        if (f <= 9.223372E18f && -9.223372E18f <= f) {
            z = true;
        }
        if (z) {
            return Long.valueOf(f);
        }
        return null;
    }

    public static final short q(short s, short s2) {
        return s < s2 ? s2 : s;
    }

    @Nullable
    public static final Short q1(double d) {
        boolean z = false;
        if (d <= 32767.0d && -32768.0d <= d) {
            z = true;
        }
        if (z) {
            return Short.valueOf((short) d);
        }
        return null;
    }

    public static final byte r(byte b, byte b2) {
        return b > b2 ? b2 : b;
    }

    @Nullable
    public static final Short r1(float f) {
        boolean z = false;
        if (f <= 32767.0f && -32768.0f <= f) {
            z = true;
        }
        if (z) {
            return Short.valueOf((short) f);
        }
        return null;
    }

    public static final double s(double d, double d2) {
        return d > d2 ? d2 : d;
    }

    @Nullable
    public static final Short s1(int i) {
        if (new c55(-32768, 32767).o(i)) {
            return Short.valueOf((short) i);
        }
        return null;
    }

    public static final float t(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    @fz4(name = "intRangeContains")
    public static final boolean t0(@NotNull y45<Integer> y45Var, byte b) {
        c25.p(y45Var, "<this>");
        return y45Var.a(Integer.valueOf(b));
    }

    @Nullable
    public static final Short t1(long j) {
        if (new f55(-32768L, 32767L).o(j)) {
            return Short.valueOf((short) j);
        }
        return null;
    }

    public static final int u(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    @fz4(name = "intRangeContains")
    @yn4(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @xn4(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean u0(y45 y45Var, double d) {
        c25.p(y45Var, "<this>");
        Integer l1 = l1(d);
        if (l1 != null) {
            return y45Var.a(l1);
        }
        return false;
    }

    @NotNull
    public static final u45 u1(char c, char c2) {
        return c25.t(c2, 0) <= 0 ? u45.w.a() : new u45(c, (char) (c2 - 1));
    }

    public static final long v(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    @fz4(name = "intRangeContains")
    @yn4(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @xn4(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean v0(y45 y45Var, float f) {
        c25.p(y45Var, "<this>");
        Integer m1 = m1(f);
        if (m1 != null) {
            return y45Var.a(m1);
        }
        return false;
    }

    @NotNull
    public static final c55 v1(byte b, byte b2) {
        return new c55(b, b2 - 1);
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T w(@NotNull T t, @NotNull T t2) {
        c25.p(t, "<this>");
        c25.p(t2, "maximumValue");
        return t.compareTo(t2) > 0 ? t2 : t;
    }

    @fz4(name = "intRangeContains")
    public static final boolean w0(@NotNull y45<Integer> y45Var, long j) {
        c25.p(y45Var, "<this>");
        Integer n1 = n1(j);
        if (n1 != null) {
            return y45Var.a(n1);
        }
        return false;
    }

    @NotNull
    public static final c55 w1(byte b, int i) {
        if (i <= Integer.MIN_VALUE) {
            return c55.w.a();
        }
        return new c55(b, i - 1);
    }

    public static final short x(short s, short s2) {
        return s > s2 ? s2 : s;
    }

    @fz4(name = "intRangeContains")
    public static final boolean x0(@NotNull y45<Integer> y45Var, short s) {
        c25.p(y45Var, "<this>");
        return y45Var.a(Integer.valueOf(s));
    }

    @NotNull
    public static final c55 x1(byte b, short s) {
        return new c55(b, s - 1);
    }

    public static final byte y(byte b, byte b2, byte b3) {
        if (b2 <= b3) {
            return b < b2 ? b2 : b > b3 ? b3 : b;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) b3) + " is less than minimum " + ((int) b2) + '.');
    }

    @tp4(version = "1.7")
    public static final char y0(@NotNull s45 s45Var) {
        c25.p(s45Var, "<this>");
        if (!s45Var.isEmpty()) {
            return s45Var.h();
        }
        throw new NoSuchElementException("Progression " + s45Var + " is empty.");
    }

    @NotNull
    public static final c55 y1(int i, byte b) {
        return new c55(i, b - 1);
    }

    public static final double z(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    @tp4(version = "1.7")
    public static final int z0(@NotNull a55 a55Var) {
        c25.p(a55Var, "<this>");
        if (!a55Var.isEmpty()) {
            return a55Var.h();
        }
        throw new NoSuchElementException("Progression " + a55Var + " is empty.");
    }

    @NotNull
    public static final c55 z1(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return c55.w.a();
        }
        return new c55(i, i2 - 1);
    }
}