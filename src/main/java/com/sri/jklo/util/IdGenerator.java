package com.sri.jklo.util;

import java.util.UUID;

/**
 * Created by jklo on 10/15/16.
 */
public final class IdGenerator {
    public static String createId() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }
}
