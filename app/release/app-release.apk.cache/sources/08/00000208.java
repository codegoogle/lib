package androidx.lifecycle;

import android.os.Bundle;
import com.p7700g.p99005.c00;
import com.p7700g.p99005.f60;
import com.p7700g.p99005.h60;
import com.p7700g.p99005.k00;
import com.p7700g.p99005.mz;
import com.p7700g.p99005.oz;
import com.p7700g.p99005.p00;
import com.p7700g.p99005.q00;
import com.p7700g.p99005.qz;
import com.p7700g.p99005.x1;

/* loaded from: classes.dex */
public class LegacySavedStateHandleController {
    public static final String a = "androidx.lifecycle.savedstate.vm.tag";

    /* loaded from: classes.dex */
    public static final class a implements f60.a {
        @Override // com.p7700g.p99005.f60.a
        public void a(@x1 h60 h60Var) {
            if (h60Var instanceof q00) {
                p00 viewModelStore = ((q00) h60Var).getViewModelStore();
                f60 savedStateRegistry = h60Var.getSavedStateRegistry();
                for (String str : viewModelStore.c()) {
                    LegacySavedStateHandleController.a(viewModelStore.b(str), savedStateRegistry, h60Var.getLifecycle());
                }
                if (viewModelStore.c().isEmpty()) {
                    return;
                }
                savedStateRegistry.k(a.class);
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
        }
    }

    private LegacySavedStateHandleController() {
    }

    public static void a(k00 k00Var, f60 f60Var, mz mzVar) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) k00Var.d("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.j()) {
            return;
        }
        savedStateHandleController.e(f60Var, mzVar);
        c(f60Var, mzVar);
    }

    public static SavedStateHandleController b(f60 f60Var, mz mzVar, String str, Bundle bundle) {
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, c00.f(f60Var.a(str), bundle));
        savedStateHandleController.e(f60Var, mzVar);
        c(f60Var, mzVar);
        return savedStateHandleController;
    }

    private static void c(final f60 f60Var, final mz mzVar) {
        mz.c b = mzVar.b();
        if (b != mz.c.INITIALIZED && !b.a(mz.c.STARTED)) {
            mzVar.a(new oz() { // from class: androidx.lifecycle.LegacySavedStateHandleController.1
                @Override // com.p7700g.p99005.oz
                public void i(@x1 qz qzVar, @x1 mz.b bVar) {
                    if (bVar == mz.b.ON_START) {
                        mz.this.c(this);
                        f60Var.k(a.class);
                    }
                }
            });
        } else {
            f60Var.k(a.class);
        }
    }
}