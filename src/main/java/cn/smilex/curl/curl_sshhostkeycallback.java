// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface curl_sshhostkeycallback {

    int apply(java.lang.foreign.MemoryAddress clientp, int keytype, java.lang.foreign.MemoryAddress key, long keylen);
    static MemorySegment allocate(curl_sshhostkeycallback fi, MemorySession session) {
        return RuntimeHelper.upcallStub(curl_sshhostkeycallback.class, fi, constants$1389.curl_sshhostkeycallback$FUNC, session);
    }
    static curl_sshhostkeycallback ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _clientp, int _keytype, java.lang.foreign.MemoryAddress _key, long _keylen) -> {
            try {
                return (int)constants$1389.curl_sshhostkeycallback$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_clientp, _keytype, (java.lang.foreign.Addressable)_key, _keylen);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

