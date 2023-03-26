package org.xbill.DNS;

/* loaded from: classes4.dex */
public class ResolveThread extends Thread {
    private Object id;
    private ResolverListener listener;
    private Message query;
    private Resolver res;

    public ResolveThread(Resolver resolver, Message message, Object obj, ResolverListener resolverListener) {
        this.res = resolver;
        this.query = message;
        this.id = obj;
        this.listener = resolverListener;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            this.listener.receiveMessage(this.id, this.res.send(this.query));
        } catch (Exception e) {
            this.listener.handleException(this.id, e);
        }
    }
}