package com.study;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LoopBuildTree {

	public static void main(String[] args) {
		TreeNode treeNode1 = new TreeNode("1", "广州", "0");
		TreeNode treeNode2 = new TreeNode("2", "深圳", "0");

		TreeNode treeNode3 = new TreeNode("3", "天河区", "1");
		TreeNode treeNode4 = new TreeNode("4", "越秀区", "1");
		TreeNode treeNode5 = new TreeNode("5", "黄埔区", "1");
		TreeNode treeNode6 = new TreeNode("6", "石牌", "3");
		TreeNode treeNode7 = new TreeNode("7", "百脑汇", "6");

		TreeNode treeNode8 = new TreeNode("8", "南山区", "2");
		TreeNode treeNode9 = new TreeNode("9", "宝安区", "2");
		TreeNode treeNode10 = new TreeNode("10", "科技园", "8");

		List<TreeNode> list = new ArrayList<TreeNode>();

		list.add(treeNode1);
		list.add(treeNode2);
		list.add(treeNode3);
		list.add(treeNode4);
		list.add(treeNode5);
		list.add(treeNode6);
		list.add(treeNode7);
		list.add(treeNode8);
		list.add(treeNode9);
		list.add(treeNode10);

		TreeNode treeNodeA = new TreeNode("111", "AA区", "1");
		TreeNode treeNodeB = new TreeNode("222", "BB区", "2");
		TreeNode treeNodeC = new TreeNode("333", "CC区", "9");
		TreeNode treeNodeD = new TreeNode("444", "DD区", "333");
		List<TreeNode> list2 = new ArrayList<TreeNode>();
		list2.add(treeNodeA);
		list2.add(treeNodeB);
		list2.add(treeNodeC);
		list2.add(treeNodeD);
		// Date begin = new Date();
		// List<TreeNode> trees = LoopBuildTree.buildByRecursive(list);

		// System.out.println(findList(trees, list2));
		listChangeTest(list);
		System.out.println(list);
		changeEntity(treeNodeD);
		System.out.println(treeNodeD);

		/*
		 * Date end = new Date(); System.out.println(begin.getTime() - end.getTime());
		 * 
		 * LocalDateTime localBegin2 = LocalDateTime.now(); List<TreeNode> trees2 =
		 * LoopBuildTree.build(list); LocalDateTime localEnd2 = LocalDateTime.now();
		 * System.out.println(localEnd2 + " : " + localBegin2);
		 */

		int arr[] = { 1, 2 };
		int c[] = arr;
		c[1] = 10;
		int b = 0;
		arr[0] = b;
		b = 6;
		System.out.println(arr[1]);
	}

	// 使用双重循环生成树
	public static List<TreeNode> build(List<TreeNode> list) {
		List<TreeNode> trees = new ArrayList<TreeNode>();
		for (TreeNode treeNode : list) {
			if ("0".equals(treeNode.getParentId())) {
				trees.add(treeNode);
			}

			for (TreeNode temp : list) {
				if (treeNode.getId().equals(temp.getParentId())) {
					if (treeNode.getChildren() == null) {
						treeNode.setChildren(new ArrayList<TreeNode>());
					}
					treeNode.getChildren().add(temp);
				}
			}
		}
		return trees;
	}

	public static List<TreeNode> buildByRecursive(List<TreeNode> list) {
		List<TreeNode> trees = new ArrayList<TreeNode>();
		for (TreeNode treeNode : list) {
			if ("0".equals(treeNode.getParentId())) {
				trees.add(findChildren(treeNode, list));
			}
		}
		return trees;
	}

	private static TreeNode findChildren(TreeNode treeNode, List<TreeNode> list) {
		for (TreeNode temp : list) {
			if (treeNode.getId().equals(temp.getParentId())) {
				if (treeNode.getChildren() == null) {
					treeNode.setChildren(new ArrayList<TreeNode>());
				}
				treeNode.getChildren().add(temp);
			}
		}
		return treeNode;
	}

	private static List<TreeNode> findList(List<TreeNode> treeNode, List<TreeNode> treeNodeList2) {
		Stack<List<TreeNode>> stack = new Stack<>();
		stack.push(treeNode);
		while (!stack.isEmpty()) {
			List<TreeNode> stackTreeNodeList = stack.pop();
			System.out.println("弹");
			stackTreeNodeList.forEach(stackTreeNode -> {
				if (stackTreeNode.getChildren() != null && !stackTreeNode.getChildren().isEmpty()) {
					treeNodeList2.forEach(treeNode2 -> {
						if (stackTreeNode.getId().equals(treeNode2.getParentId())) {
							// 修改子集的parentId
							List<TreeNode> children = stackTreeNode.getChildren();
							children.forEach(ac -> {
								ac.setParentId(treeNode2.getId());
							});
							stackTreeNode.setChildren(new ArrayList<>());
							stackTreeNode.getChildren().add(treeNode2);
							treeNode2.setChildren(children);
						}
					});
					stack.push(stackTreeNode.getChildren());
					System.out.println("入");
				} else {
					treeNodeList2.forEach(treeNode2 -> {
						if (stackTreeNode.getId().equals(treeNode2.getParentId())) {
							stackTreeNode.setChildren(new ArrayList<>());
							stackTreeNode.getChildren().add(treeNode2);
						}
					});
				}
			});
		}
		return treeNode;
	}

	private static void listChangeTest(List<TreeNode> treeNode) {
		treeNode.forEach(tree -> {
			if (tree.getId().equals("1")) {
				tree.setName("改变++++++");
			}
		});
	}

	private static void changeEntity(TreeNode treeNode) {
		treeNode.setName("..........");
	}
}
