// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1161 {

    static final FunctionDescriptor GetRunningObjectTable$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetRunningObjectTable$MH = RuntimeHelper.downcallHandle(
        "GetRunningObjectTable",
        constants$1161.GetRunningObjectTable$FUNC
    );
    static final  OfAddress __MIDL_itf_oleidl_0000_0000_v0_0_c_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_oleidl_0000_0000_v0_0_c_ifspec$VH = constants$1161.__MIDL_itf_oleidl_0000_0000_v0_0_c_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_oleidl_0000_0000_v0_0_c_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_oleidl_0000_0000_v0_0_c_ifspec", constants$1161.__MIDL_itf_oleidl_0000_0000_v0_0_c_ifspec$LAYOUT);
    static final  OfAddress __MIDL_itf_oleidl_0000_0000_v0_0_s_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_oleidl_0000_0000_v0_0_s_ifspec$VH = constants$1161.__MIDL_itf_oleidl_0000_0000_v0_0_s_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_oleidl_0000_0000_v0_0_s_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_oleidl_0000_0000_v0_0_s_ifspec", constants$1161.__MIDL_itf_oleidl_0000_0000_v0_0_s_ifspec$LAYOUT);
    static final  GroupLayout IID_IOleAdviseHolder$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IOleAdviseHolder$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IOleAdviseHolder", constants$1161.IID_IOleAdviseHolder$LAYOUT);
    static final  OfAddress __MIDL_itf_oleidl_0000_0001_v0_0_c_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_oleidl_0000_0001_v0_0_c_ifspec$VH = constants$1161.__MIDL_itf_oleidl_0000_0001_v0_0_c_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_oleidl_0000_0001_v0_0_c_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_oleidl_0000_0001_v0_0_c_ifspec", constants$1161.__MIDL_itf_oleidl_0000_0001_v0_0_c_ifspec$LAYOUT);
    static final  OfAddress __MIDL_itf_oleidl_0000_0001_v0_0_s_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_oleidl_0000_0001_v0_0_s_ifspec$VH = constants$1161.__MIDL_itf_oleidl_0000_0001_v0_0_s_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_oleidl_0000_0001_v0_0_s_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_oleidl_0000_0001_v0_0_s_ifspec", constants$1161.__MIDL_itf_oleidl_0000_0001_v0_0_s_ifspec$LAYOUT);
}


