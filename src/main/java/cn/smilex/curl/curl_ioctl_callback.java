// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface curl_ioctl_callback {

    int apply(java.lang.foreign.MemoryAddress handle, int cmd, java.lang.foreign.MemoryAddress clientp);
    static MemorySegment allocate(curl_ioctl_callback fi, MemorySession session) {
        return RuntimeHelper.upcallStub(curl_ioctl_callback.class, fi, constants$1385.curl_ioctl_callback$FUNC, session);
    }
    static curl_ioctl_callback ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _handle, int _cmd, java.lang.foreign.MemoryAddress _clientp) -> {
            try {
                return (int)constants$1385.curl_ioctl_callback$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_handle, _cmd, (java.lang.foreign.Addressable)_clientp);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


