package com.e.robospiceextension.command;

import com.e.robospiceextension.SpiceManager;
import com.e.robospiceextension.SpiceService;

public class RemoveAllDataFromCacheCommand extends SpiceManager.SpiceManagerCommand<Void> {

    public RemoveAllDataFromCacheCommand(SpiceManager spiceManager) {
        super(spiceManager);
    }

    @Override
    protected Void executeWhenBound(SpiceService spiceService) {
        spiceService.removeAllDataFromCache();
        return null;
    }
}
