package com.squareup.moshi;

import com.p7700g.p99005.wo1;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class AdapterMethodsFactory implements JsonAdapter.Factory {
    private final List<AdapterMethod> fromAdapters;
    private final List<AdapterMethod> toAdapters;

    public AdapterMethodsFactory(List<AdapterMethod> list, List<AdapterMethod> list2) {
        this.toAdapters = list;
        this.fromAdapters = list2;
    }

    public static AdapterMethod fromAdapter(Object obj, Method method) {
        method.setAccessible(true);
        final Type genericReturnType = method.getGenericReturnType();
        final Set<? extends Annotation> jsonAnnotations = Util.jsonAnnotations(method);
        final Type[] genericParameterTypes = method.getGenericParameterTypes();
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        if (genericParameterTypes.length >= 1 && genericParameterTypes[0] == JsonReader.class && genericReturnType != Void.TYPE && parametersAreJsonAdapters(1, genericParameterTypes)) {
            return new AdapterMethod(genericReturnType, jsonAnnotations, obj, method, genericParameterTypes.length, 1, true) { // from class: com.squareup.moshi.AdapterMethodsFactory.4
                @Override // com.squareup.moshi.AdapterMethodsFactory.AdapterMethod
                public Object fromJson(Moshi moshi, JsonReader jsonReader) throws IOException, InvocationTargetException {
                    return invoke(jsonReader);
                }
            };
        }
        if (genericParameterTypes.length == 1 && genericReturnType != Void.TYPE) {
            final Set<? extends Annotation> jsonAnnotations2 = Util.jsonAnnotations(parameterAnnotations[0]);
            return new AdapterMethod(genericReturnType, jsonAnnotations, obj, method, genericParameterTypes.length, 1, Util.hasNullable(parameterAnnotations[0])) { // from class: com.squareup.moshi.AdapterMethodsFactory.5
                public JsonAdapter<Object> delegate;

                @Override // com.squareup.moshi.AdapterMethodsFactory.AdapterMethod
                public void bind(Moshi moshi, JsonAdapter.Factory factory) {
                    JsonAdapter<Object> adapter;
                    super.bind(moshi, factory);
                    if (Types.equals(genericParameterTypes[0], genericReturnType) && jsonAnnotations2.equals(jsonAnnotations)) {
                        adapter = moshi.nextAdapter(factory, genericParameterTypes[0], jsonAnnotations2);
                    } else {
                        adapter = moshi.adapter(genericParameterTypes[0], jsonAnnotations2);
                    }
                    this.delegate = adapter;
                }

                @Override // com.squareup.moshi.AdapterMethodsFactory.AdapterMethod
                public Object fromJson(Moshi moshi, JsonReader jsonReader) throws IOException, InvocationTargetException {
                    return invoke(this.delegate.fromJson(jsonReader));
                }
            };
        }
        throw new IllegalArgumentException("Unexpected signature for " + method + ".\n@FromJson method signatures may have one of the following structures:\n    <any access modifier> R fromJson(JsonReader jsonReader) throws <any>;\n    <any access modifier> R fromJson(JsonReader jsonReader, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R fromJson(T value) throws <any>;\n");
    }

    public static AdapterMethodsFactory get(Object obj) {
        Method[] declaredMethods;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Class<?> cls = obj.getClass(); cls != Object.class; cls = cls.getSuperclass()) {
            for (Method method : cls.getDeclaredMethods()) {
                if (method.isAnnotationPresent(ToJson.class)) {
                    AdapterMethod adapter = toAdapter(obj, method);
                    AdapterMethod adapterMethod = get(arrayList, adapter.type, adapter.annotations);
                    if (adapterMethod == null) {
                        arrayList.add(adapter);
                    } else {
                        StringBuilder G = wo1.G("Conflicting @ToJson methods:\n    ");
                        G.append(adapterMethod.method);
                        G.append("\n    ");
                        G.append(adapter.method);
                        throw new IllegalArgumentException(G.toString());
                    }
                }
                if (method.isAnnotationPresent(FromJson.class)) {
                    AdapterMethod fromAdapter = fromAdapter(obj, method);
                    AdapterMethod adapterMethod2 = get(arrayList2, fromAdapter.type, fromAdapter.annotations);
                    if (adapterMethod2 == null) {
                        arrayList2.add(fromAdapter);
                    } else {
                        StringBuilder G2 = wo1.G("Conflicting @FromJson methods:\n    ");
                        G2.append(adapterMethod2.method);
                        G2.append("\n    ");
                        G2.append(fromAdapter.method);
                        throw new IllegalArgumentException(G2.toString());
                    }
                }
            }
        }
        if (arrayList.isEmpty() && arrayList2.isEmpty()) {
            StringBuilder G3 = wo1.G("Expected at least one @ToJson or @FromJson method on ");
            G3.append(obj.getClass().getName());
            throw new IllegalArgumentException(G3.toString());
        }
        return new AdapterMethodsFactory(arrayList, arrayList2);
    }

    private static boolean parametersAreJsonAdapters(int i, Type[] typeArr) {
        int length = typeArr.length;
        while (i < length) {
            if (!(typeArr[i] instanceof ParameterizedType) || ((ParameterizedType) typeArr[i]).getRawType() != JsonAdapter.class) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static AdapterMethod toAdapter(Object obj, Method method) {
        method.setAccessible(true);
        final Type genericReturnType = method.getGenericReturnType();
        final Type[] genericParameterTypes = method.getGenericParameterTypes();
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        if (genericParameterTypes.length >= 2 && genericParameterTypes[0] == JsonWriter.class && genericReturnType == Void.TYPE && parametersAreJsonAdapters(2, genericParameterTypes)) {
            return new AdapterMethod(genericParameterTypes[1], Util.jsonAnnotations(parameterAnnotations[1]), obj, method, genericParameterTypes.length, 2, true) { // from class: com.squareup.moshi.AdapterMethodsFactory.2
                @Override // com.squareup.moshi.AdapterMethodsFactory.AdapterMethod
                public void toJson(Moshi moshi, JsonWriter jsonWriter, @Nullable Object obj2) throws IOException, InvocationTargetException {
                    invoke(jsonWriter, obj2);
                }
            };
        } else if (genericParameterTypes.length == 1 && genericReturnType != Void.TYPE) {
            final Set<? extends Annotation> jsonAnnotations = Util.jsonAnnotations(method);
            final Set<? extends Annotation> jsonAnnotations2 = Util.jsonAnnotations(parameterAnnotations[0]);
            return new AdapterMethod(genericParameterTypes[0], jsonAnnotations2, obj, method, genericParameterTypes.length, 1, Util.hasNullable(parameterAnnotations[0])) { // from class: com.squareup.moshi.AdapterMethodsFactory.3
                private JsonAdapter<Object> delegate;

                @Override // com.squareup.moshi.AdapterMethodsFactory.AdapterMethod
                public void bind(Moshi moshi, JsonAdapter.Factory factory) {
                    JsonAdapter<Object> adapter;
                    super.bind(moshi, factory);
                    if (Types.equals(genericParameterTypes[0], genericReturnType) && jsonAnnotations2.equals(jsonAnnotations)) {
                        adapter = moshi.nextAdapter(factory, genericReturnType, jsonAnnotations);
                    } else {
                        adapter = moshi.adapter(genericReturnType, jsonAnnotations);
                    }
                    this.delegate = adapter;
                }

                @Override // com.squareup.moshi.AdapterMethodsFactory.AdapterMethod
                public void toJson(Moshi moshi, JsonWriter jsonWriter, @Nullable Object obj2) throws IOException, InvocationTargetException {
                    this.delegate.toJson(jsonWriter, (JsonWriter) invoke(obj2));
                }
            };
        } else {
            throw new IllegalArgumentException("Unexpected signature for " + method + ".\n@ToJson method signatures may have one of the following structures:\n    <any access modifier> void toJson(JsonWriter writer, T value) throws <any>;\n    <any access modifier> void toJson(JsonWriter writer, T value, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R toJson(T value) throws <any>;\n");
        }
    }

    @Override // com.squareup.moshi.JsonAdapter.Factory
    @Nullable
    public JsonAdapter<?> create(final Type type, final Set<? extends Annotation> set, final Moshi moshi) {
        final AdapterMethod adapterMethod = get(this.toAdapters, type, set);
        final AdapterMethod adapterMethod2 = get(this.fromAdapters, type, set);
        JsonAdapter jsonAdapter = null;
        if (adapterMethod == null && adapterMethod2 == null) {
            return null;
        }
        if (adapterMethod == null || adapterMethod2 == null) {
            try {
                jsonAdapter = moshi.nextAdapter(this, type, set);
            } catch (IllegalArgumentException e) {
                StringBuilder M = wo1.M("No ", adapterMethod == null ? "@ToJson" : "@FromJson", " adapter for ");
                M.append(Util.typeAnnotatedWithAnnotations(type, set));
                throw new IllegalArgumentException(M.toString(), e);
            }
        }
        final JsonAdapter jsonAdapter2 = jsonAdapter;
        if (adapterMethod != null) {
            adapterMethod.bind(moshi, this);
        }
        if (adapterMethod2 != null) {
            adapterMethod2.bind(moshi, this);
        }
        return new JsonAdapter<Object>() { // from class: com.squareup.moshi.AdapterMethodsFactory.1
            @Override // com.squareup.moshi.JsonAdapter
            @Nullable
            public Object fromJson(JsonReader jsonReader) throws IOException {
                AdapterMethod adapterMethod3 = adapterMethod2;
                if (adapterMethod3 == null) {
                    return jsonAdapter2.fromJson(jsonReader);
                }
                if (!adapterMethod3.nullable && jsonReader.peek() == JsonReader.Token.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return adapterMethod2.fromJson(moshi, jsonReader);
                } catch (InvocationTargetException e2) {
                    Throwable cause = e2.getCause();
                    if (cause instanceof IOException) {
                        throw ((IOException) cause);
                    }
                    throw new JsonDataException(cause + " at " + jsonReader.getPath(), cause);
                }
            }

            @Override // com.squareup.moshi.JsonAdapter
            public void toJson(JsonWriter jsonWriter, @Nullable Object obj) throws IOException {
                AdapterMethod adapterMethod3 = adapterMethod;
                if (adapterMethod3 == null) {
                    jsonAdapter2.toJson(jsonWriter, (JsonWriter) obj);
                } else if (!adapterMethod3.nullable && obj == null) {
                    jsonWriter.nullValue();
                } else {
                    try {
                        adapterMethod3.toJson(moshi, jsonWriter, obj);
                    } catch (InvocationTargetException e2) {
                        Throwable cause = e2.getCause();
                        if (cause instanceof IOException) {
                            throw ((IOException) cause);
                        }
                        throw new JsonDataException(cause + " at " + jsonWriter.getPath(), cause);
                    }
                }
            }

            public String toString() {
                StringBuilder G = wo1.G("JsonAdapter");
                G.append(set);
                G.append("(");
                G.append(type);
                G.append(")");
                return G.toString();
            }
        };
    }

    /* loaded from: classes3.dex */
    public static abstract class AdapterMethod {
        public final Object adapter;
        public final int adaptersOffset;
        public final Set<? extends Annotation> annotations;
        public final JsonAdapter<?>[] jsonAdapters;
        public final Method method;
        public final boolean nullable;
        public final Type type;

        public AdapterMethod(Type type, Set<? extends Annotation> set, Object obj, Method method, int i, int i2, boolean z) {
            this.type = Util.canonicalize(type);
            this.annotations = set;
            this.adapter = obj;
            this.method = method;
            this.adaptersOffset = i2;
            this.jsonAdapters = new JsonAdapter[i - i2];
            this.nullable = z;
        }

        public void bind(Moshi moshi, JsonAdapter.Factory factory) {
            JsonAdapter<?> adapter;
            if (this.jsonAdapters.length > 0) {
                Type[] genericParameterTypes = this.method.getGenericParameterTypes();
                Annotation[][] parameterAnnotations = this.method.getParameterAnnotations();
                int length = genericParameterTypes.length;
                for (int i = this.adaptersOffset; i < length; i++) {
                    Type type = ((ParameterizedType) genericParameterTypes[i]).getActualTypeArguments()[0];
                    Set<? extends Annotation> jsonAnnotations = Util.jsonAnnotations(parameterAnnotations[i]);
                    JsonAdapter<?>[] jsonAdapterArr = this.jsonAdapters;
                    int i2 = i - this.adaptersOffset;
                    if (Types.equals(this.type, type) && this.annotations.equals(jsonAnnotations)) {
                        adapter = moshi.nextAdapter(factory, type, jsonAnnotations);
                    } else {
                        adapter = moshi.adapter(type, jsonAnnotations);
                    }
                    jsonAdapterArr[i2] = adapter;
                }
            }
        }

        @Nullable
        public Object fromJson(Moshi moshi, JsonReader jsonReader) throws IOException, InvocationTargetException {
            throw new AssertionError();
        }

        @Nullable
        public Object invoke(@Nullable Object obj) throws InvocationTargetException {
            JsonAdapter<?>[] jsonAdapterArr = this.jsonAdapters;
            Object[] objArr = new Object[jsonAdapterArr.length + 1];
            objArr[0] = obj;
            System.arraycopy(jsonAdapterArr, 0, objArr, 1, jsonAdapterArr.length);
            try {
                return this.method.invoke(this.adapter, objArr);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }

        public void toJson(Moshi moshi, JsonWriter jsonWriter, @Nullable Object obj) throws IOException, InvocationTargetException {
            throw new AssertionError();
        }

        public Object invoke(@Nullable Object obj, @Nullable Object obj2) throws InvocationTargetException {
            JsonAdapter<?>[] jsonAdapterArr = this.jsonAdapters;
            Object[] objArr = new Object[jsonAdapterArr.length + 2];
            objArr[0] = obj;
            objArr[1] = obj2;
            System.arraycopy(jsonAdapterArr, 0, objArr, 2, jsonAdapterArr.length);
            try {
                return this.method.invoke(this.adapter, objArr);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }
    }

    @Nullable
    private static AdapterMethod get(List<AdapterMethod> list, Type type, Set<? extends Annotation> set) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AdapterMethod adapterMethod = list.get(i);
            if (Types.equals(adapterMethod.type, type) && adapterMethod.annotations.equals(set)) {
                return adapterMethod;
            }
        }
        return null;
    }
}