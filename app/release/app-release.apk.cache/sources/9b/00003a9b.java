package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;

/* compiled from: TimeSource.kt */
@v95
@vo4(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000ø\u0001\u0001J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0014\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0003H\u0096\u0002ø\u0001\u0001J\u0014\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0003H\u0096\u0002ø\u0001\u0001\u0082\u0002\b\n\u0002\b!\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lkotlin/time/TimeMark;", "", "elapsedNow", "Lkotlin/time/Duration;", "hasNotPassedNow", "", "hasPassedNow", "minus", "duration", "plus", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
@tp4(version = "1.3")
/* loaded from: classes3.dex */
public interface ba5 {

    /* compiled from: TimeSource.kt */
    @vo4(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public static boolean a(@NotNull ba5 ba5Var) {
            return o95.x0(ba5Var.c());
        }

        public static boolean b(@NotNull ba5 ba5Var) {
            return !o95.x0(ba5Var.c());
        }

        @NotNull
        public static ba5 c(@NotNull ba5 ba5Var, long j) {
            return ba5Var.e(o95.T1(j));
        }

        @NotNull
        public static ba5 d(@NotNull ba5 ba5Var, long j) {
            return new n95(ba5Var, j, null);
        }
    }

    boolean a();

    @NotNull
    ba5 b(long j);

    long c();

    boolean d();

    @NotNull
    ba5 e(long j);
}