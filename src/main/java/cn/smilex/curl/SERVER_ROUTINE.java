// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface SERVER_ROUTINE {

    int apply();
    static MemorySegment allocate(SERVER_ROUTINE fi, MemorySession session) {
        return RuntimeHelper.upcallStub(SERVER_ROUTINE.class, fi, constants$884.SERVER_ROUTINE$FUNC, session);
    }
    static SERVER_ROUTINE ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return () -> {
            try {
                return (int)constants$884.SERVER_ROUTINE$MH.invokeExact((Addressable)symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


