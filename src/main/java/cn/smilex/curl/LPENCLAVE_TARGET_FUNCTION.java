// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface LPENCLAVE_TARGET_FUNCTION {

    java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress _x0);
    static MemorySegment allocate(LPENCLAVE_TARGET_FUNCTION fi, MemorySession session) {
        return RuntimeHelper.upcallStub(LPENCLAVE_TARGET_FUNCTION.class, fi, constants$138.LPENCLAVE_TARGET_FUNCTION$FUNC, session);
    }
    static LPENCLAVE_TARGET_FUNCTION ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress __x0) -> {
            try {
                return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)constants$138.LPENCLAVE_TARGET_FUNCTION$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


