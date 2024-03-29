package com.e.robospiceextension.request.listener;

import com.e.robospiceextension.persistence.exception.SpiceException;

/**
 * Interface used to deal with request result. Two cases : request failed or
 * succeed. Implement this interface to retrieve request result or to manage
 * error
 * @author jva
 * @param <RESULT>
 */
public interface RequestListener<RESULT> {

    void onRequestFailure(SpiceException spiceException);

    void onRequestSuccess(RESULT result);
}
