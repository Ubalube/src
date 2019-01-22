package com.ubalube.scifiaddon.util.packets;

import java.io.IOException;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.INetHandlerPlayServer;

public class CPacketSteerVehicle implements IPacket<PacketHandler>
{
    private boolean left;
    private boolean right;

    public CPacketSteerVehicle()
    {
    }

    public CPacketSteerVehicle(boolean p_i46873_1_, boolean p_i46873_2_)
    {
        this.left = p_i46873_1_;
        this.right = p_i46873_2_;
    }

    /**
     * Reads the raw packet data from the data stream.
     */
    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.left = buf.readBoolean();
        this.right = buf.readBoolean();
    }

    /**
     * Writes the raw packet data to the data stream.
     */
    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeBoolean(this.left);
        buf.writeBoolean(this.right);
    }

    /**
     * Passes this Packet on to the NetHandler for processing.
     */
    @Override
	public void processPacket(PacketHandler handler) {
		handler.processSteerVehicle(this);
	}

    public boolean getLeft()
    {
        return this.left;
    }

    public boolean getRight()
    {
        return this.right;
    }

	
}
