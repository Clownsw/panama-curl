// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PCRYPT_ENCRYPT_PRIVATE_KEY_FUNC {

    int apply(java.lang.foreign.MemoryAddress pAlgorithm, java.lang.foreign.MemoryAddress pClearTextPrivateKey, java.lang.foreign.MemoryAddress pbEncryptedKey, java.lang.foreign.MemoryAddress pcbEncryptedKey, java.lang.foreign.MemoryAddress pVoidEncryptFunc);
    static MemorySegment allocate(PCRYPT_ENCRYPT_PRIVATE_KEY_FUNC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PCRYPT_ENCRYPT_PRIVATE_KEY_FUNC.class, fi, constants$808.PCRYPT_ENCRYPT_PRIVATE_KEY_FUNC$FUNC, session);
    }
    static PCRYPT_ENCRYPT_PRIVATE_KEY_FUNC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _pAlgorithm, java.lang.foreign.MemoryAddress _pClearTextPrivateKey, java.lang.foreign.MemoryAddress _pbEncryptedKey, java.lang.foreign.MemoryAddress _pcbEncryptedKey, java.lang.foreign.MemoryAddress _pVoidEncryptFunc) -> {
            try {
                return (int)constants$808.PCRYPT_ENCRYPT_PRIVATE_KEY_FUNC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_pAlgorithm, (java.lang.foreign.Addressable)_pClearTextPrivateKey, (java.lang.foreign.Addressable)_pbEncryptedKey, (java.lang.foreign.Addressable)_pcbEncryptedKey, (java.lang.foreign.Addressable)_pVoidEncryptFunc);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


