// SPDX-License-Identifier: MIT
// Copyright (C) 2018-present iced project and contributors

// ⚠️This file was generated by GENERATOR!🦹‍♂️

package com.github.icedland.iced.x86.internal.dec;

/**
 * DO NOT USE: INTERNAL API
 */
public final class StateFlags {
	private StateFlags() {
	}

	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int IP_REL64 = 0x0000_0001;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int IP_REL32 = 0x0000_0002;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int HAS_REX = 0x0000_0008;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int B = 0x0000_0010;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int Z = 0x0000_0020;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int IS_INVALID = 0x0000_0040;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int W = 0x0000_0080;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int NO_IMM = 0x0000_0100;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int ADDR64 = 0x0000_0200;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int BRANCH_IMM8 = 0x0000_0400;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int XBEGIN = 0x0000_0800;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int LOCK = 0x0000_1000;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int ALLOW_LOCK = 0x0000_2000;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int NO_MORE_BYTES = 0x0000_4000;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int HAS66 = 0x0000_8000;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int MVEX_SSS_MASK = 0x0000_0007;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int MVEX_SSS_SHIFT = 0x0000_0010;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int MVEX_EH = 0x0008_0000;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int ENCODING_MASK = 0x0000_0007;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int ENCODING_SHIFT = 0x0000_001D;
}