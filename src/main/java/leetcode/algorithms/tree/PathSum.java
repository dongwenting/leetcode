package leetcode.algorithms.tree;

public class PathSum {
	boolean flag = false;
	
	public boolean hasPathSum(TreeNode root, int sum) {
		if(root == null){
			return false;
		}
		return pathSum(root, sum);
	}
	
	public boolean pathSum(TreeNode root, int sum){
		if (root == null && sum == 0) {
			return true;
		} else if (root == null && sum != 0) {
			return false;
		} else if (root.left == null && root.right == null && root.val == sum) {
			flag = true;
			return true;
		}
		
		if (!pathSum(root.left, sum - root.val)) {

			if (!pathSum(root.right, sum - root.val)) {
				return false;
			}else{
				if(flag || root.left == null){
					flag = true;
				}
			}

		}else {
			if(flag || root.right == null){
				flag = true;
			}
		}
		return flag;	
	}
}
