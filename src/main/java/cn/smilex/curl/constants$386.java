// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$386 {

    static final FunctionDescriptor DestroyThreadpoolEnvironment$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DestroyThreadpoolEnvironment$MH = RuntimeHelper.downcallHandle(
        "DestroyThreadpoolEnvironment",
        constants$386.DestroyThreadpoolEnvironment$FUNC
    );
    static final FunctionDescriptor SetThreadpoolCallbackPersistent$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetThreadpoolCallbackPersistent$MH = RuntimeHelper.downcallHandle(
        "SetThreadpoolCallbackPersistent",
        constants$386.SetThreadpoolCallbackPersistent$FUNC
    );
    static final FunctionDescriptor CreatePrivateNamespaceA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreatePrivateNamespaceA$MH = RuntimeHelper.downcallHandle(
        "CreatePrivateNamespaceA",
        constants$386.CreatePrivateNamespaceA$FUNC
    );
    static final FunctionDescriptor OpenPrivateNamespaceA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenPrivateNamespaceA$MH = RuntimeHelper.downcallHandle(
        "OpenPrivateNamespaceA",
        constants$386.OpenPrivateNamespaceA$FUNC
    );
    static final FunctionDescriptor CreateBoundaryDescriptorA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateBoundaryDescriptorA$MH = RuntimeHelper.downcallHandle(
        "CreateBoundaryDescriptorA",
        constants$386.CreateBoundaryDescriptorA$FUNC
    );
    static final FunctionDescriptor AddIntegrityLabelToBoundaryDescriptor$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddIntegrityLabelToBoundaryDescriptor$MH = RuntimeHelper.downcallHandle(
        "AddIntegrityLabelToBoundaryDescriptor",
        constants$386.AddIntegrityLabelToBoundaryDescriptor$FUNC
    );
}


