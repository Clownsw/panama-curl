// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface curl_unlock_function {

    void apply(java.lang.foreign.MemoryAddress handle, int data, java.lang.foreign.MemoryAddress userptr);
    static MemorySegment allocate(curl_unlock_function fi, MemorySession session) {
        return RuntimeHelper.upcallStub(curl_unlock_function.class, fi, constants$1396.curl_unlock_function$FUNC, session);
    }
    static curl_unlock_function ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _handle, int _data, java.lang.foreign.MemoryAddress _userptr) -> {
            try {
                constants$1396.curl_unlock_function$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_handle, _data, (java.lang.foreign.Addressable)_userptr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


