// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_GET {

    int apply(java.lang.foreign.MemoryAddress pPluginContext, java.lang.foreign.MemoryAddress pIdentifier, int dwNameType, java.lang.foreign.MemoryAddress pNameBlob, java.lang.foreign.MemoryAddress ppbContent, java.lang.foreign.MemoryAddress pcbContent, java.lang.foreign.MemoryAddress ppwszPassword, java.lang.foreign.MemoryAddress ppIdentifier);
    static MemorySegment allocate(PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_GET fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_GET.class, fi, constants$868.PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_GET$FUNC, session);
    }
    static PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_GET ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _pPluginContext, java.lang.foreign.MemoryAddress _pIdentifier, int _dwNameType, java.lang.foreign.MemoryAddress _pNameBlob, java.lang.foreign.MemoryAddress _ppbContent, java.lang.foreign.MemoryAddress _pcbContent, java.lang.foreign.MemoryAddress _ppwszPassword, java.lang.foreign.MemoryAddress _ppIdentifier) -> {
            try {
                return (int)constants$869.PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_GET$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_pPluginContext, (java.lang.foreign.Addressable)_pIdentifier, _dwNameType, (java.lang.foreign.Addressable)_pNameBlob, (java.lang.foreign.Addressable)_ppbContent, (java.lang.foreign.Addressable)_pcbContent, (java.lang.foreign.Addressable)_ppwszPassword, (java.lang.foreign.Addressable)_ppIdentifier);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


