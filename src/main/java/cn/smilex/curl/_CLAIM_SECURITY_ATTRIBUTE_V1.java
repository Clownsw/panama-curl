// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CLAIM_SECURITY_ATTRIBUTE_V1 {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("Name"),
        Constants$root.C_SHORT$LAYOUT.withName("ValueType"),
        Constants$root.C_SHORT$LAYOUT.withName("Reserved"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        Constants$root.C_LONG$LAYOUT.withName("ValueCount"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.unionLayout(
            Constants$root.C_POINTER$LAYOUT.withName("pInt64"),
            Constants$root.C_POINTER$LAYOUT.withName("pUint64"),
            Constants$root.C_POINTER$LAYOUT.withName("ppString"),
            Constants$root.C_POINTER$LAYOUT.withName("pFqbn"),
            Constants$root.C_POINTER$LAYOUT.withName("pOctetString")
        ).withName("Values")
    ).withName("_CLAIM_SECURITY_ATTRIBUTE_V1");
    public static MemoryLayout $LAYOUT() {
        return _CLAIM_SECURITY_ATTRIBUTE_V1.$struct$LAYOUT;
    }
    static final VarHandle Name$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Name"));
    public static VarHandle Name$VH() {
        return _CLAIM_SECURITY_ATTRIBUTE_V1.Name$VH;
    }
    public static MemoryAddress Name$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CLAIM_SECURITY_ATTRIBUTE_V1.Name$VH.get(seg);
    }
    public static void Name$set( MemorySegment seg, MemoryAddress x) {
        _CLAIM_SECURITY_ATTRIBUTE_V1.Name$VH.set(seg, x);
    }
    public static MemoryAddress Name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CLAIM_SECURITY_ATTRIBUTE_V1.Name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Name$set(MemorySegment seg, long index, MemoryAddress x) {
        _CLAIM_SECURITY_ATTRIBUTE_V1.Name$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ValueType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ValueType"));
    public static VarHandle ValueType$VH() {
        return _CLAIM_SECURITY_ATTRIBUTE_V1.ValueType$VH;
    }
    public static short ValueType$get(MemorySegment seg) {
        return (short)_CLAIM_SECURITY_ATTRIBUTE_V1.ValueType$VH.get(seg);
    }
    public static void ValueType$set( MemorySegment seg, short x) {
        _CLAIM_SECURITY_ATTRIBUTE_V1.ValueType$VH.set(seg, x);
    }
    public static short ValueType$get(MemorySegment seg, long index) {
        return (short)_CLAIM_SECURITY_ATTRIBUTE_V1.ValueType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ValueType$set(MemorySegment seg, long index, short x) {
        _CLAIM_SECURITY_ATTRIBUTE_V1.ValueType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    public static VarHandle Reserved$VH() {
        return _CLAIM_SECURITY_ATTRIBUTE_V1.Reserved$VH;
    }
    public static short Reserved$get(MemorySegment seg) {
        return (short)_CLAIM_SECURITY_ATTRIBUTE_V1.Reserved$VH.get(seg);
    }
    public static void Reserved$set( MemorySegment seg, short x) {
        _CLAIM_SECURITY_ATTRIBUTE_V1.Reserved$VH.set(seg, x);
    }
    public static short Reserved$get(MemorySegment seg, long index) {
        return (short)_CLAIM_SECURITY_ATTRIBUTE_V1.Reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, short x) {
        _CLAIM_SECURITY_ATTRIBUTE_V1.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _CLAIM_SECURITY_ATTRIBUTE_V1.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)_CLAIM_SECURITY_ATTRIBUTE_V1.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        _CLAIM_SECURITY_ATTRIBUTE_V1.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_CLAIM_SECURITY_ATTRIBUTE_V1.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _CLAIM_SECURITY_ATTRIBUTE_V1.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ValueCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ValueCount"));
    public static VarHandle ValueCount$VH() {
        return _CLAIM_SECURITY_ATTRIBUTE_V1.ValueCount$VH;
    }
    public static int ValueCount$get(MemorySegment seg) {
        return (int)_CLAIM_SECURITY_ATTRIBUTE_V1.ValueCount$VH.get(seg);
    }
    public static void ValueCount$set( MemorySegment seg, int x) {
        _CLAIM_SECURITY_ATTRIBUTE_V1.ValueCount$VH.set(seg, x);
    }
    public static int ValueCount$get(MemorySegment seg, long index) {
        return (int)_CLAIM_SECURITY_ATTRIBUTE_V1.ValueCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ValueCount$set(MemorySegment seg, long index, int x) {
        _CLAIM_SECURITY_ATTRIBUTE_V1.ValueCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static class Values {

        static final  GroupLayout Values$union$LAYOUT = MemoryLayout.unionLayout(
            Constants$root.C_POINTER$LAYOUT.withName("pInt64"),
            Constants$root.C_POINTER$LAYOUT.withName("pUint64"),
            Constants$root.C_POINTER$LAYOUT.withName("ppString"),
            Constants$root.C_POINTER$LAYOUT.withName("pFqbn"),
            Constants$root.C_POINTER$LAYOUT.withName("pOctetString")
        );
        public static MemoryLayout $LAYOUT() {
            return Values.Values$union$LAYOUT;
        }
        static final VarHandle pInt64$VH = Values$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pInt64"));
        public static VarHandle pInt64$VH() {
            return Values.pInt64$VH;
        }
        public static MemoryAddress pInt64$get(MemorySegment seg) {
            return (java.lang.foreign.MemoryAddress)Values.pInt64$VH.get(seg);
        }
        public static void pInt64$set( MemorySegment seg, MemoryAddress x) {
            Values.pInt64$VH.set(seg, x);
        }
        public static MemoryAddress pInt64$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemoryAddress)Values.pInt64$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void pInt64$set(MemorySegment seg, long index, MemoryAddress x) {
            Values.pInt64$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle pUint64$VH = Values$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pUint64"));
        public static VarHandle pUint64$VH() {
            return Values.pUint64$VH;
        }
        public static MemoryAddress pUint64$get(MemorySegment seg) {
            return (java.lang.foreign.MemoryAddress)Values.pUint64$VH.get(seg);
        }
        public static void pUint64$set( MemorySegment seg, MemoryAddress x) {
            Values.pUint64$VH.set(seg, x);
        }
        public static MemoryAddress pUint64$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemoryAddress)Values.pUint64$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void pUint64$set(MemorySegment seg, long index, MemoryAddress x) {
            Values.pUint64$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle ppString$VH = Values$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ppString"));
        public static VarHandle ppString$VH() {
            return Values.ppString$VH;
        }
        public static MemoryAddress ppString$get(MemorySegment seg) {
            return (java.lang.foreign.MemoryAddress)Values.ppString$VH.get(seg);
        }
        public static void ppString$set( MemorySegment seg, MemoryAddress x) {
            Values.ppString$VH.set(seg, x);
        }
        public static MemoryAddress ppString$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemoryAddress)Values.ppString$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void ppString$set(MemorySegment seg, long index, MemoryAddress x) {
            Values.ppString$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle pFqbn$VH = Values$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pFqbn"));
        public static VarHandle pFqbn$VH() {
            return Values.pFqbn$VH;
        }
        public static MemoryAddress pFqbn$get(MemorySegment seg) {
            return (java.lang.foreign.MemoryAddress)Values.pFqbn$VH.get(seg);
        }
        public static void pFqbn$set( MemorySegment seg, MemoryAddress x) {
            Values.pFqbn$VH.set(seg, x);
        }
        public static MemoryAddress pFqbn$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemoryAddress)Values.pFqbn$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void pFqbn$set(MemorySegment seg, long index, MemoryAddress x) {
            Values.pFqbn$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle pOctetString$VH = Values$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pOctetString"));
        public static VarHandle pOctetString$VH() {
            return Values.pOctetString$VH;
        }
        public static MemoryAddress pOctetString$get(MemorySegment seg) {
            return (java.lang.foreign.MemoryAddress)Values.pOctetString$VH.get(seg);
        }
        public static void pOctetString$set( MemorySegment seg, MemoryAddress x) {
            Values.pOctetString$VH.set(seg, x);
        }
        public static MemoryAddress pOctetString$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemoryAddress)Values.pOctetString$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void pOctetString$set(MemorySegment seg, long index, MemoryAddress x) {
            Values.pOctetString$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment Values$slice(MemorySegment seg) {
        return seg.asSlice(24, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


