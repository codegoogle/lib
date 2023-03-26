package androidx.lifecycle;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p7700g.p99005.c25;
import com.p7700g.p99005.e00;
import com.p7700g.p99005.mz;
import com.p7700g.p99005.oz;
import com.p7700g.p99005.qz;
import com.p7700g.p99005.rs2;
import com.p7700g.p99005.vo4;
import org.jetbrains.annotations.NotNull;

/* compiled from: SavedStateHandleSupport.kt */
@vo4(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/SavedStateHandleAttacher;", "Landroidx/lifecycle/LifecycleEventObserver;", IronSourceConstants.EVENTS_PROVIDER, "Landroidx/lifecycle/SavedStateHandlesProvider;", "(Landroidx/lifecycle/SavedStateHandlesProvider;)V", "onStateChanged", "", rs2.f.b, "Landroidx/lifecycle/LifecycleOwner;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements oz {
    @NotNull
    private final e00 s;

    public SavedStateHandleAttacher(@NotNull e00 e00Var) {
        c25.p(e00Var, IronSourceConstants.EVENTS_PROVIDER);
        this.s = e00Var;
    }

    @Override // com.p7700g.p99005.oz
    public void i(@NotNull qz qzVar, @NotNull mz.b bVar) {
        c25.p(qzVar, rs2.f.b);
        c25.p(bVar, "event");
        if (bVar == mz.b.ON_CREATE) {
            qzVar.getLifecycle().c(this);
            this.s.d();
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + bVar).toString());
    }
}