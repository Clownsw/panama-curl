// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE {

    void apply(java.lang.foreign.MemoryAddress pPluginContext, java.lang.foreign.MemoryAddress pbData);
    static MemorySegment allocate(PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE.class, fi, constants$869.PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE$FUNC, session);
    }
    static PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _pPluginContext, java.lang.foreign.MemoryAddress _pbData) -> {
            try {
                constants$870.PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_pPluginContext, (java.lang.foreign.Addressable)_pbData);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


