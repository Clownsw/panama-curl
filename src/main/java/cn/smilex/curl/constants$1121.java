// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1121 {

    static final FunctionDescriptor ITypeComp_RemoteBindType_Stub$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ITypeComp_RemoteBindType_Stub$MH = RuntimeHelper.downcallHandle(
        "ITypeComp_RemoteBindType_Stub",
        constants$1121.ITypeComp_RemoteBindType_Stub$FUNC
    );
    static final  OfAddress __MIDL_itf_oaidl_0000_0008_v0_0_c_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_oaidl_0000_0008_v0_0_c_ifspec$VH = constants$1121.__MIDL_itf_oaidl_0000_0008_v0_0_c_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_oaidl_0000_0008_v0_0_c_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_oaidl_0000_0008_v0_0_c_ifspec", constants$1121.__MIDL_itf_oaidl_0000_0008_v0_0_c_ifspec$LAYOUT);
    static final  OfAddress __MIDL_itf_oaidl_0000_0008_v0_0_s_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_oaidl_0000_0008_v0_0_s_ifspec$VH = constants$1121.__MIDL_itf_oaidl_0000_0008_v0_0_s_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_oaidl_0000_0008_v0_0_s_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_oaidl_0000_0008_v0_0_s_ifspec", constants$1121.__MIDL_itf_oaidl_0000_0008_v0_0_s_ifspec$LAYOUT);
    static final  GroupLayout IID_ITypeInfo$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_ITypeInfo$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_ITypeInfo", constants$1121.IID_ITypeInfo$LAYOUT);
    static final FunctionDescriptor ITypeInfo_RemoteGetTypeAttr_Proxy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ITypeInfo_RemoteGetTypeAttr_Proxy$MH = RuntimeHelper.downcallHandle(
        "ITypeInfo_RemoteGetTypeAttr_Proxy",
        constants$1121.ITypeInfo_RemoteGetTypeAttr_Proxy$FUNC
    );
    static final FunctionDescriptor ITypeInfo_RemoteGetTypeAttr_Stub$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ITypeInfo_RemoteGetTypeAttr_Stub$MH = RuntimeHelper.downcallHandle(
        "ITypeInfo_RemoteGetTypeAttr_Stub",
        constants$1121.ITypeInfo_RemoteGetTypeAttr_Stub$FUNC
    );
}


