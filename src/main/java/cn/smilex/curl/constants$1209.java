// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1209 {

    static final FunctionDescriptor IWinInetHttpInfo_RemoteQueryInfo_Stub$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IWinInetHttpInfo_RemoteQueryInfo_Stub$MH = RuntimeHelper.downcallHandle(
        "IWinInetHttpInfo_RemoteQueryInfo_Stub",
        constants$1209.IWinInetHttpInfo_RemoteQueryInfo_Stub$FUNC
    );
    static final  OfAddress __MIDL_itf_urlmon_0000_0021_v0_0_c_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_urlmon_0000_0021_v0_0_c_ifspec$VH = constants$1209.__MIDL_itf_urlmon_0000_0021_v0_0_c_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_urlmon_0000_0021_v0_0_c_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_urlmon_0000_0021_v0_0_c_ifspec", constants$1209.__MIDL_itf_urlmon_0000_0021_v0_0_c_ifspec$LAYOUT);
    static final  OfAddress __MIDL_itf_urlmon_0000_0021_v0_0_s_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_urlmon_0000_0021_v0_0_s_ifspec$VH = constants$1209.__MIDL_itf_urlmon_0000_0021_v0_0_s_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_urlmon_0000_0021_v0_0_s_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_urlmon_0000_0021_v0_0_s_ifspec", constants$1209.__MIDL_itf_urlmon_0000_0021_v0_0_s_ifspec$LAYOUT);
    static final  GroupLayout IID_IWinInetHttpTimeouts$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IWinInetHttpTimeouts$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IWinInetHttpTimeouts", constants$1209.IID_IWinInetHttpTimeouts$LAYOUT);
    static final  OfAddress __MIDL_itf_urlmon_0000_0022_v0_0_c_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_urlmon_0000_0022_v0_0_c_ifspec$VH = constants$1209.__MIDL_itf_urlmon_0000_0022_v0_0_c_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_urlmon_0000_0022_v0_0_c_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_urlmon_0000_0022_v0_0_c_ifspec", constants$1209.__MIDL_itf_urlmon_0000_0022_v0_0_c_ifspec$LAYOUT);
    static final  OfAddress __MIDL_itf_urlmon_0000_0022_v0_0_s_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_urlmon_0000_0022_v0_0_s_ifspec$VH = constants$1209.__MIDL_itf_urlmon_0000_0022_v0_0_s_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_urlmon_0000_0022_v0_0_s_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_urlmon_0000_0022_v0_0_s_ifspec", constants$1209.__MIDL_itf_urlmon_0000_0022_v0_0_s_ifspec$LAYOUT);
}


