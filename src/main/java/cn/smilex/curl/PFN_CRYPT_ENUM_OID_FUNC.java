// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFN_CRYPT_ENUM_OID_FUNC {

    int apply(int dwEncodingType, java.lang.foreign.MemoryAddress pszFuncName, java.lang.foreign.MemoryAddress pszOID, int cValue, java.lang.foreign.MemoryAddress rgdwValueType, java.lang.foreign.MemoryAddress rgpwszValueName, java.lang.foreign.MemoryAddress rgpbValueData, java.lang.foreign.MemoryAddress rgcbValueData, java.lang.foreign.MemoryAddress pvArg);
    static MemorySegment allocate(PFN_CRYPT_ENUM_OID_FUNC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFN_CRYPT_ENUM_OID_FUNC.class, fi, constants$812.PFN_CRYPT_ENUM_OID_FUNC$FUNC, session);
    }
    static PFN_CRYPT_ENUM_OID_FUNC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int _dwEncodingType, java.lang.foreign.MemoryAddress _pszFuncName, java.lang.foreign.MemoryAddress _pszOID, int _cValue, java.lang.foreign.MemoryAddress _rgdwValueType, java.lang.foreign.MemoryAddress _rgpwszValueName, java.lang.foreign.MemoryAddress _rgpbValueData, java.lang.foreign.MemoryAddress _rgcbValueData, java.lang.foreign.MemoryAddress _pvArg) -> {
            try {
                return (int)constants$812.PFN_CRYPT_ENUM_OID_FUNC$MH.invokeExact((Addressable)symbol, _dwEncodingType, (java.lang.foreign.Addressable)_pszFuncName, (java.lang.foreign.Addressable)_pszOID, _cValue, (java.lang.foreign.Addressable)_rgdwValueType, (java.lang.foreign.Addressable)_rgpwszValueName, (java.lang.foreign.Addressable)_rgpbValueData, (java.lang.foreign.Addressable)_rgcbValueData, (java.lang.foreign.Addressable)_pvArg);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


