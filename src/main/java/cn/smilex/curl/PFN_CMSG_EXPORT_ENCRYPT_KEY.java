// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFN_CMSG_EXPORT_ENCRYPT_KEY {

    int apply(long hCryptProv, long hEncryptKey, java.lang.foreign.MemoryAddress pPublicKeyInfo, java.lang.foreign.MemoryAddress pbData, java.lang.foreign.MemoryAddress pcbData);
    static MemorySegment allocate(PFN_CMSG_EXPORT_ENCRYPT_KEY fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFN_CMSG_EXPORT_ENCRYPT_KEY.class, fi, constants$817.PFN_CMSG_EXPORT_ENCRYPT_KEY$FUNC, session);
    }
    static PFN_CMSG_EXPORT_ENCRYPT_KEY ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (long _hCryptProv, long _hEncryptKey, java.lang.foreign.MemoryAddress _pPublicKeyInfo, java.lang.foreign.MemoryAddress _pbData, java.lang.foreign.MemoryAddress _pcbData) -> {
            try {
                return (int)constants$817.PFN_CMSG_EXPORT_ENCRYPT_KEY$MH.invokeExact((Addressable)symbol, _hCryptProv, _hEncryptKey, (java.lang.foreign.Addressable)_pPublicKeyInfo, (java.lang.foreign.Addressable)_pbData, (java.lang.foreign.Addressable)_pcbData);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


