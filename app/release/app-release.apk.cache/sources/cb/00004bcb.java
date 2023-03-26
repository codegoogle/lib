package com.p7700g.p99005;

import android.content.Context;
import java.io.File;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface k23 {

    /* loaded from: classes3.dex */
    public static final class a {
        @NotNull
        public static String a(@NotNull k23 k23Var, @NotNull Context context) {
            c25.p(k23Var, "this");
            c25.p(context, "context");
            File file = new File(context.getFilesDir().getAbsolutePath(), "greedygame/crash");
            if (!file.exists()) {
                file.mkdirs();
            }
            return file.getAbsolutePath() + ((Object) File.pathSeparator) + "crash_0.log";
        }
    }
}