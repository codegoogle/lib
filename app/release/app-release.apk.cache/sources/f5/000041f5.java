package com.p7700g.p99005;

import java.time.Duration;

/* compiled from: DurationConversions.kt */
@fz4(name = "DurationConversionsJDK8Kt")
@vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u0002*\u00020\u0001H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, d2 = {"toJavaDuration", "Ljava/time/Duration;", "Lkotlin/time/Duration;", "toJavaDuration-LRDsOJo", "(J)Ljava/time/Duration;", "toKotlinDuration", "(Ljava/time/Duration;)J", "kotlin-stdlib-jdk8"}, k = 2, mv = {1, 6, 0}, pn = "kotlin.time", xi = 48)
/* loaded from: classes3.dex */
public final class fa5 {
    @dr4(markerClass = {v95.class})
    @dx4
    @tp4(version = "1.6")
    private static final Duration a(long j) {
        Duration ofSeconds = Duration.ofSeconds(o95.M(j), o95.Q(j));
        c25.o(ofSeconds, "toJavaDuration-LRDsOJo");
        return ofSeconds;
    }

    @dr4(markerClass = {v95.class})
    @dx4
    @tp4(version = "1.6")
    private static final long b(Duration duration) {
        c25.p(duration, "<this>");
        return o95.a1(q95.n0(duration.getSeconds(), r95.SECONDS), q95.m0(duration.getNano(), r95.NANOSECONDS));
    }
}