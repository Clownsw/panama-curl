// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface CS_TYPE_FROM_NETCS_ROUTINE {

    void apply(java.lang.foreign.MemoryAddress hBinding, int ulNetworkCodeSet, java.lang.foreign.MemoryAddress pNetworkData, int ulNetworkDataLength, int ulLocalBufferSize, java.lang.foreign.MemoryAddress pLocalData, java.lang.foreign.MemoryAddress pulLocalDataLength, java.lang.foreign.MemoryAddress pStatus);
    static MemorySegment allocate(CS_TYPE_FROM_NETCS_ROUTINE fi, MemorySession session) {
        return RuntimeHelper.upcallStub(CS_TYPE_FROM_NETCS_ROUTINE.class, fi, constants$883.CS_TYPE_FROM_NETCS_ROUTINE$FUNC, session);
    }
    static CS_TYPE_FROM_NETCS_ROUTINE ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _hBinding, int _ulNetworkCodeSet, java.lang.foreign.MemoryAddress _pNetworkData, int _ulNetworkDataLength, int _ulLocalBufferSize, java.lang.foreign.MemoryAddress _pLocalData, java.lang.foreign.MemoryAddress _pulLocalDataLength, java.lang.foreign.MemoryAddress _pStatus) -> {
            try {
                constants$883.CS_TYPE_FROM_NETCS_ROUTINE$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_hBinding, _ulNetworkCodeSet, (java.lang.foreign.Addressable)_pNetworkData, _ulNetworkDataLength, _ulLocalBufferSize, (java.lang.foreign.Addressable)_pLocalData, (java.lang.foreign.Addressable)_pulLocalDataLength, (java.lang.foreign.Addressable)_pStatus);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


