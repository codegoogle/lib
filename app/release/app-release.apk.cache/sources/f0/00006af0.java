package org.xbill.DNS;

import com.p7700g.p99005.wo1;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public class Cache {
    private static final int defaultMaxEntries = 50000;
    private CacheMap data;
    private int dclass;
    private int maxcache;
    private int maxncache;

    /* loaded from: classes4.dex */
    public static class CacheMap extends LinkedHashMap {
        private int maxsize;

        public CacheMap(int i) {
            super(16, 0.75f, true);
            this.maxsize = -1;
            this.maxsize = i;
        }

        public int getMaxSize() {
            return this.maxsize;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry entry) {
            return this.maxsize >= 0 && size() > this.maxsize;
        }

        public void setMaxSize(int i) {
            this.maxsize = i;
        }
    }

    /* loaded from: classes4.dex */
    public interface Element {
        int compareCredibility(int i);

        boolean expired();

        int getType();
    }

    /* loaded from: classes4.dex */
    public static class NegativeElement implements Element {
        public int credibility;
        public int expire;
        public Name name;
        public int type;

        public NegativeElement(Name name, int i, SOARecord sOARecord, int i2, long j) {
            this.name = name;
            this.type = i;
            long minimum = sOARecord != null ? sOARecord.getMinimum() : 0L;
            this.credibility = i2;
            this.expire = Cache.limitExpire(minimum, j);
        }

        @Override // org.xbill.DNS.Cache.Element
        public final int compareCredibility(int i) {
            return this.credibility - i;
        }

        @Override // org.xbill.DNS.Cache.Element
        public final boolean expired() {
            return ((int) (System.currentTimeMillis() / 1000)) >= this.expire;
        }

        @Override // org.xbill.DNS.Cache.Element
        public int getType() {
            return this.type;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            if (this.type == 0) {
                StringBuilder G = wo1.G("NXDOMAIN ");
                G.append(this.name);
                stringBuffer.append(G.toString());
            } else {
                StringBuilder G2 = wo1.G("NXRRSET ");
                G2.append(this.name);
                G2.append(" ");
                G2.append(Type.string(this.type));
                stringBuffer.append(G2.toString());
            }
            stringBuffer.append(" cl = ");
            stringBuffer.append(this.credibility);
            return stringBuffer.toString();
        }
    }

    public Cache(int i) {
        this.maxncache = -1;
        this.maxcache = -1;
        this.dclass = i;
        this.data = new CacheMap(defaultMaxEntries);
    }

    private synchronized void addElement(Name name, Element element) {
        Object obj = this.data.get(name);
        if (obj == null) {
            this.data.put(name, element);
            return;
        }
        int type = element.getType();
        if (obj instanceof List) {
            List list = (List) obj;
            for (int i = 0; i < list.size(); i++) {
                if (((Element) list.get(i)).getType() == type) {
                    list.set(i, element);
                    return;
                }
            }
            list.add(element);
        } else {
            Element element2 = (Element) obj;
            if (element2.getType() == type) {
                this.data.put(name, element);
            } else {
                LinkedList linkedList = new LinkedList();
                linkedList.add(element2);
                linkedList.add(element);
                this.data.put(name, linkedList);
            }
        }
    }

    private synchronized Element[] allElements(Object obj) {
        if (!(obj instanceof List)) {
            return new Element[]{(Element) obj};
        }
        List list = (List) obj;
        return (Element[]) list.toArray(new Element[list.size()]);
    }

    private synchronized Object exactName(Name name) {
        return this.data.get(name);
    }

    private synchronized Element findElement(Name name, int i, int i2) {
        Object exactName = exactName(name);
        if (exactName == null) {
            return null;
        }
        return oneElement(name, exactName, i, i2);
    }

    private RRset[] findRecords(Name name, int i, int i2) {
        SetResponse lookupRecords = lookupRecords(name, i, i2);
        if (lookupRecords.isSuccessful()) {
            return lookupRecords.answers();
        }
        return null;
    }

    private final int getCred(int i, boolean z) {
        if (i == 1) {
            return z ? 4 : 3;
        } else if (i == 2) {
            return z ? 4 : 3;
        } else if (i == 3) {
            return 1;
        } else {
            throw new IllegalArgumentException("getCred: invalid section");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int limitExpire(long j, long j2) {
        if (j2 >= 0 && j2 < j) {
            j = j2;
        }
        long currentTimeMillis = (System.currentTimeMillis() / 1000) + j;
        if (currentTimeMillis < 0 || currentTimeMillis > TTL.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return (int) currentTimeMillis;
    }

    private static void markAdditional(RRset rRset, Set set) {
        if (rRset.first().getAdditionalName() == null) {
            return;
        }
        Iterator rrs = rRset.rrs();
        while (rrs.hasNext()) {
            Name additionalName = ((Record) rrs.next()).getAdditionalName();
            if (additionalName != null) {
                set.add(additionalName);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
        if (r2.getType() == r7) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized Element oneElement(Name name, Object obj, int i, int i2) {
        Element element;
        if (i != 255) {
            if (obj instanceof List) {
                List list = (List) obj;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    element = (Element) list.get(i3);
                    if (element.getType() == i) {
                        break;
                    }
                }
                element = null;
            } else {
                element = (Element) obj;
            }
            if (element == null) {
                return null;
            }
            if (element.expired()) {
                removeElement(name, i);
                return null;
            } else if (element.compareCredibility(i2) < 0) {
                return null;
            } else {
                return element;
            }
        }
        throw new IllegalArgumentException("oneElement(ANY)");
    }

    private synchronized void removeElement(Name name, int i) {
        Object obj = this.data.get(name);
        if (obj == null) {
            return;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (((Element) list.get(i2)).getType() == i) {
                    list.remove(i2);
                    if (list.size() == 0) {
                        this.data.remove(name);
                    }
                    return;
                }
            }
        } else if (((Element) obj).getType() == i) {
            this.data.remove(name);
        }
    }

    private synchronized void removeName(Name name) {
        this.data.remove(name);
    }

    public SetResponse addMessage(Message message) {
        boolean flag = message.getHeader().getFlag(5);
        Record question = message.getQuestion();
        int rcode = message.getHeader().getRcode();
        boolean check = Options.check("verbosecache");
        if ((rcode == 0 || rcode == 3) && question != null) {
            Name name = question.getName();
            int type = question.getType();
            int dClass = question.getDClass();
            HashSet hashSet = new HashSet();
            int i = 1;
            RRset[] sectionRRsets = message.getSectionRRsets(1);
            SetResponse setResponse = null;
            Name name2 = name;
            int i2 = 0;
            boolean z = false;
            while (i2 < sectionRRsets.length) {
                if (sectionRRsets[i2].getDClass() == dClass) {
                    int type2 = sectionRRsets[i2].getType();
                    Name name3 = sectionRRsets[i2].getName();
                    int cred = getCred(i, flag);
                    if ((type2 == type || type == 255) && name3.equals(name2)) {
                        addRRset(sectionRRsets[i2], cred);
                        if (name2 == name) {
                            SetResponse setResponse2 = setResponse == null ? new SetResponse(6) : setResponse;
                            setResponse2.addRRset(sectionRRsets[i2]);
                            setResponse = setResponse2;
                        }
                        markAdditional(sectionRRsets[i2], hashSet);
                        z = true;
                    } else if (type2 == 5 && name3.equals(name2)) {
                        addRRset(sectionRRsets[i2], cred);
                        if (name2 == name) {
                            setResponse = new SetResponse(4, sectionRRsets[i2]);
                        }
                        name2 = ((CNAMERecord) sectionRRsets[i2].first()).getTarget();
                    } else if (type2 == 39 && name2.subdomain(name3)) {
                        addRRset(sectionRRsets[i2], cred);
                        if (name2 == name) {
                            setResponse = new SetResponse(5, sectionRRsets[i2]);
                        }
                        try {
                            name2 = name2.fromDNAME((DNAMERecord) sectionRRsets[i2].first());
                        } catch (NameTooLongException unused) {
                        }
                    }
                    i2++;
                    i = 1;
                }
                i2++;
                i = 1;
            }
            RRset[] sectionRRsets2 = message.getSectionRRsets(2);
            RRset rRset = null;
            RRset rRset2 = null;
            for (int i3 = 0; i3 < sectionRRsets2.length; i3++) {
                if (sectionRRsets2[i3].getType() == 6 && name2.subdomain(sectionRRsets2[i3].getName())) {
                    rRset2 = sectionRRsets2[i3];
                } else if (sectionRRsets2[i3].getType() == 2 && name2.subdomain(sectionRRsets2[i3].getName())) {
                    rRset = sectionRRsets2[i3];
                }
            }
            if (!z) {
                if (rcode == 3) {
                    type = 0;
                }
                if (rcode != 3 && rRset2 == null && rRset != null) {
                    addRRset(rRset, getCred(2, flag));
                    markAdditional(rRset, hashSet);
                    if (setResponse == null) {
                        setResponse = new SetResponse(3, rRset);
                    }
                } else {
                    addNegative(name2, type, rRset2 != null ? (SOARecord) rRset2.first() : null, getCred(2, flag));
                    if (setResponse == null) {
                        setResponse = SetResponse.ofType(rcode == 3 ? 1 : 2);
                    }
                }
            } else if (rcode == 0 && rRset != null) {
                addRRset(rRset, getCred(2, flag));
                markAdditional(rRset, hashSet);
            }
            SetResponse setResponse3 = setResponse;
            RRset[] sectionRRsets3 = message.getSectionRRsets(3);
            for (int i4 = 0; i4 < sectionRRsets3.length; i4++) {
                int type3 = sectionRRsets3[i4].getType();
                if ((type3 == 1 || type3 == 28 || type3 == 38) && hashSet.contains(sectionRRsets3[i4].getName())) {
                    addRRset(sectionRRsets3[i4], getCred(3, flag));
                }
            }
            if (check) {
                System.out.println("addMessage: " + setResponse3);
            }
            return setResponse3;
        }
        return null;
    }

    public synchronized void addNegative(Name name, int i, SOARecord sOARecord, int i2) {
        long ttl = sOARecord != null ? sOARecord.getTTL() : 0L;
        Element findElement = findElement(name, i, 0);
        if (ttl == 0) {
            if (findElement != null && findElement.compareCredibility(i2) <= 0) {
                removeElement(name, i);
            }
        } else {
            if (findElement != null && findElement.compareCredibility(i2) <= 0) {
                findElement = null;
            }
            if (findElement == null) {
                addElement(name, new NegativeElement(name, i, sOARecord, i2, this.maxncache));
            }
        }
    }

    public synchronized void addRRset(RRset rRset, int i) {
        CacheRRset cacheRRset;
        long ttl = rRset.getTTL();
        Name name = rRset.getName();
        int type = rRset.getType();
        Element findElement = findElement(name, type, 0);
        if (ttl == 0) {
            if (findElement != null && findElement.compareCredibility(i) <= 0) {
                removeElement(name, type);
            }
        } else {
            if (findElement != null && findElement.compareCredibility(i) <= 0) {
                findElement = null;
            }
            if (findElement == null) {
                if (rRset instanceof CacheRRset) {
                    cacheRRset = (CacheRRset) rRset;
                } else {
                    cacheRRset = new CacheRRset(rRset, i, this.maxcache);
                }
                addElement(name, cacheRRset);
            }
        }
    }

    public synchronized void addRecord(Record record, int i, Object obj) {
        Name name = record.getName();
        int rRsetType = record.getRRsetType();
        if (Type.isRR(rRsetType)) {
            Element findElement = findElement(name, rRsetType, i);
            if (findElement == null) {
                addRRset(new CacheRRset(record, i, this.maxcache), i);
            } else if (findElement.compareCredibility(i) == 0 && (findElement instanceof CacheRRset)) {
                ((CacheRRset) findElement).addRR(record);
            }
        }
    }

    public synchronized void clearCache() {
        this.data.clear();
    }

    public RRset[] findAnyRecords(Name name, int i) {
        return findRecords(name, i, 2);
    }

    public void flushName(Name name) {
        removeName(name);
    }

    public void flushSet(Name name, int i) {
        removeElement(name, i);
    }

    public int getDClass() {
        return this.dclass;
    }

    public int getMaxCache() {
        return this.maxcache;
    }

    public int getMaxEntries() {
        return this.data.getMaxSize();
    }

    public int getMaxNCache() {
        return this.maxncache;
    }

    public int getSize() {
        return this.data.size();
    }

    public synchronized SetResponse lookup(Name name, int i, int i2) {
        Name name2;
        Element[] allElements;
        int labels = name.labels();
        int i3 = labels;
        while (i3 >= 1) {
            boolean z = i3 == 1;
            boolean z2 = i3 == labels;
            if (z) {
                name2 = Name.root;
            } else {
                name2 = z2 ? name : new Name(name, labels - i3);
            }
            Object obj = this.data.get(name2);
            if (obj != null) {
                if (z2 && i == 255) {
                    SetResponse setResponse = new SetResponse(6);
                    int i4 = 0;
                    for (Element element : allElements(obj)) {
                        if (element.expired()) {
                            removeElement(name2, element.getType());
                        } else if ((element instanceof CacheRRset) && element.compareCredibility(i2) >= 0) {
                            setResponse.addRRset((CacheRRset) element);
                            i4++;
                        }
                    }
                    if (i4 > 0) {
                        return setResponse;
                    }
                } else if (z2) {
                    Element oneElement = oneElement(name2, obj, i, i2);
                    if (oneElement != null && (oneElement instanceof CacheRRset)) {
                        SetResponse setResponse2 = new SetResponse(6);
                        setResponse2.addRRset((CacheRRset) oneElement);
                        return setResponse2;
                    } else if (oneElement != null) {
                        return new SetResponse(2);
                    } else {
                        Element oneElement2 = oneElement(name2, obj, 5, i2);
                        if (oneElement2 != null && (oneElement2 instanceof CacheRRset)) {
                            return new SetResponse(4, (CacheRRset) oneElement2);
                        }
                    }
                } else {
                    Element oneElement3 = oneElement(name2, obj, 39, i2);
                    if (oneElement3 != null && (oneElement3 instanceof CacheRRset)) {
                        return new SetResponse(5, (CacheRRset) oneElement3);
                    }
                }
                Element oneElement4 = oneElement(name2, obj, 2, i2);
                if (oneElement4 != null && (oneElement4 instanceof CacheRRset)) {
                    return new SetResponse(3, (CacheRRset) oneElement4);
                } else if (z2 && oneElement(name2, obj, 0, i2) != null) {
                    return SetResponse.ofType(1);
                }
            }
            i3--;
        }
        return SetResponse.ofType(0);
    }

    public SetResponse lookupRecords(Name name, int i, int i2) {
        return lookup(name, i, i2);
    }

    public void setMaxCache(int i) {
        this.maxcache = i;
    }

    public void setMaxEntries(int i) {
        this.data.setMaxSize(i);
    }

    public void setMaxNCache(int i) {
        this.maxncache = i;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        synchronized (this) {
            for (Object obj : this.data.values()) {
                for (Element element : allElements(obj)) {
                    stringBuffer.append(element);
                    stringBuffer.append("\n");
                }
            }
        }
        return stringBuffer.toString();
    }

    /* loaded from: classes4.dex */
    public static class CacheRRset extends RRset implements Element {
        private static final long serialVersionUID = 5971755205903597024L;
        public int credibility;
        public int expire;

        public CacheRRset(Record record, int i, long j) {
            this.credibility = i;
            this.expire = Cache.limitExpire(record.getTTL(), j);
            addRR(record);
        }

        @Override // org.xbill.DNS.Cache.Element
        public final int compareCredibility(int i) {
            return this.credibility - i;
        }

        @Override // org.xbill.DNS.Cache.Element
        public final boolean expired() {
            return ((int) (System.currentTimeMillis() / 1000)) >= this.expire;
        }

        @Override // org.xbill.DNS.RRset
        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(super.toString());
            stringBuffer.append(" cl = ");
            stringBuffer.append(this.credibility);
            return stringBuffer.toString();
        }

        public CacheRRset(RRset rRset, int i, long j) {
            super(rRset);
            this.credibility = i;
            this.expire = Cache.limitExpire(rRset.getTTL(), j);
        }
    }

    public RRset[] findRecords(Name name, int i) {
        return findRecords(name, i, 3);
    }

    public Cache() {
        this(1);
    }

    public Cache(String str) throws IOException {
        this.maxncache = -1;
        this.maxcache = -1;
        this.data = new CacheMap(defaultMaxEntries);
        Master master = new Master(str);
        while (true) {
            Record nextRecord = master.nextRecord();
            if (nextRecord == null) {
                return;
            }
            addRecord(nextRecord, 0, master);
        }
    }
}