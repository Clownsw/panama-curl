// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFN_CERT_DLL_OPEN_STORE_PROV_FUNC {

    int apply(java.lang.foreign.MemoryAddress lpszStoreProvider, int dwEncodingType, long hCryptProv, int dwFlags, java.lang.foreign.MemoryAddress pvPara, java.lang.foreign.MemoryAddress hCertStore, java.lang.foreign.MemoryAddress pStoreProvInfo);
    static MemorySegment allocate(PFN_CERT_DLL_OPEN_STORE_PROV_FUNC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFN_CERT_DLL_OPEN_STORE_PROV_FUNC.class, fi, constants$821.PFN_CERT_DLL_OPEN_STORE_PROV_FUNC$FUNC, session);
    }
    static PFN_CERT_DLL_OPEN_STORE_PROV_FUNC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _lpszStoreProvider, int _dwEncodingType, long _hCryptProv, int _dwFlags, java.lang.foreign.MemoryAddress _pvPara, java.lang.foreign.MemoryAddress _hCertStore, java.lang.foreign.MemoryAddress _pStoreProvInfo) -> {
            try {
                return (int)constants$821.PFN_CERT_DLL_OPEN_STORE_PROV_FUNC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_lpszStoreProvider, _dwEncodingType, _hCryptProv, _dwFlags, (java.lang.foreign.Addressable)_pvPara, (java.lang.foreign.Addressable)_hCertStore, (java.lang.foreign.Addressable)_pStoreProvInfo);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


