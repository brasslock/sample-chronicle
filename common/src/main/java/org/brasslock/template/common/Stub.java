package org.brasslock.template.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Stub {
    private static final Logger LOG = LoggerFactory.getLogger(Stub.class);

    public Stub() {
        LOG.info("Created");
    }

    public int getValue() {
        return 7;
    }

}
