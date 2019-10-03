package com.e.robospiceextension.command;

import java.util.List;

import com.e.robospiceextension.SpiceManager;
import com.e.robospiceextension.SpiceService;
import com.e.robospiceextension.persistence.exception.CacheCreationException;
import com.e.robospiceextension.persistence.exception.CacheLoadingException;

public class GetAllCacheKeysCommand extends SpiceManager.SpiceManagerCommand<List<Object>> {
    private Class<?> clazz;

    public GetAllCacheKeysCommand(SpiceManager spiceManager, Class<?> clazz) {
        super(spiceManager);
        this.clazz = clazz;
    }

    @Override
    protected List<Object> executeWhenBound(SpiceService spiceService) throws CacheLoadingException, CacheCreationException {
        return spiceService.getAllCacheKeys(clazz);
    }
}
