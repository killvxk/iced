// SPDX-License-Identifier: MIT
// Copyright (C) 2018-present iced project and contributors

// ⚠️This file was generated by GENERATOR!🦹‍♂️

package com.github.icedland.iced.x86;

import java.util.HashMap;

public final class ToMvexTupleTypeLutKind {
	public static Integer tryGet(String key) {
		return map.get(key);
	}

	public static int get(String key) {
		Integer value = tryGet(key);
		if (value == null)
			throw new UnsupportedOperationException(String.format("Couldn't find enum variant MvexTupleTypeLutKind.%s", key));
		return value.intValue();
	}

	public static String[] names() {
		return map.entrySet().stream().sorted((a, b) -> Integer.compareUnsigned(a.getValue(), b.getValue())).map(a -> a.getKey()).toArray(String[]::new);
	}

	public static Iterable<Integer> values() {
		return map.values();
	}

	public static int size() {
		return map.size();
	}

	public static HashMap<String, Integer> copy() {
		return new HashMap<String, Integer>(map);
	}

	private static final HashMap<String, Integer> map = getMap();

	private static HashMap<String, Integer> getMap() {
		HashMap<String, Integer> map = new HashMap<String, Integer>(14);
		initMap0(map);
		return map;
	}

	private static void initMap0(HashMap<String, Integer> map) {
		map.put("Int32", MvexTupleTypeLutKind.INT32);
		map.put("Int32_Half", MvexTupleTypeLutKind.INT32_HALF);
		map.put("Int32_4to16", MvexTupleTypeLutKind.INT32_4TO16);
		map.put("Int32_1to16_or_elem", MvexTupleTypeLutKind.INT32_1TO16_OR_ELEM);
		map.put("Int64", MvexTupleTypeLutKind.INT64);
		map.put("Int64_4to8", MvexTupleTypeLutKind.INT64_4TO8);
		map.put("Int64_1to8_or_elem", MvexTupleTypeLutKind.INT64_1TO8_OR_ELEM);
		map.put("Float32", MvexTupleTypeLutKind.FLOAT32);
		map.put("Float32_Half", MvexTupleTypeLutKind.FLOAT32_HALF);
		map.put("Float32_4to16", MvexTupleTypeLutKind.FLOAT32_4TO16);
		map.put("Float32_1to16_or_elem", MvexTupleTypeLutKind.FLOAT32_1TO16_OR_ELEM);
		map.put("Float64", MvexTupleTypeLutKind.FLOAT64);
		map.put("Float64_4to8", MvexTupleTypeLutKind.FLOAT64_4TO8);
		map.put("Float64_1to8_or_elem", MvexTupleTypeLutKind.FLOAT64_1TO8_OR_ELEM);
	}
}