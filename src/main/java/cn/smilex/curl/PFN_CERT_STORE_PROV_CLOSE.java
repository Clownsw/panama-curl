// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFN_CERT_STORE_PROV_CLOSE {

    void apply(java.lang.foreign.MemoryAddress hStoreProv, int dwFlags);
    static MemorySegment allocate(PFN_CERT_STORE_PROV_CLOSE fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFN_CERT_STORE_PROV_CLOSE.class, fi, constants$821.PFN_CERT_STORE_PROV_CLOSE$FUNC, session);
    }
    static PFN_CERT_STORE_PROV_CLOSE ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _hStoreProv, int _dwFlags) -> {
            try {
                constants$822.PFN_CERT_STORE_PROV_CLOSE$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_hStoreProv, _dwFlags);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


