// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1127 {

    static final  OfAddress __MIDL_itf_oaidl_0000_0010_v0_0_s_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_oaidl_0000_0010_v0_0_s_ifspec$VH = constants$1127.__MIDL_itf_oaidl_0000_0010_v0_0_s_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_oaidl_0000_0010_v0_0_s_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_oaidl_0000_0010_v0_0_s_ifspec", constants$1127.__MIDL_itf_oaidl_0000_0010_v0_0_s_ifspec$LAYOUT);
    static final  GroupLayout IID_ITypeLib$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_ITypeLib$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_ITypeLib", constants$1127.IID_ITypeLib$LAYOUT);
    static final FunctionDescriptor ITypeLib_RemoteGetTypeInfoCount_Proxy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ITypeLib_RemoteGetTypeInfoCount_Proxy$MH = RuntimeHelper.downcallHandle(
        "ITypeLib_RemoteGetTypeInfoCount_Proxy",
        constants$1127.ITypeLib_RemoteGetTypeInfoCount_Proxy$FUNC
    );
    static final FunctionDescriptor ITypeLib_RemoteGetTypeInfoCount_Stub$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ITypeLib_RemoteGetTypeInfoCount_Stub$MH = RuntimeHelper.downcallHandle(
        "ITypeLib_RemoteGetTypeInfoCount_Stub",
        constants$1127.ITypeLib_RemoteGetTypeInfoCount_Stub$FUNC
    );
    static final FunctionDescriptor ITypeLib_RemoteGetLibAttr_Proxy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ITypeLib_RemoteGetLibAttr_Proxy$MH = RuntimeHelper.downcallHandle(
        "ITypeLib_RemoteGetLibAttr_Proxy",
        constants$1127.ITypeLib_RemoteGetLibAttr_Proxy$FUNC
    );
    static final FunctionDescriptor ITypeLib_RemoteGetLibAttr_Stub$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ITypeLib_RemoteGetLibAttr_Stub$MH = RuntimeHelper.downcallHandle(
        "ITypeLib_RemoteGetLibAttr_Stub",
        constants$1127.ITypeLib_RemoteGetLibAttr_Stub$FUNC
    );
}


