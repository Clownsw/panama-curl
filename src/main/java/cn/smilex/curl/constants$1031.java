// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1031 {

    static final  GroupLayout IID_IAddrExclusionControl$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IAddrExclusionControl$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IAddrExclusionControl", constants$1031.IID_IAddrExclusionControl$LAYOUT);
    static final  GroupLayout IID_IPipeByte$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IPipeByte$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IPipeByte", constants$1031.IID_IPipeByte$LAYOUT);
    static final  GroupLayout IID_AsyncIPipeByte$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_AsyncIPipeByte$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_AsyncIPipeByte", constants$1031.IID_AsyncIPipeByte$LAYOUT);
    static final  GroupLayout IID_IPipeLong$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IPipeLong$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IPipeLong", constants$1031.IID_IPipeLong$LAYOUT);
    static final  GroupLayout IID_AsyncIPipeLong$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_AsyncIPipeLong$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_AsyncIPipeLong", constants$1031.IID_AsyncIPipeLong$LAYOUT);
    static final  GroupLayout IID_IPipeDouble$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IPipeDouble$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IPipeDouble", constants$1031.IID_IPipeDouble$LAYOUT);
}


