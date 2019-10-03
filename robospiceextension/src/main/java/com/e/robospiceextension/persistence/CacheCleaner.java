package com.e.robospiceextension.persistence;

/**
 * Defines the behavior of an entity that can wipe a part or all the cache.
 * @author SNI
 */
public interface CacheCleaner {

    void removeAllDataFromCache();
}
