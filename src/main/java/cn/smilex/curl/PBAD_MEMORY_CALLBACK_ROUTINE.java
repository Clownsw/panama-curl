// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PBAD_MEMORY_CALLBACK_ROUTINE {

    void apply();
    static MemorySegment allocate(PBAD_MEMORY_CALLBACK_ROUTINE fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PBAD_MEMORY_CALLBACK_ROUTINE.class, fi, constants$269.PBAD_MEMORY_CALLBACK_ROUTINE$FUNC, session);
    }
    static PBAD_MEMORY_CALLBACK_ROUTINE ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return () -> {
            try {
                constants$270.PBAD_MEMORY_CALLBACK_ROUTINE$MH.invokeExact((Addressable)symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


