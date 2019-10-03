package com.e.robospiceextension.command;

import com.e.robospiceextension.SpiceManager;
import com.e.robospiceextension.SpiceManager.SpiceManagerCommand;
import com.e.robospiceextension.SpiceService;

public class SetFailOnCacheErrorCommand extends SpiceManagerCommand<Void> {
    private final boolean failOnCacheError;

    public SetFailOnCacheErrorCommand(SpiceManager spiceManager, boolean failOnCacheError) {
        super(spiceManager);
        this.failOnCacheError = failOnCacheError;
    }

    @Override
    protected Void executeWhenBound(SpiceService spiceService) {
        spiceService.setFailOnCacheError(failOnCacheError);
        return null;
    }
}
