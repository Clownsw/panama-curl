// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFN_CMSG_STREAM_OUTPUT {

    int apply(java.lang.foreign.MemoryAddress pvArg, java.lang.foreign.MemoryAddress pbData, int cbData, int fFinal);
    static MemorySegment allocate(PFN_CMSG_STREAM_OUTPUT fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFN_CMSG_STREAM_OUTPUT.class, fi, constants$814.PFN_CMSG_STREAM_OUTPUT$FUNC, session);
    }
    static PFN_CMSG_STREAM_OUTPUT ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _pvArg, java.lang.foreign.MemoryAddress _pbData, int _cbData, int _fFinal) -> {
            try {
                return (int)constants$814.PFN_CMSG_STREAM_OUTPUT$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_pvArg, (java.lang.foreign.Addressable)_pbData, _cbData, _fFinal);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


