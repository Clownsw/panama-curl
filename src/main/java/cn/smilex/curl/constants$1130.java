// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1130 {

    static final FunctionDescriptor ITypeLib2_RemoteGetLibStatistics_Stub$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ITypeLib2_RemoteGetLibStatistics_Stub$MH = RuntimeHelper.downcallHandle(
        "ITypeLib2_RemoteGetLibStatistics_Stub",
        constants$1130.ITypeLib2_RemoteGetLibStatistics_Stub$FUNC
    );
    static final FunctionDescriptor ITypeLib2_RemoteGetDocumentation2_Proxy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ITypeLib2_RemoteGetDocumentation2_Proxy$MH = RuntimeHelper.downcallHandle(
        "ITypeLib2_RemoteGetDocumentation2_Proxy",
        constants$1130.ITypeLib2_RemoteGetDocumentation2_Proxy$FUNC
    );
    static final FunctionDescriptor ITypeLib2_RemoteGetDocumentation2_Stub$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ITypeLib2_RemoteGetDocumentation2_Stub$MH = RuntimeHelper.downcallHandle(
        "ITypeLib2_RemoteGetDocumentation2_Stub",
        constants$1130.ITypeLib2_RemoteGetDocumentation2_Stub$FUNC
    );
    static final  GroupLayout IID_ITypeChangeEvents$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_ITypeChangeEvents$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_ITypeChangeEvents", constants$1130.IID_ITypeChangeEvents$LAYOUT);
    static final  GroupLayout IID_IErrorInfo$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IErrorInfo$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IErrorInfo", constants$1130.IID_IErrorInfo$LAYOUT);
    static final  GroupLayout IID_ICreateErrorInfo$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_ICreateErrorInfo$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_ICreateErrorInfo", constants$1130.IID_ICreateErrorInfo$LAYOUT);
}


