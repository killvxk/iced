// SPDX-License-Identifier: MIT
// Copyright (C) 2018-present iced project and contributors

// ⚠️This file was generated by GENERATOR!🦹‍♂️

package com.github.icedland.iced.x86.asm;

import com.github.icedland.iced.x86.ICRegister;
import com.github.icedland.iced.x86.Register;

/**
 * An assembler register used with {@link CodeAssembler}.
 */
public final class AsmRegisterK {
	/**
	 * Creates a new instance.
	 *
	 * @param register Register
	 */
	public AsmRegisterK(ICRegister register) {
		if (!Register.isK(register.get()))
			throw new IllegalArgumentException("Invalid register value. Must be a K register");
		this.register = register;
		this.flags = AsmOperandFlags.NONE;
	}

	private final ICRegister register;

	/**
	 * The register value
	 */
	public ICRegister get() {
		return register;
	}

	/**
	 * The register value (a {@link com.github.icedland.iced.x86.Register} enum variant)
	 */
	public int getRegister() {
		return register.get();
	}

	/**
	 * Creates a new instance.
	 *
	 * @param register Register
	 * @param flags Flags (an {@link AsmOperandFlags} flags value)
	 */
	public AsmRegisterK(ICRegister register, int flags) {
		if (!Register.isK(register.get()))
			throw new IllegalArgumentException("Invalid register value. Must be a K register");
		this.register = register;
		this.flags = flags;
	}

	final int flags;

	/**
	 * Apply op mask register {@code K1}.
	 */
	public AsmRegisterK k1() {
		return new AsmRegisterK(register, (flags & ~AsmOperandFlags.REGISTER_MASK) | AsmOperandFlags.K1);
	}

	/**
	 * Apply op mask register {@code K2}.
	 */
	public AsmRegisterK k2() {
		return new AsmRegisterK(register, (flags & ~AsmOperandFlags.REGISTER_MASK) | AsmOperandFlags.K2);
	}

	/**
	 * Apply op mask register {@code K3}.
	 */
	public AsmRegisterK k3() {
		return new AsmRegisterK(register, (flags & ~AsmOperandFlags.REGISTER_MASK) | AsmOperandFlags.K3);
	}

	/**
	 * Apply op mask register {@code K4}.
	 */
	public AsmRegisterK k4() {
		return new AsmRegisterK(register, (flags & ~AsmOperandFlags.REGISTER_MASK) | AsmOperandFlags.K4);
	}

	/**
	 * Apply op mask register {@code K5}.
	 */
	public AsmRegisterK k5() {
		return new AsmRegisterK(register, (flags & ~AsmOperandFlags.REGISTER_MASK) | AsmOperandFlags.K5);
	}

	/**
	 * Apply op mask register {@code K6}.
	 */
	public AsmRegisterK k6() {
		return new AsmRegisterK(register, (flags & ~AsmOperandFlags.REGISTER_MASK) | AsmOperandFlags.K6);
	}

	/**
	 * Apply op mask register {@code K7}.
	 */
	public AsmRegisterK k7() {
		return new AsmRegisterK(register, (flags & ~AsmOperandFlags.REGISTER_MASK) | AsmOperandFlags.K7);
	}

	/**
	 * Apply op mask zeroing.
	 */
	public AsmRegisterK z() {
		return new AsmRegisterK(register, flags | AsmOperandFlags.ZEROING);
	}

	/** Checks if {@code obj} equals this object */
	@Override
	public boolean equals(Object obj) {
		if (obj == null || getClass() != obj.getClass())
			return false;
		AsmRegisterK other = (AsmRegisterK)obj;
		return register.get() == other.register.get() && flags == other.flags;
	}

	/** Gets the hash code */
	@Override
	public int hashCode() {
		return (register.get() * 397) ^ flags;
	}

	/** toString() */
	@Override
	public String toString() {
		return String.format("Register %d, flags: %d", getRegister(), flags);
	}
}