// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PVECTORED_EXCEPTION_HANDLER {

    int apply(java.lang.foreign.MemoryAddress ExceptionInfo);
    static MemorySegment allocate(PVECTORED_EXCEPTION_HANDLER fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PVECTORED_EXCEPTION_HANDLER.class, fi, constants$183.PVECTORED_EXCEPTION_HANDLER$FUNC, session);
    }
    static PVECTORED_EXCEPTION_HANDLER ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _ExceptionInfo) -> {
            try {
                return (int)constants$183.PVECTORED_EXCEPTION_HANDLER$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_ExceptionInfo);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


