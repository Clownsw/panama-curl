// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface DRVCALLBACK {

    void apply(java.lang.foreign.MemoryAddress hdrvr, int uMsg, long dwUser, long dw1, long dw2);
    static MemorySegment allocate(DRVCALLBACK fi, MemorySession session) {
        return RuntimeHelper.upcallStub(DRVCALLBACK.class, fi, constants$676.DRVCALLBACK$FUNC, session);
    }
    static DRVCALLBACK ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _hdrvr, int _uMsg, long _dwUser, long _dw1, long _dw2) -> {
            try {
                constants$676.DRVCALLBACK$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_hdrvr, _uMsg, _dwUser, _dw1, _dw2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

