// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagTYPEATTR {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("guid"),
        Constants$root.C_LONG$LAYOUT.withName("lcid"),
        Constants$root.C_LONG$LAYOUT.withName("dwReserved"),
        Constants$root.C_LONG$LAYOUT.withName("memidConstructor"),
        Constants$root.C_LONG$LAYOUT.withName("memidDestructor"),
        Constants$root.C_POINTER$LAYOUT.withName("lpstrSchema"),
        Constants$root.C_LONG$LAYOUT.withName("cbSizeInstance"),
        Constants$root.C_LONG$LAYOUT.withName("typekind"),
        Constants$root.C_SHORT$LAYOUT.withName("cFuncs"),
        Constants$root.C_SHORT$LAYOUT.withName("cVars"),
        Constants$root.C_SHORT$LAYOUT.withName("cImplTypes"),
        Constants$root.C_SHORT$LAYOUT.withName("cbSizeVft"),
        Constants$root.C_SHORT$LAYOUT.withName("cbAlignment"),
        Constants$root.C_SHORT$LAYOUT.withName("wTypeFlags"),
        Constants$root.C_SHORT$LAYOUT.withName("wMajorVerNum"),
        Constants$root.C_SHORT$LAYOUT.withName("wMinorVerNum"),
        MemoryLayout.structLayout(
            MemoryLayout.unionLayout(
                Constants$root.C_POINTER$LAYOUT.withName("lptdesc"),
                Constants$root.C_POINTER$LAYOUT.withName("lpadesc"),
                Constants$root.C_LONG$LAYOUT.withName("hreftype")
            ).withName("$anon$0"),
            Constants$root.C_SHORT$LAYOUT.withName("vt"),
            MemoryLayout.paddingLayout(48)
        ).withName("tdescAlias"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("dwReserved"),
            Constants$root.C_SHORT$LAYOUT.withName("wIDLFlags"),
            MemoryLayout.paddingLayout(48)
        ).withName("idldescType")
    ).withName("tagTYPEATTR");
    public static MemoryLayout $LAYOUT() {
        return tagTYPEATTR.$struct$LAYOUT;
    }
    public static MemorySegment guid$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final VarHandle lcid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lcid"));
    public static VarHandle lcid$VH() {
        return tagTYPEATTR.lcid$VH;
    }
    public static int lcid$get(MemorySegment seg) {
        return (int)tagTYPEATTR.lcid$VH.get(seg);
    }
    public static void lcid$set( MemorySegment seg, int x) {
        tagTYPEATTR.lcid$VH.set(seg, x);
    }
    public static int lcid$get(MemorySegment seg, long index) {
        return (int)tagTYPEATTR.lcid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lcid$set(MemorySegment seg, long index, int x) {
        tagTYPEATTR.lcid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwReserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwReserved"));
    public static VarHandle dwReserved$VH() {
        return tagTYPEATTR.dwReserved$VH;
    }
    public static int dwReserved$get(MemorySegment seg) {
        return (int)tagTYPEATTR.dwReserved$VH.get(seg);
    }
    public static void dwReserved$set( MemorySegment seg, int x) {
        tagTYPEATTR.dwReserved$VH.set(seg, x);
    }
    public static int dwReserved$get(MemorySegment seg, long index) {
        return (int)tagTYPEATTR.dwReserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwReserved$set(MemorySegment seg, long index, int x) {
        tagTYPEATTR.dwReserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle memidConstructor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("memidConstructor"));
    public static VarHandle memidConstructor$VH() {
        return tagTYPEATTR.memidConstructor$VH;
    }
    public static int memidConstructor$get(MemorySegment seg) {
        return (int)tagTYPEATTR.memidConstructor$VH.get(seg);
    }
    public static void memidConstructor$set( MemorySegment seg, int x) {
        tagTYPEATTR.memidConstructor$VH.set(seg, x);
    }
    public static int memidConstructor$get(MemorySegment seg, long index) {
        return (int)tagTYPEATTR.memidConstructor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void memidConstructor$set(MemorySegment seg, long index, int x) {
        tagTYPEATTR.memidConstructor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle memidDestructor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("memidDestructor"));
    public static VarHandle memidDestructor$VH() {
        return tagTYPEATTR.memidDestructor$VH;
    }
    public static int memidDestructor$get(MemorySegment seg) {
        return (int)tagTYPEATTR.memidDestructor$VH.get(seg);
    }
    public static void memidDestructor$set( MemorySegment seg, int x) {
        tagTYPEATTR.memidDestructor$VH.set(seg, x);
    }
    public static int memidDestructor$get(MemorySegment seg, long index) {
        return (int)tagTYPEATTR.memidDestructor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void memidDestructor$set(MemorySegment seg, long index, int x) {
        tagTYPEATTR.memidDestructor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrSchema$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpstrSchema"));
    public static VarHandle lpstrSchema$VH() {
        return tagTYPEATTR.lpstrSchema$VH;
    }
    public static MemoryAddress lpstrSchema$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagTYPEATTR.lpstrSchema$VH.get(seg);
    }
    public static void lpstrSchema$set( MemorySegment seg, MemoryAddress x) {
        tagTYPEATTR.lpstrSchema$VH.set(seg, x);
    }
    public static MemoryAddress lpstrSchema$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagTYPEATTR.lpstrSchema$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrSchema$set(MemorySegment seg, long index, MemoryAddress x) {
        tagTYPEATTR.lpstrSchema$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbSizeInstance$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSizeInstance"));
    public static VarHandle cbSizeInstance$VH() {
        return tagTYPEATTR.cbSizeInstance$VH;
    }
    public static int cbSizeInstance$get(MemorySegment seg) {
        return (int)tagTYPEATTR.cbSizeInstance$VH.get(seg);
    }
    public static void cbSizeInstance$set( MemorySegment seg, int x) {
        tagTYPEATTR.cbSizeInstance$VH.set(seg, x);
    }
    public static int cbSizeInstance$get(MemorySegment seg, long index) {
        return (int)tagTYPEATTR.cbSizeInstance$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSizeInstance$set(MemorySegment seg, long index, int x) {
        tagTYPEATTR.cbSizeInstance$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle typekind$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("typekind"));
    public static VarHandle typekind$VH() {
        return tagTYPEATTR.typekind$VH;
    }
    public static int typekind$get(MemorySegment seg) {
        return (int)tagTYPEATTR.typekind$VH.get(seg);
    }
    public static void typekind$set( MemorySegment seg, int x) {
        tagTYPEATTR.typekind$VH.set(seg, x);
    }
    public static int typekind$get(MemorySegment seg, long index) {
        return (int)tagTYPEATTR.typekind$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void typekind$set(MemorySegment seg, long index, int x) {
        tagTYPEATTR.typekind$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cFuncs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cFuncs"));
    public static VarHandle cFuncs$VH() {
        return tagTYPEATTR.cFuncs$VH;
    }
    public static short cFuncs$get(MemorySegment seg) {
        return (short)tagTYPEATTR.cFuncs$VH.get(seg);
    }
    public static void cFuncs$set( MemorySegment seg, short x) {
        tagTYPEATTR.cFuncs$VH.set(seg, x);
    }
    public static short cFuncs$get(MemorySegment seg, long index) {
        return (short)tagTYPEATTR.cFuncs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cFuncs$set(MemorySegment seg, long index, short x) {
        tagTYPEATTR.cFuncs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cVars$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cVars"));
    public static VarHandle cVars$VH() {
        return tagTYPEATTR.cVars$VH;
    }
    public static short cVars$get(MemorySegment seg) {
        return (short)tagTYPEATTR.cVars$VH.get(seg);
    }
    public static void cVars$set( MemorySegment seg, short x) {
        tagTYPEATTR.cVars$VH.set(seg, x);
    }
    public static short cVars$get(MemorySegment seg, long index) {
        return (short)tagTYPEATTR.cVars$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cVars$set(MemorySegment seg, long index, short x) {
        tagTYPEATTR.cVars$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cImplTypes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cImplTypes"));
    public static VarHandle cImplTypes$VH() {
        return tagTYPEATTR.cImplTypes$VH;
    }
    public static short cImplTypes$get(MemorySegment seg) {
        return (short)tagTYPEATTR.cImplTypes$VH.get(seg);
    }
    public static void cImplTypes$set( MemorySegment seg, short x) {
        tagTYPEATTR.cImplTypes$VH.set(seg, x);
    }
    public static short cImplTypes$get(MemorySegment seg, long index) {
        return (short)tagTYPEATTR.cImplTypes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cImplTypes$set(MemorySegment seg, long index, short x) {
        tagTYPEATTR.cImplTypes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbSizeVft$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSizeVft"));
    public static VarHandle cbSizeVft$VH() {
        return tagTYPEATTR.cbSizeVft$VH;
    }
    public static short cbSizeVft$get(MemorySegment seg) {
        return (short)tagTYPEATTR.cbSizeVft$VH.get(seg);
    }
    public static void cbSizeVft$set( MemorySegment seg, short x) {
        tagTYPEATTR.cbSizeVft$VH.set(seg, x);
    }
    public static short cbSizeVft$get(MemorySegment seg, long index) {
        return (short)tagTYPEATTR.cbSizeVft$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSizeVft$set(MemorySegment seg, long index, short x) {
        tagTYPEATTR.cbSizeVft$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbAlignment$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbAlignment"));
    public static VarHandle cbAlignment$VH() {
        return tagTYPEATTR.cbAlignment$VH;
    }
    public static short cbAlignment$get(MemorySegment seg) {
        return (short)tagTYPEATTR.cbAlignment$VH.get(seg);
    }
    public static void cbAlignment$set( MemorySegment seg, short x) {
        tagTYPEATTR.cbAlignment$VH.set(seg, x);
    }
    public static short cbAlignment$get(MemorySegment seg, long index) {
        return (short)tagTYPEATTR.cbAlignment$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbAlignment$set(MemorySegment seg, long index, short x) {
        tagTYPEATTR.cbAlignment$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wTypeFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wTypeFlags"));
    public static VarHandle wTypeFlags$VH() {
        return tagTYPEATTR.wTypeFlags$VH;
    }
    public static short wTypeFlags$get(MemorySegment seg) {
        return (short)tagTYPEATTR.wTypeFlags$VH.get(seg);
    }
    public static void wTypeFlags$set( MemorySegment seg, short x) {
        tagTYPEATTR.wTypeFlags$VH.set(seg, x);
    }
    public static short wTypeFlags$get(MemorySegment seg, long index) {
        return (short)tagTYPEATTR.wTypeFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wTypeFlags$set(MemorySegment seg, long index, short x) {
        tagTYPEATTR.wTypeFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wMajorVerNum$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wMajorVerNum"));
    public static VarHandle wMajorVerNum$VH() {
        return tagTYPEATTR.wMajorVerNum$VH;
    }
    public static short wMajorVerNum$get(MemorySegment seg) {
        return (short)tagTYPEATTR.wMajorVerNum$VH.get(seg);
    }
    public static void wMajorVerNum$set( MemorySegment seg, short x) {
        tagTYPEATTR.wMajorVerNum$VH.set(seg, x);
    }
    public static short wMajorVerNum$get(MemorySegment seg, long index) {
        return (short)tagTYPEATTR.wMajorVerNum$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wMajorVerNum$set(MemorySegment seg, long index, short x) {
        tagTYPEATTR.wMajorVerNum$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wMinorVerNum$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wMinorVerNum"));
    public static VarHandle wMinorVerNum$VH() {
        return tagTYPEATTR.wMinorVerNum$VH;
    }
    public static short wMinorVerNum$get(MemorySegment seg) {
        return (short)tagTYPEATTR.wMinorVerNum$VH.get(seg);
    }
    public static void wMinorVerNum$set( MemorySegment seg, short x) {
        tagTYPEATTR.wMinorVerNum$VH.set(seg, x);
    }
    public static short wMinorVerNum$get(MemorySegment seg, long index) {
        return (short)tagTYPEATTR.wMinorVerNum$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wMinorVerNum$set(MemorySegment seg, long index, short x) {
        tagTYPEATTR.wMinorVerNum$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment tdescAlias$slice(MemorySegment seg) {
        return seg.asSlice(64, 16);
    }
    public static MemorySegment idldescType$slice(MemorySegment seg) {
        return seg.asSlice(80, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


