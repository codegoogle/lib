package androidx.work;

import com.p7700g.p99005.kb0;
import com.p7700g.p99005.rb0;
import com.p7700g.p99005.x1;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class ArrayCreatingInputMerger extends rb0 {
    private Object c(Object array, Object obj) {
        int length = Array.getLength(array);
        Object newInstance = Array.newInstance(obj.getClass(), length + 1);
        System.arraycopy(array, 0, newInstance, 0, length);
        Array.set(newInstance, length, obj);
        return newInstance;
    }

    private Object d(Object array1, Object array2) {
        int length = Array.getLength(array1);
        int length2 = Array.getLength(array2);
        Object newInstance = Array.newInstance(array1.getClass().getComponentType(), length + length2);
        System.arraycopy(array1, 0, newInstance, 0, length);
        System.arraycopy(array2, 0, newInstance, length, length2);
        return newInstance;
    }

    private Object e(Object obj1, Object obj2) {
        Object newInstance = Array.newInstance(obj1.getClass(), 2);
        Array.set(newInstance, 0, obj1);
        Array.set(newInstance, 1, obj2);
        return newInstance;
    }

    private Object f(Object obj) {
        Object newInstance = Array.newInstance(obj.getClass(), 1);
        Array.set(newInstance, 0, obj);
        return newInstance;
    }

    @Override // com.p7700g.p99005.rb0
    @x1
    public kb0 b(@x1 List<kb0> inputs) {
        kb0.a aVar = new kb0.a();
        HashMap hashMap = new HashMap();
        for (kb0 kb0Var : inputs) {
            for (Map.Entry<String, Object> entry : kb0Var.x().entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                Class<?> cls = value.getClass();
                Object obj = hashMap.get(key);
                if (obj == null) {
                    if (!cls.isArray()) {
                        value = f(value);
                    }
                } else {
                    Class<?> cls2 = obj.getClass();
                    if (cls2.equals(cls)) {
                        if (cls2.isArray()) {
                            value = d(obj, value);
                        } else {
                            value = e(obj, value);
                        }
                    } else if (cls2.isArray() && cls2.getComponentType().equals(cls)) {
                        value = c(obj, value);
                    } else if (cls.isArray() && cls.getComponentType().equals(cls2)) {
                        value = c(value, obj);
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                hashMap.put(key, value);
            }
        }
        aVar.d(hashMap);
        return aVar.a();
    }
}