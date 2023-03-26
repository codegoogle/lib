package org.xbill.DNS;

import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public class Zone implements Serializable {
    public static final int PRIMARY = 1;
    public static final int SECONDARY = 2;
    private static final long serialVersionUID = -9220510891189510942L;
    private RRset NS;
    private SOARecord SOA;
    private Map data;
    private int dclass;
    private boolean hasWild;
    private Name origin;
    private Object originNode;

    /* loaded from: classes4.dex */
    public class ZoneIterator implements Iterator {
        private int count;
        private RRset[] current;
        private boolean wantLastSOA;
        private Iterator zentries;

        public ZoneIterator(boolean z) {
            synchronized (Zone.this) {
                this.zentries = Zone.this.data.entrySet().iterator();
            }
            this.wantLastSOA = z;
            RRset[] allRRsets = Zone.this.allRRsets(Zone.this.originNode);
            this.current = new RRset[allRRsets.length];
            int i = 2;
            for (int i2 = 0; i2 < allRRsets.length; i2++) {
                int type = allRRsets[i2].getType();
                if (type == 6) {
                    this.current[0] = allRRsets[i2];
                } else if (type == 2) {
                    this.current[1] = allRRsets[i2];
                } else {
                    this.current[i] = allRRsets[i2];
                    i++;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.current != null || this.wantLastSOA;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (hasNext()) {
                RRset[] rRsetArr = this.current;
                if (rRsetArr == null) {
                    this.wantLastSOA = false;
                    Zone zone = Zone.this;
                    return zone.oneRRset(zone.originNode, 6);
                }
                int i = this.count;
                int i2 = i + 1;
                this.count = i2;
                RRset rRset = rRsetArr[i];
                if (i2 == rRsetArr.length) {
                    this.current = null;
                    while (true) {
                        if (!this.zentries.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) this.zentries.next();
                        if (!entry.getKey().equals(Zone.this.origin)) {
                            RRset[] allRRsets = Zone.this.allRRsets(entry.getValue());
                            if (allRRsets.length != 0) {
                                this.current = allRRsets;
                                this.count = 0;
                                break;
                            }
                        }
                    }
                }
                return rRset;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public Zone(Name name, String str) throws IOException {
        this.dclass = 1;
        this.data = new TreeMap();
        if (name != null) {
            Master master = new Master(str, name);
            this.origin = name;
            while (true) {
                Record nextRecord = master.nextRecord();
                if (nextRecord != null) {
                    maybeAddRecord(nextRecord);
                } else {
                    validate();
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("no zone name specified");
        }
    }

    private synchronized void addRRset(Name name, RRset rRset) {
        if (!this.hasWild && name.isWild()) {
            this.hasWild = true;
        }
        Object obj = this.data.get(name);
        if (obj == null) {
            this.data.put(name, rRset);
            return;
        }
        int type = rRset.getType();
        if (obj instanceof List) {
            List list = (List) obj;
            for (int i = 0; i < list.size(); i++) {
                if (((RRset) list.get(i)).getType() == type) {
                    list.set(i, rRset);
                    return;
                }
            }
            list.add(rRset);
        } else {
            RRset rRset2 = (RRset) obj;
            if (rRset2.getType() == type) {
                this.data.put(name, rRset);
            } else {
                LinkedList linkedList = new LinkedList();
                linkedList.add(rRset2);
                linkedList.add(rRset);
                this.data.put(name, linkedList);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized RRset[] allRRsets(Object obj) {
        if (!(obj instanceof List)) {
            return new RRset[]{(RRset) obj};
        }
        List list = (List) obj;
        return (RRset[]) list.toArray(new RRset[list.size()]);
    }

    private synchronized Object exactName(Name name) {
        return this.data.get(name);
    }

    private synchronized RRset findRRset(Name name, int i) {
        Object exactName = exactName(name);
        if (exactName == null) {
            return null;
        }
        return oneRRset(exactName, i);
    }

    private void fromXFR(ZoneTransferIn zoneTransferIn) throws IOException, ZoneTransferException {
        this.data = new TreeMap();
        this.origin = zoneTransferIn.getName();
        for (Record record : zoneTransferIn.run()) {
            maybeAddRecord(record);
        }
        if (zoneTransferIn.isAXFR()) {
            validate();
            return;
        }
        throw new IllegalArgumentException("zones can only be created from AXFRs");
    }

    private synchronized SetResponse lookup(Name name, int i) {
        RRset oneRRset;
        Name name2;
        RRset oneRRset2;
        if (!name.subdomain(this.origin)) {
            return SetResponse.ofType(1);
        }
        int labels = name.labels();
        int labels2 = this.origin.labels();
        int i2 = labels2;
        while (true) {
            int i3 = 0;
            if (i2 <= labels) {
                boolean z = i2 == labels2;
                boolean z2 = i2 == labels;
                if (z) {
                    name2 = this.origin;
                } else {
                    name2 = z2 ? name : new Name(name, labels - i2);
                }
                Object exactName = exactName(name2);
                if (exactName != null) {
                    if (!z && (oneRRset2 = oneRRset(exactName, 2)) != null) {
                        return new SetResponse(3, oneRRset2);
                    }
                    if (z2 && i == 255) {
                        SetResponse setResponse = new SetResponse(6);
                        RRset[] allRRsets = allRRsets(exactName);
                        while (i3 < allRRsets.length) {
                            setResponse.addRRset(allRRsets[i3]);
                            i3++;
                        }
                        return setResponse;
                    }
                    if (z2) {
                        RRset oneRRset3 = oneRRset(exactName, i);
                        if (oneRRset3 != null) {
                            SetResponse setResponse2 = new SetResponse(6);
                            setResponse2.addRRset(oneRRset3);
                            return setResponse2;
                        }
                        RRset oneRRset4 = oneRRset(exactName, 5);
                        if (oneRRset4 != null) {
                            return new SetResponse(4, oneRRset4);
                        }
                    } else {
                        RRset oneRRset5 = oneRRset(exactName, 39);
                        if (oneRRset5 != null) {
                            return new SetResponse(5, oneRRset5);
                        }
                    }
                    if (z2) {
                        return SetResponse.ofType(2);
                    }
                }
                i2++;
            } else {
                if (this.hasWild) {
                    while (i3 < labels - labels2) {
                        i3++;
                        Object exactName2 = exactName(name.wild(i3));
                        if (exactName2 != null && (oneRRset = oneRRset(exactName2, i)) != null) {
                            SetResponse setResponse3 = new SetResponse(6);
                            setResponse3.addRRset(oneRRset);
                            return setResponse3;
                        }
                    }
                }
                return SetResponse.ofType(1);
            }
        }
    }

    private final void maybeAddRecord(Record record) throws IOException {
        int type = record.getType();
        Name name = record.getName();
        if (type == 6 && !name.equals(this.origin)) {
            throw new IOException("SOA owner " + name + " does not match zone origin " + this.origin);
        } else if (name.subdomain(this.origin)) {
            addRecord(record);
        }
    }

    private void nodeToString(StringBuffer stringBuffer, Object obj) {
        RRset[] allRRsets;
        for (RRset rRset : allRRsets(obj)) {
            Iterator rrs = rRset.rrs();
            while (rrs.hasNext()) {
                stringBuffer.append(rrs.next() + "\n");
            }
            Iterator sigs = rRset.sigs();
            while (sigs.hasNext()) {
                stringBuffer.append(sigs.next() + "\n");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized RRset oneRRset(Object obj, int i) {
        if (i != 255) {
            if (obj instanceof List) {
                List list = (List) obj;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    RRset rRset = (RRset) list.get(i2);
                    if (rRset.getType() == i) {
                        return rRset;
                    }
                }
            } else {
                RRset rRset2 = (RRset) obj;
                if (rRset2.getType() == i) {
                    return rRset2;
                }
            }
            return null;
        }
        throw new IllegalArgumentException("oneRRset(ANY)");
    }

    private synchronized void removeRRset(Name name, int i) {
        Object obj = this.data.get(name);
        if (obj == null) {
            return;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (((RRset) list.get(i2)).getType() == i) {
                    list.remove(i2);
                    if (list.size() == 0) {
                        this.data.remove(name);
                    }
                    return;
                }
            }
        } else if (((RRset) obj).getType() == i) {
            this.data.remove(name);
        }
    }

    private void validate() throws IOException {
        Object exactName = exactName(this.origin);
        this.originNode = exactName;
        if (exactName != null) {
            RRset oneRRset = oneRRset(exactName, 6);
            if (oneRRset != null && oneRRset.size() == 1) {
                this.SOA = (SOARecord) oneRRset.rrs().next();
                RRset oneRRset2 = oneRRset(this.originNode, 2);
                this.NS = oneRRset2;
                if (oneRRset2 != null) {
                    return;
                }
                throw new IOException(this.origin + ": no NS set specified");
            }
            throw new IOException(this.origin + ": exactly 1 SOA must be specified");
        }
        throw new IOException(this.origin + ": no data specified");
    }

    public Iterator AXFR() {
        return new ZoneIterator(true);
    }

    public void addRecord(Record record) {
        Name name = record.getName();
        int rRsetType = record.getRRsetType();
        synchronized (this) {
            RRset findRRset = findRRset(name, rRsetType);
            if (findRRset == null) {
                addRRset(name, new RRset(record));
            } else {
                findRRset.addRR(record);
            }
        }
    }

    public RRset findExactMatch(Name name, int i) {
        Object exactName = exactName(name);
        if (exactName == null) {
            return null;
        }
        return oneRRset(exactName, i);
    }

    public SetResponse findRecords(Name name, int i) {
        return lookup(name, i);
    }

    public int getDClass() {
        return this.dclass;
    }

    public RRset getNS() {
        return this.NS;
    }

    public Name getOrigin() {
        return this.origin;
    }

    public SOARecord getSOA() {
        return this.SOA;
    }

    public Iterator iterator() {
        return new ZoneIterator(false);
    }

    public void removeRecord(Record record) {
        Name name = record.getName();
        int rRsetType = record.getRRsetType();
        synchronized (this) {
            RRset findRRset = findRRset(name, rRsetType);
            if (findRRset == null) {
                return;
            }
            if (findRRset.size() == 1 && findRRset.first().equals(record)) {
                removeRRset(name, rRsetType);
            } else {
                findRRset.deleteRR(record);
            }
        }
    }

    public synchronized String toMasterFile() {
        StringBuffer stringBuffer;
        stringBuffer = new StringBuffer();
        nodeToString(stringBuffer, this.originNode);
        for (Map.Entry entry : this.data.entrySet()) {
            if (!this.origin.equals(entry.getKey())) {
                nodeToString(stringBuffer, entry.getValue());
            }
        }
        return stringBuffer.toString();
    }

    public String toString() {
        return toMasterFile();
    }

    public Zone(Name name, Record[] recordArr) throws IOException {
        this.dclass = 1;
        this.data = new TreeMap();
        if (name != null) {
            this.origin = name;
            for (Record record : recordArr) {
                maybeAddRecord(record);
            }
            validate();
            return;
        }
        throw new IllegalArgumentException("no zone name specified");
    }

    public Zone(ZoneTransferIn zoneTransferIn) throws IOException, ZoneTransferException {
        this.dclass = 1;
        fromXFR(zoneTransferIn);
    }

    public Zone(Name name, int i, String str) throws IOException, ZoneTransferException {
        this.dclass = 1;
        ZoneTransferIn newAXFR = ZoneTransferIn.newAXFR(name, str, (TSIG) null);
        newAXFR.setDClass(i);
        fromXFR(newAXFR);
    }

    public void addRRset(RRset rRset) {
        addRRset(rRset.getName(), rRset);
    }
}