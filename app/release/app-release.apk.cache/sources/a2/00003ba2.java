package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.p7700g.p99005.qm3;
import com.p7700g.p99005.xu0;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: StatusLine.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u001f\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00058\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\f\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/p7700g/p99005/bt5;", "", "", "toString", "()Ljava/lang/String;", "", com.anythink.basead.d.g.i, AFHydra.STATUS_IDLE, "code", "Lcom/p7700g/p99005/gr5;", "f", "Lcom/p7700g/p99005/gr5;", xu0.f.m, "h", "Ljava/lang/String;", qm3.b.j, "<init>", "(Lcom/p7700g/p99005/gr5;ILjava/lang/String;)V", "e", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class bt5 {
    public static final int a = 307;
    public static final int b = 308;
    public static final int c = 421;
    public static final int d = 100;
    public static final a e = new a(null);
    @cz4
    @NotNull
    public final gr5 f;
    @cz4
    public final int g;
    @cz4
    @NotNull
    public final String h;

    /* compiled from: StatusLine.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\r¨\u0006\u0013"}, d2 = {"com/p7700g/p99005/bt5$a", "", "Lcom/p7700g/p99005/jr5;", "response", "Lcom/p7700g/p99005/bt5;", "a", "(Lcom/p7700g/p99005/jr5;)Lcom/p7700g/p99005/bt5;", "", "statusLine", "b", "(Ljava/lang/String;)Lcom/p7700g/p99005/bt5;", "", "HTTP_CONTINUE", AFHydra.STATUS_IDLE, "HTTP_MISDIRECTED_REQUEST", "HTTP_PERM_REDIRECT", "HTTP_TEMP_REDIRECT", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        @NotNull
        public final bt5 a(@NotNull jr5 jr5Var) {
            c25.p(jr5Var, "response");
            return new bt5(jr5Var.J1(), jr5Var.E(), jr5Var.x0());
        }

        @NotNull
        public final bt5 b(@NotNull String str) throws IOException {
            gr5 gr5Var;
            String str2;
            c25.p(str, "statusLine");
            int i = 9;
            if (b95.u2(str, "HTTP/1.", false, 2, null)) {
                if (str.length() >= 9 && str.charAt(8) == ' ') {
                    int charAt = str.charAt(7) - '0';
                    if (charAt == 0) {
                        gr5Var = gr5.HTTP_1_0;
                    } else if (charAt == 1) {
                        gr5Var = gr5.HTTP_1_1;
                    } else {
                        throw new ProtocolException(wo1.t("Unexpected status line: ", str));
                    }
                } else {
                    throw new ProtocolException(wo1.t("Unexpected status line: ", str));
                }
            } else if (b95.u2(str, "ICY ", false, 2, null)) {
                gr5Var = gr5.HTTP_1_0;
                i = 4;
            } else {
                throw new ProtocolException(wo1.t("Unexpected status line: ", str));
            }
            int i2 = i + 3;
            if (str.length() >= i2) {
                try {
                    String substring = str.substring(i, i2);
                    c25.o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    int parseInt = Integer.parseInt(substring);
                    if (str.length() <= i2) {
                        str2 = "";
                    } else if (str.charAt(i2) == ' ') {
                        str2 = str.substring(i + 4);
                        c25.o(str2, "(this as java.lang.String).substring(startIndex)");
                    } else {
                        throw new ProtocolException(wo1.t("Unexpected status line: ", str));
                    }
                    return new bt5(gr5Var, parseInt, str2);
                } catch (NumberFormatException unused) {
                    throw new ProtocolException(wo1.t("Unexpected status line: ", str));
                }
            }
            throw new ProtocolException(wo1.t("Unexpected status line: ", str));
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public bt5(@NotNull gr5 gr5Var, int i, @NotNull String str) {
        c25.p(gr5Var, xu0.f.m);
        c25.p(str, qm3.b.j);
        this.f = gr5Var;
        this.g = i;
        this.h = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f == gr5.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(gl4.R);
        sb.append(this.g);
        sb.append(gl4.R);
        sb.append(this.h);
        String sb2 = sb.toString();
        c25.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}