// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$139 {

    static final  GroupLayout GUID_TYPICAL_POWER_SAVINGS$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_TYPICAL_POWER_SAVINGS$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_TYPICAL_POWER_SAVINGS", constants$139.GUID_TYPICAL_POWER_SAVINGS$LAYOUT);
    static final  GroupLayout NO_SUBGROUP_GUID$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment NO_SUBGROUP_GUID$SEGMENT = RuntimeHelper.lookupGlobalVariable("NO_SUBGROUP_GUID", constants$139.NO_SUBGROUP_GUID$LAYOUT);
    static final  GroupLayout ALL_POWERSCHEMES_GUID$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment ALL_POWERSCHEMES_GUID$SEGMENT = RuntimeHelper.lookupGlobalVariable("ALL_POWERSCHEMES_GUID", constants$139.ALL_POWERSCHEMES_GUID$LAYOUT);
    static final  GroupLayout GUID_POWERSCHEME_PERSONALITY$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_POWERSCHEME_PERSONALITY$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_POWERSCHEME_PERSONALITY", constants$139.GUID_POWERSCHEME_PERSONALITY$LAYOUT);
    static final  GroupLayout GUID_ACTIVE_POWERSCHEME$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_ACTIVE_POWERSCHEME$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_ACTIVE_POWERSCHEME", constants$139.GUID_ACTIVE_POWERSCHEME$LAYOUT);
    static final  GroupLayout GUID_IDLE_RESILIENCY_SUBGROUP$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_IDLE_RESILIENCY_SUBGROUP$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_IDLE_RESILIENCY_SUBGROUP", constants$139.GUID_IDLE_RESILIENCY_SUBGROUP$LAYOUT);
}


