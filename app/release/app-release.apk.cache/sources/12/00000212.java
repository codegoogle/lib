package androidx.lifecycle;

import android.content.Context;
import com.p7700g.p99005.a00;
import com.p7700g.p99005.a70;
import com.p7700g.p99005.nz;
import com.p7700g.p99005.qz;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z60;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements a70<qz> {
    @Override // com.p7700g.p99005.a70
    @x1
    /* renamed from: b */
    public qz a(@x1 Context context) {
        if (z60.e(context).g(ProcessLifecycleInitializer.class)) {
            nz.a(context);
            a00.j(context);
            return a00.i();
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily. \nPlease ensure that you have: \n<meta-data\n    android:name='androidx.lifecycle.ProcessLifecycleInitializer' \n    android:value='androidx.startup' /> \nunder InitializationProvider in your AndroidManifest.xml");
    }

    @Override // com.p7700g.p99005.a70
    @x1
    public List<Class<? extends a70<?>>> dependencies() {
        return Collections.emptyList();
    }
}