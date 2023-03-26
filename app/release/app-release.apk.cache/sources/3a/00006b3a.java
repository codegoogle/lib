package org.xbill.DNS;

import com.p7700g.p99005.nd1;
import com.p7700g.p99005.wo1;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes4.dex */
public class Message implements Cloneable {
    public static final int MAXLENGTH = 65535;
    public static final int TSIG_FAILED = 4;
    public static final int TSIG_INTERMEDIATE = 2;
    public static final int TSIG_SIGNED = 3;
    public static final int TSIG_UNSIGNED = 0;
    public static final int TSIG_VERIFIED = 1;
    private Header header;
    private TSIGRecord querytsig;
    private List[] sections;
    public int sig0start;
    private int size;
    public int tsigState;
    private int tsigerror;
    private TSIG tsigkey;
    public int tsigstart;
    private static Record[] emptyRecordArray = new Record[0];
    private static RRset[] emptyRRsetArray = new RRset[0];

    private Message(Header header) {
        this.sections = new List[4];
        this.header = header;
    }

    public static Message newQuery(Record record) {
        Message message = new Message();
        message.header.setOpcode(0);
        message.header.setFlag(7);
        message.addRecord(record, 0);
        return message;
    }

    public static Message newUpdate(Name name) {
        return new Update(name);
    }

    private static boolean sameSet(Record record, Record record2) {
        return record.getRRsetType() == record2.getRRsetType() && record.getDClass() == record2.getDClass() && record.getName().equals(record2.getName());
    }

    private int sectionToWire(DNSOutput dNSOutput, int i, Compression compression, int i2) {
        int size = this.sections[i].size();
        int current = dNSOutput.current();
        Record record = null;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            Record record2 = (Record) this.sections[i].get(i5);
            if (i == 3 && (record2 instanceof OPTRecord)) {
                i3++;
            } else {
                if (record != null && !sameSet(record2, record)) {
                    current = dNSOutput.current();
                    i4 = i5;
                }
                record2.toWire(dNSOutput, i, compression);
                if (dNSOutput.current() > i2) {
                    dNSOutput.jump(current);
                    return (size - i4) + i3;
                }
                record = record2;
            }
        }
        return i3;
    }

    public void addRecord(Record record, int i) {
        List[] listArr = this.sections;
        if (listArr[i] == null) {
            listArr[i] = new LinkedList();
        }
        this.header.incCount(i);
        this.sections[i].add(record);
    }

    public Object clone() {
        Message message = new Message();
        int i = 0;
        while (true) {
            List[] listArr = this.sections;
            if (i < listArr.length) {
                if (listArr[i] != null) {
                    message.sections[i] = new LinkedList(this.sections[i]);
                }
                i++;
            } else {
                message.header = (Header) this.header.clone();
                message.size = this.size;
                return message;
            }
        }
    }

    public boolean findRRset(Name name, int i, int i2) {
        if (this.sections[i2] == null) {
            return false;
        }
        for (int i3 = 0; i3 < this.sections[i2].size(); i3++) {
            Record record = (Record) this.sections[i2].get(i3);
            if (record.getType() == i && name.equals(record.getName())) {
                return true;
            }
        }
        return false;
    }

    public boolean findRecord(Record record, int i) {
        List[] listArr = this.sections;
        return listArr[i] != null && listArr[i].contains(record);
    }

    public Header getHeader() {
        return this.header;
    }

    public OPTRecord getOPT() {
        Record[] sectionArray = getSectionArray(3);
        for (int i = 0; i < sectionArray.length; i++) {
            if (sectionArray[i] instanceof OPTRecord) {
                return (OPTRecord) sectionArray[i];
            }
        }
        return null;
    }

    public Record getQuestion() {
        List list = this.sections[0];
        if (list == null || list.size() == 0) {
            return null;
        }
        return (Record) list.get(0);
    }

    public int getRcode() {
        int rcode = this.header.getRcode();
        OPTRecord opt = getOPT();
        return opt != null ? rcode + (opt.getExtendedRcode() << 4) : rcode;
    }

    public Record[] getSectionArray(int i) {
        List[] listArr = this.sections;
        if (listArr[i] == null) {
            return emptyRecordArray;
        }
        List list = listArr[i];
        return (Record[]) list.toArray(new Record[list.size()]);
    }

    public RRset[] getSectionRRsets(int i) {
        if (this.sections[i] == null) {
            return emptyRRsetArray;
        }
        LinkedList linkedList = new LinkedList();
        Record[] sectionArray = getSectionArray(i);
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < sectionArray.length; i2++) {
            Name name = sectionArray[i2].getName();
            boolean z = true;
            if (hashSet.contains(name)) {
                int size = linkedList.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    RRset rRset = (RRset) linkedList.get(size);
                    if (rRset.getType() == sectionArray[i2].getRRsetType() && rRset.getDClass() == sectionArray[i2].getDClass() && rRset.getName().equals(name)) {
                        rRset.addRR(sectionArray[i2]);
                        z = false;
                        break;
                    }
                    size--;
                }
            }
            if (z) {
                linkedList.add(new RRset(sectionArray[i2]));
                hashSet.add(name);
            }
        }
        return (RRset[]) linkedList.toArray(new RRset[linkedList.size()]);
    }

    public TSIGRecord getTSIG() {
        int count = this.header.getCount(3);
        if (count == 0) {
            return null;
        }
        Record record = (Record) this.sections[3].get(count - 1);
        if (record.type != 250) {
            return null;
        }
        return (TSIGRecord) record;
    }

    public boolean isSigned() {
        int i = this.tsigState;
        return i == 3 || i == 1 || i == 4;
    }

    public boolean isVerified() {
        return this.tsigState == 1;
    }

    public int numBytes() {
        return this.size;
    }

    public void removeAllRecords(int i) {
        this.sections[i] = null;
        this.header.setCount(i, 0);
    }

    public boolean removeRecord(Record record, int i) {
        List[] listArr = this.sections;
        if (listArr[i] == null || !listArr[i].remove(record)) {
            return false;
        }
        this.header.decCount(i);
        return true;
    }

    public String sectionToString(int i) {
        Record[] sectionArray;
        if (i > 3) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (Record record : getSectionArray(i)) {
            if (i == 0) {
                StringBuilder G = wo1.G(";;\t");
                G.append(record.name);
                stringBuffer.append(G.toString());
                stringBuffer.append(", type = " + Type.string(record.type));
                stringBuffer.append(", class = " + DClass.string(record.dclass));
            } else {
                stringBuffer.append(record);
            }
            stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public void setTSIG(TSIG tsig, int i, TSIGRecord tSIGRecord) {
        this.tsigkey = tsig;
        this.tsigerror = i;
        this.querytsig = tSIGRecord;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (getOPT() != null) {
            stringBuffer.append(this.header.toStringWithRcode(getRcode()) + "\n");
        } else {
            stringBuffer.append(this.header + "\n");
        }
        if (isSigned()) {
            stringBuffer.append(";; TSIG ");
            if (isVerified()) {
                stringBuffer.append(nd1.e);
            } else {
                stringBuffer.append("invalid");
            }
            stringBuffer.append('\n');
        }
        for (int i = 0; i < 4; i++) {
            if (this.header.getOpcode() != 5) {
                StringBuilder G = wo1.G(";; ");
                G.append(Section.longString(i));
                G.append(":\n");
                stringBuffer.append(G.toString());
            } else {
                StringBuilder G2 = wo1.G(";; ");
                G2.append(Section.updString(i));
                G2.append(":\n");
                stringBuffer.append(G2.toString());
            }
            stringBuffer.append(sectionToString(i) + "\n");
        }
        StringBuilder G3 = wo1.G(";; Message size: ");
        G3.append(numBytes());
        G3.append(" bytes");
        stringBuffer.append(G3.toString());
        return stringBuffer.toString();
    }

    public void toWire(DNSOutput dNSOutput) {
        this.header.toWire(dNSOutput);
        Compression compression = new Compression();
        for (int i = 0; i < 4; i++) {
            if (this.sections[i] != null) {
                for (int i2 = 0; i2 < this.sections[i].size(); i2++) {
                    ((Record) this.sections[i].get(i2)).toWire(dNSOutput, i, compression);
                }
            }
        }
    }

    public boolean findRecord(Record record) {
        for (int i = 1; i <= 3; i++) {
            List[] listArr = this.sections;
            if (listArr[i] != null && listArr[i].contains(record)) {
                return true;
            }
        }
        return false;
    }

    public Message(int i) {
        this(new Header(i));
    }

    public Message() {
        this(new Header());
    }

    public boolean findRRset(Name name, int i) {
        return findRRset(name, i, 1) || findRRset(name, i, 2) || findRRset(name, i, 3);
    }

    public Message(DNSInput dNSInput) throws IOException {
        this(new Header(dNSInput));
        boolean z = this.header.getOpcode() == 5;
        boolean flag = this.header.getFlag(6);
        for (int i = 0; i < 4; i++) {
            try {
                int count = this.header.getCount(i);
                if (count > 0) {
                    this.sections[i] = new ArrayList(count);
                }
                for (int i2 = 0; i2 < count; i2++) {
                    int current = dNSInput.current();
                    Record fromWire = Record.fromWire(dNSInput, i, z);
                    this.sections[i].add(fromWire);
                    if (i == 3) {
                        if (fromWire.getType() == 250) {
                            this.tsigstart = current;
                        }
                        if (fromWire.getType() == 24 && ((SIGRecord) fromWire).getTypeCovered() == 0) {
                            this.sig0start = current;
                        }
                    }
                }
            } catch (WireParseException e) {
                if (!flag) {
                    throw e;
                }
            }
        }
        this.size = dNSInput.current();
    }

    private boolean toWire(DNSOutput dNSOutput, int i) {
        if (i < 12) {
            return false;
        }
        TSIG tsig = this.tsigkey;
        if (tsig != null) {
            i -= tsig.recordLength();
        }
        OPTRecord opt = getOPT();
        byte[] bArr = null;
        if (opt != null) {
            bArr = opt.toWire(3);
            i -= bArr.length;
        }
        int current = dNSOutput.current();
        this.header.toWire(dNSOutput);
        Compression compression = new Compression();
        int flagsByte = this.header.getFlagsByte();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= 4) {
                break;
            }
            if (this.sections[i2] != null) {
                int sectionToWire = sectionToWire(dNSOutput, i2, compression, i);
                if (sectionToWire != 0 && i2 != 3) {
                    flagsByte = Header.setFlag(flagsByte, 6, true);
                    int count = this.header.getCount(i2) - sectionToWire;
                    int i4 = current + 4;
                    dNSOutput.writeU16At(count, (i2 * 2) + i4);
                    for (int i5 = i2 + 1; i5 < 3; i5++) {
                        dNSOutput.writeU16At(0, (i5 * 2) + i4);
                    }
                } else if (i2 == 3) {
                    i3 = this.header.getCount(i2) - sectionToWire;
                }
            }
            i2++;
        }
        if (bArr != null) {
            dNSOutput.writeByteArray(bArr);
            i3++;
        }
        if (flagsByte != this.header.getFlagsByte()) {
            dNSOutput.writeU16At(flagsByte, current + 2);
        }
        if (i3 != this.header.getCount(3)) {
            dNSOutput.writeU16At(i3, current + 10);
        }
        TSIG tsig2 = this.tsigkey;
        if (tsig2 != null) {
            tsig2.generate(this, dNSOutput.toByteArray(), this.tsigerror, this.querytsig).toWire(dNSOutput, 3, compression);
            dNSOutput.writeU16At(i3 + 1, current + 10);
        }
        return true;
    }

    public Message(byte[] bArr) throws IOException {
        this(new DNSInput(bArr));
    }

    public Message(ByteBuffer byteBuffer) throws IOException {
        this(new DNSInput(byteBuffer));
    }

    public byte[] toWire() {
        DNSOutput dNSOutput = new DNSOutput();
        toWire(dNSOutput);
        this.size = dNSOutput.current();
        return dNSOutput.toByteArray();
    }

    public byte[] toWire(int i) {
        DNSOutput dNSOutput = new DNSOutput();
        toWire(dNSOutput, i);
        this.size = dNSOutput.current();
        return dNSOutput.toByteArray();
    }
}