package org.xbill.DNS;

import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class Update extends Message {
    private int dclass;
    private Name origin;

    public Update(Name name, int i) {
        if (name.isAbsolute()) {
            DClass.check(i);
            getHeader().setOpcode(5);
            addRecord(Record.newRecord(name, 6, 1), 0);
            this.origin = name;
            this.dclass = i;
            return;
        }
        throw new RelativeNameException(name);
    }

    private void newPrereq(Record record) {
        addRecord(record, 1);
    }

    private void newUpdate(Record record) {
        addRecord(record, 2);
    }

    public void absent(Name name) {
        newPrereq(Record.newRecord(name, 255, 254, 0L));
    }

    public void add(Name name, int i, long j, String str) throws IOException {
        newUpdate(Record.fromString(name, i, this.dclass, j, str, this.origin));
    }

    public void delete(Name name) {
        newUpdate(Record.newRecord(name, 255, 255, 0L));
    }

    public void present(Name name) {
        newPrereq(Record.newRecord(name, 255, 255, 0L));
    }

    public void replace(Name name, int i, long j, String str) throws IOException {
        delete(name, i);
        add(name, i, j, str);
    }

    public void absent(Name name, int i) {
        newPrereq(Record.newRecord(name, i, 254, 0L));
    }

    public void add(Name name, int i, long j, Tokenizer tokenizer) throws IOException {
        newUpdate(Record.fromString(name, i, this.dclass, j, tokenizer, this.origin));
    }

    public void delete(Name name, int i) {
        newUpdate(Record.newRecord(name, i, 255, 0L));
    }

    public void present(Name name, int i) {
        newPrereq(Record.newRecord(name, i, 255, 0L));
    }

    public void add(Record record) {
        newUpdate(record);
    }

    public void delete(Name name, int i, String str) throws IOException {
        newUpdate(Record.fromString(name, i, 254, 0L, str, this.origin));
    }

    public void present(Name name, int i, String str) throws IOException {
        newPrereq(Record.fromString(name, i, this.dclass, 0L, str, this.origin));
    }

    public void replace(Name name, int i, long j, Tokenizer tokenizer) throws IOException {
        delete(name, i);
        add(name, i, j, tokenizer);
    }

    public void add(Record[] recordArr) {
        for (Record record : recordArr) {
            add(record);
        }
    }

    public void delete(Name name, int i, Tokenizer tokenizer) throws IOException {
        newUpdate(Record.fromString(name, i, 254, 0L, tokenizer, this.origin));
    }

    public void present(Name name, int i, Tokenizer tokenizer) throws IOException {
        newPrereq(Record.fromString(name, i, this.dclass, 0L, tokenizer, this.origin));
    }

    public void delete(Record record) {
        newUpdate(record.withDClass(254, 0L));
    }

    public void present(Record record) {
        newPrereq(record);
    }

    public void replace(Record record) {
        delete(record.getName(), record.getType());
        add(record);
    }

    public void add(RRset rRset) {
        Iterator rrs = rRset.rrs();
        while (rrs.hasNext()) {
            add((Record) rrs.next());
        }
    }

    public void delete(Record[] recordArr) {
        for (Record record : recordArr) {
            delete(record);
        }
    }

    public void replace(Record[] recordArr) {
        for (Record record : recordArr) {
            replace(record);
        }
    }

    public void delete(RRset rRset) {
        Iterator rrs = rRset.rrs();
        while (rrs.hasNext()) {
            delete((Record) rrs.next());
        }
    }

    public void replace(RRset rRset) {
        delete(rRset.getName(), rRset.getType());
        Iterator rrs = rRset.rrs();
        while (rrs.hasNext()) {
            add((Record) rrs.next());
        }
    }

    public Update(Name name) {
        this(name, 1);
    }
}