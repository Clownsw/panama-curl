// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagCHOOSECOLORW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("lStructSize"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("hwndOwner"),
        Constants$root.C_POINTER$LAYOUT.withName("hInstance"),
        Constants$root.C_LONG$LAYOUT.withName("rgbResult"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpCustColors"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("lCustData"),
        Constants$root.C_POINTER$LAYOUT.withName("lpfnHook"),
        Constants$root.C_POINTER$LAYOUT.withName("lpTemplateName")
    ).withName("tagCHOOSECOLORW");
    public static MemoryLayout $LAYOUT() {
        return tagCHOOSECOLORW.$struct$LAYOUT;
    }
    static final VarHandle lStructSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lStructSize"));
    public static VarHandle lStructSize$VH() {
        return tagCHOOSECOLORW.lStructSize$VH;
    }
    public static int lStructSize$get(MemorySegment seg) {
        return (int)tagCHOOSECOLORW.lStructSize$VH.get(seg);
    }
    public static void lStructSize$set( MemorySegment seg, int x) {
        tagCHOOSECOLORW.lStructSize$VH.set(seg, x);
    }
    public static int lStructSize$get(MemorySegment seg, long index) {
        return (int)tagCHOOSECOLORW.lStructSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lStructSize$set(MemorySegment seg, long index, int x) {
        tagCHOOSECOLORW.lStructSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwndOwner$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hwndOwner"));
    public static VarHandle hwndOwner$VH() {
        return tagCHOOSECOLORW.hwndOwner$VH;
    }
    public static MemoryAddress hwndOwner$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagCHOOSECOLORW.hwndOwner$VH.get(seg);
    }
    public static void hwndOwner$set( MemorySegment seg, MemoryAddress x) {
        tagCHOOSECOLORW.hwndOwner$VH.set(seg, x);
    }
    public static MemoryAddress hwndOwner$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagCHOOSECOLORW.hwndOwner$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndOwner$set(MemorySegment seg, long index, MemoryAddress x) {
        tagCHOOSECOLORW.hwndOwner$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hInstance$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hInstance"));
    public static VarHandle hInstance$VH() {
        return tagCHOOSECOLORW.hInstance$VH;
    }
    public static MemoryAddress hInstance$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagCHOOSECOLORW.hInstance$VH.get(seg);
    }
    public static void hInstance$set( MemorySegment seg, MemoryAddress x) {
        tagCHOOSECOLORW.hInstance$VH.set(seg, x);
    }
    public static MemoryAddress hInstance$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagCHOOSECOLORW.hInstance$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hInstance$set(MemorySegment seg, long index, MemoryAddress x) {
        tagCHOOSECOLORW.hInstance$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgbResult$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgbResult"));
    public static VarHandle rgbResult$VH() {
        return tagCHOOSECOLORW.rgbResult$VH;
    }
    public static int rgbResult$get(MemorySegment seg) {
        return (int)tagCHOOSECOLORW.rgbResult$VH.get(seg);
    }
    public static void rgbResult$set( MemorySegment seg, int x) {
        tagCHOOSECOLORW.rgbResult$VH.set(seg, x);
    }
    public static int rgbResult$get(MemorySegment seg, long index) {
        return (int)tagCHOOSECOLORW.rgbResult$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgbResult$set(MemorySegment seg, long index, int x) {
        tagCHOOSECOLORW.rgbResult$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpCustColors$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpCustColors"));
    public static VarHandle lpCustColors$VH() {
        return tagCHOOSECOLORW.lpCustColors$VH;
    }
    public static MemoryAddress lpCustColors$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagCHOOSECOLORW.lpCustColors$VH.get(seg);
    }
    public static void lpCustColors$set( MemorySegment seg, MemoryAddress x) {
        tagCHOOSECOLORW.lpCustColors$VH.set(seg, x);
    }
    public static MemoryAddress lpCustColors$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagCHOOSECOLORW.lpCustColors$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpCustColors$set(MemorySegment seg, long index, MemoryAddress x) {
        tagCHOOSECOLORW.lpCustColors$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return tagCHOOSECOLORW.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)tagCHOOSECOLORW.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        tagCHOOSECOLORW.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)tagCHOOSECOLORW.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        tagCHOOSECOLORW.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lCustData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lCustData"));
    public static VarHandle lCustData$VH() {
        return tagCHOOSECOLORW.lCustData$VH;
    }
    public static long lCustData$get(MemorySegment seg) {
        return (long)tagCHOOSECOLORW.lCustData$VH.get(seg);
    }
    public static void lCustData$set( MemorySegment seg, long x) {
        tagCHOOSECOLORW.lCustData$VH.set(seg, x);
    }
    public static long lCustData$get(MemorySegment seg, long index) {
        return (long)tagCHOOSECOLORW.lCustData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lCustData$set(MemorySegment seg, long index, long x) {
        tagCHOOSECOLORW.lCustData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpfnHook$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpfnHook"));
    public static VarHandle lpfnHook$VH() {
        return tagCHOOSECOLORW.lpfnHook$VH;
    }
    public static MemoryAddress lpfnHook$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagCHOOSECOLORW.lpfnHook$VH.get(seg);
    }
    public static void lpfnHook$set( MemorySegment seg, MemoryAddress x) {
        tagCHOOSECOLORW.lpfnHook$VH.set(seg, x);
    }
    public static MemoryAddress lpfnHook$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagCHOOSECOLORW.lpfnHook$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpfnHook$set(MemorySegment seg, long index, MemoryAddress x) {
        tagCHOOSECOLORW.lpfnHook$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static LPCCHOOKPROC lpfnHook (MemorySegment segment, MemorySession session) {
        return LPCCHOOKPROC.ofAddress(lpfnHook$get(segment), session);
    }
    static final VarHandle lpTemplateName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpTemplateName"));
    public static VarHandle lpTemplateName$VH() {
        return tagCHOOSECOLORW.lpTemplateName$VH;
    }
    public static MemoryAddress lpTemplateName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagCHOOSECOLORW.lpTemplateName$VH.get(seg);
    }
    public static void lpTemplateName$set( MemorySegment seg, MemoryAddress x) {
        tagCHOOSECOLORW.lpTemplateName$VH.set(seg, x);
    }
    public static MemoryAddress lpTemplateName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagCHOOSECOLORW.lpTemplateName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpTemplateName$set(MemorySegment seg, long index, MemoryAddress x) {
        tagCHOOSECOLORW.lpTemplateName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


