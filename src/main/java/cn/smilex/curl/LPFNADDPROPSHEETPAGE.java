// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface LPFNADDPROPSHEETPAGE {

    int apply(java.lang.foreign.MemoryAddress _x0, long _x1);
    static MemorySegment allocate(LPFNADDPROPSHEETPAGE fi, MemorySession session) {
        return RuntimeHelper.upcallStub(LPFNADDPROPSHEETPAGE.class, fi, constants$946.LPFNADDPROPSHEETPAGE$FUNC, session);
    }
    static LPFNADDPROPSHEETPAGE ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress __x0, long __x1) -> {
            try {
                return (int)constants$947.LPFNADDPROPSHEETPAGE$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


