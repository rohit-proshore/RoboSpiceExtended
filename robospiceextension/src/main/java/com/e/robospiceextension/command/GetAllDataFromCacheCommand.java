package com.e.robospiceextension.command;

import java.util.List;

import com.e.robospiceextension.SpiceManager;
import com.e.robospiceextension.SpiceService;
import com.e.robospiceextension.persistence.exception.CacheCreationException;
import com.e.robospiceextension.persistence.exception.CacheLoadingException;

public class GetAllDataFromCacheCommand<T> extends SpiceManager.SpiceManagerCommand<List<T>> {
    private Class<T> clazz;

    public GetAllDataFromCacheCommand(SpiceManager spiceManager, Class<T> clazz) {
        super(spiceManager);
        this.clazz = clazz;
    }

    @Override
    protected List<T> executeWhenBound(SpiceService spiceService) throws CacheLoadingException, CacheCreationException {
        return spiceService.loadAllDataFromCache(clazz);
    }
}
