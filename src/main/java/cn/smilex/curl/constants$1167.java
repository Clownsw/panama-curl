// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1167 {

    static final FunctionDescriptor IViewObject_RemoteGetColorSet_Stub$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IViewObject_RemoteGetColorSet_Stub$MH = RuntimeHelper.downcallHandle(
        "IViewObject_RemoteGetColorSet_Stub",
        constants$1167.IViewObject_RemoteGetColorSet_Stub$FUNC
    );
    static final FunctionDescriptor IViewObject_RemoteFreeze_Proxy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IViewObject_RemoteFreeze_Proxy$MH = RuntimeHelper.downcallHandle(
        "IViewObject_RemoteFreeze_Proxy",
        constants$1167.IViewObject_RemoteFreeze_Proxy$FUNC
    );
    static final FunctionDescriptor IViewObject_RemoteFreeze_Stub$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IViewObject_RemoteFreeze_Stub$MH = RuntimeHelper.downcallHandle(
        "IViewObject_RemoteFreeze_Stub",
        constants$1167.IViewObject_RemoteFreeze_Stub$FUNC
    );
    static final FunctionDescriptor IViewObject_RemoteGetAdvise_Proxy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IViewObject_RemoteGetAdvise_Proxy$MH = RuntimeHelper.downcallHandle(
        "IViewObject_RemoteGetAdvise_Proxy",
        constants$1167.IViewObject_RemoteGetAdvise_Proxy$FUNC
    );
    static final FunctionDescriptor IViewObject_RemoteGetAdvise_Stub$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IViewObject_RemoteGetAdvise_Stub$MH = RuntimeHelper.downcallHandle(
        "IViewObject_RemoteGetAdvise_Stub",
        constants$1167.IViewObject_RemoteGetAdvise_Stub$FUNC
    );
    static final  GroupLayout IID_IViewObject2$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IViewObject2$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IViewObject2", constants$1167.IID_IViewObject2$LAYOUT);
}


