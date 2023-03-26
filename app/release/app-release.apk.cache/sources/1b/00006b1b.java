package org.xbill.DNS;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class ExtendedResolver implements Resolver {
    private static final int quantum = 5;
    private List resolvers;
    private boolean loadBalance = false;
    private int lbStart = 0;
    private int retries = 3;

    /* loaded from: classes4.dex */
    public static class Resolution implements ResolverListener {
        public boolean done;
        public Object[] inprogress;
        public ResolverListener listener;
        public int outstanding;
        public Message query;
        public Resolver[] resolvers;
        public Message response;
        public int retries;
        public int[] sent;
        public Throwable thrown;

        public Resolution(ExtendedResolver extendedResolver, Message message) {
            List list = extendedResolver.resolvers;
            this.resolvers = (Resolver[]) list.toArray(new Resolver[list.size()]);
            if (extendedResolver.loadBalance) {
                int length = this.resolvers.length;
                int access$208 = ExtendedResolver.access$208(extendedResolver) % length;
                if (extendedResolver.lbStart > length) {
                    ExtendedResolver.access$244(extendedResolver, length);
                }
                if (access$208 > 0) {
                    Resolver[] resolverArr = new Resolver[length];
                    for (int i = 0; i < length; i++) {
                        resolverArr[i] = this.resolvers[(i + access$208) % length];
                    }
                    this.resolvers = resolverArr;
                }
            }
            Resolver[] resolverArr2 = this.resolvers;
            this.sent = new int[resolverArr2.length];
            this.inprogress = new Object[resolverArr2.length];
            this.retries = extendedResolver.retries;
            this.query = message;
        }

        @Override // org.xbill.DNS.ResolverListener
        public void handleException(Object obj, Exception exc) {
            Object[] objArr;
            if (Options.check("verbose")) {
                System.err.println("ExtendedResolver: got " + exc);
            }
            synchronized (this) {
                this.outstanding--;
                if (this.done) {
                    return;
                }
                boolean z = false;
                int i = 0;
                while (true) {
                    objArr = this.inprogress;
                    if (i >= objArr.length || objArr[i] == obj) {
                        break;
                    }
                    i++;
                }
                if (i == objArr.length) {
                    return;
                }
                int[] iArr = this.sent;
                if (iArr[i] == 1 && i < this.resolvers.length - 1) {
                    z = true;
                }
                if (exc instanceof InterruptedIOException) {
                    if (iArr[i] < this.retries) {
                        send(i);
                    }
                    if (this.thrown == null) {
                        this.thrown = exc;
                    }
                } else if (exc instanceof SocketException) {
                    Throwable th = this.thrown;
                    if (th == null || (th instanceof InterruptedIOException)) {
                        this.thrown = exc;
                    }
                } else {
                    this.thrown = exc;
                }
                if (this.done) {
                    return;
                }
                if (z) {
                    send(i + 1);
                }
                if (this.done) {
                    return;
                }
                if (this.outstanding == 0) {
                    this.done = true;
                    if (this.listener == null) {
                        notifyAll();
                        return;
                    }
                }
                if (this.done) {
                    if (!(this.thrown instanceof Exception)) {
                        this.thrown = new RuntimeException(this.thrown.getMessage());
                    }
                    this.listener.handleException(this, (Exception) this.thrown);
                }
            }
        }

        @Override // org.xbill.DNS.ResolverListener
        public void receiveMessage(Object obj, Message message) {
            if (Options.check("verbose")) {
                System.err.println("ExtendedResolver: received message");
            }
            synchronized (this) {
                if (this.done) {
                    return;
                }
                this.response = message;
                this.done = true;
                ResolverListener resolverListener = this.listener;
                if (resolverListener == null) {
                    notifyAll();
                } else {
                    resolverListener.receiveMessage(this, message);
                }
            }
        }

        public void send(int i) {
            int[] iArr = this.sent;
            iArr[i] = iArr[i] + 1;
            this.outstanding++;
            try {
                this.inprogress[i] = this.resolvers[i].sendAsync(this.query, this);
            } catch (Throwable th) {
                synchronized (this) {
                    this.thrown = th;
                    this.done = true;
                    if (this.listener == null) {
                        notifyAll();
                    }
                }
            }
        }

        public Message start() throws IOException {
            try {
                int[] iArr = this.sent;
                iArr[0] = iArr[0] + 1;
                this.outstanding++;
                this.inprogress[0] = new Object();
                return this.resolvers[0].send(this.query);
            } catch (Exception e) {
                handleException(this.inprogress[0], e);
                synchronized (this) {
                    while (!this.done) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                        }
                    }
                    Message message = this.response;
                    if (message != null) {
                        return message;
                    }
                    Throwable th = this.thrown;
                    if (!(th instanceof IOException)) {
                        if (!(th instanceof RuntimeException)) {
                            if (th instanceof Error) {
                                throw ((Error) th);
                            }
                            throw new IllegalStateException("ExtendedResolver failure");
                        }
                        throw ((RuntimeException) th);
                    }
                    throw ((IOException) th);
                }
            }
        }

        public void startAsync(ResolverListener resolverListener) {
            this.listener = resolverListener;
            send(0);
        }
    }

    public ExtendedResolver() throws UnknownHostException {
        init();
        String[] servers = ResolverConfig.getCurrentConfig().servers();
        if (servers != null) {
            for (String str : servers) {
                SimpleResolver simpleResolver = new SimpleResolver(str);
                simpleResolver.setTimeout(5);
                this.resolvers.add(simpleResolver);
            }
            return;
        }
        this.resolvers.add(new SimpleResolver());
    }

    public static /* synthetic */ int access$208(ExtendedResolver extendedResolver) {
        int i = extendedResolver.lbStart;
        extendedResolver.lbStart = i + 1;
        return i;
    }

    public static /* synthetic */ int access$244(ExtendedResolver extendedResolver, int i) {
        int i2 = extendedResolver.lbStart % i;
        extendedResolver.lbStart = i2;
        return i2;
    }

    private void init() {
        this.resolvers = new ArrayList();
    }

    public void addResolver(Resolver resolver) {
        this.resolvers.add(resolver);
    }

    public void deleteResolver(Resolver resolver) {
        this.resolvers.remove(resolver);
    }

    public Resolver getResolver(int i) {
        if (i < this.resolvers.size()) {
            return (Resolver) this.resolvers.get(i);
        }
        return null;
    }

    public Resolver[] getResolvers() {
        List list = this.resolvers;
        return (Resolver[]) list.toArray(new Resolver[list.size()]);
    }

    @Override // org.xbill.DNS.Resolver
    public Message send(Message message) throws IOException {
        return new Resolution(this, message).start();
    }

    @Override // org.xbill.DNS.Resolver
    public Object sendAsync(Message message, ResolverListener resolverListener) {
        Resolution resolution = new Resolution(this, message);
        resolution.startAsync(resolverListener);
        return resolution;
    }

    @Override // org.xbill.DNS.Resolver
    public void setEDNS(int i) {
        for (int i2 = 0; i2 < this.resolvers.size(); i2++) {
            ((Resolver) this.resolvers.get(i2)).setEDNS(i);
        }
    }

    @Override // org.xbill.DNS.Resolver
    public void setIgnoreTruncation(boolean z) {
        for (int i = 0; i < this.resolvers.size(); i++) {
            ((Resolver) this.resolvers.get(i)).setIgnoreTruncation(z);
        }
    }

    public void setLoadBalance(boolean z) {
        this.loadBalance = z;
    }

    @Override // org.xbill.DNS.Resolver
    public void setPort(int i) {
        for (int i2 = 0; i2 < this.resolvers.size(); i2++) {
            ((Resolver) this.resolvers.get(i2)).setPort(i);
        }
    }

    public void setRetries(int i) {
        this.retries = i;
    }

    @Override // org.xbill.DNS.Resolver
    public void setTCP(boolean z) {
        for (int i = 0; i < this.resolvers.size(); i++) {
            ((Resolver) this.resolvers.get(i)).setTCP(z);
        }
    }

    @Override // org.xbill.DNS.Resolver
    public void setTSIGKey(TSIG tsig) {
        for (int i = 0; i < this.resolvers.size(); i++) {
            ((Resolver) this.resolvers.get(i)).setTSIGKey(tsig);
        }
    }

    @Override // org.xbill.DNS.Resolver
    public void setTimeout(int i, int i2) {
        for (int i3 = 0; i3 < this.resolvers.size(); i3++) {
            ((Resolver) this.resolvers.get(i3)).setTimeout(i, i2);
        }
    }

    @Override // org.xbill.DNS.Resolver
    public void setEDNS(int i, int i2, int i3, List list) {
        for (int i4 = 0; i4 < this.resolvers.size(); i4++) {
            ((Resolver) this.resolvers.get(i4)).setEDNS(i, i2, i3, list);
        }
    }

    @Override // org.xbill.DNS.Resolver
    public void setTimeout(int i) {
        setTimeout(i, 0);
    }

    public ExtendedResolver(String[] strArr) throws UnknownHostException {
        init();
        for (String str : strArr) {
            SimpleResolver simpleResolver = new SimpleResolver(str);
            simpleResolver.setTimeout(5);
            this.resolvers.add(simpleResolver);
        }
    }

    public ExtendedResolver(Resolver[] resolverArr) throws UnknownHostException {
        init();
        for (Resolver resolver : resolverArr) {
            this.resolvers.add(resolver);
        }
    }
}