// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface WINEVENTPROC {

    void apply(java.lang.foreign.MemoryAddress hWinEventHook, int event, java.lang.foreign.MemoryAddress hwnd, int idObject, int idChild, int idEventThread, int dwmsEventTime);
    static MemorySegment allocate(WINEVENTPROC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(WINEVENTPROC.class, fi, constants$584.WINEVENTPROC$FUNC, session);
    }
    static WINEVENTPROC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _hWinEventHook, int _event, java.lang.foreign.MemoryAddress _hwnd, int _idObject, int _idChild, int _idEventThread, int _dwmsEventTime) -> {
            try {
                constants$584.WINEVENTPROC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_hWinEventHook, _event, (java.lang.foreign.Addressable)_hwnd, _idObject, _idChild, _idEventThread, _dwmsEventTime);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


