package com.ironsource.mediationsdk.utils;

import com.p7700g.p99005.c25;
import com.p7700g.p99005.vo4;
import com.p7700g.p99005.wo1;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@vo4(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J?\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018¨\u0006&"}, d2 = {"Lcom/ironsource/mediationsdk/utils/PixelSettings;", "", "pixelEventsEnabled", "", "pixelEventsUrl", "", "pixelEventsCompression", "pixelOptOut", "", "pixelOptIn", "(ZLjava/lang/String;Z[I[I)V", "getPixelEventsCompression", "()Z", "setPixelEventsCompression", "(Z)V", "getPixelEventsEnabled", "setPixelEventsEnabled", "getPixelEventsUrl", "()Ljava/lang/String;", "setPixelEventsUrl", "(Ljava/lang/String;)V", "getPixelOptIn", "()[I", "setPixelOptIn", "([I)V", "getPixelOptOut", "setPixelOptOut", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "mediationsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j {
    private boolean a;
    @NotNull
    private String b;
    private boolean c;
    @Nullable
    private int[] d;
    @Nullable
    private int[] e;

    public j() {
        this(false, null, false, null, null, 31);
    }

    private j(boolean z, @NotNull String str, boolean z2, @Nullable int[] iArr, @Nullable int[] iArr2) {
        c25.p(str, "pixelEventsUrl");
        this.a = z;
        this.b = str;
        this.c = z2;
        this.d = iArr;
        this.e = iArr2;
    }

    private /* synthetic */ j(boolean z, String str, boolean z2, int[] iArr, int[] iArr2, int i) {
        this(true, "https://outcome-ssp.supersonicads.com/mediation?adUnit=3", false, null, null);
    }

    public final void a(@NotNull String str) {
        c25.p(str, "<set-?>");
        this.b = str;
    }

    public final void a(boolean z) {
        this.a = z;
    }

    public final void a(@Nullable int[] iArr) {
        this.d = iArr;
    }

    public final boolean a() {
        return this.a;
    }

    @NotNull
    public final String b() {
        return this.b;
    }

    public final void b(boolean z) {
        this.c = z;
    }

    public final void b(@Nullable int[] iArr) {
        this.e = iArr;
    }

    public final boolean c() {
        return this.c;
    }

    @Nullable
    public final int[] d() {
        return this.d;
    }

    @Nullable
    public final int[] e() {
        return this.e;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return this.a == jVar.a && c25.g(this.b, jVar.b) && this.c == jVar.c && c25.g(this.d, jVar.d) && c25.g(this.e, jVar.e);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int x = wo1.x(this.b, r0 * 31, 31);
        boolean z2 = this.c;
        int i = (x + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        int[] iArr = this.d;
        int hashCode = (i + (iArr == null ? 0 : Arrays.hashCode(iArr))) * 31;
        int[] iArr2 = this.e;
        return hashCode + (iArr2 != null ? Arrays.hashCode(iArr2) : 0);
    }

    @NotNull
    public final String toString() {
        return "PixelSettings(pixelEventsEnabled=" + this.a + ", pixelEventsUrl=" + this.b + ", pixelEventsCompression=" + this.c + ", pixelOptOut=" + Arrays.toString(this.d) + ", pixelOptIn=" + Arrays.toString(this.e) + ')';
    }
}