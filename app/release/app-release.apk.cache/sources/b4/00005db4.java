package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Appendable.kt */
@vo4(d1 = {"\u0000:\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a5\u0010\u0000\u001a\u0002H\u0001\"\f\b\u0000\u0010\u0001*\u00060\u0002j\u0002`\u0003*\u0002H\u00012\u0016\u0010\u0004\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u0005\"\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007\u001a9\u0010\b\u001a\u00020\t\"\u0004\b\u0000\u0010\u0001*\u00060\u0002j\u0002`\u00032\u0006\u0010\n\u001a\u0002H\u00012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fH\u0000¢\u0006\u0002\u0010\r\u001a\u0015\u0010\u000e\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u0003H\u0087\b\u001a\u001d\u0010\u000e\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u00032\u0006\u0010\u0004\u001a\u00020\u000fH\u0087\b\u001a\u001f\u0010\u000e\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0006H\u0087\b\u001a7\u0010\u0010\u001a\u0002H\u0001\"\f\b\u0000\u0010\u0001*\u00060\u0002j\u0002`\u0003*\u0002H\u00012\u0006\u0010\u0004\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"append", "T", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "value", "", "", "(Ljava/lang/Appendable;[Ljava/lang/CharSequence;)Ljava/lang/Appendable;", "appendElement", "", "element", "transform", "Lkotlin/Function1;", "(Ljava/lang/Appendable;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "appendLine", "", "appendRange", "startIndex", "", "endIndex", "(Ljava/lang/Appendable;Ljava/lang/CharSequence;II)Ljava/lang/Appendable;", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes3.dex */
public class t85 {
    @NotNull
    public static final <T extends Appendable> T a(@NotNull T t, @NotNull CharSequence... charSequenceArr) {
        c25.p(t, "<this>");
        c25.p(charSequenceArr, "value");
        for (CharSequence charSequence : charSequenceArr) {
            t.append(charSequence);
        }
        return t;
    }

    public static final <T> void b(@NotNull Appendable appendable, T t, @Nullable f05<? super T, ? extends CharSequence> f05Var) {
        c25.p(appendable, "<this>");
        if (f05Var != null) {
            appendable.append(f05Var.M(t));
            return;
        }
        if (t == null ? true : t instanceof CharSequence) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(String.valueOf(t));
        }
    }

    @dx4
    @tp4(version = "1.4")
    private static final Appendable c(Appendable appendable) {
        c25.p(appendable, "<this>");
        Appendable append = appendable.append('\n');
        c25.o(append, "append('\\n')");
        return append;
    }

    @dx4
    @tp4(version = "1.4")
    private static final Appendable d(Appendable appendable, char c) {
        c25.p(appendable, "<this>");
        Appendable append = appendable.append(c);
        c25.o(append, "append(value)");
        Appendable append2 = append.append('\n');
        c25.o(append2, "append('\\n')");
        return append2;
    }

    @dx4
    @tp4(version = "1.4")
    private static final Appendable e(Appendable appendable, CharSequence charSequence) {
        c25.p(appendable, "<this>");
        Appendable append = appendable.append(charSequence);
        c25.o(append, "append(value)");
        Appendable append2 = append.append('\n');
        c25.o(append2, "append('\\n')");
        return append2;
    }

    @dr4(markerClass = {fo4.class})
    @tp4(version = "1.4")
    @NotNull
    public static final <T extends Appendable> T f(@NotNull T t, @NotNull CharSequence charSequence, int i, int i2) {
        c25.p(t, "<this>");
        c25.p(charSequence, "value");
        T t2 = (T) t.append(charSequence, i, i2);
        c25.n(t2, "null cannot be cast to non-null type T of kotlin.text.StringsKt__AppendableKt.appendRange");
        return t2;
    }
}