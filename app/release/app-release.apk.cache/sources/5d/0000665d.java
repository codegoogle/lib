package com.p7700g.p99005;

import android.net.Uri;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AssetInterface.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u000f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH&¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/p7700g/p99005/xx2;", "", "", "url", "Landroid/net/Uri;", "b", "(Ljava/lang/String;)Landroid/net/Uri;", "", "d", "(Ljava/lang/String;)[B", "", "urls", "directive", "Lcom/p7700g/p99005/wx2;", "assetDownloadListener", "Lcom/p7700g/p99005/yq4;", "c", "(Ljava/util/List;Ljava/lang/String;Lcom/p7700g/p99005/wx2;)V", "a", "(Ljava/util/List;)V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public interface xx2 {
    void a(@NotNull List<String> list);

    @NotNull
    Uri b(@NotNull String str);

    void c(@NotNull List<String> list, @NotNull String str, @NotNull wx2 wx2Var);

    @Nullable
    byte[] d(@NotNull String str);
}