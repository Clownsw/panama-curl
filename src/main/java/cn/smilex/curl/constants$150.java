// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$150 {

    static final  GroupLayout GUID_BATTERY_SUBGROUP$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_BATTERY_SUBGROUP$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_BATTERY_SUBGROUP", constants$150.GUID_BATTERY_SUBGROUP$LAYOUT);
    static final  GroupLayout GUID_BATTERY_DISCHARGE_ACTION_0$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_BATTERY_DISCHARGE_ACTION_0$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_BATTERY_DISCHARGE_ACTION_0", constants$150.GUID_BATTERY_DISCHARGE_ACTION_0$LAYOUT);
    static final  GroupLayout GUID_BATTERY_DISCHARGE_LEVEL_0$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_BATTERY_DISCHARGE_LEVEL_0$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_BATTERY_DISCHARGE_LEVEL_0", constants$150.GUID_BATTERY_DISCHARGE_LEVEL_0$LAYOUT);
    static final  GroupLayout GUID_BATTERY_DISCHARGE_FLAGS_0$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_BATTERY_DISCHARGE_FLAGS_0$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_BATTERY_DISCHARGE_FLAGS_0", constants$150.GUID_BATTERY_DISCHARGE_FLAGS_0$LAYOUT);
    static final  GroupLayout GUID_BATTERY_DISCHARGE_ACTION_1$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_BATTERY_DISCHARGE_ACTION_1$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_BATTERY_DISCHARGE_ACTION_1", constants$150.GUID_BATTERY_DISCHARGE_ACTION_1$LAYOUT);
    static final  GroupLayout GUID_BATTERY_DISCHARGE_LEVEL_1$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_BATTERY_DISCHARGE_LEVEL_1$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_BATTERY_DISCHARGE_LEVEL_1", constants$150.GUID_BATTERY_DISCHARGE_LEVEL_1$LAYOUT);
}

