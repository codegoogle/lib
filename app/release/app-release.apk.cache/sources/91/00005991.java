package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;

/* compiled from: StringNumberConversionsJVM.kt */
@vo4(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlin/text/ScreenFloatValueRegEx;", "", "()V", "value", "Lkotlin/text/Regex;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class r85 {
    @NotNull
    public static final r85 a = new r85();
    @cz4
    @NotNull
    public static final o85 b;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append("(\\p{Digit}+)");
        sb.append("(\\.)?(");
        sb.append("(\\p{Digit}+)");
        sb.append("?)(");
        wo1.h0(sb, "[eE][+-]?(\\p{Digit}+)", ")?)|(\\.(", "(\\p{Digit}+)", ")(");
        wo1.h0(sb, "[eE][+-]?(\\p{Digit}+)", ")?)|((", "(0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+))", ")[pP][+-]?");
        b = new o85(wo1.u("[\\x00-\\x20]*[+-]?(NaN|Infinity|((", wo1.B(sb, "(\\p{Digit}+)", ')'), ")[fFdD]?))[\\x00-\\x20]*"));
    }

    private r85() {
    }
}