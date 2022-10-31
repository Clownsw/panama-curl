// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GET_CHANGER_PARAMETERS {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        Constants$root.C_SHORT$LAYOUT.withName("NumberTransportElements"),
        Constants$root.C_SHORT$LAYOUT.withName("NumberStorageElements"),
        Constants$root.C_SHORT$LAYOUT.withName("NumberCleanerSlots"),
        Constants$root.C_SHORT$LAYOUT.withName("NumberIEElements"),
        Constants$root.C_SHORT$LAYOUT.withName("NumberDataTransferElements"),
        Constants$root.C_SHORT$LAYOUT.withName("NumberOfDoors"),
        Constants$root.C_SHORT$LAYOUT.withName("FirstSlotNumber"),
        Constants$root.C_SHORT$LAYOUT.withName("FirstDriveNumber"),
        Constants$root.C_SHORT$LAYOUT.withName("FirstTransportNumber"),
        Constants$root.C_SHORT$LAYOUT.withName("FirstIEPortNumber"),
        Constants$root.C_SHORT$LAYOUT.withName("FirstCleanerSlotAddress"),
        Constants$root.C_SHORT$LAYOUT.withName("MagazineSize"),
        Constants$root.C_LONG$LAYOUT.withName("DriveCleanTimeout"),
        Constants$root.C_LONG$LAYOUT.withName("Features0"),
        Constants$root.C_LONG$LAYOUT.withName("Features1"),
        Constants$root.C_CHAR$LAYOUT.withName("MoveFromTransport"),
        Constants$root.C_CHAR$LAYOUT.withName("MoveFromSlot"),
        Constants$root.C_CHAR$LAYOUT.withName("MoveFromIePort"),
        Constants$root.C_CHAR$LAYOUT.withName("MoveFromDrive"),
        Constants$root.C_CHAR$LAYOUT.withName("ExchangeFromTransport"),
        Constants$root.C_CHAR$LAYOUT.withName("ExchangeFromSlot"),
        Constants$root.C_CHAR$LAYOUT.withName("ExchangeFromIePort"),
        Constants$root.C_CHAR$LAYOUT.withName("ExchangeFromDrive"),
        Constants$root.C_CHAR$LAYOUT.withName("LockUnlockCapabilities"),
        Constants$root.C_CHAR$LAYOUT.withName("PositionCapabilities"),
        MemoryLayout.sequenceLayout(2, Constants$root.C_CHAR$LAYOUT).withName("Reserved1"),
        MemoryLayout.sequenceLayout(2, Constants$root.C_LONG$LAYOUT).withName("Reserved2")
    ).withName("_GET_CHANGER_PARAMETERS");
    public static MemoryLayout $LAYOUT() {
        return _GET_CHANGER_PARAMETERS.$struct$LAYOUT;
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _GET_CHANGER_PARAMETERS.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_GET_CHANGER_PARAMETERS.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _GET_CHANGER_PARAMETERS.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_GET_CHANGER_PARAMETERS.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _GET_CHANGER_PARAMETERS.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberTransportElements$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberTransportElements"));
    public static VarHandle NumberTransportElements$VH() {
        return _GET_CHANGER_PARAMETERS.NumberTransportElements$VH;
    }
    public static short NumberTransportElements$get(MemorySegment seg) {
        return (short)_GET_CHANGER_PARAMETERS.NumberTransportElements$VH.get(seg);
    }
    public static void NumberTransportElements$set( MemorySegment seg, short x) {
        _GET_CHANGER_PARAMETERS.NumberTransportElements$VH.set(seg, x);
    }
    public static short NumberTransportElements$get(MemorySegment seg, long index) {
        return (short)_GET_CHANGER_PARAMETERS.NumberTransportElements$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberTransportElements$set(MemorySegment seg, long index, short x) {
        _GET_CHANGER_PARAMETERS.NumberTransportElements$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberStorageElements$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberStorageElements"));
    public static VarHandle NumberStorageElements$VH() {
        return _GET_CHANGER_PARAMETERS.NumberStorageElements$VH;
    }
    public static short NumberStorageElements$get(MemorySegment seg) {
        return (short)_GET_CHANGER_PARAMETERS.NumberStorageElements$VH.get(seg);
    }
    public static void NumberStorageElements$set( MemorySegment seg, short x) {
        _GET_CHANGER_PARAMETERS.NumberStorageElements$VH.set(seg, x);
    }
    public static short NumberStorageElements$get(MemorySegment seg, long index) {
        return (short)_GET_CHANGER_PARAMETERS.NumberStorageElements$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberStorageElements$set(MemorySegment seg, long index, short x) {
        _GET_CHANGER_PARAMETERS.NumberStorageElements$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberCleanerSlots$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberCleanerSlots"));
    public static VarHandle NumberCleanerSlots$VH() {
        return _GET_CHANGER_PARAMETERS.NumberCleanerSlots$VH;
    }
    public static short NumberCleanerSlots$get(MemorySegment seg) {
        return (short)_GET_CHANGER_PARAMETERS.NumberCleanerSlots$VH.get(seg);
    }
    public static void NumberCleanerSlots$set( MemorySegment seg, short x) {
        _GET_CHANGER_PARAMETERS.NumberCleanerSlots$VH.set(seg, x);
    }
    public static short NumberCleanerSlots$get(MemorySegment seg, long index) {
        return (short)_GET_CHANGER_PARAMETERS.NumberCleanerSlots$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberCleanerSlots$set(MemorySegment seg, long index, short x) {
        _GET_CHANGER_PARAMETERS.NumberCleanerSlots$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberIEElements$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberIEElements"));
    public static VarHandle NumberIEElements$VH() {
        return _GET_CHANGER_PARAMETERS.NumberIEElements$VH;
    }
    public static short NumberIEElements$get(MemorySegment seg) {
        return (short)_GET_CHANGER_PARAMETERS.NumberIEElements$VH.get(seg);
    }
    public static void NumberIEElements$set( MemorySegment seg, short x) {
        _GET_CHANGER_PARAMETERS.NumberIEElements$VH.set(seg, x);
    }
    public static short NumberIEElements$get(MemorySegment seg, long index) {
        return (short)_GET_CHANGER_PARAMETERS.NumberIEElements$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberIEElements$set(MemorySegment seg, long index, short x) {
        _GET_CHANGER_PARAMETERS.NumberIEElements$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberDataTransferElements$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberDataTransferElements"));
    public static VarHandle NumberDataTransferElements$VH() {
        return _GET_CHANGER_PARAMETERS.NumberDataTransferElements$VH;
    }
    public static short NumberDataTransferElements$get(MemorySegment seg) {
        return (short)_GET_CHANGER_PARAMETERS.NumberDataTransferElements$VH.get(seg);
    }
    public static void NumberDataTransferElements$set( MemorySegment seg, short x) {
        _GET_CHANGER_PARAMETERS.NumberDataTransferElements$VH.set(seg, x);
    }
    public static short NumberDataTransferElements$get(MemorySegment seg, long index) {
        return (short)_GET_CHANGER_PARAMETERS.NumberDataTransferElements$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberDataTransferElements$set(MemorySegment seg, long index, short x) {
        _GET_CHANGER_PARAMETERS.NumberDataTransferElements$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfDoors$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfDoors"));
    public static VarHandle NumberOfDoors$VH() {
        return _GET_CHANGER_PARAMETERS.NumberOfDoors$VH;
    }
    public static short NumberOfDoors$get(MemorySegment seg) {
        return (short)_GET_CHANGER_PARAMETERS.NumberOfDoors$VH.get(seg);
    }
    public static void NumberOfDoors$set( MemorySegment seg, short x) {
        _GET_CHANGER_PARAMETERS.NumberOfDoors$VH.set(seg, x);
    }
    public static short NumberOfDoors$get(MemorySegment seg, long index) {
        return (short)_GET_CHANGER_PARAMETERS.NumberOfDoors$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfDoors$set(MemorySegment seg, long index, short x) {
        _GET_CHANGER_PARAMETERS.NumberOfDoors$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FirstSlotNumber$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FirstSlotNumber"));
    public static VarHandle FirstSlotNumber$VH() {
        return _GET_CHANGER_PARAMETERS.FirstSlotNumber$VH;
    }
    public static short FirstSlotNumber$get(MemorySegment seg) {
        return (short)_GET_CHANGER_PARAMETERS.FirstSlotNumber$VH.get(seg);
    }
    public static void FirstSlotNumber$set( MemorySegment seg, short x) {
        _GET_CHANGER_PARAMETERS.FirstSlotNumber$VH.set(seg, x);
    }
    public static short FirstSlotNumber$get(MemorySegment seg, long index) {
        return (short)_GET_CHANGER_PARAMETERS.FirstSlotNumber$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FirstSlotNumber$set(MemorySegment seg, long index, short x) {
        _GET_CHANGER_PARAMETERS.FirstSlotNumber$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FirstDriveNumber$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FirstDriveNumber"));
    public static VarHandle FirstDriveNumber$VH() {
        return _GET_CHANGER_PARAMETERS.FirstDriveNumber$VH;
    }
    public static short FirstDriveNumber$get(MemorySegment seg) {
        return (short)_GET_CHANGER_PARAMETERS.FirstDriveNumber$VH.get(seg);
    }
    public static void FirstDriveNumber$set( MemorySegment seg, short x) {
        _GET_CHANGER_PARAMETERS.FirstDriveNumber$VH.set(seg, x);
    }
    public static short FirstDriveNumber$get(MemorySegment seg, long index) {
        return (short)_GET_CHANGER_PARAMETERS.FirstDriveNumber$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FirstDriveNumber$set(MemorySegment seg, long index, short x) {
        _GET_CHANGER_PARAMETERS.FirstDriveNumber$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FirstTransportNumber$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FirstTransportNumber"));
    public static VarHandle FirstTransportNumber$VH() {
        return _GET_CHANGER_PARAMETERS.FirstTransportNumber$VH;
    }
    public static short FirstTransportNumber$get(MemorySegment seg) {
        return (short)_GET_CHANGER_PARAMETERS.FirstTransportNumber$VH.get(seg);
    }
    public static void FirstTransportNumber$set( MemorySegment seg, short x) {
        _GET_CHANGER_PARAMETERS.FirstTransportNumber$VH.set(seg, x);
    }
    public static short FirstTransportNumber$get(MemorySegment seg, long index) {
        return (short)_GET_CHANGER_PARAMETERS.FirstTransportNumber$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FirstTransportNumber$set(MemorySegment seg, long index, short x) {
        _GET_CHANGER_PARAMETERS.FirstTransportNumber$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FirstIEPortNumber$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FirstIEPortNumber"));
    public static VarHandle FirstIEPortNumber$VH() {
        return _GET_CHANGER_PARAMETERS.FirstIEPortNumber$VH;
    }
    public static short FirstIEPortNumber$get(MemorySegment seg) {
        return (short)_GET_CHANGER_PARAMETERS.FirstIEPortNumber$VH.get(seg);
    }
    public static void FirstIEPortNumber$set( MemorySegment seg, short x) {
        _GET_CHANGER_PARAMETERS.FirstIEPortNumber$VH.set(seg, x);
    }
    public static short FirstIEPortNumber$get(MemorySegment seg, long index) {
        return (short)_GET_CHANGER_PARAMETERS.FirstIEPortNumber$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FirstIEPortNumber$set(MemorySegment seg, long index, short x) {
        _GET_CHANGER_PARAMETERS.FirstIEPortNumber$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FirstCleanerSlotAddress$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FirstCleanerSlotAddress"));
    public static VarHandle FirstCleanerSlotAddress$VH() {
        return _GET_CHANGER_PARAMETERS.FirstCleanerSlotAddress$VH;
    }
    public static short FirstCleanerSlotAddress$get(MemorySegment seg) {
        return (short)_GET_CHANGER_PARAMETERS.FirstCleanerSlotAddress$VH.get(seg);
    }
    public static void FirstCleanerSlotAddress$set( MemorySegment seg, short x) {
        _GET_CHANGER_PARAMETERS.FirstCleanerSlotAddress$VH.set(seg, x);
    }
    public static short FirstCleanerSlotAddress$get(MemorySegment seg, long index) {
        return (short)_GET_CHANGER_PARAMETERS.FirstCleanerSlotAddress$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FirstCleanerSlotAddress$set(MemorySegment seg, long index, short x) {
        _GET_CHANGER_PARAMETERS.FirstCleanerSlotAddress$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MagazineSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MagazineSize"));
    public static VarHandle MagazineSize$VH() {
        return _GET_CHANGER_PARAMETERS.MagazineSize$VH;
    }
    public static short MagazineSize$get(MemorySegment seg) {
        return (short)_GET_CHANGER_PARAMETERS.MagazineSize$VH.get(seg);
    }
    public static void MagazineSize$set( MemorySegment seg, short x) {
        _GET_CHANGER_PARAMETERS.MagazineSize$VH.set(seg, x);
    }
    public static short MagazineSize$get(MemorySegment seg, long index) {
        return (short)_GET_CHANGER_PARAMETERS.MagazineSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MagazineSize$set(MemorySegment seg, long index, short x) {
        _GET_CHANGER_PARAMETERS.MagazineSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DriveCleanTimeout$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DriveCleanTimeout"));
    public static VarHandle DriveCleanTimeout$VH() {
        return _GET_CHANGER_PARAMETERS.DriveCleanTimeout$VH;
    }
    public static int DriveCleanTimeout$get(MemorySegment seg) {
        return (int)_GET_CHANGER_PARAMETERS.DriveCleanTimeout$VH.get(seg);
    }
    public static void DriveCleanTimeout$set( MemorySegment seg, int x) {
        _GET_CHANGER_PARAMETERS.DriveCleanTimeout$VH.set(seg, x);
    }
    public static int DriveCleanTimeout$get(MemorySegment seg, long index) {
        return (int)_GET_CHANGER_PARAMETERS.DriveCleanTimeout$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DriveCleanTimeout$set(MemorySegment seg, long index, int x) {
        _GET_CHANGER_PARAMETERS.DriveCleanTimeout$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Features0$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Features0"));
    public static VarHandle Features0$VH() {
        return _GET_CHANGER_PARAMETERS.Features0$VH;
    }
    public static int Features0$get(MemorySegment seg) {
        return (int)_GET_CHANGER_PARAMETERS.Features0$VH.get(seg);
    }
    public static void Features0$set( MemorySegment seg, int x) {
        _GET_CHANGER_PARAMETERS.Features0$VH.set(seg, x);
    }
    public static int Features0$get(MemorySegment seg, long index) {
        return (int)_GET_CHANGER_PARAMETERS.Features0$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Features0$set(MemorySegment seg, long index, int x) {
        _GET_CHANGER_PARAMETERS.Features0$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Features1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Features1"));
    public static VarHandle Features1$VH() {
        return _GET_CHANGER_PARAMETERS.Features1$VH;
    }
    public static int Features1$get(MemorySegment seg) {
        return (int)_GET_CHANGER_PARAMETERS.Features1$VH.get(seg);
    }
    public static void Features1$set( MemorySegment seg, int x) {
        _GET_CHANGER_PARAMETERS.Features1$VH.set(seg, x);
    }
    public static int Features1$get(MemorySegment seg, long index) {
        return (int)_GET_CHANGER_PARAMETERS.Features1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Features1$set(MemorySegment seg, long index, int x) {
        _GET_CHANGER_PARAMETERS.Features1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MoveFromTransport$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MoveFromTransport"));
    public static VarHandle MoveFromTransport$VH() {
        return _GET_CHANGER_PARAMETERS.MoveFromTransport$VH;
    }
    public static byte MoveFromTransport$get(MemorySegment seg) {
        return (byte)_GET_CHANGER_PARAMETERS.MoveFromTransport$VH.get(seg);
    }
    public static void MoveFromTransport$set( MemorySegment seg, byte x) {
        _GET_CHANGER_PARAMETERS.MoveFromTransport$VH.set(seg, x);
    }
    public static byte MoveFromTransport$get(MemorySegment seg, long index) {
        return (byte)_GET_CHANGER_PARAMETERS.MoveFromTransport$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MoveFromTransport$set(MemorySegment seg, long index, byte x) {
        _GET_CHANGER_PARAMETERS.MoveFromTransport$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MoveFromSlot$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MoveFromSlot"));
    public static VarHandle MoveFromSlot$VH() {
        return _GET_CHANGER_PARAMETERS.MoveFromSlot$VH;
    }
    public static byte MoveFromSlot$get(MemorySegment seg) {
        return (byte)_GET_CHANGER_PARAMETERS.MoveFromSlot$VH.get(seg);
    }
    public static void MoveFromSlot$set( MemorySegment seg, byte x) {
        _GET_CHANGER_PARAMETERS.MoveFromSlot$VH.set(seg, x);
    }
    public static byte MoveFromSlot$get(MemorySegment seg, long index) {
        return (byte)_GET_CHANGER_PARAMETERS.MoveFromSlot$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MoveFromSlot$set(MemorySegment seg, long index, byte x) {
        _GET_CHANGER_PARAMETERS.MoveFromSlot$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MoveFromIePort$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MoveFromIePort"));
    public static VarHandle MoveFromIePort$VH() {
        return _GET_CHANGER_PARAMETERS.MoveFromIePort$VH;
    }
    public static byte MoveFromIePort$get(MemorySegment seg) {
        return (byte)_GET_CHANGER_PARAMETERS.MoveFromIePort$VH.get(seg);
    }
    public static void MoveFromIePort$set( MemorySegment seg, byte x) {
        _GET_CHANGER_PARAMETERS.MoveFromIePort$VH.set(seg, x);
    }
    public static byte MoveFromIePort$get(MemorySegment seg, long index) {
        return (byte)_GET_CHANGER_PARAMETERS.MoveFromIePort$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MoveFromIePort$set(MemorySegment seg, long index, byte x) {
        _GET_CHANGER_PARAMETERS.MoveFromIePort$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MoveFromDrive$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MoveFromDrive"));
    public static VarHandle MoveFromDrive$VH() {
        return _GET_CHANGER_PARAMETERS.MoveFromDrive$VH;
    }
    public static byte MoveFromDrive$get(MemorySegment seg) {
        return (byte)_GET_CHANGER_PARAMETERS.MoveFromDrive$VH.get(seg);
    }
    public static void MoveFromDrive$set( MemorySegment seg, byte x) {
        _GET_CHANGER_PARAMETERS.MoveFromDrive$VH.set(seg, x);
    }
    public static byte MoveFromDrive$get(MemorySegment seg, long index) {
        return (byte)_GET_CHANGER_PARAMETERS.MoveFromDrive$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MoveFromDrive$set(MemorySegment seg, long index, byte x) {
        _GET_CHANGER_PARAMETERS.MoveFromDrive$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ExchangeFromTransport$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ExchangeFromTransport"));
    public static VarHandle ExchangeFromTransport$VH() {
        return _GET_CHANGER_PARAMETERS.ExchangeFromTransport$VH;
    }
    public static byte ExchangeFromTransport$get(MemorySegment seg) {
        return (byte)_GET_CHANGER_PARAMETERS.ExchangeFromTransport$VH.get(seg);
    }
    public static void ExchangeFromTransport$set( MemorySegment seg, byte x) {
        _GET_CHANGER_PARAMETERS.ExchangeFromTransport$VH.set(seg, x);
    }
    public static byte ExchangeFromTransport$get(MemorySegment seg, long index) {
        return (byte)_GET_CHANGER_PARAMETERS.ExchangeFromTransport$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ExchangeFromTransport$set(MemorySegment seg, long index, byte x) {
        _GET_CHANGER_PARAMETERS.ExchangeFromTransport$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ExchangeFromSlot$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ExchangeFromSlot"));
    public static VarHandle ExchangeFromSlot$VH() {
        return _GET_CHANGER_PARAMETERS.ExchangeFromSlot$VH;
    }
    public static byte ExchangeFromSlot$get(MemorySegment seg) {
        return (byte)_GET_CHANGER_PARAMETERS.ExchangeFromSlot$VH.get(seg);
    }
    public static void ExchangeFromSlot$set( MemorySegment seg, byte x) {
        _GET_CHANGER_PARAMETERS.ExchangeFromSlot$VH.set(seg, x);
    }
    public static byte ExchangeFromSlot$get(MemorySegment seg, long index) {
        return (byte)_GET_CHANGER_PARAMETERS.ExchangeFromSlot$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ExchangeFromSlot$set(MemorySegment seg, long index, byte x) {
        _GET_CHANGER_PARAMETERS.ExchangeFromSlot$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ExchangeFromIePort$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ExchangeFromIePort"));
    public static VarHandle ExchangeFromIePort$VH() {
        return _GET_CHANGER_PARAMETERS.ExchangeFromIePort$VH;
    }
    public static byte ExchangeFromIePort$get(MemorySegment seg) {
        return (byte)_GET_CHANGER_PARAMETERS.ExchangeFromIePort$VH.get(seg);
    }
    public static void ExchangeFromIePort$set( MemorySegment seg, byte x) {
        _GET_CHANGER_PARAMETERS.ExchangeFromIePort$VH.set(seg, x);
    }
    public static byte ExchangeFromIePort$get(MemorySegment seg, long index) {
        return (byte)_GET_CHANGER_PARAMETERS.ExchangeFromIePort$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ExchangeFromIePort$set(MemorySegment seg, long index, byte x) {
        _GET_CHANGER_PARAMETERS.ExchangeFromIePort$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ExchangeFromDrive$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ExchangeFromDrive"));
    public static VarHandle ExchangeFromDrive$VH() {
        return _GET_CHANGER_PARAMETERS.ExchangeFromDrive$VH;
    }
    public static byte ExchangeFromDrive$get(MemorySegment seg) {
        return (byte)_GET_CHANGER_PARAMETERS.ExchangeFromDrive$VH.get(seg);
    }
    public static void ExchangeFromDrive$set( MemorySegment seg, byte x) {
        _GET_CHANGER_PARAMETERS.ExchangeFromDrive$VH.set(seg, x);
    }
    public static byte ExchangeFromDrive$get(MemorySegment seg, long index) {
        return (byte)_GET_CHANGER_PARAMETERS.ExchangeFromDrive$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ExchangeFromDrive$set(MemorySegment seg, long index, byte x) {
        _GET_CHANGER_PARAMETERS.ExchangeFromDrive$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LockUnlockCapabilities$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LockUnlockCapabilities"));
    public static VarHandle LockUnlockCapabilities$VH() {
        return _GET_CHANGER_PARAMETERS.LockUnlockCapabilities$VH;
    }
    public static byte LockUnlockCapabilities$get(MemorySegment seg) {
        return (byte)_GET_CHANGER_PARAMETERS.LockUnlockCapabilities$VH.get(seg);
    }
    public static void LockUnlockCapabilities$set( MemorySegment seg, byte x) {
        _GET_CHANGER_PARAMETERS.LockUnlockCapabilities$VH.set(seg, x);
    }
    public static byte LockUnlockCapabilities$get(MemorySegment seg, long index) {
        return (byte)_GET_CHANGER_PARAMETERS.LockUnlockCapabilities$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LockUnlockCapabilities$set(MemorySegment seg, long index, byte x) {
        _GET_CHANGER_PARAMETERS.LockUnlockCapabilities$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PositionCapabilities$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PositionCapabilities"));
    public static VarHandle PositionCapabilities$VH() {
        return _GET_CHANGER_PARAMETERS.PositionCapabilities$VH;
    }
    public static byte PositionCapabilities$get(MemorySegment seg) {
        return (byte)_GET_CHANGER_PARAMETERS.PositionCapabilities$VH.get(seg);
    }
    public static void PositionCapabilities$set( MemorySegment seg, byte x) {
        _GET_CHANGER_PARAMETERS.PositionCapabilities$VH.set(seg, x);
    }
    public static byte PositionCapabilities$get(MemorySegment seg, long index) {
        return (byte)_GET_CHANGER_PARAMETERS.PositionCapabilities$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PositionCapabilities$set(MemorySegment seg, long index, byte x) {
        _GET_CHANGER_PARAMETERS.PositionCapabilities$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Reserved1$slice(MemorySegment seg) {
        return seg.asSlice(50, 2);
    }
    public static MemorySegment Reserved2$slice(MemorySegment seg) {
        return seg.asSlice(52, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

