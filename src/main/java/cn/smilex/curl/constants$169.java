// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$169 {

    static final  GroupLayout GUID_BATTERY_COUNT$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_BATTERY_COUNT$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_BATTERY_COUNT", constants$169.GUID_BATTERY_COUNT$LAYOUT);
    static final  GroupLayout GUID_GLOBAL_USER_PRESENCE$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_GLOBAL_USER_PRESENCE$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_GLOBAL_USER_PRESENCE", constants$169.GUID_GLOBAL_USER_PRESENCE$LAYOUT);
    static final  GroupLayout GUID_SESSION_DISPLAY_STATUS$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_SESSION_DISPLAY_STATUS$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_SESSION_DISPLAY_STATUS", constants$169.GUID_SESSION_DISPLAY_STATUS$LAYOUT);
    static final  GroupLayout GUID_SESSION_USER_PRESENCE$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_SESSION_USER_PRESENCE$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_SESSION_USER_PRESENCE", constants$169.GUID_SESSION_USER_PRESENCE$LAYOUT);
    static final  GroupLayout GUID_IDLE_BACKGROUND_TASK$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_IDLE_BACKGROUND_TASK$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_IDLE_BACKGROUND_TASK", constants$169.GUID_IDLE_BACKGROUND_TASK$LAYOUT);
    static final  GroupLayout GUID_BACKGROUND_TASK_NOTIFICATION$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_BACKGROUND_TASK_NOTIFICATION$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_BACKGROUND_TASK_NOTIFICATION", constants$169.GUID_BACKGROUND_TASK_NOTIFICATION$LAYOUT);
}


