// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1191 {

    static final  GroupLayout CLSID_CdlProtocol$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_CdlProtocol$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_CdlProtocol", constants$1191.CLSID_CdlProtocol$LAYOUT);
    static final  GroupLayout CLSID_ClassInstallFilter$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_ClassInstallFilter$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_ClassInstallFilter", constants$1191.CLSID_ClassInstallFilter$LAYOUT);
    static final  GroupLayout IID_IAsyncBindCtx$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IAsyncBindCtx$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IAsyncBindCtx", constants$1191.IID_IAsyncBindCtx$LAYOUT);
    static final FunctionDescriptor CreateURLMoniker$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateURLMoniker$MH = RuntimeHelper.downcallHandle(
        "CreateURLMoniker",
        constants$1191.CreateURLMoniker$FUNC
    );
    static final FunctionDescriptor CreateURLMonikerEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateURLMonikerEx$MH = RuntimeHelper.downcallHandle(
        "CreateURLMonikerEx",
        constants$1191.CreateURLMonikerEx$FUNC
    );
    static final FunctionDescriptor GetClassURL$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetClassURL$MH = RuntimeHelper.downcallHandle(
        "GetClassURL",
        constants$1191.GetClassURL$FUNC
    );
}


