package kotlinx.coroutines.android;

import android.os.Looper;
import com.p7700g.p99005.ag5;
import com.p7700g.p99005.km5;
import com.p7700g.p99005.mm5;
import com.p7700g.p99005.qe5;
import com.p7700g.p99005.vo4;
import com.p7700g.p99005.yf5;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* compiled from: HandlerDispatcher.kt */
@vo4(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/android/AndroidDispatcherFactory;", "Lkotlinx/coroutines/internal/MainDispatcherFactory;", "()V", "loadPriority", "", "getLoadPriority", "()I", "createDispatcher", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "allFactories", "", "hintOnError", "", "kotlinx-coroutines-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidDispatcherFactory implements mm5 {
    @Override // com.p7700g.p99005.mm5
    @NotNull
    public qe5 createDispatcher(@NotNull List<? extends mm5> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new yf5(ag5.c(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // com.p7700g.p99005.mm5
    public int getLoadPriority() {
        return km5.f;
    }

    @Override // com.p7700g.p99005.mm5
    @NotNull
    public String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }
}