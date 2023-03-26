package com.anythink.core.api;

/* loaded from: classes2.dex */
public interface ATCustomVideo {
    String getVideoUrl();

    void reportVideoAutoStart();

    void reportVideoBreak(long j);

    void reportVideoContinue(long j);

    void reportVideoError(long j, int i, int i2);

    void reportVideoFinish();

    void reportVideoPause(long j);

    void reportVideoStart();

    void reportVideoStartError(int i, int i2);
}