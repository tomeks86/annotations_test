package edu.tseidler;

import java.lang.reflect.Field;

public class ToStringGenerator {
    public static String toString(Object obj) {
        if (obj == null) return "null";
        Class<?> cl = obj.getClass();
        ToString ts = cl.getAnnotation(ToString.class);
        if (ts == null)
            return obj.toString();
        StringBuilder result = new StringBuilder();
        if (ts.includeName())
            result.append(cl.getSimpleName());
        result.append("[");
        boolean first = true;
        for (Field f : cl.getDeclaredFields()) {
            ts = f.getAnnotation(ToString.class);
            if (ts != null) {
                if (first)
                    first = false;
                else
                    result.append(",");
                f.setAccessible(true);

                if (ts.includeName()) {
                    result.append(f.getName());
                    result.append("=");
                }
                try {
                    result.append(ToStringGenerator.toString(f.get(obj)));
                } catch (ReflectiveOperationException e) {
                    e.printStackTrace();
                }
            }
        }
        result.append("]");
        return result.toString();
    }
}
