// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PTP_TIMER_CALLBACK {

    void apply(java.lang.foreign.MemoryAddress Instance, java.lang.foreign.MemoryAddress Context, java.lang.foreign.MemoryAddress Timer);
    static MemorySegment allocate(PTP_TIMER_CALLBACK fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PTP_TIMER_CALLBACK.class, fi, constants$188.PTP_TIMER_CALLBACK$FUNC, session);
    }
    static PTP_TIMER_CALLBACK ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _Instance, java.lang.foreign.MemoryAddress _Context, java.lang.foreign.MemoryAddress _Timer) -> {
            try {
                constants$188.PTP_TIMER_CALLBACK$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_Instance, (java.lang.foreign.Addressable)_Context, (java.lang.foreign.Addressable)_Timer);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


