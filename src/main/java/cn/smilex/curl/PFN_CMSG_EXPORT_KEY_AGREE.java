// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFN_CMSG_EXPORT_KEY_AGREE {

    int apply(java.lang.foreign.MemoryAddress pContentEncryptInfo, java.lang.foreign.MemoryAddress pKeyAgreeEncodeInfo, java.lang.foreign.MemoryAddress pKeyAgreeEncryptInfo, int dwFlags, java.lang.foreign.MemoryAddress pvReserved);
    static MemorySegment allocate(PFN_CMSG_EXPORT_KEY_AGREE fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFN_CMSG_EXPORT_KEY_AGREE.class, fi, constants$818.PFN_CMSG_EXPORT_KEY_AGREE$FUNC, session);
    }
    static PFN_CMSG_EXPORT_KEY_AGREE ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _pContentEncryptInfo, java.lang.foreign.MemoryAddress _pKeyAgreeEncodeInfo, java.lang.foreign.MemoryAddress _pKeyAgreeEncryptInfo, int _dwFlags, java.lang.foreign.MemoryAddress _pvReserved) -> {
            try {
                return (int)constants$818.PFN_CMSG_EXPORT_KEY_AGREE$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_pContentEncryptInfo, (java.lang.foreign.Addressable)_pKeyAgreeEncodeInfo, (java.lang.foreign.Addressable)_pKeyAgreeEncryptInfo, _dwFlags, (java.lang.foreign.Addressable)_pvReserved);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

