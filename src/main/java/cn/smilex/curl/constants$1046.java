// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1046 {

    static final  GroupLayout CLSID_CCDGenericPropertyPage$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_CCDGenericPropertyPage$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_CCDGenericPropertyPage", constants$1046.CLSID_CCDGenericPropertyPage$LAYOUT);
    static final  GroupLayout CLSID_CCDFontPropertyPage$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_CCDFontPropertyPage$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_CCDFontPropertyPage", constants$1046.CLSID_CCDFontPropertyPage$LAYOUT);
    static final  GroupLayout CLSID_CCDColorPropertyPage$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_CCDColorPropertyPage$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_CCDColorPropertyPage", constants$1046.CLSID_CCDColorPropertyPage$LAYOUT);
    static final  GroupLayout CLSID_CCDLabelPropertyPage$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_CCDLabelPropertyPage$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_CCDLabelPropertyPage", constants$1046.CLSID_CCDLabelPropertyPage$LAYOUT);
    static final  GroupLayout CLSID_CCDCheckBoxPropertyPage$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_CCDCheckBoxPropertyPage$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_CCDCheckBoxPropertyPage", constants$1046.CLSID_CCDCheckBoxPropertyPage$LAYOUT);
    static final  GroupLayout CLSID_CCDTextBoxPropertyPage$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_CCDTextBoxPropertyPage$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_CCDTextBoxPropertyPage", constants$1046.CLSID_CCDTextBoxPropertyPage$LAYOUT);
}

