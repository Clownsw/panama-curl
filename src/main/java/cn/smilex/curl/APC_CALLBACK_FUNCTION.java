// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface APC_CALLBACK_FUNCTION {

    void apply(int _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
    static MemorySegment allocate(APC_CALLBACK_FUNCTION fi, MemorySession session) {
        return RuntimeHelper.upcallStub(APC_CALLBACK_FUNCTION.class, fi, constants$184.APC_CALLBACK_FUNCTION$FUNC, session);
    }
    static APC_CALLBACK_FUNCTION ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
            try {
                constants$184.APC_CALLBACK_FUNCTION$MH.invokeExact((Addressable)symbol, __x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


