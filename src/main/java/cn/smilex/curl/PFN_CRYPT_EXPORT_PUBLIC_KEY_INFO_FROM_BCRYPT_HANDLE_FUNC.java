// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFN_CRYPT_EXPORT_PUBLIC_KEY_INFO_FROM_BCRYPT_HANDLE_FUNC {

    int apply(java.lang.foreign.MemoryAddress hBCryptKey, int dwCertEncodingType, java.lang.foreign.MemoryAddress pszPublicKeyObjId, int dwFlags, java.lang.foreign.MemoryAddress pvAuxInfo, java.lang.foreign.MemoryAddress pInfo, java.lang.foreign.MemoryAddress pcbInfo);
    static MemorySegment allocate(PFN_CRYPT_EXPORT_PUBLIC_KEY_INFO_FROM_BCRYPT_HANDLE_FUNC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFN_CRYPT_EXPORT_PUBLIC_KEY_INFO_FROM_BCRYPT_HANDLE_FUNC.class, fi, constants$849.PFN_CRYPT_EXPORT_PUBLIC_KEY_INFO_FROM_BCRYPT_HANDLE_FUNC$FUNC, session);
    }
    static PFN_CRYPT_EXPORT_PUBLIC_KEY_INFO_FROM_BCRYPT_HANDLE_FUNC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _hBCryptKey, int _dwCertEncodingType, java.lang.foreign.MemoryAddress _pszPublicKeyObjId, int _dwFlags, java.lang.foreign.MemoryAddress _pvAuxInfo, java.lang.foreign.MemoryAddress _pInfo, java.lang.foreign.MemoryAddress _pcbInfo) -> {
            try {
                return (int)constants$850.PFN_CRYPT_EXPORT_PUBLIC_KEY_INFO_FROM_BCRYPT_HANDLE_FUNC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_hBCryptKey, _dwCertEncodingType, (java.lang.foreign.Addressable)_pszPublicKeyObjId, _dwFlags, (java.lang.foreign.Addressable)_pvAuxInfo, (java.lang.foreign.Addressable)_pInfo, (java.lang.foreign.Addressable)_pcbInfo);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


