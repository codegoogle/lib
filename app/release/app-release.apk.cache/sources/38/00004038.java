package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* compiled from: WorkManager.java */
@SuppressLint({"AddedAbstractMethod"})
/* loaded from: classes.dex */
public abstract class ec0 {
    public static void A(@x1 Context context, @x1 hb0 configuration) {
        rc0.A(context, configuration);
    }

    @x1
    @Deprecated
    public static ec0 o() {
        rc0 G = rc0.G();
        if (G != null) {
            return G;
        }
        throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.");
    }

    @x1
    public static ec0 p(@x1 Context context) {
        return rc0.H(context);
    }

    @x1
    public abstract wb0 B();

    @x1
    public final cc0 a(@x1 String uniqueWorkName, @x1 nb0 existingWorkPolicy, @x1 vb0 work) {
        return b(uniqueWorkName, existingWorkPolicy, Collections.singletonList(work));
    }

    @x1
    public abstract cc0 b(@x1 String uniqueWorkName, @x1 nb0 existingWorkPolicy, @x1 List<vb0> work);

    @x1
    public final cc0 c(@x1 vb0 work) {
        return d(Collections.singletonList(work));
    }

    @x1
    public abstract cc0 d(@x1 List<vb0> work);

    @x1
    public abstract wb0 e();

    @x1
    public abstract wb0 f(@x1 String tag);

    @x1
    public abstract wb0 g(@x1 String uniqueWorkName);

    @x1
    public abstract wb0 h(@x1 UUID id);

    @x1
    public abstract PendingIntent i(@x1 UUID id);

    @x1
    public final wb0 j(@x1 gc0 workRequest) {
        return k(Collections.singletonList(workRequest));
    }

    @x1
    public abstract wb0 k(@x1 List<? extends gc0> requests);

    @x1
    public abstract wb0 l(@x1 String uniqueWorkName, @x1 mb0 existingPeriodicWorkPolicy, @x1 yb0 periodicWork);

    @x1
    public wb0 m(@x1 String uniqueWorkName, @x1 nb0 existingWorkPolicy, @x1 vb0 work) {
        return n(uniqueWorkName, existingWorkPolicy, Collections.singletonList(work));
    }

    @x1
    public abstract wb0 n(@x1 String uniqueWorkName, @x1 nb0 existingWorkPolicy, @x1 List<vb0> work);

    @x1
    public abstract gn2<Long> q();

    @x1
    public abstract LiveData<Long> r();

    @x1
    public abstract gn2<dc0> s(@x1 UUID id);

    @x1
    public abstract LiveData<dc0> t(@x1 UUID id);

    @x1
    public abstract gn2<List<dc0>> u(@x1 fc0 workQuery);

    @x1
    public abstract gn2<List<dc0>> v(@x1 String tag);

    @x1
    public abstract LiveData<List<dc0>> w(@x1 String tag);

    @x1
    public abstract gn2<List<dc0>> x(@x1 String uniqueWorkName);

    @x1
    public abstract LiveData<List<dc0>> y(@x1 String uniqueWorkName);

    @x1
    public abstract LiveData<List<dc0>> z(@x1 fc0 workQuery);
}