// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$508 {

    static final FunctionDescriptor CloseClipboard$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle CloseClipboard$MH = RuntimeHelper.downcallHandle(
        "CloseClipboard",
        constants$508.CloseClipboard$FUNC
    );
    static final FunctionDescriptor GetClipboardSequenceNumber$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetClipboardSequenceNumber$MH = RuntimeHelper.downcallHandle(
        "GetClipboardSequenceNumber",
        constants$508.GetClipboardSequenceNumber$FUNC
    );
    static final FunctionDescriptor GetClipboardOwner$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle GetClipboardOwner$MH = RuntimeHelper.downcallHandle(
        "GetClipboardOwner",
        constants$508.GetClipboardOwner$FUNC
    );
    static final FunctionDescriptor SetClipboardViewer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetClipboardViewer$MH = RuntimeHelper.downcallHandle(
        "SetClipboardViewer",
        constants$508.SetClipboardViewer$FUNC
    );
    static final FunctionDescriptor GetClipboardViewer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle GetClipboardViewer$MH = RuntimeHelper.downcallHandle(
        "GetClipboardViewer",
        constants$508.GetClipboardViewer$FUNC
    );
    static final FunctionDescriptor ChangeClipboardChain$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ChangeClipboardChain$MH = RuntimeHelper.downcallHandle(
        "ChangeClipboardChain",
        constants$508.ChangeClipboardChain$FUNC
    );
}

