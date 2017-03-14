package com.company;

/**
 * Created by Владислав on 14.03.2017.
 */
public class NullParamToMethodAddException extends Exception {
    public NullParamToMethodAddException(String mess, int num) {
        super(mess);
        System.out.println(mess + " " + num);
       // if (num ==0) throw new NullParamToMethodAddException("fold field", num);

    }

    public NullParamToMethodAddException(String message) {
        super(message);
    }

    public NullParamToMethodAddException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullParamToMethodAddException(Throwable cause) {
        super(cause);
    }

    public NullParamToMethodAddException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
