package dev.andreijiroh.studentops.projects.dsaLabs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @author Andrei Jiroh Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 * @see @see https://gitlab.com/andreijiroh-dev/labs/studentops-codelab/-/blob/main/java/src/dev/andreijiroh/studentops/projects/dsaLabs/BinaryTree.java
 */
class BinaryTree {
  Node root;

  public void inorder(Node n, List<Integer> out) {
    if (n == null) {
      return;
    }
    inorder(n.left, out);
    out.add(n.data);
    inorder(n.right, out);
  }

  public void preorder(Node n, List<Integer> out) {
    if (n == null) {
      return;
    }
    out.add(n.data);
    preorder(n.left, out);
    preorder(n.right, out);
  }

  public void postorder(Node n, List<Integer> out) {
    if (n == null) {
      return;
    }
    postorder(n.left, out);
    postorder(n.right, out);
    out.add(n.data);
  }

  public List<Integer> levelOrder (Node n) {
    List<Integer> out = new ArrayList<>();
    if (n == null) {
      return out;
    };
    
    Queue<Node> q = new ArrayDeque<>();
    q.add(n);

    while (!q.isEmpty()) {
      Node cur = q.remove();
      out.add(cur.data);
      if (cur.left != null) {
        q.add(cur.left);
      }
      if (cur.right != null) {
        q.add(cur.right);
      }
    }
    return out;
  }
}