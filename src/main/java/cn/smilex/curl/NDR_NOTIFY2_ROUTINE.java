// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface NDR_NOTIFY2_ROUTINE {

    void apply(byte flag);
    static MemorySegment allocate(NDR_NOTIFY2_ROUTINE fi, MemorySession session) {
        return RuntimeHelper.upcallStub(NDR_NOTIFY2_ROUTINE.class, fi, constants$877.NDR_NOTIFY2_ROUTINE$FUNC, session);
    }
    static NDR_NOTIFY2_ROUTINE ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (byte _flag) -> {
            try {
                constants$877.NDR_NOTIFY2_ROUTINE$MH.invokeExact((Addressable)symbol, _flag);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


