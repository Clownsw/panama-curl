// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagNONCLIENTMETRICSW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("iBorderWidth"),
        Constants$root.C_LONG$LAYOUT.withName("iScrollWidth"),
        Constants$root.C_LONG$LAYOUT.withName("iScrollHeight"),
        Constants$root.C_LONG$LAYOUT.withName("iCaptionWidth"),
        Constants$root.C_LONG$LAYOUT.withName("iCaptionHeight"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("lfHeight"),
            Constants$root.C_LONG$LAYOUT.withName("lfWidth"),
            Constants$root.C_LONG$LAYOUT.withName("lfEscapement"),
            Constants$root.C_LONG$LAYOUT.withName("lfOrientation"),
            Constants$root.C_LONG$LAYOUT.withName("lfWeight"),
            Constants$root.C_CHAR$LAYOUT.withName("lfItalic"),
            Constants$root.C_CHAR$LAYOUT.withName("lfUnderline"),
            Constants$root.C_CHAR$LAYOUT.withName("lfStrikeOut"),
            Constants$root.C_CHAR$LAYOUT.withName("lfCharSet"),
            Constants$root.C_CHAR$LAYOUT.withName("lfOutPrecision"),
            Constants$root.C_CHAR$LAYOUT.withName("lfClipPrecision"),
            Constants$root.C_CHAR$LAYOUT.withName("lfQuality"),
            Constants$root.C_CHAR$LAYOUT.withName("lfPitchAndFamily"),
            MemoryLayout.sequenceLayout(32, Constants$root.C_SHORT$LAYOUT).withName("lfFaceName")
        ).withName("lfCaptionFont"),
        Constants$root.C_LONG$LAYOUT.withName("iSmCaptionWidth"),
        Constants$root.C_LONG$LAYOUT.withName("iSmCaptionHeight"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("lfHeight"),
            Constants$root.C_LONG$LAYOUT.withName("lfWidth"),
            Constants$root.C_LONG$LAYOUT.withName("lfEscapement"),
            Constants$root.C_LONG$LAYOUT.withName("lfOrientation"),
            Constants$root.C_LONG$LAYOUT.withName("lfWeight"),
            Constants$root.C_CHAR$LAYOUT.withName("lfItalic"),
            Constants$root.C_CHAR$LAYOUT.withName("lfUnderline"),
            Constants$root.C_CHAR$LAYOUT.withName("lfStrikeOut"),
            Constants$root.C_CHAR$LAYOUT.withName("lfCharSet"),
            Constants$root.C_CHAR$LAYOUT.withName("lfOutPrecision"),
            Constants$root.C_CHAR$LAYOUT.withName("lfClipPrecision"),
            Constants$root.C_CHAR$LAYOUT.withName("lfQuality"),
            Constants$root.C_CHAR$LAYOUT.withName("lfPitchAndFamily"),
            MemoryLayout.sequenceLayout(32, Constants$root.C_SHORT$LAYOUT).withName("lfFaceName")
        ).withName("lfSmCaptionFont"),
        Constants$root.C_LONG$LAYOUT.withName("iMenuWidth"),
        Constants$root.C_LONG$LAYOUT.withName("iMenuHeight"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("lfHeight"),
            Constants$root.C_LONG$LAYOUT.withName("lfWidth"),
            Constants$root.C_LONG$LAYOUT.withName("lfEscapement"),
            Constants$root.C_LONG$LAYOUT.withName("lfOrientation"),
            Constants$root.C_LONG$LAYOUT.withName("lfWeight"),
            Constants$root.C_CHAR$LAYOUT.withName("lfItalic"),
            Constants$root.C_CHAR$LAYOUT.withName("lfUnderline"),
            Constants$root.C_CHAR$LAYOUT.withName("lfStrikeOut"),
            Constants$root.C_CHAR$LAYOUT.withName("lfCharSet"),
            Constants$root.C_CHAR$LAYOUT.withName("lfOutPrecision"),
            Constants$root.C_CHAR$LAYOUT.withName("lfClipPrecision"),
            Constants$root.C_CHAR$LAYOUT.withName("lfQuality"),
            Constants$root.C_CHAR$LAYOUT.withName("lfPitchAndFamily"),
            MemoryLayout.sequenceLayout(32, Constants$root.C_SHORT$LAYOUT).withName("lfFaceName")
        ).withName("lfMenuFont"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("lfHeight"),
            Constants$root.C_LONG$LAYOUT.withName("lfWidth"),
            Constants$root.C_LONG$LAYOUT.withName("lfEscapement"),
            Constants$root.C_LONG$LAYOUT.withName("lfOrientation"),
            Constants$root.C_LONG$LAYOUT.withName("lfWeight"),
            Constants$root.C_CHAR$LAYOUT.withName("lfItalic"),
            Constants$root.C_CHAR$LAYOUT.withName("lfUnderline"),
            Constants$root.C_CHAR$LAYOUT.withName("lfStrikeOut"),
            Constants$root.C_CHAR$LAYOUT.withName("lfCharSet"),
            Constants$root.C_CHAR$LAYOUT.withName("lfOutPrecision"),
            Constants$root.C_CHAR$LAYOUT.withName("lfClipPrecision"),
            Constants$root.C_CHAR$LAYOUT.withName("lfQuality"),
            Constants$root.C_CHAR$LAYOUT.withName("lfPitchAndFamily"),
            MemoryLayout.sequenceLayout(32, Constants$root.C_SHORT$LAYOUT).withName("lfFaceName")
        ).withName("lfStatusFont"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("lfHeight"),
            Constants$root.C_LONG$LAYOUT.withName("lfWidth"),
            Constants$root.C_LONG$LAYOUT.withName("lfEscapement"),
            Constants$root.C_LONG$LAYOUT.withName("lfOrientation"),
            Constants$root.C_LONG$LAYOUT.withName("lfWeight"),
            Constants$root.C_CHAR$LAYOUT.withName("lfItalic"),
            Constants$root.C_CHAR$LAYOUT.withName("lfUnderline"),
            Constants$root.C_CHAR$LAYOUT.withName("lfStrikeOut"),
            Constants$root.C_CHAR$LAYOUT.withName("lfCharSet"),
            Constants$root.C_CHAR$LAYOUT.withName("lfOutPrecision"),
            Constants$root.C_CHAR$LAYOUT.withName("lfClipPrecision"),
            Constants$root.C_CHAR$LAYOUT.withName("lfQuality"),
            Constants$root.C_CHAR$LAYOUT.withName("lfPitchAndFamily"),
            MemoryLayout.sequenceLayout(32, Constants$root.C_SHORT$LAYOUT).withName("lfFaceName")
        ).withName("lfMessageFont"),
        Constants$root.C_LONG$LAYOUT.withName("iPaddedBorderWidth")
    ).withName("tagNONCLIENTMETRICSW");
    public static MemoryLayout $LAYOUT() {
        return tagNONCLIENTMETRICSW.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return tagNONCLIENTMETRICSW.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)tagNONCLIENTMETRICSW.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        tagNONCLIENTMETRICSW.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)tagNONCLIENTMETRICSW.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        tagNONCLIENTMETRICSW.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iBorderWidth$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iBorderWidth"));
    public static VarHandle iBorderWidth$VH() {
        return tagNONCLIENTMETRICSW.iBorderWidth$VH;
    }
    public static int iBorderWidth$get(MemorySegment seg) {
        return (int)tagNONCLIENTMETRICSW.iBorderWidth$VH.get(seg);
    }
    public static void iBorderWidth$set( MemorySegment seg, int x) {
        tagNONCLIENTMETRICSW.iBorderWidth$VH.set(seg, x);
    }
    public static int iBorderWidth$get(MemorySegment seg, long index) {
        return (int)tagNONCLIENTMETRICSW.iBorderWidth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iBorderWidth$set(MemorySegment seg, long index, int x) {
        tagNONCLIENTMETRICSW.iBorderWidth$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iScrollWidth$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iScrollWidth"));
    public static VarHandle iScrollWidth$VH() {
        return tagNONCLIENTMETRICSW.iScrollWidth$VH;
    }
    public static int iScrollWidth$get(MemorySegment seg) {
        return (int)tagNONCLIENTMETRICSW.iScrollWidth$VH.get(seg);
    }
    public static void iScrollWidth$set( MemorySegment seg, int x) {
        tagNONCLIENTMETRICSW.iScrollWidth$VH.set(seg, x);
    }
    public static int iScrollWidth$get(MemorySegment seg, long index) {
        return (int)tagNONCLIENTMETRICSW.iScrollWidth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iScrollWidth$set(MemorySegment seg, long index, int x) {
        tagNONCLIENTMETRICSW.iScrollWidth$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iScrollHeight$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iScrollHeight"));
    public static VarHandle iScrollHeight$VH() {
        return tagNONCLIENTMETRICSW.iScrollHeight$VH;
    }
    public static int iScrollHeight$get(MemorySegment seg) {
        return (int)tagNONCLIENTMETRICSW.iScrollHeight$VH.get(seg);
    }
    public static void iScrollHeight$set( MemorySegment seg, int x) {
        tagNONCLIENTMETRICSW.iScrollHeight$VH.set(seg, x);
    }
    public static int iScrollHeight$get(MemorySegment seg, long index) {
        return (int)tagNONCLIENTMETRICSW.iScrollHeight$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iScrollHeight$set(MemorySegment seg, long index, int x) {
        tagNONCLIENTMETRICSW.iScrollHeight$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iCaptionWidth$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iCaptionWidth"));
    public static VarHandle iCaptionWidth$VH() {
        return tagNONCLIENTMETRICSW.iCaptionWidth$VH;
    }
    public static int iCaptionWidth$get(MemorySegment seg) {
        return (int)tagNONCLIENTMETRICSW.iCaptionWidth$VH.get(seg);
    }
    public static void iCaptionWidth$set( MemorySegment seg, int x) {
        tagNONCLIENTMETRICSW.iCaptionWidth$VH.set(seg, x);
    }
    public static int iCaptionWidth$get(MemorySegment seg, long index) {
        return (int)tagNONCLIENTMETRICSW.iCaptionWidth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iCaptionWidth$set(MemorySegment seg, long index, int x) {
        tagNONCLIENTMETRICSW.iCaptionWidth$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iCaptionHeight$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iCaptionHeight"));
    public static VarHandle iCaptionHeight$VH() {
        return tagNONCLIENTMETRICSW.iCaptionHeight$VH;
    }
    public static int iCaptionHeight$get(MemorySegment seg) {
        return (int)tagNONCLIENTMETRICSW.iCaptionHeight$VH.get(seg);
    }
    public static void iCaptionHeight$set( MemorySegment seg, int x) {
        tagNONCLIENTMETRICSW.iCaptionHeight$VH.set(seg, x);
    }
    public static int iCaptionHeight$get(MemorySegment seg, long index) {
        return (int)tagNONCLIENTMETRICSW.iCaptionHeight$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iCaptionHeight$set(MemorySegment seg, long index, int x) {
        tagNONCLIENTMETRICSW.iCaptionHeight$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment lfCaptionFont$slice(MemorySegment seg) {
        return seg.asSlice(24, 92);
    }
    static final VarHandle iSmCaptionWidth$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iSmCaptionWidth"));
    public static VarHandle iSmCaptionWidth$VH() {
        return tagNONCLIENTMETRICSW.iSmCaptionWidth$VH;
    }
    public static int iSmCaptionWidth$get(MemorySegment seg) {
        return (int)tagNONCLIENTMETRICSW.iSmCaptionWidth$VH.get(seg);
    }
    public static void iSmCaptionWidth$set( MemorySegment seg, int x) {
        tagNONCLIENTMETRICSW.iSmCaptionWidth$VH.set(seg, x);
    }
    public static int iSmCaptionWidth$get(MemorySegment seg, long index) {
        return (int)tagNONCLIENTMETRICSW.iSmCaptionWidth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iSmCaptionWidth$set(MemorySegment seg, long index, int x) {
        tagNONCLIENTMETRICSW.iSmCaptionWidth$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iSmCaptionHeight$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iSmCaptionHeight"));
    public static VarHandle iSmCaptionHeight$VH() {
        return tagNONCLIENTMETRICSW.iSmCaptionHeight$VH;
    }
    public static int iSmCaptionHeight$get(MemorySegment seg) {
        return (int)tagNONCLIENTMETRICSW.iSmCaptionHeight$VH.get(seg);
    }
    public static void iSmCaptionHeight$set( MemorySegment seg, int x) {
        tagNONCLIENTMETRICSW.iSmCaptionHeight$VH.set(seg, x);
    }
    public static int iSmCaptionHeight$get(MemorySegment seg, long index) {
        return (int)tagNONCLIENTMETRICSW.iSmCaptionHeight$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iSmCaptionHeight$set(MemorySegment seg, long index, int x) {
        tagNONCLIENTMETRICSW.iSmCaptionHeight$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment lfSmCaptionFont$slice(MemorySegment seg) {
        return seg.asSlice(124, 92);
    }
    static final VarHandle iMenuWidth$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iMenuWidth"));
    public static VarHandle iMenuWidth$VH() {
        return tagNONCLIENTMETRICSW.iMenuWidth$VH;
    }
    public static int iMenuWidth$get(MemorySegment seg) {
        return (int)tagNONCLIENTMETRICSW.iMenuWidth$VH.get(seg);
    }
    public static void iMenuWidth$set( MemorySegment seg, int x) {
        tagNONCLIENTMETRICSW.iMenuWidth$VH.set(seg, x);
    }
    public static int iMenuWidth$get(MemorySegment seg, long index) {
        return (int)tagNONCLIENTMETRICSW.iMenuWidth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iMenuWidth$set(MemorySegment seg, long index, int x) {
        tagNONCLIENTMETRICSW.iMenuWidth$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iMenuHeight$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iMenuHeight"));
    public static VarHandle iMenuHeight$VH() {
        return tagNONCLIENTMETRICSW.iMenuHeight$VH;
    }
    public static int iMenuHeight$get(MemorySegment seg) {
        return (int)tagNONCLIENTMETRICSW.iMenuHeight$VH.get(seg);
    }
    public static void iMenuHeight$set( MemorySegment seg, int x) {
        tagNONCLIENTMETRICSW.iMenuHeight$VH.set(seg, x);
    }
    public static int iMenuHeight$get(MemorySegment seg, long index) {
        return (int)tagNONCLIENTMETRICSW.iMenuHeight$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iMenuHeight$set(MemorySegment seg, long index, int x) {
        tagNONCLIENTMETRICSW.iMenuHeight$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment lfMenuFont$slice(MemorySegment seg) {
        return seg.asSlice(224, 92);
    }
    public static MemorySegment lfStatusFont$slice(MemorySegment seg) {
        return seg.asSlice(316, 92);
    }
    public static MemorySegment lfMessageFont$slice(MemorySegment seg) {
        return seg.asSlice(408, 92);
    }
    static final VarHandle iPaddedBorderWidth$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iPaddedBorderWidth"));
    public static VarHandle iPaddedBorderWidth$VH() {
        return tagNONCLIENTMETRICSW.iPaddedBorderWidth$VH;
    }
    public static int iPaddedBorderWidth$get(MemorySegment seg) {
        return (int)tagNONCLIENTMETRICSW.iPaddedBorderWidth$VH.get(seg);
    }
    public static void iPaddedBorderWidth$set( MemorySegment seg, int x) {
        tagNONCLIENTMETRICSW.iPaddedBorderWidth$VH.set(seg, x);
    }
    public static int iPaddedBorderWidth$get(MemorySegment seg, long index) {
        return (int)tagNONCLIENTMETRICSW.iPaddedBorderWidth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iPaddedBorderWidth$set(MemorySegment seg, long index, int x) {
        tagNONCLIENTMETRICSW.iPaddedBorderWidth$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


