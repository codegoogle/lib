package com.p7700g.p99005;

import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: OSOutcomeEventsRepository.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u00101\u001a\u00020-\u0012\u0006\u0010,\u001a\u00020*\u0012\u0006\u0010)\u001a\u00020%¢\u0006\u0004\b2\u00103J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0011J+\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\r2\u0006\u0010\u0016\u001a\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001f\u001a\u00020\n2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010$R\u0019\u0010)\u001a\u00020%8\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010&\u001a\u0004\b'\u0010(R\u0016\u0010,\u001a\u00020*8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010+R\u001c\u00101\u001a\u00020-8\u0004@\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0019\u0010.\u001a\u0004\b/\u00100¨\u00064"}, d2 = {"Lcom/p7700g/p99005/qo3;", "Lcom/p7700g/p99005/cp3;", "", com.anythink.expressad.videocommon.e.b.u, "", "deviceType", "Lcom/p7700g/p99005/bp3;", "event", "Lcom/p7700g/p99005/mm3;", "responseHandler", "Lcom/p7700g/p99005/yq4;", "d", "(Ljava/lang/String;ILcom/p7700g/p99005/bp3;Lcom/p7700g/p99005/mm3;)V", "", "b", "()Ljava/util/List;", "h", "(Lcom/p7700g/p99005/bp3;)V", "outcomeEvent", "i", "eventParams", "e", "name", "Lcom/p7700g/p99005/do3;", "influences", "a", "(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", "", com.anythink.basead.d.g.i, "()Ljava/util/Set;", "unattributedUniqueOutcomeEvents", "c", "(Ljava/util/Set;)V", "notificationTableName", "notificationIdColumnName", "f", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/p7700g/p99005/xo3;", "Lcom/p7700g/p99005/xo3;", "k", "()Lcom/p7700g/p99005/xo3;", "outcomeEventsService", "Lcom/p7700g/p99005/no3;", "Lcom/p7700g/p99005/no3;", "outcomeEventsCache", "Lcom/p7700g/p99005/tk3;", "Lcom/p7700g/p99005/tk3;", "j", "()Lcom/p7700g/p99005/tk3;", "logger", "<init>", "(Lcom/p7700g/p99005/tk3;Lcom/p7700g/p99005/no3;Lcom/p7700g/p99005/xo3;)V", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public abstract class qo3 implements cp3 {
    @NotNull
    private final tk3 a;
    private final no3 b;
    @NotNull
    private final xo3 c;

    public qo3(@NotNull tk3 tk3Var, @NotNull no3 no3Var, @NotNull xo3 xo3Var) {
        c25.p(tk3Var, "logger");
        c25.p(no3Var, "outcomeEventsCache");
        c25.p(xo3Var, "outcomeEventsService");
        this.a = tk3Var;
        this.b = no3Var;
        this.c = xo3Var;
    }

    @Override // com.p7700g.p99005.cp3
    @NotNull
    public List<do3> a(@NotNull String str, @NotNull List<do3> list) {
        c25.p(str, "name");
        c25.p(list, "influences");
        List<do3> g = this.b.g(str, list);
        tk3 tk3Var = this.a;
        tk3Var.b("OneSignal getNotCachedUniqueOutcome influences: " + g);
        return g;
    }

    @Override // com.p7700g.p99005.cp3
    @NotNull
    public List<bp3> b() {
        return this.b.e();
    }

    @Override // com.p7700g.p99005.cp3
    public void c(@NotNull Set<String> set) {
        c25.p(set, "unattributedUniqueOutcomeEvents");
        tk3 tk3Var = this.a;
        tk3Var.b("OneSignal save unattributedUniqueOutcomeEvents: " + set);
        this.b.l(set);
    }

    @Override // com.p7700g.p99005.cp3
    public abstract void d(@NotNull String str, int i, @NotNull bp3 bp3Var, @NotNull mm3 mm3Var);

    @Override // com.p7700g.p99005.cp3
    public void e(@NotNull bp3 bp3Var) {
        c25.p(bp3Var, "eventParams");
        this.b.m(bp3Var);
    }

    @Override // com.p7700g.p99005.cp3
    public void f(@NotNull String str, @NotNull String str2) {
        c25.p(str, "notificationTableName");
        c25.p(str2, "notificationIdColumnName");
        this.b.c(str, str2);
    }

    @Override // com.p7700g.p99005.cp3
    @Nullable
    public Set<String> g() {
        Set<String> i = this.b.i();
        tk3 tk3Var = this.a;
        tk3Var.b("OneSignal getUnattributedUniqueOutcomeEventsSentByChannel: " + i);
        return i;
    }

    @Override // com.p7700g.p99005.cp3
    public void h(@NotNull bp3 bp3Var) {
        c25.p(bp3Var, "event");
        this.b.k(bp3Var);
    }

    @Override // com.p7700g.p99005.cp3
    public void i(@NotNull bp3 bp3Var) {
        c25.p(bp3Var, "outcomeEvent");
        this.b.d(bp3Var);
    }

    @NotNull
    public final tk3 j() {
        return this.a;
    }

    @NotNull
    public final xo3 k() {
        return this.c;
    }
}