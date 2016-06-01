package org.brasslock.template.common;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class StubUnitTest {
    @Test
    public void testStubIsCreated() throws Exception {
        final Stub stub = new Stub();
        assertThat(stub.getValue()).isEqualTo(7);
    }
}
