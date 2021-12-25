package io.github.github;

/**
 * GetMethodParseException
 *
 * @author tanghuibo
 * @date 2021/12/25 18:06
 */
public class GetMethodParseException extends RuntimeException {

    public GetMethodParseException(String message) {
        super(message);
    }

    public GetMethodParseException(String message, Throwable cause) {
        super(message, cause);
    }

}
