// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PGET_SYSTEM_WOW64_DIRECTORY_A {

    int apply(java.lang.foreign.MemoryAddress lpBuffer, int uSize);
    static MemorySegment allocate(PGET_SYSTEM_WOW64_DIRECTORY_A fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PGET_SYSTEM_WOW64_DIRECTORY_A.class, fi, constants$358.PGET_SYSTEM_WOW64_DIRECTORY_A$FUNC, session);
    }
    static PGET_SYSTEM_WOW64_DIRECTORY_A ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _lpBuffer, int _uSize) -> {
            try {
                return (int)constants$358.PGET_SYSTEM_WOW64_DIRECTORY_A$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_lpBuffer, _uSize);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


