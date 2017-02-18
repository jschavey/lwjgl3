/*
 * Copyright (c) 2014-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
package org.lwjgl.util.yoga;

import org.testng.annotations.Test;

import static org.lwjgl.util.yoga.YogaNode.*;
import static org.testng.Assert.*;

public class YGAlignItemsTest {
	@Test
	public void test_align_items_stretch() {
		YogaNode root = new YogaNode();
		root.setWidth(100f);
		root.setHeight(100f);

		YogaNode root_child0 = new YogaNode();
		root_child0.setHeight(10f);
		root.addChildAt(root_child0, 0);
		root.setDirection(YogaDirection.LTR);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);

		root.setDirection(YogaDirection.RTL);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);
	}

	@Test
	public void test_align_items_center() {
		YogaNode root = new YogaNode();
		root.setAlignItems(YogaAlign.CENTER);
		root.setWidth(100f);
		root.setHeight(100f);

		YogaNode root_child0 = new YogaNode();
		root_child0.setWidth(10f);
		root_child0.setHeight(10f);
		root.addChildAt(root_child0, 0);
		root.setDirection(YogaDirection.LTR);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(45f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(10f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);

		root.setDirection(YogaDirection.RTL);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(45f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(10f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);
	}

	@Test
	public void test_align_items_flex_start() {
		YogaNode root = new YogaNode();
		root.setAlignItems(YogaAlign.FLEX_START);
		root.setWidth(100f);
		root.setHeight(100f);

		YogaNode root_child0 = new YogaNode();
		root_child0.setWidth(10f);
		root_child0.setHeight(10f);
		root.addChildAt(root_child0, 0);
		root.setDirection(YogaDirection.LTR);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(10f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);

		root.setDirection(YogaDirection.RTL);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(90f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(10f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);
	}

	@Test
	public void test_align_items_flex_end() {
		YogaNode root = new YogaNode();
		root.setAlignItems(YogaAlign.FLEX_END);
		root.setWidth(100f);
		root.setHeight(100f);

		YogaNode root_child0 = new YogaNode();
		root_child0.setWidth(10f);
		root_child0.setHeight(10f);
		root.addChildAt(root_child0, 0);
		root.setDirection(YogaDirection.LTR);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(90f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(10f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);

		root.setDirection(YogaDirection.RTL);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(10f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);
	}

	@Test
	public void test_align_baseline() {
		YogaNode root = new YogaNode();
		root.setFlexDirection(YogaFlexDirection.ROW);
		root.setAlignItems(YogaAlign.BASELINE);
		root.setWidth(100f);
		root.setHeight(100f);

		YogaNode root_child0 = new YogaNode();
		root_child0.setWidth(50f);
		root_child0.setHeight(50f);
		root.addChildAt(root_child0, 0);

		YogaNode root_child1 = new YogaNode();
		root_child1.setWidth(50f);
		root_child1.setHeight(20f);
		root.addChildAt(root_child1, 1);
		root.setDirection(YogaDirection.LTR);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child1.getLayoutX(), 0.0f);
		assertEquals(30f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child1.getLayoutHeight(), 0.0f);

		root.setDirection(YogaDirection.RTL);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1.getLayoutX(), 0.0f);
		assertEquals(30f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child1.getLayoutHeight(), 0.0f);
	}

	@Test
	public void test_align_baseline_child() {
		YogaNode root = new YogaNode();
		root.setFlexDirection(YogaFlexDirection.ROW);
		root.setAlignItems(YogaAlign.BASELINE);
		root.setWidth(100f);
		root.setHeight(100f);

		YogaNode root_child0 = new YogaNode();
		root_child0.setWidth(50f);
		root_child0.setHeight(50f);
		root.addChildAt(root_child0, 0);

		YogaNode root_child1 = new YogaNode();
		root_child1.setWidth(50f);
		root_child1.setHeight(20f);
		root.addChildAt(root_child1, 1);

		YogaNode root_child1_child0 = new YogaNode();
		root_child1_child0.setWidth(50f);
		root_child1_child0.setHeight(10f);
		root_child1.addChildAt(root_child1_child0, 0);
		root.setDirection(YogaDirection.LTR);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child1.getLayoutX(), 0.0f);
		assertEquals(40f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1_child0.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child1_child0.getLayoutHeight(), 0.0f);

		root.setDirection(YogaDirection.RTL);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1.getLayoutX(), 0.0f);
		assertEquals(40f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1_child0.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child1_child0.getLayoutHeight(), 0.0f);
	}

	@Test
	public void test_align_baseline_child_multiline() {
		YogaNode root = new YogaNode();
		root.setFlexDirection(YogaFlexDirection.ROW);
		root.setAlignItems(YogaAlign.BASELINE);
		root.setWidth(100f);
		root.setHeight(100f);

		YogaNode root_child0 = new YogaNode();
		root_child0.setWidth(50f);
		root_child0.setHeight(60f);
		root.addChildAt(root_child0, 0);

		YogaNode root_child1 = new YogaNode();
		root_child1.setFlexDirection(YogaFlexDirection.ROW);
		root_child1.setWrap(YogaWrap.WRAP);
		root_child1.setWidth(50f);
		root_child1.setHeight(25f);
		root.addChildAt(root_child1, 1);

		YogaNode root_child1_child0 = new YogaNode();
		root_child1_child0.setWidth(25f);
		root_child1_child0.setHeight(20f);
		root_child1.addChildAt(root_child1_child0, 0);

		YogaNode root_child1_child1 = new YogaNode();
		root_child1_child1.setWidth(25f);
		root_child1_child1.setHeight(10f);
		root_child1.addChildAt(root_child1_child1, 1);

		YogaNode root_child1_child2 = new YogaNode();
		root_child1_child2.setWidth(25f);
		root_child1_child2.setHeight(20f);
		root_child1.addChildAt(root_child1_child2, 2);

		YogaNode root_child1_child3 = new YogaNode();
		root_child1_child3.setWidth(25f);
		root_child1_child3.setHeight(10f);
		root_child1.addChildAt(root_child1_child3, 3);
		root.setDirection(YogaDirection.LTR);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(60f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child1.getLayoutX(), 0.0f);
		assertEquals(40f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(25f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1_child0.getLayoutY(), 0.0f);
		assertEquals(25f, root_child1_child0.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child1_child0.getLayoutHeight(), 0.0f);

		assertEquals(25f, root_child1_child1.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1_child1.getLayoutY(), 0.0f);
		assertEquals(25f, root_child1_child1.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child1_child1.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1_child2.getLayoutX(), 0.0f);
		assertEquals(20f, root_child1_child2.getLayoutY(), 0.0f);
		assertEquals(25f, root_child1_child2.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child1_child2.getLayoutHeight(), 0.0f);

		assertEquals(25f, root_child1_child3.getLayoutX(), 0.0f);
		assertEquals(20f, root_child1_child3.getLayoutY(), 0.0f);
		assertEquals(25f, root_child1_child3.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child1_child3.getLayoutHeight(), 0.0f);

		root.setDirection(YogaDirection.RTL);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(60f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1.getLayoutX(), 0.0f);
		assertEquals(40f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(25f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(25f, root_child1_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1_child0.getLayoutY(), 0.0f);
		assertEquals(25f, root_child1_child0.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child1_child0.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1_child1.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1_child1.getLayoutY(), 0.0f);
		assertEquals(25f, root_child1_child1.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child1_child1.getLayoutHeight(), 0.0f);

		assertEquals(25f, root_child1_child2.getLayoutX(), 0.0f);
		assertEquals(20f, root_child1_child2.getLayoutY(), 0.0f);
		assertEquals(25f, root_child1_child2.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child1_child2.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1_child3.getLayoutX(), 0.0f);
		assertEquals(20f, root_child1_child3.getLayoutY(), 0.0f);
		assertEquals(25f, root_child1_child3.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child1_child3.getLayoutHeight(), 0.0f);
	}

	@Test
	public void test_align_baseline_child_multiline_override() {
		YogaNode root = new YogaNode();
		root.setFlexDirection(YogaFlexDirection.ROW);
		root.setAlignItems(YogaAlign.BASELINE);
		root.setWidth(100f);
		root.setHeight(100f);

		YogaNode root_child0 = new YogaNode();
		root_child0.setWidth(50f);
		root_child0.setHeight(60f);
		root.addChildAt(root_child0, 0);

		YogaNode root_child1 = new YogaNode();
		root_child1.setFlexDirection(YogaFlexDirection.ROW);
		root_child1.setWrap(YogaWrap.WRAP);
		root_child1.setWidth(50f);
		root_child1.setHeight(25f);
		root.addChildAt(root_child1, 1);

		YogaNode root_child1_child0 = new YogaNode();
		root_child1_child0.setWidth(25f);
		root_child1_child0.setHeight(20f);
		root_child1.addChildAt(root_child1_child0, 0);

		YogaNode root_child1_child1 = new YogaNode();
		root_child1_child1.setAlignSelf(YogaAlign.BASELINE);
		root_child1_child1.setWidth(25f);
		root_child1_child1.setHeight(10f);
		root_child1.addChildAt(root_child1_child1, 1);

		YogaNode root_child1_child2 = new YogaNode();
		root_child1_child2.setWidth(25f);
		root_child1_child2.setHeight(20f);
		root_child1.addChildAt(root_child1_child2, 2);

		YogaNode root_child1_child3 = new YogaNode();
		root_child1_child3.setAlignSelf(YogaAlign.BASELINE);
		root_child1_child3.setWidth(25f);
		root_child1_child3.setHeight(10f);
		root_child1.addChildAt(root_child1_child3, 3);
		root.setDirection(YogaDirection.LTR);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(60f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child1.getLayoutX(), 0.0f);
		assertEquals(50f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(25f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1_child0.getLayoutY(), 0.0f);
		assertEquals(25f, root_child1_child0.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child1_child0.getLayoutHeight(), 0.0f);

		assertEquals(25f, root_child1_child1.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1_child1.getLayoutY(), 0.0f);
		assertEquals(25f, root_child1_child1.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child1_child1.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1_child2.getLayoutX(), 0.0f);
		assertEquals(20f, root_child1_child2.getLayoutY(), 0.0f);
		assertEquals(25f, root_child1_child2.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child1_child2.getLayoutHeight(), 0.0f);

		assertEquals(25f, root_child1_child3.getLayoutX(), 0.0f);
		assertEquals(20f, root_child1_child3.getLayoutY(), 0.0f);
		assertEquals(25f, root_child1_child3.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child1_child3.getLayoutHeight(), 0.0f);

		root.setDirection(YogaDirection.RTL);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(60f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1.getLayoutX(), 0.0f);
		assertEquals(50f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(25f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(25f, root_child1_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1_child0.getLayoutY(), 0.0f);
		assertEquals(25f, root_child1_child0.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child1_child0.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1_child1.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1_child1.getLayoutY(), 0.0f);
		assertEquals(25f, root_child1_child1.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child1_child1.getLayoutHeight(), 0.0f);

		assertEquals(25f, root_child1_child2.getLayoutX(), 0.0f);
		assertEquals(20f, root_child1_child2.getLayoutY(), 0.0f);
		assertEquals(25f, root_child1_child2.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child1_child2.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1_child3.getLayoutX(), 0.0f);
		assertEquals(20f, root_child1_child3.getLayoutY(), 0.0f);
		assertEquals(25f, root_child1_child3.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child1_child3.getLayoutHeight(), 0.0f);
	}

	@Test
	public void test_align_baseline_child_multiline_no_override_on_secondline() {
		YogaNode root = new YogaNode();
		root.setFlexDirection(YogaFlexDirection.ROW);
		root.setAlignItems(YogaAlign.BASELINE);
		root.setWidth(100f);
		root.setHeight(100f);

		YogaNode root_child0 = new YogaNode();
		root_child0.setWidth(50f);
		root_child0.setHeight(60f);
		root.addChildAt(root_child0, 0);

		YogaNode root_child1 = new YogaNode();
		root_child1.setFlexDirection(YogaFlexDirection.ROW);
		root_child1.setWrap(YogaWrap.WRAP);
		root_child1.setWidth(50f);
		root_child1.setHeight(25f);
		root.addChildAt(root_child1, 1);

		YogaNode root_child1_child0 = new YogaNode();
		root_child1_child0.setWidth(25f);
		root_child1_child0.setHeight(20f);
		root_child1.addChildAt(root_child1_child0, 0);

		YogaNode root_child1_child1 = new YogaNode();
		root_child1_child1.setWidth(25f);
		root_child1_child1.setHeight(10f);
		root_child1.addChildAt(root_child1_child1, 1);

		YogaNode root_child1_child2 = new YogaNode();
		root_child1_child2.setWidth(25f);
		root_child1_child2.setHeight(20f);
		root_child1.addChildAt(root_child1_child2, 2);

		YogaNode root_child1_child3 = new YogaNode();
		root_child1_child3.setAlignSelf(YogaAlign.BASELINE);
		root_child1_child3.setWidth(25f);
		root_child1_child3.setHeight(10f);
		root_child1.addChildAt(root_child1_child3, 3);
		root.setDirection(YogaDirection.LTR);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(60f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child1.getLayoutX(), 0.0f);
		assertEquals(40f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(25f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1_child0.getLayoutY(), 0.0f);
		assertEquals(25f, root_child1_child0.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child1_child0.getLayoutHeight(), 0.0f);

		assertEquals(25f, root_child1_child1.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1_child1.getLayoutY(), 0.0f);
		assertEquals(25f, root_child1_child1.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child1_child1.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1_child2.getLayoutX(), 0.0f);
		assertEquals(20f, root_child1_child2.getLayoutY(), 0.0f);
		assertEquals(25f, root_child1_child2.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child1_child2.getLayoutHeight(), 0.0f);

		assertEquals(25f, root_child1_child3.getLayoutX(), 0.0f);
		assertEquals(20f, root_child1_child3.getLayoutY(), 0.0f);
		assertEquals(25f, root_child1_child3.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child1_child3.getLayoutHeight(), 0.0f);

		root.setDirection(YogaDirection.RTL);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(60f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1.getLayoutX(), 0.0f);
		assertEquals(40f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(25f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(25f, root_child1_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1_child0.getLayoutY(), 0.0f);
		assertEquals(25f, root_child1_child0.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child1_child0.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1_child1.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1_child1.getLayoutY(), 0.0f);
		assertEquals(25f, root_child1_child1.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child1_child1.getLayoutHeight(), 0.0f);

		assertEquals(25f, root_child1_child2.getLayoutX(), 0.0f);
		assertEquals(20f, root_child1_child2.getLayoutY(), 0.0f);
		assertEquals(25f, root_child1_child2.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child1_child2.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1_child3.getLayoutX(), 0.0f);
		assertEquals(20f, root_child1_child3.getLayoutY(), 0.0f);
		assertEquals(25f, root_child1_child3.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child1_child3.getLayoutHeight(), 0.0f);
	}

	@Test
	public void test_align_baseline_child_top() {
		YogaNode root = new YogaNode();
		root.setFlexDirection(YogaFlexDirection.ROW);
		root.setAlignItems(YogaAlign.BASELINE);
		root.setWidth(100f);
		root.setHeight(100f);

		YogaNode root_child0 = new YogaNode();
		root_child0.setPosition(YogaEdge.TOP, 10f);
		root_child0.setWidth(50f);
		root_child0.setHeight(50f);
		root.addChildAt(root_child0, 0);

		YogaNode root_child1 = new YogaNode();
		root_child1.setWidth(50f);
		root_child1.setHeight(20f);
		root.addChildAt(root_child1, 1);

		YogaNode root_child1_child0 = new YogaNode();
		root_child1_child0.setWidth(50f);
		root_child1_child0.setHeight(10f);
		root_child1.addChildAt(root_child1_child0, 0);
		root.setDirection(YogaDirection.LTR);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0.getLayoutX(), 0.0f);
		assertEquals(10f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child1.getLayoutX(), 0.0f);
		assertEquals(40f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1_child0.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child1_child0.getLayoutHeight(), 0.0f);

		root.setDirection(YogaDirection.RTL);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child0.getLayoutX(), 0.0f);
		assertEquals(10f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1.getLayoutX(), 0.0f);
		assertEquals(40f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1_child0.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child1_child0.getLayoutHeight(), 0.0f);
	}

	@Test
	public void test_align_baseline_child_top2() {
		YogaNode root = new YogaNode();
		root.setFlexDirection(YogaFlexDirection.ROW);
		root.setAlignItems(YogaAlign.BASELINE);
		root.setWidth(100f);
		root.setHeight(100f);

		YogaNode root_child0 = new YogaNode();
		root_child0.setWidth(50f);
		root_child0.setHeight(50f);
		root.addChildAt(root_child0, 0);

		YogaNode root_child1 = new YogaNode();
		root_child1.setPosition(YogaEdge.TOP, 5f);
		root_child1.setWidth(50f);
		root_child1.setHeight(20f);
		root.addChildAt(root_child1, 1);

		YogaNode root_child1_child0 = new YogaNode();
		root_child1_child0.setWidth(50f);
		root_child1_child0.setHeight(10f);
		root_child1.addChildAt(root_child1_child0, 0);
		root.setDirection(YogaDirection.LTR);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child1.getLayoutX(), 0.0f);
		assertEquals(45f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1_child0.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child1_child0.getLayoutHeight(), 0.0f);

		root.setDirection(YogaDirection.RTL);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1.getLayoutX(), 0.0f);
		assertEquals(45f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1_child0.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child1_child0.getLayoutHeight(), 0.0f);
	}

	@Test
	public void test_align_baseline_double_nested_child() {
		YogaNode root = new YogaNode();
		root.setFlexDirection(YogaFlexDirection.ROW);
		root.setAlignItems(YogaAlign.BASELINE);
		root.setWidth(100f);
		root.setHeight(100f);

		YogaNode root_child0 = new YogaNode();
		root_child0.setWidth(50f);
		root_child0.setHeight(50f);
		root.addChildAt(root_child0, 0);

		YogaNode root_child0_child0 = new YogaNode();
		root_child0_child0.setWidth(50f);
		root_child0_child0.setHeight(20f);
		root_child0.addChildAt(root_child0_child0, 0);

		YogaNode root_child1 = new YogaNode();
		root_child1.setWidth(50f);
		root_child1.setHeight(20f);
		root.addChildAt(root_child1, 1);

		YogaNode root_child1_child0 = new YogaNode();
		root_child1_child0.setWidth(50f);
		root_child1_child0.setHeight(15f);
		root_child1.addChildAt(root_child1_child0, 0);
		root.setDirection(YogaDirection.LTR);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0_child0.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child0_child0.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child1.getLayoutX(), 0.0f);
		assertEquals(5f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1_child0.getLayoutWidth(), 0.0f);
		assertEquals(15f, root_child1_child0.getLayoutHeight(), 0.0f);

		root.setDirection(YogaDirection.RTL);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0_child0.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child0_child0.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1.getLayoutX(), 0.0f);
		assertEquals(5f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1_child0.getLayoutWidth(), 0.0f);
		assertEquals(15f, root_child1_child0.getLayoutHeight(), 0.0f);
	}

	@Test
	public void test_align_baseline_column() {
		YogaNode root = new YogaNode();
		root.setAlignItems(YogaAlign.BASELINE);
		root.setWidth(100f);
		root.setHeight(100f);

		YogaNode root_child0 = new YogaNode();
		root_child0.setWidth(50f);
		root_child0.setHeight(50f);
		root.addChildAt(root_child0, 0);

		YogaNode root_child1 = new YogaNode();
		root_child1.setWidth(50f);
		root_child1.setHeight(20f);
		root.addChildAt(root_child1, 1);
		root.setDirection(YogaDirection.LTR);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1.getLayoutX(), 0.0f);
		assertEquals(50f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child1.getLayoutHeight(), 0.0f);

		root.setDirection(YogaDirection.RTL);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child1.getLayoutX(), 0.0f);
		assertEquals(50f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child1.getLayoutHeight(), 0.0f);
	}

	@Test
	public void test_align_baseline_child_margin() {
		YogaNode root = new YogaNode();
		root.setFlexDirection(YogaFlexDirection.ROW);
		root.setAlignItems(YogaAlign.BASELINE);
		root.setWidth(100f);
		root.setHeight(100f);

		YogaNode root_child0 = new YogaNode();
		root_child0.setMargin(YogaEdge.LEFT, 5f);
		root_child0.setMargin(YogaEdge.TOP, 5f);
		root_child0.setMargin(YogaEdge.RIGHT, 5f);
		root_child0.setMargin(YogaEdge.BOTTOM, 5f);
		root_child0.setWidth(50f);
		root_child0.setHeight(50f);
		root.addChildAt(root_child0, 0);

		YogaNode root_child1 = new YogaNode();
		root_child1.setWidth(50f);
		root_child1.setHeight(20f);
		root.addChildAt(root_child1, 1);

		YogaNode root_child1_child0 = new YogaNode();
		root_child1_child0.setMargin(YogaEdge.LEFT, 1f);
		root_child1_child0.setMargin(YogaEdge.TOP, 1f);
		root_child1_child0.setMargin(YogaEdge.RIGHT, 1f);
		root_child1_child0.setMargin(YogaEdge.BOTTOM, 1f);
		root_child1_child0.setWidth(50f);
		root_child1_child0.setHeight(10f);
		root_child1.addChildAt(root_child1_child0, 0);
		root.setDirection(YogaDirection.LTR);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(5f, root_child0.getLayoutX(), 0.0f);
		assertEquals(5f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(60f, root_child1.getLayoutX(), 0.0f);
		assertEquals(44f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(1f, root_child1_child0.getLayoutX(), 0.0f);
		assertEquals(1f, root_child1_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1_child0.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child1_child0.getLayoutHeight(), 0.0f);

		root.setDirection(YogaDirection.RTL);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(45f, root_child0.getLayoutX(), 0.0f);
		assertEquals(5f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(-10f, root_child1.getLayoutX(), 0.0f);
		assertEquals(44f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(-1f, root_child1_child0.getLayoutX(), 0.0f);
		assertEquals(1f, root_child1_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1_child0.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child1_child0.getLayoutHeight(), 0.0f);
	}

	@Test
	public void test_align_baseline_child_padding() {
		YogaNode root = new YogaNode();
		root.setFlexDirection(YogaFlexDirection.ROW);
		root.setAlignItems(YogaAlign.BASELINE);
		root.setPadding(YogaEdge.LEFT, 5);
		root.setPadding(YogaEdge.TOP, 5);
		root.setPadding(YogaEdge.RIGHT, 5);
		root.setPadding(YogaEdge.BOTTOM, 5);
		root.setWidth(100f);
		root.setHeight(100f);

		YogaNode root_child0 = new YogaNode();
		root_child0.setWidth(50f);
		root_child0.setHeight(50f);
		root.addChildAt(root_child0, 0);

		YogaNode root_child1 = new YogaNode();
		root_child1.setPadding(YogaEdge.LEFT, 5);
		root_child1.setPadding(YogaEdge.TOP, 5);
		root_child1.setPadding(YogaEdge.RIGHT, 5);
		root_child1.setPadding(YogaEdge.BOTTOM, 5);
		root_child1.setWidth(50f);
		root_child1.setHeight(20f);
		root.addChildAt(root_child1, 1);

		YogaNode root_child1_child0 = new YogaNode();
		root_child1_child0.setWidth(50f);
		root_child1_child0.setHeight(10f);
		root_child1.addChildAt(root_child1_child0, 0);
		root.setDirection(YogaDirection.LTR);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(5f, root_child0.getLayoutX(), 0.0f);
		assertEquals(5f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(55f, root_child1.getLayoutX(), 0.0f);
		assertEquals(40f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(5f, root_child1_child0.getLayoutX(), 0.0f);
		assertEquals(5f, root_child1_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1_child0.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child1_child0.getLayoutHeight(), 0.0f);

		root.setDirection(YogaDirection.RTL);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(45f, root_child0.getLayoutX(), 0.0f);
		assertEquals(5f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(-5f, root_child1.getLayoutX(), 0.0f);
		assertEquals(40f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(-5f, root_child1_child0.getLayoutX(), 0.0f);
		assertEquals(5f, root_child1_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1_child0.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child1_child0.getLayoutHeight(), 0.0f);
	}

	@Test
	public void test_align_baseline_multiline() {
		YogaNode root = new YogaNode();
		root.setFlexDirection(YogaFlexDirection.ROW);
		root.setAlignItems(YogaAlign.BASELINE);
		root.setWrap(YogaWrap.WRAP);
		root.setWidth(100f);
		root.setHeight(100f);

		YogaNode root_child0 = new YogaNode();
		root_child0.setWidth(50f);
		root_child0.setHeight(50f);
		root.addChildAt(root_child0, 0);

		YogaNode root_child1 = new YogaNode();
		root_child1.setWidth(50f);
		root_child1.setHeight(20f);
		root.addChildAt(root_child1, 1);

		YogaNode root_child1_child0 = new YogaNode();
		root_child1_child0.setWidth(50f);
		root_child1_child0.setHeight(10f);
		root_child1.addChildAt(root_child1_child0, 0);

		YogaNode root_child2 = new YogaNode();
		root_child2.setWidth(50f);
		root_child2.setHeight(20f);
		root.addChildAt(root_child2, 2);

		YogaNode root_child2_child0 = new YogaNode();
		root_child2_child0.setWidth(50f);
		root_child2_child0.setHeight(10f);
		root_child2.addChildAt(root_child2_child0, 0);

		YogaNode root_child3 = new YogaNode();
		root_child3.setWidth(50f);
		root_child3.setHeight(50f);
		root.addChildAt(root_child3, 3);
		root.setDirection(YogaDirection.LTR);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child1.getLayoutX(), 0.0f);
		assertEquals(40f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1_child0.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child1_child0.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child2.getLayoutX(), 0.0f);
		assertEquals(100f, root_child2.getLayoutY(), 0.0f);
		assertEquals(50f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child2.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child2_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child2_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child2_child0.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child2_child0.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child3.getLayoutX(), 0.0f);
		assertEquals(60f, root_child3.getLayoutY(), 0.0f);
		assertEquals(50f, root_child3.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child3.getLayoutHeight(), 0.0f);

		root.setDirection(YogaDirection.RTL);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1.getLayoutX(), 0.0f);
		assertEquals(40f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1_child0.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child1_child0.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child2.getLayoutX(), 0.0f);
		assertEquals(100f, root_child2.getLayoutY(), 0.0f);
		assertEquals(50f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child2.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child2_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child2_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child2_child0.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child2_child0.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child3.getLayoutX(), 0.0f);
		assertEquals(60f, root_child3.getLayoutY(), 0.0f);
		assertEquals(50f, root_child3.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child3.getLayoutHeight(), 0.0f);
	}

	@Test
	public void test_align_baseline_multiline_column() {
		YogaNode root = new YogaNode();
		root.setAlignItems(YogaAlign.BASELINE);
		root.setWrap(YogaWrap.WRAP);
		root.setWidth(100f);
		root.setHeight(100f);

		YogaNode root_child0 = new YogaNode();
		root_child0.setWidth(50f);
		root_child0.setHeight(50f);
		root.addChildAt(root_child0, 0);

		YogaNode root_child1 = new YogaNode();
		root_child1.setWidth(30f);
		root_child1.setHeight(50f);
		root.addChildAt(root_child1, 1);

		YogaNode root_child1_child0 = new YogaNode();
		root_child1_child0.setWidth(20f);
		root_child1_child0.setHeight(20f);
		root_child1.addChildAt(root_child1_child0, 0);

		YogaNode root_child2 = new YogaNode();
		root_child2.setWidth(40f);
		root_child2.setHeight(70f);
		root.addChildAt(root_child2, 2);

		YogaNode root_child2_child0 = new YogaNode();
		root_child2_child0.setWidth(10f);
		root_child2_child0.setHeight(10f);
		root_child2.addChildAt(root_child2_child0, 0);

		YogaNode root_child3 = new YogaNode();
		root_child3.setWidth(50f);
		root_child3.setHeight(20f);
		root.addChildAt(root_child3, 3);
		root.setDirection(YogaDirection.LTR);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1.getLayoutX(), 0.0f);
		assertEquals(50f, root_child1.getLayoutY(), 0.0f);
		assertEquals(30f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1_child0.getLayoutY(), 0.0f);
		assertEquals(20f, root_child1_child0.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child1_child0.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child2.getLayoutX(), 0.0f);
		assertEquals(0f, root_child2.getLayoutY(), 0.0f);
		assertEquals(40f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(70f, root_child2.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child2_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child2_child0.getLayoutY(), 0.0f);
		assertEquals(10f, root_child2_child0.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child2_child0.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child3.getLayoutX(), 0.0f);
		assertEquals(70f, root_child3.getLayoutY(), 0.0f);
		assertEquals(50f, root_child3.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child3.getLayoutHeight(), 0.0f);

		root.setDirection(YogaDirection.RTL);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(70f, root_child1.getLayoutX(), 0.0f);
		assertEquals(50f, root_child1.getLayoutY(), 0.0f);
		assertEquals(30f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(10f, root_child1_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1_child0.getLayoutY(), 0.0f);
		assertEquals(20f, root_child1_child0.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child1_child0.getLayoutHeight(), 0.0f);

		assertEquals(10f, root_child2.getLayoutX(), 0.0f);
		assertEquals(0f, root_child2.getLayoutY(), 0.0f);
		assertEquals(40f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(70f, root_child2.getLayoutHeight(), 0.0f);

		assertEquals(30f, root_child2_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child2_child0.getLayoutY(), 0.0f);
		assertEquals(10f, root_child2_child0.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child2_child0.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child3.getLayoutX(), 0.0f);
		assertEquals(70f, root_child3.getLayoutY(), 0.0f);
		assertEquals(50f, root_child3.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child3.getLayoutHeight(), 0.0f);
	}

	@Test
	public void test_align_baseline_multiline_column2() {
		YogaNode root = new YogaNode();
		root.setAlignItems(YogaAlign.BASELINE);
		root.setWrap(YogaWrap.WRAP);
		root.setWidth(100f);
		root.setHeight(100f);

		YogaNode root_child0 = new YogaNode();
		root_child0.setWidth(50f);
		root_child0.setHeight(50f);
		root.addChildAt(root_child0, 0);

		YogaNode root_child1 = new YogaNode();
		root_child1.setWidth(30f);
		root_child1.setHeight(50f);
		root.addChildAt(root_child1, 1);

		YogaNode root_child1_child0 = new YogaNode();
		root_child1_child0.setWidth(20f);
		root_child1_child0.setHeight(20f);
		root_child1.addChildAt(root_child1_child0, 0);

		YogaNode root_child2 = new YogaNode();
		root_child2.setWidth(40f);
		root_child2.setHeight(70f);
		root.addChildAt(root_child2, 2);

		YogaNode root_child2_child0 = new YogaNode();
		root_child2_child0.setWidth(10f);
		root_child2_child0.setHeight(10f);
		root_child2.addChildAt(root_child2_child0, 0);

		YogaNode root_child3 = new YogaNode();
		root_child3.setWidth(50f);
		root_child3.setHeight(20f);
		root.addChildAt(root_child3, 3);
		root.setDirection(YogaDirection.LTR);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1.getLayoutX(), 0.0f);
		assertEquals(50f, root_child1.getLayoutY(), 0.0f);
		assertEquals(30f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1_child0.getLayoutY(), 0.0f);
		assertEquals(20f, root_child1_child0.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child1_child0.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child2.getLayoutX(), 0.0f);
		assertEquals(0f, root_child2.getLayoutY(), 0.0f);
		assertEquals(40f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(70f, root_child2.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child2_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child2_child0.getLayoutY(), 0.0f);
		assertEquals(10f, root_child2_child0.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child2_child0.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child3.getLayoutX(), 0.0f);
		assertEquals(70f, root_child3.getLayoutY(), 0.0f);
		assertEquals(50f, root_child3.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child3.getLayoutHeight(), 0.0f);

		root.setDirection(YogaDirection.RTL);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(70f, root_child1.getLayoutX(), 0.0f);
		assertEquals(50f, root_child1.getLayoutY(), 0.0f);
		assertEquals(30f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(10f, root_child1_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1_child0.getLayoutY(), 0.0f);
		assertEquals(20f, root_child1_child0.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child1_child0.getLayoutHeight(), 0.0f);

		assertEquals(10f, root_child2.getLayoutX(), 0.0f);
		assertEquals(0f, root_child2.getLayoutY(), 0.0f);
		assertEquals(40f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(70f, root_child2.getLayoutHeight(), 0.0f);

		assertEquals(30f, root_child2_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child2_child0.getLayoutY(), 0.0f);
		assertEquals(10f, root_child2_child0.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child2_child0.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child3.getLayoutX(), 0.0f);
		assertEquals(70f, root_child3.getLayoutY(), 0.0f);
		assertEquals(50f, root_child3.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child3.getLayoutHeight(), 0.0f);
	}

	@Test
	public void test_align_baseline_multiline_row_and_column() {
		YogaNode root = new YogaNode();
		root.setFlexDirection(YogaFlexDirection.ROW);
		root.setAlignItems(YogaAlign.BASELINE);
		root.setWrap(YogaWrap.WRAP);
		root.setWidth(100f);
		root.setHeight(100f);

		YogaNode root_child0 = new YogaNode();
		root_child0.setWidth(50f);
		root_child0.setHeight(50f);
		root.addChildAt(root_child0, 0);

		YogaNode root_child1 = new YogaNode();
		root_child1.setWidth(50f);
		root_child1.setHeight(50f);
		root.addChildAt(root_child1, 1);

		YogaNode root_child1_child0 = new YogaNode();
		root_child1_child0.setWidth(50f);
		root_child1_child0.setHeight(10f);
		root_child1.addChildAt(root_child1_child0, 0);

		YogaNode root_child2 = new YogaNode();
		root_child2.setWidth(50f);
		root_child2.setHeight(20f);
		root.addChildAt(root_child2, 2);

		YogaNode root_child2_child0 = new YogaNode();
		root_child2_child0.setWidth(50f);
		root_child2_child0.setHeight(10f);
		root_child2.addChildAt(root_child2_child0, 0);

		YogaNode root_child3 = new YogaNode();
		root_child3.setWidth(50f);
		root_child3.setHeight(20f);
		root.addChildAt(root_child3, 3);
		root.setDirection(YogaDirection.LTR);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child1.getLayoutX(), 0.0f);
		assertEquals(40f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1_child0.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child1_child0.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child2.getLayoutX(), 0.0f);
		assertEquals(100f, root_child2.getLayoutY(), 0.0f);
		assertEquals(50f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child2.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child2_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child2_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child2_child0.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child2_child0.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child3.getLayoutX(), 0.0f);
		assertEquals(90f, root_child3.getLayoutY(), 0.0f);
		assertEquals(50f, root_child3.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child3.getLayoutHeight(), 0.0f);

		root.setDirection(YogaDirection.RTL);
		root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

		assertEquals(0f, root.getLayoutX(), 0.0f);
		assertEquals(0f, root.getLayoutY(), 0.0f);
		assertEquals(100f, root.getLayoutWidth(), 0.0f);
		assertEquals(100f, root.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child0.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1.getLayoutX(), 0.0f);
		assertEquals(40f, root_child1.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1.getLayoutWidth(), 0.0f);
		assertEquals(50f, root_child1.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child1_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child1_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child1_child0.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child1_child0.getLayoutHeight(), 0.0f);

		assertEquals(50f, root_child2.getLayoutX(), 0.0f);
		assertEquals(100f, root_child2.getLayoutY(), 0.0f);
		assertEquals(50f, root_child2.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child2.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child2_child0.getLayoutX(), 0.0f);
		assertEquals(0f, root_child2_child0.getLayoutY(), 0.0f);
		assertEquals(50f, root_child2_child0.getLayoutWidth(), 0.0f);
		assertEquals(10f, root_child2_child0.getLayoutHeight(), 0.0f);

		assertEquals(0f, root_child3.getLayoutX(), 0.0f);
		assertEquals(90f, root_child3.getLayoutY(), 0.0f);
		assertEquals(50f, root_child3.getLayoutWidth(), 0.0f);
		assertEquals(20f, root_child3.getLayoutHeight(), 0.0f);
	}

}