// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface LPPROGRESS_ROUTINE {

    int apply(java.lang.foreign.MemorySegment TotalFileSize, java.lang.foreign.MemorySegment TotalBytesTransferred, java.lang.foreign.MemorySegment StreamSize, java.lang.foreign.MemorySegment StreamBytesTransferred, int dwStreamNumber, int dwCallbackReason, java.lang.foreign.MemoryAddress hSourceFile, java.lang.foreign.MemoryAddress hDestinationFile, java.lang.foreign.MemoryAddress lpData);
    static MemorySegment allocate(LPPROGRESS_ROUTINE fi, MemorySession session) {
        return RuntimeHelper.upcallStub(LPPROGRESS_ROUTINE.class, fi, constants$364.LPPROGRESS_ROUTINE$FUNC, session);
    }
    static LPPROGRESS_ROUTINE ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemorySegment _TotalFileSize, java.lang.foreign.MemorySegment _TotalBytesTransferred, java.lang.foreign.MemorySegment _StreamSize, java.lang.foreign.MemorySegment _StreamBytesTransferred, int _dwStreamNumber, int _dwCallbackReason, java.lang.foreign.MemoryAddress _hSourceFile, java.lang.foreign.MemoryAddress _hDestinationFile, java.lang.foreign.MemoryAddress _lpData) -> {
            try {
                return (int)constants$364.LPPROGRESS_ROUTINE$MH.invokeExact((Addressable)symbol, _TotalFileSize, _TotalBytesTransferred, _StreamSize, _StreamBytesTransferred, _dwStreamNumber, _dwCallbackReason, (java.lang.foreign.Addressable)_hSourceFile, (java.lang.foreign.Addressable)_hDestinationFile, (java.lang.foreign.Addressable)_lpData);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


