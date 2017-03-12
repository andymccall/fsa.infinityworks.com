package com.infinityworks.fsa.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * The FsaException class is a custom exception
 * that will report the cause and send an INTERNAL_SERVER_ERROR
 * back to the client
 *
 * @author Andy McCall
 * @version 0.2
 * @since 2017-03-11
 */
@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class FsaException extends RuntimeException {

    public FsaException(String message, Throwable throwable) {
        super(message, throwable);
    }

}
