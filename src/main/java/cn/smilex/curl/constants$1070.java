// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1070 {

    static final  OfAddress __MIDL_itf_objidl_0000_0058_v0_0_s_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_objidl_0000_0058_v0_0_s_ifspec$VH = constants$1070.__MIDL_itf_objidl_0000_0058_v0_0_s_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_objidl_0000_0058_v0_0_s_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_objidl_0000_0058_v0_0_s_ifspec", constants$1070.__MIDL_itf_objidl_0000_0058_v0_0_s_ifspec$LAYOUT);
    static final  GroupLayout IID_IPersist$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IPersist$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IPersist", constants$1070.IID_IPersist$LAYOUT);
    static final  GroupLayout IID_IPersistStream$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IPersistStream$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IPersistStream", constants$1070.IID_IPersistStream$LAYOUT);
    static final  GroupLayout IID_IMoniker$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IMoniker$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IMoniker", constants$1070.IID_IMoniker$LAYOUT);
    static final FunctionDescriptor IMoniker_RemoteBindToObject_Proxy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IMoniker_RemoteBindToObject_Proxy$MH = RuntimeHelper.downcallHandle(
        "IMoniker_RemoteBindToObject_Proxy",
        constants$1070.IMoniker_RemoteBindToObject_Proxy$FUNC
    );
    static final FunctionDescriptor IMoniker_RemoteBindToObject_Stub$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IMoniker_RemoteBindToObject_Stub$MH = RuntimeHelper.downcallHandle(
        "IMoniker_RemoteBindToObject_Stub",
        constants$1070.IMoniker_RemoteBindToObject_Stub$FUNC
    );
}

