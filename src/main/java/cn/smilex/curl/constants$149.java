// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$149 {

    static final  GroupLayout GUID_SYSTEM_BUTTON_SUBGROUP$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_SYSTEM_BUTTON_SUBGROUP$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_SYSTEM_BUTTON_SUBGROUP", constants$149.GUID_SYSTEM_BUTTON_SUBGROUP$LAYOUT);
    static final  GroupLayout GUID_POWERBUTTON_ACTION$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_POWERBUTTON_ACTION$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_POWERBUTTON_ACTION", constants$149.GUID_POWERBUTTON_ACTION$LAYOUT);
    static final  GroupLayout GUID_SLEEPBUTTON_ACTION$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_SLEEPBUTTON_ACTION$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_SLEEPBUTTON_ACTION", constants$149.GUID_SLEEPBUTTON_ACTION$LAYOUT);
    static final  GroupLayout GUID_USERINTERFACEBUTTON_ACTION$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_USERINTERFACEBUTTON_ACTION$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_USERINTERFACEBUTTON_ACTION", constants$149.GUID_USERINTERFACEBUTTON_ACTION$LAYOUT);
    static final  GroupLayout GUID_LIDCLOSE_ACTION$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_LIDCLOSE_ACTION$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_LIDCLOSE_ACTION", constants$149.GUID_LIDCLOSE_ACTION$LAYOUT);
    static final  GroupLayout GUID_LIDOPEN_POWERSTATE$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_LIDOPEN_POWERSTATE$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_LIDOPEN_POWERSTATE", constants$149.GUID_LIDOPEN_POWERSTATE$LAYOUT);
}

