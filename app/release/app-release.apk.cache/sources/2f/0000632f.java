package com.p7700g.p99005;

import java.util.Set;

/* compiled from: RegexExtensions.kt */
@vo4(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0087\b¨\u0006\u0007"}, d2 = {"toRegex", "Lkotlin/text/Regex;", "", "options", "", "Lkotlin/text/RegexOption;", "option", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes3.dex */
public class w85 extends v85 {
    @dx4
    private static final o85 t(String str) {
        c25.p(str, "<this>");
        return new o85(str);
    }

    @dx4
    private static final o85 u(String str, Set<? extends q85> set) {
        c25.p(str, "<this>");
        c25.p(set, "options");
        return new o85(str, set);
    }

    @dx4
    private static final o85 v(String str, q85 q85Var) {
        c25.p(str, "<this>");
        c25.p(q85Var, "option");
        return new o85(str, q85Var);
    }
}