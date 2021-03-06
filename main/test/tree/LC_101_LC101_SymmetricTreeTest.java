package tree;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * @author liangqian@vvic.com
 * @version 1.0
 * @since 2020/5/31
 */
public class LC_101_LC101_SymmetricTreeTest {

    @Test
    public void should_is_symmetric_tree() {
        LC_101_SymmetricTree st = new LC_101_SymmetricTree();
        TreeNode treeRoot = new TreeNode(1);
        TreeNode left2 = new TreeNode(2);
        TreeNode right2 = new TreeNode(2);
        treeRoot.left = left2;
        treeRoot.right = right2;
        left2.left = new TreeNode(3);
        left2.right = new TreeNode(4);
        right2.left = new TreeNode(4);
        right2.right = new TreeNode(3);
        assertThat(st.isSymmetric(treeRoot), is(true));
    }

    @Test
    public void should_is_symmetric_tree_loop() {
        LC_101_SymmetricTree st = new LC_101_SymmetricTree();
        TreeNode treeRoot = new TreeNode(1);
        TreeNode left2 = new TreeNode(2);
        TreeNode right2 = new TreeNode(2);
        treeRoot.left = left2;
        treeRoot.right = right2;
        left2.left = new TreeNode(3);
        left2.right = new TreeNode(4);
        right2.left = new TreeNode(4);
        right2.right = new TreeNode(3);
        assertThat(st.isSymmetric_loop(treeRoot), is(true));
    }

    @Test
    public void should_is_symmetric_tree_case_2() {
        LC_101_SymmetricTree st = new LC_101_SymmetricTree();
        TreeNode treeRoot = new TreeNode(2);
        TreeNode left2 = new TreeNode(3);
        TreeNode right2 = new TreeNode(3);
        treeRoot.left = left2;
        treeRoot.right = right2;
        left2.left = new TreeNode(4);
        left2.right = new TreeNode(5);
        right2.right = new TreeNode(4);
        assertThat(st.isSymmetric(treeRoot), is(false));
    }

    @Test
    public void should_is_symmetric_tree_case_2_loop_queue() {
        LC_101_SymmetricTree st = new LC_101_SymmetricTree();
        TreeNode treeRoot = new TreeNode(2);
        TreeNode left2 = new TreeNode(3);
        TreeNode right2 = new TreeNode(3);
        treeRoot.left = left2;
        treeRoot.right = right2;
        left2.left = new TreeNode(4);
        left2.right = new TreeNode(5);
        right2.right = new TreeNode(4);
        assertThat(st.isSymmetric_loop(treeRoot), is(false));
    }


}
