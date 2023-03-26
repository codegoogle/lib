package org.xbill.DNS;

import android.content.Context;
import com.p7700g.p99005.wo1;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.PrintStream;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class Lookup {
    public static final int HOST_NOT_FOUND = 3;
    public static final int SUCCESSFUL = 0;
    public static final int TRY_AGAIN = 2;
    public static final int TYPE_NOT_FOUND = 4;
    public static final int UNRECOVERABLE = 1;
    private static Map defaultCaches;
    private static int defaultNdots;
    private static Resolver defaultResolver;
    private static Name[] defaultSearchPath;
    private static final Name[] noAliases = new Name[0];
    private List aliases;
    private Record[] answers;
    private boolean badresponse;
    private String badresponse_error;
    private Cache cache;
    private int credibility;
    private int dclass;
    private boolean done;
    private boolean doneCurrent;
    private String error;
    private boolean foundAlias;
    private int iterations;
    private Name name;
    private boolean nametoolong;
    private boolean networkerror;
    private boolean nxdomain;
    private boolean referral;
    private Resolver resolver;
    private int result;
    private Name[] searchPath;
    private boolean temporary_cache;
    private boolean timedout;
    private int type;
    private boolean verbose;

    public Lookup(Name name, int i, int i2) {
        Type.check(i);
        DClass.check(i2);
        if (!Type.isRR(i) && i != 255) {
            throw new IllegalArgumentException("Cannot query for meta-types other than ANY");
        }
        this.name = name;
        this.type = i;
        this.dclass = i2;
        synchronized (Lookup.class) {
            this.resolver = getDefaultResolver();
            this.searchPath = getDefaultSearchPath();
            this.cache = getDefaultCache(i2);
        }
        this.credibility = 3;
        this.verbose = Options.check("verbose");
        this.result = -1;
    }

    private void checkDone() {
        if (!this.done || this.result == -1) {
            StringBuilder G = wo1.G("Lookup of ");
            G.append(this.name);
            G.append(" ");
            StringBuffer stringBuffer = new StringBuffer(G.toString());
            if (this.dclass != 1) {
                stringBuffer.append(DClass.string(this.dclass) + " ");
            }
            stringBuffer.append(Type.string(this.type) + " isn't done");
            throw new IllegalStateException(stringBuffer.toString());
        }
    }

    private void follow(Name name, Name name2) {
        this.foundAlias = true;
        this.badresponse = false;
        this.networkerror = false;
        this.timedout = false;
        this.nxdomain = false;
        this.referral = false;
        int i = this.iterations + 1;
        this.iterations = i;
        if (i < 6 && !name.equals(name2)) {
            if (this.aliases == null) {
                this.aliases = new ArrayList();
            }
            this.aliases.add(name2);
            lookup(name);
            return;
        }
        this.result = 1;
        this.error = "CNAME loop";
        this.done = true;
    }

    public static synchronized Cache getDefaultCache(int i) {
        Cache cache;
        synchronized (Lookup.class) {
            DClass.check(i);
            cache = (Cache) defaultCaches.get(Mnemonic.toInteger(i));
            if (cache == null) {
                cache = new Cache(i);
                defaultCaches.put(Mnemonic.toInteger(i), cache);
            }
        }
        return cache;
    }

    public static synchronized Resolver getDefaultResolver() {
        Resolver resolver;
        synchronized (Lookup.class) {
            resolver = defaultResolver;
        }
        return resolver;
    }

    public static synchronized Name[] getDefaultSearchPath() {
        Name[] nameArr;
        synchronized (Lookup.class) {
            nameArr = defaultSearchPath;
        }
        return nameArr;
    }

    private void lookup(Name name) {
        SetResponse lookupRecords = this.cache.lookupRecords(name, this.type, this.credibility);
        if (this.verbose) {
            PrintStream printStream = System.err;
            printStream.println("lookup " + name + " " + Type.string(this.type));
            System.err.println(lookupRecords);
        }
        processResponse(name, lookupRecords);
        if (this.done || this.doneCurrent) {
            return;
        }
        Message newQuery = Message.newQuery(Record.newRecord(name, this.type, this.dclass));
        try {
            Message send = this.resolver.send(newQuery);
            int rcode = send.getHeader().getRcode();
            if (rcode != 0 && rcode != 3) {
                this.badresponse = true;
                this.badresponse_error = Rcode.string(rcode);
            } else if (!newQuery.getQuestion().equals(send.getQuestion())) {
                this.badresponse = true;
                this.badresponse_error = "response does not match query";
            } else {
                SetResponse addMessage = this.cache.addMessage(send);
                if (addMessage == null) {
                    addMessage = this.cache.lookupRecords(name, this.type, this.credibility);
                }
                if (this.verbose) {
                    PrintStream printStream2 = System.err;
                    printStream2.println("queried " + name + " " + Type.string(this.type));
                    System.err.println(addMessage);
                }
                processResponse(name, addMessage);
            }
        } catch (IOException e) {
            if (e instanceof InterruptedIOException) {
                this.timedout = true;
            } else {
                this.networkerror = true;
            }
        }
    }

    private void processResponse(Name name, SetResponse setResponse) {
        if (setResponse.isSuccessful()) {
            RRset[] answers = setResponse.answers();
            ArrayList arrayList = new ArrayList();
            for (RRset rRset : answers) {
                Iterator rrs = rRset.rrs();
                while (rrs.hasNext()) {
                    arrayList.add(rrs.next());
                }
            }
            this.result = 0;
            this.answers = (Record[]) arrayList.toArray(new Record[arrayList.size()]);
            this.done = true;
        } else if (setResponse.isNXDOMAIN()) {
            this.nxdomain = true;
            this.doneCurrent = true;
            if (this.iterations > 0) {
                this.result = 3;
                this.done = true;
            }
        } else if (setResponse.isNXRRSET()) {
            this.result = 4;
            this.answers = null;
            this.done = true;
        } else if (setResponse.isCNAME()) {
            follow(setResponse.getCNAME().getTarget(), name);
        } else if (setResponse.isDNAME()) {
            try {
                follow(name.fromDNAME(setResponse.getDNAME()), name);
            } catch (NameTooLongException unused) {
                this.result = 1;
                this.error = "Invalid DNAME target";
                this.done = true;
            }
        } else if (setResponse.isDelegation()) {
            this.referral = true;
        }
    }

    public static synchronized void refreshDefault(Context context) throws UnknownHostException {
        synchronized (Lookup.class) {
            ResolverConfig.refresh(context);
            defaultResolver = new ExtendedResolver();
            defaultSearchPath = ResolverConfig.getCurrentConfig().searchPath();
            defaultCaches = new HashMap();
            defaultNdots = ResolverConfig.getCurrentConfig().ndots();
        }
    }

    private final void reset() {
        this.iterations = 0;
        this.foundAlias = false;
        this.done = false;
        this.doneCurrent = false;
        this.aliases = null;
        this.answers = null;
        this.result = -1;
        this.error = null;
        this.nxdomain = false;
        this.badresponse = false;
        this.badresponse_error = null;
        this.networkerror = false;
        this.timedout = false;
        this.nametoolong = false;
        this.referral = false;
        if (this.temporary_cache) {
            this.cache.clearCache();
        }
    }

    private void resolve(Name name, Name name2) {
        this.doneCurrent = false;
        if (name2 != null) {
            try {
                name = Name.concatenate(name, name2);
            } catch (NameTooLongException unused) {
                this.nametoolong = true;
                return;
            }
        }
        lookup(name);
    }

    public static synchronized void setDefaultCache(Cache cache, int i) {
        synchronized (Lookup.class) {
            DClass.check(i);
            defaultCaches.put(Mnemonic.toInteger(i), cache);
        }
    }

    public static synchronized void setDefaultResolver(Resolver resolver) {
        synchronized (Lookup.class) {
            defaultResolver = resolver;
        }
    }

    public static synchronized void setDefaultSearchPath(Name[] nameArr) {
        synchronized (Lookup.class) {
            defaultSearchPath = nameArr;
        }
    }

    public static synchronized void setPacketLogger(PacketLogger packetLogger) {
        synchronized (Lookup.class) {
            Client.setPacketLogger(packetLogger);
        }
    }

    public Name[] getAliases() {
        checkDone();
        List list = this.aliases;
        return list == null ? noAliases : (Name[]) list.toArray(new Name[list.size()]);
    }

    public Record[] getAnswers() {
        checkDone();
        return this.answers;
    }

    public String getErrorString() {
        checkDone();
        String str = this.error;
        if (str != null) {
            return str;
        }
        int i = this.result;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return "type not found";
                        }
                        throw new IllegalStateException("unknown result");
                    }
                    return "host not found";
                }
                return "try again";
            }
            return "unrecoverable error";
        }
        return "successful";
    }

    public int getResult() {
        checkDone();
        return this.result;
    }

    public Record[] run() {
        if (this.done) {
            reset();
        }
        if (!this.name.isAbsolute()) {
            if (this.searchPath == null) {
                resolve(this.name, Name.root);
            } else {
                if (this.name.labels() > defaultNdots) {
                    resolve(this.name, Name.root);
                }
                if (!this.done) {
                    int i = 0;
                    while (true) {
                        Name[] nameArr = this.searchPath;
                        if (i >= nameArr.length) {
                            break;
                        }
                        resolve(this.name, nameArr[i]);
                        if (this.done) {
                            return this.answers;
                        }
                        if (this.foundAlias) {
                            break;
                        }
                        i++;
                    }
                } else {
                    return this.answers;
                }
            }
        } else {
            resolve(this.name, null);
        }
        if (!this.done) {
            if (this.badresponse) {
                this.result = 2;
                this.error = this.badresponse_error;
                this.done = true;
            } else if (this.timedout) {
                this.result = 2;
                this.error = "timed out";
                this.done = true;
            } else if (this.networkerror) {
                this.result = 2;
                this.error = "network error";
                this.done = true;
            } else if (this.nxdomain) {
                this.result = 3;
                this.done = true;
            } else if (this.referral) {
                this.result = 1;
                this.error = "referral";
                this.done = true;
            } else if (this.nametoolong) {
                this.result = 1;
                this.error = "name too long";
                this.done = true;
            }
        }
        return this.answers;
    }

    public void setCache(Cache cache) {
        if (cache == null) {
            this.cache = new Cache(this.dclass);
            this.temporary_cache = true;
            return;
        }
        this.cache = cache;
        this.temporary_cache = false;
    }

    public void setCredibility(int i) {
        this.credibility = i;
    }

    public void setNdots(int i) {
        if (i >= 0) {
            defaultNdots = i;
            return;
        }
        throw new IllegalArgumentException(wo1.l("Illegal ndots value: ", i));
    }

    public void setResolver(Resolver resolver) {
        this.resolver = resolver;
    }

    public void setSearchPath(Name[] nameArr) {
        this.searchPath = nameArr;
    }

    public void setSearchPath(String[] strArr) throws TextParseException {
        if (strArr == null) {
            this.searchPath = null;
            return;
        }
        Name[] nameArr = new Name[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            nameArr[i] = Name.fromString(strArr[i], Name.root);
        }
        this.searchPath = nameArr;
    }

    public static synchronized void setDefaultSearchPath(String[] strArr) throws TextParseException {
        synchronized (Lookup.class) {
            if (strArr == null) {
                defaultSearchPath = null;
                return;
            }
            Name[] nameArr = new Name[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                nameArr[i] = Name.fromString(strArr[i], Name.root);
            }
            defaultSearchPath = nameArr;
        }
    }

    public Lookup(Name name, int i) {
        this(name, i, 1);
    }

    public Lookup(Name name) {
        this(name, 1, 1);
    }

    public Lookup(String str, int i, int i2) throws TextParseException {
        this(Name.fromString(str), i, i2);
    }

    public Lookup(String str, int i) throws TextParseException {
        this(Name.fromString(str), i, 1);
    }

    public Lookup(String str) throws TextParseException {
        this(Name.fromString(str), 1, 1);
    }
}