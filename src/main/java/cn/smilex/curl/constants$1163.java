// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1163 {

    static final  GroupLayout IID_IOleCacheControl$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IOleCacheControl$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IOleCacheControl", constants$1163.IID_IOleCacheControl$LAYOUT);
    static final  GroupLayout IID_IParseDisplayName$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IParseDisplayName$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IParseDisplayName", constants$1163.IID_IParseDisplayName$LAYOUT);
    static final  GroupLayout IID_IOleContainer$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IOleContainer$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IOleContainer", constants$1163.IID_IOleContainer$LAYOUT);
    static final  GroupLayout IID_IOleClientSite$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IOleClientSite$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IOleClientSite", constants$1163.IID_IOleClientSite$LAYOUT);
    static final  GroupLayout IID_IOleObject$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IOleObject$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IOleObject", constants$1163.IID_IOleObject$LAYOUT);
    static final  OfAddress IOLETypes_v0_0_c_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle IOLETypes_v0_0_c_ifspec$VH = constants$1163.IOLETypes_v0_0_c_ifspec$LAYOUT.varHandle();
    static final MemorySegment IOLETypes_v0_0_c_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("IOLETypes_v0_0_c_ifspec", constants$1163.IOLETypes_v0_0_c_ifspec$LAYOUT);
}


