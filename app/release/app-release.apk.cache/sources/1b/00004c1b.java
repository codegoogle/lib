package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RegexExtensions.kt */
@fz4(name = "RegexExtensionsJDK8Kt")
@vo4(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\u0002¨\u0006\u0005"}, d2 = {"get", "Lkotlin/text/MatchGroup;", "Lkotlin/text/MatchGroupCollection;", "name", "", "kotlin-stdlib-jdk8"}, k = 2, mv = {1, 6, 0}, pn = "kotlin.text", xi = 48)
/* loaded from: classes3.dex */
public final class k95 {
    @tp4(version = "1.2")
    @Nullable
    public static final j85 a(@NotNull k85 k85Var, @NotNull String str) {
        c25.p(k85Var, "<this>");
        c25.p(str, "name");
        l85 l85Var = k85Var instanceof l85 ? (l85) k85Var : null;
        if (l85Var != null) {
            return l85Var.get(str);
        }
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }
}