// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFN_CERT_ENUM_SYSTEM_STORE {

    int apply(java.lang.foreign.MemoryAddress pvSystemStore, int dwFlags, java.lang.foreign.MemoryAddress pStoreInfo, java.lang.foreign.MemoryAddress pvReserved, java.lang.foreign.MemoryAddress pvArg);
    static MemorySegment allocate(PFN_CERT_ENUM_SYSTEM_STORE fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFN_CERT_ENUM_SYSTEM_STORE.class, fi, constants$840.PFN_CERT_ENUM_SYSTEM_STORE$FUNC, session);
    }
    static PFN_CERT_ENUM_SYSTEM_STORE ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _pvSystemStore, int _dwFlags, java.lang.foreign.MemoryAddress _pStoreInfo, java.lang.foreign.MemoryAddress _pvReserved, java.lang.foreign.MemoryAddress _pvArg) -> {
            try {
                return (int)constants$840.PFN_CERT_ENUM_SYSTEM_STORE$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_pvSystemStore, _dwFlags, (java.lang.foreign.Addressable)_pStoreInfo, (java.lang.foreign.Addressable)_pvReserved, (java.lang.foreign.Addressable)_pvArg);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


