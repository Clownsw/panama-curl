// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagPDEXW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("lStructSize"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("hwndOwner"),
        Constants$root.C_POINTER$LAYOUT.withName("hDevMode"),
        Constants$root.C_POINTER$LAYOUT.withName("hDevNames"),
        Constants$root.C_POINTER$LAYOUT.withName("hDC"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        Constants$root.C_LONG$LAYOUT.withName("Flags2"),
        Constants$root.C_LONG$LAYOUT.withName("ExclusionFlags"),
        Constants$root.C_LONG$LAYOUT.withName("nPageRanges"),
        Constants$root.C_LONG$LAYOUT.withName("nMaxPageRanges"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpPageRanges"),
        Constants$root.C_LONG$LAYOUT.withName("nMinPage"),
        Constants$root.C_LONG$LAYOUT.withName("nMaxPage"),
        Constants$root.C_LONG$LAYOUT.withName("nCopies"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("hInstance"),
        Constants$root.C_POINTER$LAYOUT.withName("lpPrintTemplateName"),
        Constants$root.C_POINTER$LAYOUT.withName("lpCallback"),
        Constants$root.C_LONG$LAYOUT.withName("nPropertyPages"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lphPropertyPages"),
        Constants$root.C_LONG$LAYOUT.withName("nStartPage"),
        Constants$root.C_LONG$LAYOUT.withName("dwResultAction")
    ).withName("tagPDEXW");
    public static MemoryLayout $LAYOUT() {
        return tagPDEXW.$struct$LAYOUT;
    }
    static final VarHandle lStructSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lStructSize"));
    public static VarHandle lStructSize$VH() {
        return tagPDEXW.lStructSize$VH;
    }
    public static int lStructSize$get(MemorySegment seg) {
        return (int)tagPDEXW.lStructSize$VH.get(seg);
    }
    public static void lStructSize$set( MemorySegment seg, int x) {
        tagPDEXW.lStructSize$VH.set(seg, x);
    }
    public static int lStructSize$get(MemorySegment seg, long index) {
        return (int)tagPDEXW.lStructSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lStructSize$set(MemorySegment seg, long index, int x) {
        tagPDEXW.lStructSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwndOwner$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hwndOwner"));
    public static VarHandle hwndOwner$VH() {
        return tagPDEXW.hwndOwner$VH;
    }
    public static MemoryAddress hwndOwner$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagPDEXW.hwndOwner$VH.get(seg);
    }
    public static void hwndOwner$set( MemorySegment seg, MemoryAddress x) {
        tagPDEXW.hwndOwner$VH.set(seg, x);
    }
    public static MemoryAddress hwndOwner$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagPDEXW.hwndOwner$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndOwner$set(MemorySegment seg, long index, MemoryAddress x) {
        tagPDEXW.hwndOwner$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hDevMode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hDevMode"));
    public static VarHandle hDevMode$VH() {
        return tagPDEXW.hDevMode$VH;
    }
    public static MemoryAddress hDevMode$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagPDEXW.hDevMode$VH.get(seg);
    }
    public static void hDevMode$set( MemorySegment seg, MemoryAddress x) {
        tagPDEXW.hDevMode$VH.set(seg, x);
    }
    public static MemoryAddress hDevMode$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagPDEXW.hDevMode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hDevMode$set(MemorySegment seg, long index, MemoryAddress x) {
        tagPDEXW.hDevMode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hDevNames$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hDevNames"));
    public static VarHandle hDevNames$VH() {
        return tagPDEXW.hDevNames$VH;
    }
    public static MemoryAddress hDevNames$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagPDEXW.hDevNames$VH.get(seg);
    }
    public static void hDevNames$set( MemorySegment seg, MemoryAddress x) {
        tagPDEXW.hDevNames$VH.set(seg, x);
    }
    public static MemoryAddress hDevNames$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagPDEXW.hDevNames$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hDevNames$set(MemorySegment seg, long index, MemoryAddress x) {
        tagPDEXW.hDevNames$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hDC$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hDC"));
    public static VarHandle hDC$VH() {
        return tagPDEXW.hDC$VH;
    }
    public static MemoryAddress hDC$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagPDEXW.hDC$VH.get(seg);
    }
    public static void hDC$set( MemorySegment seg, MemoryAddress x) {
        tagPDEXW.hDC$VH.set(seg, x);
    }
    public static MemoryAddress hDC$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagPDEXW.hDC$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hDC$set(MemorySegment seg, long index, MemoryAddress x) {
        tagPDEXW.hDC$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return tagPDEXW.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)tagPDEXW.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        tagPDEXW.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)tagPDEXW.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        tagPDEXW.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags2"));
    public static VarHandle Flags2$VH() {
        return tagPDEXW.Flags2$VH;
    }
    public static int Flags2$get(MemorySegment seg) {
        return (int)tagPDEXW.Flags2$VH.get(seg);
    }
    public static void Flags2$set( MemorySegment seg, int x) {
        tagPDEXW.Flags2$VH.set(seg, x);
    }
    public static int Flags2$get(MemorySegment seg, long index) {
        return (int)tagPDEXW.Flags2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags2$set(MemorySegment seg, long index, int x) {
        tagPDEXW.Flags2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ExclusionFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ExclusionFlags"));
    public static VarHandle ExclusionFlags$VH() {
        return tagPDEXW.ExclusionFlags$VH;
    }
    public static int ExclusionFlags$get(MemorySegment seg) {
        return (int)tagPDEXW.ExclusionFlags$VH.get(seg);
    }
    public static void ExclusionFlags$set( MemorySegment seg, int x) {
        tagPDEXW.ExclusionFlags$VH.set(seg, x);
    }
    public static int ExclusionFlags$get(MemorySegment seg, long index) {
        return (int)tagPDEXW.ExclusionFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ExclusionFlags$set(MemorySegment seg, long index, int x) {
        tagPDEXW.ExclusionFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nPageRanges$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nPageRanges"));
    public static VarHandle nPageRanges$VH() {
        return tagPDEXW.nPageRanges$VH;
    }
    public static int nPageRanges$get(MemorySegment seg) {
        return (int)tagPDEXW.nPageRanges$VH.get(seg);
    }
    public static void nPageRanges$set( MemorySegment seg, int x) {
        tagPDEXW.nPageRanges$VH.set(seg, x);
    }
    public static int nPageRanges$get(MemorySegment seg, long index) {
        return (int)tagPDEXW.nPageRanges$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nPageRanges$set(MemorySegment seg, long index, int x) {
        tagPDEXW.nPageRanges$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nMaxPageRanges$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nMaxPageRanges"));
    public static VarHandle nMaxPageRanges$VH() {
        return tagPDEXW.nMaxPageRanges$VH;
    }
    public static int nMaxPageRanges$get(MemorySegment seg) {
        return (int)tagPDEXW.nMaxPageRanges$VH.get(seg);
    }
    public static void nMaxPageRanges$set( MemorySegment seg, int x) {
        tagPDEXW.nMaxPageRanges$VH.set(seg, x);
    }
    public static int nMaxPageRanges$get(MemorySegment seg, long index) {
        return (int)tagPDEXW.nMaxPageRanges$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nMaxPageRanges$set(MemorySegment seg, long index, int x) {
        tagPDEXW.nMaxPageRanges$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpPageRanges$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpPageRanges"));
    public static VarHandle lpPageRanges$VH() {
        return tagPDEXW.lpPageRanges$VH;
    }
    public static MemoryAddress lpPageRanges$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagPDEXW.lpPageRanges$VH.get(seg);
    }
    public static void lpPageRanges$set( MemorySegment seg, MemoryAddress x) {
        tagPDEXW.lpPageRanges$VH.set(seg, x);
    }
    public static MemoryAddress lpPageRanges$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagPDEXW.lpPageRanges$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpPageRanges$set(MemorySegment seg, long index, MemoryAddress x) {
        tagPDEXW.lpPageRanges$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nMinPage$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nMinPage"));
    public static VarHandle nMinPage$VH() {
        return tagPDEXW.nMinPage$VH;
    }
    public static int nMinPage$get(MemorySegment seg) {
        return (int)tagPDEXW.nMinPage$VH.get(seg);
    }
    public static void nMinPage$set( MemorySegment seg, int x) {
        tagPDEXW.nMinPage$VH.set(seg, x);
    }
    public static int nMinPage$get(MemorySegment seg, long index) {
        return (int)tagPDEXW.nMinPage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nMinPage$set(MemorySegment seg, long index, int x) {
        tagPDEXW.nMinPage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nMaxPage$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nMaxPage"));
    public static VarHandle nMaxPage$VH() {
        return tagPDEXW.nMaxPage$VH;
    }
    public static int nMaxPage$get(MemorySegment seg) {
        return (int)tagPDEXW.nMaxPage$VH.get(seg);
    }
    public static void nMaxPage$set( MemorySegment seg, int x) {
        tagPDEXW.nMaxPage$VH.set(seg, x);
    }
    public static int nMaxPage$get(MemorySegment seg, long index) {
        return (int)tagPDEXW.nMaxPage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nMaxPage$set(MemorySegment seg, long index, int x) {
        tagPDEXW.nMaxPage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nCopies$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nCopies"));
    public static VarHandle nCopies$VH() {
        return tagPDEXW.nCopies$VH;
    }
    public static int nCopies$get(MemorySegment seg) {
        return (int)tagPDEXW.nCopies$VH.get(seg);
    }
    public static void nCopies$set( MemorySegment seg, int x) {
        tagPDEXW.nCopies$VH.set(seg, x);
    }
    public static int nCopies$get(MemorySegment seg, long index) {
        return (int)tagPDEXW.nCopies$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nCopies$set(MemorySegment seg, long index, int x) {
        tagPDEXW.nCopies$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hInstance$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hInstance"));
    public static VarHandle hInstance$VH() {
        return tagPDEXW.hInstance$VH;
    }
    public static MemoryAddress hInstance$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagPDEXW.hInstance$VH.get(seg);
    }
    public static void hInstance$set( MemorySegment seg, MemoryAddress x) {
        tagPDEXW.hInstance$VH.set(seg, x);
    }
    public static MemoryAddress hInstance$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagPDEXW.hInstance$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hInstance$set(MemorySegment seg, long index, MemoryAddress x) {
        tagPDEXW.hInstance$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpPrintTemplateName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpPrintTemplateName"));
    public static VarHandle lpPrintTemplateName$VH() {
        return tagPDEXW.lpPrintTemplateName$VH;
    }
    public static MemoryAddress lpPrintTemplateName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagPDEXW.lpPrintTemplateName$VH.get(seg);
    }
    public static void lpPrintTemplateName$set( MemorySegment seg, MemoryAddress x) {
        tagPDEXW.lpPrintTemplateName$VH.set(seg, x);
    }
    public static MemoryAddress lpPrintTemplateName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagPDEXW.lpPrintTemplateName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpPrintTemplateName$set(MemorySegment seg, long index, MemoryAddress x) {
        tagPDEXW.lpPrintTemplateName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpCallback$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpCallback"));
    public static VarHandle lpCallback$VH() {
        return tagPDEXW.lpCallback$VH;
    }
    public static MemoryAddress lpCallback$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagPDEXW.lpCallback$VH.get(seg);
    }
    public static void lpCallback$set( MemorySegment seg, MemoryAddress x) {
        tagPDEXW.lpCallback$VH.set(seg, x);
    }
    public static MemoryAddress lpCallback$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagPDEXW.lpCallback$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpCallback$set(MemorySegment seg, long index, MemoryAddress x) {
        tagPDEXW.lpCallback$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nPropertyPages$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nPropertyPages"));
    public static VarHandle nPropertyPages$VH() {
        return tagPDEXW.nPropertyPages$VH;
    }
    public static int nPropertyPages$get(MemorySegment seg) {
        return (int)tagPDEXW.nPropertyPages$VH.get(seg);
    }
    public static void nPropertyPages$set( MemorySegment seg, int x) {
        tagPDEXW.nPropertyPages$VH.set(seg, x);
    }
    public static int nPropertyPages$get(MemorySegment seg, long index) {
        return (int)tagPDEXW.nPropertyPages$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nPropertyPages$set(MemorySegment seg, long index, int x) {
        tagPDEXW.nPropertyPages$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lphPropertyPages$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lphPropertyPages"));
    public static VarHandle lphPropertyPages$VH() {
        return tagPDEXW.lphPropertyPages$VH;
    }
    public static MemoryAddress lphPropertyPages$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagPDEXW.lphPropertyPages$VH.get(seg);
    }
    public static void lphPropertyPages$set( MemorySegment seg, MemoryAddress x) {
        tagPDEXW.lphPropertyPages$VH.set(seg, x);
    }
    public static MemoryAddress lphPropertyPages$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagPDEXW.lphPropertyPages$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lphPropertyPages$set(MemorySegment seg, long index, MemoryAddress x) {
        tagPDEXW.lphPropertyPages$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nStartPage$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nStartPage"));
    public static VarHandle nStartPage$VH() {
        return tagPDEXW.nStartPage$VH;
    }
    public static int nStartPage$get(MemorySegment seg) {
        return (int)tagPDEXW.nStartPage$VH.get(seg);
    }
    public static void nStartPage$set( MemorySegment seg, int x) {
        tagPDEXW.nStartPage$VH.set(seg, x);
    }
    public static int nStartPage$get(MemorySegment seg, long index) {
        return (int)tagPDEXW.nStartPage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nStartPage$set(MemorySegment seg, long index, int x) {
        tagPDEXW.nStartPage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwResultAction$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwResultAction"));
    public static VarHandle dwResultAction$VH() {
        return tagPDEXW.dwResultAction$VH;
    }
    public static int dwResultAction$get(MemorySegment seg) {
        return (int)tagPDEXW.dwResultAction$VH.get(seg);
    }
    public static void dwResultAction$set( MemorySegment seg, int x) {
        tagPDEXW.dwResultAction$VH.set(seg, x);
    }
    public static int dwResultAction$get(MemorySegment seg, long index) {
        return (int)tagPDEXW.dwResultAction$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwResultAction$set(MemorySegment seg, long index, int x) {
        tagPDEXW.dwResultAction$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

