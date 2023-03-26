package org.xbill.DNS;

import java.util.EventListener;

/* loaded from: classes4.dex */
public interface ResolverListener extends EventListener {
    void handleException(Object obj, Exception exc);

    void receiveMessage(Object obj, Message message);
}