// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface LPFIBER_START_ROUTINE {

    void apply(java.lang.foreign.MemoryAddress _x0);
    static MemorySegment allocate(LPFIBER_START_ROUTINE fi, MemorySession session) {
        return RuntimeHelper.upcallStub(LPFIBER_START_ROUTINE.class, fi, constants$316.LPFIBER_START_ROUTINE$FUNC, session);
    }
    static LPFIBER_START_ROUTINE ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress __x0) -> {
            try {
                constants$316.LPFIBER_START_ROUTINE$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


