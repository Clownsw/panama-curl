// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFN_CERT_STORE_PROV_READ_CTL {

    int apply(java.lang.foreign.MemoryAddress hStoreProv, java.lang.foreign.MemoryAddress pStoreCtlContext, int dwFlags, java.lang.foreign.MemoryAddress ppProvCtlContext);
    static MemorySegment allocate(PFN_CERT_STORE_PROV_READ_CTL fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFN_CERT_STORE_PROV_READ_CTL.class, fi, constants$824.PFN_CERT_STORE_PROV_READ_CTL$FUNC, session);
    }
    static PFN_CERT_STORE_PROV_READ_CTL ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _hStoreProv, java.lang.foreign.MemoryAddress _pStoreCtlContext, int _dwFlags, java.lang.foreign.MemoryAddress _ppProvCtlContext) -> {
            try {
                return (int)constants$825.PFN_CERT_STORE_PROV_READ_CTL$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_hStoreProv, (java.lang.foreign.Addressable)_pStoreCtlContext, _dwFlags, (java.lang.foreign.Addressable)_ppProvCtlContext);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


