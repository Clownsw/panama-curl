// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _tagSOFTDISTINFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        Constants$root.C_LONG$LAYOUT.withName("dwAdState"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("szTitle"),
        Constants$root.C_POINTER$LAYOUT.withName("szAbstract"),
        Constants$root.C_POINTER$LAYOUT.withName("szHREF"),
        Constants$root.C_LONG$LAYOUT.withName("dwInstalledVersionMS"),
        Constants$root.C_LONG$LAYOUT.withName("dwInstalledVersionLS"),
        Constants$root.C_LONG$LAYOUT.withName("dwUpdateVersionMS"),
        Constants$root.C_LONG$LAYOUT.withName("dwUpdateVersionLS"),
        Constants$root.C_LONG$LAYOUT.withName("dwAdvertisedVersionMS"),
        Constants$root.C_LONG$LAYOUT.withName("dwAdvertisedVersionLS"),
        Constants$root.C_LONG$LAYOUT.withName("dwReserved"),
        MemoryLayout.paddingLayout(32)
    ).withName("_tagSOFTDISTINFO");
    public static MemoryLayout $LAYOUT() {
        return _tagSOFTDISTINFO.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _tagSOFTDISTINFO.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_tagSOFTDISTINFO.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _tagSOFTDISTINFO.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_tagSOFTDISTINFO.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _tagSOFTDISTINFO.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return _tagSOFTDISTINFO.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)_tagSOFTDISTINFO.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        _tagSOFTDISTINFO.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)_tagSOFTDISTINFO.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        _tagSOFTDISTINFO.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwAdState$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwAdState"));
    public static VarHandle dwAdState$VH() {
        return _tagSOFTDISTINFO.dwAdState$VH;
    }
    public static int dwAdState$get(MemorySegment seg) {
        return (int)_tagSOFTDISTINFO.dwAdState$VH.get(seg);
    }
    public static void dwAdState$set( MemorySegment seg, int x) {
        _tagSOFTDISTINFO.dwAdState$VH.set(seg, x);
    }
    public static int dwAdState$get(MemorySegment seg, long index) {
        return (int)_tagSOFTDISTINFO.dwAdState$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwAdState$set(MemorySegment seg, long index, int x) {
        _tagSOFTDISTINFO.dwAdState$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle szTitle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("szTitle"));
    public static VarHandle szTitle$VH() {
        return _tagSOFTDISTINFO.szTitle$VH;
    }
    public static MemoryAddress szTitle$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_tagSOFTDISTINFO.szTitle$VH.get(seg);
    }
    public static void szTitle$set( MemorySegment seg, MemoryAddress x) {
        _tagSOFTDISTINFO.szTitle$VH.set(seg, x);
    }
    public static MemoryAddress szTitle$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_tagSOFTDISTINFO.szTitle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void szTitle$set(MemorySegment seg, long index, MemoryAddress x) {
        _tagSOFTDISTINFO.szTitle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle szAbstract$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("szAbstract"));
    public static VarHandle szAbstract$VH() {
        return _tagSOFTDISTINFO.szAbstract$VH;
    }
    public static MemoryAddress szAbstract$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_tagSOFTDISTINFO.szAbstract$VH.get(seg);
    }
    public static void szAbstract$set( MemorySegment seg, MemoryAddress x) {
        _tagSOFTDISTINFO.szAbstract$VH.set(seg, x);
    }
    public static MemoryAddress szAbstract$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_tagSOFTDISTINFO.szAbstract$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void szAbstract$set(MemorySegment seg, long index, MemoryAddress x) {
        _tagSOFTDISTINFO.szAbstract$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle szHREF$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("szHREF"));
    public static VarHandle szHREF$VH() {
        return _tagSOFTDISTINFO.szHREF$VH;
    }
    public static MemoryAddress szHREF$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_tagSOFTDISTINFO.szHREF$VH.get(seg);
    }
    public static void szHREF$set( MemorySegment seg, MemoryAddress x) {
        _tagSOFTDISTINFO.szHREF$VH.set(seg, x);
    }
    public static MemoryAddress szHREF$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_tagSOFTDISTINFO.szHREF$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void szHREF$set(MemorySegment seg, long index, MemoryAddress x) {
        _tagSOFTDISTINFO.szHREF$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwInstalledVersionMS$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwInstalledVersionMS"));
    public static VarHandle dwInstalledVersionMS$VH() {
        return _tagSOFTDISTINFO.dwInstalledVersionMS$VH;
    }
    public static int dwInstalledVersionMS$get(MemorySegment seg) {
        return (int)_tagSOFTDISTINFO.dwInstalledVersionMS$VH.get(seg);
    }
    public static void dwInstalledVersionMS$set( MemorySegment seg, int x) {
        _tagSOFTDISTINFO.dwInstalledVersionMS$VH.set(seg, x);
    }
    public static int dwInstalledVersionMS$get(MemorySegment seg, long index) {
        return (int)_tagSOFTDISTINFO.dwInstalledVersionMS$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwInstalledVersionMS$set(MemorySegment seg, long index, int x) {
        _tagSOFTDISTINFO.dwInstalledVersionMS$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwInstalledVersionLS$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwInstalledVersionLS"));
    public static VarHandle dwInstalledVersionLS$VH() {
        return _tagSOFTDISTINFO.dwInstalledVersionLS$VH;
    }
    public static int dwInstalledVersionLS$get(MemorySegment seg) {
        return (int)_tagSOFTDISTINFO.dwInstalledVersionLS$VH.get(seg);
    }
    public static void dwInstalledVersionLS$set( MemorySegment seg, int x) {
        _tagSOFTDISTINFO.dwInstalledVersionLS$VH.set(seg, x);
    }
    public static int dwInstalledVersionLS$get(MemorySegment seg, long index) {
        return (int)_tagSOFTDISTINFO.dwInstalledVersionLS$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwInstalledVersionLS$set(MemorySegment seg, long index, int x) {
        _tagSOFTDISTINFO.dwInstalledVersionLS$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwUpdateVersionMS$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwUpdateVersionMS"));
    public static VarHandle dwUpdateVersionMS$VH() {
        return _tagSOFTDISTINFO.dwUpdateVersionMS$VH;
    }
    public static int dwUpdateVersionMS$get(MemorySegment seg) {
        return (int)_tagSOFTDISTINFO.dwUpdateVersionMS$VH.get(seg);
    }
    public static void dwUpdateVersionMS$set( MemorySegment seg, int x) {
        _tagSOFTDISTINFO.dwUpdateVersionMS$VH.set(seg, x);
    }
    public static int dwUpdateVersionMS$get(MemorySegment seg, long index) {
        return (int)_tagSOFTDISTINFO.dwUpdateVersionMS$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwUpdateVersionMS$set(MemorySegment seg, long index, int x) {
        _tagSOFTDISTINFO.dwUpdateVersionMS$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwUpdateVersionLS$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwUpdateVersionLS"));
    public static VarHandle dwUpdateVersionLS$VH() {
        return _tagSOFTDISTINFO.dwUpdateVersionLS$VH;
    }
    public static int dwUpdateVersionLS$get(MemorySegment seg) {
        return (int)_tagSOFTDISTINFO.dwUpdateVersionLS$VH.get(seg);
    }
    public static void dwUpdateVersionLS$set( MemorySegment seg, int x) {
        _tagSOFTDISTINFO.dwUpdateVersionLS$VH.set(seg, x);
    }
    public static int dwUpdateVersionLS$get(MemorySegment seg, long index) {
        return (int)_tagSOFTDISTINFO.dwUpdateVersionLS$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwUpdateVersionLS$set(MemorySegment seg, long index, int x) {
        _tagSOFTDISTINFO.dwUpdateVersionLS$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwAdvertisedVersionMS$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwAdvertisedVersionMS"));
    public static VarHandle dwAdvertisedVersionMS$VH() {
        return _tagSOFTDISTINFO.dwAdvertisedVersionMS$VH;
    }
    public static int dwAdvertisedVersionMS$get(MemorySegment seg) {
        return (int)_tagSOFTDISTINFO.dwAdvertisedVersionMS$VH.get(seg);
    }
    public static void dwAdvertisedVersionMS$set( MemorySegment seg, int x) {
        _tagSOFTDISTINFO.dwAdvertisedVersionMS$VH.set(seg, x);
    }
    public static int dwAdvertisedVersionMS$get(MemorySegment seg, long index) {
        return (int)_tagSOFTDISTINFO.dwAdvertisedVersionMS$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwAdvertisedVersionMS$set(MemorySegment seg, long index, int x) {
        _tagSOFTDISTINFO.dwAdvertisedVersionMS$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwAdvertisedVersionLS$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwAdvertisedVersionLS"));
    public static VarHandle dwAdvertisedVersionLS$VH() {
        return _tagSOFTDISTINFO.dwAdvertisedVersionLS$VH;
    }
    public static int dwAdvertisedVersionLS$get(MemorySegment seg) {
        return (int)_tagSOFTDISTINFO.dwAdvertisedVersionLS$VH.get(seg);
    }
    public static void dwAdvertisedVersionLS$set( MemorySegment seg, int x) {
        _tagSOFTDISTINFO.dwAdvertisedVersionLS$VH.set(seg, x);
    }
    public static int dwAdvertisedVersionLS$get(MemorySegment seg, long index) {
        return (int)_tagSOFTDISTINFO.dwAdvertisedVersionLS$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwAdvertisedVersionLS$set(MemorySegment seg, long index, int x) {
        _tagSOFTDISTINFO.dwAdvertisedVersionLS$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwReserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwReserved"));
    public static VarHandle dwReserved$VH() {
        return _tagSOFTDISTINFO.dwReserved$VH;
    }
    public static int dwReserved$get(MemorySegment seg) {
        return (int)_tagSOFTDISTINFO.dwReserved$VH.get(seg);
    }
    public static void dwReserved$set( MemorySegment seg, int x) {
        _tagSOFTDISTINFO.dwReserved$VH.set(seg, x);
    }
    public static int dwReserved$get(MemorySegment seg, long index) {
        return (int)_tagSOFTDISTINFO.dwReserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwReserved$set(MemorySegment seg, long index, int x) {
        _tagSOFTDISTINFO.dwReserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


