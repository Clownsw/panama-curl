// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$312 {

    static final FunctionDescriptor CreatePrivateNamespaceW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreatePrivateNamespaceW$MH = RuntimeHelper.downcallHandle(
        "CreatePrivateNamespaceW",
        constants$312.CreatePrivateNamespaceW$FUNC
    );
    static final FunctionDescriptor OpenPrivateNamespaceW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenPrivateNamespaceW$MH = RuntimeHelper.downcallHandle(
        "OpenPrivateNamespaceW",
        constants$312.OpenPrivateNamespaceW$FUNC
    );
    static final FunctionDescriptor ClosePrivateNamespace$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ClosePrivateNamespace$MH = RuntimeHelper.downcallHandle(
        "ClosePrivateNamespace",
        constants$312.ClosePrivateNamespace$FUNC
    );
    static final FunctionDescriptor CreateBoundaryDescriptorW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateBoundaryDescriptorW$MH = RuntimeHelper.downcallHandle(
        "CreateBoundaryDescriptorW",
        constants$312.CreateBoundaryDescriptorW$FUNC
    );
    static final FunctionDescriptor AddSIDToBoundaryDescriptor$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddSIDToBoundaryDescriptor$MH = RuntimeHelper.downcallHandle(
        "AddSIDToBoundaryDescriptor",
        constants$312.AddSIDToBoundaryDescriptor$FUNC
    );
    static final FunctionDescriptor DeleteBoundaryDescriptor$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeleteBoundaryDescriptor$MH = RuntimeHelper.downcallHandle(
        "DeleteBoundaryDescriptor",
        constants$312.DeleteBoundaryDescriptor$FUNC
    );
}


