package com.squareup.moshi;

import com.p7700g.p99005.wo1;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class ClassJsonAdapter<T> extends JsonAdapter<T> {
    public static final JsonAdapter.Factory FACTORY = new JsonAdapter.Factory() { // from class: com.squareup.moshi.ClassJsonAdapter.1
        private void createFieldBindings(Moshi moshi, Type type, Map<String, FieldBinding<?>> map) {
            Field[] declaredFields;
            Class<?> rawType = Types.getRawType(type);
            boolean isPlatformType = Util.isPlatformType(rawType);
            for (Field field : rawType.getDeclaredFields()) {
                if (includeField(isPlatformType, field.getModifiers())) {
                    Type resolve = Util.resolve(type, rawType, field.getGenericType());
                    Set<? extends Annotation> jsonAnnotations = Util.jsonAnnotations(field);
                    String name = field.getName();
                    JsonAdapter<T> adapter = moshi.adapter(resolve, jsonAnnotations, name);
                    field.setAccessible(true);
                    Json json = (Json) field.getAnnotation(Json.class);
                    if (json != null) {
                        name = json.name();
                    }
                    FieldBinding<?> fieldBinding = new FieldBinding<>(name, field, adapter);
                    FieldBinding<?> put = map.put(name, fieldBinding);
                    if (put != null) {
                        StringBuilder G = wo1.G("Conflicting fields:\n    ");
                        G.append(put.field);
                        G.append("\n    ");
                        G.append(fieldBinding.field);
                        throw new IllegalArgumentException(G.toString());
                    }
                }
            }
        }

        private boolean includeField(boolean z, int i) {
            if (Modifier.isStatic(i) || Modifier.isTransient(i)) {
                return false;
            }
            return Modifier.isPublic(i) || Modifier.isProtected(i) || !z;
        }

        private void throwIfIsCollectionClass(Type type, Class<?> cls) {
            Class<?> rawType = Types.getRawType(type);
            if (cls.isAssignableFrom(rawType)) {
                throw new IllegalArgumentException("No JsonAdapter for " + type + ", you should probably use " + cls.getSimpleName() + " instead of " + rawType.getSimpleName() + " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
            }
        }

        @Override // com.squareup.moshi.JsonAdapter.Factory
        @Nullable
        public JsonAdapter<?> create(Type type, Set<? extends Annotation> set, Moshi moshi) {
            if ((type instanceof Class) || (type instanceof ParameterizedType)) {
                Class<?> rawType = Types.getRawType(type);
                if (rawType.isInterface() || rawType.isEnum() || !set.isEmpty()) {
                    return null;
                }
                if (Util.isPlatformType(rawType)) {
                    throwIfIsCollectionClass(type, List.class);
                    throwIfIsCollectionClass(type, Set.class);
                    throwIfIsCollectionClass(type, Map.class);
                    throwIfIsCollectionClass(type, Collection.class);
                    String str = "Platform " + rawType;
                    if (type instanceof ParameterizedType) {
                        str = str + " in " + type;
                    }
                    throw new IllegalArgumentException(wo1.t(str, " requires explicit JsonAdapter to be registered"));
                } else if (!rawType.isAnonymousClass()) {
                    if (!rawType.isLocalClass()) {
                        if (rawType.getEnclosingClass() != null && !Modifier.isStatic(rawType.getModifiers())) {
                            StringBuilder G = wo1.G("Cannot serialize non-static nested class ");
                            G.append(rawType.getName());
                            throw new IllegalArgumentException(G.toString());
                        } else if (!Modifier.isAbstract(rawType.getModifiers())) {
                            if (!Util.isKotlin(rawType)) {
                                ClassFactory classFactory = ClassFactory.get(rawType);
                                TreeMap treeMap = new TreeMap();
                                while (type != Object.class) {
                                    createFieldBindings(moshi, type, treeMap);
                                    type = Types.getGenericSuperclass(type);
                                }
                                return (JsonAdapter<T>) new ClassJsonAdapter(classFactory, treeMap).nullSafe();
                            }
                            StringBuilder G2 = wo1.G("Cannot serialize Kotlin type ");
                            G2.append(rawType.getName());
                            G2.append(". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
                            throw new IllegalArgumentException(G2.toString());
                        } else {
                            StringBuilder G3 = wo1.G("Cannot serialize abstract class ");
                            G3.append(rawType.getName());
                            throw new IllegalArgumentException(G3.toString());
                        }
                    }
                    StringBuilder G4 = wo1.G("Cannot serialize local class ");
                    G4.append(rawType.getName());
                    throw new IllegalArgumentException(G4.toString());
                } else {
                    StringBuilder G5 = wo1.G("Cannot serialize anonymous class ");
                    G5.append(rawType.getName());
                    throw new IllegalArgumentException(G5.toString());
                }
            }
            return null;
        }
    };
    private final ClassFactory<T> classFactory;
    private final FieldBinding<?>[] fieldsArray;
    private final JsonReader.Options options;

    /* loaded from: classes3.dex */
    public static class FieldBinding<T> {
        public final JsonAdapter<T> adapter;
        public final Field field;
        public final String name;

        public FieldBinding(String str, Field field, JsonAdapter<T> jsonAdapter) {
            this.name = str;
            this.field = field;
            this.adapter = jsonAdapter;
        }

        public void read(JsonReader jsonReader, Object obj) throws IOException, IllegalAccessException {
            this.field.set(obj, this.adapter.fromJson(jsonReader));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void write(JsonWriter jsonWriter, Object obj) throws IllegalAccessException, IOException {
            this.adapter.toJson(jsonWriter, (JsonWriter) this.field.get(obj));
        }
    }

    public ClassJsonAdapter(ClassFactory<T> classFactory, Map<String, FieldBinding<?>> map) {
        this.classFactory = classFactory;
        this.fieldsArray = (FieldBinding[]) map.values().toArray(new FieldBinding[map.size()]);
        this.options = JsonReader.Options.of((String[]) map.keySet().toArray(new String[map.size()]));
    }

    @Override // com.squareup.moshi.JsonAdapter
    public T fromJson(JsonReader jsonReader) throws IOException {
        try {
            T newInstance = this.classFactory.newInstance();
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    int selectName = jsonReader.selectName(this.options);
                    if (selectName == -1) {
                        jsonReader.skipName();
                        jsonReader.skipValue();
                    } else {
                        this.fieldsArray[selectName].read(jsonReader, newInstance);
                    }
                }
                jsonReader.endObject();
                return newInstance;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw Util.rethrowCause(e2);
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, T t) throws IOException {
        FieldBinding<?>[] fieldBindingArr;
        try {
            jsonWriter.beginObject();
            for (FieldBinding<?> fieldBinding : this.fieldsArray) {
                jsonWriter.name(fieldBinding.name);
                fieldBinding.write(jsonWriter, t);
            }
            jsonWriter.endObject();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public String toString() {
        StringBuilder G = wo1.G("JsonAdapter(");
        G.append(this.classFactory);
        G.append(")");
        return G.toString();
    }
}