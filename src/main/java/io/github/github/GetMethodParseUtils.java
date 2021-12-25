package io.github.github;

import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

/**
 * LambdaResolveUtils
 *
 * @author tanghuibo
 * @date 2021/12/25 17:51
 */
public class GetMethodParseUtils {


    private static final Map<String, WeakReference<SerializedLambda>> FUNC_CACHE = new ConcurrentHashMap<>();

    public static String getFiledName(SFunction sFunction) {
        SerializedLambda lambda = GetMethodParseUtils.resolve(sFunction);
        return methodToProperty(lambda.getImplMethodName());
    }


    private static <T> SerializedLambda resolve(SFunction<T, ?> func) {
        Class<?> clazz = func.getClass();
        String canonicalName = clazz.getCanonicalName();
        return Optional.ofNullable(FUNC_CACHE.get(canonicalName))
                .map(WeakReference::get)
                .orElseGet(() -> {
                    SerializedLambda lambda = SerializedLambda.resolve(func);
                    FUNC_CACHE.put(canonicalName, new WeakReference<>(lambda));
                    return lambda;
                });
    }

    private static String methodToProperty(String name) {
        if (name.startsWith("is")) {
            name = name.substring(2);
        } else if (name.startsWith("get") || name.startsWith("set")) {
            name = name.substring(3);
        } else {
            throw new GetMethodParseException("Error parsing property name '" + name + "'.  Didn't start with 'is', 'get' or 'set'.");
        }

        if (name.length() == 1 || (name.length() > 1 && !Character.isUpperCase(name.charAt(1)))) {
            name = name.substring(0, 1).toLowerCase(Locale.ENGLISH) + name.substring(1);
        }

        return name;
    }
}
