// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PCRYPT_DECRYPT_PRIVATE_KEY_FUNC {

    int apply(java.lang.foreign.MemorySegment Algorithm, java.lang.foreign.MemorySegment EncryptedPrivateKey, java.lang.foreign.MemoryAddress pbClearTextKey, java.lang.foreign.MemoryAddress pcbClearTextKey, java.lang.foreign.MemoryAddress pVoidDecryptFunc);
    static MemorySegment allocate(PCRYPT_DECRYPT_PRIVATE_KEY_FUNC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PCRYPT_DECRYPT_PRIVATE_KEY_FUNC.class, fi, constants$807.PCRYPT_DECRYPT_PRIVATE_KEY_FUNC$FUNC, session);
    }
    static PCRYPT_DECRYPT_PRIVATE_KEY_FUNC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemorySegment _Algorithm, java.lang.foreign.MemorySegment _EncryptedPrivateKey, java.lang.foreign.MemoryAddress _pbClearTextKey, java.lang.foreign.MemoryAddress _pcbClearTextKey, java.lang.foreign.MemoryAddress _pVoidDecryptFunc) -> {
            try {
                return (int)constants$808.PCRYPT_DECRYPT_PRIVATE_KEY_FUNC$MH.invokeExact((Addressable)symbol, _Algorithm, _EncryptedPrivateKey, (java.lang.foreign.Addressable)_pbClearTextKey, (java.lang.foreign.Addressable)_pcbClearTextKey, (java.lang.foreign.Addressable)_pVoidDecryptFunc);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


