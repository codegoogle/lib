package com.p7700g.p99005;

import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: OSOutcomeEventsRepository.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0003H&¢\u0006\u0004\b\u000b\u0010\tJ/\u0010\u0012\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0003H&¢\u0006\u0004\b\u0015\u0010\tJ+\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00022\u0006\u0010\u0016\u001a\u00020\f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0002H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001bH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001f\u001a\u00020\u00072\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u001bH&¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\fH&¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/p7700g/p99005/cp3;", "", "", "Lcom/p7700g/p99005/bp3;", "b", "()Ljava/util/List;", "event", "Lcom/p7700g/p99005/yq4;", "h", "(Lcom/p7700g/p99005/bp3;)V", "outcomeEvent", "i", "", com.anythink.expressad.videocommon.e.b.u, "", "deviceType", "Lcom/p7700g/p99005/mm3;", "responseHandler", "d", "(Ljava/lang/String;ILcom/p7700g/p99005/bp3;Lcom/p7700g/p99005/mm3;)V", "eventParams", "e", "name", "Lcom/p7700g/p99005/do3;", "influences", "a", "(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", "", com.anythink.basead.d.g.i, "()Ljava/util/Set;", "unattributedUniqueOutcomeEvents", "c", "(Ljava/util/Set;)V", "notificationTableName", "notificationIdColumnName", "f", "(Ljava/lang/String;Ljava/lang/String;)V", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public interface cp3 {
    @NotNull
    List<do3> a(@NotNull String str, @NotNull List<do3> list);

    @NotNull
    List<bp3> b();

    void c(@NotNull Set<String> set);

    void d(@NotNull String str, int i, @NotNull bp3 bp3Var, @NotNull mm3 mm3Var);

    void e(@NotNull bp3 bp3Var);

    void f(@NotNull String str, @NotNull String str2);

    @Nullable
    Set<String> g();

    void h(@NotNull bp3 bp3Var);

    void i(@NotNull bp3 bp3Var);
}