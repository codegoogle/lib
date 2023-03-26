package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.p7700g.p99005.x1;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public final class ServiceSpecificExtraArgs {

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface CastExtraArgs {
        @x1
        @KeepForSdk
        public static final String LISTENER = "listener";
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface GamesExtraArgs {
        @x1
        @KeepForSdk
        public static final String DESIRED_LOCALE = "com.google.android.gms.games.key.desiredLocale";
        @x1
        @KeepForSdk
        public static final String GAME_PACKAGE_NAME = "com.google.android.gms.games.key.gamePackageName";
        @x1
        @KeepForSdk
        public static final String SIGNIN_OPTIONS = "com.google.android.gms.games.key.signInOptions";
        @x1
        @KeepForSdk
        public static final String WINDOW_TOKEN = "com.google.android.gms.games.key.popupWindowToken";
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface PlusExtraArgs {
        @x1
        @KeepForSdk
        public static final String PLUS_AUTH_PACKAGE = "auth_package";
    }

    private ServiceSpecificExtraArgs() {
    }
}