// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1021 {

    static final FunctionDescriptor IEnumUnknown_RemoteNext_Proxy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IEnumUnknown_RemoteNext_Proxy$MH = RuntimeHelper.downcallHandle(
        "IEnumUnknown_RemoteNext_Proxy",
        constants$1021.IEnumUnknown_RemoteNext_Proxy$FUNC
    );
    static final FunctionDescriptor IEnumUnknown_RemoteNext_Stub$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IEnumUnknown_RemoteNext_Stub$MH = RuntimeHelper.downcallHandle(
        "IEnumUnknown_RemoteNext_Stub",
        constants$1021.IEnumUnknown_RemoteNext_Stub$FUNC
    );
    static final  GroupLayout IID_IEnumString$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IEnumString$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IEnumString", constants$1021.IID_IEnumString$LAYOUT);
    static final FunctionDescriptor IEnumString_RemoteNext_Proxy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IEnumString_RemoteNext_Proxy$MH = RuntimeHelper.downcallHandle(
        "IEnumString_RemoteNext_Proxy",
        constants$1021.IEnumString_RemoteNext_Proxy$FUNC
    );
    static final FunctionDescriptor IEnumString_RemoteNext_Stub$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IEnumString_RemoteNext_Stub$MH = RuntimeHelper.downcallHandle(
        "IEnumString_RemoteNext_Stub",
        constants$1021.IEnumString_RemoteNext_Stub$FUNC
    );
    static final  GroupLayout IID_ISequentialStream$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_ISequentialStream$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_ISequentialStream", constants$1021.IID_ISequentialStream$LAYOUT);
}

