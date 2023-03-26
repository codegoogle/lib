package com.p7700g.p99005;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* compiled from: Indent.kt */
@vo4(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000b\u001a!\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0002\b\u0004\u001a\u0011\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0002¢\u0006\u0002\b\u0007\u001a\u0014\u0010\b\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001aJ\u0010\t\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\u0082\b¢\u0006\u0002\b\u000e\u001a\u0014\u0010\u000f\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u001a\u001e\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u001a\n\u0010\u0013\u001a\u00020\u0002*\u00020\u0002\u001a\u0014\u0010\u0014\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002¨\u0006\u0015"}, d2 = {"getIndentFunction", "Lkotlin/Function1;", "", "indent", "getIndentFunction$StringsKt__IndentKt", "indentWidth", "", "indentWidth$StringsKt__IndentKt", "prependIndent", "reindent", "", "resultSizeEstimate", "indentAddFunction", "indentCutFunction", "reindent$StringsKt__IndentKt", "replaceIndent", "newIndent", "replaceIndentByMargin", "marginPrefix", "trimIndent", "trimMargin", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes3.dex */
public class u85 extends t85 {

    /* compiled from: Indent.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "line", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends e25 implements f05<String, String> {
        public static final a t = new a();

        public a() {
            super(1);
        }

        @Override // com.p7700g.p99005.f05
        @NotNull
        /* renamed from: a */
        public final String M(@NotNull String str) {
            c25.p(str, "line");
            return str;
        }
    }

    /* compiled from: Indent.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "line", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends e25 implements f05<String, String> {
        public final /* synthetic */ String t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.t = str;
        }

        @Override // com.p7700g.p99005.f05
        @NotNull
        /* renamed from: a */
        public final String M(@NotNull String str) {
            c25.p(str, "line");
            return wo1.C(new StringBuilder(), this.t, str);
        }
    }

    /* compiled from: Indent.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c extends e25 implements f05<String, String> {
        public final /* synthetic */ String t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(1);
            this.t = str;
        }

        @Override // com.p7700g.p99005.f05
        @NotNull
        /* renamed from: a */
        public final String M(@NotNull String str) {
            c25.p(str, "it");
            if (b95.U1(str)) {
                return str.length() < this.t.length() ? this.t : str;
            }
            return wo1.C(new StringBuilder(), this.t, str);
        }
    }

    private static final f05<String, String> g(String str) {
        return str.length() == 0 ? a.t : new b(str);
    }

    private static final int h(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (!d85.r(str.charAt(i))) {
                break;
            } else {
                i++;
            }
        }
        return i == -1 ? str.length() : i;
    }

    @NotNull
    public static final String i(@NotNull String str, @NotNull String str2) {
        c25.p(str, "<this>");
        c25.p(str2, "indent");
        return o75.e1(o75.k1(c95.K3(str), new c(str2)), "\n", null, null, 0, null, null, 62, null);
    }

    public static /* synthetic */ String j(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "    ";
        }
        return i(str, str2);
    }

    private static final String k(List<String> list, int i, f05<? super String, String> f05Var, f05<? super String, String> f05Var2) {
        Appendable e3;
        String M;
        int H = js4.H(list);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                js4.X();
            }
            String str = (String) obj;
            if ((i2 == 0 || i2 == H) && b95.U1(str)) {
                str = null;
            } else {
                String M2 = f05Var2.M(str);
                if (M2 != null && (M = f05Var.M(M2)) != null) {
                    str = M;
                }
            }
            if (str != null) {
                arrayList.add(str);
            }
            i2 = i3;
        }
        e3 = rs4.e3(arrayList, new StringBuilder(i), (r14 & 2) != 0 ? ", " : "\n", (r14 & 4) != 0 ? "" : null, (r14 & 8) == 0 ? null : "", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : null);
        String sb = ((StringBuilder) e3).toString();
        c25.o(sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb;
    }

    @NotNull
    public static final String l(@NotNull String str, @NotNull String str2) {
        Appendable e3;
        String M;
        c25.p(str, "<this>");
        c25.p(str2, "newIndent");
        List<String> L3 = c95.L3(str);
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : L3) {
            if (!b95.U1((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(ks4.Z(arrayList, 10));
        for (String str3 : arrayList) {
            arrayList2.add(Integer.valueOf(h(str3)));
        }
        Integer num = (Integer) rs4.c4(arrayList2);
        int i = 0;
        int intValue = num != null ? num.intValue() : 0;
        int size = (L3.size() * str2.length()) + str.length();
        f05<String, String> g = g(str2);
        int H = js4.H(L3);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : L3) {
            int i2 = i + 1;
            if (i < 0) {
                js4.X();
            }
            String str4 = (String) obj2;
            if ((i == 0 || i == H) && b95.U1(str4)) {
                str4 = null;
            } else {
                String A6 = e95.A6(str4, intValue);
                if (A6 != null && (M = g.M(A6)) != null) {
                    str4 = M;
                }
            }
            if (str4 != null) {
                arrayList3.add(str4);
            }
            i = i2;
        }
        e3 = rs4.e3(arrayList3, new StringBuilder(size), (r14 & 2) != 0 ? ", " : "\n", (r14 & 4) != 0 ? "" : null, (r14 & 8) == 0 ? null : "", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : null);
        String sb = ((StringBuilder) e3).toString();
        c25.o(sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb;
    }

    public static /* synthetic */ String m(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "";
        }
        return l(str, str2);
    }

    @NotNull
    public static final String n(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Appendable e3;
        int i;
        String M;
        c25.p(str, "<this>");
        c25.p(str2, "newIndent");
        c25.p(str3, "marginPrefix");
        if (!b95.U1(str3)) {
            List<String> L3 = c95.L3(str);
            int size = (L3.size() * str2.length()) + str.length();
            f05<String, String> g = g(str2);
            int H = js4.H(L3);
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (Object obj : L3) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    js4.X();
                }
                String str4 = (String) obj;
                String str5 = null;
                if ((i2 == 0 || i2 == H) && b95.U1(str4)) {
                    str4 = null;
                } else {
                    int length = str4.length();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            i = -1;
                            break;
                        } else if (!d85.r(str4.charAt(i4))) {
                            i = i4;
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (i != -1) {
                        int i5 = i;
                        if (b95.t2(str4, str3, i, false, 4, null)) {
                            c25.n(str4, "null cannot be cast to non-null type java.lang.String");
                            str5 = str4.substring(str3.length() + i5);
                            c25.o(str5, "this as java.lang.String).substring(startIndex)");
                        }
                    }
                    if (str5 != null && (M = g.M(str5)) != null) {
                        str4 = M;
                    }
                }
                if (str4 != null) {
                    arrayList.add(str4);
                }
                i2 = i3;
            }
            e3 = rs4.e3(arrayList, new StringBuilder(size), (r14 & 2) != 0 ? ", " : "\n", (r14 & 4) != 0 ? "" : null, (r14 & 8) == 0 ? null : "", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : null);
            String sb = ((StringBuilder) e3).toString();
            c25.o(sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
            return sb;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }

    public static /* synthetic */ String o(String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "";
        }
        if ((i & 2) != 0) {
            str3 = com.anythink.expressad.foundation.g.a.bQ;
        }
        return n(str, str2, str3);
    }

    @NotNull
    public static final String p(@NotNull String str) {
        c25.p(str, "<this>");
        return l(str, "");
    }

    @NotNull
    public static final String q(@NotNull String str, @NotNull String str2) {
        c25.p(str, "<this>");
        c25.p(str2, "marginPrefix");
        return n(str, "", str2);
    }

    public static /* synthetic */ String r(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = com.anythink.expressad.foundation.g.a.bQ;
        }
        return q(str, str2);
    }
}