package com.microsoft.appcenter.channel;

import com.microsoft.appcenter.channel.Channel;
import com.microsoft.appcenter.ingestion.models.Log;
import com.p7700g.p99005.x1;

/* loaded from: classes3.dex */
public class AbstractChannelListener implements Channel.Listener {
    @Override // com.microsoft.appcenter.channel.Channel.Listener
    public void onClear(@x1 String str) {
    }

    @Override // com.microsoft.appcenter.channel.Channel.Listener
    public void onGloballyEnabled(boolean z) {
    }

    @Override // com.microsoft.appcenter.channel.Channel.Listener
    public void onGroupAdded(@x1 String str, Channel.GroupListener groupListener, long j) {
    }

    @Override // com.microsoft.appcenter.channel.Channel.Listener
    public void onGroupRemoved(@x1 String str) {
    }

    @Override // com.microsoft.appcenter.channel.Channel.Listener
    public void onPaused(@x1 String str, String str2) {
    }

    @Override // com.microsoft.appcenter.channel.Channel.Listener
    public void onPreparedLog(@x1 Log log, @x1 String str, int i) {
    }

    @Override // com.microsoft.appcenter.channel.Channel.Listener
    public void onPreparingLog(@x1 Log log, @x1 String str) {
    }

    @Override // com.microsoft.appcenter.channel.Channel.Listener
    public void onResumed(@x1 String str, String str2) {
    }

    @Override // com.microsoft.appcenter.channel.Channel.Listener
    public boolean shouldFilter(@x1 Log log) {
        return false;
    }
}