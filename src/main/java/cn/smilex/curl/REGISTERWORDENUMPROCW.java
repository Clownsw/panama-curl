// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface REGISTERWORDENUMPROCW {

    int apply(java.lang.foreign.MemoryAddress lpszReading, int _x1, java.lang.foreign.MemoryAddress lpszString, java.lang.foreign.MemoryAddress _x3);
    static MemorySegment allocate(REGISTERWORDENUMPROCW fi, MemorySession session) {
        return RuntimeHelper.upcallStub(REGISTERWORDENUMPROCW.class, fi, constants$1344.REGISTERWORDENUMPROCW$FUNC, session);
    }
    static REGISTERWORDENUMPROCW ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _lpszReading, int __x1, java.lang.foreign.MemoryAddress _lpszString, java.lang.foreign.MemoryAddress __x3) -> {
            try {
                return (int)constants$1344.REGISTERWORDENUMPROCW$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_lpszReading, __x1, (java.lang.foreign.Addressable)_lpszString, (java.lang.foreign.Addressable)__x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


