package com.e.robospiceextension.command;

import java.util.Date;

import com.e.robospiceextension.SpiceManager;
import com.e.robospiceextension.SpiceService;
import com.e.robospiceextension.persistence.exception.CacheCreationException;
import com.e.robospiceextension.persistence.exception.CacheLoadingException;

public class GetDateOfDataInCacheCommand extends SpiceManager.SpiceManagerCommand<Date> {
    private Class<?> clazz;
    private Object cacheKey;

    public GetDateOfDataInCacheCommand(SpiceManager spiceManager, Class<?> clazz, Object cacheKey) {
        super(spiceManager);
        this.clazz = clazz;
        this.cacheKey = cacheKey;
    }

    @Override
    protected Date executeWhenBound(SpiceService spiceService) throws CacheCreationException {
        try {
            return spiceService.getDateOfDataInCache(clazz, cacheKey);
        } catch (CacheLoadingException ex) {
            return null;
        }
    }
}
