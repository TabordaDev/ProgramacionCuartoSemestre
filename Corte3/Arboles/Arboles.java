import java.util.ArrayList;
import java.util.List;

public class Arboles {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Recorridos que devuelven una nueva lista por llamada (sin compartir estado)
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorder(root, result);
        return result;
    }

    private static void preorder(TreeNode node, List<Integer> out) {
        if (node == null) return;
        out.add(node.val);
        preorder(node.left, out);
        preorder(node.right, out);
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    private static void inorder(TreeNode node, List<Integer> out) {
        if (node == null) return;
        inorder(node.left, out);
        out.add(node.val);
        inorder(node.right, out);
    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorder(root, result);
        return result;
    }

    private static void postorder(TreeNode node, List<Integer> out) {
        if (node == null) return;
        postorder(node.left, out);
        postorder(node.right, out);
        out.add(node.val);
    }

    // Verifica si el árbol está balanceado: altura de subárboles difiere como máximo en 1.
    // Implementación O(n): devuelve -1 si el subárbol no está balanceado, o su altura si sí lo está.
    private static int alturaOInvalida(TreeNode node) {
        if (node == null) return 0;
        int izq = alturaOInvalida(node.left);
        if (izq == -1) return -1; // ya desbalanceado en la izquierda
        int der = alturaOInvalida(node.right);
        if (der == -1) return -1; // ya desbalanceado en la derecha
        if (Math.abs(izq - der) > 1) return -1; // desbalance encontrado
        return Math.max(izq, der) + 1;
    }

    public static boolean isBalanced(TreeNode root) {
        return alturaOInvalida(root) != -1;
    }

    public static void main(String[] args) {
        // Árbol de ejemplo balanceado:
        //       1
        //      / \
        //     2   3
        //    / \
        //   4   5
        TreeNode balanced = new TreeNode(1);
        balanced.left = new TreeNode(2);
        balanced.right = new TreeNode(3);
        balanced.left.left = new TreeNode(4);
        balanced.left.right = new TreeNode(5);

        System.out.println("Árbol balanceado - preorder: " + preorderTraversal(balanced));
        System.out.println("Árbol balanceado - inorder:  " + inorderTraversal(balanced));
        System.out.println("Árbol balanceado - postorder:" + postorderTraversal(balanced));
        System.out.println("isBalanced(balanced) = " + isBalanced(balanced));

        // Árbol de ejemplo no balanceado (cadena larga a la izquierda):
        //     1
        //    /
        //   2
        //  /
        // 3
        // ...
        TreeNode unbalanced = new TreeNode(1);
        unbalanced.left = new TreeNode(2);
        unbalanced.left.left = new TreeNode(3);
        unbalanced.left.left.left = new TreeNode(4);

        System.out.println("\nÁrbol no balanceado - preorder: " + preorderTraversal(unbalanced));
        System.out.println("Árbol no balanceado - inorder:  " + inorderTraversal(unbalanced));
        System.out.println("Árbol no balanceado - postorder:" + postorderTraversal(unbalanced));
        System.out.println("isBalanced(unbalanced) = " + isBalanced(unbalanced));
    }
}