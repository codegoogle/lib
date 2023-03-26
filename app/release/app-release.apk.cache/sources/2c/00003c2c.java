package com.p7700g.p99005;

import android.content.Context;
import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import com.p7700g.p99005.d50;

/* compiled from: Room.java */
/* loaded from: classes.dex */
public class c50 {
    public static final String a = "ROOM";
    public static final String b = "room_master_table";
    private static final String c = "_CursorConverter";

    @x1
    public static <T extends d50> d50.a<T> a(@x1 Context context, @x1 Class<T> cls, @x1 String str) {
        if (str != null && str.trim().length() != 0) {
            return new d50.a<>(context, cls, str);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
    }

    @x1
    public static <T, C> T b(Class<C> cls, String str) {
        String str2;
        String name = cls.getPackage().getName();
        String canonicalName = cls.getCanonicalName();
        if (!name.isEmpty()) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        String str3 = canonicalName.replace('.', n04.E) + str;
        try {
            if (name.isEmpty()) {
                str2 = str3;
            } else {
                str2 = name + CryptoConstants.ALIAS_SEPARATOR + str3;
            }
            return (T) Class.forName(str2).newInstance();
        } catch (ClassNotFoundException unused) {
            StringBuilder G = wo1.G("cannot find implementation for ");
            G.append(cls.getCanonicalName());
            G.append(". ");
            G.append(str3);
            G.append(" does not exist");
            throw new RuntimeException(G.toString());
        } catch (IllegalAccessException unused2) {
            StringBuilder G2 = wo1.G("Cannot access the constructor");
            G2.append(cls.getCanonicalName());
            throw new RuntimeException(G2.toString());
        } catch (InstantiationException unused3) {
            StringBuilder G3 = wo1.G("Failed to create an instance of ");
            G3.append(cls.getCanonicalName());
            throw new RuntimeException(G3.toString());
        }
    }

    @x1
    public static <T extends d50> d50.a<T> c(@x1 Context context, @x1 Class<T> cls) {
        return new d50.a<>(context, cls, null);
    }
}