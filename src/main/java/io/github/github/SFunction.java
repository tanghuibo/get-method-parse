package io.github.github;

import java.io.Serializable;
import java.util.function.Function;

/**
 * SFunction
 *
 * @author tanghuibo
 * @date 2021/12/25 17:35
 */
public interface SFunction<T, R> extends Function<T, R>, Serializable {

}