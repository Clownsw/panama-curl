// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFN_CMSG_GEN_ENCRYPT_KEY {

    int apply(java.lang.foreign.MemoryAddress phCryptProv, java.lang.foreign.MemoryAddress paiEncrypt, java.lang.foreign.MemoryAddress pvEncryptAuxInfo, java.lang.foreign.MemoryAddress pPublicKeyInfo, java.lang.foreign.MemoryAddress pfnAlloc, java.lang.foreign.MemoryAddress phEncryptKey, java.lang.foreign.MemoryAddress ppbEncryptParameters, java.lang.foreign.MemoryAddress pcbEncryptParameters);
    static MemorySegment allocate(PFN_CMSG_GEN_ENCRYPT_KEY fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFN_CMSG_GEN_ENCRYPT_KEY.class, fi, constants$817.PFN_CMSG_GEN_ENCRYPT_KEY$FUNC, session);
    }
    static PFN_CMSG_GEN_ENCRYPT_KEY ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _phCryptProv, java.lang.foreign.MemoryAddress _paiEncrypt, java.lang.foreign.MemoryAddress _pvEncryptAuxInfo, java.lang.foreign.MemoryAddress _pPublicKeyInfo, java.lang.foreign.MemoryAddress _pfnAlloc, java.lang.foreign.MemoryAddress _phEncryptKey, java.lang.foreign.MemoryAddress _ppbEncryptParameters, java.lang.foreign.MemoryAddress _pcbEncryptParameters) -> {
            try {
                return (int)constants$817.PFN_CMSG_GEN_ENCRYPT_KEY$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_phCryptProv, (java.lang.foreign.Addressable)_paiEncrypt, (java.lang.foreign.Addressable)_pvEncryptAuxInfo, (java.lang.foreign.Addressable)_pPublicKeyInfo, (java.lang.foreign.Addressable)_pfnAlloc, (java.lang.foreign.Addressable)_phEncryptKey, (java.lang.foreign.Addressable)_ppbEncryptParameters, (java.lang.foreign.Addressable)_pcbEncryptParameters);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


