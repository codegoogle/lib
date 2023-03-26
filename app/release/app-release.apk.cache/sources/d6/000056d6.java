package com.p7700g.p99005;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p7700g.p99005.rs2;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: PushObserver.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \f2\u00020\u0001:\u0001\bJ%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\b\u0010\tJ-\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/p7700g/p99005/pt5;", "", "", "streamId", "", "Lcom/p7700g/p99005/gt5;", "requestHeaders", "", "a", "(ILjava/util/List;)Z", "responseHeaders", "last", "b", "(ILjava/util/List;Z)Z", "Lcom/p7700g/p99005/uv5;", rs2.f.b, "byteCount", "d", "(ILcom/p7700g/p99005/uv5;IZ)Z", "Lcom/p7700g/p99005/ft5;", IronSourceConstants.EVENTS_ERROR_CODE, "Lcom/p7700g/p99005/yq4;", "c", "(ILcom/p7700g/p99005/ft5;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public interface pt5 {
    public static final a b = new a(null);
    @cz4
    @NotNull
    public static final pt5 a = new a.C0228a();

    /* compiled from: PushObserver.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\b"}, d2 = {"com/p7700g/p99005/pt5$a", "", "Lcom/p7700g/p99005/pt5;", "CANCEL", "Lcom/p7700g/p99005/pt5;", "<init>", "()V", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        public static final /* synthetic */ a a = null;

        /* compiled from: PushObserver.kt */
        @vo4(bv = {1, 0, 3}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ-\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"com/p7700g/p99005/pt5$a$a", "Lcom/p7700g/p99005/pt5;", "", "streamId", "", "Lcom/p7700g/p99005/gt5;", "requestHeaders", "", "a", "(ILjava/util/List;)Z", "responseHeaders", "last", "b", "(ILjava/util/List;Z)Z", "Lcom/p7700g/p99005/uv5;", rs2.f.b, "byteCount", "d", "(ILcom/p7700g/p99005/uv5;IZ)Z", "Lcom/p7700g/p99005/ft5;", IronSourceConstants.EVENTS_ERROR_CODE, "Lcom/p7700g/p99005/yq4;", "c", "(ILcom/p7700g/p99005/ft5;)V", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* renamed from: com.p7700g.p99005.pt5$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0228a implements pt5 {
            @Override // com.p7700g.p99005.pt5
            public boolean a(int i, @NotNull List<gt5> list) {
                c25.p(list, "requestHeaders");
                return true;
            }

            @Override // com.p7700g.p99005.pt5
            public boolean b(int i, @NotNull List<gt5> list, boolean z) {
                c25.p(list, "responseHeaders");
                return true;
            }

            @Override // com.p7700g.p99005.pt5
            public void c(int i, @NotNull ft5 ft5Var) {
                c25.p(ft5Var, IronSourceConstants.EVENTS_ERROR_CODE);
            }

            @Override // com.p7700g.p99005.pt5
            public boolean d(int i, @NotNull uv5 uv5Var, int i2, boolean z) throws IOException {
                c25.p(uv5Var, rs2.f.b);
                uv5Var.skip(i2);
                return true;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    boolean a(int i, @NotNull List<gt5> list);

    boolean b(int i, @NotNull List<gt5> list, boolean z);

    void c(int i, @NotNull ft5 ft5Var);

    boolean d(int i, @NotNull uv5 uv5Var, int i2, boolean z) throws IOException;
}