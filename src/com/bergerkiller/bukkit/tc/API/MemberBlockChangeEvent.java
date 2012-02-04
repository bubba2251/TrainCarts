package com.bergerkiller.bukkit.tc.API;

import org.bukkit.block.Block;
import org.bukkit.event.HandlerList;

import com.bergerkiller.bukkit.common.utils.CommonUtil;
import com.bergerkiller.bukkit.tc.MinecartMember;

public class MemberBlockChangeEvent extends MemberEvent {
	private static final long serialVersionUID = 1L;
    private static final HandlerList handlers = new HandlerList();
    public HandlerList getHandlers() {
        return handlers;
    }
    public static HandlerList getHandlerList() {
        return handlers;
    }
	
	private final Block from;
	private final Block to;
	private MemberBlockChangeEvent(final MinecartMember member, final Block from, final Block to) {
		super("MemberBlockChangeEvent", member);
		this.from = from;
		this.to = to;
	}
	
	public Block getFrom() {
		return this.from;
	}
	public Block getTo() {
		return this.to;
	}
		
	public static void call(final MinecartMember member, final Block from, final Block to) {
		CommonUtil.callEvent(new MemberBlockChangeEvent(member, from, to));
	}

}
