// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1119 {

    static final  OfAddress __MIDL_itf_oaidl_0000_0005_v0_0_c_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_oaidl_0000_0005_v0_0_c_ifspec$VH = constants$1119.__MIDL_itf_oaidl_0000_0005_v0_0_c_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_oaidl_0000_0005_v0_0_c_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_oaidl_0000_0005_v0_0_c_ifspec", constants$1119.__MIDL_itf_oaidl_0000_0005_v0_0_c_ifspec$LAYOUT);
    static final  OfAddress __MIDL_itf_oaidl_0000_0005_v0_0_s_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_oaidl_0000_0005_v0_0_s_ifspec$VH = constants$1119.__MIDL_itf_oaidl_0000_0005_v0_0_s_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_oaidl_0000_0005_v0_0_s_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_oaidl_0000_0005_v0_0_s_ifspec", constants$1119.__MIDL_itf_oaidl_0000_0005_v0_0_s_ifspec$LAYOUT);
    static final  GroupLayout IID_IDispatch$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IDispatch$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IDispatch", constants$1119.IID_IDispatch$LAYOUT);
    static final FunctionDescriptor IDispatch_RemoteInvoke_Proxy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IDispatch_RemoteInvoke_Proxy$MH = RuntimeHelper.downcallHandle(
        "IDispatch_RemoteInvoke_Proxy",
        constants$1119.IDispatch_RemoteInvoke_Proxy$FUNC
    );
    static final FunctionDescriptor IDispatch_RemoteInvoke_Stub$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IDispatch_RemoteInvoke_Stub$MH = RuntimeHelper.downcallHandle(
        "IDispatch_RemoteInvoke_Stub",
        constants$1119.IDispatch_RemoteInvoke_Stub$FUNC
    );
    static final  GroupLayout IID_IEnumVARIANT$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IEnumVARIANT$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IEnumVARIANT", constants$1119.IID_IEnumVARIANT$LAYOUT);
}


